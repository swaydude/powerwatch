package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00172\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001aH\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0016J\u0016\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0004J\u0016\u0010'\u001a\u00020#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0%H\u0004J\u0016\u0010*\u001a\u00020#2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0%H\u0004J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J\u001e\u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J6\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00192\u0006\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\u001aH\u0004J.\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00105\u001a\u00020=2\u0006\u00107\u001a\u00020<2\u0006\u0010>\u001a\u00020?H\u0016J6\u0010@\u001a\b\u0012\u0004\u0012\u00020<0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00105\u001a\u00020=2\u0006\u00107\u001a\u00020<2\u0006\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020!H\u0016J.\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u00105\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00108\u001a\u00020/2\u0006\u00100\u001a\u00020\u0007H\u0002JL\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u00105\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020/2\u0006\u0010>\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020D2\b\b\u0002\u00100\u001a\u00020\u0007H\u0004J8\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u00105\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020/2\u0006\u0010A\u001a\u00020D2\u0006\u00100\u001a\u00020\u0007H\u0002J.\u0010F\u001a\b\u0012\u0004\u0012\u00020<0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010G\u001a\u00020H2\u0006\u00107\u001a\u00020<2\u0006\u0010>\u001a\u00020?H\u0016J4\u0010I\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010<0J0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010G\u001a\u00020H2\u0006\u0010K\u001a\u00020?H\u0016J0\u0010L\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u00072\b\b\u0002\u00108\u001a\u00020/H\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u0006N"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "TAG", "", "kotlin.jvm.PlatformType", "newControlAckMark", "", "syncProgressChannel", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;", "getSyncProgressChannel", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/SyncProgressChannel;", "syncProgressChannel$delegate", "Lkotlin/Lazy;", "traceLogger", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "getTraceLogger", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TraceLogger;", "traceLogger$delegate", "handleSyncError", "Lio/reactivex/functions/Function;", "", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "uid", "dataInfoWrapper", "isAckControlMark", "", "data", "observeProgress", "", "printActivityDeltaLogs", "", "deltaLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;", "printEndLogs", "tempEndLogs", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "printStartLogs", "tempStartLogs", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;", "readAckResponse", "filterProtocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "logTag", "readCommandResponse", "readResendControlPackage", "readWithAck", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2AckData;", "command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2Command;", "dataInfo", "protocolType", "reformatDataLogs", "dataInfoParam", "send", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "power", "", "sendAndWait", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "sendCommandRequest", "sendSingleCommandWithAck", "", "sendWithAck", "transferData", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "transferDataWithProgress", "Lkotlin/Pair;", "phasePower", "writeAck", "validCRC", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class Gen2ExecutorImpl implements powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Executor, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final java.lang.String TAG;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final byte[] newControlAckMark;

    /* JADX INFO: renamed from: syncProgressChannel$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy syncProgressChannel;

    /* JADX INFO: renamed from: traceLogger$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy traceLogger;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-35$lambda-34, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData m2413readWithAck$lambda35$lambda34(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData data, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-3, reason: not valid java name */
    public static final void m2419sendAndWait$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-6, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2422sendAndWait$lambda6(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo response, byte[] noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return response;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-7, reason: not valid java name */
    public static final void m2423sendAndWait$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-39, reason: not valid java name */
    public static final void m2431sendSingleCommandWithAck$lambda39(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData gen2AckData) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-42, reason: not valid java name */
    public static final void m2434sendSingleCommandWithAck$lambda42(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData gen2AckData) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendWithAck$lambda-19, reason: not valid java name */
    public static final java.lang.Boolean m2440sendWithAck$lambda19(java.lang.Boolean t1, byte[] noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t1, "t1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return t1;
    }

    public Gen2ExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.communicator = communicator;
        this.newControlAckMark = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorKt.mapToBytes("06000030");
        this.TAG = getClass().getSimpleName();
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl = this;
        final org.koin.core.qualifier.Qualifier qualifier = (org.koin.core.qualifier.Qualifier) null;
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) null;
        final org.koin.core.scope.Scope rootScope = gen2ExecutorImpl.getKoin().getRootScope();
        this.syncProgressChannel = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel invoke() {
                return rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel.class), qualifier, function0);
            }
        });
        final org.koin.core.scope.Scope rootScope2 = gen2ExecutorImpl.getKoin().getRootScope();
        this.traceLogger = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger>() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger] */
            @Override // kotlin.jvm.functions.Function0
            public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger invoke() {
                return rootScope2.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger.class), qualifier, function0);
            }
        });
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Executor.DefaultImpls.getKoin(this);
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel getSyncProgressChannel() {
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannel) this.syncProgressChannel.getValue();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> sendAndWait(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power, int timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$jorN0n5lOEzdPQ8QWFIZNTJowzY
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2416sendAndWait$lambda0(this.f$0, uid, command);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            return@defer communicator.sendMessage(CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(command.getSendingData()),\n                    messageType = command.getCommandType(),\n                    type = ProtocolType.GEN2_STANDARD_BASICS),\n                    TechnologyType.BLE_COMMUNICATION, ProtocolType.GEN2_STANDARD_BASICS))\n                    .toSingleDefault(command.getSendingData())\n                    .toObservable()\n//                    .doOnNext { debug(\"Sending ${command::class.simpleName}: ${it.formatToString()}\") }\n\n        }");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableDoOnNext = io.reactivex.Observable.zip(this.communicator.messageOutput().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$xGNmm6Pabjw-A-b-r-u77TxTHhs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2417sendAndWait$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$Zk-lY7qQUfrdKtOQ7H8gYMpbtxc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2418sendAndWait$lambda2(command, dataInfo, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).timeout(timeout, java.util.concurrent.TimeUnit.SECONDS).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$VGIPBsOu_62AqosxWhQahSGz2d8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2419sendAndWait$lambda3((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$h1fcRU63EhAD_wsULGtQphJdt_U
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2420sendAndWait$lambda4(this.f$0, (java.lang.Throwable) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$aL6kdUgCwptANH9BC7GAanL35OA
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2421sendAndWait$lambda5((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).firstOrError().toObservable(), observableDefer, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$2L8VKrVD1y8nhLWuWsl-sHQGEWo
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2422sendAndWait$lambda6((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj, (byte[]) obj2);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$-ds87dPOb1pd0s8qWLOMxL74oDs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2423sendAndWait$lambda7((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "zip(responseObservable, requestObservable,\n                BiFunction<DataInfo, ByteArray, DataInfo> { response, _ -> response })\n                .doOnNext {\n                    //                    if (it.parsingFinished) {\n//                        val progress = command.extractProgress(it) * 100\n//                        val res = progress * power\n//                        progressSubject.onNext((progressSubject.value ?: 0f).plus(res))\n//                    }\n                }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2416sendAndWait$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        return this$0.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(uid, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(command.getSendingData()), powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS, command.getCommandType()), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS)).toSingleDefault(command.getSendingData()).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-1, reason: not valid java name */
    public static final void m2417sendAndWait$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Received data: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(communicationMessage.getProtocolMessage().getPayload().getData(), false, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2418sendAndWait$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return command.parseReceivedData(data.getProtocolMessage().getPayload().getData(), dataInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-4, reason: not valid java name */
    public static final void m2420sendAndWait$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Error in Gen2Executor while waiting for data", th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAndWait$lambda-5, reason: not valid java name */
    public static final boolean m2421sendAndWait$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return data.getParsingFinished();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> send(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    private final io.reactivex.Observable<java.lang.Boolean> readAckResponse(final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType filterProtocolType, java.lang.String logTag) {
        io.reactivex.Observable<java.lang.Boolean> observableTimeout = this.communicator.messageOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$t6FpcpbMj-f1ofeiLOJt887DQpE
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2399readAckResponse$lambda8(filterProtocolType, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$AD2fKnYgxLHGYoiTbcGs41GKbUY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2400readAckResponse$lambda9((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$xw0sNZbOhm12XhHDJ5khLBCXBuo
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2396readAckResponse$lambda10((byte[]) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$yuC8w_MzTnb6De-gEh-8z8xzkf4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2397readAckResponse$lambda11(this.f$0, (byte[]) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$6IaUZENMY_yVcsRtDm7X8JpL0rE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2398readAckResponse$lambda12((byte[]) obj);
            }
        }).timeout(15L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableTimeout, "communicator\n                .messageOutput()\n                .filter { it.protocolType == filterProtocolType }\n                .map { it.protocolMessage.payload.data }\n                .filter { it.contentEquals(DTPAckType.AckGood.value) }\n                .doOnNext {\n                    Log.d(TAG, \"Step 2. - Received ACK <--: ${it.formatToString()}\")\n                    debug(\"READ ACK Gen2 -> ${it.formatToString(false)}\")\n                }\n                .map { it.contentEquals(DTPAckType.AckGood.value) }\n                .timeout(15, TimeUnit.SECONDS)");
        return observableTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAckResponse$lambda-8, reason: not valid java name */
    public static final boolean m2399readAckResponse$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType filterProtocolType, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterProtocolType, "$filterProtocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == filterProtocolType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAckResponse$lambda-9, reason: not valid java name */
    public static final byte[] m2400readAckResponse$lambda9(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolMessage().getPayload().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAckResponse$lambda-10, reason: not valid java name */
    public static final boolean m2396readAckResponse$lambda10(byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.util.Arrays.equals(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckGood.INSTANCE.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAckResponse$lambda-11, reason: not valid java name */
    public static final void m2397readAckResponse$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.String str = this$0.TAG;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        android.util.Log.d(str, kotlin.jvm.internal.Intrinsics.stringPlus("Step 2. - Received ACK <--: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null)));
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("READ ACK Gen2 -> ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString(it, false)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAckResponse$lambda-12, reason: not valid java name */
    public static final java.lang.Boolean m2398readAckResponse$lambda12(byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Boolean.valueOf(java.util.Arrays.equals(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckGood.INSTANCE.getValue()));
    }

    private final io.reactivex.Observable<byte[]> sendCommandRequest(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, java.lang.String logTag) {
        io.reactivex.Observable<byte[]> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$DrWIoGvTqm0_3nbTcbAcsqSrG90
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2424sendCommandRequest$lambda18(command, this, protocolType, uid);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            return@defer Observable.just(command).doOnNext {\n                debug(\"WRITE DTP -> ${it.printCommandId()}\")\n            }.map {\n                ProtocolMessage(ProtocolPayload(command.getSendingData()),\n                        messageType = command.getCommandType(),\n                        type = protocolType)\n            }.doOnNext {\n                debug(\"WRITE DTP PAYLOAD -> ${it.payload.data.formatToString()}\")\n            }.flatMap {\n                communicator.sendMessage(CommunicationMessage(uid, it,\n                        TechnologyType.BLE_COMMUNICATION, protocolType))\n                        .toSingleDefault(command.getSendingData())\n                        .toObservable()\n                        .doOnNext { Log.d(TAG, \"Step 1. - Sending ${command::class.simpleName} -->: ${it.formatToString()}\") }\n            }\n\n        }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommandRequest$lambda-18, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2424sendCommandRequest$lambda18(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, final java.lang.String uid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "$protocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        return io.reactivex.Observable.just(command).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$jutWr-O4qjnXJ6sMnhvDL8Fodno
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2425sendCommandRequest$lambda18$lambda13(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$QHmn3FEgQerd1FGfC0HGCsdXomA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2426sendCommandRequest$lambda18$lambda14(command, protocolType, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$rVEs7ap-uM4UKw71PkVpb7JYZdA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2427sendCommandRequest$lambda18$lambda15(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$llexBxLWbsqMhUA4qSqf0DnFwkE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2428sendCommandRequest$lambda18$lambda17(this.f$0, uid, protocolType, command, (powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommandRequest$lambda-18$lambda-13, reason: not valid java name */
    public static final void m2425sendCommandRequest$lambda18$lambda13(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("WRITE DTP -> ", command.printCommandId()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommandRequest$lambda-18$lambda-14, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage m2426sendCommandRequest$lambda18$lambda14(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "$protocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(command.getSendingData()), protocolType, command.getCommandType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommandRequest$lambda-18$lambda-15, reason: not valid java name */
    public static final void m2427sendCommandRequest$lambda18$lambda15(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage protocolMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("WRITE DTP PAYLOAD -> ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(protocolMessage.getPayload().getData(), false, 1, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommandRequest$lambda-18$lambda-17, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2428sendCommandRequest$lambda18$lambda17(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "$protocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(uid, it, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, protocolType)).toSingleDefault(command.getSendingData()).toObservable().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$QmjWvLKXFZFLIPHpJA9Jw5EoVjc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2429sendCommandRequest$lambda18$lambda17$lambda16(this.f$0, command, (byte[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendCommandRequest$lambda-18$lambda-17$lambda-16, reason: not valid java name */
    public static final void m2429sendCommandRequest$lambda18$lambda17$lambda16(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        java.lang.String str = this$0.TAG;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Step 1. - Sending ");
        sb.append((java.lang.Object) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(command.getClass()).getSimpleName());
        sb.append(" -->: ");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        sb.append(powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null));
        android.util.Log.d(str, sb.toString());
    }

    static /* synthetic */ io.reactivex.Observable sendWithAck$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, long j, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendWithAck");
        }
        if ((i & 4) != 0) {
            protocolType = powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP;
        }
        return gen2ExecutorImpl.sendWithAck(command, str, protocolType, j, str2);
    }

    private final io.reactivex.Observable<java.lang.Boolean> sendWithAck(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, long timeout, java.lang.String logTag) {
        io.reactivex.Observable observableZip = io.reactivex.Observable.zip(readAckResponse(protocolType, logTag), sendCommandRequest(command, uid, protocolType, logTag), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$oHR_ZDIBmRbltSKSzEwz-3esUA8
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2440sendWithAck$lambda19((java.lang.Boolean) obj, (byte[]) obj2);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableZip, "zip(ackObservable, requestObservable, BiFunction { t1, _ ->\n                            t1\n                        })");
        io.reactivex.Observable<java.lang.Boolean> observableTimeout = observableZip.timeout(timeout, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableTimeout, "responseObservable\n                .timeout(timeout, TimeUnit.SECONDS)");
        return observableTimeout;
    }

    private final boolean isAckControlMark(byte[] data) {
        java.util.List<kotlin.Pair<java.lang.Byte, java.lang.Byte>> listZip = kotlin.collections.ArraysKt.zip(data, this.newControlAckMark);
        if (!(listZip instanceof java.util.Collection) || !listZip.isEmpty()) {
            java.util.Iterator<T> it = listZip.iterator();
            while (it.hasNext()) {
                kotlin.Pair pair = (kotlin.Pair) it.next();
                if (!(((java.lang.Number) pair.getFirst()).byteValue() == ((java.lang.Number) pair.getSecond()).byteValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    private final io.reactivex.Observable<byte[]> readCommandResponse(final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType filterProtocolType, java.lang.String logTag) {
        io.reactivex.Observable<byte[]> observableTimeout = this.communicator.messageOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$DoRoYkHBgvejrehs9eU7DTMxVk4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2401readCommandResponse$lambda21(filterProtocolType, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$YbQMdOjdytbA-6P6MYZRSyLmLvE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2402readCommandResponse$lambda22((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$WHqkg-jhtaTd9nM5df6ltJMDx3k
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2403readCommandResponse$lambda23(this.f$0, (byte[]) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$KqHm__ri3LTUId9o_87bPaAva9E
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2404readCommandResponse$lambda24(this.f$0, (byte[]) obj);
            }
        }).timeout(15L, java.util.concurrent.TimeUnit.SECONDS);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableTimeout, "communicator\n                .messageOutput()\n                .filter { it.protocolType == filterProtocolType }\n                .map { it.protocolMessage.payload.data }\n                .filter { !it.contentEquals(DTPAckType.AckGood.value) && !isAckControlMark(it) }\n                .doOnNext {\n                    debug(\"READ DTP Gen2 -> ${it.formatToString(false)}\")\n                    Log.d(TAG, \"Step 3. - Received command response <--: ${it.formatToString()}\")\n                }\n                .timeout(15, TimeUnit.SECONDS)");
        return observableTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readCommandResponse$lambda-21, reason: not valid java name */
    public static final boolean m2401readCommandResponse$lambda21(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType filterProtocolType, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterProtocolType, "$filterProtocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == filterProtocolType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readCommandResponse$lambda-22, reason: not valid java name */
    public static final byte[] m2402readCommandResponse$lambda22(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolMessage().getPayload().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readCommandResponse$lambda-23, reason: not valid java name */
    public static final boolean m2403readCommandResponse$lambda23(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (java.util.Arrays.equals(it, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckGood.INSTANCE.getValue()) || this$0.isAckControlMark(it)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readCommandResponse$lambda-24, reason: not valid java name */
    public static final void m2404readCommandResponse$lambda24(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("READ DTP Gen2 -> ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString(it, false)), null, 2, null);
        android.util.Log.d(this$0.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Step 3. - Received command response <--: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null)));
    }

    private final io.reactivex.Observable<byte[]> readResendControlPackage(final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType filterProtocolType, java.lang.String logTag) {
        io.reactivex.Observable<byte[]> observableDoOnNext = this.communicator.messageOutput().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$sUdv1t8S7Yn7USjPrfwRvVfmhHk
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2405readResendControlPackage$lambda25(filterProtocolType, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$yCiHutcGjfiREGPzIAdMK9Sf198
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2406readResendControlPackage$lambda26((powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$EiHp-qmrGCzte2xOqVCru1RzTzw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2407readResendControlPackage$lambda27(this.f$0, (byte[]) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$W-buHRHUsNOLLcrqJVZ0ofJXjf4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2408readResendControlPackage$lambda28(this.f$0, (byte[]) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "communicator\n                .messageOutput()\n                .filter { it.protocolType == filterProtocolType }\n                .map { it.protocolMessage.payload.data }\n                .filter { isAckControlMark(it) }\n                .doOnNext { Log.d(TAG, \"Step -1. - Read control package <--: ${it.formatToString()}\") }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readResendControlPackage$lambda-25, reason: not valid java name */
    public static final boolean m2405readResendControlPackage$lambda25(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType filterProtocolType, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterProtocolType, "$filterProtocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType() == filterProtocolType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readResendControlPackage$lambda-26, reason: not valid java name */
    public static final byte[] m2406readResendControlPackage$lambda26(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolMessage().getPayload().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readResendControlPackage$lambda-27, reason: not valid java name */
    public static final boolean m2407readResendControlPackage$lambda27(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.isAckControlMark(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readResendControlPackage$lambda-28, reason: not valid java name */
    public static final void m2408readResendControlPackage$lambda28(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.lang.String str = this$0.TAG;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        android.util.Log.d(str, kotlin.jvm.internal.Intrinsics.stringPlus("Step -1. - Read control package <--: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null)));
    }

    static /* synthetic */ io.reactivex.Observable writeAck$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl, java.lang.String str, boolean z, java.lang.String str2, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeAck");
        }
        if ((i & 8) != 0) {
            protocolType = powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP;
        }
        return gen2ExecutorImpl.writeAck(str, z, str2, protocolType);
    }

    private final io.reactivex.Observable<byte[]> writeAck(final java.lang.String uid, final boolean validCRC, java.lang.String logTag, final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        io.reactivex.Observable<byte[]> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$psZjASiusx47WejKtwPhhciLhe8
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2489writeAck$lambda30(validCRC, this, uid, protocolType);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            var ackType: DTPAckType = DTPAckType.AckGood\n            if (!validCRC) {\n                ackType = DTPAckType.AckCRCInvalid\n            }\n            return@defer communicator.sendMessage(CommunicationMessage(uid, ProtocolMessage(ProtocolPayload(ackType.value),\n                    messageType = ProtocolMessageType.ACK_MESSAGE,\n                    type = protocolType),\n                    TechnologyType.BLE_COMMUNICATION, protocolType))\n                    .toSingleDefault(ackType.value)\n                    .toObservable()\n                    .doOnNext {\n                        debug(\"WRITE ACK -> 00\")\n                        Log.d(TAG, \"Step 4. - Sending ACK -->: ${it.formatToString()}\")\n                    }\n\n        }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeAck$lambda-30, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2489writeAck$lambda30(boolean z, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "$protocolType");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckCRCInvalid ackCRCInvalid = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckGood.INSTANCE;
        if (!z) {
            ackCRCInvalid = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DTPAckType.AckCRCInvalid.INSTANCE;
        }
        return this$0.communicator.sendMessage(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(uid, new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(ackCRCInvalid.getValue()), protocolType, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolMessageType.ACK_MESSAGE), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, protocolType)).toSingleDefault(ackCRCInvalid.getValue()).toObservable().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$dvuVlG1euCoc4kO4V-KjoZvrSY8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2490writeAck$lambda30$lambda29(this.f$0, (byte[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: writeAck$lambda-30$lambda-29, reason: not valid java name */
    public static final void m2490writeAck$lambda30$lambda29(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "WRITE ACK -> 00", null, 2, null);
        java.lang.String str = this$0.TAG;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        android.util.Log.d(str, kotlin.jvm.internal.Intrinsics.stringPlus("Step 4. - Sending ACK -->: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(it, false, 1, null)));
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData> readWithAck(final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command command, final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, final java.lang.String logTag) {
        io.reactivex.Observable<byte[]> commandResponse = readCommandResponse(protocolType, logTag);
        final io.reactivex.Observable<byte[]> resendControlPackage = readResendControlPackage(protocolType, logTag);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData> observableTakeUntil = commandResponse.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$uuQuQEBQ_4WU0JG9JnOhFxNPv3Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2409readWithAck$lambda31(command, dataInfo, this, (byte[]) obj);
            }
        }).switchMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$qk1YxJnfz1-z190GaUcxZcfk-Dw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2410readWithAck$lambda35(this.f$0, uid, logTag, resendControlPackage, (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$xDD52KR3JdQHIWz1TFAwfyuEfc8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2414readWithAck$lambda36(this.f$0, (java.lang.Throwable) obj);
            }
        }).takeUntil(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$c9xdiKYzCXNhVmV4MGzV0sdMMkk
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2415readWithAck$lambda37((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "readCommandObservable\n                .map {\n                    val payload = command.extractPayload(it)\n                    val isResponseValid = command.extractAndCompareCRC(it)\n                    val error = command.extractResponseType(payload)\n                    // map response type to ack data type\n                    if (error == null) {\n                        command.onSuccess(dataInfo)\n                    } else {\n\n                        //include this part for CRC retry logic\n                        if (!isResponseValid) {\n                            debug(\"Invalid CRC, will write ACK 01\", \"sync_tracker\")\n                            return@map Gen2AckData(dataInfo, false, validCRC = false, error = error)\n                        }\n\n                        val parsedData = command.parseReceivedData(it, dataInfo)\n//                        Log.d(TAG,\"ReadWithAck - Data on parse: $parsedData\")\n                        val result = Gen2AckData(dataInfo, false, error = error)\n                        //    result.validCRC = isResponseValid\n                        result\n                    }\n                }\n                .switchMap { data ->\n                    Observable.timer(200, TimeUnit.MILLISECONDS)\n                            .firstOrError()\n                            .toObservable()\n                            .flatMap {\n                                val writeAck = writeAck(uid, data.validCRC, logTag)\n                                Observable.merge(\n                                        writeAck,\n                                        waitForControlPackageResend\n                                                .throttleFirst(3, TimeUnit.MILLISECONDS)\n                                                .flatMap { writeAck })\n                            }\n                            .map { data }\n                }\n                .doOnError {\n                    error(\"Error in read with ack: ${it.javaClass.simpleName}\", it)\n                }\n                .takeUntil { it.successReceived }");
        return observableTakeUntil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-31, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData m2409readWithAck$lambda31(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "$command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        kotlin.Pair<java.lang.Boolean, byte[]> pairExtractPayload = command.extractPayload(it);
        boolean zExtractAndCompareCRC = command.extractAndCompareCRC(it);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError dTPProtocolErrorExtractResponseType = command.extractResponseType(pairExtractPayload);
        if (dTPProtocolErrorExtractResponseType == null) {
            return command.onSuccess(dataInfo);
        }
        if (!zExtractAndCompareCRC) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug(this$0, "Invalid CRC, will write ACK 01", "sync_tracker");
            return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData(dataInfo, false, false, dTPProtocolErrorExtractResponseType);
        }
        command.parseReceivedData(it, dataInfo);
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData(dataInfo, false, false, dTPProtocolErrorExtractResponseType, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-35, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2410readWithAck$lambda35(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, final java.lang.String uid, final java.lang.String logTag, final io.reactivex.Observable waitForControlPackageResend, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logTag, "$logTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waitForControlPackageResend, "$waitForControlPackageResend");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return io.reactivex.Observable.timer(200L, java.util.concurrent.TimeUnit.MILLISECONDS).firstOrError().toObservable().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$_YpSzJKCAuwqiKPuImaJncMHmXA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2411readWithAck$lambda35$lambda33(this.f$0, uid, data, logTag, waitForControlPackageResend, (java.lang.Long) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$Zm4rjmFItzn7DODsUNx-VOXc66w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2413readWithAck$lambda35$lambda34(data, (byte[]) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-35$lambda-33, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2411readWithAck$lambda35$lambda33(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData data, java.lang.String logTag, io.reactivex.Observable waitForControlPackageResend, java.lang.Long it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logTag, "$logTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waitForControlPackageResend, "$waitForControlPackageResend");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        final io.reactivex.Observable observableWriteAck$default = writeAck$default(this$0, uid, data.getValidCRC(), logTag, null, 8, null);
        return io.reactivex.Observable.merge(observableWriteAck$default, waitForControlPackageResend.throttleFirst(3L, java.util.concurrent.TimeUnit.MILLISECONDS).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$6X5TtDPIM3m6MnMagS2HUBjWTBU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2412readWithAck$lambda35$lambda33$lambda32(observableWriteAck$default, (byte[]) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-35$lambda-33$lambda-32, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2412readWithAck$lambda35$lambda33$lambda32(io.reactivex.Observable writeAck, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeAck, "$writeAck");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return writeAck;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-36, reason: not valid java name */
    public static final void m2414readWithAck$lambda36(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Error in read with ack: ", th.getClass().getSimpleName()), th, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readWithAck$lambda-37, reason: not valid java name */
    public static final boolean m2415readWithAck$lambda37(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSuccessReceived();
    }

    public static /* synthetic */ io.reactivex.Observable sendSingleCommandWithAck$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command gen2Command, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, float f, long j, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj == null) {
            return gen2ExecutorImpl.sendSingleCommandWithAck(gen2Command, str, gen2DataInfo, (i & 8) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_DTP : protocolType, f, (i & 32) != 0 ? 10L : j, (i & 64) != 0 ? "sync_tracker" : str2);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSingleCommandWithAck");
    }

    protected final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo> sendSingleCommandWithAck(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Command command, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType, float power, long timeout, final java.lang.String logTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logTag, "logTag");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData> withAck = readWithAck(command, uid, dataInfo, protocolType, logTag);
        io.reactivex.Observable<java.lang.Boolean> observableSendWithAck = sendWithAck(command, uid, protocolType, timeout, logTag);
        final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        booleanRef.element = true;
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo> observable = io.reactivex.Observable.zip(withAck.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$g9qKG-3t0poploI58dM9A4dUuN0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2430sendSingleCommandWithAck$lambda38(booleanRef, (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$CfQJT07_0gKAO9OejHY-jLyzH9I
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2431sendSingleCommandWithAck$lambda39((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$L-z7af9BgqT4JNUBw46RSY6CGOY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2432sendSingleCommandWithAck$lambda40((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$Houk29CWgJyzuIjLQhQveJLjO9E
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2433sendSingleCommandWithAck$lambda41((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$SWlw1yVHMWEuTDbqT2_W9rKu6Qs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2434sendSingleCommandWithAck$lambda42((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj);
            }
        }), io.reactivex.Observable.merge(observableSendWithAck, readResendControlPackage(protocolType, logTag).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$vN3R0tL4kGAwmZu0aT_Tuj4eYbI
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2435sendSingleCommandWithAck$lambda43(booleanRef, (byte[]) obj);
            }
        }).throttleFirst(3L, java.util.concurrent.TimeUnit.MILLISECONDS).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$R_uYYtctyFT8NCJSKp1OWktENzQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2436sendSingleCommandWithAck$lambda44((byte[]) obj);
            }
        })).retryWhen(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$cfwI-77B2LmnvnM1fKkVCpXQ9mQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2437sendSingleCommandWithAck$lambda46(this.f$0, uid, logTag, (io.reactivex.Observable) obj);
            }
        }), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$kwexQM9kv4O__F8JXeINsDqCf0Y
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2439sendSingleCommandWithAck$lambda47((powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData) obj, (java.lang.Boolean) obj2);
            }
        }).firstOrError().toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "zip(\n                readCommandAndSendAck\n                        .doOnNext { shouldAllowSuccessACK = it.successReceived }\n                        .doOnNext {\n                            //                            if (it.dataInfo.dataInfo.parsingStarted && !it.dataInfo.dataInfo.parsingFinished) {\n//                                val progress = command.extractProgress(it.dataInfo.dataInfo) * 100\n//                                progressSubject.onNext((progressSubject.value\n//                                        ?: 0f).plus((progress * power)))\n//                            }\n                        }\n                        .flatMap {\n                            var resultObs = Observable.just(it)\n\n                            when {\n                                it.error as? DTPProtocolError.SyncLocked != null -> resultObs = Observable.error(it.error)\n                                it.error as? DTPProtocolError.WatchBusy != null -> resultObs = Observable.error(it.error)\n                                it.error as? DTPProtocolParsingError != null -> resultObs = Observable.error(it.error)\n                            }\n                            resultObs\n                        }\n                        .filter {\n                            it.successReceived\n                        }\n                        .doOnNext {\n                            //                            if (it.dataInfo.dataInfo.parsingFinished) {\n//                                val progress = command.extractProgress(it.dataInfo.dataInfo) * 100\n//                                progressSubject.onNext((progressSubject.value\n//                                        ?: 0f).plus((progress * power)))\n//                                Log.d(TAG, \"Summed on ACK: ${progressSubject.value}\")\n//                            }\n                        },\n                Observable.merge(\n                        writeCommandAndWaitForAck,\n                        readResendControlPackage(protocolType, logTag)\n                                .filter { shouldAllowSuccessACK }\n                                .throttleFirst(3, TimeUnit.MILLISECONDS)\n                                .flatMap { Observable.error<Boolean>(ControlPackageResendError.AckResentControlPackage) })\n                        .retryWhen {\n                            it.flatMap {\n                                if (it is ControlPackageResendError.AckResentControlPackage) {\n                                    Log.d(TAG, \"Received control packet on listener for E200, will write ACK..\")\n                                    // TODO check crc here??\n                                    return@flatMap writeAck(uid, true, logTag)\n                                }\n                                return@flatMap Observable.error<Unit>(it)\n                            }\n                        },\n                BiFunction<Gen2AckData, Boolean, Gen2DataInfo> { t1, _ ->\n                    t1.dataInfo\n                }\n        )\n                .firstOrError()\n                .toObservable()");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-38, reason: not valid java name */
    public static final void m2430sendSingleCommandWithAck$lambda38(kotlin.jvm.internal.Ref.BooleanRef shouldAllowSuccessACK, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData gen2AckData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldAllowSuccessACK, "$shouldAllowSuccessACK");
        shouldAllowSuccessACK.element = gen2AckData.getSuccessReceived();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-40, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2432sendSingleCommandWithAck$lambda40(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.Observable observableJust = io.reactivex.Observable.just(it);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(it)");
        java.lang.Throwable error = it.getError();
        if ((error instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked ? (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked) error : null) != null) {
            observableJust = io.reactivex.Observable.error(it.getError());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "error(it.error)");
        } else {
            java.lang.Throwable error2 = it.getError();
            if ((error2 instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy ? (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy) error2 : null) != null) {
                observableJust = io.reactivex.Observable.error(it.getError());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "error(it.error)");
            } else {
                java.lang.Throwable error3 = it.getError();
                if ((error3 instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError ? (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError) error3 : null) != null) {
                    observableJust = io.reactivex.Observable.error(it.getError());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "error(it.error)");
                }
            }
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-41, reason: not valid java name */
    public static final boolean m2433sendSingleCommandWithAck$lambda41(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getSuccessReceived();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-43, reason: not valid java name */
    public static final boolean m2435sendSingleCommandWithAck$lambda43(kotlin.jvm.internal.Ref.BooleanRef shouldAllowSuccessACK, byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shouldAllowSuccessACK, "$shouldAllowSuccessACK");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return shouldAllowSuccessACK.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-44, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2436sendSingleCommandWithAck$lambda44(byte[] it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.error(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ControlPackageResendError.AckResentControlPackage.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-46, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2437sendSingleCommandWithAck$lambda46(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, final java.lang.String uid, final java.lang.String logTag, io.reactivex.Observable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logTag, "$logTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$q79FW_B2taJgeJFRCZeRbvsmoc4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2438sendSingleCommandWithAck$lambda46$lambda45(this.f$0, uid, logTag, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-46$lambda-45, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2438sendSingleCommandWithAck$lambda46$lambda45(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, java.lang.String logTag, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logTag, "$logTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.ControlPackageResendError.AckResentControlPackage) {
            android.util.Log.d(this$0.TAG, "Received control packet on listener for E200, will write ACK..");
            return writeAck$default(this$0, uid, true, logTag, null, 8, null);
        }
        return io.reactivex.Observable.error(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendSingleCommandWithAck$lambda-47, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo m2439sendSingleCommandWithAck$lambda47(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2AckData t1, java.lang.Boolean noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t1, "t1");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return t1.getDataInfo();
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger getTraceLogger() {
        return (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger) this.traceLogger.getValue();
    }

    protected final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo reformatDataLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoParam) {
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoParam, "dataInfoParam");
        java.util.Iterator it = dataInfoParam.getActivityInfo().getActivityDataLogs().iterator();
        while (it.hasNext()) {
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog gen2ActivityDataLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog) it.next();
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type = gen2ActivityDataLog.getType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.STATIONARY.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_STATIONARY;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.WALKING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_WALKING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.JOGGING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_JOGGING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_RUNNING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.BIKING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_BIKING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.DRIVING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_DRIVING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_WALKING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_WALKING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_RUNNING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_RUNNING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_JOGGING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_JOGGING;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_INDOOR_BIKING.INSTANCE)) {
                userActivityType = powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_INDOOR_BIKING;
            } else {
                userActivityType = kotlin.jvm.internal.Intrinsics.areEqual(type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.ACTIVITY_HIIT.INSTANCE) ? powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_HIIT : powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType.ACTIVITY_UNKNOWN;
            }
            powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType userActivityType2 = userActivityType;
            long startTime = gen2ActivityDataLog.getStartLog().getStartTime();
            long j = 1000;
            long j2 = startTime * j;
            long endLogTime = gen2ActivityDataLog.getEndLog().getEndLogTime() * j;
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry watchRunningLogEntry = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry(userActivityType2, j2, endLogTime, gen2ActivityDataLog.getEndLog().getEndLogDistance() - gen2ActivityDataLog.getStartLog().getStartLogDistance(), gen2ActivityDataLog.getEndLog().getEndStepsRunning() + gen2ActivityDataLog.getEndLog().getEndStepsWalk(), gen2ActivityDataLog.getEndLog().getEndActiveCals() + gen2ActivityDataLog.getEndLog().getEndBMRCals(), (int) (endLogTime - j2), null, 128, null);
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TraceLogger traceLogger = getTraceLogger();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("---- Activity start ");
            long j3 = 1000;
            sb.append(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateStringDashed(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(gen2ActivityDataLog.getStartLog().getStartTime() * 1000)));
            sb.append(" ----\n");
            traceLogger.log(sb.toString(), powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate.INSTANCE);
            if (!java.lang.Float.isNaN(gen2ActivityDataLog.getStartLog().getStartLatitude())) {
                watchRunningLogEntry.getRunningSplits().add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry(new powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition(gen2ActivityDataLog.getStartLog().getStartLongitude(), gen2ActivityDataLog.getStartLog().getStartLatitude(), gen2ActivityDataLog.getStartLog().getStartAltitude(), 0.0d, j2, 8, null), new powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate(gen2ActivityDataLog.getStartLog().getStartHeartRate(), j2, j2 + j), new powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit(gen2ActivityDataLog.getStartLog().getStartLogDistance(), 1000L)));
                float startLatitude = gen2ActivityDataLog.getStartLog().getStartLatitude();
                float startLongitude = gen2ActivityDataLog.getStartLog().getStartLongitude();
                float startAltitude = gen2ActivityDataLog.getStartLog().getStartAltitude();
                int i = 1;
                for (java.util.Iterator it2 = gen2ActivityDataLog.getDeltaLogs().iterator(); it2.hasNext(); it2 = it2) {
                    powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog gen2ActivityDeltaLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog) it2.next();
                    long j4 = (startTime + ((long) i)) * j3;
                    startLatitude += gen2ActivityDeltaLog.getDeltaGPSLat() / 100000.0f;
                    startLongitude += gen2ActivityDeltaLog.getDeltaGPSLong() / 100000.0f;
                    startAltitude += gen2ActivityDeltaLog.getDeltaAltitude();
                    java.util.Iterator it3 = it;
                    watchRunningLogEntry.getRunningSplits().add(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry(new powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition(startLongitude, startLatitude, startAltitude, 0.0d, j4, 8, null), new powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate(gen2ActivityDeltaLog.getDeltaHeartRate(), j4, j4 + j), new powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit(gen2ActivityDeltaLog.getDeltaDistance(), 1000L)));
                    getTraceLogger().log(gen2ActivityDeltaLog.getDeltaHeartRate() + ",\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate.INSTANCE);
                    i++;
                    j3 = 1000L;
                    it = it3;
                }
            }
            dataInfoParam.getDataInfo().getRunningLogs().add(watchRunningLogEntry);
            it = it;
        }
        return dataInfoParam;
    }

    protected final io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo>> handleSyncError(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "dataInfoWrapper");
        return new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$O2ggxXYJWBN4EPjh7qqLiLC-u8U
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2355handleSyncError$lambda55(this.f$0, uid, dataInfoWrapper, (java.lang.Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSyncError$lambda-55, reason: not valid java name */
    public static final io.reactivex.Observable m2355handleSyncError$lambda55(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        if ((error instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy) || (error instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked)) {
            return io.reactivex.Observable.error(error);
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Sync error occurred, will catch it and send Gen2StopAmDTPCommand. Error is: ", error, null, 4, null);
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopAmDTPCommand(), uid, dataInfoWrapper, null, 0.05f, 0L, null, 104, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$t4_RmZubQAr-hg7uC7CA3eZ01o8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2356handleSyncError$lambda55$lambda51(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$JaMwLqHKEx8a3gYG-UWqXe975HQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2357handleSyncError$lambda55$lambda52(this.f$0, error, (java.lang.Throwable) obj);
            }
        }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$VblIcl8lfCN7rm52FOhy1VT6jvI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2358handleSyncError$lambda55$lambda53(error, (java.lang.Throwable) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$oN0WJGUDIe4OK1ubeXJrBwTErxU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2359handleSyncError$lambda55$lambda54(error, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSyncError$lambda-55$lambda-51, reason: not valid java name */
    public static final void m2356handleSyncError$lambda55$lambda51(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StopAmDTPCommand after sync error sent successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSyncError$lambda-55$lambda-52, reason: not valid java name */
    public static final void m2357handleSyncError$lambda55$lambda52(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.Throwable error, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Gen2StopAmDTPCommand after sync error failed to send. Reason: ", error, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSyncError$lambda-55$lambda-53, reason: not valid java name */
    public static final io.reactivex.Observable m2358handleSyncError$lambda55$lambda53(java.lang.Throwable error, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.error(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handleSyncError$lambda-55$lambda-54, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2359handleSyncError$lambda55$lambda54(java.lang.Throwable error, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.error(error);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, dataInfo, null, null, 55, null);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$CSqEEB0zUyuew30uLDIXnsVaTxE
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2485transferData$lambda56(this.f$0, dataInfo, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$CCQF_iAIdZ2zTYCrKnQ7YsfwXZA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2441transferData$lambda104(this.f$0, uid, dataInfo, power, gen2DataInfo, pairingConfig, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = syncPowers\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.025F * power)\n                    .doOnNext { debug(\"Gen2DeviceInfoCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2StartAmDTPCommand(), uid, dataInfoWrapper, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveUserInformationCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2ReceiveUserInformationCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserInformationCommand(pairingConfig.unitsInfoData), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendUserInformationCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendBiometricsCommand(pairingConfig.userInfoData), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendBiometricsCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveStepsDistanceGoals(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2ReceiveStepsDistanceGoals finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendStepsDistanceGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendStepsDistanceGoal finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendCaloriesSleepGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendCaloriesSleepGoal finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendLanguageCommand(pairingConfig.languageInfoData.locale), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendLanguageCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(RTLStatusCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLStatusCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(RTLTimeCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLTimeCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityStartLogCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext {\n                        debug(\"Gen2ActivityStartLogCommand finished successfully.\")\n                        printStartLogs(it.tempActivityLog.tempStartLogs)\n                    }\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityEndLogCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext {\n                        debug(\"Gen2ActivityEndLogCommand finished successfully.\")\n                        printEndLogs(it.tempActivityLog.tempEndLogs)\n                    }\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityDeltaLogCommand(), uid, it, power = 0.08F * power) }\n                    .doOnNext { debug(\"Gen2ActivityDeltaLogCommand finished successfully.\") }\n                    .doOnNext { gen2DataInfo ->\n                        val list = gen2DataInfo.tempActivityLog.exportActivityDataLogs()\n                        gen2DataInfo.activityInfo.activityDataLogs.addAll(list)\n                        gen2DataInfo.activityInfo.activityDataLogs.forEach {\n                            printActivityDeltaLogs(it.deltaLogs)\n                        }\n                    }\n                    .flatMap { sendSingleCommandWithAck(Gen2BackgroundLogCommand(it.rtlData), uid, it, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2BackgroundLogCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanRTLCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanRTLCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanActivityLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanActivityLogCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanBackgroundLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanBackgroundLogCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanSleepLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanSleepLogCommand finished successfully.\") }\n                    // if any error has occurred, send sync end command\n                    // output of this operator should be only ERROR\n                    .onErrorResumeNext(handleSyncError(uid, dataInfoWrapper))\n                    .flatMap { sendSingleCommandWithAck(Gen2StopAmDTPCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StopAmDTPCommand finished successfully.\") }\n                    .doOnNext {\n\n                        val totalSteps = it.dataInfo.activityLogs.sumBy { it.walkingSteps.toInt() }\n                        val totalRunningSteps = it.dataInfo.activityLogs.sumBy { it.runningSteps.toInt() }\n\n                        debug(\"Total log entries: ${it.dataInfo.activityLogs.size}\")\n                        debug(\"Sleep log entries: ${it.dataInfo.activityLogs.count { it.isSleep }}\")\n                        debug(\"Total steps retrieved: ${totalSteps + totalRunningSteps}\")\n                        debug(\"Total number of activities retrieved: ${it.dataInfo.runningLogs.size}\")\n                        debug(\"RTL timestamps: ${it.rtlData}\")\n\n                    }\n                    .map { gen2DataInfo -> reformatDataLogs(gen2DataInfo).dataInfo }\n                    .doOnError {\n                        Log.e(TAG, \"Sync failed. Reason: $it\")\n                        it.printStackTrace()\n                    }\n        }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-56, reason: not valid java name */
    public static final void m2485transferData$lambda56(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSyncProgressChannel().setTempPowersConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getSyncPowers());
        this$0.getSyncProgressChannel().reset();
        it.onNext(dataInfo);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2441transferData$lambda104(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float f, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, f * 0.025f, 0, 16, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$ob33Cav8Zn5CCc5_5ZYsbbN7Wf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2445transferData$lambda104$lambda57(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$YSmqp2DFyGIuuLav7DSdnm4fWYY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2446transferData$lambda104$lambda58(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$E5RBN5uUruQF9S5nxhppoNFkWN4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2447transferData$lambda104$lambda59(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$CxWoBGFl8_mBrXeqn7bHCXVJJy0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2448transferData$lambda104$lambda60(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$lVJ8PF2m_1lHAEgAEMJUgRpoBeo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2449transferData$lambda104$lambda61(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$uV7I_pPFcDnY30vrAgy6cdmq8wI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2450transferData$lambda104$lambda62(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$XKur28JZitOmIa5mcEMS_toCXcc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2451transferData$lambda104$lambda63(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$3guA9zPoejLggDJMH0kkjTV9nJs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2452transferData$lambda104$lambda64(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$igyf1bklFE7tJldUQUJ7QkTpD_w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2453transferData$lambda104$lambda65(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$YOMFeIoo4Rmd-okHowyZ_Am_ppM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2454transferData$lambda104$lambda66(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$No5KVt1J99dvM2nCY3ZFWM3nqhk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2455transferData$lambda104$lambda67(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$r6yZpHfsS97WD_IZ_joHq0NgCrI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2456transferData$lambda104$lambda68(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$GIgplP9OhCDnCtBmLaJySokg_D8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2457transferData$lambda104$lambda69(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$uGuC9IOpePd3cCxP_zr14ykOKyo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2458transferData$lambda104$lambda70(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$jYb8tt0Q68HcIzeAj8jncwSeF-U
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2459transferData$lambda104$lambda71(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$47yF6gDEEbNB95WngaUgF02FyHs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2460transferData$lambda104$lambda72(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$S8YJpR7Fxu6W9r6swxs0rk3__28
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2461transferData$lambda104$lambda73(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$EE9FEAr3w8aBeXEvCW8ZX2YLbhA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2462transferData$lambda104$lambda74(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$vCMDTTiQ28yNa0GhKxkjA3ba1Eo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2463transferData$lambda104$lambda75(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$-VWuVqBMeS4cJuY9hzT_pCbJeDI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2464transferData$lambda104$lambda76(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$TeoDVbahsZeCXkaKIaorYNqArMM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2465transferData$lambda104$lambda77(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$JQcHQdBU7Y3bCGqqQuUBqXrF9Fs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2466transferData$lambda104$lambda78(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$OKb9S_LXBoncc4yT5o1s-abmXi4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2467transferData$lambda104$lambda79(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$28VFAYYnYi-awc98EPY5ahTAG98
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2468transferData$lambda104$lambda80(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$7Teum4orS9WmOxD3gbwxoDjLhTQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2469transferData$lambda104$lambda81(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$3ye_sad_74UtoeQzKfrOHrrdgvA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2470transferData$lambda104$lambda82(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$Es6m8tbx538feM_Pj86Z2nIngr8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2471transferData$lambda104$lambda83(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$A16FEfbF87kYyAJwP6vW-PVyNSg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2472transferData$lambda104$lambda85(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$3ppR7K9douhczM_zjS65eBykn0A
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2473transferData$lambda104$lambda86(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$9XCpy6rzatfh1i5uU_eEz_tG5AE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2474transferData$lambda104$lambda87(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$y0v0chN3-5tqcLaZzf8PSYa4A0c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2475transferData$lambda104$lambda88(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$EoSKZqBGZlomcnzFK-F6-__Tzls
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2476transferData$lambda104$lambda89(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$5bVnTG_BwIOawtJkFbWhdNhRiLA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2477transferData$lambda104$lambda90(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$A6N5byYuEGu15SyOwQMNOVtDd14
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2478transferData$lambda104$lambda91(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$aaB6w0e4aTdq4LcUF107GdWy1eo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2479transferData$lambda104$lambda92(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$ABO9A9u_fbOoSX46mcW8zkhpR0g
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2480transferData$lambda104$lambda93(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$rBOEqwq0lcwpxXvLuiVkoXHq7zs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2481transferData$lambda104$lambda94(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$IhXk_AAetIhn9bWS3aTNnE0WfJI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2482transferData$lambda104$lambda95(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).onErrorResumeNext(this$0.handleSyncError(uid, dataInfoWrapper)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$tj0nq1oope4c93R40mN9xBAfk88
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2483transferData$lambda104$lambda96(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$pP8RaJNH2nr767qKs7GhDMFNTjU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2484transferData$lambda104$lambda97(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$V2ys7EdML3m1SGVaN2fA4MlLBpc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2442transferData$lambda104$lambda101(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$e-Nygp_sTLKM21FHil8gecQjGsU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2443transferData$lambda104$lambda102(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$ZDGJWKh-Rl10l2zMedz17gGHWPk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2444transferData$lambda104$lambda103(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-57, reason: not valid java name */
    public static final void m2445transferData$lambda104$lambda57(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2DeviceInfoCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-58, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2446transferData$lambda104$lambda58(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StartAmDTPCommand(), uid, dataInfoWrapper, null, f * 0.025f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-59, reason: not valid java name */
    public static final void m2447transferData$lambda104$lambda59(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StartAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-60, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2448transferData$lambda104$lambda60(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ReceiveUserInformationCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-61, reason: not valid java name */
    public static final void m2449transferData$lambda104$lambda61(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ReceiveUserInformationCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-62, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2450transferData$lambda104$lambda62(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserInformationCommand(pairingConfig.getUnitsInfoData()), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-63, reason: not valid java name */
    public static final void m2451transferData$lambda104$lambda63(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendUserInformationCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-64, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2452transferData$lambda104$lambda64(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendBiometricsCommand(pairingConfig.getUserInfoData()), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-65, reason: not valid java name */
    public static final void m2453transferData$lambda104$lambda65(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendBiometricsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-66, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2454transferData$lambda104$lambda66(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ReceiveStepsDistanceGoals(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-67, reason: not valid java name */
    public static final void m2455transferData$lambda104$lambda67(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ReceiveStepsDistanceGoals finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-68, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2456transferData$lambda104$lambda68(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendStepsDistanceGoal(pairingConfig.getGoalInfoData()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-69, reason: not valid java name */
    public static final void m2457transferData$lambda104$lambda69(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendStepsDistanceGoal finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-70, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2458transferData$lambda104$lambda70(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendCaloriesSleepGoal(pairingConfig.getGoalInfoData()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-71, reason: not valid java name */
    public static final void m2459transferData$lambda104$lambda71(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendCaloriesSleepGoal finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-72, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2460transferData$lambda104$lambda72(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendLanguageCommand(pairingConfig.getLanguageInfoData().getLocale()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-73, reason: not valid java name */
    public static final void m2461transferData$lambda104$lambda73(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendLanguageCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-74, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2462transferData$lambda104$lambda74(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLStatusCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-75, reason: not valid java name */
    public static final void m2463transferData$lambda104$lambda75(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLStatusCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-76, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2464transferData$lambda104$lambda76(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLTimeCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-77, reason: not valid java name */
    public static final void m2465transferData$lambda104$lambda77(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLTimeCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-78, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2466transferData$lambda104$lambda78(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLogCommand(), uid, it, null, f * 0.025f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-79, reason: not valid java name */
    public static final void m2467transferData$lambda104$lambda79(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityStartLogCommand finished successfully.", null, 2, null);
        this$0.printStartLogs(gen2DataInfo.getTempActivityLog().getTempStartLogs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-80, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2468transferData$lambda104$lambda80(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLogCommand(), uid, it, null, f * 0.025f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-81, reason: not valid java name */
    public static final void m2469transferData$lambda104$lambda81(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityEndLogCommand finished successfully.", null, 2, null);
        this$0.printEndLogs(gen2DataInfo.getTempActivityLog().getTempEndLogs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-82, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2470transferData$lambda104$lambda82(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLogCommand(), uid, it, null, f * 0.08f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-83, reason: not valid java name */
    public static final void m2471transferData$lambda104$lambda83(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityDeltaLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-85, reason: not valid java name */
    public static final void m2472transferData$lambda104$lambda85(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        gen2DataInfo.getActivityInfo().getActivityDataLogs().addAll(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.exportActivityDataLogs(gen2DataInfo.getTempActivityLog()));
        java.util.Iterator<T> it = gen2DataInfo.getActivityInfo().getActivityDataLogs().iterator();
        while (it.hasNext()) {
            this$0.printActivityDeltaLogs(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog) it.next()).getDeltaLogs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-86, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2473transferData$lambda104$lambda86(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommand(it.getRtlData()), uid, it, null, f * 0.025f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-87, reason: not valid java name */
    public static final void m2474transferData$lambda104$lambda87(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2BackgroundLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-88, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2475transferData$lambda104$lambda88(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanRTLCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-89, reason: not valid java name */
    public static final void m2476transferData$lambda104$lambda89(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanRTLCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-90, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2477transferData$lambda104$lambda90(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanActivityLogCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-91, reason: not valid java name */
    public static final void m2478transferData$lambda104$lambda91(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanActivityLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-92, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2479transferData$lambda104$lambda92(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanBackgroundLogCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-93, reason: not valid java name */
    public static final void m2480transferData$lambda104$lambda93(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanBackgroundLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-94, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2481transferData$lambda104$lambda94(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanSleepLogCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-95, reason: not valid java name */
    public static final void m2482transferData$lambda104$lambda95(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanSleepLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-96, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2483transferData$lambda104$lambda96(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopAmDTPCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-97, reason: not valid java name */
    public static final void m2484transferData$lambda104$lambda97(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StopAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-101, reason: not valid java name */
    public static final void m2442transferData$lambda104$lambda101(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.Iterator<T> it = gen2DataInfo.getDataInfo().getActivityLogs().iterator();
        int i = 0;
        int walkingSteps = 0;
        while (it.hasNext()) {
            walkingSteps += (int) ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) it.next()).getWalkingSteps();
        }
        java.util.Iterator<T> it2 = gen2DataInfo.getDataInfo().getActivityLogs().iterator();
        int runningSteps = 0;
        while (it2.hasNext()) {
            runningSteps += (int) ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) it2.next()).getRunningSteps();
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl = this$0;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Total log entries: ", java.lang.Integer.valueOf(gen2DataInfo.getDataInfo().getActivityLogs().size())), null, 2, null);
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> activityLogs = gen2DataInfo.getDataInfo().getActivityLogs();
        if (!(activityLogs instanceof java.util.Collection) || !activityLogs.isEmpty()) {
            java.util.Iterator<T> it3 = activityLogs.iterator();
            while (it3.hasNext()) {
                if (((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) it3.next()).isSleep() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Sleep log entries: ", java.lang.Integer.valueOf(i)), null, 2, null);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Total steps retrieved: ", java.lang.Integer.valueOf(walkingSteps + runningSteps)), null, 2, null);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Total number of activities retrieved: ", java.lang.Integer.valueOf(gen2DataInfo.getDataInfo().getRunningLogs().size())), null, 2, null);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("RTL timestamps: ", gen2DataInfo.getRtlData()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-102, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2443transferData$lambda104$lambda102(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2DataInfo, "gen2DataInfo");
        return this$0.reformatDataLogs(gen2DataInfo).getDataInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-104$lambda-103, reason: not valid java name */
    public static final void m2444transferData$lambda104$lambda103(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.e(this$0.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Sync failed. Reason: ", th));
        th.printStackTrace();
    }

    protected final void printActivityDeltaLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> deltaLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deltaLogs, "deltaLogs");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl = this;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Parsing activity log size: ", java.lang.Integer.valueOf(deltaLogs.size())), null, 2, null);
        java.util.Iterator it = kotlin.collections.CollectionsKt.chunked(deltaLogs, 100).iterator();
        while (it.hasNext()) {
            java.util.Iterator it2 = ((java.util.List) it.next()).iterator();
            java.lang.String strStringPlus = "";
            while (it2.hasNext()) {
                strStringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(strStringPlus, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog) it2.next());
            }
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("\n ", strStringPlus), null, 2, null);
        }
    }

    protected final void printEndLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> tempEndLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempEndLogs, "tempEndLogs");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl = this;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Parsing Activity end log size: ", java.lang.Integer.valueOf(tempEndLogs.size())), null, 2, null);
        java.util.Iterator<T> it = tempEndLogs.iterator();
        while (it.hasNext()) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog) it.next()).toString(), null, 2, null);
        }
    }

    protected final void printStartLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> tempStartLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempStartLogs, "tempStartLogs");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl gen2ExecutorImpl = this;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Parsing Activity start log size: ", java.lang.Integer.valueOf(tempStartLogs.size())), null, 2, null);
        java.util.Iterator<T> it = tempStartLogs.iterator();
        while (it.hasNext()) {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2ExecutorImpl, ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog) it.next()).toString(), null, 2, null);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<java.lang.Integer> observeProgress() {
        io.reactivex.Observable<java.lang.Integer> observableDoOnNext = getSyncProgressChannel().progress().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$N3aJW2wyHiqMjffuQjT1upCppxc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2394observeProgress$lambda109((java.lang.Float) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$V4x2Pe9B8zA8v6L3OHzPXpH0zVQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2395observeProgress$lambda110(this.f$0, (java.lang.Integer) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "syncProgressChannel.progress()\n                .map { if (it > 100f) 100 else it.toInt() }\n                .doOnNext {\n                    Log.d(TAG, \"Sync progress: $it\")\n                }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeProgress$lambda-109, reason: not valid java name */
    public static final java.lang.Integer m2394observeProgress$lambda109(java.lang.Float it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return java.lang.Integer.valueOf(it.floatValue() > 100.0f ? 100 : (int) it.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observeProgress$lambda-110, reason: not valid java name */
    public static final void m2395observeProgress$lambda110(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Sync progress: ", num));
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> transferDataWithProgress(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float phasePower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> observableMerge = io.reactivex.Observable.merge(observeProgress().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$XfvnlLrEJGC_BlKDEDknWsRbyGc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2486transferDataWithProgress$lambda111((java.lang.Integer) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferData$default(this, uid, pairingConfig, null, phasePower, 4, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$S03QZexCCQ_dsa_q8KPmTaWhhuA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2487transferDataWithProgress$lambda112(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2ExecutorImpl$8aB-WqMEj3rXJivPsoXTLLclC7A
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.m2488transferDataWithProgress$lambda113((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(\n                observeProgress()\n                        .map { progress -> Pair(progress, null) },\n                transferData(uid, pairingConfig, power = phasePower)\n                        .doOnNext { debug(\"All messages sent\") }\n                        .map { data -> Pair(100, data) }\n        )");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-111, reason: not valid java name */
    public static final kotlin.Pair m2486transferDataWithProgress$lambda111(java.lang.Integer progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        return new kotlin.Pair(progress, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-112, reason: not valid java name */
    public static final void m2487transferDataWithProgress$lambda112(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "All messages sent", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-113, reason: not valid java name */
    public static final kotlin.Pair m2488transferDataWithProgress$lambda113(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new kotlin.Pair(100, data);
    }
}
