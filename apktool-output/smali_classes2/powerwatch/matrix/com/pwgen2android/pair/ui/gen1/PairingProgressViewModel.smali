.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;
.source "PairingProgressViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u001a*\u0004\u0018\u00010\u00190\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "goalConfigurationRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "logger",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;",
        "bluetoothManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "context",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V",
        "pairingInfoSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "kotlin.jvm.PlatformType",
        "startPairing",
        "",
        "deviceInfo",
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
.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

.field private final languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

.field private final logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

.field private final pairingInfoSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V
    .locals 17

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v9, p8

    const-string v0, "communicator"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalConfigurationRepository"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothManager"

    move-object/from16 v6, p7

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    move-object/from16 v7, p9

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    move-object/from16 v2, p10

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    move-object/from16 v16, v9

    check-cast v16, Landroid/content/Context;

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p1

    move-object/from16 v8, p6

    move-object/from16 v9, v16

    .line 34
    invoke-direct/range {v0 .. v9}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/PairingBaseViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;Landroid/content/Context;)V

    .line 24
    iput-object v11, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 26
    iput-object v12, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 27
    iput-object v13, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->goalConfigurationRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GoalConfigurationRepository;

    .line 28
    iput-object v14, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->languageController:Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;

    .line 29
    iput-object v15, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    .line 45
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<DeviceInfo>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v10, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->pairingInfoSubject:Lio/reactivex/subjects/PublishSubject;

    .line 50
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v1

    .line 52
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getBluetoothEnabledSubject()Lio/reactivex/subjects/PublishSubject;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$LLucln4etxkYr3W4EnDyXdaD6MY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$LLucln4etxkYr3W4EnDyXdaD6MY;

    invoke-virtual {v2, v3}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v2

    check-cast v2, Lio/reactivex/ObservableSource;

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$e8t5ki0XMYRSuZ_ATzBqRnKwiNE;

    invoke-static {v2, v0, v3}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v0

    .line 55
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$6YGgwwi3QpF9BKj7GK0VMqqdCpo;

    move-object/from16 v3, p8

    invoke-direct {v2, v10, v3}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$6YGgwwi3QpF9BKj7GK0VMqqdCpo;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 90
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->init()V

    return-void
.end method

.method private static final _init_$lambda-0(Ljava/lang/Boolean;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final _init_$lambda-1(Ljava/lang/Boolean;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    const-string v0, "$noName_0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "deviceInfo"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final _init_$lambda-10(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getPairingDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 57
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevicesChange()Lio/reactivex/Observable;

    move-result-object v1

    const-wide/16 v2, 0x1

    .line 58
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v1

    .line 59
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$N-KmKAUI5ZvWQtF1rsJht8HtYK4;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$N-KmKAUI5ZvWQtF1rsJht8HtYK4;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 62
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getUserData()Lio/reactivex/Observable;

    move-result-object v4

    check-cast v4, Lio/reactivex/ObservableSource;

    sget-object v5, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$USZ45O5uhtDgw8dC58kRv4Tbe-0;

    invoke-virtual {v1, v4, v5}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object v1

    .line 66
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$YE9tdqElS3H82qYlNt0QZHQeGSs;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$YE9tdqElS3H82qYlNt0QZHQeGSs;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 70
    new-instance v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$Taakk-nk-HcTHrblwjThs8om-_k;

    invoke-direct {v4, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$Taakk-nk-HcTHrblwjThs8om-_k;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;)V

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$d2Yl6x6lwJZUO2TSaAlRESieh-8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$d2Yl6x6lwJZUO2TSaAlRESieh-8;

    .line 73
    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$sjm6LKh_MmSO4nX1AhL70XCzLE8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$sjm6LKh_MmSO4nX1AhL70XCzLE8;

    .line 74
    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 75
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v4

    invoke-virtual {v1, v4}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v1

    .line 76
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x2d

    invoke-virtual {v1, v5, v6, v4}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    .line 77
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v1

    .line 78
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;

    invoke-direct {v2, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$gtWjRPHa83ccR5YL5vKqvm_BYm4;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    .line 81
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$9BLVRyicbgSbOEZ-hr0Wc6exD_0;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/-$$Lambda$PairingProgressViewModel$9BLVRyicbgSbOEZ-hr0Wc6exD_0;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;)V

    .line 78
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 86
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object v0

    const v1, 0x7f0f008b

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 87
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->startConnection(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$6YGgwwi3QpF9BKj7GK0VMqqdCpo(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->_init_$lambda-10(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$9BLVRyicbgSbOEZ-hr0Wc6exD_0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$LLucln4etxkYr3W4EnDyXdaD6MY(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->_init_$lambda-0(Ljava/lang/Boolean;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$N-KmKAUI5ZvWQtF1rsJht8HtYK4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$Taakk-nk-HcTHrblwjThs8om-_k(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-5(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic lambda$USZ45O5uhtDgw8dC58kRv4Tbe-0(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YE9tdqElS3H82qYlNt0QZHQeGSs(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$d2Yl6x6lwJZUO2TSaAlRESieh-8(Lkotlin/Pair;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-6(Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$e8t5ki0XMYRSuZ_ATzBqRnKwiNE(Ljava/lang/Boolean;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->_init_$lambda-1(Ljava/lang/Boolean;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$gtWjRPHa83ccR5YL5vKqvm_BYm4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-8(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$sjm6LKh_MmSO4nX1AhL70XCzLE8(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->lambda-10$lambda-7(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda-10$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object p0

    const-string p1, "Pairing..."

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final lambda-10$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)Lkotlin/Pair;
    .locals 1

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pairingConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final lambda-10$lambda-4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 14

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->logger:Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;->createPairExecutor$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ExecutorsFactory$Companion;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInput;IILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;

    move-result-object v8

    .line 68
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor$DefaultImpls;->transferDataWithProgress$default(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final lambda-10$lambda-5(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lkotlin/Pair;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getPairingProgressField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final lambda-10$lambda-6(Lkotlin/Pair;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
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

.method private static final lambda-10$lambda-7(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-object p0
.end method

.method private static final lambda-10$lambda-8(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->getPairingProgressText()Landroidx/databinding/ObservableField;

    move-result-object v0

    const-string v1, "Success..."

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 80
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->onPairingSuccess(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method private static final lambda-10$lambda-9(Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 83
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->onPairingFailed()V

    return-void
.end method


# virtual methods
.method public final startPairing(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    if-nez p1, :cond_0

    .line 96
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->onPairingFailed()V

    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/PairingProgressViewModel;->pairingInfoSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method
