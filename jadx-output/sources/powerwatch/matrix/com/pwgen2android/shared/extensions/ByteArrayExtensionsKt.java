package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: ByteArrayExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"copyRemainingData", "", "Ljava/nio/ByteBuffer;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ByteArrayExtensionsKt {
    public static final byte[] copyRemainingData(java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (!byteBuffer.hasRemaining()) {
            return new byte[0];
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}
