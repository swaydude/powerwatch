.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;
.super Ljava/lang/Object;
.source "Protocol.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u0096\u0001J\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;",
        "bleProtocolImpl",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)V",
        "close",
        "Lio/reactivex/Completable;",
        "connectToChannel",
        "channel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "getType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
        "resubscribe",
        "sendMessage",
        "Lio/reactivex/Single;",
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
.field private final bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)V
    .locals 1

    const-string v0, "bleProtocolImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    return-void
.end method

.method public synthetic constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 163
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;

    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/SimpleProtocolParser;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/SimpleProtocolParser;-><init>()V

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)V

    return-void
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->close()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public connectToChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Completable;
    .locals 4

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    .line 170
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->connectToChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Completable;

    move-result-object p1

    .line 172
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    const/4 v2, 0x3

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    invoke-direct {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->SETTING:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    invoke-direct {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;)V

    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/Single;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Lio/reactivex/Single;->ignoreElement()Lio/reactivex/Completable;

    move-result-object v0

    check-cast v0, Lio/reactivex/CompletableSource;

    .line 171
    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "bleProtocolImpl\n                .connectToChannel(channel)\n                .andThen(\n                        sendMessage(ProtocolMessage(ProtocolPayload(byteArrayOf(0x84.toByte(), 0x42, 0x01)), getType(), ProtocolMessageType.SETTING))\n                                .ignoreElement()\n                )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    nop

    :array_0
    .array-data 1
        -0x7ct
        0x42t
        0x1t
    .end array-data
.end method

.method public getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 1

    .line 165
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_DTP_X:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    return-object v0
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->messageOutput()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public resubscribe()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->resubscribe()Lio/reactivex/Completable;

    move-result-object v0

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

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/DTPXProtocol;->bleProtocolImpl:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
