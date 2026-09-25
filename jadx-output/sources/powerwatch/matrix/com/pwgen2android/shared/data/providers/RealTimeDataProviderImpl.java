package powerwatch.matrix.com.pwgen2android.shared.data.providers;

/* JADX INFO: compiled from: RealTimeDataProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u001c\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\"H\u0002J\u0018\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00104\u001a\u00020\"H\u0002J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0-H\u0016J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020/0-2\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\" #*\u0012\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"\u0018\u00010!0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "walkingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;", "restingDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;", "sleepDayPeriodDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;", "goalsRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "realtimeDataExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;", "heartRateDataExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;", "notificationManager", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "languageController", "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;", "settingsDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;", "rxBus", "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;", "appContext", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroid/content/Context;)V", "currentStatusDataObservable", "Lio/reactivex/observables/ConnectableObservable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;", "kotlin.jvm.PlatformType", "calculateAvgHeartRate", "", "walkingDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;", "restingDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;", "sleepDay", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;", "loadData", "Lio/reactivex/Observable;", "", "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;", "page", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;", "mapRealTimeExecutorDataToPeriods", "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;", "realtimeWatchData", "mapToRealTimeData", "periodsContainer", "goals", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "mapToUIRealtimeNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;", "observeCurrentData", "observeData", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RealTimeDataProviderImpl implements powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final android.content.Context appContext;
    private final io.reactivex.observables.ConnectableObservable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> currentStatusDataObservable;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor heartRateDataExecutor;
    private final powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController;
    private final powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor realtimeDataExecutor;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider settingsDataProvider;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData m3148currentStatusDataObservable$lambda6$lambda4(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData data, java.lang.Object event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        return data;
    }

    public RealTimeDataProviderImpl(powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.WalkingDayPeriodDataProvider walkingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.RestingDayPeriodDataProvider restingDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.providers.activities.day.SleepDayPeriodDataProvider sleepDayPeriodDataProvider, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalsRepository, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeDataExecutor realtimeDataExecutor, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2RealtimeHeartRateExecutor heartRateDataExecutor, powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, powerwatch.matrix.com.pwgen2android.utils.LanguageController languageController, powerwatch.matrix.com.pwgen2android.shared.data.providers.SettingsDataProvider settingsDataProvider, powerwatch.matrix.com.pwgen2android.shared.RxBus rxBus, android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingDayPeriodDataProvider, "walkingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingDayPeriodDataProvider, "restingDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepDayPeriodDataProvider, "sleepDayPeriodDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsRepository, "goalsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realtimeDataExecutor, "realtimeDataExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRateDataExecutor, "heartRateDataExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(languageController, "languageController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDataProvider, "settingsDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBus, "rxBus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.walkingDayPeriodDataProvider = walkingDayPeriodDataProvider;
        this.restingDayPeriodDataProvider = restingDayPeriodDataProvider;
        this.sleepDayPeriodDataProvider = sleepDayPeriodDataProvider;
        this.goalsRepository = goalsRepository;
        this.deviceManager = deviceManager;
        this.realtimeDataExecutor = realtimeDataExecutor;
        this.heartRateDataExecutor = heartRateDataExecutor;
        this.notificationManager = notificationManager;
        this.deviceCommunicationQueuer = deviceCommunicationQueuer;
        this.userPrefsUtils = userPrefsUtils;
        this.languageController = languageController;
        this.settingsDataProvider = settingsDataProvider;
        this.rxBus = rxBus;
        this.appContext = appContext;
        io.reactivex.observables.ConnectableObservable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> connectableObservableReplay = powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(deviceManager, false, 1, null).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$clWOIto0eHlJJIfZNrlZ-gsKz5g
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3143currentStatusDataObservable$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$91f6rOtfjzg3LnFwarxxfF6m4oE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3150currentStatusDataObservable$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }).retry().repeat().replay(1);
        this.currentStatusDataObservable = connectableObservableReplay;
        connectableObservableReplay.connect();
        java.lang.String languageKey = languageController.getAppLanguage(appContext).getLanguageKey();
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.setIncomingCallString(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.getIncomingCallString(languageKey));
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEventKt.setMissedCallString(powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.getMissedCallString(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setBatteryTitle(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryTitle(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setBatteryLowMessage(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryLowMessage(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setBatteryCriticalMessage(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryCriticalMessage(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchConnectedTitle(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchConnectedTitle(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchConnectedBody(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchConnectedBody(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchDisconnectedTitle(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchDisconnectedTitle(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setWatchDisconnectedBody(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchDisconnectedBody(languageKey));
        powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.setGoalsAchievedResource(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getGoalMessage(languageKey));
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3143currentStatusDataObservable$lambda6(final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (deviceInfo.isConnected() && deviceInfo.isGen2()) {
            io.reactivex.Observable observableCombineLatest = io.reactivex.Observable.combineLatest(io.reactivex.Observable.interval(0L, 20L, java.util.concurrent.TimeUnit.SECONDS).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3144currentStatusDataObservable$lambda6$lambda0(this.f$0, deviceInfo, (java.lang.Long) obj);
                }
            }), this$0.heartRateDataExecutor.receiveData(deviceInfo.getUid()).startWith(0L).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$AhHRjfsDkLnGIWs6ZTuEMFslJJc
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3145currentStatusDataObservable$lambda6$lambda1((java.lang.Long) obj);
                }
            }), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA
                @Override // io.reactivex.functions.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3146currentStatusDataObservable$lambda6$lambda2((powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj, (java.lang.Long) obj2);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(\n                            Observable.interval(0, 20, TimeUnit.SECONDS)\n//                                    .flatMap { deviceManager.connect() }\n                                    .flatMap {\n                                        deviceCommunicationQueuer.queue(DeviceCommunicationOperation(realtimeDataExecutor.readData(deviceInfo.uid)))\n                                    }, heartRateDataExecutor.receiveData(deviceInfo.uid).startWith(0).doOnNext {\n                        println(\"settings_data_heart_rate\")\n                    }, BiFunction<RealtimeWatchData, Long, RealtimeWatchData> { realtime, heartRate ->\n                        realtime.heartRate = heartRate\n                        realtime\n                    })");
            return io.reactivex.Observable.combineLatest(observableCombineLatest, this$0.rxBus.getEvents().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$fFDEl86NkOAb0hbuwWBco7sW-zE
                @Override // io.reactivex.functions.Predicate
                public final boolean test(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3147currentStatusDataObservable$lambda6$lambda3(obj);
                }
            }).startWith(powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent.INSTANCE), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$sgyMazgUt1ud0gCmcDTDGYI2JqQ
                @Override // io.reactivex.functions.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3148currentStatusDataObservable$lambda6$lambda4((powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj, obj2);
                }
            }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$8PfVV4ueU1xTFZjgg_Uz1nQwql8
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3149currentStatusDataObservable$lambda6$lambda5(this.f$0, deviceInfo, (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
                }
            });
        }
        return io.reactivex.Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3144currentStatusDataObservable$lambda6$lambda0(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, java.lang.Long it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(this$0.realtimeDataExecutor.readData(deviceInfo.getUid()), null, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6$lambda-1, reason: not valid java name */
    public static final void m3145currentStatusDataObservable$lambda6$lambda1(java.lang.Long l) {
        java.lang.System.out.println((java.lang.Object) "settings_data_heart_rate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData m3146currentStatusDataObservable$lambda6$lambda2(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtime, java.lang.Long heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realtime, "realtime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        realtime.setHeartRate(heartRate.longValue());
        return realtime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6$lambda-3, reason: not valid java name */
    public static final boolean m3147currentStatusDataObservable$lambda6$lambda3(java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof powerwatch.matrix.com.pwgen2android.shared.DataReloadEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-6$lambda-5, reason: not valid java name */
    public static final void m3149currentStatusDataObservable$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager = this$0.notificationManager;
        android.content.Context context = this$0.appContext;
        java.lang.String deviceName = deviceInfo.getDeviceName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        notificationManager.showConnectionNotification(context, deviceName, this$0.mapToUIRealtimeNotification(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: currentStatusDataObservable$lambda-7, reason: not valid java name */
    public static final void m3150currentStatusDataObservable$lambda7(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Realtime data obs error, will retry subscription", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> observeCurrentData() {
        io.reactivex.observables.ConnectableObservable<powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData> currentStatusDataObservable = this.currentStatusDataObservable;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentStatusDataObservable, "currentStatusDataObservable");
        return currentStatusDataObservable;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.DataProvider
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData>> loadData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> observeData(final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "page");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3156observeData$lambda12(this.f$0, page);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n\n        val walkingData = walkingDayPeriodDataProvider\n                .loadData(page)\n\n        val restingData = restingDayPeriodDataProvider\n                .loadData(page)\n\n        val sleepData = sleepDayPeriodDataProvider\n                // correctedOffset = SLEEP_DEFAULT_CORRECTED_OFFSET\n                .loadData(page.copy(offset = page.offset))\n\n\n        val result =\n\n                Observable.combineLatest(deviceManager.connect()\n                        .switchMap { deviceInfo ->\n                            if (!deviceInfo.isConnected || !page.isToday || !deviceInfo.isGen2) {\n                                return@switchMap Observable\n                                        .zip(walkingData, restingData, sleepData,\n                                                Function3<List<WalkingDayPeriod>, List<RestingDayPeriod>, List<SleepDayPeriod>, PeriodsContainer>\n                                                { walk, rest, sleep ->\n                                                    PeriodsContainer(\n                                                            walkingDayPeriods = walk,\n                                                            restingDayPeriods = rest,\n                                                            sleepDayPeriods = sleep)\n                                                }\n                                        )\n                            }\n                            return@switchMap currentStatusDataObservable\n                                    .map {\n                                        mapRealTimeExecutorDataToPeriods(it)\n                                    }\n                        }, goalsRepository.load(fromCache = true),\n                        BiFunction<PeriodsContainer, GoalConfiguration, RealTimeData> { periodsData, goal ->\n                            mapToRealTimeData(\n                                    periodsData,\n                                    goal)\n                        })\n\n\n        result\n\n\n    }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeData$lambda-12, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3156observeData$lambda12(final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        final io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod>> observableLoadData = this$0.walkingDayPeriodDataProvider.loadData(page);
        final io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod>> observableLoadData2 = this$0.restingDayPeriodDataProvider.loadData(page);
        final io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod>> observableLoadData3 = this$0.sleepDayPeriodDataProvider.loadData(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page.copy$default(page, 0, page.getOffset(), 0L, 0, 13, null));
        io.reactivex.Observable observableCombineLatest = io.reactivex.Observable.combineLatest(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(this$0.deviceManager, false, 1, null).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3157observeData$lambda12$lambda10(page, observableLoadData, observableLoadData2, observableLoadData3, this$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(this$0.goalsRepository, true, false, 2, null), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$eyLR6axafU6-pOuXYi-JBKoOUi8
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3160observeData$lambda12$lambda11(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer) obj, (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) obj2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(deviceManager.connect()\n                        .switchMap { deviceInfo ->\n                            if (!deviceInfo.isConnected || !page.isToday || !deviceInfo.isGen2) {\n                                return@switchMap Observable\n                                        .zip(walkingData, restingData, sleepData,\n                                                Function3<List<WalkingDayPeriod>, List<RestingDayPeriod>, List<SleepDayPeriod>, PeriodsContainer>\n                                                { walk, rest, sleep ->\n                                                    PeriodsContainer(\n                                                            walkingDayPeriods = walk,\n                                                            restingDayPeriods = rest,\n                                                            sleepDayPeriods = sleep)\n                                                }\n                                        )\n                            }\n                            return@switchMap currentStatusDataObservable\n                                    .map {\n                                        mapRealTimeExecutorDataToPeriods(it)\n                                    }\n                        }, goalsRepository.load(fromCache = true),\n                        BiFunction<PeriodsContainer, GoalConfiguration, RealTimeData> { periodsData, goal ->\n                            mapToRealTimeData(\n                                    periodsData,\n                                    goal)\n                        })");
        return observableCombineLatest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeData$lambda-12$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m3157observeData$lambda12$lambda10(powerwatch.matrix.com.pwgen2android.shared.data.repositories.Page page, io.reactivex.Observable walkingData, io.reactivex.Observable restingData, io.reactivex.Observable sleepData, final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "$page");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walkingData, "$walkingData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restingData, "$restingData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepData, "$sleepData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (!deviceInfo.isConnected() || !page.isToday() || !deviceInfo.isGen2()) {
            return io.reactivex.Observable.zip(walkingData, restingData, sleepData, new io.reactivex.functions.Function3() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU
                @Override // io.reactivex.functions.Function3
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3158observeData$lambda12$lambda10$lambda8((java.util.List) obj, (java.util.List) obj2, (java.util.List) obj3);
                }
            });
        }
        return this$0.currentStatusDataObservable.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.providers.-$$Lambda$RealTimeDataProviderImpl$olxJCW3iFl7d6eIvma_MfPSYYfg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl.m3159observeData$lambda12$lambda10$lambda9(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeData$lambda-12$lambda-10$lambda-8, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer m3158observeData$lambda12$lambda10$lambda8(java.util.List walk, java.util.List rest, java.util.List sleep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walk, "walk");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rest, "rest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleep, "sleep");
        return new powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer(null, walk, rest, sleep, null, null, null, null, null, null, null, 2033, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeData$lambda-12$lambda-10$lambda-9, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer m3159observeData$lambda12$lambda10$lambda9(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.mapRealTimeExecutorDataToPeriods(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeData$lambda-12$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData m3160observeData$lambda12$lambda11(powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProviderImpl this$0, powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsData, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(periodsData, "periodsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "goal");
        return this$0.mapToRealTimeData(periodsData, goal);
    }

    private final powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer mapRealTimeExecutorDataToPeriods(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
        return new powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer(null, null, null, null, null, null, null, null, null, null, realtimeWatchData, 1023, null);
    }

    private final powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData mapToRealTimeData(powerwatch.matrix.com.pwgen2android.shared.sync.PeriodsContainer periodsContainer, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goals) {
        if (periodsContainer.getRealtimeWatchData() != null) {
            int totalSteps = periodsContainer.getRealtimeWatchData().getTotalSteps();
            float totalDistance = periodsContainer.getRealtimeWatchData().getTotalDistance();
            int totalActiveCalories = periodsContainer.getRealtimeWatchData().getTotalActiveCalories();
            int totalSleep = periodsContainer.getRealtimeWatchData().getTotalSleep();
            return new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData(new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(periodsContainer.getRealtimeWatchData().getTotalThermalPower(), goals.getPower()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(periodsContainer.getRealtimeWatchData().getTotalSolarPower(), goals.getPower()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(totalSteps, goals.getSteps()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(totalDistance, goals.getDistance()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(periodsContainer.getRealtimeWatchData().getHeartRate(), 0.0f, 2, null), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(totalActiveCalories, goals.getCalories()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(totalSleep, goals.getSleep()));
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) periodsContainer.getWalkingDayPeriods());
        if (walkingDayPeriod == null) {
            walkingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod(0L, 0L, 0, 0, null, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0d, 0, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) periodsContainer.getRestingDayPeriods());
        if (restingDayPeriod == null) {
            restingDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, 4194303, null);
        }
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDayPeriod = (powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) periodsContainer.getSleepDayPeriods());
        if (sleepDayPeriod == null) {
            sleepDayPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod(0L, 0L, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, null, 0, null, 0L, 0, 0.0f, 0.0f, 0.0f, androidx.core.view.ViewCompat.MEASURED_SIZE_MASK, null);
        }
        float f = 60;
        float bodyPower = ((walkingDayPeriod.getBodyPower() + restingDayPeriod.getBodyPower()) + sleepDayPeriod.getBodyPower()) / f;
        float solarPower = ((walkingDayPeriod.getSolarPower() + restingDayPeriod.getSolarPower()) + sleepDayPeriod.getSolarPower()) / f;
        int steps = walkingDayPeriod.getSteps();
        double dDivide = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divide((java.lang.Number) java.lang.Double.valueOf(walkingDayPeriod.getDistance()), 1000);
        float fCalculateAvgHeartRate = (float) calculateAvgHeartRate(walkingDayPeriod, restingDayPeriod, sleepDayPeriod);
        int iDivideRounded = powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(walkingDayPeriod.getActiveCalories() + restingDayPeriod.getActiveCalories() + sleepDayPeriod.getActiveCalories()), 1000);
        powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.divideRounded((java.lang.Number) java.lang.Integer.valueOf(walkingDayPeriod.getBmrCalories() + restingDayPeriod.getBmrCalories() + sleepDayPeriod.getBmrCalories()), 1000);
        return new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeData(new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(bodyPower, goals.getPower()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(solarPower, goals.getPower()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(steps, goals.getSteps()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue((float) dDivide, goals.getDistance()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(fCalculateAvgHeartRate, 0.0f, 2, null), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue(iDivideRounded, goals.getCalories()), new powerwatch.matrix.com.pwgen2android.main.dashboard.realtime.RealTimeValue((sleepDayPeriod.getEndTime() - sleepDayPeriod.getStartTime()) / ((long) 60000), goals.getSleep()));
    }

    private final double calculateAvgHeartRate(powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingDayPeriod walkingDay, powerwatch.matrix.com.pwgen2android.shared.data.models.RestingDayPeriod restingDay, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepDayPeriod sleepDay) {
        int minsInPeriod;
        int minsInPeriod2;
        walkingDay.getHeartRate();
        restingDay.getHeartRate();
        sleepDay.getHeartRate();
        if (walkingDay.getHeartRate() > 0.0f) {
            minsInPeriod2 = walkingDay.getMinsInPeriod();
        } else {
            if (restingDay.getHeartRate() > 0.0f) {
                minsInPeriod = restingDay.getMinsInPeriod();
            } else {
                minsInPeriod = (sleepDay.getHeartRate() > 0.0f ? sleepDay.getMinsInPeriod() : 0) + 0;
            }
            minsInPeriod2 = minsInPeriod + 0;
        }
        if (minsInPeriod2 == 0) {
            return 0.0d;
        }
        double heartRate = ((double) walkingDay.getHeartRate()) * (((double) walkingDay.getMinsInPeriod()) / ((double) minsInPeriod2));
        restingDay.getHeartRate();
        restingDay.getMinsInPeriod();
        sleepDay.getHeartRate();
        sleepDay.getMinsInPeriod();
        return heartRate;
    }

    private final powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification mapToUIRealtimeNotification(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData) {
        java.lang.String strValueOf = java.lang.String.valueOf(realtimeWatchData.getTotalSteps());
        kotlin.Pair<java.lang.Float, java.lang.String> value = this.userPrefsUtils.getValue(java.lang.Float.valueOf(realtimeWatchData.getTotalDistance()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.DISTANCE.INSTANCE);
        kotlin.Pair<java.lang.Float, java.lang.String> value2 = this.userPrefsUtils.getValue(java.lang.Integer.valueOf(realtimeWatchData.getTotalActiveCalories()), powerwatch.matrix.com.pwgen2android.utils.MetricsConvertType.CALORIES.INSTANCE);
        return new powerwatch.matrix.com.pwgen2android.shared.localNotifications.UIRealtimeDataNotification(strValueOf, new kotlin.Pair(java.lang.String.valueOf(kotlin.math.MathKt.roundToInt(value2.getFirst().floatValue())), value2.getSecond()), new kotlin.Pair(powerwatch.matrix.com.pwgen2android.shared.extensions.NumberExtensionsKt.twoDecimalsFormat(value.getFirst().floatValue()), value.getSecond()), java.lang.String.valueOf(realtimeWatchData.getHeartRate()));
    }
}
