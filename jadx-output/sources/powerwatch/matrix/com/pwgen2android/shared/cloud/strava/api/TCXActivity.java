package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api;

/* JADX INFO: compiled from: TCXWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003Js\u0010.\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\rHÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXActivity;", "", "points", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/TCXPoint;", "distance", "", "type", "", "startTime", "", "endTime", "activeCalories", "", "bmrCalories", "avgHeartRate", "maxHeartRate", "lastDistance", "(Ljava/util/List;FLjava/lang/String;JJIIIIF)V", "getActiveCalories", "()I", "getAvgHeartRate", "getBmrCalories", "getDistance", "()F", "getEndTime", "()J", "getLastDistance", "setLastDistance", "(F)V", "getMaxHeartRate", "getPoints", "()Ljava/util/List;", "getStartTime", "getType", "()Ljava/lang/String;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TCXActivity {
    private final int activeCalories;
    private final int avgHeartRate;
    private final int bmrCalories;
    private final float distance;
    private final long endTime;
    private float lastDistance;
    private final int maxHeartRate;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint> points;
    private final long startTime;
    private final java.lang.String type;

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint> component1() {
        return this.points;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getLastDistance() {
        return this.lastDistance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getActiveCalories() {
        return this.activeCalories;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBmrCalories() {
        return this.bmrCalories;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity copy(java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint> points, float distance, java.lang.String type, long startTime, long endTime, int activeCalories, int bmrCalories, int avgHeartRate, int maxHeartRate, float lastDistance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "points");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity(points, distance, type, startTime, endTime, activeCalories, bmrCalories, avgHeartRate, maxHeartRate, lastDistance);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity tCXActivity = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXActivity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.points, tCXActivity.points) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.distance), (java.lang.Object) java.lang.Float.valueOf(tCXActivity.distance)) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, tCXActivity.type) && this.startTime == tCXActivity.startTime && this.endTime == tCXActivity.endTime && this.activeCalories == tCXActivity.activeCalories && this.bmrCalories == tCXActivity.bmrCalories && this.avgHeartRate == tCXActivity.avgHeartRate && this.maxHeartRate == tCXActivity.maxHeartRate && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.lastDistance), (java.lang.Object) java.lang.Float.valueOf(tCXActivity.lastDistance));
    }

    public int hashCode() {
        return (((((((((((((((((this.points.hashCode() * 31) + java.lang.Float.floatToIntBits(this.distance)) * 31) + this.type.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.startTime)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.endTime)) * 31) + this.activeCalories) * 31) + this.bmrCalories) * 31) + this.avgHeartRate) * 31) + this.maxHeartRate) * 31) + java.lang.Float.floatToIntBits(this.lastDistance);
    }

    public java.lang.String toString() {
        return "TCXActivity(points=" + this.points + ", distance=" + this.distance + ", type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", activeCalories=" + this.activeCalories + ", bmrCalories=" + this.bmrCalories + ", avgHeartRate=" + this.avgHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", lastDistance=" + this.lastDistance + ')';
    }

    public TCXActivity(java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint> points, float f, java.lang.String type, long j, long j2, int i, int i2, int i3, int i4, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "points");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        this.points = points;
        this.distance = f;
        this.type = type;
        this.startTime = j;
        this.endTime = j2;
        this.activeCalories = i;
        this.bmrCalories = i2;
        this.avgHeartRate = i3;
        this.maxHeartRate = i4;
        this.lastDistance = f2;
    }

    public /* synthetic */ TCXActivity(java.util.List list, float f, java.lang.String str, long j, long j2, int i, int i2, int i3, int i4, float f2, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, f, str, j, j2, i, i2, i3, i4, (i5 & 512) != 0 ? 0.0f : f2);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.TCXPoint> getPoints() {
        return this.points;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getActiveCalories() {
        return this.activeCalories;
    }

    public final int getBmrCalories() {
        return this.bmrCalories;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final float getLastDistance() {
        return this.lastDistance;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final void setLastDistance(float f) {
        this.lastDistance = f;
    }
}
