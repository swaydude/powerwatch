package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Version3PairExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "transferData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "dataInfo", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2Version3PairExecutorImpl extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2Version3PairExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$UCdrG1BvGtMDsraMM0Juat2Tcj0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2696transferData$lambda0(this.f$0, dataInfo, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$fMw_mljOKiUHuZ8wknqfA3FCyqc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2697transferData$lambda6(this.f$0, uid, dataInfo, power, pairingConfig, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = pairConfigPowers2Ver3\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.1F * power)\n\n                    .flatMap { sendSingleCommandWithAck(Gen2StartPairingCommand(), uid, Gen2DataInfo(dataInfo = it), power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2GetUserAndGoalsCommandVer3(), uid, it, power = 0.3F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, it, power = 0.4F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2StopPairingCommand(), uid, it, power = 0.1F * power) }\n\n                    .map { it.dataInfo }\n        }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final void m2696transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSyncProgressChannel().setTempPowersConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getPairConfigPowers2Ver3());
        this$0.getSyncProgressChannel().reset();
        it.onNext(dataInfo);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2697transferData$lambda6(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl this$0, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float f, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, f * 0.1f, 0, 16, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$RWRsK-Xb5oHaCO_g5tOQLvSbhX4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2698transferData$lambda6$lambda1(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$YsVd7Ku3-7I4Fh1A5MgPLVvBM0o
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2699transferData$lambda6$lambda2(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$YmzCCg14_j8QHozGgZq9gIxn6F4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2700transferData$lambda6$lambda3(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$WsPJGWempwf3tbPJ6HRZ2mVpHEw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2701transferData$lambda6$lambda4(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Version3PairExecutorImpl$LxYNDPoA6-Vg99KB0WZKSyIiJ3I
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl.m2702transferData$lambda6$lambda5((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2698transferData$lambda6$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StartPairingCommand(), uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it, null, null, 55, null), null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2699transferData$lambda6$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2GetUserAndGoalsCommandVer3(), uid, it, null, f * 0.3f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2700transferData$lambda6$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, it, null, f * 0.4f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2701transferData$lambda6$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Version3PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopPairingCommand(), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6$lambda-5, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2702transferData$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getDataInfo();
    }
}
