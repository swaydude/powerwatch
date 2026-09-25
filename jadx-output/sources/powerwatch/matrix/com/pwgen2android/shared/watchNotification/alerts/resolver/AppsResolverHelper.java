package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: OtherAppsResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolver;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsController;", "enableCallsApp", "", "enable", "", "store", "isAppSupported", "notification", "Landroid/service/notification/StatusBarNotification;", "shouldResolve", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AppsResolverHelper extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController {
    void enableCallsApp(boolean enable, boolean store);

    boolean isAppSupported(android.service.notification.StatusBarNotification notification);

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolver
    boolean shouldResolve(android.service.notification.StatusBarNotification notification);

    /* JADX INFO: compiled from: OtherAppsResolver.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void enableCallsApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper appsResolverHelper, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appsResolverHelper, "this");
        }

        public static boolean shouldResolve(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper appsResolverHelper, android.service.notification.StatusBarNotification notification) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appsResolverHelper, "this");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
            if (appsResolverHelper.isAppSupported(notification)) {
                java.lang.String packageName = notification.getPackageName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "notification.packageName");
                if (appsResolverHelper.isAppEnabled(packageName)) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void enableCallsApp$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper appsResolverHelper, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableCallsApp");
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            appsResolverHelper.enableCallsApp(z, z2);
        }
    }
}
