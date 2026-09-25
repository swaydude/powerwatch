package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"compareCRC", "", "response", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class Gen2ComandsKt {
    public static final boolean compareCRC(byte[] response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        byte[] bArrCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(response, response.length - 4, response.length);
        byte[] bArrCopyOfRange2 = kotlin.collections.ArraysKt.copyOfRange(response, 4, response.length - 4);
        long j = ((long) java.nio.ByteBuffer.wrap(bArrCopyOfRange).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt()) & 4294967295L;
        java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        long jCalculateCRCVer1 = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.CRCCalculationUtilsKt.calculateCRCVer1(bArrCopyOfRange2);
        java.lang.System.out.println((java.lang.Object) ("\nCalculated CRC1: " + jCalculateCRCVer1 + "\ndiscovered CRCv: " + j));
        return j == jCalculateCRCVer1;
    }
}
