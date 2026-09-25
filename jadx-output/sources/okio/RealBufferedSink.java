package okio;

/* JADX INFO: loaded from: classes2.dex */
final class RealBufferedSink implements okio.BufferedSink {
    public final okio.Buffer buffer = new okio.Buffer();
    boolean closed;
    public final okio.Sink sink;

    RealBufferedSink(okio.Sink sink) {
        java.util.Objects.requireNonNull(sink, "sink == null");
        this.sink = sink;
    }

    @Override // okio.BufferedSink
    public okio.Buffer buffer() {
        return this.buffer;
    }

    @Override // okio.Sink
    public void write(okio.Buffer buffer, long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.write(buffer, j);
        emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.ByteString byteString) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.write(byteString);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String str) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeUtf8(str);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeUtf8(str, i, i2);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeUtf8CodePoint(int i) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeUtf8CodePoint(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeString(str, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeString(java.lang.String str, int i, int i2, java.nio.charset.Charset charset) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeString(str, i, i2, charset);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] bArr) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.write(bArr);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.write(bArr, i, i2);
        return emitCompleteSegments();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        int iWrite = this.buffer.write(byteBuffer);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source source) throws java.io.IOException {
        if (source == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long j2 = source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            emitCompleteSegments();
        }
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink write(okio.Source source, long j) throws java.io.IOException {
        while (j > 0) {
            long j2 = source.read(this.buffer, j);
            if (j2 == -1) {
                throw new java.io.EOFException();
            }
            j -= j2;
            emitCompleteSegments();
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeByte(int i) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeByte(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShort(int i) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeShort(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeShortLe(int i) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeShortLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeInt(int i) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeInt(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeIntLe(int i) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeIntLe(i);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLong(long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeLongLe(long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeLongLe(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeDecimalLong(long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeDecimalLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink writeHexadecimalUnsignedLong(long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.buffer.writeHexadecimalUnsignedLong(j);
        return emitCompleteSegments();
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emitCompleteSegments() throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        long jCompleteSegmentByteCount = this.buffer.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.buffer, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public okio.BufferedSink emit() throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        long size = this.buffer.size();
        if (size > 0) {
            this.sink.write(this.buffer, size);
        }
        return this;
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
        return new java.io.OutputStream() { // from class: okio.RealBufferedSink.1
            @Override // java.io.OutputStream
            public void write(int i) throws java.io.IOException {
                if (okio.RealBufferedSink.this.closed) {
                    throw new java.io.IOException("closed");
                }
                okio.RealBufferedSink.this.buffer.writeByte((int) ((byte) i));
                okio.RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
                if (okio.RealBufferedSink.this.closed) {
                    throw new java.io.IOException("closed");
                }
                okio.RealBufferedSink.this.buffer.write(bArr, i, i2);
                okio.RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws java.io.IOException {
                if (okio.RealBufferedSink.this.closed) {
                    return;
                }
                okio.RealBufferedSink.this.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.lang.Throwable {
                okio.RealBufferedSink.this.close();
            }

            public java.lang.String toString() {
                return okio.RealBufferedSink.this + ".outputStream()";
            }
        };
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (this.buffer.size > 0) {
            okio.Sink sink = this.sink;
            okio.Buffer buffer = this.buffer;
            sink.write(buffer, buffer.size);
        }
        this.sink.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        if (this.closed) {
            return;
        }
        java.lang.Throwable th = null;
        try {
            if (this.buffer.size > 0) {
                okio.Sink sink = this.sink;
                okio.Buffer buffer = this.buffer;
                sink.write(buffer, buffer.size);
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        try {
            this.sink.close();
        } catch (java.lang.Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            okio.Util.sneakyRethrow(th);
        }
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
        return this.sink.timeout();
    }

    public java.lang.String toString() {
        return "buffer(" + this.sink + ")";
    }
}
