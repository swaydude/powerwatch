.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

.field public final synthetic f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

.field public final synthetic f$2:F


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iput p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;->f$2:F

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;->f$1:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;

    iget v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc;->f$2:F

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, v2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;->lambda$HbEBv61xvkZ_rTcMAd0j3bpUQKc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;FLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method
