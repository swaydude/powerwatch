.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/SingleOnSubscribe;


# instance fields
.field public final synthetic f$0:Landroid/app/AlertDialog$Builder;

.field public final synthetic f$1:I

.field public final synthetic f$2:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog$Builder;ILkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;->f$0:Landroid/app/AlertDialog$Builder;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;->f$1:I

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;->f$2:Lkotlin/jvm/internal/Ref$ObjectRef;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/SingleEmitter;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;->f$0:Landroid/app/AlertDialog$Builder;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;->f$1:I

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/-$$Lambda$DialogManagerImpl$vpmMohCHyedwVhIe8kEUeU6E1UY;->f$2:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/ui/dialogManager/DialogManagerImpl;->lambda$vpmMohCHyedwVhIe8kEUeU6E1UY(Landroid/app/AlertDialog$Builder;ILkotlin/jvm/internal/Ref$ObjectRef;Lio/reactivex/SingleEmitter;)V

    return-void
.end method
