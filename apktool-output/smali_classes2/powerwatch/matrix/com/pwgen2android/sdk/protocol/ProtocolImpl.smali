.class public Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;
.super Ljava/lang/Object;
.source "Protocol.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0008\u0010\u0015\u001a\u00020\u000eH\u0016J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00172\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;",
        "parser",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V",
        "channel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "getChannel",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "setChannel",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V",
        "getParser",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;",
        "close",
        "Lio/reactivex/Completable;",
        "connectToChannel",
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
.field private channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

.field private final parser:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;)V
    .locals 1

    const-string v0, "parser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->parser:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    return-void
.end method

.method public static synthetic lambda$2VnOlXiadf9V3wOxQAFMI6Eiz3w(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->messageOutput$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$7k9vAWpUXRYuGvAGRY_X3wq20Wg(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->sendMessage$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Q74jnqvpNERRGQyvMWo3gDdTa3g(Lio/reactivex/disposables/Disposable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->messageOutput$lambda-1(Lio/reactivex/disposables/Disposable;)V

    return-void
.end method

.method public static synthetic lambda$YKX_ndHSIX5bvI3dwlnNPftDJYA(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->sendMessage$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$abHRpp33_gxZRVTlL2nwuBJEWTE(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->sendMessage$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    return-void
.end method

.method public static synthetic lambda$zW96FteXA2FS_v_fzTD6bz8ZZw8(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->sendMessage$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method private static final messageOutput$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->getParser()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;->parseResponse([B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    return-object p0
.end method

.method private static final messageOutput$lambda-1(Lio/reactivex/disposables/Disposable;)V
    .locals 1

    const-string p0, "test_sub"

    const-string v0, "Subscribe called"

    .line 70
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final sendMessage$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Sending message to parser"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final sendMessage$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)[B
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->getParser()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    move-result-object p0

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;->parseMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)[B

    move-result-object p0

    return-object p0
.end method

.method private static final sendMessage$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->send([B)Lio/reactivex/Single;

    move-result-object p0

    .line 81
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$zW96FteXA2FS_v_fzTD6bz8ZZw8;

    invoke-direct {p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$zW96FteXA2FS_v_fzTD6bz8ZZw8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {p0, p2}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final sendMessage$lambda-5$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;[B)Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;
    .locals 1

    const-string v0, "$message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 2

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Calling close, but channel is not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "error(Throwable(\"Calling close, but channel is not initialized!\"))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 93
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->close()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public connectToChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "channel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    .line 88
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->open()Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method protected final getChannel()Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;
    .locals 1

    .line 57
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    return-object v0
.end method

.method protected final getParser()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;
    .locals 1

    .line 51
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->parser:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolParser;

    return-object v0
.end method

.method public getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;
    .locals 3

    .line 60
    new-instance v0, Lkotlin/NotImplementedError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "An operation is not implemented: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "not implemented"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;",
            ">;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Calling messageOutput, but channel is not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "error(Throwable(\"Calling messageOutput, but channel is not initialized!\"))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    .line 65
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->receivedData()Lio/reactivex/Observable;

    move-result-object v0

    .line 66
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$2VnOlXiadf9V3wOxQAFMI6Eiz3w;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$2VnOlXiadf9V3wOxQAFMI6Eiz3w;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$Q74jnqvpNERRGQyvMWo3gDdTa3g;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$Q74jnqvpNERRGQyvMWo3gDdTa3g;

    .line 69
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "channel!!.receivedData()\n                .map {\n                    parser.parseResponse(it)\n                }\n                .doOnSubscribe {\n                    Log.d(\"test_sub\", \"Subscribe called\")\n                }"

    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public resubscribe()Lio/reactivex/Completable;
    .locals 2

    .line 54
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->resubscribeCharacteristics()Lio/reactivex/Completable;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "complete()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
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

    .line 75
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "Calling sendMessage, but channel is not initialized!"

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Single;->error(Ljava/lang/Throwable;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "error(Throwable(\"Calling sendMessage, but channel is not initialized!\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 76
    :cond_0
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    .line 77
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$abHRpp33_gxZRVTlL2nwuBJEWTE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$abHRpp33_gxZRVTlL2nwuBJEWTE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 78
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$YKX_ndHSIX5bvI3dwlnNPftDJYA;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$YKX_ndHSIX5bvI3dwlnNPftDJYA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object v0

    .line 79
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$7k9vAWpUXRYuGvAGRY_X3wq20Wg;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/-$$Lambda$ProtocolImpl$7k9vAWpUXRYuGvAGRY_X3wq20Wg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "just(message)\n                .doOnSuccess { Log.d(javaClass.simpleName, \"Sending message to parser\") }\n                .map { parser.parseMessage(message) }\n                .flatMap {\n                    channel!!.send(it)\n                            .map { message }\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected final setChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolImpl;->channel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    return-void
.end method
