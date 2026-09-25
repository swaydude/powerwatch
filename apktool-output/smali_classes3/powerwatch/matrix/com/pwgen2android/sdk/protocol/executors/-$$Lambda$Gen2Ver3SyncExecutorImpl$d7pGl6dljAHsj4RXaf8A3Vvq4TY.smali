.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

.field public final synthetic f$3:F

.field public final synthetic f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

.field public final synthetic f$5:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$3:F

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$5:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$3:F

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY;->f$5:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-object v6, p1

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;->lambda$d7pGl6dljAHsj4RXaf8A3Vvq4TY(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
