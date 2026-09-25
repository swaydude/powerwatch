package powerwatch.matrix.com.pwgen2android.shared.ui;

/* JADX INFO: compiled from: RunningAnimator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J[\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\rHÖ\u0001J\t\u0010:\u001a\u00020;HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006<"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/RunningAnimation;", "", "lastLocation", "Landroid/location/Location;", "nextLocation", "distance", "", "step", "distanceUntil", "", "heartRate", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "elevation", "", "timestamp", "", "(Landroid/location/Location;Landroid/location/Location;DDFLpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;IJ)V", "getDistance", "()D", "setDistance", "(D)V", "getDistanceUntil", "()F", "setDistanceUntil", "(F)V", "getElevation", "()I", "setElevation", "(I)V", "getHeartRate", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "setHeartRate", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V", "getLastLocation", "()Landroid/location/Location;", "setLastLocation", "(Landroid/location/Location;)V", "getNextLocation", "setNextLocation", "getStep", "setStep", "getTimestamp", "()J", "setTimestamp", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RunningAnimation {
    private double distance;
    private float distanceUntil;
    private int elevation;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate;
    private android.location.Location lastLocation;
    private android.location.Location nextLocation;
    private double step;
    private long timestamp;

    public RunningAnimation() {
        this(null, null, 0.0d, 0.0d, 0.0f, null, 0, 0L, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final android.location.Location getLastLocation() {
        return this.lastLocation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final android.location.Location getNextLocation() {
        return this.nextLocation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getDistanceUntil() {
        return this.distanceUntil;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation copy(android.location.Location lastLocation, android.location.Location nextLocation, double distance, double step, float distanceUntil, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, int elevation, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextLocation, "nextLocation");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation(lastLocation, nextLocation, distance, step, distanceUntil, heartRate, elevation, timestamp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation runningAnimation = (powerwatch.matrix.com.pwgen2android.shared.ui.RunningAnimation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.lastLocation, runningAnimation.lastLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextLocation, runningAnimation.nextLocation) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.distance), (java.lang.Object) java.lang.Double.valueOf(runningAnimation.distance)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.step), (java.lang.Object) java.lang.Double.valueOf(runningAnimation.step)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.distanceUntil), (java.lang.Object) java.lang.Float.valueOf(runningAnimation.distanceUntil)) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartRate, runningAnimation.heartRate) && this.elevation == runningAnimation.elevation && this.timestamp == runningAnimation.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.lastLocation.hashCode() * 31) + this.nextLocation.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.distance)) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.step)) * 31) + java.lang.Float.floatToIntBits(this.distanceUntil)) * 31;
        powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate = this.heartRate;
        return ((((iHashCode + (heartRate == null ? 0 : heartRate.hashCode())) * 31) + this.elevation) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.timestamp);
    }

    public java.lang.String toString() {
        return "RunningAnimation(lastLocation=" + this.lastLocation + ", nextLocation=" + this.nextLocation + ", distance=" + this.distance + ", step=" + this.step + ", distanceUntil=" + this.distanceUntil + ", heartRate=" + this.heartRate + ", elevation=" + this.elevation + ", timestamp=" + this.timestamp + ')';
    }

    public RunningAnimation(android.location.Location lastLocation, android.location.Location nextLocation, double d, double d2, float f, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastLocation, "lastLocation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextLocation, "nextLocation");
        this.lastLocation = lastLocation;
        this.nextLocation = nextLocation;
        this.distance = d;
        this.step = d2;
        this.distanceUntil = f;
        this.heartRate = heartRate;
        this.elevation = i;
        this.timestamp = j;
    }

    public /* synthetic */ RunningAnimation(android.location.Location location, android.location.Location location2, double d, double d2, float f, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, int i, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new android.location.Location("") : location, (i2 & 2) != 0 ? new android.location.Location("") : location2, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) == 0 ? d2 : 0.0d, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? null : heartRate, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? 0L : j);
    }

    public final android.location.Location getLastLocation() {
        return this.lastLocation;
    }

    public final void setLastLocation(android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "<set-?>");
        this.lastLocation = location;
    }

    public final android.location.Location getNextLocation() {
        return this.nextLocation;
    }

    public final void setNextLocation(android.location.Location location) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(location, "<set-?>");
        this.nextLocation = location;
    }

    public final double getDistance() {
        return this.distance;
    }

    public final void setDistance(double d) {
        this.distance = d;
    }

    public final double getStep() {
        return this.step;
    }

    public final void setStep(double d) {
        this.step = d;
    }

    public final float getDistanceUntil() {
        return this.distanceUntil;
    }

    public final void setDistanceUntil(float f) {
        this.distanceUntil = f;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate getHeartRate() {
        return this.heartRate;
    }

    public final void setHeartRate(powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate) {
        this.heartRate = heartRate;
    }

    public final int getElevation() {
        return this.elevation;
    }

    public final void setElevation(int i) {
        this.elevation = i;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
