.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$QHmn3FEgQerd1FGfC0HGCsdXomA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p1

    return-object p1
.end method
