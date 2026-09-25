package com.polidea.rxandroidble2.internal.operations;

/* JADX INFO: loaded from: classes2.dex */
public class CharacteristicLongWriteOperation extends com.polidea.rxandroidble2.internal.QueueOperation<byte[]> {
    private final com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider batchSizeProvider;
    private final android.bluetooth.BluetoothGatt bluetoothGatt;
    private final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic;
    private final io.reactivex.Scheduler bluetoothInteractionScheduler;
    private final byte[] bytesToWrite;
    private final com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback;
    private byte[] tempBatchArray;
    private final com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration;
    private final com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy;
    private final com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy;

    interface IntSupplier {
        int get();
    }

    CharacteristicLongWriteOperation(android.bluetooth.BluetoothGatt bluetoothGatt, com.polidea.rxandroidble2.internal.connection.RxBleGattCallback rxBleGattCallback, @bleshadow.javax.inject.Named(com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.BLUETOOTH_INTERACTION) io.reactivex.Scheduler scheduler, @bleshadow.javax.inject.Named("operation-timeout") com.polidea.rxandroidble2.internal.operations.TimeoutConfiguration timeoutConfiguration, android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic, com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider payloadSizeLimitProvider, com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy, com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy, byte[] bArr) {
        this.bluetoothGatt = bluetoothGatt;
        this.rxBleGattCallback = rxBleGattCallback;
        this.bluetoothInteractionScheduler = scheduler;
        this.timeoutConfiguration = timeoutConfiguration;
        this.bluetoothGattCharacteristic = bluetoothGattCharacteristic;
        this.batchSizeProvider = payloadSizeLimitProvider;
        this.writeOperationAckStrategy = writeOperationAckStrategy;
        this.writeOperationRetryStrategy = writeOperationRetryStrategy;
        this.bytesToWrite = bArr;
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected void protectedRun(io.reactivex.ObservableEmitter<byte[]> observableEmitter, com.polidea.rxandroidble2.internal.serialization.QueueReleaseInterface queueReleaseInterface) {
        final int payloadSizeLimit = this.batchSizeProvider.getPayloadSizeLimit();
        if (payloadSizeLimit <= 0) {
            throw new java.lang.IllegalArgumentException("batchSizeProvider value must be greater than zero (now: " + payloadSizeLimit + ")");
        }
        io.reactivex.Observable observableError = io.reactivex.Observable.error(new com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException(this.bluetoothGatt, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CHARACTERISTIC_LONG_WRITE));
        final java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(this.bytesToWrite);
        final com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper queueReleasingEmitterWrapper = new com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper(observableEmitter, queueReleaseInterface);
        com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.IntSupplier intSupplier = new com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.IntSupplier() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.1
            @Override // com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.IntSupplier
            public int get() {
                return ((int) java.lang.Math.ceil(byteBufferWrap.position() / payloadSizeLimit)) - 1;
            }
        };
        writeBatchAndObserve(payloadSizeLimit, byteBufferWrap, intSupplier).subscribeOn(this.bluetoothInteractionScheduler).filter(writeResponseForMatchingCharacteristic(this.bluetoothGattCharacteristic)).take(1L).timeout(this.timeoutConfiguration.timeout, this.timeoutConfiguration.timeoutTimeUnit, this.timeoutConfiguration.timeoutScheduler, observableError).repeatWhen(bufferIsNotEmptyAndOperationHasBeenAcknowledgedAndNotUnsubscribed(this.writeOperationAckStrategy, byteBufferWrap, queueReleasingEmitterWrapper)).retryWhen(errorIsRetryableAndAccordingTo(this.writeOperationRetryStrategy, byteBufferWrap, payloadSizeLimit, intSupplier)).subscribe(new io.reactivex.Observer<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.2
            @Override // io.reactivex.Observer
            public void onNext(com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID> byteAssociation) {
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable th) {
                queueReleasingEmitterWrapper.onError(th);
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                queueReleasingEmitterWrapper.onNext(com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.this.bytesToWrite);
                queueReleasingEmitterWrapper.onComplete();
            }
        });
    }

    @Override // com.polidea.rxandroidble2.internal.QueueOperation
    protected com.polidea.rxandroidble2.exceptions.BleException provideException(android.os.DeadObjectException deadObjectException) {
        return new com.polidea.rxandroidble2.exceptions.BleDisconnectedException(deadObjectException, this.bluetoothGatt.getDevice().getAddress(), -1);
    }

    private io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> writeBatchAndObserve(final int i, final java.nio.ByteBuffer byteBuffer, final com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.IntSupplier intSupplier) {
        final io.reactivex.Observable<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> onCharacteristicWrite = this.rxBleGattCallback.getOnCharacteristicWrite();
        return io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.3
            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(io.reactivex.ObservableEmitter<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> observableEmitter) {
                observableEmitter.setDisposable((io.reactivex.observers.DisposableObserver) onCharacteristicWrite.subscribeWith(com.polidea.rxandroidble2.internal.util.DisposableUtil.disposableObserverFromEmitter(observableEmitter)));
                try {
                    com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.this.writeData(com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.this.getNextBatch(byteBuffer, i), intSupplier);
                } catch (java.lang.Throwable th) {
                    observableEmitter.onError(th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getNextBatch(java.nio.ByteBuffer byteBuffer, int i) {
        int iMin = java.lang.Math.min(byteBuffer.remaining(), i);
        byte[] bArr = this.tempBatchArray;
        if (bArr == null || bArr.length != iMin) {
            this.tempBatchArray = new byte[iMin];
        }
        byteBuffer.get(this.tempBatchArray);
        return this.tempBatchArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeData(byte[] bArr, com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.IntSupplier intSupplier) {
        if (com.polidea.rxandroidble2.internal.RxBleLog.isAtLeast(3)) {
            com.polidea.rxandroidble2.internal.RxBleLog.d("Writing batch #%04d: %s", java.lang.Integer.valueOf(intSupplier.get()), com.polidea.rxandroidble2.internal.logger.LoggerUtil.bytesToHex(bArr));
        }
        this.bluetoothGattCharacteristic.setValue(bArr);
        if (!this.bluetoothGatt.writeCharacteristic(this.bluetoothGattCharacteristic)) {
            throw new com.polidea.rxandroidble2.exceptions.BleGattCannotStartException(this.bluetoothGatt, com.polidea.rxandroidble2.exceptions.BleGattOperationType.CHARACTERISTIC_LONG_WRITE);
        }
    }

    private static io.reactivex.functions.Predicate<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>> writeResponseForMatchingCharacteristic(final android.bluetooth.BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new io.reactivex.functions.Predicate<com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID>>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.4
            @Override // io.reactivex.functions.Predicate
            public boolean test(com.polidea.rxandroidble2.internal.util.ByteAssociation<java.util.UUID> byteAssociation) {
                return byteAssociation.first.equals(bluetoothGattCharacteristic.getUuid());
            }
        };
    }

    static io.reactivex.functions.Function<io.reactivex.Observable<?>, io.reactivex.ObservableSource<?>> bufferIsNotEmptyAndOperationHasBeenAcknowledgedAndNotUnsubscribed(final com.polidea.rxandroidble2.RxBleConnection.WriteOperationAckStrategy writeOperationAckStrategy, final java.nio.ByteBuffer byteBuffer, final com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper<byte[]> queueReleasingEmitterWrapper) {
        return new io.reactivex.functions.Function<io.reactivex.Observable<?>, io.reactivex.ObservableSource<?>>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.5
            @Override // io.reactivex.functions.Function
            public io.reactivex.ObservableSource<?> apply(io.reactivex.Observable<?> observable) {
                return observable.takeWhile(notUnsubscribed(queueReleasingEmitterWrapper)).map(bufferIsNotEmpty(byteBuffer)).compose(writeOperationAckStrategy).takeWhile(new io.reactivex.functions.Predicate<java.lang.Boolean>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.5.1
                    @Override // io.reactivex.functions.Predicate
                    public boolean test(java.lang.Boolean bool) {
                        return bool.booleanValue();
                    }
                });
            }

            private io.reactivex.functions.Function<java.lang.Object, java.lang.Boolean> bufferIsNotEmpty(final java.nio.ByteBuffer byteBuffer2) {
                return new io.reactivex.functions.Function<java.lang.Object, java.lang.Boolean>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.5.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // io.reactivex.functions.Function
                    public java.lang.Boolean apply(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(byteBuffer2.hasRemaining());
                    }
                };
            }

            private io.reactivex.functions.Predicate<java.lang.Object> notUnsubscribed(final com.polidea.rxandroidble2.internal.util.QueueReleasingEmitterWrapper<byte[]> queueReleasingEmitterWrapper2) {
                return new io.reactivex.functions.Predicate<java.lang.Object>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.5.3
                    @Override // io.reactivex.functions.Predicate
                    public boolean test(java.lang.Object obj) {
                        return !queueReleasingEmitterWrapper2.isWrappedEmitterUnsubscribed();
                    }
                };
            }
        };
    }

    private static io.reactivex.functions.Function<io.reactivex.Observable<java.lang.Throwable>, io.reactivex.ObservableSource<?>> errorIsRetryableAndAccordingTo(final com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy writeOperationRetryStrategy, final java.nio.ByteBuffer byteBuffer, final int i, final com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.IntSupplier intSupplier) {
        return new io.reactivex.functions.Function<io.reactivex.Observable<java.lang.Throwable>, io.reactivex.ObservableSource<?>>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.6
            @Override // io.reactivex.functions.Function
            public io.reactivex.ObservableSource<?> apply(io.reactivex.Observable<java.lang.Throwable> observable) {
                return observable.flatMap(toLongWriteFailureOrError()).doOnNext(repositionByteBufferForRetry()).compose(writeOperationRetryStrategy);
            }

            private io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure>> toLongWriteFailureOrError() {
                return new io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure>>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.6.1
                    @Override // io.reactivex.functions.Function
                    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure> apply(java.lang.Throwable th) {
                        if (!(th instanceof com.polidea.rxandroidble2.exceptions.BleGattCharacteristicException) && !(th instanceof com.polidea.rxandroidble2.exceptions.BleGattCannotStartException)) {
                            return io.reactivex.Observable.error(th);
                        }
                        return io.reactivex.Observable.just(new com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure(intSupplier.get(), (com.polidea.rxandroidble2.exceptions.BleGattException) th));
                    }
                };
            }

            private io.reactivex.functions.Consumer<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure> repositionByteBufferForRetry() {
                return new io.reactivex.functions.Consumer<com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure>() { // from class: com.polidea.rxandroidble2.internal.operations.CharacteristicLongWriteOperation.6.2
                    @Override // io.reactivex.functions.Consumer
                    public void accept(com.polidea.rxandroidble2.RxBleConnection.WriteOperationRetryStrategy.LongWriteFailure longWriteFailure) {
                        byteBuffer.position(longWriteFailure.getBatchIndex() * i);
                    }
                };
            }
        };
    }

    public java.lang.String toString() {
        return "CharacteristicLongWriteOperation{" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.commonMacMessage(this.bluetoothGatt) + ", characteristic=" + com.polidea.rxandroidble2.internal.logger.LoggerUtil.wrap(this.bluetoothGattCharacteristic, false) + ", maxBatchSize=" + this.batchSizeProvider.getPayloadSizeLimit() + '}';
    }
}
