package powerwatch.matrix.com.pwgen2android.main.appupdate;

/* JADX INFO: compiled from: AppUpdateController.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;", "", "status", "", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "(Ljava/lang/String;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "getStatus", "()Ljava/lang/String;", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "Available", "NotAvailable", "Running", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Available;", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class UpdateState {
    private final java.lang.String status;
    private final com.google.android.play.core.appupdate.AppUpdateInfo updateInfo;

    public /* synthetic */ UpdateState(java.lang.String str, com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, appUpdateInfo);
    }

    /* JADX INFO: compiled from: AppUpdateController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Available;", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Available extends powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(com.google.android.play.core.appupdate.AppUpdateInfo updateInfo) {
            super("AVAILABLE", updateInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        }
    }

    private UpdateState(java.lang.String str, com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo) {
        this.status = str;
        this.updateInfo = appUpdateInfo;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final com.google.android.play.core.appupdate.AppUpdateInfo getUpdateInfo() {
        return this.updateInfo;
    }

    /* JADX INFO: compiled from: AppUpdateController.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$NotAvailable;", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotAvailable extends powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState {
        /* JADX WARN: Multi-variable type inference failed */
        public NotAvailable() {
            super("NOT_AVAILABLE", null, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: AppUpdateController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState$Running;", "Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "(Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Running extends powerwatch.matrix.com.pwgen2android.main.appupdate.UpdateState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Running(com.google.android.play.core.appupdate.AppUpdateInfo updateInfo) {
            super("RUNNING", updateInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
        }
    }
}
