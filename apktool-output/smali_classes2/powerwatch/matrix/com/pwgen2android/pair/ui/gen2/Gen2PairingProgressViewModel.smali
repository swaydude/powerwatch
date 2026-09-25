.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;
.source "Gen2PairingProgressViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGen2PairingProgressViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gen2PairingProgressViewModel.kt\npowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,188:1\n1#2:189\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010+\u001a\u00020*2\u0008\u0010,\u001a\u0004\u0018\u00010&R\u001c\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n !*\u0004\u0018\u00010\u00050\u00050 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\u000c\u0012\n !*\u0004\u0018\u00010&0&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;",
        "context",
        "Landroid/content/Context;",
        "activity",
        "Landroid/app/Activity;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "connectionPreference",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "sleepTimeStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;",
        "deviceProtocolStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;",
        "metricsRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;",
        "(Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V",
        "activityWeakRef",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "isDevicePaired",
        "",
        "pairingInfoSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "getSleepTimeStorage",
        "()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;",
        "onDestroyView",
        "",
        "startPairing",
        "pairingCode",
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
.field private final activityWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private isDevicePaired:Z

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

.field private final metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

.field private final pairingInfoSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;)V
    .locals 17

    move-object/from16 v10, p0

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p6

    move-object/from16 v15, p7

    move-object/from16 v9, p8

    move-object/from16 v8, p9

    move-object/from16 v7, p12

    move-object/from16 v6, p13

    move-object/from16 v5, p14

    const-string v0, "context"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionPreference"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    move-object/from16 v1, p5

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    move-object/from16 v4, p10

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    move-object/from16 v3, p11

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepTimeStorage"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProtocolStorage"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsRepository"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    move-object/from16 v16, v11

    check-cast v16, Landroid/content/Context;

    move-object/from16 v0, p0

    move-object/from16 v2, p6

    move-object/from16 v3, p8

    move-object/from16 v4, p7

    move-object v11, v5

    move-object/from16 v5, p3

    move-object/from16 v6, p10

    move-object v11, v7

    move-object/from16 v7, p11

    move-object v11, v8

    move-object v11, v9

    move-object/from16 v9, v16

    .line 46
    invoke-direct/range {v0 .. v9}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Landroid/content/Context;)V

    .line 34
    iput-object v12, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 35
    iput-object v13, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    .line 37
    iput-object v14, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 38
    iput-object v15, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 39
    iput-object v11, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    move-object/from16 v0, p9

    .line 40
    iput-object v0, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    move-object/from16 v0, p12

    .line 43
    iput-object v0, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    move-object/from16 v0, p14

    .line 45
    iput-object v0, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    .line 58
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<String>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->pairingInfoSubject:Lio/reactivex/subjects/PublishSubject;

    .line 59
    new-instance v1, Ljava/lang/ref/WeakReference;

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->activityWeakRef:Ljava/lang/ref/WeakReference;

    .line 61
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v1

    .line 63
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getBluetoothEnabledSubject()Lio/reactivex/subjects/PublishSubject;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$GtVeGKYqXbQUhJgU42ErQzXn6Nk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$GtVeGKYqXbQUhJgU42ErQzXn6Nk;

    invoke-virtual {v2, v3}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v2

    check-cast v2, Lio/reactivex/ObservableSource;

    .line 64
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$FqpqNy0HaJsYz4mp_jU3zTS2vYU;

    invoke-direct {v3, v10}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$FqpqNy0HaJsYz4mp_jU3zTS2vYU;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {v0, v3}, Lio/reactivex/subjects/PublishSubject;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$9q_CBBlKZiweQZL8h94VPrhIHiQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$9q_CBBlKZiweQZL8h94VPrhIHiQ;

    .line 63
    invoke-static {v2, v0, v3}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 69
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$9LtyUGKjVLkB2Ijj6x8syRhNwtA;

    move-object/from16 v3, p13

    invoke-direct {v2, v10, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$9LtyUGKjVLkB2Ijj6x8syRhNwtA;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 61
    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 161
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->init()V

    return-void
.end method

.method private static final _init_$lambda-0(Ljava/lang/Boolean;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final _init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Ljava/lang/String;)V
    .locals 6

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairStart;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairStart;

    move-object v1, v0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    return-void
.end method

.method private static final _init_$lambda-2(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "$noName_0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "deviceInfo"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final _init_$lambda-20(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Ljava/lang/String;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceProtocolStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 71
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->foundDevicesChange()Lio/reactivex/Observable;

    move-result-object v1

    .line 72
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$S5IEEmq1BvC545lPFzs7tgrx27s;

    invoke-direct {v2, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$S5IEEmq1BvC545lPFzs7tgrx27s;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    const-wide/16 v2, 0x1

    .line 73
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v1

    .line 74
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$h4RMqCDdU6QoOBvsfbvNTpZJHBE;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$h4RMqCDdU6QoOBvsfbvNTpZJHBE;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 79
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$FO7KEKUX_ojcmunOPg926VtMEq8;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$FO7KEKUX_ojcmunOPg926VtMEq8;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 82
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$JPziVhf02s71yRSlNLAqUndHjVg;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$JPziVhf02s71yRSlNLAqUndHjVg;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 111
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x3c

    invoke-virtual {v1, v5, v6, v4}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$7vn7snwyOFb1hyRBd8pQG6aWSzo;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$7vn7snwyOFb1hyRBd8pQG6aWSzo;

    .line 113
    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 120
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v1

    .line 121
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v1

    .line 122
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$mcXANjE5vTDfueQdJtxAbOrIdhE;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$mcXANjE5vTDfueQdJtxAbOrIdhE;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnDispose(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object v1

    .line 125
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$80D612e6DcdRsrHn07VeDucJjaI;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$80D612e6DcdRsrHn07VeDucJjaI;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;)V

    .line 131
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$aKZ7TyRX-JBL5R6NtUkA0HMKhPo;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$aKZ7TyRX-JBL5R6NtUkA0HMKhPo;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    .line 125
    invoke-virtual {v1, v2, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 70
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 151
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getContextWeakRef()Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    const-string v0, "Searching for "

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const v1, 0x7f0f0185

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p1

    .line 153
    :goto_0
    sget-object p1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 p1, 0x1

    new-array v1, p1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "java.lang.String.format(format, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 155
    # --- PATCHED: pass a non-null EMPTY filter list so startMonitoring takes the ACTIVE
    # bleScanner.scan() path and parses the watch's manufacturer data for its real
    # pairingCode. Passing null routed to the bonded-devices path which sets
    # pairingCode=null and can never match the QR code, leaving the UI stuck at "Searching…".
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->startScanning(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$7vn7snwyOFb1hyRBd8pQG6aWSzo(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-16(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$80D612e6DcdRsrHn07VeDucJjaI(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-18(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$9LtyUGKjVLkB2Ijj6x8syRhNwtA(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->_init_$lambda-20(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$9q_CBBlKZiweQZL8h94VPrhIHiQ(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->_init_$lambda-2(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$A86-ddK3W1AjufFgNCvsiejqeQQ(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-8(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FO7KEKUX_ojcmunOPg926VtMEq8(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-5(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$FqpqNy0HaJsYz4mp_jU3zTS2vYU(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->_init_$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$GtVeGKYqXbQUhJgU42ErQzXn6Nk(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->_init_$lambda-0(Ljava/lang/Boolean;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$JPziVhf02s71yRSlNLAqUndHjVg(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$S5IEEmq1BvC545lPFzs7tgrx27s(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-3(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$YRmo34sLvkd22xeGxSBhv3BvNxk(Lkotlin/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-14$lambda-10(Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$a1JfDJS-04DdsIjKEAO27gBJ02w(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-6(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$aKZ7TyRX-JBL5R6NtUkA0HMKhPo(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-19(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$cslOkVeXjZo8Kojm3M4mLUcK3Ts(Lkotlin/Pair;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-14$lambda-13(Lkotlin/Pair;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$dyGCj4qHDGgcbikvIjX2SmnTjJs(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-14$lambda-12(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$eWfuxSQYsvLfEaxRX9sp447H0go(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-14$lambda-11(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$h4RMqCDdU6QoOBvsfbvNTpZJHBE(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$mcXANjE5vTDfueQdJtxAbOrIdhE(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-17(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    return-void
.end method

.method public static synthetic lambda$n3Fn7uFik_B_kBRAaN2S5iaieH0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-14$lambda-9(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$wG0eesOTZWCe0M32Gfv7mvSSNok(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->lambda-20$lambda-15$lambda-14(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda-20$lambda-15(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scannnedDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevicesChange()Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1

    .line 84
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v0

    .line 85
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$a1JfDJS-04DdsIjKEAO27gBJ02w;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$a1JfDJS-04DdsIjKEAO27gBJ02w;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 88
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getUserData()Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 89
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$A86-ddK3W1AjufFgNCvsiejqeQQ;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$A86-ddK3W1AjufFgNCvsiejqeQQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    .line 88
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 92
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$wG0eesOTZWCe0M32Gfv7mvSSNok;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final lambda-20$lambda-15$lambda-14(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 10

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scannnedDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfoPairConfigPair"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getProtocolVersion()S

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;->createPairExecutor(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;I)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    move-result-object v4

    .line 94
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v5

    .line 95
    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 94
    invoke-static/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->transferDataWithProgress$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    .line 96
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$n3Fn7uFik_B_kBRAaN2S5iaieH0;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$n3Fn7uFik_B_kBRAaN2S5iaieH0;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$YRmo34sLvkd22xeGxSBhv3BvNxk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$YRmo34sLvkd22xeGxSBhv3BvNxk;

    .line 99
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$eWfuxSQYsvLfEaxRX9sp447H0go;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$eWfuxSQYsvLfEaxRX9sp447H0go;

    .line 100
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    .line 101
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$dyGCj4qHDGgcbikvIjX2SmnTjJs;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$dyGCj4qHDGgcbikvIjX2SmnTjJs;-><init>(Lkotlin/Pair;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    .line 102
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$cslOkVeXjZo8Kojm3M4mLUcK3Ts;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/-$$Lambda$Gen2PairingProgressViewModel$cslOkVeXjZo8Kojm3M4mLUcK3Ts;-><init>(Lkotlin/Pair;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final lambda-20$lambda-15$lambda-14$lambda-10(Lkotlin/Pair;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final lambda-20$lambda-15$lambda-14$lambda-11(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-object p0
.end method

.method private static final lambda-20$lambda-15$lambda-14$lambda-12(Lkotlin/Pair;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$deviceInfoPairConfigPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-20$lambda-15$lambda-14$lambda-13(Lkotlin/Pair;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "$deviceInfoPairConfigPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    # --- OFFLINE PATCH (diagnostic): log the ORIGINAL transferData error (inner lambda13)
    # --- before it is wrapped into ConnectionTimedOutError/ConnectionFailedError. Uses p1 only.
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 103
    instance-of p1, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz p1, :cond_0

    .line 104
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getExtendedDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 106
    :cond_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getExtendedDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final lambda-20$lambda-15$lambda-14$lambda-9(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lkotlin/Pair;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingProgressField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final lambda-20$lambda-15$lambda-6(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->restoreLastState()V

    return-void
.end method

.method private static final lambda-20$lambda-15$lambda-8(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pairingConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;->getUserInfoData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;

    move-result-object v0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getSleepTimeStorage()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;->getSleepTime()I

    move-result p0

    invoke-virtual {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UserInfoData;->setSleepTimeSelection(I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance p0, Lkotlin/Pair;

    invoke-direct {p0, p1, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final lambda-20$lambda-16(Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    # --- OFFLINE PATCH (diagnostic): log the ORIGINAL error (E0) reaching the OUTER
    # --- onErrorResumeNext (lambda16) before it is wrapped into ConnectionFailedError, so
    # --- the true pairing failure cause appears in logcat. Uses p0 only -> no .locals change.
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 115
    instance-of v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/PairingFailedError;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 116
    :cond_0
    instance-of p0, p0, Ljava/util/concurrent/TimeoutException;

    const-string v0, ""

    if-eqz p0, :cond_1

    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;

    invoke-direct {p0, v0, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 117
    :cond_1
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;

    invoke-direct {p0, v0, v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final lambda-20$lambda-17(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->releaseScanningResources()V

    return-void
.end method

.method private static final lambda-20$lambda-18(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lkotlin/Pair;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceProtocolStorage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$SUCCESS;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v5

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getUid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v4, v5, v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    const/4 v0, 0x1

    .line 127
    iput-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->isDevicePaired:Z

    .line 128
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->activityWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const v2, 0x7f0f01a5

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 129
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getGetProtocolVersion()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->saveDeviceProtocolVersion(Ljava/lang/String;I)V

    .line 130
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "it.first"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->onPairingSuccess(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method private static final lambda-20$lambda-19(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Ljava/lang/Throwable;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;

    move-object v2, v1

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_FOUND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_FOUND;

    move-object v3, v1

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    .line 134
    :cond_0
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;

    const-string v1, ""

    if-eqz v0, :cond_3

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    .line 135
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    .line 136
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_FOUND;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$DEVICE_NOT_FOUND;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    .line 137
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;->getDeviceId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    move-object v6, v1

    :cond_1
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionTimedOutError;->getFwVersion()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v5

    :goto_0
    invoke-direct {v4, v6, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    invoke-direct {v0, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V

    goto :goto_2

    .line 139
    :cond_3
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;

    if-eqz v0, :cond_6

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    .line 140
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    .line 141
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$CONNECTION_FAILURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$CONNECTION_FAILURE;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    .line 142
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;

    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;->getDeviceId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_4

    move-object v6, v1

    :cond_4
    invoke-virtual {v5}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/ConnectionFailedError;->getFwVersion()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    move-object v1, v5

    :goto_1
    invoke-direct {v4, v6, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-direct {v0, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;)V

    goto :goto_2

    .line 144
    :cond_6
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType$PairEnd;

    move-object v8, v1

    check-cast v8, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$CONNECTION_FAILURE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus$CONNECTION_FAILURE;

    move-object v9, v1

    check-cast v9, Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventType;Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/DeviceEventStatus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogDevice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 146
    :goto_2
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->metricsRepository:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;

    invoke-interface {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/MetricsRepository;->logEvent(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/metrics/LogEvent;)V

    .line 148
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 149
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->onPairingFailed()V

    return-void
.end method

.method private static final lambda-20$lambda-3(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getPairingCode()Ljava/lang/Short;

    move-result-object p1

    const-string v0, "pairingCode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result p0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    if-ne p1, p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method private static final lambda-20$lambda-4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->releaseScanningResources()V

    .line 76
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->activityWeakRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const v1, 0x7f0f008b

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 77
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->connectionPreference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->enableAutoConnect(Z)V

    return-void
.end method

.method private static final lambda-20$lambda-5(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->startConnection(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getSleepTimeStorage()Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;
    .locals 1

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->sleepTimeStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/SleepTimeStorage;

    return-object v0
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 177
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->releaseScanningResources()V

    .line 178
    iget-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->isDevicePaired:Z

    if-nez p1, :cond_0

    .line 179
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->stopConnection()V

    :cond_0
    return-void
.end method

.method public final startPairing(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    .line 167
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->onPairingFailed()V

    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/Gen2PairingProgressViewModel;->pairingInfoSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
