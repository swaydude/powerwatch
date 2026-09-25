package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public class QueueFile implements java.io.Closeable {
    static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(io.fabric.sdk.android.services.common.QueueFile.class.getName());
    private final byte[] buffer;
    private int elementCount;
    int fileLength;
    private io.fabric.sdk.android.services.common.QueueFile.Element first;
    private io.fabric.sdk.android.services.common.QueueFile.Element last;
    private final java.io.RandomAccessFile raf;

    public interface ElementReader {
        void read(java.io.InputStream inputStream, int i) throws java.io.IOException;
    }

    public QueueFile(java.io.File file) throws java.io.IOException {
        this.buffer = new byte[16];
        if (!file.exists()) {
            initialize(file);
        }
        this.raf = open(file);
        readHeader();
    }

    QueueFile(java.io.RandomAccessFile randomAccessFile) throws java.io.IOException {
        this.buffer = new byte[16];
        this.raf = randomAccessFile;
        readHeader();
    }

    private static void writeInt(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void writeInts(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            writeInt(bArr, i, i2);
            i += 4;
        }
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & kotlin.UByte.MAX_VALUE) << 24) + ((bArr[i + 1] & kotlin.UByte.MAX_VALUE) << 16) + ((bArr[i + 2] & kotlin.UByte.MAX_VALUE) << 8) + (bArr[i + 3] & kotlin.UByte.MAX_VALUE);
    }

    private void readHeader() throws java.io.IOException {
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        int i = readInt(this.buffer, 0);
        this.fileLength = i;
        if (i > this.raf.length()) {
            throw new java.io.IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + this.raf.length());
        }
        this.elementCount = readInt(this.buffer, 4);
        int i2 = readInt(this.buffer, 8);
        int i3 = readInt(this.buffer, 12);
        this.first = readElement(i2);
        this.last = readElement(i3);
    }

    private void writeHeader(int i, int i2, int i3, int i4) throws java.io.IOException {
        writeInts(this.buffer, i, i2, i3, i4);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private io.fabric.sdk.android.services.common.QueueFile.Element readElement(int i) throws java.io.IOException {
        if (i == 0) {
            return io.fabric.sdk.android.services.common.QueueFile.Element.NULL;
        }
        this.raf.seek(i);
        return new io.fabric.sdk.android.services.common.QueueFile.Element(i, this.raf.readInt());
    }

    private static void initialize(java.io.File file) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file.getPath() + ".tmp");
        java.io.RandomAccessFile randomAccessFileOpen = open(file2);
        try {
            randomAccessFileOpen.setLength(android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            randomAccessFileOpen.seek(0L);
            byte[] bArr = new byte[16];
            writeInts(bArr, 4096, 0, 0, 0);
            randomAccessFileOpen.write(bArr);
            randomAccessFileOpen.close();
            if (!file2.renameTo(file)) {
                throw new java.io.IOException("Rename failed!");
            }
        } catch (java.lang.Throwable th) {
            randomAccessFileOpen.close();
            throw th;
        }
    }

    private static java.io.RandomAccessFile open(java.io.File file) throws java.io.FileNotFoundException {
        return new java.io.RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int wrapPosition(int i) {
        int i2 = this.fileLength;
        return i < i2 ? i : (i + 16) - i2;
    }

    private void ringWrite(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        int iWrapPosition = wrapPosition(i);
        int i4 = iWrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek(iWrapPosition);
            this.raf.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.write(bArr, i2, i6);
        this.raf.seek(16L);
        this.raf.write(bArr, i2 + i6, i3 - i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ringRead(int i, byte[] bArr, int i2, int i3) throws java.io.IOException {
        int iWrapPosition = wrapPosition(i);
        int i4 = iWrapPosition + i3;
        int i5 = this.fileLength;
        if (i4 <= i5) {
            this.raf.seek(iWrapPosition);
            this.raf.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - iWrapPosition;
        this.raf.seek(iWrapPosition);
        this.raf.readFully(bArr, i2, i6);
        this.raf.seek(16L);
        this.raf.readFully(bArr, i2 + i6, i3 - i6);
    }

    public void add(byte[] bArr) throws java.io.IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void add(byte[] bArr, int i, int i2) throws java.io.IOException {
        nonNull(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        expandIfNecessary(i2);
        boolean zIsEmpty = isEmpty();
        io.fabric.sdk.android.services.common.QueueFile.Element element = new io.fabric.sdk.android.services.common.QueueFile.Element(zIsEmpty ? 16 : wrapPosition(this.last.position + 4 + this.last.length), i2);
        writeInt(this.buffer, 0, i2);
        ringWrite(element.position, this.buffer, 0, 4);
        ringWrite(element.position + 4, bArr, i, i2);
        writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element.position : this.first.position, element.position);
        this.last = element;
        this.elementCount++;
        if (zIsEmpty) {
            this.first = element;
        }
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        if (this.last.position >= this.first.position) {
            return (this.last.position - this.first.position) + 4 + this.last.length + 16;
        }
        return (((this.last.position + 4) + this.last.length) + this.fileLength) - this.first.position;
    }

    private int remainingBytes() {
        return this.fileLength - usedBytes();
    }

    public synchronized boolean isEmpty() {
        return this.elementCount == 0;
    }

    private void expandIfNecessary(int i) throws java.io.IOException {
        int i2 = i + 4;
        int iRemainingBytes = remainingBytes();
        if (iRemainingBytes >= i2) {
            return;
        }
        int i3 = this.fileLength;
        do {
            iRemainingBytes += i3;
            i3 <<= 1;
        } while (iRemainingBytes < i2);
        setLength(i3);
        int iWrapPosition = wrapPosition(this.last.position + 4 + this.last.length);
        if (iWrapPosition < this.first.position) {
            java.nio.channels.FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            long j = iWrapPosition - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new java.lang.AssertionError("Copied insufficient number of bytes!");
            }
        }
        if (this.last.position < this.first.position) {
            int i4 = (this.fileLength + this.last.position) - 16;
            writeHeader(i3, this.elementCount, this.first.position, i4);
            this.last = new io.fabric.sdk.android.services.common.QueueFile.Element(i4, this.last.length);
        } else {
            writeHeader(i3, this.elementCount, this.first.position, this.last.position);
        }
        this.fileLength = i3;
    }

    private void setLength(int i) throws java.io.IOException {
        this.raf.setLength(i);
        this.raf.getChannel().force(true);
    }

    public synchronized byte[] peek() throws java.io.IOException {
        if (isEmpty()) {
            return null;
        }
        int i = this.first.length;
        byte[] bArr = new byte[i];
        ringRead(this.first.position + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void peek(io.fabric.sdk.android.services.common.QueueFile.ElementReader elementReader) throws java.io.IOException {
        if (this.elementCount > 0) {
            elementReader.read(new io.fabric.sdk.android.services.common.QueueFile.ElementInputStream(this.first), this.first.length);
        }
    }

    public synchronized void forEach(io.fabric.sdk.android.services.common.QueueFile.ElementReader elementReader) throws java.io.IOException {
        int iWrapPosition = this.first.position;
        for (int i = 0; i < this.elementCount; i++) {
            io.fabric.sdk.android.services.common.QueueFile.Element element = readElement(iWrapPosition);
            elementReader.read(new io.fabric.sdk.android.services.common.QueueFile.ElementInputStream(element), element.length);
            iWrapPosition = wrapPosition(element.position + 4 + element.length);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T nonNull(T t, java.lang.String str) {
        java.util.Objects.requireNonNull(t, str);
        return t;
    }

    private final class ElementInputStream extends java.io.InputStream {
        private int position;
        private int remaining;

        private ElementInputStream(io.fabric.sdk.android.services.common.QueueFile.Element element) {
            this.position = io.fabric.sdk.android.services.common.QueueFile.this.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            io.fabric.sdk.android.services.common.QueueFile.nonNull(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new java.lang.ArrayIndexOutOfBoundsException();
            }
            int i3 = this.remaining;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            io.fabric.sdk.android.services.common.QueueFile.this.ringRead(this.position, bArr, i, i2);
            this.position = io.fabric.sdk.android.services.common.QueueFile.this.wrapPosition(this.position + i2);
            this.remaining -= i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.remaining == 0) {
                return -1;
            }
            io.fabric.sdk.android.services.common.QueueFile.this.raf.seek(this.position);
            int i = io.fabric.sdk.android.services.common.QueueFile.this.raf.read();
            this.position = io.fabric.sdk.android.services.common.QueueFile.this.wrapPosition(this.position + 1);
            this.remaining--;
            return i;
        }
    }

    public synchronized int size() {
        return this.elementCount;
    }

    public synchronized void remove() throws java.io.IOException {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        if (this.elementCount == 1) {
            clear();
        } else {
            int iWrapPosition = wrapPosition(this.first.position + 4 + this.first.length);
            ringRead(iWrapPosition, this.buffer, 0, 4);
            int i = readInt(this.buffer, 0);
            writeHeader(this.fileLength, this.elementCount - 1, iWrapPosition, this.last.position);
            this.elementCount--;
            this.first = new io.fabric.sdk.android.services.common.QueueFile.Element(iWrapPosition, i);
        }
    }

    public synchronized void clear() throws java.io.IOException {
        writeHeader(4096, 0, 0, 0);
        this.elementCount = 0;
        this.first = io.fabric.sdk.android.services.common.QueueFile.Element.NULL;
        this.last = io.fabric.sdk.android.services.common.QueueFile.Element.NULL;
        if (this.fileLength > 4096) {
            setLength(4096);
        }
        this.fileLength = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
        this.raf.close();
    }

    public boolean hasSpaceFor(int i, int i2) {
        return (usedBytes() + 4) + i <= i2;
    }

    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.fileLength);
        sb.append(", size=");
        sb.append(this.elementCount);
        sb.append(", first=");
        sb.append(this.first);
        sb.append(", last=");
        sb.append(this.last);
        sb.append(", element lengths=[");
        try {
            forEach(new io.fabric.sdk.android.services.common.QueueFile.ElementReader() { // from class: io.fabric.sdk.android.services.common.QueueFile.1
                boolean first = true;

                @Override // io.fabric.sdk.android.services.common.QueueFile.ElementReader
                public void read(java.io.InputStream inputStream, int i) throws java.io.IOException {
                    if (this.first) {
                        this.first = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(i);
                }
            });
        } catch (java.io.IOException e) {
            LOGGER.log(java.util.logging.Level.WARNING, "read error", (java.lang.Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }

    static class Element {
        static final int HEADER_LENGTH = 4;
        static final io.fabric.sdk.android.services.common.QueueFile.Element NULL = new io.fabric.sdk.android.services.common.QueueFile.Element(0, 0);
        final int length;
        final int position;

        Element(int i, int i2) {
            this.position = i;
            this.length = i2;
        }

        public java.lang.String toString() {
            return getClass().getSimpleName() + "[position = " + this.position + ", length = " + this.length + "]";
        }
    }
}
