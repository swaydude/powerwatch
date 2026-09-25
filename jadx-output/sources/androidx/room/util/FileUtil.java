package androidx.room.util;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil {
    public static void copy(java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.channels.FileChannel fileChannel) throws java.io.IOException {
        try {
            if (android.os.Build.VERSION.SDK_INT > 23) {
                fileChannel.transferFrom(readableByteChannel, 0L, kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
            } else {
                java.io.InputStream inputStreamNewInputStream = java.nio.channels.Channels.newInputStream(readableByteChannel);
                java.io.OutputStream outputStreamNewOutputStream = java.nio.channels.Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamNewInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i);
                    }
                }
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }

    private FileUtil() {
    }
}
