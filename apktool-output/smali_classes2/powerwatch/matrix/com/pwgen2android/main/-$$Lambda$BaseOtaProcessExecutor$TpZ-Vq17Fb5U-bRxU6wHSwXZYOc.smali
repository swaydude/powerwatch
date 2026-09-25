.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public synthetic constructor <init>(ZLpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;->f$0:Z

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;->f$0:Z

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->lambda$TpZ-Vq17Fb5U-bRxU6wHSwXZYOc(ZLpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
