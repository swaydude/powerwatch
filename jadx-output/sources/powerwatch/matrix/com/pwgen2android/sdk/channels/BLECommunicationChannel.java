package powerwatch.matrix.com.pwgen2android.sdk.channels;

/* JADX INFO: compiled from: BLECommunicationChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0017J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\"\u001a\u00020\fH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u0006\u0010\"\u001a\u00020\fH\u0016R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00100\u00100\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "rxBleConnection", "Lcom/polidea/rxandroidble2/RxBleConnection;", "writeCharacteristic", "", "readCharacteristic", "writeEventCharacteristic", "(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "dataOutput", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "eventDataOutput", "refreshSubject", "", "subscription", "Lio/reactivex/disposables/CompositeDisposable;", "close", "Lio/reactivex/Completable;", "eventData", "Lio/reactivex/Observable;", "open", "read", "Lio/reactivex/Single;", "characteristic", "receivedData", "refresh", "requestMTU", "", "mtu", "resubscribeCharacteristics", "send", "data", "sendEvent", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BLECommunicationChannel implements powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.subjects.PublishSubject<byte[]> dataOutput;
    private final io.reactivex.subjects.PublishSubject<byte[]> eventDataOutput;
    private final java.lang.String readCharacteristic;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> refreshSubject;
    private final com.polidea.rxandroidble2.RxBleConnection rxBleConnection;
    private io.reactivex.disposables.CompositeDisposable subscription;
    private final java.lang.String writeCharacteristic;
    private final java.lang.String writeEventCharacteristic;

    public BLECommunicationChannel(com.polidea.rxandroidble2.RxBleConnection rxBleConnection, java.lang.String writeCharacteristic, java.lang.String readCharacteristic, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBleConnection, "rxBleConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeCharacteristic, "writeCharacteristic");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readCharacteristic, "readCharacteristic");
        this.rxBleConnection = rxBleConnection;
        this.writeCharacteristic = writeCharacteristic;
        this.readCharacteristic = readCharacteristic;
        this.writeEventCharacteristic = str;
        io.reactivex.subjects.PublishSubject<kotlin.Unit> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Unit>()");
        this.refreshSubject = publishSubjectCreate;
        this.subscription = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.PublishSubject<byte[]> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<ByteArray>()");
        this.dataOutput = publishSubjectCreate2;
        io.reactivex.subjects.PublishSubject<byte[]> publishSubjectCreate3 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate3, "create<ByteArray>()");
        this.eventDataOutput = publishSubjectCreate3;
    }

    public /* synthetic */ BLECommunicationChannel(com.polidea.rxandroidble2.RxBleConnection rxBleConnection, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rxBleConnection, (i & 2) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_RX : str, (i & 4) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_TX : str2, (i & 8) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.BLEServicesKt.BASIC_DTP_SERVICE_PWX_RX : str3);
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
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.fromAction(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$r7RlIVEVgLLMyizpP32xq4wxNgg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2210resubscribeCharacteristics$lambda0(this.f$0);
            }
        }).andThen(open());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "fromAction {\n                    subscription.clear()\n                }\n                .andThen(this.open())");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: resubscribeCharacteristics$lambda-0, reason: not valid java name */
    public static final void m2210resubscribeCharacteristics$lambda0(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.subscription.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> read(java.lang.String characteristic) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        io.reactivex.Single<byte[]> characteristic2 = this.rxBleConnection.readCharacteristic(java.util.UUID.fromString(characteristic));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(characteristic2, "rxBleConnection.readCharacteristic(UUID.fromString(characteristic))");
        return characteristic2;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<java.lang.Integer> requestMTU(int mtu) {
        io.reactivex.Single<java.lang.Integer> singleRequestMtu = this.rxBleConnection.requestMtu(mtu);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleRequestMtu, "rxBleConnection.requestMtu(mtu)");
        return singleRequestMtu;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable close() {
        io.reactivex.Completable completableAndThen = io.reactivex.Completable.complete().andThen(new io.reactivex.CompletableSource() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$x4e4Qgte-Yn5_G2ZkqD-gMj3HDE
            @Override // io.reactivex.CompletableSource
            public final void subscribe(io.reactivex.CompletableObserver completableObserver) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2191close$lambda1(this.f$0, completableObserver);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableAndThen, "complete()\n                .andThen {\n                    subscription.dispose()\n                }");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: close$lambda-1, reason: not valid java name */
    public static final void m2191close$lambda1(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, io.reactivex.CompletableObserver it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.subscription.dispose();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> send(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Single<byte[]> singleWriteCharacteristic = this.rxBleConnection.writeCharacteristic(java.util.UUID.fromString(this.writeCharacteristic), data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleWriteCharacteristic, "rxBleConnection\n                .writeCharacteristic(UUID.fromString(writeCharacteristic), data)");
        return singleWriteCharacteristic;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Single<byte[]> sendEvent(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Single<byte[]> singleWriteCharacteristic = this.rxBleConnection.writeCharacteristic(java.util.UUID.fromString(this.writeEventCharacteristic), data);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleWriteCharacteristic, "rxBleConnection\n                .writeCharacteristic(UUID.fromString(writeEventCharacteristic), data)");
        return singleWriteCharacteristic;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> receivedData() {
        return this.dataOutput;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Observable<byte[]> eventData() {
        return this.eventDataOutput;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public io.reactivex.Completable open() {
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$toTtcYar7Z7wSpEwoAEi44TZ-Ao
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2197open$lambda14(this.f$0, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create { emitter ->\n//            debug(\"Started open on channel\")\n            subscription.add(rxBleConnection\n                    .setupNotification(UUID.fromString(this.readCharacteristic))\n                    .doOnNext { debug(\"Characteristic set!\") }\n                    .flatMap { observable ->\n                        observable\n                    }\n                    .subscribe({\n                        dataOutput.onNext(it)\n                    }, {\n                        dataOutput.onError(it)\n                    }))\n\n            val writeChar = writeEventCharacteristic\n            if (writeChar != null) {\n                subscription.add(rxBleConnection\n                        .setupNotification(UUID.fromString(this.writeEventCharacteristic))\n//                        .doOnNext { debug(\"Characteristic set!\") }\n                        .flatMap { observable ->\n                            observable\n                        }\n                        .subscribe({\n                            eventDataOutput.onNext(it)\n                        }, {\n                            eventDataOutput.onError(it)\n                        }))\n            }\n\n            this.subscription.add(refreshSubject\n                    .doOnNext { debug(\"Request for connection priority received, will debounce request...\") }\n                    .throttleFirst(30000, TimeUnit.MILLISECONDS)\n                    .doOnNext {\n                        debug(\"Requested connection priority will be executed now...\")\n                    }\n                    .flatMapCompletable {\n                        rxBleConnection.requestConnectionPriority(CONNECTION_PRIORITY_HIGH, 1000, TimeUnit.MILLISECONDS)\n                    }.subscribe({\n                        Log.d(javaClass.simpleName, \"Connection updated successfully.\")\n                    }, {\n                        Log.e(javaClass.simpleName, \"Connection updating failed.\")\n                    }))\n\n            emitter.onComplete()\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14, reason: not valid java name */
    public static final void m2197open$lambda14(final powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, io.reactivex.CompletableEmitter emitter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emitter, "emitter");
        this$0.subscription.add(this$0.rxBleConnection.setupNotification(java.util.UUID.fromString(this$0.readCharacteristic)).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$ZPF_ZqxeG0yA7nMI02308kFU2xs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2202open$lambda14$lambda2(this.f$0, (io.reactivex.Observable) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$KVImMvsKtwpvbBJGdDp1wT-fQrk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2203open$lambda14$lambda3((io.reactivex.Observable) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$3UC7J_93KR4EBUCjXnVUTYnuZx8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2204open$lambda14$lambda4(this.f$0, (byte[]) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$lthWS7WxtzXm-OUI4exHcrZgKxk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2205open$lambda14$lambda5(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        java.lang.String str = this$0.writeEventCharacteristic;
        if (str != null) {
            this$0.subscription.add(this$0.rxBleConnection.setupNotification(java.util.UUID.fromString(str)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$7TMpNKNHoJLn7ypPD8I3eGHn4sA
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2206open$lambda14$lambda6((io.reactivex.Observable) obj);
                }
            }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$pbMQ6eiabEb9nbPY1wIvYc4mLAU
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2207open$lambda14$lambda7(this.f$0, (byte[]) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$mDn7AyVDHdWbDPDU8J3Vr8X0vyE
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2208open$lambda14$lambda8(this.f$0, (java.lang.Throwable) obj);
                }
            }));
        }
        this$0.subscription.add(this$0.refreshSubject.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$7hRzCVMA6NruLZU2yH5QbxtcQxc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2209open$lambda14$lambda9(this.f$0, (kotlin.Unit) obj);
            }
        }).throttleFirst(30000L, java.util.concurrent.TimeUnit.MILLISECONDS).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$ZQNQYZwxWx-w_M5MUzS4l0J6hMA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2198open$lambda14$lambda10(this.f$0, (kotlin.Unit) obj);
            }
        }).flatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$B5xRGUnCHV13UW9BtAoS74vsge0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2199open$lambda14$lambda11(this.f$0, (kotlin.Unit) obj);
            }
        }).subscribe(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$DafTcf_kjaF_2TWwP5_8eCEVVvg
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2200open$lambda14$lambda12(this.f$0);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.channels.-$$Lambda$BLECommunicationChannel$MYVK6A22e7I2MJvxOmzkYoZnYRU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel.m2201open$lambda14$lambda13(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        emitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-2, reason: not valid java name */
    public static final void m2202open$lambda14$lambda2(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, io.reactivex.Observable observable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Characteristic set!", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2203open$lambda14$lambda3(io.reactivex.Observable observable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observable, "observable");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-4, reason: not valid java name */
    public static final void m2204open$lambda14$lambda4(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataOutput.onNext(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-5, reason: not valid java name */
    public static final void m2205open$lambda14$lambda5(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataOutput.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2206open$lambda14$lambda6(io.reactivex.Observable observable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observable, "observable");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-7, reason: not valid java name */
    public static final void m2207open$lambda14$lambda7(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.eventDataOutput.onNext(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-8, reason: not valid java name */
    public static final void m2208open$lambda14$lambda8(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.eventDataOutput.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-9, reason: not valid java name */
    public static final void m2209open$lambda14$lambda9(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Request for connection priority received, will debounce request...", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-10, reason: not valid java name */
    public static final void m2198open$lambda14$lambda10(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Requested connection priority will be executed now...", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-11, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2199open$lambda14$lambda11(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, kotlin.Unit it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.rxBleConnection.requestConnectionPriority(1, 1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-12, reason: not valid java name */
    public static final void m2200open$lambda14$lambda12(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.getClass().getSimpleName(), "Connection updated successfully.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: open$lambda-14$lambda-13, reason: not valid java name */
    public static final void m2201open$lambda14$lambda13(powerwatch.matrix.com.pwgen2android.sdk.channels.BLECommunicationChannel this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.e(this$0.getClass().getSimpleName(), "Connection updating failed.");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.channels.CommunicationChannel
    public void refresh() {
        this.refreshSubject.onNext(kotlin.Unit.INSTANCE);
    }
}
