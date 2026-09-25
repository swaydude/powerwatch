.class public final Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;
.super Ljava/lang/Object;
.source "RealTimeDataProvider.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0002\u0010\u001fJ \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u001c\u0010,\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020/0.0-2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\"H\u0002J\u0018\u00105\u001a\u00020/2\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00104\u001a\u00020\"H\u0002J\u000e\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\"0-H\u0016J\u0016\u0010<\u001a\u0008\u0012\u0004\u0012\u00020/0-2\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\u000c\u0012\n #*\u0004\u0018\u00010\"0\" #*\u0012\u0012\u000c\u0012\n #*\u0004\u0018\u00010\"0\"\u0018\u00010!0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "walkingDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;",
        "restingDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;",
        "sleepDayPeriodDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;",
        "goalsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "realtimeDataExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;",
        "heartRateDataExecutor",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;",
        "notificationManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "settingsDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "appContext",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroid/content/Context;)V",
        "currentStatusDataObservable",
        "Lio/reactivex/observables/ConnectableObservable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
        "kotlin.jvm.PlatformType",
        "calculateAvgHeartRate",
        "",
        "walkingDay",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;",
        "restingDay",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;",
        "sleepDay",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;",
        "loadData",
        "Lio/reactivex/Observable;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
        "page",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
        "mapRealTimeExecutorDataToPeriods",
        "Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;",
        "realtimeWatchData",
        "mapToRealTimeData",
        "periodsContainer",
        "goals",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;",
        "mapToUIRealtimeNotification",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;",
        "observeCurrentData",
        "observeData",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final currentStatusDataObservable:Lio/reactivex/observables/ConnectableObservable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/observables/ConnectableObservable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final heartRateDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

.field private final realtimeDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;

.field private final restingDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

.field private final sleepDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

.field private final walkingDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Landroid/content/Context;)V
    .locals 1

    const-string v0, "walkingDayPeriodDataProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restingDayPeriodDataProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepDayPeriodDataProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realtimeDataExecutor"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRateDataExecutor"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationManager"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceCommunicationQueuer"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settingsDataProvider"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBus"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->walkingDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;

    .line 50
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->restingDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;

    .line 51
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->sleepDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

    .line 52
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 53
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 54
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->realtimeDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;

    .line 55
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->heartRateDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;

    .line 56
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    .line 57
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    .line 58
    iput-object p10, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 59
    iput-object p11, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 60
    iput-object p12, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->settingsDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/SettingsDataProvider;

    .line 61
    iput-object p13, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 62
    iput-object p14, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->appContext:Landroid/content/Context;

    const/4 p1, 0x0

    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 65
    invoke-static {p5, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 66
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$clWOIto0eHlJJIfZNrlZ-gsKz5g;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$clWOIto0eHlJJIfZNrlZ-gsKz5g;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 94
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$91f6rOtfjzg3LnFwarxxfF6m4oE;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$91f6rOtfjzg3LnFwarxxfF6m4oE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p1

    .line 98
    invoke-virtual {p1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object p1

    .line 99
    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->replay(I)Lio/reactivex/observables/ConnectableObservable;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable:Lio/reactivex/observables/ConnectableObservable;

    .line 102
    invoke-virtual {p1}, Lio/reactivex/observables/ConnectableObservable;->connect()Lio/reactivex/disposables/Disposable;

    .line 103
    invoke-interface {p11, p14}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;->getAppLanguage(Landroid/content/Context;)Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/LanguageInfo;->getLanguageKey()Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtilsKt;->getIncomingCallString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->setIncomingCallString(Ljava/lang/String;)V

    .line 105
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtilsKt;->getMissedCallString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEventKt;->setMissedCallString(Ljava/lang/String;)V

    .line 107
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setBatteryTitle(Ljava/lang/String;)V

    .line 108
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryLowMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setBatteryLowMessage(Ljava/lang/String;)V

    .line 109
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryCriticalMessage(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setBatteryCriticalMessage(Ljava/lang/String;)V

    .line 111
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchConnectedTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchConnectedTitle(Ljava/lang/String;)V

    .line 112
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchConnectedBody(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchConnectedBody(Ljava/lang/String;)V

    .line 113
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchDisconnectedTitle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchDisconnectedTitle(Ljava/lang/String;)V

    .line 114
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchDisconnectedBody(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setWatchDisconnectedBody(Ljava/lang/String;)V

    .line 116
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getGoalMessage(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;

    move-result-object p1

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->setGoalsAchievedResource(Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;)V

    return-void
.end method

.method private final calculateAvgHeartRate(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)D
    .locals 7

    .line 228
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getHeartRate()F

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getHeartRate()F

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getHeartRate()F

    .line 230
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getHeartRate()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinsInPeriod()I

    move-result v0

    goto :goto_2

    .line 231
    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getHeartRate()F

    move-result v0

    const/4 v2, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinsInPeriod()I

    move-result v0

    goto :goto_1

    .line 232
    :cond_1
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getHeartRate()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v0, v2

    :goto_1
    add-int/2addr v0, v2

    :goto_2
    if-nez v0, :cond_3

    const-wide/16 p1, 0x0

    return-wide p1

    .line 237
    :cond_3
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getHeartRate()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getMinsInPeriod()I

    move-result p1

    int-to-double v3, p1

    int-to-double v5, v0

    div-double/2addr v3, v5

    mul-double v1, v1, v3

    .line 238
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getHeartRate()F

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getMinsInPeriod()I

    .line 239
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getHeartRate()F

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getMinsInPeriod()I

    return-wide v1
.end method

.method private static final currentStatusDataObservable$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isGen2()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x14

    .line 69
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Lio/reactivex/Observable;->interval(JJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    .line 71
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$oHlUOtiRfA1Qv4T8SXAANIRuwjU;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 73
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->heartRateDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->receiveData(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$AhHRjfsDkLnGIWs6ZTuEMFslJJc;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$AhHRjfsDkLnGIWs6ZTuEMFslJJc;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Bpt8YZRWUEtSKiqbKcddBjojmNA;

    .line 68
    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "combineLatest(\n                            Observable.interval(0, 20, TimeUnit.SECONDS)\n//                                    .flatMap { deviceManager.connect() }\n                                    .flatMap {\n                                        deviceCommunicationQueuer.queue(DeviceCommunicationOperation(realtimeDataExecutor.readData(deviceInfo.uid)))\n                                    }, heartRateDataExecutor.receiveData(deviceInfo.uid).startWith(0).doOnNext {\n                        println(\"settings_data_heart_rate\")\n                    }, BiFunction<RealtimeWatchData, Long, RealtimeWatchData> { realtime, heartRate ->\n                        realtime.heartRate = heartRate\n                        realtime\n                    })"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    check-cast v0, Lio/reactivex/ObservableSource;

    .line 82
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->getEvents()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$fFDEl86NkOAb0hbuwWBco7sW-zE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$fFDEl86NkOAb0hbuwWBco7sW-zE;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    .line 83
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->startWith(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$sgyMazgUt1ud0gCmcDTDGYI2JqQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$sgyMazgUt1ud0gCmcDTDGYI2JqQ;

    .line 80
    invoke-static {v0, v1, v2}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 87
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$8PfVV4ueU1xTFZjgg_Uz1nQwql8;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$8PfVV4ueU1xTFZjgg_Uz1nQwql8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 91
    :cond_0
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final currentStatusDataObservable$lambda-6$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Long;)Lio/reactivex/ObservableSource;
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->realtimeDataExecutor:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->readData(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;-><init>(Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final currentStatusDataObservable$lambda-6$lambda-1(Ljava/lang/Long;)V
    .locals 1

    .line 74
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v0, "settings_data_heart_rate"

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final currentStatusDataObservable$lambda-6$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 2

    const-string v0, "realtime"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "heartRate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->setHeartRate(J)V

    return-object p0
.end method

.method private static final currentStatusDataObservable$lambda-6$lambda-3(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    instance-of p0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/DataReloadEvent;

    return p0
.end method

.method private static final currentStatusDataObservable$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 1

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final currentStatusDataObservable$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->appContext:Landroid/content/Context;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "it"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->mapToUIRealtimeNotification(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;

    move-result-object p0

    invoke-interface {v0, v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showConnectionNotification(Landroid/content/Context;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;)V

    return-void
.end method

.method private static final currentStatusDataObservable$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Realtime data obs error, will retry subscription"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic lambda$8PfVV4ueU1xTFZjgg_Uz1nQwql8(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V

    return-void
.end method

.method public static synthetic lambda$91f6rOtfjzg3LnFwarxxfF6m4oE(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-7(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$AhHRjfsDkLnGIWs6ZTuEMFslJJc(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6$lambda-1(Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic lambda$Bpt8YZRWUEtSKiqbKcddBjojmNA(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Long;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Cp8zCp_EFmgByTzv2-M8Wi3w0sg(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->observeData$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$clWOIto0eHlJJIfZNrlZ-gsKz5g(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ejwoPofvc-3vncyTTmkotyrClP4(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->observeData$lambda-12$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$eyLR6axafU6-pOuXYi-JBKoOUi8(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->observeData$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fFDEl86NkOAb0hbuwWBco7sW-zE(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6$lambda-3(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$oHlUOtiRfA1Qv4T8SXAANIRuwjU(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Long;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/Long;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$olxJCW3iFl7d6eIvma_MfPSYYfg(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->observeData$lambda-12$lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$sgyMazgUt1ud0gCmcDTDGYI2JqQ(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$xTmHo1O7qmyrHZlxQcblswCtPZU(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->observeData$lambda-12$lambda-10$lambda-8(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    move-result-object p0

    return-object p0
.end method

.method private final mapRealTimeExecutorDataToPeriods(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;
    .locals 15

    .line 172
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v12, 0x3ff

    const/4 v13, 0x0

    move-object v0, v14

    move-object/from16 v11, p1

    invoke-direct/range {v0 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v14
.end method

.method private final mapToRealTimeData(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;
    .locals 36

    .line 178
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalSteps()I

    move-result v0

    .line 180
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v4

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalDistance()F

    move-result v4

    .line 181
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalActiveCalories()I

    move-result v5

    .line 182
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalSleep()I

    move-result v6

    .line 183
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalThermalPower()I

    move-result v7

    int-to-float v7, v7

    .line 184
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalSolarPower()I

    move-result v8

    int-to-float v8, v8

    .line 185
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRealtimeWatchData()Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object v9

    invoke-virtual {v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getHeartRate()J

    move-result-wide v9

    .line 188
    new-instance v12, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v11

    int-to-float v11, v11

    invoke-direct {v12, v7, v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 189
    new-instance v13, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v7

    int-to-float v7, v7

    invoke-direct {v13, v8, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 190
    new-instance v14, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    int-to-float v0, v0

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v7

    int-to-float v7, v7

    invoke-direct {v14, v0, v7}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 191
    new-instance v15, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getDistance()F

    move-result v0

    invoke-direct {v15, v4, v0}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 192
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    int-to-float v4, v5

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v5

    int-to-float v5, v5

    invoke-direct {v0, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 193
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    long-to-float v5, v9

    invoke-direct {v4, v5, v3, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 194
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    int-to-float v2, v6

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 187
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;

    move-object v11, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    invoke-direct/range {v11 .. v18}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    return-object v2

    .line 198
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getWalkingDayPeriods()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    if-nez v0, :cond_1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;

    move-object v4, v0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0xffffff

    const/16 v34, 0x0

    invoke-direct/range {v4 .. v34}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;-><init>(JJIILjava/util/List;FIIFFFFFFFIIDIJIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 199
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getRestingDayPeriods()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    if-nez v4, :cond_2

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;

    move-object v5, v4

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v31, 0x3fffff

    const/16 v32, 0x0

    invoke-direct/range {v5 .. v32}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;-><init>(JJFIIFFFFFFFIIIILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 200
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;->getSleepDayPeriods()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    if-nez v5, :cond_3

    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;

    move-object v6, v5

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, 0xffffff

    const/16 v35, 0x0

    invoke-direct/range {v6 .. v35}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;-><init>(JJFIIFFFFFFFIIIILpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepType;ILjava/util/List;JIFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 202
    :cond_3
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getBodyPower()F

    move-result v6

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getBodyPower()F

    move-result v7

    add-float/2addr v6, v7

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getBodyPower()F

    move-result v7

    add-float/2addr v6, v7

    const/16 v7, 0x3c

    int-to-float v7, v7

    div-float/2addr v6, v7

    .line 203
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSolarPower()F

    move-result v8

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getSolarPower()F

    move-result v9

    add-float/2addr v8, v9

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getSolarPower()F

    move-result v9

    add-float/2addr v8, v9

    div-float/2addr v8, v7

    .line 205
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getSteps()I

    move-result v7

    .line 206
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getDistance()D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    const/16 v10, 0x3e8

    invoke-static {v9, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divide(Ljava/lang/Number;I)D

    move-result-wide v11

    move-object/from16 v9, p0

    .line 208
    invoke-direct {v9, v0, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->calculateAvgHeartRate(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;)D

    move-result-wide v13

    double-to-float v13, v13

    .line 210
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getActiveCalories()I

    move-result v14

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getActiveCalories()I

    move-result v15

    add-int/2addr v14, v15

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getActiveCalories()I

    move-result v15

    add-int/2addr v14, v15

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-static {v14, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    move-result v14

    .line 211
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/WalkingDayPeriod;->getBmrCalories()I

    move-result v0

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RestingDayPeriod;->getBmrCalories()I

    move-result v4

    add-int/2addr v0, v4

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getBmrCalories()I

    move-result v4

    add-int/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->divideRounded(Ljava/lang/Number;I)I

    .line 213
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getEndTime()J

    move-result-wide v15

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/SleepDayPeriod;->getStartTime()J

    move-result-wide v4

    sub-long/2addr v15, v4

    const v0, 0xea60

    int-to-long v4, v0

    div-long v4, v15, v4

    .line 216
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v10

    int-to-float v10, v10

    invoke-direct {v0, v6, v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 217
    new-instance v6, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v10

    int-to-float v10, v10

    invoke-direct {v6, v8, v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 218
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    int-to-float v7, v7

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v10

    int-to-float v10, v10

    invoke-direct {v8, v7, v10}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 219
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    double-to-float v10, v11

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getDistance()F

    move-result v11

    invoke-direct {v7, v10, v11}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 220
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    int-to-float v11, v14

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v12

    int-to-float v12, v12

    invoke-direct {v10, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 221
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    invoke-direct {v11, v13, v3, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 222
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;

    long-to-float v2, v4

    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;-><init>(FF)V

    .line 215
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;

    move-object v15, v2

    move-object/from16 v16, v0

    move-object/from16 v17, v6

    move-object/from16 v18, v8

    move-object/from16 v19, v7

    move-object/from16 v20, v11

    move-object/from16 v21, v10

    move-object/from16 v22, v1

    invoke-direct/range {v15 .. v22}, Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeValue;)V

    return-object v2
.end method

.method private final mapToUIRealtimeNotification(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;
    .locals 6

    .line 246
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalSteps()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    .line 247
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalDistance()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$DISTANCE;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v1

    .line 248
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalActiveCalories()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$CALORIES;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType$CALORIES;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;

    invoke-virtual {v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->getValue(Ljava/lang/Number;Lpowerwatch/matrix/com/pwgen2android/utils/MetricsConvertType;)Lkotlin/Pair;

    move-result-object v2

    .line 249
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getHeartRate()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    .line 250
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;

    .line 252
    new-instance v4, Lkotlin/Pair;

    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v4, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 253
    new-instance v2, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-static {v5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NumberExtensionsKt;->twoDecimalsFormat(F)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v2, v5, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 250
    invoke-direct {v3, v0, v4, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;-><init>(Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;)V

    return-object v3
.end method

.method private static final observeData$lambda-12(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/ObservableSource;
    .locals 14

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->walkingDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;

    .line 129
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/WalkingDayPeriodDataProvider;->loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v3

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->restingDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;

    .line 132
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/RestingDayPeriodDataProvider;->loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v4

    .line 134
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->sleepDayPeriodDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;

    .line 136
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->getOffset()J

    move-result-wide v7

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v13, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v13}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;IJJIILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;

    move-result-object v1

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/activities/day/SleepDayPeriodDataProvider;->loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;

    move-result-object v5

    .line 141
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v7, v8, v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 142
    new-instance v10, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;

    move-object v1, v10

    move-object v2, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$ejwoPofvc-3vncyTTmkotyrClP4;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V

    invoke-virtual {v0, v10}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 159
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->goalsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;

    const/4 v1, 0x2

    invoke-static {v0, v8, v7, v1, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository$DefaultImpls;->load$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ObserveRepository;ZZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    .line 160
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$eyLR6axafU6-pOuXYi-JBKoOUi8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$eyLR6axafU6-pOuXYi-JBKoOUi8;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V

    .line 141
    invoke-static {p1, v0, v1}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p0

    const-string p1, "combineLatest(deviceManager.connect()\n                        .switchMap { deviceInfo ->\n                            if (!deviceInfo.isConnected || !page.isToday || !deviceInfo.isGen2) {\n                                return@switchMap Observable\n                                        .zip(walkingData, restingData, sleepData,\n                                                Function3<List<WalkingDayPeriod>, List<RestingDayPeriod>, List<SleepDayPeriod>, PeriodsContainer>\n                                                { walk, rest, sleep ->\n                                                    PeriodsContainer(\n                                                            walkingDayPeriods = walk,\n                                                            restingDayPeriods = rest,\n                                                            sleepDayPeriods = sleep)\n                                                }\n                                        )\n                            }\n                            return@switchMap currentStatusDataObservable\n                                    .map {\n                                        mapRealTimeExecutorDataToPeriods(it)\n                                    }\n                        }, goalsRepository.load(fromCache = true),\n                        BiFunction<PeriodsContainer, GoalConfiguration, RealTimeData> { periodsData, goal ->\n                            mapToRealTimeData(\n                                    periodsData,\n                                    goal)\n                        })"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final observeData$lambda-12$lambda-10(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;Lio/reactivex/Observable;Lio/reactivex/Observable;Lio/reactivex/Observable;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 6

    const-string v0, "$page"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$walkingData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$restingData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$sleepData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;->isToday()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p5}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isGen2()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    iget-object p0, p4, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable:Lio/reactivex/observables/ConnectableObservable;

    .line 156
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$olxJCW3iFl7d6eIvma_MfPSYYfg;

    invoke-direct {p1, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$olxJCW3iFl7d6eIvma_MfPSYYfg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;)V

    invoke-virtual {p0, p1}, Lio/reactivex/observables/ConnectableObservable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 145
    :cond_1
    :goto_0
    check-cast p1, Lio/reactivex/ObservableSource;

    check-cast p2, Lio/reactivex/ObservableSource;

    check-cast p3, Lio/reactivex/ObservableSource;

    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$xTmHo1O7qmyrHZlxQcblswCtPZU;

    invoke-static {p1, p2, p3, p0}, Lio/reactivex/Observable;->zip(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/Function3;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final observeData$lambda-12$lambda-10$lambda-8(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;
    .locals 15

    const-string v0, "walk"

    move-object v3, p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rest"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleep"

    move-object/from16 v5, p2

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x7f1

    const/4 v14, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final observeData$lambda-12$lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->mapRealTimeExecutorDataToPeriods(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;

    move-result-object p0

    return-object p0
.end method

.method private static final observeData$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "periodsData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goal"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->mapToRealTimeData(Lpowerwatch/matrix/com/pwgen2android/shared/sync/PeriodsContainer;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;)Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 48
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public loadData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;>;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public observeCurrentData()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;",
            ">;"
        }
    .end annotation

    .line 120
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;->currentStatusDataObservable:Lio/reactivex/observables/ConnectableObservable;

    const-string v1, "currentStatusDataObservable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public observeData(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;",
            ")",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/main/dashboard/realtime/RealTimeData;",
            ">;"
        }
    .end annotation

    const-string v0, "page"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/-$$Lambda$RealTimeDataProviderImpl$Cp8zCp_EFmgByTzv2-M8Wi3w0sg;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProviderImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n\n        val walkingData = walkingDayPeriodDataProvider\n                .loadData(page)\n\n        val restingData = restingDayPeriodDataProvider\n                .loadData(page)\n\n        val sleepData = sleepDayPeriodDataProvider\n                // correctedOffset = SLEEP_DEFAULT_CORRECTED_OFFSET\n                .loadData(page.copy(offset = page.offset))\n\n\n        val result =\n\n                Observable.combineLatest(deviceManager.connect()\n                        .switchMap { deviceInfo ->\n                            if (!deviceInfo.isConnected || !page.isToday || !deviceInfo.isGen2) {\n                                return@switchMap Observable\n                                        .zip(walkingData, restingData, sleepData,\n                                                Function3<List<WalkingDayPeriod>, List<RestingDayPeriod>, List<SleepDayPeriod>, PeriodsContainer>\n                                                { walk, rest, sleep ->\n                                                    PeriodsContainer(\n                                                            walkingDayPeriods = walk,\n                                                            restingDayPeriods = rest,\n                                                            sleepDayPeriods = sleep)\n                                                }\n                                        )\n                            }\n                            return@switchMap currentStatusDataObservable\n                                    .map {\n                                        mapRealTimeExecutorDataToPeriods(it)\n                                    }\n                        }, goalsRepository.load(fromCache = true),\n                        BiFunction<PeriodsContainer, GoalConfiguration, RealTimeData> { periodsData, goal ->\n                            mapToRealTimeData(\n                                    periodsData,\n                                    goal)\n                        })\n\n\n        result\n\n\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
