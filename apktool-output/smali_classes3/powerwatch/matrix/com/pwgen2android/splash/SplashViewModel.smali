.class public final Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
.source "SplashViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "loginCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "activity",
        "Landroid/app/Activity;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;)V",
        "getActivity",
        "()Landroid/app/Activity;",
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
.field private final activity:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;)V
    .locals 2

    const-string v0, "loginCloudService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0, p2, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->activity:Landroid/app/Activity;

    .line 26
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->isLoggedIn()Z

    move-result p1

    .line 27
    invoke-interface {p3}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    .line 28
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p3

    const-wide/16 v0, 0x320

    sget-object p4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p4}, Lio/reactivex/Single;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Single;

    move-result-object p4

    .line 29
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p4, v0}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p4

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/splash/-$$Lambda$SplashViewModel$EBG9-twwgjyGlAw82B10-RfAMrg;

    invoke-direct {v0, p2, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/splash/-$$Lambda$SplashViewModel$EBG9-twwgjyGlAw82B10-RfAMrg;-><init>(ZZLpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;)V

    invoke-virtual {p4, v0}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 28
    invoke-virtual {p3, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-0(ZZLpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;Ljava/lang/Long;)V
    .locals 1

    const-string p3, "this$0"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 33
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->getActivity()Landroid/app/Activity;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-static {p0, p3, p1, v0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToMainActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    if-nez p1, :cond_1

    .line 37
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p3, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToSetupActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V

    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p3, p0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToPairingActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V

    .line 44
    :goto_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->getActivity()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static synthetic lambda$EBG9-twwgjyGlAw82B10-RfAMrg(ZZLpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->_init_$lambda-0(ZZLpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;Ljava/lang/Long;)V

    return-void
.end method


# virtual methods
.method public final getActivity()Landroid/app/Activity;
    .locals 1

    .line 22
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/splash/SplashViewModel;->activity:Landroid/app/Activity;

    return-object v0
.end method
