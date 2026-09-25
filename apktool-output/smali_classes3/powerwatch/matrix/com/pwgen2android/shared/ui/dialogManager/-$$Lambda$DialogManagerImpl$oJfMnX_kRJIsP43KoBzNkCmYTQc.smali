.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:I

.field public final synthetic f$2:I

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$0:Landroid/content/Context;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$1:I

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$2:I

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$3:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$0:Landroid/content/Context;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$1:I

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$2:I

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$oJfMnX_kRJIsP43KoBzNkCmYTQc;->f$3:I

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->lambda$oJfMnX_kRJIsP43KoBzNkCmYTQc(Landroid/content/Context;III)Lio/reactivex/SingleSource;

    move-result-object v0

    return-object v0
.end method
