.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;
.super Landroid/bluetooth/BluetoothGattServerCallback;
.source "PWBleServer.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J@\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;",
        "Landroid/bluetooth/BluetoothGattServerCallback;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "bluetoothGattServer",
        "Landroid/bluetooth/BluetoothGattServer;",
        "getBluetoothGattServer",
        "()Landroid/bluetooth/BluetoothGattServer;",
        "setBluetoothGattServer",
        "(Landroid/bluetooth/BluetoothGattServer;)V",
        "registeredDevice",
        "Landroid/bluetooth/BluetoothDevice;",
        "getRegisteredDevice",
        "()Landroid/bluetooth/BluetoothDevice;",
        "setRegisteredDevice",
        "(Landroid/bluetooth/BluetoothDevice;)V",
        "onCharacteristicReadRequest",
        "",
        "device",
        "requestId",
        "",
        "offset",
        "characteristic",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "onDescriptorReadRequest",
        "descriptor",
        "Landroid/bluetooth/BluetoothGattDescriptor;",
        "onDescriptorWriteRequest",
        "preparedWrite",
        "",
        "responseNeeded",
        "value",
        "",
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
.field private bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

.field private registeredDevice:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 105
    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattServerCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBluetoothGattServer()Landroid/bluetooth/BluetoothGattServer;
    .locals 1

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 105
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public final getRegisteredDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->registeredDevice:Landroid/bluetooth/BluetoothDevice;

    return-object v0
.end method

.method public onCharacteristicReadRequest(Landroid/bluetooth/BluetoothDevice;IILandroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 12

    move-object v0, p0

    const-string v1, "device"

    move-object v3, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "characteristic"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 114
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getCURRENT_TIME()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v1, :cond_1

    .line 115
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 119
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v11, v4, v5, v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getExactTime(JB)[B

    move-result-object v11

    .line 120
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v11, v8, v7, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "Sending data on time service for time read request: "

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v9, v6, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 121
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v3, p1

    move v4, p2

    move v5, v1

    move v6, v10

    move-object v7, v11

    .line 115
    invoke-virtual/range {v2 .. v7}, Landroid/bluetooth/BluetoothGattServer;->sendResponse(Landroid/bluetooth/BluetoothDevice;III[B)Z

    goto :goto_0

    .line 122
    :cond_1
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getLOCAL_TIME_INFO()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual/range {p4 .. p4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 126
    sget-object v11, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v11, v4, v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getLocalTimeInfo(J)[B

    move-result-object v11

    .line 127
    move-object v4, v0

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v11, v8, v7, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "Sending data on time service for time info read request: "

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v9, v6, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 128
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v3, p1

    move v4, p2

    move v5, v1

    move v6, v10

    move-object v7, v11

    .line 122
    invoke-virtual/range {v2 .. v7}, Landroid/bluetooth/BluetoothGattServer;->sendResponse(Landroid/bluetooth/BluetoothDevice;III[B)Z

    :cond_3
    :goto_0
    return-void
.end method

.method public onDescriptorReadRequest(Landroid/bluetooth/BluetoothDevice;IILandroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 7

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getCLIENT_CONFIG()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p4}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 137
    sget-object v6, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    .line 138
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Descriptor read request arrived on Config, return value: "

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 139
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    move v3, p2

    invoke-virtual/range {v1 .. v6}, Landroid/bluetooth/BluetoothGattServer;->sendResponse(Landroid/bluetooth/BluetoothDevice;III[B)Z

    goto :goto_0

    .line 145
    :cond_1
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v4, 0x101

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    move v3, p2

    invoke-virtual/range {v1 .. v6}, Landroid/bluetooth/BluetoothGattServer;->sendResponse(Landroid/bluetooth/BluetoothDevice;III[B)Z

    :goto_0
    return-void
.end method

.method public onDescriptorWriteRequest(Landroid/bluetooth/BluetoothDevice;ILandroid/bluetooth/BluetoothGattDescriptor;ZZI[B)V
    .locals 6

    const-string v3, "device"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "descriptor"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "value"

    invoke-static {p7, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;

    invoke-virtual {v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/TimeProfile;->getCLIENT_CONFIG()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {p3}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 160
    sget-object v3, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-static {v3, p7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 161
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->registeredDevice:Landroid/bluetooth/BluetoothDevice;

    goto :goto_0

    .line 162
    :cond_0
    sget-object v3, Landroid/bluetooth/BluetoothGattDescriptor;->DISABLE_NOTIFICATION_VALUE:[B

    invoke-static {v3, p7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 163
    iput-object v4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->registeredDevice:Landroid/bluetooth/BluetoothDevice;

    .line 165
    :cond_1
    :goto_0
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Descriptor write request arrived on Config, sending to "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->registeredDevice:Landroid/bluetooth/BluetoothDevice;

    if-nez v5, :cond_2

    const-string v5, "null"

    :cond_2
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", response needed: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    if-eqz p5, :cond_6

    .line 168
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/bluetooth/BluetoothGattServer;->sendResponse(Landroid/bluetooth/BluetoothDevice;III[B)Z

    goto :goto_1

    :cond_4
    if-eqz p5, :cond_6

    .line 175
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    const/16 v3, 0x101

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/bluetooth/BluetoothGattServer;->sendResponse(Landroid/bluetooth/BluetoothDevice;III[B)Z

    :cond_6
    :goto_1
    return-void
.end method

.method public final setBluetoothGattServer(Landroid/bluetooth/BluetoothGattServer;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->bluetoothGattServer:Landroid/bluetooth/BluetoothGattServer;

    return-void
.end method

.method public final setRegisteredDevice(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/CurrentTimeCallback;->registeredDevice:Landroid/bluetooth/BluetoothDevice;

    return-void
.end method
