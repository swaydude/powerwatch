.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

.field public final synthetic f$3:F


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$3:F

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$ClassicDataTransferExecutor$PdCpIrD3OQgo4ZtSDIXlkdO2_HU;->f$3:F

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;->lambda$PdCpIrD3OQgo4ZtSDIXlkdO2_HU(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/ClassicDataTransferExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
