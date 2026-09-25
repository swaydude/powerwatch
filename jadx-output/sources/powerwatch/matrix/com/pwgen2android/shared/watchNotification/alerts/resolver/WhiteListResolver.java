package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver;

/* JADX INFO: compiled from: WhiteListResolver.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\u0006\u0010\u001e\u001a\u00020\u0018J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000bH\u0016J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u001a\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010&\u001a\u00020'2\u0006\u0010+\u001a\u00020,H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppsResolverHelper;", "applicationContext", "Landroid/content/Context;", "thirdPartyAppStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/ThirdPartyAppStorage;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;)V", "hiddenDialerAppsSet", "", "", "localMemory", "", "", "mainDialerPackage", "getMainDialerPackage", "()Ljava/lang/String;", "setMainDialerPackage", "(Ljava/lang/String;)V", "smsPackage", "whiteListedApps", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/ResolverWrapper;", "clearLocalMemory", "", "enableApp", "packageName", "enable", "enableCallsApp", "store", "flushMemory", "getAppInfo", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/AppInfo;", "activityContext", "getSMSPackage", "isAppEnabled", "isAppSupported", "notification", "Landroid/service/notification/StatusBarNotification;", "isHiddenDialerApp", "resolveAppNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "notificationEventType", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WhiteListResolver implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper {
    private final android.content.Context applicationContext;
    private final java.util.Set<java.lang.String> hiddenDialerAppsSet;
    private final java.util.Map<java.lang.String, java.lang.Boolean> localMemory;
    private java.lang.String mainDialerPackage;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private java.lang.String smsPackage;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage thirdPartyAppStorage;
    private final java.util.Map<java.lang.String, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper> whiteListedApps;

    public WhiteListResolver(android.content.Context applicationContext, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage thirdPartyAppStorage, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thirdPartyAppStorage, "thirdPartyAppStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        this.applicationContext = applicationContext;
        this.thirdPartyAppStorage = thirdPartyAppStorage;
        this.rxBus = rxBus;
        this.mainDialerPackage = "";
        this.smsPackage = "";
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.whiteListedApps = linkedHashMap;
        this.localMemory = new java.util.LinkedHashMap();
        this.hiddenDialerAppsSet = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INCOMING_CALL_APP_PKG, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INCOMING_CALL_UI_APP_PKG, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INCOMING_SAMSUNG_CALL_UI_APP_PKG});
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted.CellularCallAlertPosted cellularCallAlertPosted = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted.CellularCallAlertPosted(atomicBoolean, applicationContext, rxBus);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.CellularCallAlertDismissed cellularCallAlertDismissed = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.CellularCallAlertDismissed(atomicBoolean, applicationContext);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$fbMessengerPosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getFB_MESSENGER_SERVICE_CATEGORY(), statusBarNotification.getNotification().category)) {
                    return null;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED, this.this$0.applicationContext);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext);
                }
                return null;
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived2 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$fbMessengerDismissed$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getFB_MESSENGER_SERVICE_CATEGORY(), statusBarNotification.getNotification().category)) {
                    return null;
                }
                if (statusBarNotification.getNotification().category == null) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, this.this$0.applicationContext);
                }
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED, this.this$0.applicationContext);
                }
                return null;
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived3 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$skypePosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING, this.this$0.applicationContext);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext);
                }
                return null;
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived4 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$skypeDismissed$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, this.this$0.applicationContext);
                }
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED, this.this$0.applicationContext);
                }
                return null;
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived5 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$alertPosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                return kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING, this.this$0.applicationContext) : powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived6 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$gmailPosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (statusBarNotification.isOngoing()) {
                    return null;
                }
                return kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING, this.this$0.applicationContext) : powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived7 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$alertDismissed$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                return kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, this.this$0.applicationContext) : powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived8 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$whatsAppPosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (android.os.Build.VERSION.SDK_INT >= 26 && kotlin.jvm.internal.Intrinsics.areEqual("silent_notifications_3", statusBarNotification.getNotification().getChannelId())) {
                    return null;
                }
                java.lang.String charSequence = statusBarNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE);
                if (charSequence == null) {
                }
                java.lang.String tag = statusBarNotification.getTag();
                if (kotlin.jvm.internal.Intrinsics.areEqual(charSequence, "WhatsApp")) {
                    return null;
                }
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) && kotlin.jvm.internal.Intrinsics.areEqual("call_notification_group", statusBarNotification.getNotification().getGroup())) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING, this.this$0.applicationContext);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category)) {
                    return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent) null;
                }
                if (tag == null) {
                    return null;
                }
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived9 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$whatsAppDismissed$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                java.lang.String charSequence = statusBarNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE);
                if (charSequence == null) {
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(charSequence, "WhatsApp")) {
                    return null;
                }
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) && kotlin.jvm.internal.Intrinsics.areEqual("call_notification_group", statusBarNotification.getNotification().getGroup())) {
                    return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent) null;
                }
                return kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, this.this$0.applicationContext) : powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived10 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$lineAlertDismissed$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                return kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED, this.this$0.applicationContext) : powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived11 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$lineAlertPosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                return kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) ? powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext) : powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING, this.this$0.applicationContext);
            }
        };
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived12 = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver$fongoAppPosted$1
            @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived
            public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
                if (kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getMESSAGE_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true)) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createMessageNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED, this.this$0.applicationContext);
                }
                if (!kotlin.text.StringsKt.equals(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getCALL_NOTIFICATION_CATEGORY(), statusBarNotification.getNotification().category, true) || statusBarNotification.isOngoing()) {
                    return null;
                }
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.createCallNotification(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING, this.this$0.applicationContext);
            }
        };
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted.ViberPostedAlert viberPostedAlert = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.posted.ViberPostedAlert(atomicBoolean2, applicationContext);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.ViberDismissedAlert viberDismissedAlert = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.ViberDismissedAlert(atomicBoolean2, applicationContext);
        java.util.List<java.lang.String> packagesOfDialerApps = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.INSTANCE.getPackagesOfDialerApps(applicationContext);
        if (!packagesOfDialerApps.isEmpty()) {
            this.mainDialerPackage = packagesOfDialerApps.get(0);
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolverKt.setMainGlobalDialerPackage(packagesOfDialerApps.get(0));
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper resolverWrapper = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(cellularCallAlertPosted, cellularCallAlertDismissed, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo("Phone Call", this.mainDialerPackage, null, 4, null));
            linkedHashMap.put(this.mainDialerPackage, resolverWrapper);
            linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INCOMING_CALL_APP_PKG, resolverWrapper);
            linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INCOMING_CALL_UI_APP_PKG, resolverWrapper);
            linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INCOMING_SAMSUNG_CALL_UI_APP_PKG, resolverWrapper);
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived13 = onNotificationReceived5;
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived14 = onNotificationReceived7;
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.CALENDAR, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo("Calendar", powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.CALENDAR, null, 4, null)));
        java.lang.String string = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.whatsapp);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "applicationContext.getString(R.string.whatsapp)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.WHATSAPP, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived8, onNotificationReceived9, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.WHATSAPP, null, 4, null)));
        java.lang.String string2 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.viber);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "applicationContext.getString(R.string.viber)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.VIBER, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(viberPostedAlert, viberDismissedAlert, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.VIBER, null, 4, null)));
        java.lang.String string3 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.fongo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "applicationContext.getString(R.string.fongo)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FONGO, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived12, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string3, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FONGO, null, 4, null)));
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived15 = onNotificationReceived;
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.OnNotificationReceived onNotificationReceived16 = onNotificationReceived2;
        java.lang.String string4 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.facebook_messenger);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "applicationContext.getString(R.string.facebook_messenger)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FB_MESSENGER, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived15, onNotificationReceived16, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string4, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FB_MESSENGER, null, 4, null)));
        java.lang.String string5 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.facebook_messenger_lite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "applicationContext.getString(R.string.facebook_messenger_lite)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FB_MESSENGER_LITE, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived15, onNotificationReceived16, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string5, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.FB_MESSENGER_LITE, null, 4, null)));
        java.lang.String string6 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.gmail);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "applicationContext.getString(R.string.gmail)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.GMAIL, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived6, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string6, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.GMAIL, null, 4, null)));
        java.lang.String string7 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.skype);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string7, "applicationContext.getString(R.string.skype)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.SKYPE, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived3, onNotificationReceived4, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string7, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.SKYPE, null, 4, null)));
        java.lang.String string8 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.wechat);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "applicationContext.getString(R.string.wechat)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.WECHAT, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string8, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.WECHAT, null, 4, null)));
        java.lang.String string9 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.line);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string9, "applicationContext.getString(R.string.line)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.LINE, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived11, onNotificationReceived10, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string9, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.LINE, null, 4, null)));
        java.lang.String string10 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.line_lite);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string10, "applicationContext.getString(R.string.line_lite)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.LINE_LITE, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string10, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.LINE_LITE, null, 4, null)));
        java.lang.String string11 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.instagram);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string11, "applicationContext.getString(R.string.instagram)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INSTAGRAM, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string11, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.INSTAGRAM, null, 4, null)));
        java.lang.String string12 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.telegram);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string12, "applicationContext.getString(R.string.telegram)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.TELEGRAM, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string12, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.TELEGRAM, null, 4, null)));
        java.lang.String string13 = applicationContext.getString(powerwatch.matrix.com.pwgen2android.R.string.outlook);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string13, "applicationContext.getString(R.string.outlook)");
        linkedHashMap.put(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.OUTLOOK, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string13, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.OUTLOOK, null, 4, null)));
        java.lang.String sMSPackage = getSMSPackage();
        this.smsPackage = sMSPackage;
        linkedHashMap.put(sMSPackage, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper(onNotificationReceived13, onNotificationReceived14, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo("SMS", sMSPackage, null, 4, null)));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolver
    public boolean shouldResolve(android.service.notification.StatusBarNotification statusBarNotification) {
        return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper.DefaultImpls.shouldResolve(this, statusBarNotification);
    }

    public final java.lang.String getMainDialerPackage() {
        return this.mainDialerPackage;
    }

    public final void setMainDialerPackage(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainDialerPackage = str;
    }

    public final void clearLocalMemory() {
        this.localMemory.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper
    public void enableCallsApp(boolean enable, boolean store) {
        if (this.whiteListedApps.containsKey(this.mainDialerPackage)) {
            this.localMemory.put(this.mainDialerPackage, java.lang.Boolean.valueOf(enable));
            if (store) {
                this.thirdPartyAppStorage.setThirdPartAppEnabled(this.mainDialerPackage, enable, this.applicationContext);
            }
        }
    }

    public final void flushMemory() {
        for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : this.localMemory.entrySet()) {
            this.thirdPartyAppStorage.setThirdPartAppEnabled(entry.getKey(), entry.getValue().booleanValue(), this.applicationContext);
        }
        this.localMemory.clear();
    }

    private final boolean isHiddenDialerApp(java.lang.String packageName) {
        return this.hiddenDialerAppsSet.contains(packageName);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController
    public void enableApp(java.lang.String packageName, boolean enable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.localMemory.put(packageName, java.lang.Boolean.valueOf(enable));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController
    public java.util.List<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo> getAppInfo(android.content.Context activityContext) {
        java.lang.String appName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.whiteListedApps.containsKey(this.mainDialerPackage)) {
            java.lang.String string = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.phone_call);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "activityContext.getString(R.string.phone_call)");
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string, this.mainDialerPackage, null, 4, null));
        }
        if (this.whiteListedApps.containsKey(this.smsPackage)) {
            java.lang.String string2 = activityContext.getString(powerwatch.matrix.com.pwgen2android.R.string.sms);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "activityContext.getString(R.string.sms)");
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo(string2, this.smsPackage, null, 4, null));
        }
        java.util.Set<java.lang.String> setKeySet = this.whiteListedApps.keySet();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            java.lang.String str = (java.lang.String) obj;
            if ((this.hiddenDialerAppsSet.contains(str) || kotlin.jvm.internal.Intrinsics.areEqual(str, getMainDialerPackage()) || kotlin.jvm.internal.Intrinsics.areEqual(str, this.smsPackage)) ? false : true) {
                arrayList2.add(obj);
            }
        }
        for (java.lang.String str2 : arrayList2) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper resolverWrapper = this.whiteListedApps.get(str2);
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo appInfo = resolverWrapper == null ? null : resolverWrapper.getAppInfo();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppInfo((appInfo == null || (appName = appInfo.getAppName()) == null) ? "" : appName, str2, null, 4, null));
        }
        return arrayList;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolver
    public powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAppNotification(android.service.notification.StatusBarNotification notification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType notificationEventType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationEventType, "notificationEventType");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.ResolverWrapper resolverWrapper = this.whiteListedApps.get(notification.getPackageName());
        kotlin.jvm.internal.Intrinsics.checkNotNull(resolverWrapper);
        if (kotlin.jvm.internal.Intrinsics.areEqual(notificationEventType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.POSTED.INSTANCE)) {
            return resolverWrapper.getPostedResolver().resolveAlert(notification);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(notificationEventType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.DISMISSED.INSTANCE)) {
            return resolverWrapper.getDismissedResolver().resolveAlert(notification);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsController
    public boolean isAppEnabled(java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (this.localMemory.containsKey(packageName)) {
            java.lang.Boolean bool = this.localMemory.get(packageName);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
        if (isHiddenDialerApp(packageName)) {
            packageName = this.mainDialerPackage;
        }
        return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage.DefaultImpls.isAppNotificationEnabled$default(this.thirdPartyAppStorage, this.applicationContext, packageName, false, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.AppsResolverHelper
    public boolean isAppSupported(android.service.notification.StatusBarNotification notification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
        return this.whiteListedApps.containsKey(notification.getPackageName());
    }

    private final java.lang.String getSMSPackage() {
        java.lang.Object next;
        java.lang.String defaultSmsPackage = android.provider.Telephony.Sms.getDefaultSmsPackage(this.applicationContext);
        if (defaultSmsPackage != null) {
            return defaultSmsPackage;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
        intent.setData(android.net.Uri.parse("smsto:"));
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = this.applicationContext.getPackageManager().queryIntentActivities(intent, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "applicationContext.packageManager.queryIntentActivities(intent, 0)");
        if (!(!listQueryIntentActivities.isEmpty())) {
            return "unknown";
        }
        java.util.List<android.content.pm.ResolveInfo> list = listQueryIntentActivities;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((android.content.pm.ResolveInfo) it.next()).activityInfo.packageName);
        }
        java.util.Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(this.whiteListedApps.get((java.lang.String) next) == null));
        java.lang.String str = (java.lang.String) next;
        return str == null ? "unknown" : str;
    }
}
