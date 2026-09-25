package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: BlackListResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/BlackListResolver;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "blackListedApps", "", "", "isNotificationFromPWApp", "", "sbnNotification", "Landroid/service/notification/StatusBarNotification;", "shouldPassNotification", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BlackListResolver {
    private final java.util.Set<java.lang.String> blackListedApps;
    private final android.content.Context context;

    public BlackListResolver(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.blackListedApps = linkedHashSet;
        linkedHashSet.add("powerwatch.matrix.com.pwgen2android");
    }

    public final boolean isNotificationFromPWApp(android.service.notification.StatusBarNotification sbnNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sbnNotification, "sbnNotification");
        return kotlin.jvm.internal.Intrinsics.areEqual(sbnNotification.getPackageName(), "powerwatch.matrix.com.pwgen2android");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    public final boolean shouldPassNotification(android.service.notification.StatusBarNotification sbnNotification) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sbnNotification, "sbnNotification");
        if ((sbnNotification.getNotification().flags & 512) != 0 && (!kotlin.jvm.internal.Intrinsics.areEqual(sbnNotification.getPackageName(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.WHATSAPP) || !kotlin.jvm.internal.Intrinsics.areEqual(sbnNotification.getNotification().getGroup(), "call_notification_group"))) {
            java.lang.System.out.println((java.lang.Object) "notif_exit group");
            return false;
        }
        java.lang.String packageName = sbnNotification.getPackageName();
        android.content.Context context = this.context;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        java.lang.String strAppNameLookup = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolverKt.appNameLookup(context, packageName);
        if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FB_MESSENGER, packageName) && sbnNotification.getId() == 10012 && kotlin.jvm.internal.Intrinsics.areEqual("Messenger", strAppNameLookup) && sbnNotification.getNotification().tickerText == null) {
            java.lang.System.out.println((java.lang.Object) "notif_exit");
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("com.android.systemui", packageName) && kotlin.jvm.internal.Intrinsics.areEqual("low_battery", sbnNotification.getTag())) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual("android", packageName) && sbnNotification.isOngoing()) {
            return false;
        }
        java.lang.String charSequence = sbnNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE);
        if (charSequence == null) {
        }
        java.lang.String strExtractAnyTextOrEmpty = powerwatch.matrix.com.pwgen2android.shared.extensions.NotificationExtensionsKt.extractAnyTextOrEmpty(sbnNotification);
        if (charSequence.length() == 0) {
            if (strExtractAnyTextOrEmpty.length() == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return (this.blackListedApps.contains(packageName) || z) ? false : true;
    }
}
