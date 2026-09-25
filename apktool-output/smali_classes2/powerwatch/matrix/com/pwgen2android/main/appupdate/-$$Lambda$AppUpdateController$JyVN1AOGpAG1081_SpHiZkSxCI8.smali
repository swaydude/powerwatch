.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

.field public final synthetic f$1:Landroid/app/Activity;

.field public final synthetic f$2:I


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Landroid/app/Activity;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;->f$1:Landroid/app/Activity;

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;->f$2:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;->f$1:Landroid/app/Activity;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/-$$Lambda$AppUpdateController$JyVN1AOGpAG1081_SpHiZkSxCI8;->f$2:I

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;->lambda$JyVN1AOGpAG1081_SpHiZkSxCI8(Lpowerwatch/matrix/com/pwgen2android/main/appupdate/AppUpdateController;Landroid/app/Activity;ILpowerwatch/matrix/com/pwgen2android/main/appupdate/UpdateState;)Lio/reactivex/SingleSource;

    move-result-object p1

    return-object p1
.end method
