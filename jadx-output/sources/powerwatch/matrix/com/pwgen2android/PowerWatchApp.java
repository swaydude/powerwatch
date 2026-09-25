package powerwatch.matrix.com.pwgen2android;

/* JADX INFO: compiled from: PowerWatchApp.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0017¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/PowerWatchApp;", "Landroid/app/Application;", "Lorg/koin/core/KoinComponent;", "()V", "mapsCrashGoogleWorkaround", "", "onCreate", "Companion", "app_release", "loggerCollectorExt", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLogCollectorExtension;", "loggerConsoleExt", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerConsoleExtension;", "bugfenderExt", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/BugfenderLoggerExtension;", "bugfenderConfig", "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;", "alertsCommunicator", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "timeService", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeService;", "realTimeDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PowerWatchApp extends android.app.Application implements org.koin.core.KoinComponent {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-12, reason: not valid java name */
    public static final void m1416onCreate$lambda12(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-13, reason: not valid java name */
    public static final void m1417onCreate$lambda13(java.lang.Throwable th) {
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return org.koin.core.KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // android.app.Application
    public void onCreate() throws org.koin.core.error.KoinAppAlreadyStartedException {
        super.onCreate();
        mapsCrashGoogleWorkaround();
        java.lang.String string = getString(powerwatch.matrix.com.pwgen2android.R.string.steps);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.steps)");
        powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManagerKt.setSteps(string);
        powerwatch.matrix.com.pwgen2android.PowerWatchApp powerWatchApp = this;
        com.google.firebase.FirebaseApp.initializeApp(powerWatchApp);
        com.baidu.mapapi.SDKInitializer.initialize(powerWatchApp);
        io.reactivex.plugins.RxJavaPlugins.setErrorHandler(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.-$$Lambda$PowerWatchApp$E5miw7dbK-y4ALhlNP0HXqX5F6E
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) throws java.lang.Throwable {
                powerwatch.matrix.com.pwgen2android.PowerWatchApp.m1412onCreate$lambda0((java.lang.Throwable) obj);
            }
        });
        final boolean prodEnabledFlag = powerwatch.matrix.com.pwgen2android.AppConfigPreferences.INSTANCE.getProdEnabledFlag(powerWatchApp);
        final powerwatch.matrix.com.pwgen2android.shared.cloud.CloudConfig cloudConfigCloudConfiguration = powerwatch.matrix.com.pwgen2android.EnvironmentKt.cloudConfiguration(prodEnabledFlag);
        org.koin.core.context.GlobalContextKt.startKoin(new kotlin.jvm.functions.Function1<org.koin.core.KoinApplication, kotlin.Unit>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp.onCreate.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(org.koin.core.KoinApplication koinApplication) {
                invoke2(koinApplication);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(org.koin.core.KoinApplication startKoin) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startKoin, "$this$startKoin");
                startKoin.logger(new org.koin.core.logger.EmptyLogger());
                org.koin.android.ext.koin.KoinExtKt.androidContext(startKoin, powerwatch.matrix.com.pwgen2android.PowerWatchApp.this);
                startKoin.modules(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new org.koin.core.module.Module[]{powerwatch.matrix.com.pwgen2android.AppModuleKt.appModule(powerwatch.matrix.com.pwgen2android.PowerWatchApp.this), powerwatch.matrix.com.pwgen2android.AppModuleKt.cloud(prodEnabledFlag), powerwatch.matrix.com.pwgen2android.shared.cloud.http.HttpModuleKt.httpModule(cloudConfigCloudConfiguration.getHttpConfig()), powerwatch.matrix.com.pwgen2android.shared.data.db.DBModuleKt.dbModule(powerwatch.matrix.com.pwgen2android.PowerWatchApp.this), powerwatch.matrix.com.pwgen2android.fcm.FCMModuleKt.fcmModule(powerwatch.matrix.com.pwgen2android.PowerWatchApp.this), powerwatch.matrix.com.pwgen2android.AppModuleKt.logger(false)}));
            }
        });
        if (android.os.Build.VERSION.SDK_INT >= 19 && (getApplicationInfo().flags & 2) != 0) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(true);
        }
        powerwatch.matrix.com.pwgen2android.PowerWatchApp powerWatchApp2 = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = powerWatchApp2.getKoin().getRootScope();
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope2 = powerWatchApp2.getKoin().getRootScope();
        kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension invoke() {
                return rootScope2.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope3 = powerWatchApp2.getKoin().getRootScope();
        kotlin.Lazy lazy3 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension invoke() {
                return rootScope3.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope4 = powerWatchApp2.getKoin().getRootScope();
        powerwatch.matrix.com.pwgen2android.BugfenderConfig bugfenderConfigM1420onCreate$lambda4 = m1420onCreate$lambda4(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.BugfenderConfig>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.BugfenderConfig] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.BugfenderConfig invoke() {
                return rootScope4.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.BugfenderConfig.class), qualifier, function0);
            }
        }));
        bugfenderConfigM1420onCreate$lambda4.initBugfender(powerWatchApp);
        bugfenderConfigM1420onCreate$lambda4.setAppBuild("197");
        m1418onCreate$lambda2(lazy2).init();
        m1413onCreate$lambda1(lazy).init();
        m1419onCreate$lambda3(lazy3).init();
        final org.koin.core.scope.Scope rootScope5 = powerWatchApp2.getKoin().getRootScope();
        final kotlin.Lazy lazy4 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator invoke() {
                return rootScope5.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope6 = powerWatchApp2.getKoin().getRootScope();
        kotlin.Lazy lazy5 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.sdk.DeviceManager>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager invoke() {
                return rootScope6.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope7 = powerWatchApp2.getKoin().getRootScope();
        kotlin.Lazy lazy6 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository invoke() {
                return rootScope7.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope8 = powerWatchApp2.getKoin().getRootScope();
        m1424onCreate$lambda9(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService invoke() {
                return rootScope8.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService.class), qualifier, function0);
            }
        })).onCreate();
        m1422onCreate$lambda7(lazy5).getMonitoringEvents().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.-$$Lambda$PowerWatchApp$vDBtc68NlVJi_rcTZ-45tbxVvpg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.PowerWatchApp.m1414onCreate$lambda10(lazy4, (powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent) obj);
            }
        });
        if (m1423onCreate$lambda8(lazy6).isEmpty()) {
            return;
        }
        m1422onCreate$lambda7(lazy5).init();
        final org.koin.core.scope.Scope rootScope9 = powerWatchApp2.getKoin().getRootScope();
        m1415onCreate$lambda11(kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider>() { // from class: powerwatch.matrix.com.pwgen2android.PowerWatchApp$onCreate$$inlined$inject$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider invoke() {
                return rootScope9.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider.class), qualifier, function0);
            }
        })).observeCurrentData().subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.-$$Lambda$PowerWatchApp$ptyaFGBDaomwGAICnVxKJimbmVc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.PowerWatchApp.m1416onCreate$lambda12((powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.-$$Lambda$PowerWatchApp$5sCZI_BMv1REnWqWBAVvLL8X6QM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.PowerWatchApp.m1417onCreate$lambda13((java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m1412onCreate$lambda0(java.lang.Throwable error) throws java.lang.Throwable {
        if (error instanceof io.reactivex.exceptions.UndeliverableException) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(error, "error");
        throw error;
    }

    /* JADX INFO: renamed from: onCreate$lambda-1, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension m1413onCreate$lambda1(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLogCollectorExtension> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-2, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension m1418onCreate$lambda2(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerConsoleExtension> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-3, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension m1419onCreate$lambda3(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.logger.BugfenderLoggerExtension> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-4, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.BugfenderConfig m1420onCreate$lambda4(kotlin.Lazy<powerwatch.matrix.com.pwgen2android.BugfenderConfig> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator m1421onCreate$lambda6(kotlin.Lazy<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager m1422onCreate$lambda7(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.sdk.DeviceManager> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-8, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository m1423onCreate$lambda8(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: renamed from: onCreate$lambda-9, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService m1424onCreate$lambda9(kotlin.Lazy<powerwatch.matrix.com.pwgen2android.sdk.timezone.CurrentTimeService> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-10, reason: not valid java name */
    public static final void m1414onCreate$lambda10(kotlin.Lazy alertsCommunicator$delegate, powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent monitoringEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsCommunicator$delegate, "$alertsCommunicator$delegate");
        if (kotlin.jvm.internal.Intrinsics.areEqual(monitoringEvent, powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingStarted.INSTANCE)) {
            m1421onCreate$lambda6(alertsCommunicator$delegate).init();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(monitoringEvent, powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingEnded.INSTANCE)) {
            m1421onCreate$lambda6(alertsCommunicator$delegate).destroy();
        }
    }

    /* JADX INFO: renamed from: onCreate$lambda-11, reason: not valid java name */
    private static final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider m1415onCreate$lambda11(kotlin.Lazy<? extends powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider> lazy) {
        return lazy.getValue();
    }

    private final void mapsCrashGoogleWorkaround() {
        try {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences("google_bug_154855417", 0);
            if (sharedPreferences.contains("fixed")) {
                return;
            }
            java.io.File file = new java.io.File(getFilesDir(), "ZoomTables.data");
            java.io.File file2 = new java.io.File(getFilesDir(), "SavedClientParameters.data.cs");
            java.io.File file3 = new java.io.File(getFilesDir(), kotlin.jvm.internal.Intrinsics.stringPlus("DATA_ServerControlledParametersManager.data.", getPackageName()));
            java.io.File file4 = new java.io.File(getFilesDir(), kotlin.jvm.internal.Intrinsics.stringPlus("DATA_ServerControlledParametersManager.data.v1.", getPackageName()));
            file.delete();
            file2.delete();
            file3.delete();
            file4.delete();
            sharedPreferences.edit().putBoolean("fixed", true).apply();
        } catch (java.lang.Exception unused) {
        }
    }
}
