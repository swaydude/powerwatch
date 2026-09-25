.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

.field public final synthetic f$4:F


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    iput p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$4:F

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    iget v4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M;->f$4:F

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;->lambda$5gSZMsc-V1mIL1qhk05gAeKPL_M(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
