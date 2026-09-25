.class public final Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;
.super Ljava/lang/Object;
.source "DialogManager.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0003\u001a\u0010\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016J*\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u0004\"\u0004\u0008\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0016\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManager;",
        "()V",
        "openAlertDialog",
        "Lio/reactivex/Single;",
        "",
        "kotlin.jvm.PlatformType",
        "context",
        "Landroid/content/Context;",
        "title",
        "",
        "message",
        "positiveButtonText",
        "negativeButtonText",
        "openCustomDialog",
        "DATA",
        "fragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "dialogFragment",
        "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$DYP_MQRmUmp764Ma9HHXkG7HCzs(Lio/reactivex/SingleEmitter;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openAlertDialog$lambda-7$lambda-5$lambda-4(Lio/reactivex/SingleEmitter;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$K0Tpvf_0WAt1hvajs7ecgpbF0mc(Lio/reactivex/SingleEmitter;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openAlertDialog$lambda-7$lambda-5$lambda-3(Lio/reactivex/SingleEmitter;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic lambda$iyaxUeSFxL8Zq3niTmqR0-_WW2U(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openCustomDialog$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$k6BAc3okT38e7tKlSzeKQ2MagQs(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openCustomDialog$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$oJfMnX_kRJIsP43KoBzNkCmYTQc(Landroid/content/Context;III)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openAlertDialog$lambda-7(Landroid/content/Context;III)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$vpmMohCHyedwVhIe8kEUeU6E1UY(Landroid/app/AlertDialog$Builder;ILkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openAlertDialog$lambda-7$lambda-5(Landroid/app/AlertDialog$Builder;ILkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;)V

    return-void
.end method

.method public static synthetic lambda$xu37WseYmmz2k0wZRZdkCa0byAI(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openCustomDialog$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;)V

    return-void
.end method

.method public static synthetic lambda$zzbbI_wXzNlgqzGYxpx9RiKuqcE(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->openAlertDialog$lambda-7$lambda-6(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    return-void
.end method

.method private static final openAlertDialog$lambda-7(Landroid/content/Context;III)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "$context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    const/4 p0, 0x0

    .line 42
    invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 43
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 45
    new-instance p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {p0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 46
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;

    invoke-direct {p1, v0, p3, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;-><init>(Landroid/app/AlertDialog$Builder;ILkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-static {p1}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 54
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$zzbbI_wXzNlgqzGYxpx9RiKuqcE;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$zzbbI_wXzNlgqzGYxpx9RiKuqcE;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnDispose(Lio/reactivex/functions/Action;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final openAlertDialog$lambda-7$lambda-5(Landroid/app/AlertDialog$Builder;ILkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "$builder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$dialogInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$K0Tpvf_0WAt1hvajs7ecgpbF0mc;

    invoke-direct {v0, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$K0Tpvf_0WAt1hvajs7ecgpbF0mc;-><init>(Lio/reactivex/SingleEmitter;)V

    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 50
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$DYP_MQRmUmp764Ma9HHXkG7HCzs;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$DYP_MQRmUmp764Ma9HHXkG7HCzs;-><init>(Lio/reactivex/SingleEmitter;)V

    const p3, 0x7f0f005c

    invoke-virtual {p0, p3, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 53
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object p0

    iput-object p0, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-void
.end method

.method private static final openAlertDialog$lambda-7$lambda-5$lambda-3(Lio/reactivex/SingleEmitter;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "$it"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final openAlertDialog$lambda-7$lambda-5$lambda-4(Lio/reactivex/SingleEmitter;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "$it"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 51
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/reactivex/SingleEmitter;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private static final openAlertDialog$lambda-7$lambda-6(Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 1

    const-string v0, "$dialogInstance"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p0, Landroid/app/AlertDialog;

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/AlertDialog;->cancel()V

    :goto_0
    return-void
.end method

.method private static final openCustomDialog$lambda-2(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "$dialogFragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;)V

    invoke-static {v0}, Lio/reactivex/Single;->create(Lio/reactivex/SingleOnSubscribe;)Lio/reactivex/Single;

    move-result-object p1

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$xu37WseYmmz2k0wZRZdkCa0byAI;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$xu37WseYmmz2k0wZRZdkCa0byAI;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Single;->doOnDispose(Lio/reactivex/functions/Action;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final openCustomDialog$lambda-2$lambda-0(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;Lio/reactivex/SingleEmitter;)V
    .locals 1

    const-string v0, "$dialogFragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p2

    invoke-interface {p2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method private static final openCustomDialog$lambda-2$lambda-1(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;)V
    .locals 1

    const-string v0, "$dialogFragment"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;->dismissAllowingStateLoss()V

    return-void
.end method


# virtual methods
.method public openAlertDialog(Landroid/content/Context;IIII)Lio/reactivex/Single;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "IIII)",
            "Lio/reactivex/Single<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string p5, "context"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance p5, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;

    invoke-direct {p5, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;-><init>(Landroid/content/Context;III)V

    invoke-static {p5}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "defer<Boolean> {\n\n        val builder = AlertDialog.Builder(context)\n        builder.setTitle(title)\n        builder.setCancelable(false)\n        builder.setMessage(message)\n\n        var dialogInstance: AlertDialog? = null\n        Single.create<Boolean> {\n            builder.setPositiveButton(positiveButtonText) { _, _ ->\n                it.onSuccess(true)\n            }\n            builder.setNegativeButton(R.string.button_cancel) { _, _ ->\n                it.onSuccess(false)\n            }\n            dialogInstance = builder.show()\n        }.doOnDispose {\n            dialogInstance?.cancel()\n        }\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public openCustomDialog(Landroidx/fragment/app/FragmentManager;Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DATA:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/fragment/app/FragmentManager;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog<",
            "TDATA;>;)",
            "Lio/reactivex/Single<",
            "TDATA;>;"
        }
    .end annotation

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dialogFragment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$k6BAc3okT38e7tKlSzeKQ2MagQs;

    invoke-direct {v0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$k6BAc3okT38e7tKlSzeKQ2MagQs;-><init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;)V

    invoke-static {v0}, Lio/reactivex/Single;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "defer {\n\n            Single.create<DATA> {\n\n                dialogFragment.show(fragmentManager, dialogFragment::class.simpleName)\n            }.doOnDispose {\n                dialogFragment.dismissAllowingStateLoss()\n            }\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
