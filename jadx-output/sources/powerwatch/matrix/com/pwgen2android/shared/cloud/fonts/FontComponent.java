package powerwatch.matrix.com.pwgen2android.shared.cloud.fonts;

/* JADX INFO: compiled from: FontUpdateInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;", "", "type", "", "timestamp", "", "version", "downloadURL", "(Ljava/lang/String;JJLjava/lang/String;)V", "getDownloadURL", "()Ljava/lang/String;", "getTimestamp", "()J", "getType", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FontComponent {

    @com.google.gson.annotations.SerializedName("downloadURL")
    private final java.lang.String downloadURL;

    @com.google.gson.annotations.SerializedName("timestamp")
    private final long timestamp;

    @com.google.gson.annotations.SerializedName("type")
    private final java.lang.String type;

    @com.google.gson.annotations.SerializedName("version")
    private final long version;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent fontComponent, java.lang.String str, long j, long j2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fontComponent.type;
        }
        if ((i & 2) != 0) {
            j = fontComponent.timestamp;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = fontComponent.version;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            str2 = fontComponent.downloadURL;
        }
        return fontComponent.copy(str, j3, j4, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getDownloadURL() {
        return this.downloadURL;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent copy(java.lang.String type, long timestamp, long version, java.lang.String downloadURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent(type, timestamp, version, downloadURL);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent fontComponent = (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, fontComponent.type) && this.timestamp == fontComponent.timestamp && this.version == fontComponent.version && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadURL, fontComponent.downloadURL);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.timestamp)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.version)) * 31) + this.downloadURL.hashCode();
    }

    public java.lang.String toString() {
        return "FontComponent(type=" + this.type + ", timestamp=" + this.timestamp + ", version=" + this.version + ", downloadURL=" + this.downloadURL + ')';
    }

    public FontComponent(java.lang.String type, long j, long j2, java.lang.String downloadURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadURL, "downloadURL");
        this.type = type;
        this.timestamp = j;
        this.version = j2;
        this.downloadURL = downloadURL;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final long getVersion() {
        return this.version;
    }

    public final java.lang.String getDownloadURL() {
        return this.downloadURL;
    }
}
