.class public final Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;
.super Ljava/lang/Object;
.source "BatteryNotificationCenter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;",
        "",
        "notificationManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;",
        "batteryNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "goalsNotificationPersistence",
        "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;",
        "userPrefsUtils",
        "Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;",
        "context",
        "Landroid/content/Context;",
        "realTimeDataProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "getChangeLevel",
        "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;",
        "oldLevel",
        "",
        "newLevel",
        "onCreate",
        "",
        "onDestroy",
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
.field private final batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final context:Landroid/content/Context;

.field private final deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

.field private final notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

.field private final realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

.field private final userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;)V
    .locals 1

    const-string v0, "notificationManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "batteryNotificationPersistence"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalsNotificationPersistence"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userPrefsUtils"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "realTimeDataProvider"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    .line 60
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    .line 61
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    .line 62
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 63
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    .line 64
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    .line 65
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    .line 66
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

    .line 68
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/MockProvider;-><init>()V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object/from16 v9, p8

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    .line 59
    invoke-direct/range {v1 .. v9}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;)V

    return-void
.end method

.method private final getChangeLevel(FF)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;
    .locals 1

    .line 71
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;

    invoke-virtual {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;->getLevel(F)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    move-result-object p2

    .line 72
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;->Companion:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;->getLevel(F)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    move-result-object p1

    .line 74
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;->getThreshold()F

    move-result v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;->getThreshold()F

    move-result p1

    cmpg-float p1, v0, p1

    if-gez p1, :cond_0

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic lambda$2_R-SdFP_NtJ4NwArSIAkpvqOlo(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$3ajIp8jImVgNLsWF-2MVJ6yrgh4(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Triple;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Triple;)V

    return-void
.end method

.method public static synthetic lambda$C4strVLKjMo1SMZMb5FcLtPucek(Ljava/util/List;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-5$lambda-2$lambda-0(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$dwnqk42ZYMVigCTo3yDHl-lmqBo(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$hQaX6v5Rxhzg-YyR5vcca940Oqs(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-5$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$lA958QMTVtM-4l7xuoavUWet_e8(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-5$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$p2Fc2aPxZbxIor01eDnkZpmChkw(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Pair;)Lkotlin/Triple;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Pair;)Lkotlin/Triple;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$xJZYLH3bnT0hAuA0UTjrRlIPS3U(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/util/List;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->onCreate$lambda-5$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/util/List;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreate$lambda-5(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->realTimeDataProvider:Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/RealTimeDataProvider;->observeCurrentData()Lio/reactivex/Observable;

    move-result-object v0

    .line 83
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$hQaX6v5Rxhzg-YyR5vcca940Oqs;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$hQaX6v5Rxhzg-YyR5vcca940Oqs;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 87
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$lA958QMTVtM-4l7xuoavUWet_e8;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$lA958QMTVtM-4l7xuoavUWet_e8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 88
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$p2Fc2aPxZbxIor01eDnkZpmChkw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$p2Fc2aPxZbxIor01eDnkZpmChkw;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 92
    :cond_0
    new-instance p0, Lkotlin/Triple;

    const/4 v0, 0x0

    const-string v1, " kcal"

    invoke-direct {p0, p1, v0, v1}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onCreate$lambda-5$lambda-2(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$C4strVLKjMo1SMZMb5FcLtPucek;

    .line 85
    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p0

    .line 86
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$xJZYLH3bnT0hAuA0UTjrRlIPS3U;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$xJZYLH3bnT0hAuA0UTjrRlIPS3U;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;)V

    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onCreate$lambda-5$lambda-2$lambda-0(Ljava/util/List;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final onCreate$lambda-5$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;Ljava/util/List;)Lkotlin/Pair;
    .locals 2

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goals"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    new-instance v0, Lkotlin/Pair;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final onCreate$lambda-5$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$deviceInfo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final onCreate$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Pair;)Lkotlin/Triple;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->userPrefsUtils:Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/utils/UserPrefsUtils;->isMetricsUsedOrNull()Ljava/lang/Boolean;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, " kcal"

    goto :goto_0

    :cond_0
    const-string p0, " Cal"

    .line 90
    :goto_0
    new-instance v0, Lkotlin/Triple;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final onCreate$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;Lkotlin/Triple;)V
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "mock_receive - received level main "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 98
    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    .line 99
    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "it.first"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 100
    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getThird()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 102
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isConnected()Z

    move-result v4

    if-eqz v4, :cond_7

    if-eqz v1, :cond_7

    .line 104
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;

    .line 105
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    const-string v5, "goalsWatchData.second"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    .line 107
    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/Pair;

    const/4 v6, 0x0

    if-nez v5, :cond_0

    :goto_0
    move-object v5, v6

    goto :goto_1

    :cond_0
    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    if-nez v5, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->isBatteryValid()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    :goto_1
    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const-string v8, "java.lang.String.format(format, *args)"

    const/4 v9, 0x0

    if-eqz v5, :cond_3

    .line 109
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->getBatteryLevelChange(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    move-result-object v5

    .line 110
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;->getThreshold()F

    move-result v5

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getBatteryPercent()F

    move-result v10

    invoke-direct {v0, v5, v10}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->getChangeLevel(FF)Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;

    move-result-object v5

    .line 111
    iget-object v10, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->batteryNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getBatteryPercent()F

    move-result v12

    invoke-virtual {v10, v11, v12}, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationPersistence;->storeBatteryLevelChange(Ljava/lang/String;F)V

    if-eqz v5, :cond_3

    .line 115
    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryCriticalMessage()Ljava/lang/String;

    move-result-object v5

    new-array v10, v7, [Ljava/lang/Object;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getBatteryPercent()F

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v9

    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 116
    :cond_2
    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryLowMessage()Ljava/lang/String;

    move-result-object v5

    new-array v10, v7, [Ljava/lang/Object;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getBatteryPercent()F

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v9

    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    :goto_2
    iget-object v10, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v11, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getBatteryTitle()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v10, v2, v11, v12, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showBatteryNotification(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    :cond_3
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getGoalsAchievedResource()Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;

    move-result-object v2

    .line 125
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v5

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalSteps()I

    move-result v10

    const/4 v11, 0x2

    if-gt v5, v10, :cond_4

    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v5, v10}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->isGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 126
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-static {v5, v10, v9, v11, v6}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit$default(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;ZILjava/lang/Object;)V

    .line 127
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getTitle()Ljava/lang/String;

    move-result-object v13

    .line 128
    sget-object v14, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getStepsReached()Ljava/lang/String;

    move-result-object v14

    new-array v15, v7, [Ljava/lang/Object;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSteps()I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    aput-object v16, v15, v9

    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-interface {v5, v10, v12, v13, v14}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showGoalsAchievedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    :cond_4
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v5

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalActiveCalories()I

    move-result v10

    if-gt v5, v10, :cond_5

    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v5, v10}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->isGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 132
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-static {v5, v10, v9, v11, v6}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit$default(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;ZILjava/lang/Object;)V

    .line 133
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v10

    iget-object v12, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getTitle()Ljava/lang/String;

    move-result-object v13

    .line 134
    sget-object v14, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getCaloriesReached()Ljava/lang/String;

    move-result-object v14

    new-array v15, v7, [Ljava/lang/Object;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getCalories()I

    move-result v11

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v15, v9

    invoke-static {v15, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    invoke-interface {v5, v10, v12, v13, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showGoalsAchievedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    :cond_5
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalSleep()I

    move-result v5

    if-gt v3, v5, :cond_6

    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v3, v5}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->isGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 138
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    const/4 v6, 0x2

    const/4 v10, 0x0

    invoke-static {v3, v5, v9, v6, v10}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit$default(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;ZILjava/lang/Object;)V

    .line 139
    iget-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getTitle()Ljava/lang/String;

    move-result-object v11

    .line 140
    sget-object v12, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getSleepsReached()Ljava/lang/String;

    move-result-object v12

    new-array v13, v7, [Ljava/lang/Object;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getSleep()I

    move-result v14

    invoke-static {v14, v9, v7, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/DateTimeExtensionsKt;->minutesToHoursAndMinutesFormat$default(IZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    aput-object v14, v13, v9

    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-interface {v3, v5, v6, v11, v10}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showGoalsAchievedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_6
    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v3

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;->getTotalThermalPower()I

    move-result v1

    if-gt v3, v1, :cond_8

    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    invoke-virtual {v1, v3}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->isGoalsHit(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 144
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->goalsNotificationPersistence:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v1, v3, v9, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;->setGoalsHit$default(Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsNotificationPersistence;Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;ZILjava/lang/Object;)V

    .line 145
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getTitle()Ljava/lang/String;

    move-result-object v5

    .line 146
    sget-object v6, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/main/battery/GoalResource;->getPowerReached()Ljava/lang/String;

    move-result-object v2

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;->getPower()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v6, v9

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-interface {v1, v3, v0, v5, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showGoalsAchievedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    .line 150
    :cond_7
    iget-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->context:Landroid/content/Context;

    invoke-interface {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->dismissBatteryNotification(Landroid/content/Context;)V

    :cond_8
    :goto_3
    return-void
.end method

.method private static final onCreate$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public final onCreate()V
    .locals 5

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 80
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->deviceManager:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager$DefaultImpls;->connect$default(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$2_R-SdFP_NtJ4NwArSIAkpvqOlo;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$2_R-SdFP_NtJ4NwArSIAkpvqOlo;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 94
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v1

    .line 95
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$3ajIp8jImVgNLsWF-2MVJ6yrgh4;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$3ajIp8jImVgNLsWF-2MVJ6yrgh4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$dwnqk42ZYMVigCTo3yDHl-lmqBo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/battery/-$$Lambda$BatteryNotificationCenter$dwnqk42ZYMVigCTo3yDHl-lmqBo;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 161
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryNotificationCenter;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method
