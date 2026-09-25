.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$UCdrG1BvGtMDsraMM0Juat2Tcj0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/ObservableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$UCdrG1BvGtMDsraMM0Juat2Tcj0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$UCdrG1BvGtMDsraMM0Juat2Tcj0;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/ObservableEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$UCdrG1BvGtMDsraMM0Juat2Tcj0;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Version3PairExecutorImpl$UCdrG1BvGtMDsraMM0Juat2Tcj0;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;->lambda$UCdrG1BvGtMDsraMM0Juat2Tcj0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method
