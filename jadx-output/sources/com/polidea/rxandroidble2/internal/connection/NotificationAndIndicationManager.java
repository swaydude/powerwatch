package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class NotificationAndIndicationManager {
    static final java.util.UUID CLIENT_CHARACTERISTIC_CONFIG_UUID = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private final java.util.Map<com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId, com.polidea.rxandroidble2.internal.util.ActiveCharacteristicNotification> activeNotificationObservableMap = new java.util.HashMap();
    private final android.bluetooth.BluetoothGatt bluetoothGatt;
    private final byte[] configDisable;
    private final byte[] configEnableIndication;
    private final byte[] configEnableNotification;
    private final com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback gattCallback;

    @bleshadow.javax.inject.Inject
    NotificationAndIndicationManager(@bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.BluetoothConstants.ENABLE_NOTIFICATION_VALUE) byte[] bArr, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.BluetoothConstants.ENABLE_INDICATION_VALUE) byte[] bArr2, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.BluetoothConstants.DISABLE_NOTIFICATION_VALUE) byte[] bArr3, android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter) {
        this.configEnableNotification = bArr;
        this.configEnableIndication = bArr2;
        this.configDisable = bArr3;
        this.bluetoothGatt = bluetoothGatt;
        this.gattCallback = rxBleGattCallback;
        this.descriptorWriter = descriptorWriter;
    }

    io.reactivex.Observable<io.reactivex.Observable<byte[]>> setupServerInitiatedCharacteristicRead(final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, final com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode, final boolean z) {
        return io.reactivex.Observable.defer(new java.util.concurrent.Callable<io.reactivex.ObservableSource<io.reactivex.Observable<byte[]>>>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public io.reactivex.ObservableSource<io.reactivex.Observable<byte[]>> call() {
                synchronized (com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.activeNotificationObservableMap) {
                    final com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId characteristicNotificationId = new com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId(bluetoothGattCharacteristic.getUuid(), java.lang.Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()));
                    com.polidea.rxandroidble2.internal.util.ActiveCharacteristicNotification activeCharacteristicNotification = (com.polidea.rxandroidble2.internal.util.ActiveCharacteristicNotification) com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.activeNotificationObservableMap.get(characteristicNotificationId);
                    boolean z2 = true;
                    if (activeCharacteristicNotification != null) {
                        if (activeCharacteristicNotification.isIndication == z) {
                            return activeCharacteristicNotification.notificationObservable;
                        }
                        java.util.UUID uuid = bluetoothGattCharacteristic.getUuid();
                        if (z) {
                            z2 = false;
                        }
                        return io.reactivex.Observable.error(new com.polidea.rxandroidble2.exceptions.BleConflictingNotificationAlreadySetException(uuid, z2));
                    }
                    byte[] bArr = z ? com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.configEnableIndication : com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.configEnableNotification;
                    final io.reactivex.subjects.PublishSubject publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
                    io.reactivex.Observable observableRefCount = com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.setCharacteristicNotification(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.bluetoothGatt, bluetoothGattCharacteristic, true).andThen(com.polidea.rxandroidble2.internal.util.ObservableUtil.justOnNext(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.observeOnCharacteristicChangeCallbacks(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.gattCallback, characteristicNotificationId))).compose(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.setupModeTransformer(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.descriptorWriter, bluetoothGattCharacteristic, bArr, notificationSetupMode)).map(new io.reactivex.functions.Function<io.reactivex.Observable<byte[]>, io.reactivex.Observable<byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.1.2
                        @Override // io.reactivex.functions.Function
                        public io.reactivex.Observable<byte[]> apply(io.reactivex.Observable<byte[]> observable) {
                            return io.reactivex.Observable.amb(java.util.Arrays.asList(publishSubjectCreate.cast(byte[].class), observable.takeUntil(publishSubjectCreate)));
                        }
                    }).doFinally(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.1.1
                        @Override // io.reactivex.functions.Action
                        public void run() {
                            publishSubjectCreate.onComplete();
                            synchronized (com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.activeNotificationObservableMap) {
                                com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.activeNotificationObservableMap.remove(characteristicNotificationId);
                            }
                            com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.setCharacteristicNotification(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.bluetoothGatt, bluetoothGattCharacteristic, false).compose(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.teardownModeTransformer(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.descriptorWriter, bluetoothGattCharacteristic, com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.configDisable, notificationSetupMode)).subscribe(io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer());
                        }
                    }).mergeWith(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.gattCallback.observeDisconnect()).replay(1).refCount();
                    com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.this.activeNotificationObservableMap.put(characteristicNotificationId, new com.polidea.rxandroidble2.internal.util.ActiveCharacteristicNotification(observableRefCount, z));
                    return observableRefCount;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.Completable setCharacteristicNotification(final android.bluetooth.BluetoothGatt bluetoothGatt, final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z) {
        return io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.2
            @Override // io.reactivex.functions.Action
            public void run() {
                if (!bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z)) {
                    throw new com.polidea.rxandroidble2.exceptions.BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 1, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.ObservableTransformer<io.reactivex.Observable<byte[]>, io.reactivex.Observable<byte[]>> setupModeTransformer(final com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter, final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode) {
        return new io.reactivex.ObservableTransformer<io.reactivex.Observable<byte[]>, io.reactivex.Observable<byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.3
            @Override // io.reactivex.ObservableTransformer
            /* JADX INFO: renamed from: apply */
            public io.reactivex.ObservableSource<io.reactivex.Observable<byte[]>> apply2(io.reactivex.Observable<io.reactivex.Observable<byte[]>> observable) {
                int i = com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.AnonymousClass8.$SwitchMap$com$polidea$rxandroidble2$NotificationSetupMode[notificationSetupMode.ordinal()];
                if (i == 1) {
                    return observable;
                }
                if (i != 2) {
                    return com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.writeClientCharacteristicConfig(bluetoothGattCharacteristic, descriptorWriter, bArr).andThen(observable);
                }
                final io.reactivex.Completable completableIgnoreElements = com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.writeClientCharacteristicConfig(bluetoothGattCharacteristic, descriptorWriter, bArr).toObservable().publish().autoConnect(2).ignoreElements();
                return observable.mergeWith(completableIgnoreElements).map(new io.reactivex.functions.Function<io.reactivex.Observable<byte[]>, io.reactivex.Observable<byte[]>>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.3.1
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.Observable<byte[]> apply(io.reactivex.Observable<byte[]> observable2) {
                        return observable2.mergeWith(completableIgnoreElements.onErrorComplete());
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$polidea$rxandroidble2$NotificationSetupMode;

        static {
            int[] iArr = new int[com.polidea.rxandroidble2.NotificationSetupMode.values().length];
            $SwitchMap$com$polidea$rxandroidble2$NotificationSetupMode = iArr;
            try {
                iArr[com.polidea.rxandroidble2.NotificationSetupMode.COMPAT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$polidea$rxandroidble2$NotificationSetupMode[com.polidea.rxandroidble2.NotificationSetupMode.QUICK_SETUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$polidea$rxandroidble2$NotificationSetupMode[com.polidea.rxandroidble2.NotificationSetupMode.DEFAULT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.CompletableTransformer teardownModeTransformer(final com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter, final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final com.polidea.rxandroidble2.NotificationSetupMode notificationSetupMode) {
        return new io.reactivex.CompletableTransformer() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.4
            @Override // io.reactivex.CompletableTransformer
            public io.reactivex.Completable apply(io.reactivex.Completable completable) {
                return notificationSetupMode == com.polidea.rxandroidble2.NotificationSetupMode.COMPAT ? completable : completable.andThen(com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.writeClientCharacteristicConfig(bluetoothGattCharacteristic, descriptorWriter, bArr));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.Observable<byte[]> observeOnCharacteristicChangeCallbacks(com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, final com.polidea.rxandroidble2.internal.util.CharacteristicNotificationId characteristicNotificationId) {
        return rxBleGattCallback.getOnCharacteristicChanged().filter(new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.6
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent characteristicChangedEvent) {
                return characteristicChangedEvent.equals(characteristicNotificationId);
            }
        }).map(new io.reactivex.functions.Function<com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent, byte[]>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.5
            @Override // io.reactivex.functions.Function
            public byte[] apply(com.polidea.rxandroidble2.internal.util.CharacteristicChangedEvent characteristicChangedEvent) {
                return characteristicChangedEvent.data;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.reactivex.Completable writeClientCharacteristicConfig(final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.internal.connection.DescriptorWriter descriptorWriter, byte[] bArr) {
        android.bluetooth.BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG_UUID);
        if (descriptor == null) {
            return io.reactivex.Completable.error(new com.polidea.rxandroidble2.exceptions.BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 2, null));
        }
        return descriptorWriter.writeDescriptor(descriptor, bArr).onErrorResumeNext(new io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.CompletableSource>() { // from class: com.polidea.rxandroidble2.internal.connection.NotificationAndIndicationManager.7
            @Override // io.reactivex.functions.Function
            public io.reactivex.CompletableSource apply(java.lang.Throwable th) {
                return io.reactivex.Completable.error(new com.polidea.rxandroidble2.exceptions.BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 3, th));
            }
        });
    }
}
