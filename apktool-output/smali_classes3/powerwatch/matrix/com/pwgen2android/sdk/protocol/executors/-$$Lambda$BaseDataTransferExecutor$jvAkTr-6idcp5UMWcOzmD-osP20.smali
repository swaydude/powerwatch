.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$jvAkTr-6idcp5UMWcOzmD-osP20;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Action;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$jvAkTr-6idcp5UMWcOzmD-osP20;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$jvAkTr-6idcp5UMWcOzmD-osP20;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$jvAkTr-6idcp5UMWcOzmD-osP20;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$jvAkTr-6idcp5UMWcOzmD-osP20;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    invoke-static {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->lambda$jvAkTr-6idcp5UMWcOzmD-osP20(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;)V

    return-void
.end method
