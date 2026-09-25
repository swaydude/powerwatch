.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;
.source "Protocol.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;",
        "characteristicTypeMap",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
        "",
        "bleProtocolParser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
        "(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V",
        "getType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "sendMessage",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "message",
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
.field private final characteristicTypeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CharacteristicType;",
            "Ljava/lang/String;",
            ">;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
            ")V"
        }
    .end annotation

    const-string v0, "characteristicTypeMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleProtocolParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    .line 105
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->characteristicTypeMap:Ljava/util/Map;

    return-void
.end method

.method public static synthetic lambda$SNsPdr3ZT9QwY0xk_7pT-dHQGmc(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->sendMessage$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Wenvj5nPcnYDqSQNxtXQAyG5aHc(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->sendMessage$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$bySLvbSuCHZELmuNdpzemFV_Unc(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->sendMessage$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lkotlin/Pair;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$eXZPvupLkfyIeY7VaTun6Q7M4zM(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->sendMessage$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method

.method public static synthetic lambda$s-vQi6rERKCwsoex4p4tqYUxWPU(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->sendMessage$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method private static final sendMessage$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Sending message to parser"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final sendMessage$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    new-instance p2, Lkotlin/Pair;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getMessageType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object v0

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->getParser()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    move-result-object p1

    invoke-interface {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;->parseMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)[B

    move-result-object p0

    invoke-direct {p2, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method private static final sendMessage$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lkotlin/Pair;)Lio/reactivex/SingleSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->ACK_MESSAGE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    if-ne v0, v1, :cond_0

    .line 118
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    invoke-interface {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->sendEvent([B)Lio/reactivex/Single;

    move-result-object p0

    .line 119
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$SNsPdr3ZT9QwY0xk_7pT-dHQGmc;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$SNsPdr3ZT9QwY0xk_7pT-dHQGmc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    goto :goto_0

    .line 121
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    invoke-interface {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->send([B)Lio/reactivex/Single;

    move-result-object p0

    .line 122
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$s-vQi6rERKCwsoex4p4tqYUxWPU;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$s-vQi6rERKCwsoex4p4tqYUxWPU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final sendMessage$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    const-string v0, "$message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final sendMessage$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    const-string v0, "$message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 108
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_DTP:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ">;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "Calling sendMessage, but channel is not initialized!"

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "error(Throwable(\"Calling sendMessage, but channel is not initialized!\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 113
    :cond_0
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 114
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$eXZPvupLkfyIeY7VaTun6Q7M4zM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$eXZPvupLkfyIeY7VaTun6Q7M4zM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 115
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;

    invoke-direct {v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$Wenvj5nPcnYDqSQNxtXQAyG5aHc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 116
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2Protocol$bySLvbSuCHZELmuNdpzemFV_Unc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "just(message)\n                .doOnSuccess { Log.d(javaClass.simpleName, \"Sending message to parser\") }\n                .map { Pair(message.messageType, parser.parseMessage(message)) }\n                .flatMap {\n                    if (it.first == ProtocolMessageType.ACK_MESSAGE) {\n                        channel!!.sendEvent(it.second)\n                                .map { message }\n                    } else\n                        channel!!.send(it.second)\n                                .map { message }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
