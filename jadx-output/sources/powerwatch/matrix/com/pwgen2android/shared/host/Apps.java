package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: AppPermissions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps;", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "GoogleFit", "NotificationService", "Strava", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$GoogleFit;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Apps {
    private final java.lang.String name;

    public /* synthetic */ Apps(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private Apps(java.lang.String str) {
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX INFO: compiled from: AppPermissions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$GoogleFit;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GoogleFit extends powerwatch.matrix.com.pwgen2android.shared.host.Apps {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.Apps.GoogleFit INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.Apps.GoogleFit();

        private GoogleFit() {
            super("GoogleFit", null);
        }
    }

    /* JADX INFO: compiled from: AppPermissions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$NotificationService;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class NotificationService extends powerwatch.matrix.com.pwgen2android.shared.host.Apps {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.Apps.NotificationService INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.Apps.NotificationService();

        private NotificationService() {
            super("NotificationService", null);
        }
    }

    /* JADX INFO: compiled from: AppPermissions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps$Strava;", "Lpowerwatch/matrix/com/pwgen2android/shared/host/Apps;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Strava extends powerwatch.matrix.com.pwgen2android.shared.host.Apps {
        public static final powerwatch.matrix.com.pwgen2android.shared.host.Apps.Strava INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.host.Apps.Strava();

        private Strava() {
            super("Strava", null);
        }
    }
}
