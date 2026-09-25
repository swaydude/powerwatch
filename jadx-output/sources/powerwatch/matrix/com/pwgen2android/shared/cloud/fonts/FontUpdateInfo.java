package powerwatch.matrix.com.pwgen2android.shared.cloud.fonts;

/* JADX INFO: compiled from: FontUpdateInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontUpdateInfo;", "", "releaseDate", "", "createdAt", "components", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/fonts/FontComponent;", "(JJLjava/util/List;)V", "getComponents", "()Ljava/util/List;", "getCreatedAt", "()J", "getReleaseDate", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FontUpdateInfo {

    @com.google.gson.annotations.SerializedName("components")
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> components;

    @com.google.gson.annotations.SerializedName("createdAt")
    private final long createdAt;

    @com.google.gson.annotations.SerializedName("releaseDate")
    private final long releaseDate;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo fontUpdateInfo, long j, long j2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = fontUpdateInfo.releaseDate;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = fontUpdateInfo.createdAt;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            list = fontUpdateInfo.components;
        }
        return fontUpdateInfo.copy(j3, j4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getReleaseDate() {
        return this.releaseDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> component3() {
        return this.components;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo copy(long releaseDate, long createdAt, java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "components");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo(releaseDate, createdAt, components);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo fontUpdateInfo = (powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontUpdateInfo) other;
        return this.releaseDate == fontUpdateInfo.releaseDate && this.createdAt == fontUpdateInfo.createdAt && kotlin.jvm.internal.Intrinsics.areEqual(this.components, fontUpdateInfo.components);
    }

    public int hashCode() {
        return (((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.releaseDate) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.createdAt)) * 31) + this.components.hashCode();
    }

    public java.lang.String toString() {
        return "FontUpdateInfo(releaseDate=" + this.releaseDate + ", createdAt=" + this.createdAt + ", components=" + this.components + ')';
    }

    public FontUpdateInfo(long j, long j2, java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> components) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "components");
        this.releaseDate = j;
        this.createdAt = j2;
        this.components = components;
    }

    public final long getReleaseDate() {
        return this.releaseDate;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.fonts.FontComponent> getComponents() {
        return this.components;
    }
}
