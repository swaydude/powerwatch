package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: PowerWatch2AlertsService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0014\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000267B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020%H\u0017J\b\u0010+\u001a\u00020%H\u0016J\b\u0010,\u001a\u00020%H\u0016J\b\u0010-\u001a\u00020%H\u0016J\u0010\u0010.\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u00100\u001a\u00020%H\u0002J\u001a\u00101\u001a\u0004\u0018\u0001022\u0006\u0010)\u001a\u00020#2\u0006\u0010'\u001a\u000203H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001022\u0006\u0010)\u001a\u00020#H\u0002J\u0012\u00105\u001a\u0004\u0018\u0001022\u0006\u0010)\u001a\u00020#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService;", "Landroid/service/notification/NotificationListenerService;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "infoResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/BlackListResolver;", "getInfoResolver", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/BlackListResolver;", "infoResolver$delegate", "Lkotlin/Lazy;", "listenerConnected", "", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "otherAppsResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;", "getOtherAppsResolver", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/OtherAppsResolver;", "otherAppsResolver$delegate", "receiver", "powerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$receiver$1", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$receiver$1;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "getRxBus", "()Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "rxBus$delegate", "whiteListResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "getWhiteListResolver", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "whiteListResolver$delegate", "formatNotificationContent", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationDescription;", "sbn", "Landroid/service/notification/StatusBarNotification;", "initNotificationResolvers", "", "logNotification", "notificationType", "", "statusBarNotification", "onCreate", "onDestroy", "onListenerConnected", "onListenerDisconnected", "onNotificationPosted", "onNotificationRemoved", "resolveCurrentNotifications", "resolveNotificationAlert", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/NotificationEventType;", "resolvePowerWatchDismissedAlert", "resolvePowerWatchPostedAlert", "Companion", "OnNotificationReceived", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PowerWatch2AlertsService extends android.service.notification.NotificationListenerService implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {

    /* JADX INFO: renamed from: infoResolver$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy infoResolver;
    private boolean listenerConnected;
    private androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: otherAppsResolver$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy otherAppsResolver;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$receiver$1 receiver;

    /* JADX INFO: renamed from: rxBus$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy rxBus;

    /* JADX INFO: renamed from: whiteListResolver$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy whiteListResolver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.Companion(null);
    private static java.lang.String CALL_NOTIFICATION_CATEGORY = androidx.core.app.NotificationCompat.CATEGORY_CALL;
    private static java.lang.String MESSAGE_NOTIFICATION_CATEGORY = androidx.core.app.NotificationCompat.CATEGORY_MESSAGE;
    private static java.lang.String FB_MESSENGER_SERVICE_CATEGORY = androidx.core.app.NotificationCompat.CATEGORY_SERVICE;
    private static final java.lang.String TAG = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.class.getSimpleName();

    /* JADX INFO: compiled from: PowerWatch2AlertsService.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$OnNotificationReceived;", "", "resolveAlert", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "statusBarNotification", "Landroid/service/notification/StatusBarNotification;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnNotificationReceived {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveAlert(android.service.notification.StatusBarNotification statusBarNotification);
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$receiver$1] */
    public PowerWatch2AlertsService() {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService powerWatch2AlertsService = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = powerWatch2AlertsService.getKoin().getRootScope();
        this.whiteListResolver = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope2 = powerWatch2AlertsService.getKoin().getRootScope();
        this.infoResolver = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver invoke() {
                return rootScope2.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope3 = powerWatch2AlertsService.getKoin().getRootScope();
        this.otherAppsResolver = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver invoke() {
                return rootScope3.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver.class), qualifier, function0);
            }
        });
        this.receiver = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                this.this$0.resolveCurrentNotifications();
            }
        };
        final org.koin.core.scope.Scope rootScope4 = powerWatch2AlertsService.getKoin().getRootScope();
        this.rxBus = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.RxBus>() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.RxBus] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.RxBus invoke() {
                return rootScope4.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.RxBus.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver getWhiteListResolver() {
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver) this.whiteListResolver.getValue();
    }

    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver getInfoResolver() {
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver) this.infoResolver.getValue();
    }

    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver getOtherAppsResolver() {
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver) this.otherAppsResolver.getValue();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        this.listenerConnected = true;
        resolveCurrentNotifications();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        this.listenerConnected = false;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        android.util.Log.d(TAG, "Notification listener service enabled and created..");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService powerWatch2AlertsService = this;
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(powerWatch2AlertsService);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localBroadcastManager, "getInstance(this)");
        this.localBroadcastManager = localBroadcastManager;
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_ENABLED));
            initNotificationResolvers();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.CURRENT_NOTIFICATIONS_REQUEST);
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(powerWatch2AlertsService).registerReceiver(this.receiver, intentFilter);
            getRxBus().getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$PowerWatch2AlertsService$SY6NtbMkaxuZY3eRIC2PfL5mTjY
                @Override // io.reactivex.functions.Predicate
                public final boolean test(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.m3594onCreate$lambda0(obj);
                }
            }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$PowerWatch2AlertsService$ZKjUNvbIhCx_tSvov8v9Kmn3cJI
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.m3595onCreate$lambda1(obj);
                }
            }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$PowerWatch2AlertsService$C9qpVNUC6Vz_Ffpw2-enOj0ncBk
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.m3596onCreate$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.NotificationEvent) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$PowerWatch2AlertsService$b5RT_CajVRiEOCt3yr3SXUuTDJI
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    ((java.lang.Throwable) obj).printStackTrace();
                }
            });
            return;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final boolean m3594onCreate$lambda0(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof powerwatch.matrix.com.pwgen2android.shared.NotificationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.NotificationEvent m3595onCreate$lambda1(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.shared.NotificationEvent) it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-2, reason: not valid java name */
    public static final void m3596onCreate$lambda2(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService this$0, powerwatch.matrix.com.pwgen2android.shared.NotificationEvent notificationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (notificationEvent != null) {
            java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("notification_data: read ", notificationEvent.getEvent().getTitle()));
            android.content.Intent intent = new android.content.Intent();
            intent.setAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_POSTED);
            intent.putExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.PARCELABLE_EVENT_KEY, notificationEvent.getEvent());
            androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = this$0.localBroadcastManager;
            if (localBroadcastManager != null) {
                localBroadcastManager.sendBroadcast(intent);
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveCurrentNotifications() {
        if (this.listenerConnected) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$PowerWatch2AlertsService$6LsIadCyQRITuUJKshsWeOjk0_4
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.m3598resolveCurrentNotifications$lambda4(this.f$0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: resolveCurrentNotifications$lambda-4, reason: not valid java name */
    public static final void m3598resolveCurrentNotifications$lambda4(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
        try {
            if (this$0.getActiveNotifications() != null) {
                android.service.notification.StatusBarNotification[] activeNotifications = this$0.getActiveNotifications();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activeNotifications, "activeNotifications");
                int i = 0;
                int length = activeNotifications.length;
                while (i < length) {
                    android.service.notification.StatusBarNotification statusBarNotification = activeNotifications[i];
                    i++;
                    powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Resolving pre-existing notification", null, 2, null);
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.BlackListResolver infoResolver = this$0.getInfoResolver();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(statusBarNotification, "statusBarNotification");
                    if (infoResolver.shouldPassNotification(statusBarNotification)) {
                        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent alertEventResolvePowerWatchPostedAlert = this$0.resolvePowerWatchPostedAlert(statusBarNotification);
                        if (alertEventResolvePowerWatchPostedAlert instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) {
                            arrayList.add(alertEventResolvePowerWatchPostedAlert);
                        } else if (alertEventResolvePowerWatchPostedAlert instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) {
                            arrayList2.add(alertEventResolvePowerWatchPostedAlert);
                        }
                    }
                }
            }
        } catch (java.lang.Exception unused) {
            android.util.Log.d(TAG, "GetActiveNotifications call failed.");
        }
        if (!arrayList.isEmpty()) {
            android.content.Intent intent = new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_CALLS);
            intent.putParcelableArrayListExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.CALLS_EXTRAS_KEY, arrayList);
            androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = this$0.localBroadcastManager;
            if (localBroadcastManager == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
                throw null;
            }
            localBroadcastManager.sendBroadcast(intent);
        }
        if (!arrayList2.isEmpty()) {
            android.content.Intent intent2 = new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_MESSAGES);
            intent2.putParcelableArrayListExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.MESSAGES_EXTRAS_KEY, arrayList2);
            androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager2 = this$0.localBroadcastManager;
            if (localBroadcastManager2 != null) {
                localBroadcastManager2.sendBroadcast(intent2);
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
                throw null;
            }
        }
    }

    private final powerwatch.matrix.com.pwgen2android.shared.RxBus getRxBus() {
        return (powerwatch.matrix.com.pwgen2android.shared.RxBus) this.rxBus.getValue();
    }

    private final void initNotificationResolvers() {
        resolveCurrentNotifications();
    }

    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription formatNotificationContent(android.service.notification.StatusBarNotification sbn) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String strValueOf = android.os.Build.VERSION.SDK_INT >= 24 ? java.lang.String.valueOf(sbn.isGroup()) : "unsupported";
        java.lang.String channelId = android.os.Build.VERSION.SDK_INT >= 26 ? sbn.getNotification().getChannelId() : "unsupported";
        android.os.Bundle bundle = sbn.getNotification().extras;
        java.lang.CharSequence charSequence = bundle == null ? null : bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE);
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "null";
        }
        java.lang.String strExtractAnyTextOrEmpty = powerwatch.matrix.com.pwgen2android.shared.extensions.NotificationExtensionsKt.extractAnyTextOrEmpty(sbn);
        if (strExtractAnyTextOrEmpty.length() == 0) {
            strExtractAnyTextOrEmpty = "null";
        }
        java.lang.CharSequence charSequence2 = sbn.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_SUB_TEXT);
        if (charSequence2 == null || (string2 = charSequence2.toString()) == null) {
            string2 = "null";
        }
        int length = kotlin.jvm.internal.Intrinsics.areEqual(string, "null") ? -1 : string.length();
        int length2 = kotlin.jvm.internal.Intrinsics.areEqual(strExtractAnyTextOrEmpty, "null") ? -1 : strExtractAnyTextOrEmpty.length();
        int length3 = kotlin.jvm.internal.Intrinsics.areEqual(string2, "null") ? -1 : string2.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Package: ");
        sb.append((java.lang.Object) sbn.getPackageName());
        sb.append(",\ntitle size - ");
        sb.append(length);
        sb.append(",\n text size - ");
        sb.append(length2);
        sb.append(",\n subtext size - ");
        sb.append(length3);
        sb.append(",\n id: ");
        sb.append(sbn.getId());
        sb.append(", \ntag: ");
        sb.append((java.lang.Object) sbn.getTag());
        sb.append(", isClearable: ");
        sb.append(sbn.isClearable());
        sb.append(", isGroup: ");
        sb.append(strValueOf);
        sb.append(", isOngoing: ");
        sb.append(sbn.isOngoing());
        sb.append(" \nNotification info: category: ");
        sb.append((java.lang.Object) sbn.getNotification().category);
        sb.append(", group: ");
        sb.append((java.lang.Object) sbn.getNotification().getGroup());
        sb.append(", \nchannelId: ");
        sb.append((java.lang.Object) channelId);
        sb.append(" \nflag breakdown: \nforeground service - ");
        sb.append((sbn.getNotification().flags & 64) != 0);
        sb.append(" \nongoing - ");
        sb.append((sbn.getNotification().flags & 2) != 0);
        sb.append(" \nlocal only - ");
        sb.append((sbn.getNotification().flags & 256) != 0);
        sb.append(" \nalert once - ");
        sb.append((sbn.getNotification().flags & 8) != 0);
        sb.append(" \n group summary - ");
        sb.append((sbn.getNotification().flags & 512) != 0);
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription(string, strExtractAnyTextOrEmpty, string2, sb.toString());
    }

    private final void logNotification(java.lang.String notificationType, android.service.notification.StatusBarNotification statusBarNotification) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Parsing notification: " + notificationType + " \n " + formatNotificationContent(statusBarNotification).getMetadataInfo(), null, 2, null);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(android.service.notification.StatusBarNotification sbn) {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent alertEventResolvePowerWatchPostedAlert;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sbn, "sbn");
        super.onNotificationPosted(sbn);
        if (getInfoResolver().isNotificationFromPWApp(sbn) || !getInfoResolver().shouldPassNotification(sbn) || (alertEventResolvePowerWatchPostedAlert = resolvePowerWatchPostedAlert(sbn)) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_POSTED);
        intent.putExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.PARCELABLE_EVENT_KEY, alertEventResolvePowerWatchPostedAlert);
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = this.localBroadcastManager;
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(intent);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
            throw null;
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(android.service.notification.StatusBarNotification sbn) {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent alertEventResolvePowerWatchDismissedAlert;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sbn, "sbn");
        super.onNotificationRemoved(sbn);
        if (getInfoResolver().isNotificationFromPWApp(sbn) || !getInfoResolver().shouldPassNotification(sbn) || (alertEventResolvePowerWatchDismissedAlert = resolvePowerWatchDismissedAlert(sbn)) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_REMOVED);
        intent.putExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.PARCELABLE_EVENT_KEY, alertEventResolvePowerWatchDismissedAlert);
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = this.localBroadcastManager;
        if (localBroadcastManager != null) {
            localBroadcastManager.sendBroadcast(intent);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
            throw null;
        }
    }

    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolvePowerWatchPostedAlert(android.service.notification.StatusBarNotification statusBarNotification) {
        return resolveNotificationAlert(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.POSTED.INSTANCE);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolvePowerWatchDismissedAlert(android.service.notification.StatusBarNotification statusBarNotification) {
        return resolveNotificationAlert(statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType.DISMISSED.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent resolveNotificationAlert(android.service.notification.StatusBarNotification statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.NotificationEventType notificationType) {
        boolean z;
        boolean z2;
        if (getWhiteListResolver().isAppSupported(statusBarNotification)) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver = getWhiteListResolver();
            java.lang.String packageName = statusBarNotification.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "statusBarNotification.packageName");
            if (whiteListResolver.isAppEnabled(packageName)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            logNotification(notificationType.getTypeIdentifier(), statusBarNotification);
            return getWhiteListResolver().resolveAppNotification(statusBarNotification, notificationType);
        }
        if (getOtherAppsResolver().isAppSupported(statusBarNotification)) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.OtherAppsResolver otherAppsResolver = getOtherAppsResolver();
            java.lang.String packageName2 = statusBarNotification.getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName2, "statusBarNotification.packageName");
            z2 = otherAppsResolver.isAppEnabled(packageName2);
        }
        if (!z2) {
            return null;
        }
        logNotification(notificationType.getTypeIdentifier(), statusBarNotification);
        return getOtherAppsResolver().resolveAppNotification(statusBarNotification, notificationType);
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        android.util.Log.d(TAG, "Notification listener service destroyed..");
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = this.localBroadcastManager;
        if (localBroadcastManager == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
            throw null;
        }
        localBroadcastManager.sendBroadcast(new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_DISABLED));
        androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager2 = this.localBroadcastManager;
        if (localBroadcastManager2 != null) {
            localBroadcastManager2.unregisterReceiver(this.receiver);
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("localBroadcastManager");
            throw null;
        }
    }

    /* JADX INFO: compiled from: PowerWatch2AlertsService.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u0016\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PowerWatch2AlertsService$Companion;", "", "()V", "CALL_NOTIFICATION_CATEGORY", "", "getCALL_NOTIFICATION_CATEGORY", "()Ljava/lang/String;", "setCALL_NOTIFICATION_CATEGORY", "(Ljava/lang/String;)V", "FB_MESSENGER_SERVICE_CATEGORY", "getFB_MESSENGER_SERVICE_CATEGORY", "setFB_MESSENGER_SERVICE_CATEGORY", "MESSAGE_NOTIFICATION_CATEGORY", "getMESSAGE_NOTIFICATION_CATEGORY", "setMESSAGE_NOTIFICATION_CATEGORY", "TAG", "kotlin.jvm.PlatformType", "getPackagesOfDialerApps", "", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getCALL_NOTIFICATION_CATEGORY() {
            return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.CALL_NOTIFICATION_CATEGORY;
        }

        public final void setCALL_NOTIFICATION_CATEGORY(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.CALL_NOTIFICATION_CATEGORY = str;
        }

        public final java.lang.String getMESSAGE_NOTIFICATION_CATEGORY() {
            return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.MESSAGE_NOTIFICATION_CATEGORY;
        }

        public final void setMESSAGE_NOTIFICATION_CATEGORY(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.MESSAGE_NOTIFICATION_CATEGORY = str;
        }

        public final java.lang.String getFB_MESSENGER_SERVICE_CATEGORY() {
            return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.FB_MESSENGER_SERVICE_CATEGORY;
        }

        public final void setFB_MESSENGER_SERVICE_CATEGORY(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PowerWatch2AlertsService.FB_MESSENGER_SERVICE_CATEGORY = str;
        }

        public final java.util.List<java.lang.String> getPackagesOfDialerApps(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("android.intent.action.DIAL");
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.queryIntentActivities(intent, 0)");
            java.util.Iterator<android.content.pm.ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().activityInfo.applicationInfo.packageName);
            }
            return arrayList;
        }
    }
}
