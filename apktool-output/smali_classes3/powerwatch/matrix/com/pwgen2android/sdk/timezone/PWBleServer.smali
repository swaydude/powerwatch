.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;
.super Ljava/lang/Object;
.source "PWBleServer.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\u0008\u0005*\u0001\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0008\u0010\u0016\u001a\u00020\u0011H\u0002J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003J\u0008\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010\u0019\u001a\u00020\u0011R\u0010\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V",
        "advertiseCallback",
        "powerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;",
        "bluetoothGattServer",
        "Landroid/bluetooth/BluetoothGattServer;",
        "bluetoothManager",
        "Landroid/bluetooth/BluetoothManager;",
        "callback",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;",
        "notifyRegisteredDevices",
        "",
        "timestamp",
        "",
        "adjustReason",
        "",
        "startAdvertising",
        "startServer",
        "stopAdvertising",
        "stopServer",
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
.field private final advertiseCallback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;

.field private bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

.field private final bluetoothManager:Landroid/bluetooth/BluetoothManager;

.field private final callback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communicator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const-string p2, "bluetooth"

    .line 19
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.bluetooth.BluetoothManager"

    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothManager;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothManager:Landroid/bluetooth/BluetoothManager;

    .line 21
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->callback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;

    .line 84
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;

    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->advertiseCallback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;

    return-void
.end method

.method private final startAdvertising()V
    .locals 5

    .line 63
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothManager:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeAdvertiser()Landroid/bluetooth/le/BluetoothLeAdvertiser;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    new-instance v1, Landroid/bluetooth/le/AdvertiseSettings$Builder;

    invoke-direct {v1}, Landroid/bluetooth/le/AdvertiseSettings$Builder;-><init>()V

    const/4 v2, 0x1

    .line 67
    invoke-virtual {v1, v2}, Landroid/bluetooth/le/AdvertiseSettings$Builder;->setAdvertiseMode(I)Landroid/bluetooth/le/AdvertiseSettings$Builder;

    move-result-object v1

    .line 68
    invoke-virtual {v1, v2}, Landroid/bluetooth/le/AdvertiseSettings$Builder;->setConnectable(Z)Landroid/bluetooth/le/AdvertiseSettings$Builder;

    move-result-object v1

    const/4 v3, 0x0

    .line 69
    invoke-virtual {v1, v3}, Landroid/bluetooth/le/AdvertiseSettings$Builder;->setTimeout(I)Landroid/bluetooth/le/AdvertiseSettings$Builder;

    move-result-object v1

    const/4 v4, 0x2

    .line 70
    invoke-virtual {v1, v4}, Landroid/bluetooth/le/AdvertiseSettings$Builder;->setTxPowerLevel(I)Landroid/bluetooth/le/AdvertiseSettings$Builder;

    move-result-object v1

    .line 71
    invoke-virtual {v1}, Landroid/bluetooth/le/AdvertiseSettings$Builder;->build()Landroid/bluetooth/le/AdvertiseSettings;

    move-result-object v1

    .line 73
    new-instance v4, Landroid/bluetooth/le/AdvertiseData$Builder;

    invoke-direct {v4}, Landroid/bluetooth/le/AdvertiseData$Builder;-><init>()V

    .line 74
    invoke-virtual {v4, v2}, Landroid/bluetooth/le/AdvertiseData$Builder;->setIncludeDeviceName(Z)Landroid/bluetooth/le/AdvertiseData$Builder;

    move-result-object v2

    .line 75
    invoke-virtual {v2, v3}, Landroid/bluetooth/le/AdvertiseData$Builder;->setIncludeTxPowerLevel(Z)Landroid/bluetooth/le/AdvertiseData$Builder;

    move-result-object v2

    .line 76
    new-instance v3, Landroid/os/ParcelUuid;

    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getTIME_SERVICE()Ljava/util/UUID;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    invoke-virtual {v2, v3}, Landroid/bluetooth/le/AdvertiseData$Builder;->addServiceUuid(Landroid/os/ParcelUuid;)Landroid/bluetooth/le/AdvertiseData$Builder;

    move-result-object v2

    .line 77
    invoke-virtual {v2}, Landroid/bluetooth/le/AdvertiseData$Builder;->build()Landroid/bluetooth/le/AdvertiseData;

    move-result-object v2

    .line 79
    iget-object v3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->advertiseCallback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;

    check-cast v3, Landroid/bluetooth/le/AdvertiseCallback;

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/le/BluetoothLeAdvertiser;->startAdvertising(Landroid/bluetooth/le/AdvertiseSettings;Landroid/bluetooth/le/AdvertiseData;Landroid/bluetooth/le/AdvertiseCallback;)V

    :goto_0
    return-void
.end method

.method private final stopAdvertising()V
    .locals 2

    .line 99
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothManager:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeAdvertiser()Landroid/bluetooth/le/BluetoothLeAdvertiser;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 100
    :cond_0
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->advertiseCallback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer$advertiseCallback$1;

    check-cast v1, Landroid/bluetooth/le/AdvertiseCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/BluetoothLeAdvertiser;->stopAdvertising(Landroid/bluetooth/le/AdvertiseCallback;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 17
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final notifyRegisteredDevices(JB)V
    .locals 4

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevices()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 47
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->callback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->getRegisteredDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 48
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 49
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v1, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getExactTime(JB)[B

    move-result-object p1

    .line 50
    move-object p2, p0

    check-cast p2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 p3, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, p3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v3, "Sending on time service : "

    invoke-static {v3, p3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const/4 v3, 0x2

    invoke-static {p2, p3, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 52
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez p2, :cond_0

    goto :goto_0

    .line 53
    :cond_0
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getTIME_SERVICE()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/bluetooth/BluetoothGattServer;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 54
    :cond_1
    sget-object p3, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getCURRENT_TIME()Ljava/util/UUID;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {v2, p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 56
    :goto_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothManager:Landroid/bluetooth/BluetoothManager;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p2

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p2

    invoke-virtual {p1, p2, v2, v1}, Landroid/bluetooth/BluetoothGattServer;->notifyCharacteristicChanged(Landroid/bluetooth/BluetoothDevice;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    :cond_4
    :goto_2
    return-void
.end method

.method public final startServer(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothManager:Landroid/bluetooth/BluetoothManager;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->callback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;

    check-cast v1, Landroid/bluetooth/BluetoothGattServerCallback;

    invoke-virtual {v0, p1, v1}, Landroid/bluetooth/BluetoothManager;->openGattServer(Landroid/content/Context;Landroid/bluetooth/BluetoothGattServerCallback;)Landroid/bluetooth/BluetoothGattServer;

    move-result-object p1

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    .line 25
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->callback:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->setBluetoothGattServer(Landroid/bluetooth/BluetoothGattServer;)V

    .line 26
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->createTimeService()Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGattServer;->addService(Landroid/bluetooth/BluetoothGattService;)Z

    :goto_0
    return-void
.end method

.method public final stopServer()V
    .locals 1

    .line 35
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/PWBleServer;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattServer;->close()V

    :goto_0
    return-void
.end method
