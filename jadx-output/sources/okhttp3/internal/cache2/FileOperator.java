package okhttp3.internal.cache2;

/* JADX INFO: loaded from: classes2.dex */
final class FileOperator {
    private final java.nio.channels.FileChannel fileChannel;

    FileOperator(java.nio.channels.FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void write(long j, okio.Buffer buffer, long j2) throws java.io.IOException {
        if (j2 < 0 || j2 > buffer.size()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        long j3 = j;
        long j4 = j2;
        while (j4 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(buffer, j3, j4);
            j3 += jTransferFrom;
            j4 -= jTransferFrom;
        }
    }

    public void read(long j, okio.Buffer buffer, long j2) throws java.io.IOException {
        if (j2 < 0) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j, j2, buffer);
            j += jTransferTo;
            j2 -= jTransferTo;
        }
    }
}
