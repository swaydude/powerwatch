package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: SettingsDataParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"extractInt", "", "data", "", "", "signed", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class SettingsDataParserKt {
    static /* synthetic */ int extractInt$default(java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return extractInt(list, z);
    }

    private static final int extractInt(java.util.List<java.lang.Byte> list, boolean z) {
        if (list.isEmpty()) {
            return 0;
        }
        java.nio.ByteBuffer byteBufferPut = java.nio.ByteBuffer.allocate(4).put((byte) 0).put(kotlin.collections.CollectionsKt.toByteArray(list));
        byteBufferPut.rewind();
        double dPow = byteBufferPut.getInt();
        if (z && dPow > java.lang.Math.pow(2.0d, 23) - ((double) 1)) {
            dPow -= java.lang.Math.pow(2.0d, 24.0d);
        }
        return (int) dPow;
    }
}
