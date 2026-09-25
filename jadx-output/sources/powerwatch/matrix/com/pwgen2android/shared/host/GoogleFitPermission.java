package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: AppPermissions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/GoogleFitPermission;", "", "googleFitController", "Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;", "(Lpowerwatch/matrix/com/pwgen2android/googlefit/GoogleFitController;)V", "getCurrentPermissionState", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class GoogleFitPermission {
    private final powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController;

    public GoogleFitPermission(powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitController googleFitController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleFitController, "googleFitController");
        this.googleFitController = googleFitController;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.AppPermission getCurrentPermissionState() {
        if (this.googleFitController.hasGooglePermissions()) {
            if (this.googleFitController.hasPermissions()) {
                return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.GoogleFit.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOn.INSTANCE.getState());
            }
            return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.GoogleFit.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOff.INSTANCE.getState());
        }
        return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.GoogleFit.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateUndefined.INSTANCE.getState());
    }
}
