package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003JM\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010*\u001a\u00020\u0003J\t\u0010+\u001a\u00020\bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006-"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;", "", "uid", "", "firmwareVersion", "serialNumber", "battery", "pid", "", "disTableVersion", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;)V", "getBattery", "()Ljava/lang/String;", "setBattery", "(Ljava/lang/String;)V", "getDisTableVersion", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;", "setDisTableVersion", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;)V", "getFirmwareVersion", "setFirmwareVersion", "getProtocolVersion", "getGetProtocolVersion", "()I", "getPid", "setPid", "(I)V", "getSerialNumber", "setSerialNumber", "getUid", "setUid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "formatDISTable", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WatchDataInfo {
    private java.lang.String battery;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion disTableVersion;
    private java.lang.String firmwareVersion;
    private int pid;
    private java.lang.String serialNumber;
    private java.lang.String uid;

    public WatchDataInfo() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo watchDataInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = watchDataInfo.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = watchDataInfo.firmwareVersion;
        }
        java.lang.String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = watchDataInfo.serialNumber;
        }
        java.lang.String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = watchDataInfo.battery;
        }
        java.lang.String str7 = str4;
        if ((i2 & 16) != 0) {
            i = watchDataInfo.pid;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            dISTableVersion = watchDataInfo.disTableVersion;
        }
        return watchDataInfo.copy(str, str5, str6, str7, i3, dISTableVersion);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getBattery() {
        return this.battery;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion getDisTableVersion() {
        return this.disTableVersion;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo copy(java.lang.String uid, java.lang.String firmwareVersion, java.lang.String serialNumber, java.lang.String battery, int pid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion disTableVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(uid, firmwareVersion, serialNumber, battery, pid, disTableVersion);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo watchDataInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.uid, watchDataInfo.uid) && kotlin.jvm.internal.Intrinsics.areEqual(this.firmwareVersion, watchDataInfo.firmwareVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.serialNumber, watchDataInfo.serialNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.battery, watchDataInfo.battery) && this.pid == watchDataInfo.pid && kotlin.jvm.internal.Intrinsics.areEqual(this.disTableVersion, watchDataInfo.disTableVersion);
    }

    public int hashCode() {
        int iHashCode = this.uid.hashCode() * 31;
        java.lang.String str = this.firmwareVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.serialNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.battery;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.pid) * 31;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion = this.disTableVersion;
        return iHashCode4 + (dISTableVersion != null ? dISTableVersion.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WatchDataInfo(uid=" + this.uid + ", firmwareVersion=" + ((java.lang.Object) this.firmwareVersion) + ", serialNumber=" + ((java.lang.Object) this.serialNumber) + ", battery=" + ((java.lang.Object) this.battery) + ", pid=" + this.pid + ", disTableVersion=" + this.disTableVersion + ')';
    }

    public WatchDataInfo(java.lang.String uid, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        this.uid = uid;
        this.firmwareVersion = str;
        this.serialNumber = str2;
        this.battery = str3;
        this.pid = i;
        this.disTableVersion = dISTableVersion;
    }

    public /* synthetic */ WatchDataInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? 3 : i, (i2 & 32) != 0 ? null : dISTableVersion);
    }

    public final java.lang.String getUid() {
        return this.uid;
    }

    public final void setUid(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final void setFirmwareVersion(java.lang.String str) {
        this.firmwareVersion = str;
    }

    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    public final void setSerialNumber(java.lang.String str) {
        this.serialNumber = str;
    }

    public final java.lang.String getBattery() {
        return this.battery;
    }

    public final void setBattery(java.lang.String str) {
        this.battery = str;
    }

    public final int getPid() {
        return this.pid;
    }

    public final void setPid(int i) {
        this.pid = i;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion getDisTableVersion() {
        return this.disTableVersion;
    }

    public final void setDisTableVersion(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion) {
        this.disTableVersion = dISTableVersion;
    }

    public final java.lang.String formatDISTable() {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion = this.disTableVersion;
        if (dISTableVersion == null) {
            return "DIS not supported!";
        }
        return "DIS Table: \notaVersion - " + ((int) dISTableVersion.getOtaVersion()) + ", mtpVersion - " + ((int) dISTableVersion.getMtpVersion()) + ", disVersion - " + ((int) dISTableVersion.getDisVersion()) + ", expirationTime - " + dISTableVersion.getTimestamp() + "\nsections - " + dISTableVersion.getSections();
    }

    public final int getGetProtocolVersion() {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion dISTableVersion = this.disTableVersion;
        if (dISTableVersion == null) {
            return 1;
        }
        return dISTableVersion.getMtpVersion();
    }
}
