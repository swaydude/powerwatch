.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;->f$0:Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/main/-$$Lambda$BaseOtaProcessExecutor$CximnGhyr_PHqfFWhF0CW-hKdhE;->f$2:Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;->lambda$CximnGhyr_PHqfFWhF0CW-hKdhE(Lpowerwatch/matrix/com/pwgen2android/main/BaseOtaProcessExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
