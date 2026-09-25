package okhttp3.internal.ws;

/* JADX INFO: loaded from: classes2.dex */
final class WebSocketWriter {
    boolean activeWriter;
    final okio.Buffer buffer = new okio.Buffer();
    final okhttp3.internal.ws.WebSocketWriter.FrameSink frameSink = new okhttp3.internal.ws.WebSocketWriter.FrameSink();
    final boolean isClient;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    final java.util.Random random;
    final okio.BufferedSink sink;
    final okio.Buffer sinkBuffer;
    boolean writerClosed;

    WebSocketWriter(boolean z, okio.BufferedSink bufferedSink, java.util.Random random) {
        java.util.Objects.requireNonNull(bufferedSink, "sink == null");
        java.util.Objects.requireNonNull(random, "random == null");
        this.isClient = z;
        this.sink = bufferedSink;
        this.sinkBuffer = bufferedSink.buffer();
        this.random = random;
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new okio.Buffer.UnsafeCursor() : null;
    }

    void writePing(okio.ByteString byteString) throws java.io.IOException {
        writeControlFrame(9, byteString);
    }

    void writePong(okio.ByteString byteString) throws java.io.IOException {
        writeControlFrame(10, byteString);
    }

    void writeClose(int i, okio.ByteString byteString) throws java.io.IOException {
        okio.ByteString byteString2 = okio.ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                okhttp3.internal.ws.WebSocketProtocol.validateCloseCode(i);
            }
            okio.Buffer buffer = new okio.Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        try {
            writeControlFrame(8, byteString2);
        } finally {
            this.writerClosed = true;
        }
    }

    private void writeControlFrame(int i, okio.ByteString byteString) throws java.io.IOException {
        if (this.writerClosed) {
            throw new java.io.IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new java.lang.IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.sinkBuffer.writeByte(i | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(size | 128);
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                long size2 = this.sinkBuffer.size();
                this.sinkBuffer.write(byteString);
                this.sinkBuffer.readAndWriteUnsafe(this.maskCursor);
                this.maskCursor.seek(size2);
                okhttp3.internal.ws.WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(size);
            this.sinkBuffer.write(byteString);
        }
        this.sink.flush();
    }

    okio.Sink newMessageSink(int i, long j) {
        if (this.activeWriter) {
            throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.activeWriter = true;
        this.frameSink.formatOpcode = i;
        this.frameSink.contentLength = j;
        this.frameSink.isFirstFrame = true;
        this.frameSink.closed = false;
        return this.frameSink;
    }

    void writeMessageFrame(int i, long j, boolean z, boolean z2) throws java.io.IOException {
        if (this.writerClosed) {
            throw new java.io.IOException("closed");
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.sinkBuffer.writeByte(i);
        int i2 = this.isClient ? 128 : 0;
        if (j <= 125) {
            this.sinkBuffer.writeByte(((int) j) | i2);
        } else if (j <= 65535) {
            this.sinkBuffer.writeByte(i2 | 126);
            this.sinkBuffer.writeShort((int) j);
        } else {
            this.sinkBuffer.writeByte(i2 | kotlinx.coroutines.scheduling.WorkQueueKt.MASK);
            this.sinkBuffer.writeLong(j);
        }
        if (this.isClient) {
            this.random.nextBytes(this.maskKey);
            this.sinkBuffer.write(this.maskKey);
            if (j > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.write(this.buffer, j);
                this.sinkBuffer.readAndWriteUnsafe(this.maskCursor);
                this.maskCursor.seek(size);
                okhttp3.internal.ws.WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.write(this.buffer, j);
        }
        this.sink.emit();
    }

    final class FrameSink implements okio.Sink {
        boolean closed;
        long contentLength;
        int formatOpcode;
        boolean isFirstFrame;

        FrameSink() {
        }

        @Override // okio.Sink
        public void write(okio.Buffer buffer, long j) throws java.io.IOException {
            if (this.closed) {
                throw new java.io.IOException("closed");
            }
            okhttp3.internal.ws.WebSocketWriter.this.buffer.write(buffer, j);
            boolean z = this.isFirstFrame && this.contentLength != -1 && okhttp3.internal.ws.WebSocketWriter.this.buffer.size() > this.contentLength - android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            long jCompleteSegmentByteCount = okhttp3.internal.ws.WebSocketWriter.this.buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount <= 0 || z) {
                return;
            }
            okhttp3.internal.ws.WebSocketWriter.this.writeMessageFrame(this.formatOpcode, jCompleteSegmentByteCount, this.isFirstFrame, false);
            this.isFirstFrame = false;
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
            if (this.closed) {
                throw new java.io.IOException("closed");
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = okhttp3.internal.ws.WebSocketWriter.this;
            webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, false);
            this.isFirstFrame = false;
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
            return okhttp3.internal.ws.WebSocketWriter.this.sink.timeout();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (this.closed) {
                throw new java.io.IOException("closed");
            }
            okhttp3.internal.ws.WebSocketWriter webSocketWriter = okhttp3.internal.ws.WebSocketWriter.this;
            webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.buffer.size(), this.isFirstFrame, true);
            this.closed = true;
            okhttp3.internal.ws.WebSocketWriter.this.activeWriter = false;
        }
    }
}
