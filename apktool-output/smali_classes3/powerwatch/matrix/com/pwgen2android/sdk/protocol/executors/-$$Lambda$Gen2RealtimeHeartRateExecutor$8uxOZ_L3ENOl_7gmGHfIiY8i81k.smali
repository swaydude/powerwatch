.class public final synthetic Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$8uxOZ_L3ENOl_7gmGHfIiY8i81k;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lio/reactivex/functions/Function;


# instance fields
.field public final synthetic f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;


# direct methods
.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$8uxOZ_L3ENOl_7gmGHfIiY8i81k;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$8uxOZ_L3ENOl_7gmGHfIiY8i81k;->f$0:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    invoke-static {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->lambda$8uxOZ_L3ENOl_7gmGHfIiY8i81k(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
