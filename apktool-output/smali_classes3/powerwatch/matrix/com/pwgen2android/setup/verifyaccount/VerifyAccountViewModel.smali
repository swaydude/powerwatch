.class public final Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "VerifyAccountViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010 \u001a\u00020!J\u0008\u0010\"\u001a\u00020!H\u0002J\n\u0010#\u001a\u00020!*\u00020$J\n\u0010%\u001a\u00020!*\u00020$R\u001c\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\t0\t0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u001f\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u000b0\u000b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u00140\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0016R\u001f\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0011*\u0004\u0018\u00010\u001d0\u001d0\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "loginCloudService",
        "Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "activity",
        "Landroid/app/Activity;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "appContext",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V",
        "contextWeakReference",
        "Ljava/lang/ref/WeakReference;",
        "kotlin.jvm.PlatformType",
        "email",
        "Landroidx/databinding/ObservableField;",
        "",
        "getEmail",
        "()Landroidx/databinding/ObservableField;",
        "errorMessage",
        "getErrorMessage",
        "fragmentManagerWeakReference",
        "infoMessage",
        "getInfoMessage",
        "isButtonVisible",
        "",
        "verifyEmailErrorText",
        "verifyEmailSuccessText",
        "onBackClicked",
        "",
        "tryLogin",
        "onContinueClicked",
        "Landroid/view/View;",
        "onResendClicked",
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

.field private final email:Landroidx/databinding/ObservableField;
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

.field private final infoMessage:Landroidx/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
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

.field private final userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

.field private final verifyEmailErrorText:Ljava/lang/String;

.field private final verifyEmailSuccessText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;)V
    .locals 2

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loginCloudService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 29
    invoke-direct {p0, v0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 25
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    .line 26
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 31
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    .line 32
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    const p1, 0x7f0f0179

    .line 34
    invoke-virtual {p6, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "appContext.getString(R.string.resend_email_error_message)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->verifyEmailErrorText:Ljava/lang/String;

    const p1, 0x7f0f017a

    .line 35
    invoke-virtual {p6, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "appContext.getString(R.string.resend_email_success_message)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->verifyEmailSuccessText:Ljava/lang/String;

    .line 37
    new-instance p1, Landroidx/databinding/ObservableField;

    const-string p2, ""

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->email:Landroidx/databinding/ObservableField;

    .line 38
    new-instance p1, Landroidx/databinding/ObservableField;

    const/4 p3, 0x1

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-direct {p1, p3}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    .line 39
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    .line 40
    new-instance p1, Landroidx/databinding/ObservableField;

    invoke-direct {p1, p2}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->infoMessage:Landroidx/databinding/ObservableField;

    .line 43
    invoke-virtual {p4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 44
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/DeepLinkConstantsKt;->getVERIFY_URL_SCHEME()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 45
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/DeepLinkConstantsKt;->getBUNDLE_VERIFY_RESULT_KEY()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 46
    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/setup/DeepLinkConstantsKt;->getBUNDLE_VERIFY_RESULT_SUCCESS()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 47
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->tryLogin()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->tryLogin$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EFARhyBI1tjS8rV5NdHefbN4ElA(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->onResendClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    return-void
.end method

.method public static synthetic lambda$YpBoZZDO5IisuiQsqVU5RvPuJEQ(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->onResendClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$b_Pp7IvQ3pxGQPDdkG6dqz4rGtU(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->onResendClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$oLEtNTZpIe-20UHOxJNzIiYZ4vM(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->tryLogin$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$s4l6yUk_H-mfHygmtoJ2RipADJo(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->tryLogin$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final onResendClicked$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onResendClicked$lambda-1(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getInfoMessage()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->verifyEmailSuccessText:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final onResendClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p1

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->verifyEmailErrorText:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private final tryLogin()V
    .locals 5

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->infoMessage:Landroidx/databinding/ObservableField;

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object v0

    .line 79
    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v1, v3, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object v1

    .line 80
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$ATPdFFxm-EzG0Ds8-QNI6pHj3Ls;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v1

    .line 83
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Single;

    move-result-object v1

    .line 84
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$oLEtNTZpIe-20UHOxJNzIiYZ4vM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$oLEtNTZpIe-20UHOxJNzIiYZ4vM;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    .line 86
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$s4l6yUk_H-mfHygmtoJ2RipADJo;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$s4l6yUk_H-mfHygmtoJ2RipADJo;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    .line 84
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final tryLogin$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->loginCloudService:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getPassword()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/LoginCloudService;->login(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final tryLogin$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 7

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/getstarted/GetStartedScreenFragment;

    move-result-object p0

    move-object v1, p0

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

.method private static final tryLogin$lambda-5(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 88
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "User doesn\'t exist"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Landroidx/fragment/app/FragmentManager;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment$Companion;->newInstance()Lpowerwatch/matrix/com/pwgen2android/setup/signin/SignInFragment;

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

    :cond_1
    const-string v0, "it"

    .line 90
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorResolverKt;->retrofitResponse(Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/RetrofitErrorResponse;->getCloudErrorType()Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType;

    move-result-object p1

    :goto_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/cloud/CloudErrorType$UserNotEnabled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 91
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    const-string v0, "Your account is not validated yet."

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const v1, 0x7f0f00b5

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    move-object v0, p1

    .line 93
    :goto_1
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final getEmail()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->email:Landroidx/databinding/ObservableField;

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

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final getInfoMessage()Landroidx/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->infoMessage:Landroidx/databinding/ObservableField;

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

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onContinueClicked(Landroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->tryLogin()V

    return-void
.end method

.method public final onResendClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 58
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->infoMessage:Landroidx/databinding/ObservableField;

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 59
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 60
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    .line 61
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;->email:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->resendEmail(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object v0

    .line 62
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$YpBoZZDO5IisuiQsqVU5RvPuJEQ;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$YpBoZZDO5IisuiQsqVU5RvPuJEQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 65
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$EFARhyBI1tjS8rV5NdHefbN4ElA;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$EFARhyBI1tjS8rV5NdHefbN4ElA;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    .line 67
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$b_Pp7IvQ3pxGQPDdkG6dqz4rGtU;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/-$$Lambda$VerifyAccountViewModel$b_Pp7IvQ3pxGQPDdkG6dqz4rGtU;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/verifyaccount/VerifyAccountViewModel;)V

    .line 65
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
