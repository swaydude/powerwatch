package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: NotificationCollectorMonitorService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0014J\"\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationCollectorMonitorService;", "Landroidx/core/app/JobIntentService;", "()V", "ensureCollectorRunning", "", "onCreate", "onHandleWork", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "toggleNotificationListenerService", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationCollectorMonitorService extends androidx.core.app.JobIntentService {
    private static final java.lang.String TAG = "NotificationCollector";

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        return 1;
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        android.util.Log.d(TAG, "onCreate() called");
    }

    private final void ensureCollectorRunning() {
        android.content.ComponentName componentName = new android.content.ComponentName(this, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.class);
        android.util.Log.v(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("ensureCollectorRunning collectorComponent: ", componentName));
        java.lang.Object systemService = getSystemService("activity");
        java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        boolean z = false;
        java.util.List<android.app.ActivityManager.RunningServiceInfo> runningServices = ((android.app.ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        if (runningServices == null) {
            android.util.Log.w(TAG, "ensureCollectorRunning() runningServices is NULL");
            return;
        }
        for (android.app.ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(runningServiceInfo.service, componentName)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("ensureCollectorRunning service - pid: ");
                sb.append(runningServiceInfo.pid);
                sb.append(", currentPID: ");
                sb.append(android.os.Process.myPid());
                sb.append(", clientPackage: ");
                sb.append((java.lang.Object) runningServiceInfo.clientPackage);
                sb.append(", clientCount: ");
                sb.append(runningServiceInfo.clientCount);
                sb.append(", clientLabel: ");
                sb.append(runningServiceInfo.clientLabel == 0 ? "0" : '(' + getResources().getString(runningServiceInfo.clientLabel) + ')');
                android.util.Log.w(TAG, sb.toString());
                if (runningServiceInfo.pid == android.os.Process.myPid()) {
                    z = true;
                }
            }
        }
        if (z) {
            android.util.Log.d(TAG, "ensureCollectorRunning: collector is running");
        } else {
            android.util.Log.d(TAG, "ensureCollectorRunning: collector not running, reviving...");
            toggleNotificationListenerService();
        }
    }

    private final void toggleNotificationListenerService() {
        android.util.Log.d(TAG, "toggleNotificationListenerService() called");
        android.content.ComponentName componentName = new android.content.ComponentName(this, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.class);
        android.content.pm.PackageManager packageManager = getPackageManager();
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        android.util.Log.d(TAG, "onHandleWork() called");
        ensureCollectorRunning();
    }
}
