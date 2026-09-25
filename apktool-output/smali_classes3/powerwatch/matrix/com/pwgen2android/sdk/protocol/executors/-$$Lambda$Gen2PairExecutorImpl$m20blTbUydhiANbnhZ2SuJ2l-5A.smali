.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

.field public final synthetic f$3:F

.field public final synthetic f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$3:F

    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$3:F

    iget-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A;->f$4:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    move-object v5, p1

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->lambda$m20blTbUydhiANbnhZ2SuJ2l-5A(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
