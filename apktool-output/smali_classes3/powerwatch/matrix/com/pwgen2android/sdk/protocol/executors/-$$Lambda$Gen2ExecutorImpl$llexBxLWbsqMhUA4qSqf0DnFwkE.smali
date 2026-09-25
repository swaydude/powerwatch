.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

.field public final synthetic f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE;->f$3:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    invoke-static {v0, v1, v2, v3, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$llexBxLWbsqMhUA4qSqf0DnFwkE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
