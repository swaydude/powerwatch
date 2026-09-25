.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;->lambda$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p1

    return-object p1
.end method
