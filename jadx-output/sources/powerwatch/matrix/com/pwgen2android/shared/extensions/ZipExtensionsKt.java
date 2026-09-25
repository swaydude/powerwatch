package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: ZipExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"toZip", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ZipExtensionsKt {
    public static final byte[] toZip(byte[] bArr) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(byteArrayOutputStream);
        zipOutputStream.putNextEntry(new java.util.zip.ZipEntry("log.txt"));
        byte[] bArr2 = new byte[100];
        int i = 0;
        while (i != -1 && (i = byteArrayInputStream.read(bArr2, 0, 100)) != -1) {
            zipOutputStream.write(bArr2, 0, i);
        }
        byteArrayInputStream.close();
        zipOutputStream.closeEntry();
        zipOutputStream.close();
        zipOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
        return byteArray;
    }
}
