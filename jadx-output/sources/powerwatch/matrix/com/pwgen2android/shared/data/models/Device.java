package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: Device.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010)J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J~\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\bHÖ\u0001J\t\u0010=\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\u001d\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006>"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "", "uid", "", "serialNumber", "", "bluetoothAddress", "pid", "", "firmwareVersion", "productName", "shouldSync", "", "callNotification", "messageNotification", "activityGoalNotification", "alarmNotification", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)V", "getActivityGoalNotification", "()Z", "getAlarmNotification", "areAlarmsNotificationsEnabled", "getAreAlarmsNotificationsEnabled", "areCallsNotificationEnabled", "getAreCallsNotificationEnabled", "areGoalsNotificationEnabled", "getAreGoalsNotificationEnabled", "areMessagesNotificationEnabled", "getAreMessagesNotificationEnabled", "areNotificationSupported", "getAreNotificationSupported", "getBluetoothAddress", "()Ljava/lang/String;", "getCallNotification", "getFirmwareVersion", "getMessageNotification", "getPid", "()I", "getProductName", "getSerialNumber", "getShouldSync", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUid", "()J", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZ)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Device {
    private final boolean activityGoalNotification;
    private final boolean alarmNotification;

    @com.google.gson.annotations.SerializedName("uuid")
    private final java.lang.String bluetoothAddress;
    private final boolean callNotification;
    private final java.lang.String firmwareVersion;
    private final boolean messageNotification;
    private final int pid;
    private final java.lang.String productName;
    private final java.lang.String serialNumber;
    private final java.lang.Boolean shouldSync;
    private final long uid;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getActivityGoalNotification() {
        return this.activityGoalNotification;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getAlarmNotification() {
        return this.alarmNotification;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getBluetoothAddress() {
        return this.bluetoothAddress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.Boolean getShouldSync() {
        return this.shouldSync;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getCallNotification() {
        return this.callNotification;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getMessageNotification() {
        return this.messageNotification;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.Device copy(long uid, java.lang.String serialNumber, java.lang.String bluetoothAddress, int pid, java.lang.String firmwareVersion, java.lang.String productName, java.lang.Boolean shouldSync, boolean callNotification, boolean messageNotification, boolean activityGoalNotification, boolean alarmNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAddress, "bluetoothAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "productName");
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(uid, serialNumber, bluetoothAddress, pid, firmwareVersion, productName, shouldSync, callNotification, messageNotification, activityGoalNotification, alarmNotification);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.Device)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) other;
        return this.uid == device.uid && kotlin.jvm.internal.Intrinsics.areEqual(this.serialNumber, device.serialNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.bluetoothAddress, device.bluetoothAddress) && this.pid == device.pid && kotlin.jvm.internal.Intrinsics.areEqual(this.firmwareVersion, device.firmwareVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, device.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.shouldSync, device.shouldSync) && this.callNotification == device.callNotification && this.messageNotification == device.messageNotification && this.activityGoalNotification == device.activityGoalNotification && this.alarmNotification == device.alarmNotification;
    }

    public final boolean getAreNotificationSupported() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iM0 = ((((((((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.uid) * 31) + this.serialNumber.hashCode()) * 31) + this.bluetoothAddress.hashCode()) * 31) + this.pid) * 31) + this.firmwareVersion.hashCode()) * 31) + this.productName.hashCode()) * 31;
        java.lang.Boolean bool = this.shouldSync;
        int iHashCode = (iM0 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.callNotification;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.messageNotification;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.activityGoalNotification;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.alarmNotification;
        return i3 + (z4 ? 1 : z4);
    }

    public java.lang.String toString() {
        return "Device(uid=" + this.uid + ", serialNumber=" + this.serialNumber + ", bluetoothAddress=" + this.bluetoothAddress + ", pid=" + this.pid + ", firmwareVersion=" + this.firmwareVersion + ", productName=" + this.productName + ", shouldSync=" + this.shouldSync + ", callNotification=" + this.callNotification + ", messageNotification=" + this.messageNotification + ", activityGoalNotification=" + this.activityGoalNotification + ", alarmNotification=" + this.alarmNotification + ')';
    }

    public Device(long j, java.lang.String serialNumber, java.lang.String bluetoothAddress, int i, java.lang.String firmwareVersion, java.lang.String productName, java.lang.Boolean bool, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAddress, "bluetoothAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "productName");
        this.uid = j;
        this.serialNumber = serialNumber;
        this.bluetoothAddress = bluetoothAddress;
        this.pid = i;
        this.firmwareVersion = firmwareVersion;
        this.productName = productName;
        this.shouldSync = bool;
        this.callNotification = z;
        this.messageNotification = z2;
        this.activityGoalNotification = z3;
        this.alarmNotification = z4;
    }

    public /* synthetic */ Device(long j, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, str, str2, i, str3, str4, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? true : z2, (i2 & 512) != 0 ? true : z3, (i2 & 1024) != 0 ? true : z4);
    }

    public final long getUid() {
        return this.uid;
    }

    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    public final java.lang.String getBluetoothAddress() {
        return this.bluetoothAddress;
    }

    public final int getPid() {
        return this.pid;
    }

    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final java.lang.String getProductName() {
        return this.productName;
    }

    public final java.lang.Boolean getShouldSync() {
        return this.shouldSync;
    }

    public final boolean getCallNotification() {
        return this.callNotification;
    }

    public final boolean getMessageNotification() {
        return this.messageNotification;
    }

    public final boolean getActivityGoalNotification() {
        return this.activityGoalNotification;
    }

    public final boolean getAlarmNotification() {
        return this.alarmNotification;
    }

    public final boolean getAreCallsNotificationEnabled() {
        return this.callNotification;
    }

    public final boolean getAreMessagesNotificationEnabled() {
        return this.messageNotification;
    }

    public final boolean getAreGoalsNotificationEnabled() {
        return this.activityGoalNotification;
    }

    public final boolean getAreAlarmsNotificationsEnabled() {
        return this.alarmNotification;
    }
}
