package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: Gen2BLECommunicationChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0017J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "rxBleConnection", "Lcom/polidea/rxandroidble2/RxBleConnection;", "(Lcom/polidea/rxandroidble2/RxBleConnection;)V", "refreshSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "subscription", "Lio/reactivex/disposables/CompositeDisposable;", "close", "Lio/reactivex/Completable;", "open", "read", "Lio/reactivex/Single;", "", "characteristic", "", "receivedData", "Lio/reactivex/Observable;", "refresh", "requestMTU", "", "mtu", "resubscribeCharacteristics", "send", "data", "sendEvent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2BLECommunicationChannel implements powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> refreshSubject;
    private final com.polidea.rxandroidble2.RxBleConnection rxBleConnection;
    private io.reactivex.disposables.CompositeDisposable subscription;

    public Gen2BLECommunicationChannel(com.polidea.rxandroidble2.RxBleConnection rxBleConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        this.rxBleConnection = rxBleConnection;
        this.subscription = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.PublishSubject<kotlin.Unit> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Unit>()");
        this.refreshSubject = publishSubjectCreate;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> eventData() {
        return powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel.DefaultImpls.eventData(this);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open(java.util.UUID uuid) {
        return powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel.DefaultImpls.open(this, uuid);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable resubscribeCharacteristics() {
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2BLECommunicationChannel$DhT-GB9bKX8Q19Wo9RWNigPIlt4
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel.m2227resubscribeCharacteristics$lambda0(this.f$0);
            }
        }).andThen(open());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "fromAction {\n                    subscription.clear()\n                }\n                .andThen(this.open())");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: resubscribeCharacteristics$lambda-0, reason: not valid java name */
    public static final void m2227resubscribeCharacteristics$lambda0(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.subscription.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> sendEvent(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public void refresh() {
        this.refreshSubject.onNext(kotlin.Unit.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open() {
        io.reactivex.Completable completableFromAction = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2BLECommunicationChannel$zGN1RWdX_-sdng7GpP13ETZCGKY
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel.m2223open$lambda4(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableFromAction, "fromAction {\n            subscription.dispose()\n            subscription = CompositeDisposable()\n            this.subscription.add(\n                    refreshSubject\n                            .throttleFirst(30000, TimeUnit.MILLISECONDS)\n                            .flatMapCompletable {\n                                rxBleConnection.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_HIGH, 1000, TimeUnit.MILLISECONDS)\n                            }.subscribe({\n                                Log.d(javaClass.simpleName, \"Connection updated successfully.\")\n                            }, {\n                                Log.e(javaClass.simpleName, \"Connection updating failed.\")\n                            }))\n        }");
        return completableFromAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4, reason: not valid java name */
    public static final void m2223open$lambda4(final powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.subscription.dispose();
        io.reactivex.disposables.CompositeDisposable compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this$0.subscription = compositeDisposable;
        compositeDisposable.add(this$0.refreshSubject.throttleFirst(30000L, java.util.concurrent.TimeUnit.MILLISECONDS).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2BLECommunicationChannel$TF7Do_qnHDLMwxSmRNqBo_hKWLE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel.m2224open$lambda4$lambda1(this.f$0, (kotlin.Unit) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2BLECommunicationChannel$qoQG45XoxdoLqlTdFlX5nsV9C-I
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel.m2225open$lambda4$lambda2(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2BLECommunicationChannel$AHE7G03gMNtsufYQ0q-iuF270Hw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel.m2226open$lambda4$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4$lambda-1, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2224open$lambda4$lambda1(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel this$0, kotlin.Unit it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.rxBleConnection.requestConnectionPriority(1, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4$lambda-2, reason: not valid java name */
    public static final void m2225open$lambda4$lambda2(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.getClass().getSimpleName(), "Connection updated successfully.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4$lambda-3, reason: not valid java name */
    public static final void m2226open$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.e(this$0.getClass().getSimpleName(), "Connection updating failed.");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable close() {
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.complete().andThen(new io.reactivex.CompletableSource() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2BLECommunicationChannel$ZoNi1x9JqGHhlRCuYYbNsi33qu8
            @Override // io.reactivex.CompletableSource
            public final void subscribe(io.reactivex.CompletableObserver completableObserver) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel.m2218close$lambda5(this.f$0, completableObserver);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "complete()\n                .andThen {\n                    subscription.dispose()\n                }");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: close$lambda-5, reason: not valid java name */
    public static final void m2218close$lambda5(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2BLECommunicationChannel this$0, io.reactivex.CompletableObserver it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.subscription.dispose();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> send(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> read(java.lang.String characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        io.reactivex.Single<byte[]> characteristic2 = this.rxBleConnection.readCharacteristic(java.util.UUID.fromString(characteristic));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(characteristic2, "rxBleConnection.readCharacteristic(UUID.fromString(characteristic))");
        return characteristic2;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> receivedData() {
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<java.lang.Integer> requestMTU(int mtu) {
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }
}
