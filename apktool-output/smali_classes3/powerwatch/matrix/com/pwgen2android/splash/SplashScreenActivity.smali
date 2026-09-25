.class public final Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;
.source "SplashScreenActivity.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity<",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivitySplashScreenBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSplashScreenActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashScreenActivity.kt\npowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity\n+ 2 LifecycleOwnerExt.kt\norg/koin/androidx/viewmodel/ext/android/LifecycleOwnerExtKt\n*L\n1#1,31:1\n54#2,3:32\n*S KotlinDebug\n*F\n+ 1 SplashScreenActivity.kt\npowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity\n*L\n14#1:32,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\n\u001a\u00020\u000bH\u0014J\u0008\u0010\u000c\u001a\u00020\u000bH\u0014J\u0008\u0010\r\u001a\u00020\u0003H\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u001b\u0010\u0005\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;",
        "Lpowerwatch/matrix/com/pwgen2android/databinding/ActivitySplashScreenBinding;",
        "Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;",
        "()V",
        "splashViewModel",
        "getSplashViewModel",
        "()Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;",
        "splashViewModel$delegate",
        "Lkotlin/Lazy;",
        "getBindingVariable",
        "",
        "getLayoutId",
        "getViewModel",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
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
.field private final splashViewModel$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 12
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;-><init>()V

    .line 14
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/LifecycleOwner;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity$splashViewModel$2;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity$splashViewModel$2;-><init>(Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    const/4 v2, 0x0

    .line 32
    check-cast v2, Lorg/koin/core/qualifier/Qualifier;

    .line 34
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity$special$$inlined$viewModel$default$1;

    invoke-direct {v3, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity$special$$inlined$viewModel$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)V

    check-cast v3, Lkotlin/jvm/functions/Function0;

    invoke-static {v3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    .line 14
    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;->splashViewModel$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private final getSplashViewModel()Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;
    .locals 1

    .line 14
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;->splashViewModel$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;

    return-object v0
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 0

    return-void
.end method

.method protected getBindingVariable()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected getLayoutId()I
    .locals 1

    const v0, 0x7f0b0020

    return v0
.end method

.method public bridge synthetic getViewModel()Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;->getViewModel()Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;

    return-object v0
.end method

.method protected getViewModel()Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;
    .locals 1

    .line 18
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;->getSplashViewModel()Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;

    move-result-object v0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 25
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0020

    .line 26
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashScreenActivity;->setContentView(I)V

    return-void
.end method
