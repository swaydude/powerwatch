.class Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "RxBleGattCallback.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;


# direct methods
.method constructor <init>(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method

.method private isDisconnectedOrDisconnecting(I)Z
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    const-string v0, "onCharacteristicChanged"

    const/4 v1, 0x1

    .line 134
    invoke-static {v0, p1, p2, v1}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    .line 135
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeChangedCallback(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 136
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 143
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/jakewharton/rxrelay2/Relay;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jakewharton/rxrelay2/Relay;->hasObservers()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 144
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/jakewharton/rxrelay2/Relay;

    move-result-object p1

    new-instance v0, Lcom/polidea/rxandroidble2/internal/util/CharacteristicChangedEvent;

    .line 146
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    .line 147
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getInstanceId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 148
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {v0, v1, v2, p2}, Lcom/polidea/rxandroidble2/internal/util/CharacteristicChangedEvent;-><init>(Ljava/util/UUID;Ljava/lang/Integer;[B)V

    .line 144
    invoke-virtual {p1, v0}, Lcom/jakewharton/rxrelay2/Relay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 7

    const-string v0, "onCharacteristicRead"

    const/4 v1, 0x1

    .line 108
    invoke-static {v0, p1, p3, p2, v1}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattCharacteristic;Z)V

    .line 109
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeReadCallback(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 110
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 112
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$700(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 113
    invoke-static {v1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$700(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v2

    sget-object v6, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->CHARACTERISTIC_READ:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    .line 112
    invoke-static/range {v1 .. v6}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$800(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 115
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$700(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    new-instance p3, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 7

    const-string v0, "onCharacteristicWrite"

    const/4 v1, 0x0

    .line 121
    invoke-static {v0, p1, p3, p2, v1}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattCharacteristic;Z)V

    .line 122
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeWriteCallback(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 123
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 125
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$900(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 126
    invoke-static {v1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$900(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v2

    sget-object v6, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->CHARACTERISTIC_WRITE:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    .line 125
    invoke-static/range {v1 .. v6}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$800(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 128
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$900(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    new-instance p3, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const-string v0, "onConnectionStateChange"

    .line 74
    invoke-static {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    .line 75
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeConnectionStateCallback(Landroid/bluetooth/BluetoothGatt;II)V

    .line 76
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    .line 77
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$100(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/BluetoothGattProvider;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/polidea/rxandroidble2/internal/connection/BluetoothGattProvider;->updateBluetoothGatt(Landroid/bluetooth/BluetoothGatt;)V

    .line 79
    invoke-direct {p0, p3}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->isDisconnectedOrDisconnecting(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$200(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/DisconnectionRouter;

    move-result-object v0

    new-instance v1, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lcom/polidea/rxandroidble2/internal/connection/DisconnectionRouter;->onDisconnectedException(Lcom/polidea/rxandroidble2/exceptions/BleDisconnectedException;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 82
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$200(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/DisconnectionRouter;

    move-result-object v0

    new-instance v1, Lcom/polidea/rxandroidble2/exceptions/BleGattException;

    sget-object v2, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->CONNECTION_STATE:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    invoke-direct {v1, p1, p2, v2}, Lcom/polidea/rxandroidble2/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)V

    invoke-virtual {v0, v1}, Lcom/polidea/rxandroidble2/internal/connection/DisconnectionRouter;->onGattConnectionStateException(Lcom/polidea/rxandroidble2/exceptions/BleGattException;)V

    .line 87
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$400(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/jakewharton/rxrelay2/PublishRelay;

    move-result-object p1

    iget-object p2, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$300(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;I)Lcom/polidea/rxandroidble2/RxBleConnection$RxBleConnectionState;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public onConnectionUpdated(Landroid/bluetooth/BluetoothGatt;IIII)V
    .locals 7

    const-string v0, "onConnectionUpdated"

    move-object v1, p1

    move v2, p5

    move v3, p2

    move v4, p3

    move v5, p4

    .line 213
    invoke-static/range {v0 .. v5}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logConnectionUpdateCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;IIII)V

    .line 214
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v1

    move-object v2, p1

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeParamsUpdateCallback(Landroid/bluetooth/BluetoothGatt;IIII)V

    .line 215
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 216
    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v1

    sget-object v2, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->CONNECTION_PRIORITY_CHANGE:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    invoke-static {v0, v1, p1, p5, v2}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 217
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    new-instance p5, Lcom/polidea/rxandroidble2/internal/connection/ConnectionParametersImpl;

    invoke-direct {p5, p2, p3, p4}, Lcom/polidea/rxandroidble2/internal/connection/ConnectionParametersImpl;-><init>(III)V

    invoke-virtual {p1, p5}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 7

    const-string v0, "onDescriptorRead"

    const/4 v1, 0x1

    .line 156
    invoke-static {v0, p1, p3, p2, v1}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattDescriptor;Z)V

    .line 157
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeDescriptorReadCallback(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 158
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 160
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1100(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 161
    invoke-static {v1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1100(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v2

    sget-object v6, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->DESCRIPTOR_READ:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v1 .. v6}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1200(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 162
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1100(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    new-instance p3, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-direct {p3, p2, v0}, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 7

    const-string v0, "onDescriptorWrite"

    const/4 v1, 0x0

    .line 168
    invoke-static {v0, p1, p3, p2, v1}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;ILandroid/bluetooth/BluetoothGattDescriptor;Z)V

    .line 169
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeDescriptorWriteCallback(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 170
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 172
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1300(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 173
    invoke-static {v1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1300(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v2

    sget-object v6, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->DESCRIPTOR_WRITE:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    invoke-static/range {v1 .. v6}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1200(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 174
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1300(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    new-instance p3, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getValue()[B

    move-result-object v0

    invoke-direct {p3, p2, v0}, Lcom/polidea/rxandroidble2/internal/util/ByteAssociation;-><init>(Ljava/lang/Object;[B)V

    invoke-virtual {p1, p3}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const-string v0, "onMtuChanged"

    .line 199
    invoke-static {v0, p1, p3, p2}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    .line 200
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeMtuChangedCallback(Landroid/bluetooth/BluetoothGatt;II)V

    .line 201
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onMtuChanged(Landroid/bluetooth/BluetoothGatt;II)V

    .line 203
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1500(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 204
    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1500(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v1

    sget-object v2, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->ON_MTU_CHANGED:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    invoke-static {v0, v1, p1, p3, v2}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 205
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1500(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 3

    const-string v0, "onMtuChanged"

    .line 187
    invoke-static {v0, p1, p3, p2}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;II)V

    .line 188
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeReadRssiCallback(Landroid/bluetooth/BluetoothGatt;II)V

    .line 189
    invoke-super {p0, p1, p2, p3}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    .line 191
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1400(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 192
    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1400(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v1

    sget-object v2, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->READ_RSSI:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    invoke-static {v0, v1, p1, p3, v2}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 193
    iget-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p1}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$1400(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p1

    iget-object p1, p1, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 1

    const-string v0, "onReliableWriteCompleted"

    .line 180
    invoke-static {v0, p1, p2}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;I)V

    .line 181
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeReliableWriteCallback(Landroid/bluetooth/BluetoothGatt;I)V

    .line 182
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 3

    const-string v0, "onServicesDiscovered"

    .line 96
    invoke-static {v0, p1, p2}, Lcom/polidea/rxandroidble2/internal/logger/LoggerUtil;->logCallback(Ljava/lang/String;Landroid/bluetooth/BluetoothGatt;I)V

    .line 97
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/polidea/rxandroidble2/internal/connection/NativeCallbackDispatcher;->notifyNativeServicesDiscoveredCallback(Landroid/bluetooth/BluetoothGatt;I)V

    .line 98
    invoke-super {p0, p1, p2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 100
    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$500(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->hasObservers()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 101
    invoke-static {v0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$500(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object v1

    sget-object v2, Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;->SERVICE_DISCOVERY:Lcom/polidea/rxandroidble2/exceptions/BleGattOperationType;

    invoke-static {v0, v1, p1, p2, v2}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$600(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;Landroid/bluetooth/BluetoothGatt;ILcom/polidea/rxandroidble2/exceptions/BleGattOperationType;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 102
    iget-object p2, p0, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$2;->this$0:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    invoke-static {p2}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->access$500(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;

    move-result-object p2

    iget-object p2, p2, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback$Output;->valueRelay:Lcom/jakewharton/rxrelay2/PublishRelay;

    new-instance v0, Lcom/polidea/rxandroidble2/RxBleDeviceServices;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/polidea/rxandroidble2/RxBleDeviceServices;-><init>(Ljava/util/List;)V

    invoke-virtual {p2, v0}, Lcom/jakewharton/rxrelay2/PublishRelay;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
