package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u001bJ\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "Ljava/io/Serializable;", "version", "", "installedVersion", "releaseNotes", "downloadUrl", "pid", "", "releaseDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDownloadUrl", "()Ljava/lang/String;", "getInstalledVersion", "getPid", "()I", "getReleaseDate", "getReleaseNotes", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hasUpdate", "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FirmwareDisplayData implements java.io.Serializable {
    private final java.lang.String downloadUrl;
    private final java.lang.String installedVersion;
    private final int pid;
    private final java.lang.String releaseDate;
    private final java.lang.String releaseNotes;
    private final java.lang.String version;

    public FirmwareDisplayData() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData copy$default(powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = firmwareDisplayData.version;
        }
        if ((i2 & 2) != 0) {
            str2 = firmwareDisplayData.installedVersion;
        }
        java.lang.String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = firmwareDisplayData.releaseNotes;
        }
        java.lang.String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = firmwareDisplayData.downloadUrl;
        }
        java.lang.String str8 = str4;
        if ((i2 & 16) != 0) {
            i = firmwareDisplayData.pid;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = firmwareDisplayData.releaseDate;
        }
        return firmwareDisplayData.copy(str, str6, str7, str8, i3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getInstalledVersion() {
        return this.installedVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getReleaseNotes() {
        return this.releaseNotes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getReleaseDate() {
        return this.releaseDate;
    }

    public final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData copy(java.lang.String version, java.lang.String installedVersion, java.lang.String releaseNotes, java.lang.String downloadUrl, int pid, java.lang.String releaseDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installedVersion, "installedVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(releaseNotes, "releaseNotes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        return new powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData(version, installedVersion, releaseNotes, downloadUrl, pid, releaseDate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData = (powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, firmwareDisplayData.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.installedVersion, firmwareDisplayData.installedVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.releaseNotes, firmwareDisplayData.releaseNotes) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, firmwareDisplayData.downloadUrl) && this.pid == firmwareDisplayData.pid && kotlin.jvm.internal.Intrinsics.areEqual(this.releaseDate, firmwareDisplayData.releaseDate);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.version.hashCode() * 31) + this.installedVersion.hashCode()) * 31) + this.releaseNotes.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31) + this.pid) * 31;
        java.lang.String str = this.releaseDate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "FirmwareDisplayData(version=" + this.version + ", installedVersion=" + this.installedVersion + ", releaseNotes=" + this.releaseNotes + ", downloadUrl=" + this.downloadUrl + ", pid=" + this.pid + ", releaseDate=" + ((java.lang.Object) this.releaseDate) + ')';
    }

    public FirmwareDisplayData(java.lang.String version, java.lang.String installedVersion, java.lang.String releaseNotes, java.lang.String downloadUrl, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installedVersion, "installedVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(releaseNotes, "releaseNotes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        this.version = version;
        this.installedVersion = installedVersion;
        this.releaseNotes = releaseNotes;
        this.downloadUrl = downloadUrl;
        this.pid = i;
        this.releaseDate = str;
    }

    public /* synthetic */ FirmwareDisplayData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? "" : str5);
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String getInstalledVersion() {
        return this.installedVersion;
    }

    public final java.lang.String getReleaseNotes() {
        return this.releaseNotes;
    }

    public final java.lang.String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final int getPid() {
        return this.pid;
    }

    public final java.lang.String getReleaseDate() {
        return this.releaseDate;
    }

    public final boolean hasUpdate() {
        return this.version.compareTo(this.installedVersion) > 0;
    }
}
