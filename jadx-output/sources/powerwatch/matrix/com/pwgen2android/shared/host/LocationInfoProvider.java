package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: LocationInfoProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b0\u0007H&J\u001c\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b0\u0007H&J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0014H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "", "isProviderEnabled", "Lio/reactivex/Observable;", "", "()Lio/reactivex/Observable;", "getLastKnownLocation", "Lio/reactivex/Single;", "Lkotlin/Pair;", "Landroid/location/Location;", "getLastStoredLocation", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "isLocationValid", "gpsPosition", "showDialog", "", "activityContext", "Landroid/content/Context;", "showDialogForLocation", "updateLocationInternal", "Lio/reactivex/Completable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface LocationInfoProvider {
    io.reactivex.Single<kotlin.Pair<java.lang.Boolean, android.location.Location>> getLastKnownLocation();

    io.reactivex.Single<kotlin.Pair<java.lang.Boolean, powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>> getLastStoredLocation();

    boolean isLocationValid(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition);

    io.reactivex.Observable<java.lang.Boolean> isProviderEnabled();

    void showDialog(android.content.Context activityContext);

    void showDialogForLocation(android.content.Context activityContext);

    io.reactivex.Completable updateLocationInternal();
}
