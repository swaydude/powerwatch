package okhttp3.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
public final class Http2Connection implements java.io.Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    private static final java.util.concurrent.ExecutorService listenerExecutor = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), okhttp3.internal.Util.threadFactory("OkHttp Http2Connection", true));
    private boolean awaitingPong;
    long bytesLeftInWriteWindow;
    final boolean client;
    final java.util.Set<java.lang.Integer> currentPushRequests;
    final java.lang.String hostname;
    int lastGoodStreamId;
    final okhttp3.internal.http2.Http2Connection.Listener listener;
    int nextStreamId;
    final okhttp3.internal.http2.Settings peerSettings;
    private final java.util.concurrent.ExecutorService pushExecutor;
    final okhttp3.internal.http2.PushObserver pushObserver;
    final okhttp3.internal.http2.Http2Connection.ReaderRunnable readerRunnable;
    boolean receivedInitialPeerSettings;
    boolean shutdown;
    final java.net.Socket socket;
    final okhttp3.internal.http2.Http2Writer writer;
    private final java.util.concurrent.ScheduledExecutorService writerExecutor;
    final java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> streams = new java.util.LinkedHashMap();
    long unacknowledgedBytesRead = 0;
    okhttp3.internal.http2.Settings okHttpSettings = new okhttp3.internal.http2.Settings();

    public static abstract class Listener {
        public static final okhttp3.internal.http2.Http2Connection.Listener REFUSE_INCOMING_STREAMS = new okhttp3.internal.http2.Http2Connection.Listener() { // from class: okhttp3.internal.http2.Http2Connection.Listener.1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(okhttp3.internal.http2.Http2Stream http2Stream) throws java.io.IOException {
                http2Stream.close(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(okhttp3.internal.http2.Http2Connection http2Connection) {
        }

        public abstract void onStream(okhttp3.internal.http2.Http2Stream http2Stream) throws java.io.IOException;
    }

    boolean pushedStream(int i) {
        return i != 0 && (i & 1) == 0;
    }

    Http2Connection(okhttp3.internal.http2.Http2Connection.Builder builder) {
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        this.peerSettings = settings;
        this.receivedInitialPeerSettings = false;
        this.currentPushRequests = new java.util.LinkedHashSet();
        this.pushObserver = builder.pushObserver;
        boolean z = builder.client;
        this.client = z;
        this.listener = builder.listener;
        this.nextStreamId = builder.client ? 1 : 2;
        if (builder.client) {
            this.nextStreamId += 2;
        }
        if (builder.client) {
            this.okHttpSettings.set(7, 16777216);
        }
        java.lang.String str = builder.hostname;
        this.hostname = str;
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, okhttp3.internal.Util.threadFactory(okhttp3.internal.Util.format("OkHttp %s Writer", str), false));
        this.writerExecutor = scheduledThreadPoolExecutor;
        if (builder.pingIntervalMillis != 0) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new okhttp3.internal.http2.Http2Connection.PingRunnable(false, 0, 0), builder.pingIntervalMillis, builder.pingIntervalMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        this.pushExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), okhttp3.internal.Util.threadFactory(okhttp3.internal.Util.format("OkHttp %s Push Observer", str), true));
        settings.set(7, androidx.core.internal.view.SupportMenu.USER_MASK);
        settings.set(5, 16384);
        this.bytesLeftInWriteWindow = settings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new okhttp3.internal.http2.Http2Writer(builder.sink, z);
        this.readerRunnable = new okhttp3.internal.http2.Http2Connection.ReaderRunnable(new okhttp3.internal.http2.Http2Reader(builder.source, z));
    }

    public okhttp3.Protocol getProtocol() {
        return okhttp3.Protocol.HTTP_2;
    }

    public synchronized int openStreamCount() {
        return this.streams.size();
    }

    synchronized okhttp3.internal.http2.Http2Stream getStream(int i) {
        return this.streams.get(java.lang.Integer.valueOf(i));
    }

    synchronized okhttp3.internal.http2.Http2Stream removeStream(int i) {
        okhttp3.internal.http2.Http2Stream http2StreamRemove;
        http2StreamRemove = this.streams.remove(java.lang.Integer.valueOf(i));
        notifyAll();
        return http2StreamRemove;
    }

    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    synchronized void updateConnectionFlowControl(long j) {
        long j2 = this.unacknowledgedBytesRead + j;
        this.unacknowledgedBytesRead = j2;
        if (j2 >= this.okHttpSettings.getInitialWindowSize() / 2) {
            writeWindowUpdateLater(0, this.unacknowledgedBytesRead);
            this.unacknowledgedBytesRead = 0L;
        }
    }

    public okhttp3.internal.http2.Http2Stream pushStream(int i, java.util.List<okhttp3.internal.http2.Header> list, boolean z) throws java.io.IOException {
        if (this.client) {
            throw new java.lang.IllegalStateException("Client cannot push requests.");
        }
        return newStream(i, list, z);
    }

    public okhttp3.internal.http2.Http2Stream newStream(java.util.List<okhttp3.internal.http2.Header> list, boolean z) throws java.io.IOException {
        return newStream(0, list, z);
    }

    private okhttp3.internal.http2.Http2Stream newStream(int i, java.util.List<okhttp3.internal.http2.Header> list, boolean z) throws java.io.IOException {
        int i2;
        okhttp3.internal.http2.Http2Stream http2Stream;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.writer) {
            synchronized (this) {
                if (this.nextStreamId > 1073741823) {
                    shutdown(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
                }
                if (this.shutdown) {
                    throw new okhttp3.internal.http2.ConnectionShutdownException();
                }
                i2 = this.nextStreamId;
                this.nextStreamId = i2 + 2;
                http2Stream = new okhttp3.internal.http2.Http2Stream(i2, this, z3, false, null);
                z2 = !z || this.bytesLeftInWriteWindow == 0 || http2Stream.bytesLeftInWriteWindow == 0;
                if (http2Stream.isOpen()) {
                    this.streams.put(java.lang.Integer.valueOf(i2), http2Stream);
                }
            }
            if (i == 0) {
                this.writer.synStream(z3, i2, i, list);
            } else {
                if (this.client) {
                    throw new java.lang.IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.writer.pushPromise(i, i2, list);
            }
        }
        if (z2) {
            this.writer.flush();
        }
        return http2Stream;
    }

    void writeSynReply(int i, boolean z, java.util.List<okhttp3.internal.http2.Header> list) throws java.io.IOException {
        this.writer.synReply(z, i, list);
    }

    public void writeData(int i, boolean z, okio.Buffer buffer, long j) throws java.io.IOException {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.writer.data(z, i, buffer, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.bytesLeftInWriteWindow;
                        if (j2 <= 0) {
                            if (!this.streams.containsKey(java.lang.Integer.valueOf(i))) {
                                throw new java.io.IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        throw new java.io.InterruptedIOException();
                    }
                }
                iMin = java.lang.Math.min((int) java.lang.Math.min(j, j2), this.writer.maxDataLength());
                j3 = iMin;
                this.bytesLeftInWriteWindow -= j3;
            }
            j -= j3;
            this.writer.data(z && j == 0, i, buffer, iMin);
        }
    }

    void writeSynResetLater(final int i, final okhttp3.internal.http2.ErrorCode errorCode) {
        try {
            this.writerExecutor.execute(new okhttp3.internal.NamedRunnable("OkHttp %s stream %d", new java.lang.Object[]{this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.1
                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        okhttp3.internal.http2.Http2Connection.this.writeSynReset(i, errorCode);
                    } catch (java.io.IOException unused) {
                        okhttp3.internal.http2.Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }

    void writeSynReset(int i, okhttp3.internal.http2.ErrorCode errorCode) throws java.io.IOException {
        this.writer.rstStream(i, errorCode);
    }

    void writeWindowUpdateLater(final int i, final long j) {
        try {
            this.writerExecutor.execute(new okhttp3.internal.NamedRunnable("OkHttp Window Update %s stream %d", new java.lang.Object[]{this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.2
                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        okhttp3.internal.http2.Http2Connection.this.writer.windowUpdate(i, j);
                    } catch (java.io.IOException unused) {
                        okhttp3.internal.http2.Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }

    final class PingRunnable extends okhttp3.internal.NamedRunnable {
        final int payload1;
        final int payload2;
        final boolean reply;

        PingRunnable(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", okhttp3.internal.http2.Http2Connection.this.hostname, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            this.reply = z;
            this.payload1 = i;
            this.payload2 = i2;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            okhttp3.internal.http2.Http2Connection.this.writePing(this.reply, this.payload1, this.payload2);
        }
    }

    void writePing(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.awaitingPong;
                this.awaitingPong = true;
            }
            if (z2) {
                failConnection();
                return;
            }
        }
        try {
            this.writer.ping(z, i, i2);
        } catch (java.io.IOException unused) {
            failConnection();
        }
    }

    void writePingAndAwaitPong() throws java.lang.InterruptedException {
        writePing(false, 1330343787, -257978967);
        awaitPong();
    }

    synchronized void awaitPong() throws java.lang.InterruptedException {
        while (this.awaitingPong) {
            wait();
        }
    }

    public void flush() throws java.io.IOException {
        this.writer.flush();
    }

    public void shutdown(okhttp3.internal.http2.ErrorCode errorCode) throws java.io.IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    return;
                }
                this.shutdown = true;
                this.writer.goAway(this.lastGoodStreamId, errorCode, okhttp3.internal.Util.EMPTY_BYTE_ARRAY);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        close(okhttp3.internal.http2.ErrorCode.NO_ERROR, okhttp3.internal.http2.ErrorCode.CANCEL);
    }

    void close(okhttp3.internal.http2.ErrorCode errorCode, okhttp3.internal.http2.ErrorCode errorCode2) throws java.io.IOException {
        okhttp3.internal.http2.Http2Stream[] http2StreamArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (java.io.IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                http2StreamArr = (okhttp3.internal.http2.Http2Stream[]) this.streams.values().toArray(new okhttp3.internal.http2.Http2Stream[this.streams.size()]);
                this.streams.clear();
            }
        }
        if (http2StreamArr != null) {
            for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (java.io.IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.writer.close();
        } catch (java.io.IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.socket.close();
        } catch (java.io.IOException e4) {
            e = e4;
        }
        this.writerExecutor.shutdown();
        this.pushExecutor.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failConnection() {
        try {
            close(okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
        } catch (java.io.IOException unused) {
        }
    }

    public void start() throws java.io.IOException {
        start(true);
    }

    void start(boolean z) throws java.io.IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, initialWindowSize - androidx.core.internal.view.SupportMenu.USER_MASK);
            }
        }
        new java.lang.Thread(this.readerRunnable).start();
    }

    public void setSettings(okhttp3.internal.http2.Settings settings) throws java.io.IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (this.shutdown) {
                    throw new okhttp3.internal.http2.ConnectionShutdownException();
                }
                this.okHttpSettings.merge(settings);
            }
            this.writer.settings(settings);
        }
    }

    public synchronized boolean isShutdown() {
        return this.shutdown;
    }

    public static class Builder {
        boolean client;
        java.lang.String hostname;
        int pingIntervalMillis;
        okio.BufferedSink sink;
        java.net.Socket socket;
        okio.BufferedSource source;
        okhttp3.internal.http2.Http2Connection.Listener listener = okhttp3.internal.http2.Http2Connection.Listener.REFUSE_INCOMING_STREAMS;
        okhttp3.internal.http2.PushObserver pushObserver = okhttp3.internal.http2.PushObserver.CANCEL;

        public Builder(boolean z) {
            this.client = z;
        }

        public okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket socket) throws java.io.IOException {
            return socket(socket, ((java.net.InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), okio.Okio.buffer(okio.Okio.source(socket)), okio.Okio.buffer(okio.Okio.sink(socket)));
        }

        public okhttp3.internal.http2.Http2Connection.Builder socket(java.net.Socket socket, java.lang.String str, okio.BufferedSource bufferedSource, okio.BufferedSink bufferedSink) {
            this.socket = socket;
            this.hostname = str;
            this.source = bufferedSource;
            this.sink = bufferedSink;
            return this;
        }

        public okhttp3.internal.http2.Http2Connection.Builder listener(okhttp3.internal.http2.Http2Connection.Listener listener) {
            this.listener = listener;
            return this;
        }

        public okhttp3.internal.http2.Http2Connection.Builder pushObserver(okhttp3.internal.http2.PushObserver pushObserver) {
            this.pushObserver = pushObserver;
            return this;
        }

        public okhttp3.internal.http2.Http2Connection.Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public okhttp3.internal.http2.Http2Connection build() {
            return new okhttp3.internal.http2.Http2Connection(this);
        }
    }

    class ReaderRunnable extends okhttp3.internal.NamedRunnable implements okhttp3.internal.http2.Http2Reader.Handler {
        final okhttp3.internal.http2.Http2Reader reader;

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, java.lang.String str, okio.ByteString byteString, java.lang.String str2, int i2, long j) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        ReaderRunnable(okhttp3.internal.http2.Http2Reader http2Reader) {
            super("OkHttp %s", okhttp3.internal.http2.Http2Connection.this.hostname);
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.NamedRunnable
        protected void execute() {
            okhttp3.internal.http2.Http2Connection http2Connection;
            okhttp3.internal.http2.ErrorCode errorCode = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            okhttp3.internal.http2.ErrorCode errorCode2 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    try {
                        this.reader.readConnectionPreface(this);
                        while (this.reader.nextFrame(false, this)) {
                        }
                        errorCode = okhttp3.internal.http2.ErrorCode.NO_ERROR;
                        errorCode2 = okhttp3.internal.http2.ErrorCode.CANCEL;
                        http2Connection = okhttp3.internal.http2.Http2Connection.this;
                    } catch (java.io.IOException unused) {
                    }
                } catch (java.io.IOException unused2) {
                    errorCode = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                    errorCode2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                    http2Connection = okhttp3.internal.http2.Http2Connection.this;
                }
                http2Connection.close(errorCode, errorCode2);
            } finally {
                try {
                    okhttp3.internal.http2.Http2Connection.this.close(errorCode, errorCode2);
                } catch (java.io.IOException unused3) {
                }
                okhttp3.internal.Util.closeQuietly(this.reader);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, okio.BufferedSource bufferedSource, int i2) throws java.io.IOException {
            if (okhttp3.internal.http2.Http2Connection.this.pushedStream(i)) {
                okhttp3.internal.http2.Http2Connection.this.pushDataLater(i, bufferedSource, i2, z);
                return;
            }
            okhttp3.internal.http2.Http2Stream stream = okhttp3.internal.http2.Http2Connection.this.getStream(i);
            if (stream == null) {
                okhttp3.internal.http2.Http2Connection.this.writeSynResetLater(i, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                okhttp3.internal.http2.Http2Connection.this.updateConnectionFlowControl(j);
                bufferedSource.skip(j);
                return;
            }
            stream.receiveData(bufferedSource, i2);
            if (z) {
                stream.receiveFin();
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void headers(boolean z, int i, int i2, java.util.List<okhttp3.internal.http2.Header> list) {
            if (okhttp3.internal.http2.Http2Connection.this.pushedStream(i)) {
                okhttp3.internal.http2.Http2Connection.this.pushHeadersLater(i, list, z);
                return;
            }
            synchronized (okhttp3.internal.http2.Http2Connection.this) {
                okhttp3.internal.http2.Http2Stream stream = okhttp3.internal.http2.Http2Connection.this.getStream(i);
                if (stream == null) {
                    if (okhttp3.internal.http2.Http2Connection.this.shutdown) {
                        return;
                    }
                    if (i <= okhttp3.internal.http2.Http2Connection.this.lastGoodStreamId) {
                        return;
                    }
                    if (i % 2 == okhttp3.internal.http2.Http2Connection.this.nextStreamId % 2) {
                        return;
                    }
                    final okhttp3.internal.http2.Http2Stream http2Stream = new okhttp3.internal.http2.Http2Stream(i, okhttp3.internal.http2.Http2Connection.this, false, z, okhttp3.internal.Util.toHeaders(list));
                    okhttp3.internal.http2.Http2Connection.this.lastGoodStreamId = i;
                    okhttp3.internal.http2.Http2Connection.this.streams.put(java.lang.Integer.valueOf(i), http2Stream);
                    okhttp3.internal.http2.Http2Connection.listenerExecutor.execute(new okhttp3.internal.NamedRunnable("OkHttp %s stream %d", new java.lang.Object[]{okhttp3.internal.http2.Http2Connection.this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.ReaderRunnable.1
                        @Override // okhttp3.internal.NamedRunnable
                        public void execute() {
                            try {
                                okhttp3.internal.http2.Http2Connection.this.listener.onStream(http2Stream);
                            } catch (java.io.IOException e) {
                                okhttp3.internal.platform.Platform.get().log(4, "Http2Connection.Listener failure for " + okhttp3.internal.http2.Http2Connection.this.hostname, e);
                                try {
                                    http2Stream.close(okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                                } catch (java.io.IOException unused) {
                                }
                            }
                        }
                    });
                    return;
                }
                stream.receiveHeaders(list);
                if (z) {
                    stream.receiveFin();
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, okhttp3.internal.http2.ErrorCode errorCode) {
            if (okhttp3.internal.http2.Http2Connection.this.pushedStream(i)) {
                okhttp3.internal.http2.Http2Connection.this.pushResetLater(i, errorCode);
                return;
            }
            okhttp3.internal.http2.Http2Stream http2StreamRemoveStream = okhttp3.internal.http2.Http2Connection.this.removeStream(i);
            if (http2StreamRemoveStream != null) {
                http2StreamRemoveStream.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z, okhttp3.internal.http2.Settings settings) {
            okhttp3.internal.http2.Http2Stream[] http2StreamArr;
            long j;
            int i;
            synchronized (okhttp3.internal.http2.Http2Connection.this) {
                int initialWindowSize = okhttp3.internal.http2.Http2Connection.this.peerSettings.getInitialWindowSize();
                if (z) {
                    okhttp3.internal.http2.Http2Connection.this.peerSettings.clear();
                }
                okhttp3.internal.http2.Http2Connection.this.peerSettings.merge(settings);
                applyAndAckSettings(settings);
                int initialWindowSize2 = okhttp3.internal.http2.Http2Connection.this.peerSettings.getInitialWindowSize();
                http2StreamArr = null;
                if (initialWindowSize2 == -1 || initialWindowSize2 == initialWindowSize) {
                    j = 0;
                } else {
                    j = initialWindowSize2 - initialWindowSize;
                    if (!okhttp3.internal.http2.Http2Connection.this.receivedInitialPeerSettings) {
                        okhttp3.internal.http2.Http2Connection.this.receivedInitialPeerSettings = true;
                    }
                    if (!okhttp3.internal.http2.Http2Connection.this.streams.isEmpty()) {
                        http2StreamArr = (okhttp3.internal.http2.Http2Stream[]) okhttp3.internal.http2.Http2Connection.this.streams.values().toArray(new okhttp3.internal.http2.Http2Stream[okhttp3.internal.http2.Http2Connection.this.streams.size()]);
                    }
                }
                okhttp3.internal.http2.Http2Connection.listenerExecutor.execute(new okhttp3.internal.NamedRunnable("OkHttp %s settings", okhttp3.internal.http2.Http2Connection.this.hostname) { // from class: okhttp3.internal.http2.Http2Connection.ReaderRunnable.2
                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        okhttp3.internal.http2.Http2Connection.this.listener.onSettings(okhttp3.internal.http2.Http2Connection.this);
                    }
                });
            }
            if (http2StreamArr == null || j == 0) {
                return;
            }
            for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr) {
                synchronized (http2Stream) {
                    http2Stream.addBytesToWriteWindow(j);
                }
            }
        }

        private void applyAndAckSettings(final okhttp3.internal.http2.Settings settings) {
            try {
                okhttp3.internal.http2.Http2Connection.this.writerExecutor.execute(new okhttp3.internal.NamedRunnable("OkHttp %s ACK Settings", new java.lang.Object[]{okhttp3.internal.http2.Http2Connection.this.hostname}) { // from class: okhttp3.internal.http2.Http2Connection.ReaderRunnable.3
                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        try {
                            okhttp3.internal.http2.Http2Connection.this.writer.applyAndAckSettings(settings);
                        } catch (java.io.IOException unused) {
                            okhttp3.internal.http2.Http2Connection.this.failConnection();
                        }
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i, int i2) {
            if (!z) {
                try {
                    okhttp3.internal.http2.Http2Connection.this.writerExecutor.execute(okhttp3.internal.http2.Http2Connection.this.new PingRunnable(true, i, i2));
                } catch (java.util.concurrent.RejectedExecutionException unused) {
                }
            } else {
                synchronized (okhttp3.internal.http2.Http2Connection.this) {
                    okhttp3.internal.http2.Http2Connection.this.awaitingPong = false;
                    okhttp3.internal.http2.Http2Connection.this.notifyAll();
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, okhttp3.internal.http2.ErrorCode errorCode, okio.ByteString byteString) {
            okhttp3.internal.http2.Http2Stream[] http2StreamArr;
            byteString.size();
            synchronized (okhttp3.internal.http2.Http2Connection.this) {
                http2StreamArr = (okhttp3.internal.http2.Http2Stream[]) okhttp3.internal.http2.Http2Connection.this.streams.values().toArray(new okhttp3.internal.http2.Http2Stream[okhttp3.internal.http2.Http2Connection.this.streams.size()]);
                okhttp3.internal.http2.Http2Connection.this.shutdown = true;
            }
            for (okhttp3.internal.http2.Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(okhttp3.internal.http2.ErrorCode.REFUSED_STREAM);
                    okhttp3.internal.http2.Http2Connection.this.removeStream(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (okhttp3.internal.http2.Http2Connection.this) {
                    okhttp3.internal.http2.Http2Connection.this.bytesLeftInWriteWindow += j;
                    okhttp3.internal.http2.Http2Connection.this.notifyAll();
                }
                return;
            }
            okhttp3.internal.http2.Http2Stream stream = okhttp3.internal.http2.Http2Connection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, java.util.List<okhttp3.internal.http2.Header> list) {
            okhttp3.internal.http2.Http2Connection.this.pushRequestLater(i2, list);
        }
    }

    void pushRequestLater(final int i, final java.util.List<okhttp3.internal.http2.Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(java.lang.Integer.valueOf(i))) {
                writeSynResetLater(i, okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(java.lang.Integer.valueOf(i));
            try {
                pushExecutorExecute(new okhttp3.internal.NamedRunnable("OkHttp %s Push Request[%s]", new java.lang.Object[]{this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.3
                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        if (okhttp3.internal.http2.Http2Connection.this.pushObserver.onRequest(i, list)) {
                            try {
                                okhttp3.internal.http2.Http2Connection.this.writer.rstStream(i, okhttp3.internal.http2.ErrorCode.CANCEL);
                                synchronized (okhttp3.internal.http2.Http2Connection.this) {
                                    try {
                                        okhttp3.internal.http2.Http2Connection.this.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                            } catch (java.io.IOException unused) {
                            }
                        }
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException unused) {
            }
        }
    }

    void pushHeadersLater(final int i, final java.util.List<okhttp3.internal.http2.Header> list, final boolean z) {
        try {
            pushExecutorExecute(new okhttp3.internal.NamedRunnable("OkHttp %s Push Headers[%s]", new java.lang.Object[]{this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.4
                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    boolean zOnHeaders = okhttp3.internal.http2.Http2Connection.this.pushObserver.onHeaders(i, list, z);
                    if (zOnHeaders) {
                        try {
                            okhttp3.internal.http2.Http2Connection.this.writer.rstStream(i, okhttp3.internal.http2.ErrorCode.CANCEL);
                        } catch (java.io.IOException unused) {
                            return;
                        }
                    }
                    if (zOnHeaders || z) {
                        synchronized (okhttp3.internal.http2.Http2Connection.this) {
                            try {
                                okhttp3.internal.http2.Http2Connection.this.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException unused) {
        }
    }

    void pushDataLater(final int i, okio.BufferedSource bufferedSource, final int i2, final boolean z) throws java.io.IOException {
        final okio.Buffer buffer = new okio.Buffer();
        long j = i2;
        bufferedSource.require(j);
        bufferedSource.read(buffer, j);
        if (buffer.size() != j) {
            throw new java.io.IOException(buffer.size() + " != " + i2);
        }
        pushExecutorExecute(new okhttp3.internal.NamedRunnable("OkHttp %s Push Data[%s]", new java.lang.Object[]{this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.5
            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                try {
                    boolean zOnData = okhttp3.internal.http2.Http2Connection.this.pushObserver.onData(i, buffer, i2, z);
                    if (zOnData) {
                        okhttp3.internal.http2.Http2Connection.this.writer.rstStream(i, okhttp3.internal.http2.ErrorCode.CANCEL);
                    }
                    if (zOnData || z) {
                        synchronized (okhttp3.internal.http2.Http2Connection.this) {
                            okhttp3.internal.http2.Http2Connection.this.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                        }
                    }
                } catch (java.io.IOException unused) {
                }
            }
        });
    }

    void pushResetLater(final int i, final okhttp3.internal.http2.ErrorCode errorCode) {
        pushExecutorExecute(new okhttp3.internal.NamedRunnable("OkHttp %s Push Reset[%s]", new java.lang.Object[]{this.hostname, java.lang.Integer.valueOf(i)}) { // from class: okhttp3.internal.http2.Http2Connection.6
            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                okhttp3.internal.http2.Http2Connection.this.pushObserver.onReset(i, errorCode);
                synchronized (okhttp3.internal.http2.Http2Connection.this) {
                    okhttp3.internal.http2.Http2Connection.this.currentPushRequests.remove(java.lang.Integer.valueOf(i));
                }
            }
        });
    }

    private synchronized void pushExecutorExecute(okhttp3.internal.NamedRunnable namedRunnable) {
        if (!isShutdown()) {
            this.pushExecutor.execute(namedRunnable);
        }
    }
}
