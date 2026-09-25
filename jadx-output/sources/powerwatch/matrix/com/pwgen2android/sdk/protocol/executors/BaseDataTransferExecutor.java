package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\tH\u0016J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0012H\u0016J.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\tH\u0016J4\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140 0\u00112\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "PROGRESS_TRACKER", "", "progressSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "getProtocolType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "setProtocolType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V", "observeProgress", "Lio/reactivex/Observable;", "", "send", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "dataInfo", "power", "sendAndWait", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "transferData", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "transferDataWithProgress", "Lkotlin/Pair;", "phasePower", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BaseDataTransferExecutor implements powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor {
    private final java.lang.String PROGRESS_TRACKER;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Float> progressSubject;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: send$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2324send$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return dataInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2332sendAndWait$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo response, byte[] noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return response;
    }

    public BaseDataTransferExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
        this.protocolType = powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP;
        this.PROGRESS_TRACKER = "progress_track";
        io.reactivex.subjects.BehaviorSubject<java.lang.Float> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create()");
        this.progressSubject = behaviorSubjectCreate;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.getKoin(this);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType getProtocolType() {
        return this.protocolType;
    }

    public final void setProtocolType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "<set-?>");
        this.protocolType = protocolType;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<java.lang.Integer> observeProgress() {
        io.reactivex.Observable map = this.progressSubject.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$Wk2iq3rx-4h5YlOtDSk2A3ant0Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2322observeProgress$lambda0((java.lang.Float) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "progressSubject\n//                .doOnNext { debug(\"Running progress: $it\") }\n                .map { if (it > 100f) 100 else it.toInt() }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeProgress$lambda-0, reason: not valid java name */
    public static final java.lang.Integer m2322observeProgress$lambda0(java.lang.Float it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Integer.valueOf(it.floatValue() > 100.0f ? 100 : (int) it.floatValue());
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> transferDataWithProgress(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float phasePower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> sendAndWait(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power, int timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$3_KWJ0d7RAsNZlNaAZJZ2ozVbK8
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2326sendAndWait$lambda2(this.f$0, uid, command);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(command.getSendingData()),\n                    messageType = command.getCommandType(),\n                    type = protocolType),\n                    TechnologyType.BLE_COMMUNICATION, protocolType))\n                    .toSingleDefault(command.getSendingData())\n                    .toObservable()\n                    .doOnNext { debug(\"Sending command: ${it.formatToString()}\") }\n\n        }");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableDoOnNext = io.reactivex.Observable.zip(this.communicator.messageOutput().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$j5ipFsAIGpmu1wnHKUuONB_UucY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2328sendAndWait$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$H05pWrVwuRIHhvCGnDYwbd-hnN0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2329sendAndWait$lambda4(command, dataInfo, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).timeout(timeout, java.util.concurrent.TimeUnit.SECONDS).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$HbEBv61xvkZ_rTcMAd0j3bpUQKc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2330sendAndWait$lambda5(this.f$0, command, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$X1UmWtOvxAHsXHelpi1mg0hN_SM
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2331sendAndWait$lambda6((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).firstOrError().toObservable(), observableDefer, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$L9rGkdJ4yYcmQG2fmMcxyyMgGdI
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2332sendAndWait$lambda7((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj, (byte[]) obj2);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$dEXN8HkEXINvPWgY5kp9pI6OQ7c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2333sendAndWait$lambda8(command, power, this, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "zip(responseObservable, requestObservable,\n                BiFunction<DataInfo, ByteArray, DataInfo> { response, _ -> response })\n                .doOnNext {\n                    if (it.parsingFinished) {\n//                        debug(\"Received: ${command.javaClass.simpleName}\")\n                        val progress = command.extractProgress(it) * 100\n                        val res = progress * power\n//                        debug(\"Adding: $res\")\n                        progressSubject.onNext((progressSubject.value ?: 0f).plus(res))\n//                        debug(\"Summed: ${progressSubject.value}\")\n\n                    }\n                }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2326sendAndWait$lambda2(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        return this$0.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(uid, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(command.getSendingData()), this$0.getProtocolType(), command.getCommandType()), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, this$0.getProtocolType())).toSingleDefault(command.getSendingData()).toObservable().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$0kgWSLpUJbknFRK-yxCALkcZYp8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2327sendAndWait$lambda2$lambda1(this.f$0, (byte[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-2$lambda-1, reason: not valid java name */
    public static final void m2327sendAndWait$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Sending command: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-3, reason: not valid java name */
    public static final void m2328sendAndWait$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Received data: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(communicationMessage.getProtocolMessage().getPayload().getData(), false, 1, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2329sendAndWait$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return command.parseReceivedData(data.getProtocolMessage().getPayload().getData(), dataInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-5, reason: not valid java name */
    public static final void m2330sendAndWait$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Received: " + ((java.lang.Object) command.getClass().getSimpleName()) + " , finished: " + it.getParsingFinished(), null, 2, null);
        if (!it.getParsingStarted() || it.getParsingFinished()) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        float fExtractProgress = command.extractProgress(it) * 100;
        io.reactivex.subjects.BehaviorSubject<java.lang.Float> behaviorSubject = this$0.progressSubject;
        java.lang.Float value = behaviorSubject.getValue();
        if (value == null) {
            value = java.lang.Float.valueOf(0.0f);
        }
        behaviorSubject.onNext(java.lang.Float.valueOf(value.floatValue() + (fExtractProgress * f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-6, reason: not valid java name */
    public static final boolean m2331sendAndWait$lambda6(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return data.getParsingFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-8, reason: not valid java name */
    public static final void m2333sendAndWait$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (it.getParsingFinished()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            float fExtractProgress = command.extractProgress(it) * 100 * f;
            io.reactivex.subjects.BehaviorSubject<java.lang.Float> behaviorSubject = this$0.progressSubject;
            java.lang.Float value = behaviorSubject.getValue();
            if (value == null) {
                value = java.lang.Float.valueOf(0.0f);
            }
            behaviorSubject.onNext(java.lang.Float.valueOf(value.floatValue() + fExtractProgress));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> send(java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> map = this.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(uid, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(command.getSendingData()), this.protocolType, null, 4, null), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, this.protocolType)).toSingleDefault(command.getSendingData()).toObservable().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$yqFLPeRAfXCkI-oqD7ClA69dyaQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2325send$lambda9(this.f$0, power, (byte[]) obj);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$jvAkTr-6idcp5UMWcOzmD-osP20
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2323send$lambda10(this.f$0, command);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$BaseDataTransferExecutor$3lbnBvkzRaZaDof808-dZeXTWhg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor.m2324send$lambda11(dataInfo, (byte[]) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "communicator.sendMessage(CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(command.getSendingData()), type = protocolType),\n                TechnologyType.BLE_COMMUNICATION, protocolType))\n                .toSingleDefault(command.getSendingData())\n                .toObservable()\n                .doOnNext {\n                    progressSubject.onNext((progressSubject.value\n                            ?: 0f).plus((100 * power).toInt()))\n                    debug(\"Sending command: ${it.formatToString()}\")\n                }\n                .doOnComplete {\n                    debug(\"Command complete: ${command.javaClass.simpleName}\")\n                }\n                .map { dataInfo }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: send$lambda-9, reason: not valid java name */
    public static final void m2325send$lambda9(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, float f, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.reactivex.subjects.BehaviorSubject<java.lang.Float> behaviorSubject = this$0.progressSubject;
        java.lang.Float value = behaviorSubject.getValue();
        if (value == null) {
            value = java.lang.Float.valueOf(0.0f);
        }
        behaviorSubject.onNext(java.lang.Float.valueOf(value.floatValue() + ((int) (100 * f))));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Sending command: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: send$lambda-10, reason: not valid java name */
    public static final void m2323send$lambda10(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Command complete: ", command.getClass().getSimpleName()), null, 2, null);
    }
}
