.class public final Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;
.super Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;
.source "ForgotPasswordViewModel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0010J\t\u0010$\u001a\u00020\u0016H\u0096\u0001J\u0008\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020&J\n\u0010(\u001a\u00020&*\u00020)R\u001c\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\n0\n0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u001a0\u001a0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u001a0\u001a0\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u000e\u0010\u001e\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00080\u00080\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u000c0\u000c0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010!\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\"\u001a\u0010\u0012\u000c\u0012\n \u0013*\u0004\u0018\u00010\u00160\u00160\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;",
        "Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;",
        "userAccountRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;",
        "networkInfoProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "activityContext",
        "Landroid/content/Context;",
        "fragment",
        "Landroidx/fragment/app/Fragment;",
        "emailValidator",
        "Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;",
        "loginFlowBaseViewModel",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V",
        "activityContextWeakReference",
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
        "forgotPasswordEmailErrorText",
        "fragmentManagerWeakReference",
        "fragmentWeakReference",
        "isButtonVisible",
        "responseSuccess",
        "getResponseSuccess",
        "checkAndDisplayNetworkError",
        "hideKeyboard",
        "",
        "onBackClicked",
        "onForgotPasswordClicked",
        "Landroid/view/View;",
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
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final activityContextWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
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

.field private final forgotPasswordEmailErrorText:Ljava/lang/String;

.field private final fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/FragmentManager;",
            ">;"
        }
    .end annotation
.end field

.field private final fragmentWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroidx/fragment/app/Fragment;",
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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->Companion:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel$Companion;

    .line 99
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V
    .locals 1

    const-string v0, "userAccountRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkInfoProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "fragmentManager"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "activityContext"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "fragment"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "emailValidator"

    invoke-static {p6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "loginFlowBaseViewModel"

    invoke-static {p7, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x3

    .line 27
    invoke-direct {p0, p2, p2, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/BaseViewModel;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/RxBus;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    .line 25
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    .line 26
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    .line 29
    new-instance p6, Ljava/lang/ref/WeakReference;

    invoke-direct {p6, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

    .line 31
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->activityContextWeakReference:Ljava/lang/ref/WeakReference;

    .line 32
    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->fragmentWeakReference:Ljava/lang/ref/WeakReference;

    const p3, 0x7f0f0179

    .line 33
    invoke-virtual {p4, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string p4, "activityContext.getString(R.string.resend_email_error_message)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->forgotPasswordEmailErrorText:Ljava/lang/String;

    .line 35
    new-instance p3, Landroidx/databinding/ObservableField;

    const/4 p4, 0x1

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p5

    invoke-direct {p3, p5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    .line 36
    new-instance p3, Landroidx/databinding/ObservableField;

    const-string p5, ""

    invoke-direct {p3, p5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    .line 37
    new-instance p3, Landroidx/databinding/ObservableField;

    invoke-direct {p3, p5}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->emailField:Landroidx/databinding/ObservableField;

    .line 38
    new-instance p3, Landroidx/databinding/ObservableField;

    const/4 p5, 0x0

    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p6

    invoke-direct {p3, p6}, Landroidx/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->responseSuccess:Landroidx/databinding/ObservableField;

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p3

    .line 42
    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;

    invoke-static {p1, p5, p4, p4, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository$DefaultImpls;->getFirst$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/GetFirstRepository;ZZILjava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    .line 43
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$MDRo9DKHtOKwvu7Zcke2wKTHH-M;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$MDRo9DKHtOKwvu7Zcke2wKTHH-M;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V

    sget-object p4, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$2W4zBaQUFT8b1Z_N10wVNN5ehaI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$2W4zBaQUFT8b1Z_N10wVNN5ehaI;

    invoke-virtual {p1, p2, p4}, Lio/reactivex/Single;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 41
    invoke-virtual {p3, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    .line 25
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;-><init>()V

    move-object v7, v0

    goto :goto_0

    :cond_0
    move-object v7, p6

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;

    move-object v3, p2

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModelImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

    move-object v8, v0

    goto :goto_1

    :cond_1
    move-object v3, p2

    move-object/from16 v8, p7

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 20
    invoke-direct/range {v1 .. v8}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;Lpowerwatch/matrix/com/pwgen2android/shared/host/NetworkInfoProvider;Landroidx/fragment/app/FragmentManager;Landroid/content/Context;Landroidx/fragment/app/Fragment;Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;)V

    return-void
.end method

.method private static final _init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getEmailField()Landroidx/databinding/ObservableField;

    move-result-object p0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    return-void
.end method

.method private static final _init_$lambda-1(Ljava/lang/Throwable;)V
    .locals 2

    .line 46
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->TAG:Ljava/lang/String;

    const-string v1, "User doesn\'t exist, emailField field is empty."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method private final hideKeyboard()V
    .locals 3

    .line 86
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->activityContextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    .line 87
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->fragmentWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    :goto_0
    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    .line 89
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->activityContextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "input_method"

    .line 90
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    :goto_1
    const-string v0, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    .line 89
    invoke-static {v2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 91
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_2
    return-void
.end method

.method public static synthetic lambda$2W4zBaQUFT8b1Z_N10wVNN5ehaI(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->_init_$lambda-1(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$L_SpnI7M8tH4DQdj6G4cTthySNk(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->onForgotPasswordClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$MDRo9DKHtOKwvu7Zcke2wKTHH-M(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->_init_$lambda-0(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;)V

    return-void
.end method

.method public static synthetic lambda$Qfr070rahV1QTPHh2DhQix7LDGU(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->onForgotPasswordClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$sPwFoCLHYmZDoiipHvUvzZ6RYEU(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->onForgotPasswordClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V

    return-void
.end method

.method private static final onForgotPasswordClicked$lambda-2(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->isButtonVisible()Landroidx/databinding/ObservableField;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 70
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->hideKeyboard()V

    return-void
.end method

.method private static final onForgotPasswordClicked$lambda-3(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getResponseSuccess()Landroidx/databinding/ObservableField;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 75
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->TAG:Ljava/lang/String;

    const-string v0, "ForgotPassword request success."

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final onForgotPasswordClicked$lambda-4(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getErrorMessage()Landroidx/databinding/ObservableField;

    move-result-object v0

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->forgotPasswordEmailErrorText:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 79
    sget-object p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->TAG:Ljava/lang/String;

    const-string v0, "ForgotPassword request error."

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public checkAndDisplayNetworkError()Z
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->loginFlowBaseViewModel:Lpowerwatch/matrix/com/pwgen2android/setup/LoginFlowBaseViewModel;

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

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->emailField:Landroidx/databinding/ObservableField;

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

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

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

    .line 38
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->responseSuccess:Landroidx/databinding/ObservableField;

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

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    return-object v0
.end method

.method public final onBackClicked()V
    .locals 1

    .line 95
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->fragmentManagerWeakReference:Ljava/lang/ref/WeakReference;

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

.method public final onForgotPasswordClicked(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->emailField:Landroidx/databinding/ObservableField;

    invoke-virtual {v0}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 56
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->emailValidator:Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;

    invoke-virtual {v1, v0}, Lpowerwatch/matrix/com/pwgen2android/utils/EmailValidator;->isEmailValid(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 58
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->errorMessage:Landroidx/databinding/ObservableField;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f0f00c3

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 59
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->hideKeyboard()V

    return-void

    .line 63
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->checkAndDisplayNetworkError()Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    .line 65
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->isButtonVisible:Landroidx/databinding/ObservableField;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 66
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->getCompositeDisposable()Lio/reactivex/disposables/CompositeDisposable;

    move-result-object p1

    .line 67
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->userAccountRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;->emailField:Landroidx/databinding/ObservableField;

    invoke-virtual {v1}, Landroidx/databinding/ObservableField;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/UserAccountRepository;->forgotPassword(Ljava/lang/String;)Lio/reactivex/Completable;

    move-result-object v0

    .line 68
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$L_SpnI7M8tH4DQdj6G4cTthySNk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$L_SpnI7M8tH4DQdj6G4cTthySNk;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnEvent(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object v0

    .line 73
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$sPwFoCLHYmZDoiipHvUvzZ6RYEU;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$sPwFoCLHYmZDoiipHvUvzZ6RYEU;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V

    .line 77
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$Qfr070rahV1QTPHh2DhQix7LDGU;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/-$$Lambda$ForgotPasswordViewModel$Qfr070rahV1QTPHh2DhQix7LDGU;-><init>(Lpowerwatch/matrix/com/pwgen2android/setup/forgotpassword/ForgotPasswordViewModel;)V

    .line 72
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method
