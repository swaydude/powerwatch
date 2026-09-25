package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api;

/* JADX INFO: compiled from: GPXXMLWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;", "", "lat", "", "long", "heartRate", "", "time", "", "(DDIJ)V", "getHeartRate", "()I", "getLat", "()D", "getLong", "getTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GPXPoint {
    private final int heartRate;
    private final double lat;
    private final double long;
    private final long time;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLong() {
        return this.long;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint copy(double lat, double d, int heartRate, long time) {
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint(lat, d, heartRate, time);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint gPXPoint = (powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.lat), (java.lang.Object) java.lang.Double.valueOf(gPXPoint.lat)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.long), (java.lang.Object) java.lang.Double.valueOf(gPXPoint.long)) && this.heartRate == gPXPoint.heartRate && this.time == gPXPoint.time;
    }

    public int hashCode() {
        return (((((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.lat) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.long)) * 31) + this.heartRate) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.time);
    }

    public java.lang.String toString() {
        return "GPXPoint(lat=" + this.lat + ", long=" + this.long + ", heartRate=" + this.heartRate + ", time=" + this.time + ')';
    }

    public GPXPoint(double d, double d2, int i, long j) {
        this.lat = d;
        this.long = d2;
        this.heartRate = i;
        this.time = j;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLong() {
        return this.long;
    }

    public final long getTime() {
        return this.time;
    }
}
