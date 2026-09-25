package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: UserInfoCommands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001a\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"extractIntValue", "", "Ljava/nio/ByteBuffer;", "size", "radix", "extractLongValue", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class UserInfoCommandsKt {
    public static final int extractIntValue(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return java.lang.Integer.parseInt(new java.lang.String(bArr, kotlin.text.Charsets.UTF_8), kotlin.text.CharsKt.checkRadix(16));
    }

    public static final long extractLongValue(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return java.lang.Long.parseLong(new java.lang.String(bArr, kotlin.text.Charsets.UTF_8), kotlin.text.CharsKt.checkRadix(16));
    }
}
