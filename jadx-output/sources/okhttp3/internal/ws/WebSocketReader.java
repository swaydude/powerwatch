package okhttp3.internal.ws;

/* JADX INFO: loaded from: classes2.dex */
final class WebSocketReader {
    boolean closed;
    final okhttp3.internal.ws.WebSocketReader.FrameCallback frameCallback;
    long frameLength;
    final boolean isClient;
    boolean isControlFrame;
    boolean isFinalFrame;
    private final okio.Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    int opcode;
    final okio.BufferedSource source;
    private final okio.Buffer controlFrameBuffer = new okio.Buffer();
    private final okio.Buffer messageFrameBuffer = new okio.Buffer();

    public interface FrameCallback {
        void onReadClose(int i, java.lang.String str);

        void onReadMessage(java.lang.String str) throws java.io.IOException;

        void onReadMessage(okio.ByteString byteString) throws java.io.IOException;

        void onReadPing(okio.ByteString byteString);

        void onReadPong(okio.ByteString byteString);
    }

    WebSocketReader(boolean z, okio.BufferedSource bufferedSource, okhttp3.internal.ws.WebSocketReader.FrameCallback frameCallback) {
        java.util.Objects.requireNonNull(bufferedSource, "source == null");
        java.util.Objects.requireNonNull(frameCallback, "frameCallback == null");
        this.isClient = z;
        this.source = bufferedSource;
        this.frameCallback = frameCallback;
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new okio.Buffer.UnsafeCursor();
    }

    void processNextFrame() throws java.io.IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }

    private void readHeader() throws java.io.IOException {
        if (this.closed) {
            throw new java.io.IOException("closed");
        }
        long jTimeoutNanos = this.source.timeout().timeoutNanos();
        this.source.timeout().clearTimeout();
        try {
            int i = this.source.readByte() & kotlin.UByte.MAX_VALUE;
            this.source.timeout().timeout(jTimeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            this.opcode = i & 15;
            boolean z = (i & 128) != 0;
            this.isFinalFrame = z;
            boolean z2 = (i & 8) != 0;
            this.isControlFrame = z2;
            if (z2 && !z) {
                throw new java.net.ProtocolException("Control frames must be final.");
            }
            boolean z3 = (i & 64) != 0;
            boolean z4 = (i & 32) != 0;
            boolean z5 = (i & 16) != 0;
            if (z3 || z4 || z5) {
                throw new java.net.ProtocolException("Reserved flags are unsupported.");
            }
            int i2 = this.source.readByte() & kotlin.UByte.MAX_VALUE;
            boolean z6 = (i2 & 128) != 0;
            if (z6 == this.isClient) {
                throw new java.net.ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = i2 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
            this.frameLength = j;
            if (j == 126) {
                this.frameLength = ((long) this.source.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.source.readLong();
                this.frameLength = j2;
                if (j2 < 0) {
                    throw new java.net.ProtocolException("Frame length 0x" + java.lang.Long.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new java.net.ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                this.source.readFully(this.maskKey);
            }
        } catch (java.lang.Throwable th) {
            this.source.timeout().timeout(jTimeoutNanos, java.util.concurrent.TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private void readControlFrame() throws java.io.IOException {
        java.lang.String utf8;
        long j = this.frameLength;
        if (j > 0) {
            this.source.readFully(this.controlFrameBuffer, j);
            if (!this.isClient) {
                this.controlFrameBuffer.readAndWriteUnsafe(this.maskCursor);
                this.maskCursor.seek(0L);
                okhttp3.internal.ws.WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                long size = this.controlFrameBuffer.size();
                if (size == 1) {
                    throw new java.net.ProtocolException("Malformed close payload length of 1.");
                }
                if (size != 0) {
                    s = this.controlFrameBuffer.readShort();
                    utf8 = this.controlFrameBuffer.readUtf8();
                    java.lang.String strCloseCodeExceptionMessage = okhttp3.internal.ws.WebSocketProtocol.closeCodeExceptionMessage(s);
                    if (strCloseCodeExceptionMessage != null) {
                        throw new java.net.ProtocolException(strCloseCodeExceptionMessage);
                    }
                } else {
                    utf8 = "";
                }
                this.frameCallback.onReadClose(s, utf8);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.readByteString());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.readByteString());
                return;
            default:
                throw new java.net.ProtocolException("Unknown control opcode: " + java.lang.Integer.toHexString(this.opcode));
        }
    }

    private void readMessageFrame() throws java.io.IOException {
        int i = this.opcode;
        if (i != 1 && i != 2) {
            throw new java.net.ProtocolException("Unknown opcode: " + java.lang.Integer.toHexString(i));
        }
        readMessage();
        if (i == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readUtf8());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.readByteString());
        }
    }

    private void readUntilNonControlFrame() throws java.io.IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    private void readMessage() throws java.io.IOException {
        while (!this.closed) {
            long j = this.frameLength;
            if (j > 0) {
                this.source.readFully(this.messageFrameBuffer, j);
                if (!this.isClient) {
                    this.messageFrameBuffer.readAndWriteUnsafe(this.maskCursor);
                    this.maskCursor.seek(this.messageFrameBuffer.size() - this.frameLength);
                    okhttp3.internal.ws.WebSocketProtocol.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new java.net.ProtocolException("Expected continuation opcode. Got: " + java.lang.Integer.toHexString(this.opcode));
            }
        }
        throw new java.io.IOException("closed");
    }
}
