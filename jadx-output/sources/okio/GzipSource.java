package okio;

/* JADX INFO: loaded from: classes2.dex */
public final class GzipSource implements okio.Source {
    private static final byte FCOMMENT = 4;
    private static final byte FEXTRA = 2;
    private static final byte FHCRC = 1;
    private static final byte FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private final okio.BufferedSource source;
    private int section = 0;
    private final java.util.zip.CRC32 crc = new java.util.zip.CRC32();

    public GzipSource(okio.Source source) {
        if (source == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.inflater = inflater;
        okio.BufferedSource bufferedSourceBuffer = okio.Okio.buffer(source);
        this.source = bufferedSourceBuffer;
        this.inflaterSource = new okio.InflaterSource(bufferedSourceBuffer, inflater);
    }

    @Override // okio.Source
    public long read(okio.Buffer buffer, long j) throws java.io.IOException {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: " + j);
        }
        if (j == 0) {
            return 0L;
        }
        if (this.section == 0) {
            consumeHeader();
            this.section = 1;
        }
        if (this.section == 1) {
            long j2 = buffer.size;
            long j3 = this.inflaterSource.read(buffer, j);
            if (j3 != -1) {
                updateCrc(buffer, j2, j3);
                return j3;
            }
            this.section = 2;
        }
        if (this.section == 2) {
            consumeTrailer();
            this.section = 3;
            if (!this.source.exhausted()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private void consumeHeader() throws java.io.IOException {
        this.source.require(10L);
        byte b = this.source.buffer().getByte(3L);
        boolean z = ((b >> 1) & 1) == 1;
        if (z) {
            updateCrc(this.source.buffer(), 0L, 10L);
        }
        checkEqual("ID1ID2", 8075, this.source.readShort());
        this.source.skip(8L);
        if (((b >> 2) & 1) == 1) {
            this.source.require(2L);
            if (z) {
                updateCrc(this.source.buffer(), 0L, 2L);
            }
            long shortLe = this.source.buffer().readShortLe();
            this.source.require(shortLe);
            if (z) {
                updateCrc(this.source.buffer(), 0L, shortLe);
            }
            this.source.skip(shortLe);
        }
        if (((b >> 3) & 1) == 1) {
            long jIndexOf = this.source.indexOf((byte) 0);
            if (jIndexOf == -1) {
                throw new java.io.EOFException();
            }
            if (z) {
                updateCrc(this.source.buffer(), 0L, jIndexOf + 1);
            }
            this.source.skip(jIndexOf + 1);
        }
        if (((b >> 4) & 1) == 1) {
            long jIndexOf2 = this.source.indexOf((byte) 0);
            if (jIndexOf2 == -1) {
                throw new java.io.EOFException();
            }
            if (z) {
                updateCrc(this.source.buffer(), 0L, jIndexOf2 + 1);
            }
            this.source.skip(jIndexOf2 + 1);
        }
        if (z) {
            checkEqual("FHCRC", this.source.readShortLe(), (short) this.crc.getValue());
            this.crc.reset();
        }
    }

    private void consumeTrailer() throws java.io.IOException {
        checkEqual("CRC", this.source.readIntLe(), (int) this.crc.getValue());
        checkEqual("ISIZE", this.source.readIntLe(), (int) this.inflater.getBytesWritten());
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
        return this.source.timeout();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.inflaterSource.close();
    }

    private void updateCrc(okio.Buffer buffer, long j, long j2) {
        okio.Segment segment = buffer.head;
        while (j >= segment.limit - segment.pos) {
            j -= (long) (segment.limit - segment.pos);
            segment = segment.next;
        }
        while (j2 > 0) {
            int i = (int) (((long) segment.pos) + j);
            int iMin = (int) java.lang.Math.min(segment.limit - i, j2);
            this.crc.update(segment.data, i, iMin);
            j2 -= (long) iMin;
            segment = segment.next;
            j = 0;
        }
    }

    private void checkEqual(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (i2 != i) {
            throw new java.io.IOException(java.lang.String.format("%s: actual 0x%08x != expected 0x%08x", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }
}
