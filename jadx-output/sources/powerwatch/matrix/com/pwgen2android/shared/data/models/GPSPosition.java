package powerwatch.matrix.com.pwgen2android.shared.data.models;

/* JADX INFO: compiled from: ActivityPeriodsModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "", "longitude", "", "latitude", "altitude", "elevation", "timestamp", "", "(DDDDJ)V", "getAltitude", "()D", "setAltitude", "(D)V", "getElevation", "setElevation", "getLatitude", "setLatitude", "getLongitude", "setLongitude", "getTimestamp", "()J", "setTimestamp", "(J)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GPSPosition {
    private double altitude;
    private double elevation;
    private double latitude;
    private double longitude;
    private long timestamp;

    public GPSPosition() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0L, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition copy(double longitude, double latitude, double altitude, double elevation, long timestamp) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition(longitude, latitude, altitude, elevation, timestamp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.longitude), (java.lang.Object) java.lang.Double.valueOf(gPSPosition.longitude)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.latitude), (java.lang.Object) java.lang.Double.valueOf(gPSPosition.latitude)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.altitude), (java.lang.Object) java.lang.Double.valueOf(gPSPosition.altitude)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.elevation), (java.lang.Object) java.lang.Double.valueOf(gPSPosition.elevation)) && this.timestamp == gPSPosition.timestamp;
    }

    public int hashCode() {
        return (((((((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.longitude) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.latitude)) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.altitude)) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.elevation)) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.timestamp);
    }

    public java.lang.String toString() {
        return "GPSPosition(longitude=" + this.longitude + ", latitude=" + this.latitude + ", altitude=" + this.altitude + ", elevation=" + this.elevation + ", timestamp=" + this.timestamp + ')';
    }

    public GPSPosition(double d, double d2, double d3, double d4, long j) {
        this.longitude = d;
        this.latitude = d2;
        this.altitude = d3;
        this.elevation = d4;
        this.timestamp = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GPSPosition(double d, double d2, double d3, double d4, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        double d5 = (i & 1) != 0 ? 0.0d : d;
        double d6 = (i & 2) != 0 ? 0.0d : d2;
        double d7 = (i & 4) == 0 ? d3 : 0.0d;
        this(d5, d6, d7, (i & 8) != 0 ? d7 : d4, (i & 16) != 0 ? 0L : j);
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final void setAltitude(double d) {
        this.altitude = d;
    }

    public final double getElevation() {
        return this.elevation;
    }

    public final void setElevation(double d) {
        this.elevation = d;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }
}
