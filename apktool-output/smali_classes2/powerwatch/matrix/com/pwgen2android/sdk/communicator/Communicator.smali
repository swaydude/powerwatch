.class public interface abstract Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
.super Ljava/lang/Object;
.source "Communicator.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H&J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H&J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H&J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0008\u0010\u0012\u001a\u00020\u000fH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\rH&J\u0016\u0010\u0019\u001a\u00020\u000f2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0003H&J\u001a\u0010\u001b\u001a\u00020\u000f2\u0010\u0008\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0003H&J\u0008\u0010\u001e\u001a\u00020\u000fH&J\u0008\u0010\u001f\u001a\u00020\u000fH&J\u0008\u0010 \u001a\u00020\u000fH&J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0011H&\u00a8\u0006#"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "",
        "connectedDevices",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "connectedDevicesChange",
        "Lio/reactivex/Observable;",
        "defaultConnectedDevice",
        "disconnectedDevicesChange",
        "foundDevices",
        "foundDevicesChange",
        "lostDevicesChange",
        "messageOutput",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "refreshConnection",
        "",
        "uid",
        "",
        "releaseScanningResources",
        "resubscribeCharacteristics",
        "Lio/reactivex/Completable;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "sendMessage",
        "message",
        "startConnection",
        "devicesToConnect",
        "startScanning",
        "scanFilters",
        "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
        "stopConnection",
        "stopScanning",
        "unpairConnectedDevices",
        "unpairDevice",
        "bluetoothAddress",
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
.method public abstract connectedDevices()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract connectedDevicesChange()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
.end method

.method public abstract disconnectedDevicesChange()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract foundDevices()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract foundDevicesChange()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract lostDevicesChange()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
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

.method public abstract refreshConnection(Ljava/lang/String;)V
.end method

.method public abstract releaseScanningResources()V
.end method

.method public abstract resubscribeCharacteristics(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Completable;
.end method

.method public abstract sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;
.end method

.method public abstract startConnection(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract startScanning(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract stopConnection()V
.end method

.method public abstract stopScanning()V
.end method

.method public abstract unpairConnectedDevices()V
.end method

.method public abstract unpairDevice(Ljava/lang/String;)V
.end method
