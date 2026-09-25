.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:F


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$2:Ljava/lang/String;

    iput p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$3:F

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$2:Ljava/lang/String;

    iget v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0;->f$3:F

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;->lambda$1pv-qWTDWdg5HwHB2dUWWvymbL0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;Ljava/lang/String;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
