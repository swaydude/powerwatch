.class public final Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "ChooseProductViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u001a\u001a\u00020\u0014J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u0014J\u0008\u0010\u001f\u001a\u00020\u0014H\u0003J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$H\u0002R\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00050\u00050\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00030\u00030\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "activity",
        "Landroid/app/Activity;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "loginCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "locationInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;",
        "rxPermissions",
        "Lcom/tbruyelle/rxpermissions2/RxPermissions;",
        "(Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V",
        "activityWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "btRequestCallback",
        "Lkotlin/Function0;",
        "",
        "getBtRequestCallback",
        "()Lkotlin/jvm/functions/Function0;",
        "setBtRequestCallback",
        "(Lkotlin/jvm/functions/Function0;)V",
        "fragmentManagerWeakReference",
        "onBackClicked",
        "onDestroyView",
        "context",
        "Landroid/content/Context;",
        "onPW1Chosen",
        "onPW2Chosen",
        "onProductChosen",
        "chosen",
        "Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;",
        "requestBTPermission",
        "Lio/reactivex/Observable;",
        "",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final activityWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private btRequestCallback:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

.field private final loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

.field private final rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$Companion;

    .line 113
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V
    .locals 1

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "loginCloudService"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "locationInfoProvider"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "rxPermissions"

    invoke-static {p6, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    const/4 v0, 0x3

    .line 34
    invoke-direct {p0, p3, p3, v0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 33
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    .line 34
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    .line 35
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 36
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    .line 38
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$btRequestCallback$1;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel$btRequestCallback$1;

    check-cast p1, Lkotlin/jvm/functions/Function0;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->btRequestCallback:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lcom/tbruyelle/rxpermissions2/RxPermissions;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 34
    new-instance p6, Lcom/tbruyelle/rxpermissions2/RxPermissions;

    invoke-direct {p6, p3}, Lcom/tbruyelle/rxpermissions2/RxPermissions;-><init>(Landroidx/fragment/app/Fragment;)V

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 29
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;-><init>(Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;Lcom/tbruyelle/rxpermissions2/RxPermissions;)V

    return-void
.end method

.method public static synthetic lambda$0y4FHCUNoLlXAGiecYcCevnDceE(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen$lambda-4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic lambda$1a2QYvIZf8X9cDs63Gu-JqvpfR4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onBackClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    return-void
.end method

.method public static synthetic lambda$DNgA5D2q13mKkUqO8Mv1kDKbHD4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen$lambda-3(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$LZzFlsMX61cjU7XV-dP4arggxgU(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$VeUI2Aq5Dui0cyE6vfmUZnZDddM(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$YBLfShVFfxg78SwQXYBXjrA7DVU(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onBackClicked$lambda-7(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$qjSU8RYhR14f43cwmfxVh2HpGz0(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen$lambda-5(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$wj5UVN5aZDnqvoQUo7YHQtFAKDk(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onBackClicked$lambda-6(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    if-nez p0, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$WelcomeScreen;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$WelcomeScreen;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;

    invoke-static {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToSetupActivity(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;)V

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    .line 96
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_1
    return-void
.end method

.method private static final onBackClicked$lambda-7(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private final onPW2Chosen()V
    .locals 3

    .line 42
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    .line 44
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->request([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    .line 45
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$VeUI2Aq5Dui0cyE6vfmUZnZDddM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$VeUI2Aq5Dui0cyE6vfmUZnZDddM;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 61
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$LZzFlsMX61cjU7XV-dP4arggxgU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$LZzFlsMX61cjU7XV-dP4arggxgU;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 63
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$DNgA5D2q13mKkUqO8Mv1kDKbHD4;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$DNgA5D2q13mKkUqO8Mv1kDKbHD4;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 66
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object v0

    .line 67
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$0y4FHCUNoLlXAGiecYcCevnDceE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$0y4FHCUNoLlXAGiecYcCevnDceE;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$qjSU8RYhR14f43cwmfxVh2HpGz0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$qjSU8RYhR14f43cwmfxVh2HpGz0;

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method

.method private static final onPW2Chosen$lambda-1(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "approved"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->isProviderEnabled()Lio/reactivex/Observable;

    move-result-object p1

    .line 48
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$wj5UVN5aZDnqvoQUo7YHQtFAKDk;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$wj5UVN5aZDnqvoQUo7YHQtFAKDk;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 58
    :cond_0
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onPW2Chosen$lambda-1$lambda-0(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->updateLocationInternal()Lio/reactivex/Completable;

    move-result-object p0

    .line 51
    invoke-virtual {p0, p1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 53
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->locationInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Activity;

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p0, Landroid/content/Context;

    invoke-interface {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;->showDialog(Landroid/content/Context;)V

    .line 54
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onPW2Chosen$lambda-2(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string p1, "android.permission.CAMERA"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->request([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onPW2Chosen$lambda-3(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->requestBTPermission()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final onPW2Chosen$lambda-4(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;Ljava/lang/Boolean;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "approved"

    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 69
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen2/QRPairingFragment;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801aa

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->getBtRequestCallback()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method private static final onPW2Chosen$lambda-5(Ljava/lang/Throwable;)V
    .locals 2

    .line 74
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->TAG:Ljava/lang/String;

    const-string v1, "Error in resolving permissions..."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final requestBTPermission()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->activityWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.content.Context"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->isBluetoothPermissionGranted(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->rxPermissions:Lcom/tbruyelle/rxpermissions2/RxPermissions;

    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    const-string v2, "android.permission.BLUETOOTH_SCAN"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tbruyelle/rxpermissions2/RxPermissions;->request([Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "{\n            rxPermissions.request(Manifest.permission.BLUETOOTH_CONNECT, Manifest.permission.BLUETOOTH_SCAN)\n        }"

    .line 81
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 83
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(true)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public final getBtRequestCallback()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->btRequestCallback:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 4

    .line 92
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->logout()Lio/reactivex/Completable;

    move-result-object v1

    .line 93
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$1a2QYvIZf8X9cDs63Gu-JqvpfR4;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$1a2QYvIZf8X9cDs63Gu-JqvpfR4;-><init>(Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;)V

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$YBLfShVFfxg78SwQXYBXjrA7DVU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/-$$Lambda$ChooseProductViewModel$YBLfShVFfxg78SwQXYBXjrA7DVU;

    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 92
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onDestroyView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onDestroyView(Landroid/content/Context;)V

    .line 102
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public final onPW1Chosen()V
    .locals 8

    .line 88
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/pair/ui/gen1/Gen1PairingFragment;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801aa

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onProductChosen(Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct;)V
    .locals 1

    const-string v0, "chosen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/WatchProduct$PowerWatch2;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW2Chosen()V

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->onPW1Chosen()V

    :goto_0
    return-void
.end method

.method public final setBtRequestCallback(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/pair/ui/chooseProduct/ChooseProductViewModel;->btRequestCallback:Lkotlin/jvm/functions/Function0;

    return-void
.end method
