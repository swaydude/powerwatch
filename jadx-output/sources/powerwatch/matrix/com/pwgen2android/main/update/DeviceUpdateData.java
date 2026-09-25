package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/DeviceUpdateData;", "Ljava/io/Serializable;", "uid", "", "firmwareVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirmwareVersion", "()Ljava/lang/String;", "getUid", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DeviceUpdateData implements java.io.Serializable {
    private final java.lang.String firmwareVersion;
    private final java.lang.String uid;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceUpdateData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData copy$default(powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceUpdateData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceUpdateData.uid;
        }
        if ((i & 2) != 0) {
            str2 = deviceUpdateData.firmwareVersion;
        }
        return deviceUpdateData.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData copy(java.lang.String uid, java.lang.String firmwareVersion) {
        return new powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData(uid, firmwareVersion);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData deviceUpdateData = (powerwatch.matrix.com.pwgen2android.main.update.DeviceUpdateData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uid, deviceUpdateData.uid) && kotlin.jvm.internal.Intrinsics.areEqual(this.firmwareVersion, deviceUpdateData.firmwareVersion);
    }

    public int hashCode() {
        java.lang.String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.firmwareVersion;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DeviceUpdateData(uid=" + ((java.lang.Object) this.uid) + ", firmwareVersion=" + ((java.lang.Object) this.firmwareVersion) + ')';
    }

    public DeviceUpdateData(java.lang.String str, java.lang.String str2) {
        this.uid = str;
        this.firmwareVersion = str2;
    }

    public /* synthetic */ DeviceUpdateData(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final java.lang.String getUid() {
        return this.uid;
    }
}
