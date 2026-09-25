package okhttp3.internal.ws;

/* JADX INFO: loaded from: classes2.dex */
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = java.util.Collections.singletonList(okhttp3.Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private okhttp3.Call call;
    private java.util.concurrent.ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private java.util.concurrent.ScheduledExecutorService executor;
    private boolean failed;
    private final java.lang.String key;
    final okhttp3.WebSocketListener listener;
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;
    private long queueSize;
    private final java.util.Random random;
    private okhttp3.internal.ws.WebSocketReader reader;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.ws.WebSocketWriter writer;
    private final java.lang.Runnable writerRunnable;
    private final java.util.ArrayDeque<okio.ByteString> pongQueue = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue = new java.util.ArrayDeque<>();
    private int receivedCloseCode = -1;

    public RealWebSocket(okhttp3.Request request, okhttp3.WebSocketListener webSocketListener, java.util.Random random, long j) {
        if (!io.fabric.sdk.android.services.network.HttpRequest.METHOD_GET.equals(request.method())) {
            throw new java.lang.IllegalArgumentException("Request must be GET: " + request.method());
        }
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.key = okio.ByteString.of(bArr).base64();
        this.writerRunnable = new java.lang.Runnable() { // from class: okhttp3.internal.ws.RealWebSocket.1
            @Override // java.lang.Runnable
            public void run() {
                do {
                    try {
                    } catch (java.io.IOException e) {
                        okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e, null);
                        return;
                    }
                } while (okhttp3.internal.ws.RealWebSocket.this.writeOneFrame());
            }
        };
    }

    @Override // okhttp3.WebSocket
    public okhttp3.Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        this.call.cancel();
    }

    public void connect(okhttp3.OkHttpClient okHttpClient) {
        okhttp3.OkHttpClient okHttpClientBuild = okHttpClient.newBuilder().eventListener(okhttp3.EventListener.NONE).protocols(ONLY_HTTP1).build();
        final okhttp3.Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        okhttp3.Call callNewWebSocketCall = okhttp3.internal.Internal.instance.newWebSocketCall(okHttpClientBuild, requestBuild);
        this.call = callNewWebSocketCall;
        callNewWebSocketCall.timeout().clearTimeout();
        this.call.enqueue(new okhttp3.Callback() { // from class: okhttp3.internal.ws.RealWebSocket.2
            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call, okhttp3.Response response) {
                try {
                    okhttp3.internal.ws.RealWebSocket.this.checkResponse(response);
                    okhttp3.internal.connection.StreamAllocation streamAllocation = okhttp3.internal.Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    okhttp3.internal.ws.RealWebSocket.Streams streamsNewWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        okhttp3.internal.ws.RealWebSocket.this.listener.onOpen(okhttp3.internal.ws.RealWebSocket.this, response);
                        okhttp3.internal.ws.RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        okhttp3.internal.ws.RealWebSocket.this.loopReader();
                    } catch (java.lang.Exception e) {
                        okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (java.net.ProtocolException e2) {
                    okhttp3.internal.ws.RealWebSocket.this.failWebSocket(e2, response);
                    okhttp3.internal.Util.closeQuietly(response);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call, java.io.IOException iOException) {
                okhttp3.internal.ws.RealWebSocket.this.failWebSocket(iOException, null);
            }
        });
    }

    void checkResponse(okhttp3.Response response) throws java.net.ProtocolException {
        if (response.code() != 101) {
            throw new java.net.ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
        }
        java.lang.String strHeader = response.header("Connection");
        if (!"Upgrade".equalsIgnoreCase(strHeader)) {
            throw new java.net.ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader + "'");
        }
        java.lang.String strHeader2 = response.header("Upgrade");
        if (!"websocket".equalsIgnoreCase(strHeader2)) {
            throw new java.net.ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader2 + "'");
        }
        java.lang.String strHeader3 = response.header("Sec-WebSocket-Accept");
        java.lang.String strBase64 = okio.ByteString.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
        if (strBase64.equals(strHeader3)) {
            return;
        }
        throw new java.net.ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + "' but was '" + strHeader3 + "'");
    }

    public void initReaderAndWriter(java.lang.String str, okhttp3.internal.ws.RealWebSocket.Streams streams) throws java.io.IOException {
        synchronized (this) {
            this.streams = streams;
            this.writer = new okhttp3.internal.ws.WebSocketWriter(streams.client, streams.sink, this.random);
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, okhttp3.internal.Util.threadFactory(str, false));
            this.executor = scheduledThreadPoolExecutor;
            if (this.pingIntervalMillis != 0) {
                okhttp3.internal.ws.RealWebSocket.PingRunnable pingRunnable = new okhttp3.internal.ws.RealWebSocket.PingRunnable();
                long j = this.pingIntervalMillis;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j, j, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
        }
        this.reader = new okhttp3.internal.ws.WebSocketReader(streams.client, streams.source, this);
    }

    public void loopReader() throws java.io.IOException {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    boolean processNextFrame() throws java.io.IOException {
        try {
            this.reader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (java.lang.Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    void awaitTermination(int i, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        this.executor.awaitTermination(i, timeUnit);
    }

    void tearDown() throws java.lang.InterruptedException {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10L, java.util.concurrent.TimeUnit.SECONDS);
    }

    synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(java.lang.String str) throws java.io.IOException {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(okio.ByteString byteString) throws java.io.IOException {
        this.listener.onMessage(this, byteString);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(okio.ByteString byteString) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(byteString);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(okio.ByteString byteString) {
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, java.lang.String str) {
        okhttp3.internal.ws.RealWebSocket.Streams streams;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException();
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                throw new java.lang.IllegalStateException("already closed");
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = str;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                okhttp3.internal.ws.RealWebSocket.Streams streams2 = this.streams;
                this.streams = null;
                java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.executor.shutdown();
                streams = streams2;
            }
        }
        try {
            this.listener.onClosing(this, i, str);
            if (streams != null) {
                this.listener.onClosed(this, i, str);
            }
        } finally {
            okhttp3.internal.Util.closeQuietly(streams);
        }
    }

    @Override // okhttp3.WebSocket
    public boolean send(java.lang.String str) {
        java.util.Objects.requireNonNull(str, "text == null");
        return send(okio.ByteString.encodeUtf8(str), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean send(okio.ByteString byteString) {
        java.util.Objects.requireNonNull(byteString, "bytes == null");
        return send(byteString, 2);
    }

    private synchronized boolean send(okio.ByteString byteString, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + ((long) byteString.size()) > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += (long) byteString.size();
            this.messageAndCloseQueue.add(new okhttp3.internal.ws.RealWebSocket.Message(i, byteString));
            runWriter();
            return true;
        }
        return false;
    }

    synchronized boolean pong(okio.ByteString byteString) {
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(byteString);
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, java.lang.String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    synchronized boolean close(int i, java.lang.String str, long j) {
        okhttp3.internal.ws.WebSocketProtocol.validateCloseCode(i);
        okio.ByteString byteStringEncodeUtf8 = null;
        if (str != null) {
            byteStringEncodeUtf8 = okio.ByteString.encodeUtf8(str);
            if (byteStringEncodeUtf8.size() > 123) {
                throw new java.lang.IllegalArgumentException("reason.size() > 123: " + str);
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new okhttp3.internal.ws.RealWebSocket.Close(i, byteStringEncodeUtf8, j));
            runWriter();
            return true;
        }
        return false;
    }

    private void runWriter() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    boolean writeOneFrame() throws java.io.IOException {
        okhttp3.internal.ws.RealWebSocket.Streams streams;
        java.lang.String str;
        synchronized (this) {
            if (this.failed) {
                return false;
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = this.writer;
            okio.ByteString byteStringPoll = this.pongQueue.poll();
            int i = -1;
            java.lang.Object obj = null;
            if (byteStringPoll == null) {
                java.lang.Object objPoll = this.messageAndCloseQueue.poll();
                if (objPoll instanceof okhttp3.internal.ws.RealWebSocket.Close) {
                    int i2 = this.receivedCloseCode;
                    str = this.receivedCloseReason;
                    if (i2 != -1) {
                        okhttp3.internal.ws.RealWebSocket.Streams streams2 = this.streams;
                        this.streams = null;
                        this.executor.shutdown();
                        obj = objPoll;
                        i = i2;
                        streams = streams2;
                    } else {
                        this.cancelFuture = this.executor.schedule(new okhttp3.internal.ws.RealWebSocket.CancelRunnable(), ((okhttp3.internal.ws.RealWebSocket.Close) objPoll).cancelAfterCloseMillis, java.util.concurrent.TimeUnit.MILLISECONDS);
                        i = i2;
                        streams = null;
                    }
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    streams = null;
                    str = null;
                }
                obj = objPoll;
            } else {
                streams = null;
                str = null;
            }
            try {
                if (byteStringPoll != null) {
                    webSocketWriter.writePong(byteStringPoll);
                } else if (obj instanceof okhttp3.internal.ws.RealWebSocket.Message) {
                    okio.ByteString byteString = ((okhttp3.internal.ws.RealWebSocket.Message) obj).data;
                    okio.BufferedSink bufferedSinkBuffer = okio.Okio.buffer(webSocketWriter.newMessageSink(((okhttp3.internal.ws.RealWebSocket.Message) obj).formatOpcode, byteString.size()));
                    bufferedSinkBuffer.write(byteString);
                    bufferedSinkBuffer.close();
                    synchronized (this) {
                        this.queueSize -= (long) byteString.size();
                    }
                } else if (obj instanceof okhttp3.internal.ws.RealWebSocket.Close) {
                    okhttp3.internal.ws.RealWebSocket.Close close = (okhttp3.internal.ws.RealWebSocket.Close) obj;
                    webSocketWriter.writeClose(close.code, close.reason);
                    if (streams != null) {
                        this.listener.onClosed(this, i, str);
                    }
                } else {
                    throw new java.lang.AssertionError();
                }
                okhttp3.internal.Util.closeQuietly(streams);
                return true;
            } catch (java.lang.Throwable th) {
                okhttp3.internal.Util.closeQuietly(streams);
                throw th;
            }
        }
    }

    private final class PingRunnable implements java.lang.Runnable {
        PingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            okhttp3.internal.ws.RealWebSocket.this.writePingFrame();
        }
    }

    void writePingFrame() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = this.writer;
            int i = this.awaitingPong ? this.sentPingCount : -1;
            this.sentPingCount++;
            this.awaitingPong = true;
            if (i != -1) {
                failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                return;
            }
            try {
                webSocketWriter.writePing(okio.ByteString.EMPTY);
            } catch (java.io.IOException e) {
                failWebSocket(e, null);
            }
        }
    }

    public void failWebSocket(java.lang.Exception exc, @javax.annotation.Nullable okhttp3.Response response) {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            okhttp3.internal.ws.RealWebSocket.Streams streams = this.streams;
            this.streams = null;
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.cancelFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.executor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            try {
                this.listener.onFailure(this, exc, response);
            } finally {
                okhttp3.internal.Util.closeQuietly(streams);
            }
        }
    }

    static final class Message {
        final okio.ByteString data;
        final int formatOpcode;

        Message(int i, okio.ByteString byteString) {
            this.formatOpcode = i;
            this.data = byteString;
        }
    }

    static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final okio.ByteString reason;

        Close(int i, okio.ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }
    }

    public static abstract class Streams implements java.io.Closeable {
        public final boolean client;
        public final okio.BufferedSink sink;
        public final okio.BufferedSource source;

        public Streams(boolean z, okio.BufferedSource bufferedSource, okio.BufferedSink bufferedSink) {
            this.client = z;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }
    }

    final class CancelRunnable implements java.lang.Runnable {
        CancelRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            okhttp3.internal.ws.RealWebSocket.this.cancel();
        }
    }
}
