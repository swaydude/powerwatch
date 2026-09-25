package okio;

/* JADX INFO: loaded from: classes2.dex */
final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer buffer = new okio.Buffer();
    boolean closed;
    public final okio.Source source;

    RealBufferedSource(okio.Source source) {
        java.util.Objects.requireNonNull(source, "source == null");
        this.source = source;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
        return this.buffer;
    }

    @Override // okio.Source
    public long read(okio.Buffer buffer, long j) throws java.io.IOException {
        if (buffer == null) {
            throw new java.lang.IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (this.buffer.size == 0 && this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.buffer.read(buffer, java.lang.Math.min(j, this.buffer.size));
    }

    @Override // okio.BufferedSource
    public boolean exhausted() throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        return this.buffer.exhausted() && this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // okio.BufferedSource
    public void require(long j) throws java.io.IOException {
        if (!request(j)) {
            throw new java.io.EOFException();
        }
    }

    @Override // okio.BufferedSource
    public boolean request(long j) throws java.io.IOException {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (this.buffer.size < j) {
            if (this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.IOException {
        require(1L);
        return this.buffer.readByte();
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() throws java.io.IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteString();
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long j) throws java.io.IOException {
        require(j);
        return this.buffer.readByteString(j);
    }

    @Override // okio.BufferedSource
    public int select(okio.Options options) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        do {
            int iSelectPrefix = this.buffer.selectPrefix(options, true);
            if (iSelectPrefix == -1) {
                return -1;
            }
            if (iSelectPrefix != -2) {
                this.buffer.skip(options.byteStrings[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() throws java.io.IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readByteArray();
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j) throws java.io.IOException {
        require(j);
        return this.buffer.readByteArray(j);
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) throws java.io.IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) throws java.io.IOException {
        try {
            require(bArr.length);
            this.buffer.readFully(bArr);
        } catch (java.io.EOFException e) {
            int i = 0;
            while (this.buffer.size > 0) {
                okio.Buffer buffer = this.buffer;
                int i2 = buffer.read(bArr, i, (int) buffer.size);
                if (i2 == -1) {
                    throw new java.lang.AssertionError();
                }
                i += i2;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        long j = i2;
        okio.Util.checkOffsetAndCount(bArr.length, i, j);
        if (this.buffer.size == 0 && this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.buffer.read(bArr, i, (int) java.lang.Math.min(j, this.buffer.size));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (this.buffer.size == 0 && this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.buffer.read(byteBuffer);
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer buffer, long j) throws java.io.IOException {
        try {
            require(j);
            this.buffer.readFully(buffer, j);
        } catch (java.io.EOFException e) {
            buffer.writeAll(this.buffer);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink sink) throws java.io.IOException {
        if (sink == null) {
            throw new java.lang.IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jCompleteSegmentByteCount = this.buffer.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j += jCompleteSegmentByteCount;
                sink.write(this.buffer, jCompleteSegmentByteCount);
            }
        }
        if (this.buffer.size() <= 0) {
            return j;
        }
        long size = j + this.buffer.size();
        okio.Buffer buffer = this.buffer;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() throws java.io.IOException {
        this.buffer.writeAll(this.source);
        return this.buffer.readUtf8();
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long j) throws java.io.IOException {
        require(j);
        return this.buffer.readUtf8(j);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset charset) throws java.io.IOException {
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        this.buffer.writeAll(this.source);
        return this.buffer.readString(charset);
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long j, java.nio.charset.Charset charset) throws java.io.IOException {
        require(j);
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        return this.buffer.readString(j, charset);
    }

    @Override // okio.BufferedSource
    @javax.annotation.Nullable
    public java.lang.String readUtf8Line() throws java.io.IOException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return this.buffer.readUtf8Line(jIndexOf);
        }
        if (this.buffer.size != 0) {
            return readUtf8(this.buffer.size);
        }
        return null;
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() throws java.io.IOException {
        return readUtf8LineStrict(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long j) throws java.io.IOException {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = j == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j2);
        if (jIndexOf != -1) {
            return this.buffer.readUtf8Line(jIndexOf);
        }
        if (j2 < kotlin.jvm.internal.LongCompanionObject.MAX_VALUE && request(j2) && this.buffer.getByte(j2 - 1) == 13 && request(1 + j2) && this.buffer.getByte(j2) == 10) {
            return this.buffer.readUtf8Line(j2);
        }
        okio.Buffer buffer = new okio.Buffer();
        okio.Buffer buffer2 = this.buffer;
        buffer2.copyTo(buffer, 0L, java.lang.Math.min(32L, buffer2.size()));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(this.buffer.size(), j) + " content=" + buffer.readByteString().hex() + kotlin.text.Typography.ellipsis);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.IOException {
        require(1L);
        byte b = this.buffer.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.buffer.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.IOException {
        require(2L);
        return this.buffer.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.IOException {
        require(2L);
        return this.buffer.readShortLe();
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.IOException {
        require(4L);
        return this.buffer.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.IOException {
        require(4L);
        return this.buffer.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.IOException {
        require(8L);
        return this.buffer.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.IOException {
        require(8L);
        return this.buffer.readLongLe();
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.IOException {
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            byte b = this.buffer.getByte(i);
            if ((b < 48 || b > 57) && !(i == 0 && b == 45)) {
                if (i != 0) {
                    break;
                }
                throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9] or '-' character but was %#x", java.lang.Byte.valueOf(b)));
            }
            i = i2;
        }
        return this.buffer.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.IOException {
        require(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request(i2)) {
                break;
            }
            byte b = this.buffer.getByte(i);
            if ((b < 48 || b > 57) && ((b < 97 || b > 102) && (b < 65 || b > 70))) {
                if (i != 0) {
                    break;
                }
                throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(b)));
            }
            i = i2;
        }
        return this.buffer.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.buffer.size == 0 && this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new java.io.EOFException();
            }
            long jMin = java.lang.Math.min(j, this.buffer.size());
            this.buffer.skip(jMin);
            j -= jMin;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) throws java.io.IOException {
        return indexOf(b, 0L, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j) throws java.io.IOException {
        return indexOf(b, j, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j, long j2) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("fromIndex=%s toIndex=%s", java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
        while (j < j2) {
            long jIndexOf = this.buffer.indexOf(b, j, j2);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j3 = this.buffer.size;
            if (j3 >= j2 || this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            j = java.lang.Math.max(j, j3);
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString byteString) throws java.io.IOException {
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString byteString, long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = this.buffer.indexOf(byteString, j);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long j2 = this.buffer.size;
            if (this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = java.lang.Math.max(j, (j2 - ((long) byteString.size())) + 1);
        }
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString byteString) throws java.io.IOException {
        return indexOfElement(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString byteString, long j) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = this.buffer.indexOfElement(byteString, j);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long j2 = this.buffer.size;
            if (this.source.read(this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j = java.lang.Math.max(j, j2);
        }
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, okio.ByteString byteString) throws java.io.IOException {
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, okio.ByteString byteString, int i, int i2) throws java.io.IOException {
        if (this.closed) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = ((long) i3) + j;
            if (!request(1 + j2) || this.buffer.getByte(j2) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
        return new java.io.InputStream() { // from class: okio.RealBufferedSource.1
            @Override // java.io.InputStream
            public int read() throws java.io.IOException {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException("closed");
                }
                if (okio.RealBufferedSource.this.buffer.size == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return okio.RealBufferedSource.this.buffer.readByte() & kotlin.UByte.MAX_VALUE;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException("closed");
                }
                okio.Util.checkOffsetAndCount(bArr.length, i, i2);
                if (okio.RealBufferedSource.this.buffer.size == 0 && okio.RealBufferedSource.this.source.read(okio.RealBufferedSource.this.buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return okio.RealBufferedSource.this.buffer.read(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() throws java.io.IOException {
                if (okio.RealBufferedSource.this.closed) {
                    throw new java.io.IOException("closed");
                }
                return (int) java.lang.Math.min(okio.RealBufferedSource.this.buffer.size, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                okio.RealBufferedSource.this.close();
            }

            public java.lang.String toString() {
                return okio.RealBufferedSource.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.buffer.clear();
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
        return this.source.timeout();
    }

    public java.lang.String toString() {
        return "buffer(" + this.source + ")";
    }
}
