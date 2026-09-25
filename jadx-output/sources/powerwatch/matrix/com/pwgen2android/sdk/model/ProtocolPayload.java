package powerwatch.matrix.com.pwgen2android.sdk.model;

/* JADX INFO: compiled from: Entities.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;", "", "data", "", "([B)V", "getData", "()[B", "setData", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ProtocolPayload {
    private byte[] data;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload copy$default(powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload protocolPayload, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = protocolPayload.data;
        }
        return protocolPayload.copy(bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload copy(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(data);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload) other).data);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.data);
    }

    public java.lang.String toString() {
        return "ProtocolPayload(data=" + java.util.Arrays.toString(this.data) + ')';
    }

    public ProtocolPayload(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final void setData(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.data = bArr;
    }
}
