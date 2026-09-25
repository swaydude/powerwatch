.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$Kp-CergAR-Gmz3R88FXnKFXzFm8;->f$1:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->lambda$Kp-CergAR-Gmz3R88FXnKFXzFm8(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;)V

    return-void
.end method
