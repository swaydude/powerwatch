.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;
.super Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;
.source "Protocol.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0008\u0010\u000b\u001a\u00020\u000cH\u0016J\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;",
        "characteristic",
        "Ljava/util/UUID;",
        "bleProtocolParser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
        "(Ljava/util/UUID;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V",
        "connectToChannel",
        "Lio/reactivex/Completable;",
        "channel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
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
.field private final characteristic:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V
    .locals 1

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleProtocolParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-direct {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    .line 192
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;->characteristic:Ljava/util/UUID;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 193
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParserImpl;-><init>()V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    .line 192
    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;-><init>(Ljava/util/UUID;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    return-void
.end method

.method private static final connectToChannel$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/CompletableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;->setChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V

    .line 205
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;->characteristic:Ljava/util/UUID;

    invoke-interface {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->open(Ljava/util/UUID;)Lio/reactivex/Completable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method public static synthetic lambda$q5ICi84c19kFrmw5aVPCxC7gDdo(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;->connectToChannel$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public connectToChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$Gen2HeartRateProtocol$q5ICi84c19kFrmw5aVPCxC7gDdo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Gen2HeartRateProtocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n            this.channel = channel\n            this.channel?.open(this.characteristic)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 195
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->GEN2_HEART_RATE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/Single;
    .locals 1
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

    .line 199
    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "not implemented"

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "error(Throwable(\"not implemented\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
