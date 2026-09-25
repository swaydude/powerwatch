.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;
.super Ljava/lang/Object;
.source "SimpleBLECommunicationChannel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0096\u0001J\u0008\u0010\t\u001a\u00020\u0005H\u0016J\u0011\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\r2\u0006\u0010\n\u001a\u00020\u000eH\u0096\u0001J\u000f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0096\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u0096\u0001J\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00080\r2\u0006\u0010\u0017\u001a\u00020\u0008H\u0096\u0001J\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\r2\u0006\u0010\u0017\u001a\u00020\u0008H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "communicationChannel",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V",
        "close",
        "Lio/reactivex/Completable;",
        "eventData",
        "Lio/reactivex/Observable;",
        "",
        "open",
        "characteristic",
        "Ljava/util/UUID;",
        "read",
        "Lio/reactivex/Single;",
        "",
        "receivedData",
        "refresh",
        "",
        "requestMTU",
        "",
        "mtu",
        "resubscribeCharacteristics",
        "send",
        "data",
        "sendEvent",
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
.field private final communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V
    .locals 1

    const-string v0, "communicationChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    return-void
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->close()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public eventData()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->eventData()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public open()Lio/reactivex/Completable;
    .locals 2

    const/16 v0, 0x60

    .line 10
    invoke-virtual {p0, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->requestMTU(I)Lio/reactivex/Single;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Single;->ignoreElement()Lio/reactivex/Completable;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->open()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "requestMTU(96).ignoreElement()\n                .andThen(communicationChannel.open())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public open(Ljava/util/UUID;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->open(Ljava/util/UUID;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public read(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->read(Ljava/lang/String;)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public receivedData()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->receivedData()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public refresh()V
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->refresh()V

    return-void
.end method

.method public requestMTU(I)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/Single<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->requestMTU(I)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public resubscribeCharacteristics()Lio/reactivex/Completable;
    .locals 1

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->resubscribeCharacteristics()Lio/reactivex/Completable;

    move-result-object v0

    return-object v0
.end method

.method public send([B)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->send([B)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method

.method public sendEvent([B)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;->communicationChannel:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;->sendEvent([B)Lio/reactivex/Single;

    move-result-object p1

    return-object p1
.end method
