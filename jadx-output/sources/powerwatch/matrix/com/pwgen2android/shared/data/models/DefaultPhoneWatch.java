package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/DefaultPhoneWatch;", "", "uid", "", "bluetoothAddress", "", "serialNumber", "(JLjava/lang/String;Ljava/lang/String;)V", "getBluetoothAddress", "()Ljava/lang/String;", "getSerialNumber", "getUid", "()J", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DefaultPhoneWatch {
    private final java.lang.String bluetoothAddress;
    private final java.lang.String serialNumber;
    private final long uid;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch copy$default(powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch defaultPhoneWatch, long j, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = defaultPhoneWatch.uid;
        }
        if ((i & 2) != 0) {
            str = defaultPhoneWatch.bluetoothAddress;
        }
        if ((i & 4) != 0) {
            str2 = defaultPhoneWatch.serialNumber;
        }
        return defaultPhoneWatch.copy(j, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getBluetoothAddress() {
        return this.bluetoothAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch copy(long uid, java.lang.String bluetoothAddress, java.lang.String serialNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAddress, "bluetoothAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch(uid, bluetoothAddress, serialNumber);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch defaultPhoneWatch = (powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch) other;
        return this.uid == defaultPhoneWatch.uid && kotlin.jvm.internal.Intrinsics.areEqual(this.bluetoothAddress, defaultPhoneWatch.bluetoothAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.serialNumber, defaultPhoneWatch.serialNumber);
    }

    public int hashCode() {
        return (((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.uid) * 31) + this.bluetoothAddress.hashCode()) * 31) + this.serialNumber.hashCode();
    }

    public java.lang.String toString() {
        return "DefaultPhoneWatch(uid=" + this.uid + ", bluetoothAddress=" + this.bluetoothAddress + ", serialNumber=" + this.serialNumber + ')';
    }

    public DefaultPhoneWatch(long j, java.lang.String bluetoothAddress, java.lang.String serialNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAddress, "bluetoothAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.uid = j;
        this.bluetoothAddress = bluetoothAddress;
        this.serialNumber = serialNumber;
    }

    public /* synthetic */ DefaultPhoneWatch(long j, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2);
    }

    public final java.lang.String getBluetoothAddress() {
        return this.bluetoothAddress;
    }

    public final long getUid() {
        return this.uid;
    }

    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }
}
