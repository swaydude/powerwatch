.class public final Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;
.source "SetupActivityViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "languageController",
        "Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "intent",
        "Landroid/content/Intent;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "stravaController",
        "Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V",
        "hasPairedDevice",
        "",
        "isStravaIntent",
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
.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;)V
    .locals 7

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "languageController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stravaController"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseActivityViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/utils/LanguageController;Landroid/app/Activity;)V

    .line 28
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 29
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    .line 34
    invoke-static {p5}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->getNavigation(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object p2

    .line 35
    sget-object p6, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;

    invoke-virtual {p6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment$None;->getClassName()Ljava/lang/String;

    move-result-object p6

    invoke-static {p2, p6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p6

    if-nez p6, :cond_0

    .line 36
    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->getFragmentsToPush(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    const p2, 0x7f0801fd

    .line 37
    invoke-static {p4, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->fillBackStack(Landroidx/fragment/app/FragmentManager;Ljava/util/List;I)V

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0, p5}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->isStravaIntent(Landroid/content/Intent;)Z

    move-result p2

    const/4 p6, 0x0

    const/4 v0, 0x1

    if-eqz p2, :cond_2

    .line 40
    invoke-virtual {p7, p5}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->parseIntent(Landroid/content/Intent;)Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p7, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->getAccessAndRefreshToken(Lpowerwatch/matrix/com/pwgen2android/strava/StravaAuthInfo;)V

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->hasPairedDevice()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 42
    invoke-static {p3, p6, v0, v0, p6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToMainActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ZILjava/lang/Object;)V

    .line 43
    invoke-virtual {p3}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 45
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/thirdparty/ThirdPartyPermissionFragment;

    move-result-object p1

    .line 46
    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p4

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p2

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, v0, p6}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 49
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/reactivex/Single;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object p1

    .line 50
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$tl0ahNgLaIjQoN5huKxlofSrN2w;

    invoke-direct {p3, p4}, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$tl0ahNgLaIjQoN5huKxlofSrN2w;-><init>(Landroidx/fragment/app/FragmentManager;)V

    .line 60
    new-instance p6, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;

    invoke-direct {p6, p4, p5}, Lpowerwatch/matrix/com/pwgen2android/setup/-$$Lambda$SetupActivityViewModel$dDXDPBvZvhIAeoyivLHWoD8nTGs;-><init>(Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;)V

    .line 50
    invoke-virtual {p1, p3, p6}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 48
    invoke-virtual {p2, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    :goto_0
    return-void
.end method

.method private static final _init_$lambda-0(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 8

    const-string v0, "$fragmentManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;

    move-result-object v0

    .line 52
    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801fd

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    .line 55
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;

    move-result-object p1

    .line 57
    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private static final _init_$lambda-1(Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Ljava/lang/Throwable;)V
    .locals 7

    const-string p2, "$fragmentManager"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$intent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/welcome/WelcomeScreenFragment;

    move-result-object p2

    .line 62
    move-object v1, p2

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    .line 64
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/DeepLinkConstantsKt;->getVERIFY_URL_SCHEME()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 65
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;

    const-string p2, ""

    invoke-virtual {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;

    move-result-object p1

    .line 66
    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_0

    .line 67
    :cond_0
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/DeepLinkConstantsKt;->getRESET_PERFORMED_URL_SCHEME()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 68
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;

    move-result-object p1

    .line 69
    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic lambda$dDXDPBvZvhIAeoyivLHWoD8nTGs(Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->_init_$lambda-1(Landroidx/fragment/app/FragmentManager;Landroid/content/Intent;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$tl0ahNgLaIjQoN5huKxlofSrN2w(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->_init_$lambda-0(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method


# virtual methods
.method public final hasPairedDevice()Z
    .locals 1

    .line 81
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final isStravaIntent(Landroid/content/Intent;)Z
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/SetupActivityViewModel;->stravaController:Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/strava/StravaController;->isValidIntent(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method
