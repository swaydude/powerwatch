.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/CompletableOnSubscribe;


# instance fields
.field public final synthetic f$0:Landroid/app/Activity;

.field public final synthetic f$1:Lcom/google/android/play/core/appupdate/AppUpdateInfo;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;->f$0:Landroid/app/Activity;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;->f$1:Lcom/google/android/play/core/appupdate/AppUpdateInfo;

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;->f$2:I

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/CompletableEmitter;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;->f$0:Landroid/app/Activity;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;->f$1:Lcom/google/android/play/core/appupdate/AppUpdateInfo;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$_FNOA9D3H2tafMlbE-yDB8UjVv0;->f$2:I

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->lambda$_FNOA9D3H2tafMlbE-yDB8UjVv0(Landroid/app/Activity;Lcom/google/android/play/core/appupdate/AppUpdateInfo;ILio/reactivex/CompletableEmitter;)V

    return-void
.end method
