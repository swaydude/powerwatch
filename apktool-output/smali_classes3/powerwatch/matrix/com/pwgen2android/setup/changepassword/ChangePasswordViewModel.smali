.class public final Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;
.source "ChangePasswordViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;
.implements Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010$\u001a\u00020\u0017H\u0096\u0001J\u0008\u0010%\u001a\u00020&H\u0016J\n\u0010\'\u001a\u00020&*\u00020(R\u001f\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0011X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0015R\u001f\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0015R\u001c\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\t0\t0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00170\u00170\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0015R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0015R\u001f\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0015R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00170\u00170\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "networkInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "activity",
        "Landroid/app/Activity;",
        "passwordValidator",
        "Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;",
        "loginFlowBaseViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V",
        "confirmPasswordField",
        "Landroidx/databinding/ObservableField;",
        "",
        "kotlin.jvm.PlatformType",
        "getConfirmPasswordField",
        "()Landroidx/databinding/ObservableField;",
        "displayNetworkError",
        "",
        "getDisplayNetworkError",
        "errorMessage",
        "getErrorMessage",
        "fragmentManagerWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "isButtonVisible",
        "oldPasswordField",
        "getOldPasswordField",
        "passwordField",
        "getPasswordField",
        "responseSuccess",
        "getResponseSuccess",
        "checkAndDisplayNetworkError",
        "onBackClicked",
        "",
        "onChangePasswordClicked",
        "Landroid/view/View;",
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
.field private final confirmPasswordField:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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

.field private final loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

.field private final oldPasswordField:Landroidx/databinding/ObservableField;
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

.field private final responseSuccess:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V
    .locals 1

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "fragmentManager"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "activity"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "passwordValidator"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "loginFlowBaseViewModel"

    invoke-static {p6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    check-cast p4, Landroid/content/Context;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-direct {p0, p4, p2, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 24
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->passwordValidator:Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;

    .line 25
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    .line 27
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 29
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->oldPasswordField:Landroidx/databinding/ObservableField;

    .line 30
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->passwordField:Landroidx/databinding/ObservableField;

    .line 31
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->confirmPasswordField:Landroidx/databinding/ObservableField;

    .line 33
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    .line 34
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    .line 36
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->responseSuccess:Landroidx/databinding/ObservableField;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    .line 24
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;

    invoke-direct {p5}, Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;-><init>()V

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    .line 25
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;

    invoke-direct {p5, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V

    move-object p6, p5

    check-cast p6, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 20
    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/app/Activity;Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V

    return-void
.end method

.method public static synthetic lambda$RTwWPprs1j4GNb-3Gp0AkxlldjA(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->onChangePasswordClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$gxVbzZpvY6GdHf8EwsGJ4niVMh8(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->onChangePasswordClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V

    return-void
.end method

.method public static synthetic lambda$qGyX_aZVg_-KMohI_nQpOQMC6kU(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->onChangePasswordClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Landroid/view/View;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onChangePasswordClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onChangePasswordClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getResponseSuccess()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onChangePasswordClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Landroid/view/View;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$this_onChangePasswordClicked"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    .line 69
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object p2

    .line 70
    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$PasswordNotMatch;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f0f0149

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f0f0069

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method


# virtual methods
.method public checkAndDisplayNetworkError()Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

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

    .line 31
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->confirmPasswordField:Landroidx/databinding/ObservableField;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;->getDisplayNetworkError()Landroidx/databinding/ObservableField;

    move-result-object v0

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

    .line 34
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 20
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getOldPasswordField()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->oldPasswordField:Landroidx/databinding/ObservableField;

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

    .line 30
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->passwordField:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getResponseSuccess()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->responseSuccess:Landroidx/databinding/ObservableField;

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

    .line 33
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public onBackClicked()V
    .locals 1

    .line 77
    invoke-super {p0}, Lpowerwatch/matrix/com/pwgen2android/main/MainDeepBaseViewModel;->onBackClicked()V

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onChangePasswordClicked(Landroid/view/View;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->oldPasswordField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 41
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->passwordField:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 42
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->confirmPasswordField:Landroidx/databinding/ObservableField;

    invoke-virtual {v2}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 44
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->passwordValidator:Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;

    invoke-virtual {v3, v1}, Lpowerwatch/matrix/com/pwgen2android/utils/PasswordValidator;->isPasswordValid(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 45
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f0f0157

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    .line 49
    :cond_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 50
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f0f0158

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void

    .line 54
    :cond_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->checkAndDisplayNetworkError()Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    .line 58
    :cond_2
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v2

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    invoke-interface {v3, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->resetPassword(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object v0

    .line 60
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordViewModel$RTwWPprs1j4GNb-3Gp0AkxlldjA;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordViewModel$RTwWPprs1j4GNb-3Gp0AkxlldjA;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 64
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordViewModel$gxVbzZpvY6GdHf8EwsGJ4niVMh8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordViewModel$gxVbzZpvY6GdHf8EwsGJ4niVMh8;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;)V

    .line 67
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordViewModel$qGyX_aZVg_-KMohI_nQpOQMC6kU;

    invoke-direct {v3, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/-$$Lambda$ChangePasswordViewModel$qGyX_aZVg_-KMohI_nQpOQMC6kU;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/changepassword/ChangePasswordViewModel;Landroid/view/View;)V

    .line 63
    invoke-virtual {v0, v1, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 59
    invoke-virtual {v2, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
