.class public final Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
.source "MainActivityViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020 \u00a2\u0006\u0002\u0010!J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\u000c\u0012\n $*\u0004\u0018\u00010\u001a0\u001a0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010%\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020( $*\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(\u0018\u00010\'0\'0&\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "loginService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "cloudSynchronizer",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;",
        "rxBus",
        "Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;",
        "cloudErrorHandler",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "dbManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;",
        "deviceManager",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "activityPeriodCacheClear",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;",
        "pushMessagingFactory",
        "Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;",
        "locationInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "whiteListResolver",
        "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "firebaseField",
        "Landroidx/databinding/ObservableField;",
        "Lkotlin/Pair;",
        "",
        "getFirebaseField",
        "()Landroidx/databinding/ObservableField;",
        "onResume",
        "",
        "onTabReselected",
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
.field private final cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

.field private final cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final firebaseField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final loginService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

.field private final rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

.field private final rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

.field private final whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v5, p12

    move-object/from16 v9, p14

    move-object/from16 v10, p15

    const-string v11, "loginService"

    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "languageController"

    invoke-static {v1, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "cloudSynchronizer"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "rxBus"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "cloudErrorHandler"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "userAccountRepository"

    move-object/from16 v12, p6

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "dbManager"

    move-object/from16 v13, p7

    invoke-static {v13, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "deviceManager"

    move-object/from16 v14, p8

    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "activityPeriodCacheClear"

    move-object/from16 v15, p9

    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "pushMessagingFactory"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "locationInfoProvider"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "activity"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "fragmentManager"

    move-object/from16 v12, p13

    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "whiteListResolver"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "rxPermissions"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-direct {v6, v1, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V

    .line 49
    iput-object v0, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->loginService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 51
    iput-object v2, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    .line 52
    iput-object v3, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    .line 53
    iput-object v4, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->cloudErrorHandler:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;

    .line 62
    iput-object v9, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->whiteListResolver:Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;

    .line 63
    iput-object v10, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 66
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 67
    new-instance v1, Landroidx/databinding/ObservableField;

    new-instance v2, Lkotlin/Pair;

    const-string v3, ""

    invoke-direct {v2, v3, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object v1, v6, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->firebaseField:Landroidx/databinding/ObservableField;

    .line 71
    invoke-interface/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->isLoggedIn()Z

    move-result v0

    .line 73
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v9, 0x320

    invoke-static {v9, v10, v2}, Lio/reactivex/Single;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Single;

    move-result-object v2

    .line 74
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v2

    .line 75
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;

    invoke-direct {v3, v0, v5}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$S1AnaZCnoY5T4JpQ3MGBffm-iKE;-><init>(ZLandroid/app/Activity;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 73
    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 82
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v9

    .line 83
    invoke-interface/range {p5 .. p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;->getAuthRequiredError()Lio/reactivex/Observable;

    move-result-object v10

    .line 84
    new-instance v11, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    move-object/from16 v4, p9

    move-object/from16 v5, p8

    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$F2kb-GEsDLHoi2IDxhLY7Xo0EWI;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V

    invoke-virtual {v10, v11}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$FQ8Dj1Srvx2-F6ESRYlkcaqcXAU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$FQ8Dj1Srvx2-F6ESRYlkcaqcXAU;

    .line 106
    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 82
    invoke-virtual {v9, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 110
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    move-object v1, v7

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;->getMessage$default(Lpowerwatch/matrix/com/pwgen2android/fcm/PushRemoteMessageFactory;Lpowerwatch/matrix/com/pwgen2android/fcm/MessageReceiverPriority;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v1

    .line 111
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$jC9t_pmxKqVhf4LZrZXIRRoKzq0;

    invoke-direct {v2, v6}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$jC9t_pmxKqVhf4LZrZXIRRoKzq0;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$1_Cwpy7lzI5H51Y0eXq0u-FY6VM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$1_Cwpy7lzI5H51Y0eXq0u-FY6VM;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 110
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 117
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    invoke-interface/range {p11 .. p11}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->isProviderEnabled()Lio/reactivex/Observable;

    move-result-object v1

    .line 118
    invoke-virtual {v1}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v1

    .line 119
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$HmSrRtX_oIM8bFA1IJOKZPtDEU8;

    invoke-direct {v2, v6}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$HmSrRtX_oIM8bFA1IJOKZPtDEU8;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 122
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;

    invoke-direct {v2, v6, v8}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$gFNZJrPr9mIKXUFNd47aWyetOY4;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$-BwdVwODR-WyFZ56HNwKeaRqiiQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$-BwdVwODR-WyFZ56HNwKeaRqiiQ;

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$o_4mdD-vNPsLh1BwZolyowXpF1k;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$o_4mdD-vNPsLh1BwZolyowXpF1k;

    .line 128
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lcom/tbruyelle/rxpermissions2/RxPermissions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 17

    move/from16 v0, p16

    and-int/lit16 v0, v0, 0x4000

    if-eqz v0, :cond_0

    .line 63
    new-instance v0, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 49
    move-object/from16 v1, p12

    check-cast v1, Landroidx/fragment/app/FragmentActivity;

    .line 63
    invoke-direct {v0, v1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    move-object/from16 v16, v0

    goto :goto_0

    :cond_0
    move-object/from16 v16, p15

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    .line 49
    invoke-direct/range {v1 .. v16}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorHandler;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/fcm/PushMessagingFactory;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V

    return-void
.end method

.method private static final _init_$lambda-0(ZLandroid/app/Activity;Ljava/lang/Long;)V
    .locals 0

    const-string p2, "$activity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    const/4 p0, 0x1

    const/4 p2, 0x0

    .line 77
    invoke-static {p1, p2, p0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToSetupActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V

    .line 78
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method private static final _init_$lambda-10(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-11(Ljava/lang/Throwable;)V
    .locals 0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final _init_$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dbManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$activityPeriodCacheClear"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$deviceManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->loginService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 86
    invoke-interface {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->logout()Lio/reactivex/Completable;

    move-result-object p5

    .line 87
    move-object v0, p1

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 88
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$NYQ1l6BByBDtPE45m5DloVOkDdE;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$NYQ1l6BByBDtPE45m5DloVOkDdE;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p1

    .line 94
    invoke-interface {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;->clearDevicesCompletable()Lio/reactivex/Completable;

    move-result-object p2

    check-cast p2, Lio/reactivex/CompletableSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    .line 95
    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;->clear()Lio/reactivex/Completable;

    move-result-object p2

    check-cast p2, Lio/reactivex/CompletableSource;

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    .line 96
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$W0UkwSzdbpjmwmK-YGeLWLqMF9A;

    invoke-direct {p2, p4}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$W0UkwSzdbpjmwmK-YGeLWLqMF9A;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p1

    .line 99
    invoke-virtual {p1}, Lio/reactivex/Completable;->onErrorComplete()Lio/reactivex/Completable;

    move-result-object p1

    check-cast p1, Lio/reactivex/CompletableSource;

    .line 87
    invoke-virtual {p5, p1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    .line 100
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$HQjOsUpsz_ijS35xk7mp8CYsqdU;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$MainActivityViewModel$HQjOsUpsz_ijS35xk7mp8CYsqdU;-><init>(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final _init_$lambda-5()V
    .locals 0

    return-void
.end method

.method private static final _init_$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->getFirebaseField()Landroidx/databinding/ObservableField;

    move-result-object p0

    new-instance v0, Lkotlin/Pair;

    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    :goto_0
    move-object v1, v2

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getBody()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v3

    :goto_2
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 113
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->getNotification()Lcom/google/firebase/messaging/RemoteMessage$Notification;

    move-result-object p0

    if-nez p0, :cond_4

    const/4 p0, 0x0

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lcom/google/firebase/messaging/RemoteMessage$Notification;->getBody()Ljava/lang/String;

    move-result-object p0

    :goto_3
    const-string p1, "FCM_RECEIVED "

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private static final _init_$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Ljava/lang/Boolean;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Main activity received location change"

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$locationInfoProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {v0, v1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->isGranted(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->isGranted(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 125
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->updateLocationInternal()Lio/reactivex/Completable;

    move-result-object p0

    .line 126
    invoke-virtual {p0, p2}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 127
    :cond_0
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method public static synthetic lambda$-BwdVwODR-WyFZ56HNwKeaRqiiQ(Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-10(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$1_Cwpy7lzI5H51Y0eXq0u-FY6VM(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$F2kb-GEsDLHoi2IDxhLY7Xo0EWI(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static/range {p0 .. p5}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-4(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/db/DBManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/ActivityPeriodCacheClear;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$FQ8Dj1Srvx2-F6ESRYlkcaqcXAU()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-5()V

    return-void
.end method

.method public static synthetic lambda$HQjOsUpsz_ijS35xk7mp8CYsqdU(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$HmSrRtX_oIM8bFA1IJOKZPtDEU8(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-8(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$NYQ1l6BByBDtPE45m5DloVOkDdE(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda-4$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$S1AnaZCnoY5T4JpQ3MGBffm-iKE(ZLandroid/app/Activity;Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-0(ZLandroid/app/Activity;Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic lambda$W0UkwSzdbpjmwmK-YGeLWLqMF9A(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$gFNZJrPr9mIKXUFNd47aWyetOY4(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-9(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jC9t_pmxKqVhf4LZrZXIRRoKzq0(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-6(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Lcom/google/firebase/messaging/RemoteMessage;)V

    return-void
.end method

.method public static synthetic lambda$o_4mdD-vNPsLh1BwZolyowXpF1k(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->_init_$lambda-11(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final lambda-4$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "$userAccountRepository"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->delete(Ljava/lang/Object;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "$deviceManager"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;->destroy()V

    return-void
.end method

.method private static final lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_0

    goto :goto_0

    .line 102
    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$LoginScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$LoginScreen;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToSetupActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    .line 103
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void
.end method


# virtual methods
.method public final getFirebaseField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->firebaseField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 49
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final onResume()V
    .locals 1

    .line 152
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->cloudSynchronizer:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudSynchronizer;->syncData()V

    return-void
.end method

.method public final onTabReselected()V
    .locals 2

    .line 156
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/MainActivityViewModel;->rxBus:Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/MainTabReselected;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/MainTabReselected;

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;->send(Ljava/lang/Object;)V

    return-void
.end method
