package powerwatch.matrix.com.pwgen2android.main.battery;

/* JADX INFO: compiled from: BatteryNotificationCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;", "", "notificationManager", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;", "batteryNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "goalConfigurationRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;", "goalsNotificationPersistence", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;", "userPrefsUtils", "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;", "context", "Landroid/content/Context;", "realTimeDataProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;", "(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getChangeLevel", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", "oldLevel", "", "newLevel", "onCreate", "", "onDestroy", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BatteryNotificationCenter {
    private final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final android.content.Context context;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository;
    private final powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence;
    private final powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager;
    private final powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider;
    private final powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils;

    public BatteryNotificationCenter(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batteryNotificationPersistence, "batteryNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalConfigurationRepository, "goalConfigurationRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsNotificationPersistence, "goalsNotificationPersistence");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userPrefsUtils, "userPrefsUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeDataProvider, "realTimeDataProvider");
        this.notificationManager = notificationManager;
        this.batteryNotificationPersistence = batteryNotificationPersistence;
        this.deviceManager = deviceManager;
        this.goalConfigurationRepository = goalConfigurationRepository;
        this.goalsNotificationPersistence = goalsNotificationPersistence;
        this.userPrefsUtils = userPrefsUtils;
        this.context = context;
        this.realTimeDataProvider = realTimeDataProvider;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
    }

    public /* synthetic */ BatteryNotificationCenter(powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager, powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationPersistence batteryNotificationPersistence, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.shared.data.repositories.GoalConfigurationRepository goalConfigurationRepository, powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtils userPrefsUtils, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.providers.RealTimeDataProvider realTimeDataProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationManager, batteryNotificationPersistence, deviceManager, goalConfigurationRepository, goalsNotificationPersistence, userPrefsUtils, context, (i & 128) != 0 ? new powerwatch.matrix.com.pwgen2android.main.battery.MockProvider() : realTimeDataProvider);
    }

    private final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel getChangeLevel(float oldLevel, float newLevel) {
        powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel level = powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.INSTANCE.getLevel(newLevel);
        if (level.getThreshold() < powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.INSTANCE.getLevel(oldLevel).getThreshold()) {
            return level;
        }
        return null;
    }

    public final void onCreate() {
        this.compositeDisposable.add(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(this.deviceManager, false, 1, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$2_R-SdFP_NtJ4NwArSIAkpvqOlo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1640onCreate$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$3ajIp8jImVgNLsWF-2MVJ6yrgh4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1646onCreate$lambda6(this.f$0, (kotlin.Triple) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$dwnqk42ZYMVigCTo3yDHl-lmqBo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1640onCreate$lambda5(final powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter this$0, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        io.reactivex.Observable observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (deviceInfo.isConnected()) {
            observableJust = this$0.realTimeDataProvider.observeCurrentData().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$hQaX6v5Rxhzg-YyR5vcca940Oqs
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1641onCreate$lambda5$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) obj);
                }
            }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$lA958QMTVtM-4l7xuoavUWet_e8
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1644onCreate$lambda5$lambda3(deviceInfo, (kotlin.Pair) obj);
                }
            }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$p2Fc2aPxZbxIor01eDnkZpmChkw
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1645onCreate$lambda5$lambda4(this.f$0, (kotlin.Pair) obj);
                }
            });
        } else {
            observableJust = io.reactivex.Observable.just(new kotlin.Triple(deviceInfo, null, powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit));
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-5$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1641onCreate$lambda5$lambda2(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter this$0, final powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.data.repositories.AllRepository.DefaultImpls.all$default(this$0.goalConfigurationRepository, null, true, 1, null).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1642onCreate$lambda5$lambda2$lambda0((java.util.List) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.battery.-$$Lambda$BatteryNotificationCenter$xJZYLH3bnT0hAuA0UTjrRlIPS3U
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter.m1643onCreate$lambda5$lambda2$lambda1(it, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-5$lambda-2$lambda-0, reason: not valid java name */
    public static final boolean m1642onCreate$lambda5$lambda2$lambda0(java.util.List it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !it.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-5$lambda-2$lambda-1, reason: not valid java name */
    public static final kotlin.Pair m1643onCreate$lambda5$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData it, java.util.List goals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
        return new kotlin.Pair(goals.get(0), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-5$lambda-3, reason: not valid java name */
    public static final kotlin.Pair m1644onCreate$lambda5$lambda3(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Pair(deviceInfo, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-5$lambda-4, reason: not valid java name */
    public static final kotlin.Triple m1645onCreate$lambda5$lambda4(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter this$0, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new kotlin.Triple(it.getFirst(), it.getSecond(), kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this$0.userPrefsUtils.isMetricsUsedOrNull(), (java.lang.Object) true) ? powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.metricCaloriesUnit : powerwatch.matrix.com.pwgen2android.utils.UserPrefsUtilsKt.imperialCaloriesUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCreate$lambda-6, reason: not valid java name */
    public static final void m1646onCreate$lambda6(powerwatch.matrix.com.pwgen2android.main.battery.BatteryNotificationCenter this$0, kotlin.Triple triple) {
        powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("mock_receive - received level main ", triple.getSecond()));
        kotlin.Pair pair = (kotlin.Pair) triple.getSecond();
        java.lang.Object first = triple.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(first, "it.first");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) first;
        java.lang.String str2 = (java.lang.String) triple.getThird();
        if (deviceInfo.isConnected() && pair != null) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = (powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration) pair.getFirst();
            java.lang.Object second = pair.getSecond();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(second, "goalsWatchData.second");
            powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData realtimeWatchData2 = (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) second;
            kotlin.Pair pair2 = (kotlin.Pair) triple.getSecond();
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) ((pair2 == null || (realtimeWatchData = (powerwatch.matrix.com.pwgen2android.sdk.RealtimeWatchData) pair2.getSecond()) == null) ? null : java.lang.Boolean.valueOf(realtimeWatchData.isBatteryValid())), (java.lang.Object) true)) {
                powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel changeLevel = this$0.getChangeLevel(this$0.batteryNotificationPersistence.getBatteryLevelChange(deviceInfo.getUid()).getThreshold(), realtimeWatchData2.getBatteryPercent());
                this$0.batteryNotificationPersistence.storeBatteryLevelChange(deviceInfo.getUid(), realtimeWatchData2.getBatteryPercent());
                if (changeLevel != null) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(changeLevel, powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Critical.INSTANCE)) {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        str = java.lang.String.format(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryCriticalMessage(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(realtimeWatchData2.getBatteryPercent())}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                    } else {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        str = java.lang.String.format(powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryLowMessage(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(realtimeWatchData2.getBatteryPercent())}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                    }
                    this$0.notificationManager.showBatteryNotification(deviceInfo.getUid(), this$0.context, powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getBatteryTitle(), str);
                }
            }
            powerwatch.matrix.com.pwgen2android.main.battery.GoalResource goalsAchievedResource = powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getGoalsAchievedResource();
            if (goalConfiguration.getSteps() <= realtimeWatchData2.getTotalSteps() && !this$0.goalsNotificationPersistence.isGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Steps.INSTANCE)) {
                powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.setGoalsHit$default(this$0.goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Steps.INSTANCE, false, 2, null);
                powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager = this$0.notificationManager;
                java.lang.String uid = ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) triple.getFirst()).getUid();
                android.content.Context context = this$0.context;
                java.lang.String title = goalsAchievedResource.getTitle();
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject3 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String str3 = java.lang.String.format(goalsAchievedResource.getStepsReached(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(goalConfiguration.getSteps())}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "java.lang.String.format(format, *args)");
                notificationManager.showGoalsAchievedMessage(uid, context, title, str3);
            }
            if (goalConfiguration.getCalories() <= realtimeWatchData2.getTotalActiveCalories() && !this$0.goalsNotificationPersistence.isGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Calories.INSTANCE)) {
                powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.setGoalsHit$default(this$0.goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Calories.INSTANCE, false, 2, null);
                powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager2 = this$0.notificationManager;
                java.lang.String uid2 = ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) triple.getFirst()).getUid();
                android.content.Context context2 = this$0.context;
                java.lang.String title2 = goalsAchievedResource.getTitle();
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject4 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String str4 = java.lang.String.format(goalsAchievedResource.getCaloriesReached(), java.util.Arrays.copyOf(new java.lang.Object[]{goalConfiguration.getCalories() + str2}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
                notificationManager2.showGoalsAchievedMessage(uid2, context2, title2, str4);
            }
            if (goalConfiguration.getSleep() <= realtimeWatchData2.getTotalSleep() && !this$0.goalsNotificationPersistence.isGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Sleep.INSTANCE)) {
                powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.setGoalsHit$default(this$0.goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Sleep.INSTANCE, false, 2, null);
                powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager3 = this$0.notificationManager;
                java.lang.String uid3 = ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) triple.getFirst()).getUid();
                android.content.Context context3 = this$0.context;
                java.lang.String title3 = goalsAchievedResource.getTitle();
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String str5 = java.lang.String.format(goalsAchievedResource.getSleepsReached(), java.util.Arrays.copyOf(new java.lang.Object[]{powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.minutesToHoursAndMinutesFormat$default(goalConfiguration.getSleep(), false, 1, null)}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "java.lang.String.format(format, *args)");
                notificationManager3.showGoalsAchievedMessage(uid3, context3, title3, str5);
            }
            if (goalConfiguration.getPower() > realtimeWatchData2.getTotalThermalPower() || this$0.goalsNotificationPersistence.isGoalsHit(powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Power.INSTANCE)) {
                return;
            }
            powerwatch.matrix.com.pwgen2android.main.notification.GoalsNotificationPersistence.setGoalsHit$default(this$0.goalsNotificationPersistence, powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Power.INSTANCE, false, 2, null);
            powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager4 = this$0.notificationManager;
            java.lang.String uid4 = ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) triple.getFirst()).getUid();
            android.content.Context context4 = this$0.context;
            java.lang.String title4 = goalsAchievedResource.getTitle();
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject6 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str6 = java.lang.String.format(goalsAchievedResource.getPowerReached(), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(goalConfiguration.getPower())}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "java.lang.String.format(format, *args)");
            notificationManager4.showGoalsAchievedMessage(uid4, context4, title4, str6);
            return;
        }
        this$0.notificationManager.dismissBatteryNotification(this$0.context);
    }

    public final void onDestroy() {
        this.compositeDisposable.clear();
    }
}
