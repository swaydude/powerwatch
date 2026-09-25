.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncXExecutor$DwR5dIF2ggZhJSq5zj419wEIalQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncXExecutor$DwR5dIF2ggZhJSq5zj419wEIalQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncXExecutor$DwR5dIF2ggZhJSq5zj419wEIalQ;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncXExecutor$DwR5dIF2ggZhJSq5zj419wEIalQ;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$SyncXExecutor$DwR5dIF2ggZhJSq5zj419wEIalQ;->f$1:Ljava/lang/String;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    invoke-static {v0, v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;->lambda$DwR5dIF2ggZhJSq5zj419wEIalQ(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncXExecutor;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/ObservableSource;

    move-result-object p1

    return-object p1
.end method
