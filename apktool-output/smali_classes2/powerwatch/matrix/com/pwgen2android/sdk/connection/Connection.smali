.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;
.super Ljava/lang/Object;
.source "Connection.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0008\u001a\u00020\tH&J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH&J\u000e\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0008\u0010\u0010\u001a\u00020\u0011H&J\u0008\u0010\u0012\u001a\u00020\tH&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000cH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0004\u0010\u0005\"\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0015"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/connection/Connection;",
        "",
        "connectionInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
        "getConnectionInfo",
        "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;",
        "setConnectionInfo",
        "(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)V",
        "close",
        "Lio/reactivex/Completable;",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "open",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;",
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


# virtual methods
.method public abstract close()Lio/reactivex/Completable;
.end method

.method public abstract getConnectionInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;
.end method

.method public abstract messageOutput()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation
.end method

.method public abstract open()Lio/reactivex/Single;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract refresh()V
.end method

.method public abstract resubscribeCharacteristics()Lio/reactivex/Completable;
.end method

.method public abstract sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;
.end method

.method public abstract setConnectionInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/ConnectionInfo;)V
.end method
