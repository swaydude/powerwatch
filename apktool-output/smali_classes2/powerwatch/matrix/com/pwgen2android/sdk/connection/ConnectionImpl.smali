.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;
.super Ljava/lang/Object;
.source "Connection.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0008\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u001aH\u0016J\u0016\u0010\u001b\u001a\u0010\u0012\u000c\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001cH\u0016J\u0008\u0010\u001f\u001a\u00020 H\u0016J\u0008\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u000cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
        "protocol",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;",
        "communicationChannel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V",
        "connectionInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
        "getConnectionInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
        "setConnectionInfo",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)V",
        "disposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "output",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "sendingSubject",
        "close",
        "Lio/reactivex/Completable;",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "open",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;",
        "kotlin.jvm.PlatformType",
        "refresh",
        "",
        "resubscribeCharacteristics",
        "sendMessage",
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
.field private communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

.field private connectionInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

.field private final disposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final output:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation
.end field

.field private protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

.field private final sendingSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicationChannel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "technologyType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    .line 34
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    .line 42
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 44
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p2

    const-string v0, "create()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->output:Lio/reactivex/subjects/PublishSubject;

    .line 46
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    invoke-direct {p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->connectionInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    .line 48
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->sendingSubject:Lio/reactivex/subjects/PublishSubject;

    .line 54
    new-instance p3, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$eHL0jCD8RtnjdOVXvlXMGLBb8i0;

    invoke-direct {p3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$eHL0jCD8RtnjdOVXvlXMGLBb8i0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    invoke-virtual {p2, p3}, Lio/reactivex/subjects/PublishSubject;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p2

    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$v8IgTTMD5IteRTkmg8Wz5suDzK4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$v8IgTTMD5IteRTkmg8Wz5suDzK4;

    .line 65
    invoke-virtual {p2, p3}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 68
    invoke-virtual {p2}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p2

    .line 69
    invoke-virtual {p2}, Lio/reactivex/Observable;->subscribe()Lio/reactivex/disposables/Disposable;

    move-result-object p2

    .line 52
    invoke-virtual {p1, p2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final _init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendingMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object v1

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lio/reactivex/Single;

    move-result-object v0

    .line 56
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$cDz3kYYSr19sSBVO1mpjeOoi3CI;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$cDz3kYYSr19sSBVO1mpjeOoi3CI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$lmbO4oDR0WlH44actS9KGHmPZ2o;

    .line 59
    invoke-virtual {p1, v0}, Lio/reactivex/Single;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Maybe;

    move-result-object p1

    .line 60
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$Es6ckCyGVIdRrMfIXBjNcALgP4g;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$Es6ckCyGVIdRrMfIXBjNcALgP4g;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Maybe;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Maybe;

    move-result-object p0

    .line 63
    invoke-virtual {p0}, Lio/reactivex/Maybe;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final _init_$lambda-4(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static final close$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public static synthetic lambda$5_zddjwIbfoYiz7d2kJaTS2uTyg(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->open$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$Es6ckCyGVIdRrMfIXBjNcALgP4g(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$KNv7-z0ID9KcJb71fYrlwsfDVf0(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->open$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$cDz3kYYSr19sSBVO1mpjeOoi3CI(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$eHL0jCD8RtnjdOVXvlXMGLBb8i0(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->_init_$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fZevK2mvpGZuGkWcfEDGgkSpDKE(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->sendMessage$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$lmbO4oDR0WlH44actS9KGHmPZ2o(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$nKyGMfKLJUDfh8CQyXSTP1xHnYo(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->open$lambda-8$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$s2fv0skdvwLsRMCVT6Hd8ZB7uH0(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->open$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$sd76yF2EOloyDoLBh1CHLBvyTys(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->close$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    return-void
.end method

.method public static synthetic lambda$v8IgTTMD5IteRTkmg8Wz5suDzK4(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->_init_$lambda-4(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final lambda-3$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 8

    const-string v0, "$sendingMessage"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    .line 57
    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    move-result-object p0

    return-object p0
.end method

.method private static final lambda-3$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getProtocolMessage()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;->getMessageType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;->RESPONSE:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolMessageType;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->output:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lio/reactivex/CompletableEmitter;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->disposable:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->messageOutput()Lio/reactivex/Observable;

    move-result-object v1

    .line 75
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$nKyGMfKLJUDfh8CQyXSTP1xHnYo;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$nKyGMfKLJUDfh8CQyXSTP1xHnYo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 81
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$KNv7-z0ID9KcJb71fYrlwsfDVf0;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$KNv7-z0ID9KcJb71fYrlwsfDVf0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    .line 82
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$s2fv0skdvwLsRMCVT6Hd8ZB7uH0;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$s2fv0skdvwLsRMCVT6Hd8ZB7uH0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    .line 80
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p0

    .line 74
    invoke-virtual {v0, p0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 84
    invoke-interface {p1}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final open$lambda-8$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getProtocolType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v0

    .line 78
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    move-result-object p0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;->getTechnologyType()Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    move-result-object p0

    .line 76
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;

    const-string v2, "1"

    invoke-direct {v1, v2, p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;-><init>(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ProtocolMessage;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    return-object v1
.end method

.method private static final open$lambda-8$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->output:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-8$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->output:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final sendMessage$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;Lio/reactivex/CompletableEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->sendingSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 104
    invoke-interface {p2}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 2

    .line 94
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$sd76yF2EOloyDoLBh1CHLBvyTys;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$sd76yF2EOloyDoLBh1CHLBvyTys;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->close()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;
    .locals 1

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->connectionInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    return-object v0
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->output:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public open()Lio/reactivex/Single;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;",
            ">;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->connectToChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Completable;

    move-result-object v0

    .line 73
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$5_zddjwIbfoYiz7d2kJaTS2uTyg;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$5_zddjwIbfoYiz7d2kJaTS2uTyg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    invoke-static {v1}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    .line 86
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v0

    const-string v1, "protocol.connectToChannel(communicationChannel)\n            .andThen(Completable.create {\n                disposable.add(protocol.messageOutput()\n                        .map {\n                            CommunicationMessage(uid = \"1\", protocolMessage = it,\n                                    protocolType = connectionInfo.protocolType,\n                                    technologyType = connectionInfo.technologyType)\n                        }\n                        .subscribe(\n                                { message -> output.onNext(message) },\n                                { error -> output.onError(error) }\n                        ))\n                it.onComplete()\n            })\n            .toSingleDefault(InitInfo())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public refresh()V
    .locals 1

    .line 90
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->refresh()V

    return-void
.end method

.method public resubscribeCharacteristics()Lio/reactivex/Completable;
    .locals 1

    .line 39
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->protocol:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->resubscribe()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/-$$Lambda$ConnectionImpl$fZevK2mvpGZuGkWcfEDGgkSpDKE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "create {\n                sendingSubject.onNext(message)\n                it.onComplete()\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public setConnectionInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->connectionInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;

    return-void
.end method
