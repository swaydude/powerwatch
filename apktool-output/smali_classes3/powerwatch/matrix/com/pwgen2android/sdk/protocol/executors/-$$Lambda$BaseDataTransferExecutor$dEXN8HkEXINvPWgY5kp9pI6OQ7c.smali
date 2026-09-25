.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

.field public final synthetic f$1:F

.field public final synthetic f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iput p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;->f$1:F

    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iget v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;->f$1:F

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c;->f$2:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->lambda$dEXN8HkEXINvPWgY5kp9pI6OQ7c(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method
