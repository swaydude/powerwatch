.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/SingleOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;

.field public final synthetic f$1:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;->f$1:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/SingleEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;->f$0:Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$iyaxUeSFxL8Zq3niTmqR0-_WW2U;->f$1:Landroidx/fragment/app/FragmentManager;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->lambda$iyaxUeSFxL8Zq3niTmqR0-_WW2U(Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/dialogs/BaseDialog;Landroidx/fragment/app/FragmentManager;Lio/reactivex/SingleEmitter;)V

    return-void
.end method
