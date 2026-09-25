package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: ConnectionForegroundService.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\"\u0010\u0010\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;", "Landroid/app/Service;", "()V", "center", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;", "getCenter", "()Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;", "center$delegate", "Lkotlin/Lazy;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ConnectionForegroundService extends android.app.Service {
    private static boolean isServiceRunning;

    /* JADX INFO: renamed from: center$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy center;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.Companion(null);
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = "PowerWatch Connection Notification";
    private static final java.lang.String NOTIFICATION_EXTRA = "com.matrix.powerwatch.NOTIFICATION_EXTRA";
    private static final int CONNECT_NOTIFICATION_ID = 654;
    private static final java.lang.String DISCONNECT_ACTION = "com.matrix.powerwatch.DISCONNECT_WATCH";

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    public ConnectionForegroundService() {
        final powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService connectionForegroundService = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        this.center = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter invoke() {
                android.content.ComponentCallbacks componentCallbacks = connectionForegroundService;
                return org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(componentCallbacks).getRootScope().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.class), qualifier, function0);
            }
        });
    }

    public final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter getCenter() {
        return (powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter) this.center.getValue();
    }

    @Override // android.app.Service
    public void onCreate() {
        android.app.Notification.Builder builder;
        super.onCreate();
        getCenter().onCreate();
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            builder = new android.app.Notification.Builder(this, NOTIFICATION_CHANNEL_ID);
        } else {
            builder = new android.app.Notification.Builder(this);
        }
        builder.setWhen(java.lang.System.currentTimeMillis()).setOngoing(true).setGroup("GROUP").setGroupSummary(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(NOTIFICATION_CHANNEL_ID, "Notification channel name", 2);
            notificationChannel.setDescription("Notification channel desc");
            notificationChannel.setShowBadge(false);
            java.lang.Object systemService = getSystemService("notification");
            java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((android.app.NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
        startForeground(CONNECT_NOTIFICATION_ID, builder.build());
        isServiceRunning = true;
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        if (intent == null) {
            return 2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(DISCONNECT_ACTION, intent.getAction())) {
            stopSelf();
        }
        startForeground(CONNECT_NOTIFICATION_ID, (android.app.Notification) intent.getParcelableExtra(NOTIFICATION_EXTRA));
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        isServiceRunning = false;
        getCenter().onDestroy();
        stopForeground(true);
    }

    /* JADX INFO: compiled from: ConnectionForegroundService.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;", "", "()V", "CONNECT_NOTIFICATION_ID", "", "getCONNECT_NOTIFICATION_ID", "()I", "DISCONNECT_ACTION", "", "getDISCONNECT_ACTION", "()Ljava/lang/String;", "NOTIFICATION_CHANNEL_ID", "getNOTIFICATION_CHANNEL_ID", "NOTIFICATION_EXTRA", "getNOTIFICATION_EXTRA", "isServiceRunning", "", "start", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "stop", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getNOTIFICATION_CHANNEL_ID() {
            return powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.NOTIFICATION_CHANNEL_ID;
        }

        public final java.lang.String getNOTIFICATION_EXTRA() {
            return powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.NOTIFICATION_EXTRA;
        }

        public final int getCONNECT_NOTIFICATION_ID() {
            return powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.CONNECT_NOTIFICATION_ID;
        }

        public final java.lang.String getDISCONNECT_ACTION() {
            return powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.DISCONNECT_ACTION;
        }

        public final void start(android.content.Context context, android.content.Intent intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            intent.setClass(context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class);
            if (powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.isServiceRunning) {
                android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra(getNOTIFICATION_EXTRA());
                java.lang.Object systemService = context.getSystemService("notification");
                java.util.Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((android.app.NotificationManager) systemService).notify(getCONNECT_NOTIFICATION_ID(), notification);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }

        public final void stop(final android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new java.lang.Runnable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$ConnectionForegroundService$Companion$EbuCmSaBSCDOUYqA-8ckW7c5KVc
                @Override // java.lang.Runnable
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.Companion.m2144stop$lambda0(context);
                }
            }, 300L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: stop$lambda-0, reason: not valid java name */
        public static final void m2144stop$lambda0(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            if (powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.isServiceRunning) {
                context.stopService(new android.content.Intent(context, (java.lang.Class<?>) powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.class));
            }
        }
    }
}
