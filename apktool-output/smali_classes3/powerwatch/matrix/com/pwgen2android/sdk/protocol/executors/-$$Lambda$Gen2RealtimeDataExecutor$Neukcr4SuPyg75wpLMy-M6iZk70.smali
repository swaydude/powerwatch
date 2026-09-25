.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$Neukcr4SuPyg75wpLMy-M6iZk70;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$Neukcr4SuPyg75wpLMy-M6iZk70;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeDataExecutor$Neukcr4SuPyg75wpLMy-M6iZk70;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;->lambda$Neukcr4SuPyg75wpLMy-M6iZk70(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeDataExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/RealtimeWatchData;

    move-result-object p1

    return-object p1
.end method
