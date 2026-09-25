package okhttp3.internal.http2;

/* JADX INFO: loaded from: classes2.dex */
final class Http2Reader implements java.io.Closeable {
    static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(okhttp3.internal.http2.Http2.class.getName());
    private final boolean client;
    private final okhttp3.internal.http2.Http2Reader.ContinuationSource continuation;
    final okhttp3.internal.http2.Hpack.Reader hpackReader;
    private final okio.BufferedSource source;

    interface Handler {
        void ackSettings();

        void alternateService(int i, java.lang.String str, okio.ByteString byteString, java.lang.String str2, int i2, long j);

        void data(boolean z, int i, okio.BufferedSource bufferedSource, int i2) throws java.io.IOException;

        void goAway(int i, okhttp3.internal.http2.ErrorCode errorCode, okio.ByteString byteString);

        void headers(boolean z, int i, int i2, java.util.List<okhttp3.internal.http2.Header> list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, java.util.List<okhttp3.internal.http2.Header> list) throws java.io.IOException;

        void rstStream(int i, okhttp3.internal.http2.ErrorCode errorCode);

        void settings(boolean z, okhttp3.internal.http2.Settings settings);

        void windowUpdate(int i, long j);
    }

    Http2Reader(okio.BufferedSource bufferedSource, boolean z) {
        this.source = bufferedSource;
        this.client = z;
        okhttp3.internal.http2.Http2Reader.ContinuationSource continuationSource = new okhttp3.internal.http2.Http2Reader.ContinuationSource(bufferedSource);
        this.continuation = continuationSource;
        this.hpackReader = new okhttp3.internal.http2.Hpack.Reader(4096, continuationSource);
    }

    public void readConnectionPreface(okhttp3.internal.http2.Http2Reader.Handler handler) throws java.io.IOException {
        if (this.client) {
            if (!nextFrame(true, handler)) {
                throw okhttp3.internal.http2.Http2.ioException("Required SETTINGS preface not received", new java.lang.Object[0]);
            }
            return;
        }
        okio.ByteString byteString = this.source.readByteString(okhttp3.internal.http2.Http2.CONNECTION_PREFACE.size());
        java.util.logging.Logger logger2 = logger;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            logger2.fine(okhttp3.internal.Util.format("<< CONNECTION %s", byteString.hex()));
        }
        if (!okhttp3.internal.http2.Http2.CONNECTION_PREFACE.equals(byteString)) {
            throw okhttp3.internal.http2.Http2.ioException("Expected a connection header but was %s", byteString.utf8());
        }
    }

    public boolean nextFrame(boolean z, okhttp3.internal.http2.Http2Reader.Handler handler) throws java.io.IOException {
        try {
            this.source.require(9L);
            int medium = readMedium(this.source);
            if (medium < 0 || medium > 16384) {
                throw okhttp3.internal.http2.Http2.ioException("FRAME_SIZE_ERROR: %s", java.lang.Integer.valueOf(medium));
            }
            byte b = (byte) (this.source.readByte() & kotlin.UByte.MAX_VALUE);
            if (z && b != 4) {
                throw okhttp3.internal.http2.Http2.ioException("Expected a SETTINGS frame but was %s", java.lang.Byte.valueOf(b));
            }
            byte b2 = (byte) (this.source.readByte() & kotlin.UByte.MAX_VALUE);
            int i = this.source.readInt() & Integer.MAX_VALUE;
            java.util.logging.Logger logger2 = logger;
            if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                logger2.fine(okhttp3.internal.http2.Http2.frameLog(true, i, medium, b, b2));
            }
            switch (b) {
                case 0:
                    readData(handler, medium, b2, i);
                    return true;
                case 1:
                    readHeaders(handler, medium, b2, i);
                    return true;
                case 2:
                    readPriority(handler, medium, b2, i);
                    return true;
                case 3:
                    readRstStream(handler, medium, b2, i);
                    return true;
                case 4:
                    readSettings(handler, medium, b2, i);
                    return true;
                case 5:
                    readPushPromise(handler, medium, b2, i);
                    return true;
                case 6:
                    readPing(handler, medium, b2, i);
                    return true;
                case 7:
                    readGoAway(handler, medium, b2, i);
                    return true;
                case 8:
                    readWindowUpdate(handler, medium, b2, i);
                    return true;
                default:
                    this.source.skip(medium);
                    return true;
            }
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    private void readHeaders(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i2 == 0) {
            throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new java.lang.Object[0]);
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.source.readByte() & kotlin.UByte.MAX_VALUE) : (short) 0;
        if ((b & 32) != 0) {
            readPriority(handler, i2);
            i -= 5;
        }
        handler.headers(z, i2, -1, readHeaderBlock(lengthWithoutPadding(i, b, s), s, b, i2));
    }

    private java.util.List<okhttp3.internal.http2.Header> readHeaderBlock(int i, short s, byte b, int i2) throws java.io.IOException {
        okhttp3.internal.http2.Http2Reader.ContinuationSource continuationSource = this.continuation;
        continuationSource.left = i;
        continuationSource.length = i;
        this.continuation.padding = s;
        this.continuation.flags = b;
        this.continuation.streamId = i2;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }

    private void readData(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i2 == 0) {
            throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new java.lang.Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new java.lang.Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.source.readByte() & kotlin.UByte.MAX_VALUE) : (short) 0;
        handler.data(z, i2, this.source, lengthWithoutPadding(i, b, s));
        this.source.skip(s);
    }

    private void readPriority(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i != 5) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_PRIORITY length: %d != 5", java.lang.Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_PRIORITY streamId == 0", new java.lang.Object[0]);
        }
        readPriority(handler, i2);
    }

    private void readPriority(okhttp3.internal.http2.Http2Reader.Handler handler, int i) throws java.io.IOException {
        int i2 = this.source.readInt();
        handler.priority(i, i2 & Integer.MAX_VALUE, (this.source.readByte() & kotlin.UByte.MAX_VALUE) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    private void readRstStream(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i != 4) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_RST_STREAM length: %d != 4", java.lang.Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_RST_STREAM streamId == 0", new java.lang.Object[0]);
        }
        int i3 = this.source.readInt();
        okhttp3.internal.http2.ErrorCode errorCodeFromHttp2 = okhttp3.internal.http2.ErrorCode.fromHttp2(i3);
        if (errorCodeFromHttp2 == null) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", java.lang.Integer.valueOf(i3));
        }
        handler.rstStream(i2, errorCodeFromHttp2);
    }

    private void readSettings(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i2 != 0) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_SETTINGS streamId != 0", new java.lang.Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw okhttp3.internal.http2.Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new java.lang.Object[0]);
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", java.lang.Integer.valueOf(i));
        }
        okhttp3.internal.http2.Settings settings = new okhttp3.internal.http2.Settings();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.source.readShort() & kotlin.UShort.MAX_VALUE;
            int i5 = this.source.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new java.lang.Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 == 4) {
                i4 = 7;
                if (i5 < 0) {
                    throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new java.lang.Object[0]);
                }
            } else if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", java.lang.Integer.valueOf(i5));
            }
            settings.set(i4, i5);
        }
        handler.settings(false, settings);
    }

    private void readPushPromise(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i2 == 0) {
            throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new java.lang.Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.source.readByte() & kotlin.UByte.MAX_VALUE) : (short) 0;
        handler.pushPromise(i2, this.source.readInt() & Integer.MAX_VALUE, readHeaderBlock(lengthWithoutPadding(i - 4, b, s), s, b, i2));
    }

    private void readPing(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i != 8) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_PING length != 8: %s", java.lang.Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_PING streamId != 0", new java.lang.Object[0]);
        }
        handler.ping((b & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private void readGoAway(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i < 8) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_GOAWAY length < 8: %s", java.lang.Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_GOAWAY streamId != 0", new java.lang.Object[0]);
        }
        int i3 = this.source.readInt();
        int i4 = this.source.readInt();
        int i5 = i - 8;
        okhttp3.internal.http2.ErrorCode errorCodeFromHttp2 = okhttp3.internal.http2.ErrorCode.fromHttp2(i4);
        if (errorCodeFromHttp2 == null) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_GOAWAY unexpected error code: %d", java.lang.Integer.valueOf(i4));
        }
        okio.ByteString byteString = okio.ByteString.EMPTY;
        if (i5 > 0) {
            byteString = this.source.readByteString(i5);
        }
        handler.goAway(i3, errorCodeFromHttp2, byteString);
    }

    private void readWindowUpdate(okhttp3.internal.http2.Http2Reader.Handler handler, int i, byte b, int i2) throws java.io.IOException {
        if (i != 4) {
            throw okhttp3.internal.http2.Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", java.lang.Integer.valueOf(i));
        }
        long j = ((long) this.source.readInt()) & 2147483647L;
        if (j == 0) {
            throw okhttp3.internal.http2.Http2.ioException("windowSizeIncrement was 0", java.lang.Long.valueOf(j));
        }
        handler.windowUpdate(i2, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.source.close();
    }

    static final class ContinuationSource implements okio.Source {
        byte flags;
        int left;
        int length;
        short padding;
        private final okio.BufferedSource source;
        int streamId;

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
        }

        ContinuationSource(okio.BufferedSource bufferedSource) {
            this.source = bufferedSource;
        }

        @Override // okio.Source
        public long read(okio.Buffer buffer, long j) throws java.io.IOException {
            while (true) {
                int i = this.left;
                if (i == 0) {
                    this.source.skip(this.padding);
                    this.padding = (short) 0;
                    if ((this.flags & 4) != 0) {
                        return -1L;
                    }
                    readContinuationHeader();
                } else {
                    long j2 = this.source.read(buffer, java.lang.Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.left = (int) (((long) this.left) - j2);
                    return j2;
                }
            }
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
            return this.source.timeout();
        }

        private void readContinuationHeader() throws java.io.IOException {
            int i = this.streamId;
            int medium = okhttp3.internal.http2.Http2Reader.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            byte b = (byte) (this.source.readByte() & kotlin.UByte.MAX_VALUE);
            this.flags = (byte) (this.source.readByte() & kotlin.UByte.MAX_VALUE);
            if (okhttp3.internal.http2.Http2Reader.logger.isLoggable(java.util.logging.Level.FINE)) {
                okhttp3.internal.http2.Http2Reader.logger.fine(okhttp3.internal.http2.Http2.frameLog(true, this.streamId, this.length, b, this.flags));
            }
            int i2 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i2;
            if (b != 9) {
                throw okhttp3.internal.http2.Http2.ioException("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(b));
            }
            if (i2 != i) {
                throw okhttp3.internal.http2.Http2.ioException("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
            }
        }
    }

    static int readMedium(okio.BufferedSource bufferedSource) throws java.io.IOException {
        return (bufferedSource.readByte() & kotlin.UByte.MAX_VALUE) | ((bufferedSource.readByte() & kotlin.UByte.MAX_VALUE) << 16) | ((bufferedSource.readByte() & kotlin.UByte.MAX_VALUE) << 8);
    }

    static int lengthWithoutPadding(int i, byte b, short s) throws java.io.IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw okhttp3.internal.http2.Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", java.lang.Short.valueOf(s), java.lang.Integer.valueOf(i));
    }
}
