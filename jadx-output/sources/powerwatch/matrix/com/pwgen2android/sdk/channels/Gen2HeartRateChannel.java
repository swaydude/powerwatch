package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: Gen2HeartRateChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u000f\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001d\u001a\u00020\bH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001d\u001a\u00020\bH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "rxBleConnection", "Lcom/polidea/rxandroidble2/RxBleConnection;", "(Lcom/polidea/rxandroidble2/RxBleConnection;)V", "dataOutput", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "subscription", "Lio/reactivex/disposables/CompositeDisposable;", "close", "Lio/reactivex/Completable;", "open", "characteristic", "Ljava/util/UUID;", "read", "Lio/reactivex/Single;", "", "receivedData", "Lio/reactivex/Observable;", "refresh", "", "requestMTU", "", "mtu", "resubscribeCharacteristics", "send", "data", "sendEvent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2HeartRateChannel implements powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.subjects.PublishSubject<byte[]> dataOutput;
    private final com.polidea.rxandroidble2.RxBleConnection rxBleConnection;
    private final io.reactivex.disposables.CompositeDisposable subscription;

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public void refresh() {
    }

    public Gen2HeartRateChannel(com.polidea.rxandroidble2.RxBleConnection rxBleConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        this.rxBleConnection = rxBleConnection;
        this.subscription = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.PublishSubject<byte[]> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<ByteArray>()");
        this.dataOutput = publishSubjectCreate;
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
    public io.reactivex.Completable resubscribeCharacteristics() {
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2HeartRateChannel$axBuiDgwyWlmn9ilTh1QnquZx04
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel.m2235resubscribeCharacteristics$lambda0(this.f$0);
            }
        }).andThen(open());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "fromAction {\n                    subscription.clear()\n                }\n                .andThen(this.open())");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: resubscribeCharacteristics$lambda-0, reason: not valid java name */
    public static final void m2235resubscribeCharacteristics$lambda0(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.subscription.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open(final java.util.UUID characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel.m2231open$lambda4(this.f$0, characteristic, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create { emitter ->\n\n//            debug(\"Running open on channel\")\n            subscription.add(rxBleConnection\n                    .setupNotification(characteristic)\n//                    .doOnNext { debug(\"Characteristic set!\") }\n                    .flatMap { observable ->\n                        observable\n                    }\n                    .subscribe({\n                        dataOutput.onNext(it)\n                    }, {\n                        dataOutput.onError(it)\n                    }))\n\n\n            emitter.onComplete()\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4, reason: not valid java name */
    public static final void m2231open$lambda4(final powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel this$0, java.util.UUID characteristic, io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "$characteristic");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.subscription.add(this$0.rxBleConnection.setupNotification(characteristic).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel.m2232open$lambda4$lambda1((io.reactivex.Observable) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2HeartRateChannel$XsmmWN1vUStZUHvZhnq9h3Hr0tE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel.m2233open$lambda4$lambda2(this.f$0, (byte[]) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2HeartRateChannel$-Q9cJcnQz1oWmTuwllK0Ii1abaM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel.m2234open$lambda4$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2232open$lambda4$lambda1(io.reactivex.Observable observable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observable, "observable");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4$lambda-2, reason: not valid java name */
    public static final void m2233open$lambda4$lambda2(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel this$0, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataOutput.onNext(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-4$lambda-3, reason: not valid java name */
    public static final void m2234open$lambda4$lambda3(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataOutput.onError(th);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open() {
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("not implemented"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"not implemented\"))");
        return completableError;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable close() {
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.complete().andThen(new io.reactivex.CompletableSource() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$Gen2HeartRateChannel$jxCf_22PThNg8MBWJMnzfW6Be7Y
            @Override // io.reactivex.CompletableSource
            public final void subscribe(io.reactivex.CompletableObserver completableObserver) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel.m2228close$lambda5(this.f$0, completableObserver);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "complete()\n                .andThen {\n                    subscription.dispose()\n                }");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: close$lambda-5, reason: not valid java name */
    public static final void m2228close$lambda5(powerwatch.matrix.com.pwgen2android.sdk.channels.Gen2HeartRateChannel this$0, io.reactivex.CompletableObserver it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.subscription.dispose();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> receivedData() {
        return this.dataOutput;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> send(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> sendEvent(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> read(java.lang.String characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<java.lang.Integer> requestMTU(int mtu) {
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }
}
