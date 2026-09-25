.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$GPSUpdateProcessExecutor$DmqpN2SBtlw3mM3h6WFwlY-w0B8;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;->lambda$DmqpN2SBtlw3mM3h6WFwlY-w0B8(Lpowerwatch/matrix/com/pwgen2android/main/GPSUpdateProcessExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
