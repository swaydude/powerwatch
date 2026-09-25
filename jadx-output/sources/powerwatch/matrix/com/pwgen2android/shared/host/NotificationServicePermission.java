package powerwatch.matrix.com.pwgen2android.shared.host;

/* JADX INFO: compiled from: AppPermissions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00030\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/host/NotificationServicePermission;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getCurrentPermissionState", "Lpowerwatch/matrix/com/pwgen2android/shared/host/AppPermission;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class NotificationServicePermission {
    private final android.content.Context context;
    private final java.lang.ref.WeakReference<android.content.Context> contextWeakReference;

    public NotificationServicePermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.contextWeakReference = new java.lang.ref.WeakReference<>(context);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.AppPermission getCurrentPermissionState() {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.Companion companion = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE;
        android.content.Context context = this.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context);
        if (companion.isNotificationServiceEnabled(context)) {
            return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.NotificationService.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOn.INSTANCE.getState());
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.Companion companion2 = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE;
        android.content.Context context2 = this.contextWeakReference.get();
        kotlin.jvm.internal.Intrinsics.checkNotNull(context2);
        if (companion2.isGlobalServiceUserDeclined(context2)) {
            return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.NotificationService.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateOff.INSTANCE.getState());
        }
        return new powerwatch.matrix.com.pwgen2android.shared.host.AppPermission(powerwatch.matrix.com.pwgen2android.shared.host.Apps.NotificationService.INSTANCE.getName(), powerwatch.matrix.com.pwgen2android.shared.host.AppState.StateUndefined.INSTANCE.getState());
    }
}
