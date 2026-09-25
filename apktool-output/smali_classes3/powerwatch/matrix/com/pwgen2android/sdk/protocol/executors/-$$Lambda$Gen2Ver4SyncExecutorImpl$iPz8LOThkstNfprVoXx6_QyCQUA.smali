.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/ObservableOnSubscribe;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-void
.end method


# virtual methods
.method public final subscribe(Lio/reactivex/ObservableEmitter;)V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;->lambda$iPz8LOThkstNfprVoXx6_QyCQUA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method
