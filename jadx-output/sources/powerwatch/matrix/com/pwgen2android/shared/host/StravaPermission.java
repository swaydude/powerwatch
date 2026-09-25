package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: AppPermissions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/StravaPermission;", "", "stravaController", "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;", "(Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V", "getCurrentPermissionState", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StravaPermission {
    private final powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController;

    public StravaPermission(powerwatch.matrix.com.pwgen2android.strava.StravaController stravaController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stravaController, "stravaController");
        this.stravaController = stravaController;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.AppPermission getCurrentPermissionState() {
        return this.stravaController.hasAuthorize() ? new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.Strava.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOn.INSTANCE.getState()) : new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.Strava.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOff.INSTANCE.getState());
    }
}
