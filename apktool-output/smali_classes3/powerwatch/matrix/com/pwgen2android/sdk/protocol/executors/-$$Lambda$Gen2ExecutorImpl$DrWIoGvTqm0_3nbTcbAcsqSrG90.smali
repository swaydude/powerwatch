.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public final synthetic f$3:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$3:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90;->f$3:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$DrWIoGvTqm0_3nbTcbAcsqSrG90(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Ljava/lang/String;)Lio/reactivex/ObservableSource;

    move-result-object v0

    return-object v0
.end method
