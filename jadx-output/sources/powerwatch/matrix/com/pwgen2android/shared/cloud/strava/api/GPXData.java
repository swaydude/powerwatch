package powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api;

/* JADX INFO: compiled from: GPXXMLWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXData;", "", "points", "", "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/strava/api/GPXPoint;", "(Ljava/util/List;)V", "getPoints", "()Ljava/util/List;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class GPXData {
    private final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint> points;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData copy$default(powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData gPXData, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = gPXData.points;
        }
        return gPXData.copy(list);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint> component1() {
        return this.points;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData copy(java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint> points) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "points");
        return new powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData(points);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData) && kotlin.jvm.internal.Intrinsics.areEqual(this.points, ((powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXData) other).points);
    }

    public int hashCode() {
        return this.points.hashCode();
    }

    public java.lang.String toString() {
        return "GPXData(points=" + this.points + ')';
    }

    public GPXData(java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint> points) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "points");
        this.points = points;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.cloud.strava.api.GPXPoint> getPoints() {
        return this.points;
    }
}
