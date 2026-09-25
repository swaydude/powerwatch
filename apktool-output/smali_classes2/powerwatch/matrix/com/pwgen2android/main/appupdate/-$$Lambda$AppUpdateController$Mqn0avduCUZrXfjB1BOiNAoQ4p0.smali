.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/google/android/play/core/tasks/OnSuccessListener;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

.field public final synthetic f$1:Lio/reactivex/SingleEmitter;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;->f$1:Lio/reactivex/SingleEmitter;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$Mqn0avduCUZrXfjB1BOiNAoQ4p0;->f$1:Lio/reactivex/SingleEmitter;

    check-cast p1, Lcom/google/android/play/core/appupdate/AppUpdateInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->lambda$Mqn0avduCUZrXfjB1BOiNAoQ4p0(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Lio/reactivex/SingleEmitter;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V

    return-void
.end method
