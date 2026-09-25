.class public final Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;
.super Ljava/lang/Object;
.source "OtaCommunicatorImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/ota/OTACommunicator;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "receivedData",
        "Lio/reactivex/Observable;",
        "",
        "sendMessage",
        "",
        "deviceId",
        "",
        "data",
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


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "communicator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    return-void
.end method

.method public static synthetic lambda$29ySyUpLHMPZE2S1PqL3L-YYzyQ(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->sendMessage$lambda-3(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$GjOZoXgjygaSzt1wYOf850hOB80(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->receivedData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$m1g3ScQpHdkgg8hVf4mHzg9NFKY(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->receivedData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$zhpKZtDTzxuNzW92kF3uiY1NrGY()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->sendMessage$lambda-2()V

    return-void
.end method

.method private static final receivedData$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final receivedData$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)[B
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getPayload()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;->getData()[B

    move-result-object p0

    return-object p0
.end method

.method private static final sendMessage$lambda-2()V
    .locals 0

    return-void
.end method

.method private static final sendMessage$lambda-3(Ljava/lang/Throwable;)V
    .locals 0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public receivedData()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->messageOutput()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$GjOZoXgjygaSzt1wYOf850hOB80;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$GjOZoXgjygaSzt1wYOf850hOB80;

    .line 17
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$m1g3ScQpHdkgg8hVf4mHzg9NFKY;

    .line 18
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "communicator.messageOutput()\n                .filter { it.protocolType == ProtocolType.BLE_OTA }\n                .map { it.protocolMessage.payload.data }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public sendMessage(Ljava/lang/String;[B)V
    .locals 9

    const-string v0, "deviceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/ota/OtaCommunicatorImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    .line 25
    new-instance v8, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;

    invoke-direct {v3, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;-><init>([B)V

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolPayload;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->BLE_OTA:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    .line 24
    invoke-direct {v1, p1, v8, p2, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object p1

    sget-object p2, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$zhpKZtDTzxuNzW92kF3uiY1NrGY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$zhpKZtDTzxuNzW92kF3uiY1NrGY;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$29ySyUpLHMPZE2S1PqL3L-YYzyQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/ota/-$$Lambda$OtaCommunicatorImpl$29ySyUpLHMPZE2S1PqL3L-YYzyQ;

    .line 27
    invoke-virtual {p1, p2, v0}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    return-void
.end method
