.class public final Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "SignInViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BO\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0015J\t\u0010\'\u001a\u00020\u001bH\u0096\u0001J\u0006\u0010(\u001a\u00020)J\n\u0010*\u001a\u00020)*\u00020+J\n\u0010,\u001a\u00020)*\u00020+J\n\u0010-\u001a\u00020)*\u00020+R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\r0\r0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u001f\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u001f0\u001f0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001dR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u001f0\u001f0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001dR\u001c\u0010#\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u000b0\u000b0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010$\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u001b0\u001b0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010%\u001a\u0010\u0012\u000c\u0012\n \u0018*\u0004\u0018\u00010\u001f0\u001f0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001dR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "loginCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "activity",
        "Landroid/app/Activity;",
        "emailValidator",
        "Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;",
        "networkInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "bugfenderConfig",
        "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;",
        "loginFlowBaseViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "displayNetworkError",
        "Landroidx/databinding/ObservableField;",
        "",
        "getDisplayNetworkError",
        "()Landroidx/databinding/ObservableField;",
        "emailField",
        "",
        "getEmailField",
        "errorMessage",
        "getErrorMessage",
        "fragmentManagerWeakReference",
        "isButtonVisible",
        "passwordField",
        "getPasswordField",
        "checkAndDisplayNetworkError",
        "onBackClicked",
        "",
        "onCreateAccountClicked",
        "Landroid/view/View;",
        "onForgotPasswordClicked",
        "onLoginClicked",
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
.field private final bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

.field private final contextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final emailField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

.field private final errorMessage:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
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

.field private final isButtonVisible:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

.field private final loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

.field private final networkInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;

.field private final passwordField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V
    .locals 2

    const-string v0, "loginCloudService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userAccountRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkInfoProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bugfenderConfig"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginFlowBaseViewModel"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 44
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 36
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 37
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 40
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    .line 41
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->networkInfoProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;

    .line 42
    iput-object p8, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    .line 43
    iput-object p9, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    .line 46
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 47
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 48
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    .line 49
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    .line 51
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->emailField:Landroidx/databinding/ObservableField;

    .line 52
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->passwordField:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    .line 43
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;

    move-object/from16 v8, p7

    invoke-direct {v0, v8}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    move-object/from16 v10, p9

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    .line 35
    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V

    return-void
.end method

.method public static synthetic lambda$FDFCyAQpb6oOFR4q1B_jeR4_3Cs(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->onLoginClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$TrtqFqKDWHYuKUH9m7GG3RpGOq4(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->onLoginClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$WqS7VfORxoTrh-YErKkdgk28F3w(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->onLoginClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic lambda$o3H1IVouxXkHVWyyt0-xTmE0F6Q(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->onLoginClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method private static final onLoginClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;->setUserEmail(Ljava/lang/String;)V

    return-void
.end method

.method private static final onLoginClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository$DefaultImpls;->all$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AllRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/Page;ZILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final onLoginClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;Ljava/util/List;)V
    .locals 7

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$this_onLoginClicked"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p2

    const-string v0, ""

    invoke-virtual {p2, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 80
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    .line 81
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences;->Companion:Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/AppConfigPreferences$Companion;->getPermissionsShownFlag(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 82
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->popBackStackAllowingStateLoss(Landroidx/fragment/app/FragmentManager;)V

    .line 83
    :goto_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/permissions/PermissionInfoFragment;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_2

    .line 85
    :cond_2
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->isEmpty()Z

    move-result p0

    const/4 p1, 0x0

    if-nez p0, :cond_4

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    const/4 v0, 0x3

    .line 86
    invoke-static {p2, p1, p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToMainActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ZILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    if-nez p2, :cond_5

    goto :goto_1

    :cond_5
    const/4 p0, 0x1

    .line 88
    invoke-static {p2, p1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->goToPairingActivity$default(Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationFragment;ILjava/lang/Object;)V

    :goto_1
    if-nez p2, :cond_6

    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    :goto_2
    return-void
.end method

.method private static final onLoginClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_onLoginClicked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    const-string v0, "it"

    .line 94
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object v0

    .line 97
    :goto_0
    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$MigrationRequired;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 98
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v3, 0x7f0f0154

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v3, "context.getString(R.string.password_migration_required)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    aput-object v5, v3, v4

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "java.lang.String.format(format, *args)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 100
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$BadCredentials;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 101
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v2, 0x7f0f0108

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 103
    :cond_2
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 104
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801fd

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v2, 0x7f0f018d

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 110
    :goto_1
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p0, "Cloud error during login occurred: Error type is: "

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v4, p2

    invoke-static/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public checkAndDisplayNetworkError()Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;->checkAndDisplayNetworkError()Z

    move-result v0

    return v0
.end method

.method public getDisplayNetworkError()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v0

    return-object v0
.end method

.method public final getEmailField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->emailField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getErrorMessage()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 35
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getPasswordField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->passwordField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isButtonVisible()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 116
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getBackStackEntryCount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_3

    .line 117
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    goto :goto_2

    .line 119
    :cond_3
    :goto_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_2
    return-void
.end method

.method public final onCreateAccountClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment$Companion;->newInstance(Z)Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountFragment;

    move-result-object p1

    .line 125
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801fd

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onForgotPasswordClicked(Landroid/view/View;)V
    .locals 8

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordFragment;

    move-result-object p1

    .line 130
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/FragmentManager;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    check-cast v2, Landroidx/fragment/app/Fragment;

    const v3, 0x7f0801fd

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final onLoginClicked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->emailField:Landroidx/databinding/ObservableField;

    invoke-static {v1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModelKt;->getValue(Landroidx/databinding/ObservableField;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;->isEmailValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f0f00c3

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    .line 63
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->checkAndDisplayNetworkError()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 65
    :cond_1
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 68
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->emailField:Landroidx/databinding/ObservableField;

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;->passwordField:Landroidx/databinding/ObservableField;

    invoke-virtual {v3}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object v1

    .line 69
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$TrtqFqKDWHYuKUH9m7GG3RpGOq4;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$TrtqFqKDWHYuKUH9m7GG3RpGOq4;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v1

    .line 73
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$o3H1IVouxXkHVWyyt0-xTmE0F6Q;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$o3H1IVouxXkHVWyyt0-xTmE0F6Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v1

    .line 77
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v1

    .line 78
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$WqS7VfORxoTrh-YErKkdgk28F3w;

    invoke-direct {v2, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$WqS7VfORxoTrh-YErKkdgk28F3w;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;)V

    .line 92
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$FDFCyAQpb6oOFR4q1B_jeR4_3Cs;

    invoke-direct {v3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/-$$Lambda$SignInViewModel$FDFCyAQpb6oOFR4q1B_jeR4_3Cs;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInViewModel;Landroid/view/View;)V

    .line 78
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 67
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
