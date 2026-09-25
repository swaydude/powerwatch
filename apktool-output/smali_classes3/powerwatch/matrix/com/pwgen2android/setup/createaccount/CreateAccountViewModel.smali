.class public final Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "CreateAccountViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;
.implements Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010.\u001a\u00020\u0019H\u0096\u0001J\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0016J\n\u00104\u001a\u000200*\u000205J\n\u00106\u001a\u000200*\u000205J\n\u00107\u001a\u000200*\u000205R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0013X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0017R\u001f\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0017R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0017R\u001c\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00070\u00070 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00190\u00190\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0017R\u001f\u0010#\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00190\u00190\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u001f\u0010(\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00190\u00190\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010*\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u0017R\u001f\u0010,\u001a\u0010\u0012\u000c\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "emailValidator",
        "Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;",
        "passwordValidator",
        "Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;",
        "networkInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "bugfenderConfig",
        "Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;",
        "loginFlowBaseViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V",
        "confirmPasswordField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getConfirmPasswordField",
        "()Landroidx/databinding/ObservableField;",
        "displayNetworkError",
        "",
        "getDisplayNetworkError",
        "emailField",
        "getEmailField",
        "errorMessage",
        "getErrorMessage",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "goToLoginLinkDisplayed",
        "getGoToLoginLinkDisplayed",
        "isButtonVisible",
        "isFromLogin",
        "()Z",
        "setFromLogin",
        "(Z)V",
        "licenceAccepted",
        "getLicenceAccepted",
        "nameField",
        "getNameField",
        "passwordField",
        "getPasswordField",
        "checkAndDisplayNetworkError",
        "onBackClicked",
        "",
        "onCreateView",
        "context",
        "Landroid/content/Context;",
        "goToLogin",
        "Landroid/view/View;",
        "onCreateAccountClicked",
        "onTermsAndConditionsClicked",
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

.field private final confirmPasswordField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field private final goToLoginLinkDisplayed:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
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

.field private isFromLogin:Z

.field private final licenceAccepted:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

.field private final nameField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final passwordField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final passwordValidator:Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V
    .locals 1

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "passwordValidator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkInfoProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "bugfenderConfig"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "loginFlowBaseViewModel"

    invoke-static {p7, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p5, 0x0

    const/4 v0, 0x3

    .line 38
    invoke-direct {p0, p5, p5, v0, p5}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 32
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    .line 33
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->passwordValidator:Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;

    .line 35
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    .line 36
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    .line 41
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 43
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->emailField:Landroidx/databinding/ObservableField;

    .line 44
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->passwordField:Landroidx/databinding/ObservableField;

    .line 45
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->confirmPasswordField:Landroidx/databinding/ObservableField;

    .line 46
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->nameField:Landroidx/databinding/ObservableField;

    .line 47
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    .line 48
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    .line 49
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->licenceAccepted:Landroidx/databinding/ObservableField;

    .line 50
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->goToLoginLinkDisplayed:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    .line 36
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;

    move-object v6, p5

    invoke-direct {v0, p5}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v6, p5

    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    .line 30
    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V

    return-void
.end method

.method public static synthetic lambda$J_gw4AaOZ1stZV6EDLHRGLXnxX0(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->onCreateAccountClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V

    return-void
.end method

.method public static synthetic lambda$Zh4H3aGETIUmAklYg6eUcSvteNM(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->onCreateAccountClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;Landroid/view/View;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onCreateAccountClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V
    .locals 9

    const-string v0, "$user"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment$Companion;->newInstance(Ljava/lang/String;)Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountScreenFragment;

    move-result-object v0

    .line 100
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/FragmentManager;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v0

    check-cast v3, Landroidx/fragment/app/Fragment;

    const v4, 0x7f0801fd

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    .line 101
    :goto_0
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->bugfenderConfig:Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/BugfenderConfig;->setUserEmail(Ljava/lang/String;)V

    return-void
.end method

.method private static final onCreateAccountClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 8

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_onCreateAccountClicked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    const-string v0, "it"

    .line 104
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object v0

    .line 106
    :goto_0
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$AccountAlreadyExists;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 107
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v2, 0x7f0f00b4

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 109
    :cond_1
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordEmptyChar;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 110
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p1

    const-string v1, "Password contains a whitespace character."

    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 113
    :cond_2
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p1

    const-string v1, "Unknown error occurred, please try again."

    invoke-virtual {p1, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 117
    :goto_1
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p0, "Cloud error during account creation occurred: Error type is: "

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;->checkAndDisplayNetworkError()Z

    move-result v0

    return v0
.end method

.method public final getConfirmPasswordField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->confirmPasswordField:Landroidx/databinding/ObservableField;

    return-object v0
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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

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

    .line 43
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->emailField:Landroidx/databinding/ObservableField;

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

    .line 48
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getGoToLoginLinkDisplayed()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->goToLoginLinkDisplayed:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 30
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getLicenceAccepted()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->licenceAccepted:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getNameField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->nameField:Landroidx/databinding/ObservableField;

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

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->passwordField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final goToLogin(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    iget-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isFromLogin:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/FragmentManager;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->popBackStackAllowingStateLoss(Landroidx/fragment/app/FragmentManager;)V

    goto :goto_0

    .line 133
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
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

    .line 47
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final isFromLogin()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isFromLogin:Z

    return v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 124
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    :goto_0
    return-void
.end method

.method public final onCreateAccountClicked(Landroid/view/View;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    const-string v3, ""

    invoke-virtual {v2, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 63
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->licenceAccepted:Landroidx/databinding/ObservableField;

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    .line 64
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v4, 0x7f0f001b

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v2, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    return-void

    .line 68
    :cond_0
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->emailField:Landroidx/databinding/ObservableField;

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModelKt;->getValue(Landroidx/databinding/ObservableField;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;->isEmailValid(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 69
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f0f00c3

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    .line 72
    :cond_1
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->passwordField:Landroidx/databinding/ObservableField;

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 73
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->confirmPasswordField:Landroidx/databinding/ObservableField;

    invoke-virtual {v4}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 76
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->passwordValidator:Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;

    invoke-virtual {v5, v2}, Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;->isPasswordValid(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 77
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f0f0157

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    .line 82
    :cond_2
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 83
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v3, 0x7f0f0158

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    .line 87
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->checkAndDisplayNetworkError()Z

    move-result v2

    if-nez v2, :cond_4

    return-void

    .line 90
    :cond_4
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->emailField:Landroidx/databinding/ObservableField;

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModelKt;->getValue(Landroidx/databinding/ObservableField;)Ljava/lang/String;

    move-result-object v9

    .line 91
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->passwordField:Landroidx/databinding/ObservableField;

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModelKt;->getValue(Landroidx/databinding/ObservableField;)Ljava/lang/String;

    move-result-object v10

    .line 92
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->nameField:Landroidx/databinding/ObservableField;

    invoke-static {v2}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModelKt;->getValue(Landroidx/databinding/ObservableField;)Ljava/lang/String;

    move-result-object v8

    .line 89
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x7e3

    const/16 v18, 0x0

    move-object v4, v2

    invoke-direct/range {v4 .. v18}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;-><init>(JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;ZLpowerwatch/matrix/com/pwgen2android/shared/data/models/UserAccountSettings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 94
    iget-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 95
    invoke-virtual/range {p0 .. p0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v4

    .line 96
    iget-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v5, v2, v3, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository$DefaultImpls;->save$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/AddRepository;Ljava/lang/Object;ZILjava/lang/Object;)Lio/reactivex/Completable;

    move-result-object v3

    .line 97
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v5

    invoke-virtual {v3, v5}, Lio/reactivex/Completable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Completable;

    move-result-object v3

    .line 98
    new-instance v5, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;

    invoke-direct {v5, v2, v0}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$J_gw4AaOZ1stZV6EDLHRGLXnxX0;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;)V

    .line 102
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$Zh4H3aGETIUmAklYg6eUcSvteNM;

    invoke-direct {v2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/-$$Lambda$CreateAccountViewModel$Zh4H3aGETIUmAklYg6eUcSvteNM;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;Landroid/view/View;)V

    .line 98
    invoke-virtual {v3, v5, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 95
    invoke-virtual {v4, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public onCreateView(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-super {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;->onCreateView(Landroid/content/Context;)V

    return-void
.end method

.method public final onTermsAndConditionsClicked(Landroid/view/View;)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/LicencePageFragment;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const v2, 0x7f0801fd

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationExtensionsKt;->addFragment$default(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;IZLpowerwatch/matrix/com/pwgen2android/shared/extensions/NavigationType;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final setFromLogin(Z)V
    .locals 0

    .line 52
    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/createaccount/CreateAccountViewModel;->isFromLogin:Z

    return-void
.end method
