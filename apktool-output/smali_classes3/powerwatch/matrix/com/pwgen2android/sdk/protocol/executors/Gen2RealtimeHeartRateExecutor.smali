.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;
.super Ljava/lang/Object;
.source "Gen2HeartRateExecutor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;",
        "",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "parser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;",
        "receiveData",
        "Lio/reactivex/Observable;",
        "",
        "deviceID",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final parser:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 37
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->parser:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;

    return-void
.end method

.method public static synthetic lambda$8uxOZ_L3ENOl_7gmGHfIiY8i81k(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->receiveData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$P44C3i6iSDyUANq-uMmNWM8ICv0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->receiveData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method private static final receiveData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final receiveData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Ljava/lang/Long;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->parser:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2HeartRateParser;->parse(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final receiveData(Ljava/lang/String;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$P44C3i6iSDyUANq-uMmNWM8ICv0;

    .line 41
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 42
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$8uxOZ_L3ENOl_7gmGHfIiY8i81k;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/-$$Lambda$Gen2RealtimeHeartRateExecutor$8uxOZ_L3ENOl_7gmGHfIiY8i81k;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2RealtimeHeartRateExecutor;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "communicator.messageOutput()\n                .filter { it.protocolType == ProtocolType.GEN2_HEART_RATE }\n                .map { parser.parse(it) }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
