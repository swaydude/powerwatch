package powerwatch.matrix.com.pwgen2android.setup.permissions;

/* JADX INFO: compiled from: PermissionConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "", "manifestPermission", "", "(Ljava/lang/String;)V", "getManifestPermission", "()Ljava/lang/String;", "Camera", "GoogleFitIntegration", io.fabric.sdk.android.services.network.HttpRequest.HEADER_LOCATION, "NotificationService", "StravaIntegration", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$Location;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$Camera;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$NotificationService;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$GoogleFitIntegration;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$StravaIntegration;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class AppPermission {
    private final java.lang.String manifestPermission;

    public /* synthetic */ AppPermission(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AppPermission(java.lang.String str) {
        this.manifestPermission = str;
    }

    public final java.lang.String getManifestPermission() {
        return this.manifestPermission;
    }

    /* JADX INFO: compiled from: PermissionConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$Location;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Location extends powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission {
        public static final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Location INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Location();

        private Location() {
            super("android.permission.ACCESS_COARSE_LOCATION", null);
        }
    }

    /* JADX INFO: compiled from: PermissionConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$Camera;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Camera extends powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission {
        public static final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Camera INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.Camera();

        private Camera() {
            super("android.permission.CAMERA", null);
        }
    }

    /* JADX INFO: compiled from: PermissionConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$NotificationService;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotificationService extends powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission {
        public static final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.NotificationService INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.NotificationService();

        private NotificationService() {
            super("", null);
        }
    }

    /* JADX INFO: compiled from: PermissionConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$GoogleFitIntegration;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GoogleFitIntegration extends powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission {
        public static final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.GoogleFitIntegration();

        private GoogleFitIntegration() {
            super("", null);
        }
    }

    /* JADX INFO: compiled from: PermissionConstants.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission$StravaIntegration;", "Lpowerwatch/matrix/com/pwgen2android/setup/permissions/AppPermission;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StravaIntegration extends powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission {
        public static final powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration INSTANCE = new powerwatch.matrix.com.pwgen2android.setup.permissions.AppPermission.StravaIntegration();

        private StravaIntegration() {
            super("", null);
        }
    }
}
