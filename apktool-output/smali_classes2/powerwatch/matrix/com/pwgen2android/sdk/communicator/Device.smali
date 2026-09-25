.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;
.super Ljava/lang/Object;
.source "Device.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0008\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u000e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0013"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;",
        "",
        "deviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "messageOutput",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "refresh",
        "",
        "resubscribeCharacteristics",
        "Lio/reactivex/Completable;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "sendMessage",
        "message",
        "updateInfo",
        "updateWithAccessory",
        "accessory",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
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
.method public abstract deviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
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

.method public abstract refresh()V
.end method

.method public abstract resubscribeCharacteristics(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Completable;
.end method

.method public abstract sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;
.end method

.method public abstract updateInfo()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract updateWithAccessory(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
.end method
