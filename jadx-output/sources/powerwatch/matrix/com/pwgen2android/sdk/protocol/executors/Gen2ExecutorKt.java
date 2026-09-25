package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToBytes", "", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class Gen2ExecutorKt {
    public static final byte[] mapToBytes(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(0, str.length() - 1, 2);
        if (progressionLastElement >= 0) {
            while (true) {
                int i2 = i + 2;
                char cCharAt = str.charAt(i);
                arrayList.add(java.lang.Byte.valueOf((byte) java.lang.Integer.parseInt(java.lang.String.valueOf(cCharAt) + java.lang.String.valueOf(str.charAt(i + 1)), 16)));
                if (i == progressionLastElement) {
                    break;
                }
                i = i2;
            }
        }
        return kotlin.collections.CollectionsKt.toByteArray(arrayList);
    }
}
