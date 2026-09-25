package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver2SyncExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "TAG", "", "kotlin.jvm.PlatformType", "logsCountChecker", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;", "transferData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "dataInfo", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class Gen2Ver2SyncExecutorImpl extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    private final java.lang.String TAG;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2Ver2SyncExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        this.TAG = getClass().getSimpleName();
        this.logsCountChecker = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, dataInfo, null, null, 55, null);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$fSEDN8NL7kslaGwbqMO4ettLqek
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2539transferData$lambda0(this.f$0, dataInfo, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$ld6q99gbALrM8AyI-7IvQX3nJzQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2540transferData$lambda39(this.f$0, uid, dataInfo, power, gen2DataInfo, pairingConfig, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = syncConfigPowersV2\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.05F * power)\n                    .doOnNext { debug(\"Gen2DeviceInfoCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2StartAmDTPCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2GetLogCountCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext {\n                        debug(\"Gen2GetLogCountCommand finished successfully.\\n ${it.gen2LogsCount}\")\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2GetUserAndGoalsCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2GetUserAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserPrefsAndGoalsCommand(pairingConfig), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendUserPrefsAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLStatusCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLStatusCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLTimeCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLTimeCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityStartLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForStartLogsCount(it)\n                        debug(\"Gen2ActivityStartLogCommand finished successfully.\")\n                        printStartLogs(it.tempActivityLog.tempStartLogs)\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityEndLogCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForEndLogsCount(it)\n                        debug(\"Gen2ActivityEndLogCommand finished successfully.\")\n                        printEndLogs(it.tempActivityLog.tempEndLogs)\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ActivityDeltaLogCommand(), uid, it, power = 0.3F * power) }\n                    .doOnNext { gen2DataInfo ->\n                        debug(\"Gen2ActivityDeltaLogCommand finished successfully.\")\n                        logsCountChecker.checkForDeltaLogsCount(gen2DataInfo)\n\n                        val list = gen2DataInfo.tempActivityLog.exportActivityDataLogs()\n                        gen2DataInfo.activityInfo.activityDataLogs.addAll(list)\n                        gen2DataInfo.activityInfo.activityDataLogs.forEach {\n                            printActivityDeltaLogs(it.deltaLogs)\n                        }\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2BackgroundLogCommand(it.rtlData), uid, it, power = 0.2F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForBackgroundLogsCount(it)\n                        debug(\"Gen2BackgroundLogCommand finished successfully.\")\n                    }\n                    .doOnNext { traceLogger.log(\"---- Header start ${System.currentTimeMillis().toCalendar().toDateStringDashed()}----\\n\", LogDataType.Header) }\n                    .flatMap { sendSingleCommandWithAck(Gen2HeaderTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Header end ----\\n\", LogDataType.Header)\n                        debug(\"Gen2HeaderTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Accel data start ----\\n\", LogDataType.Accel) }\n                    .flatMap { sendSingleCommandWithAck(Gen2AccelDataTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Accel data end ----\\n\", LogDataType.Accel)\n                        debug(\"Gen2AccelDataTraceLogCommand finished successfully.\")\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanAllLogsCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanAllLogsCommand finished successfully.\") }\n\n                    //TODO sleep log command\n                    // if any error has occurred, send sync end command\n                    // output of this operator should be only ERROR\n                    .onErrorResumeNext(handleSyncError(uid, dataInfoWrapper))\n                    .flatMap { sendSingleCommandWithAck(Gen2StopAmDTPCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StopAmDTPCommand finished successfully.\") }\n                    .doOnNext {\n\n                        val totalSteps = it.dataInfo.activityLogs.sumBy { it.walkingSteps.toInt() }\n                        val totalRunningSteps = it.dataInfo.activityLogs.sumBy { it.runningSteps.toInt() }\n\n                        debug(\"Total log entries: ${it.dataInfo.activityLogs.size} \\n \" +\n                                \"Sleep log entries: ${it.dataInfo.activityLogs.count { it.isSleep }} \\n \" +\n                                \"Total steps retrieved: ${totalSteps + totalRunningSteps} \\n \" +\n                                \"Total number of activities retrieved: ${it.dataInfo.runningLogs.size}\\n\" +\n                                \"RTL timestamps: ${it.rtlData}\"\n                        )\n                    }\n                    .map { gen2DataInfo -> reformatDataLogs(gen2DataInfo).dataInfo }\n                    .doOnError {\n                        Log.e(TAG, \"Sync failed. Reason: \", it)\n                    }\n        }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final void m2539transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSyncProgressChannel().setTempPowersConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getSyncConfigPowersV2());
        this$0.getSyncProgressChannel().reset();
        it.onNext(dataInfo);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2540transferData$lambda39(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float f, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, f * 0.05f, 0, 16, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$Te2bZ4Ce4w5i5s5LutgtUNsLffk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2541transferData$lambda39$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$aoKNDonrTkjbJaHW9ADz0ow2IA0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2551transferData$lambda39$lambda2(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$f3C2O1djQfl63Gdy_wKL_T0rE6Q
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2562transferData$lambda39$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$AZJoFGLmJefWBWiMFK2Z83nYi0Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2569transferData$lambda39$lambda4(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$QfYm_dNqg-2Ntde6LvY-tNRr55M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2570transferData$lambda39$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$VOj2ly_Ef-3zXuLy5RJkS5KyBas
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2571transferData$lambda39$lambda6(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$rJobLMjqTj4oP_YRw3WWmCq41pM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2572transferData$lambda39$lambda7(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$Kjsw-cHmhFrYL-ldZP2H-NkXmjc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2573transferData$lambda39$lambda8(this.f$0, pairingConfig, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$Xk1TjDhFFmI4IhrZdp4fxxM2FHc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2574transferData$lambda39$lambda9(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$-0h0_oY5Wua5u1_BoKzsXoyEDUo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2542transferData$lambda39$lambda10(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$CMWIhCIKWalAyih_-dWcjxP6-rg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2543transferData$lambda39$lambda11(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$deplV3FOT-q2l_O2rLbkXz5n84s
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2544transferData$lambda39$lambda12(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$SSnCm3oa6gjzaMVolXDhnQOKWIA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2545transferData$lambda39$lambda13(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$-ac4R6QoZeq381lR264ledpBxxc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2546transferData$lambda39$lambda14(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$9c5adJyNeBpY5Zamw2fa2axmDJ8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2547transferData$lambda39$lambda15(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$3zhKUUDMtd7uIZpq2Mbt55tU1Mw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2548transferData$lambda39$lambda16(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$Dbs8VZwPJ32leTW1iFfR2-yh_Ig
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2549transferData$lambda39$lambda17(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$P8rXbFwzS1MCJPYcrZqpmD_2rWo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2550transferData$lambda39$lambda18(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$VZiDynlmCe_Ch1i43EE6Q_tef_Q
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2552transferData$lambda39$lambda20(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$aOR3MXjCyxxavmH3Fn-sibvjRsU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2553transferData$lambda39$lambda21(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$u4BqmC2DnKDwUPx8gaCIbdTqCb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2554transferData$lambda39$lambda22(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$xbGpxNp--wkdeAfqGRTvAhuLf44
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2555transferData$lambda39$lambda23(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$wa1LMp_Dx9_bXC_F6xO_jAnzVnM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2556transferData$lambda39$lambda24(this.f$0, uid, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$zr-UGNujQqovxiaAxA0qYFDIPqs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2557transferData$lambda39$lambda25(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$UI3usTuhGyDyQK_Bez-nMpluKGs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2558transferData$lambda39$lambda26(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$CrbEiTd6hu9rrMKg1ig73tZDdY0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2559transferData$lambda39$lambda27(this.f$0, uid, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$W4zdzPn9e3ISKLbe4yedqEHJHO0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2560transferData$lambda39$lambda28(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$SBYnZwAdkDpeD7uWacwlLTxyS88
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2561transferData$lambda39$lambda29(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$-UwcUkWP_gQT0YpGhvmcmt7GXdE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2563transferData$lambda39$lambda30(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).onErrorResumeNext(this$0.handleSyncError(uid, dataInfoWrapper)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$ZIy8r4woQhfxgh8RrC5pX_AFWjA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2564transferData$lambda39$lambda31(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$f7FYsN54PS699A-hCnOV9KVz57g
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2565transferData$lambda39$lambda32(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$xgIa-vjd-xiTtNZTXe5ayHvv-t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2566transferData$lambda39$lambda36(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$Bv8vhlvkeHdyI_IU-kI4KrABAjM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2567transferData$lambda39$lambda37(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver2SyncExecutorImpl$we6CskrzWfIM5nbY1ziNYlZJI3M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl.m2568transferData$lambda39$lambda38(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-1, reason: not valid java name */
    public static final void m2541transferData$lambda39$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2DeviceInfoCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2551transferData$lambda39$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StartAmDTPCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-3, reason: not valid java name */
    public static final void m2562transferData$lambda39$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StartAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2569transferData$lambda39$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2GetLogCountCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-5, reason: not valid java name */
    public static final void m2570transferData$lambda39$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Gen2GetLogCountCommand finished successfully.\n ", gen2DataInfo.getGen2LogsCount()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2571transferData$lambda39$lambda6(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2GetUserAndGoalsCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-7, reason: not valid java name */
    public static final void m2572transferData$lambda39$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2GetUserAndGoalsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2573transferData$lambda39$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommand(pairingConfig), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-9, reason: not valid java name */
    public static final void m2574transferData$lambda39$lambda9(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendUserPrefsAndGoalsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2542transferData$lambda39$lambda10(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLStatusCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-11, reason: not valid java name */
    public static final void m2543transferData$lambda39$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLStatusCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-12, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2544transferData$lambda39$lambda12(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLTimeCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-13, reason: not valid java name */
    public static final void m2545transferData$lambda39$lambda13(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLTimeCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-14, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2546transferData$lambda39$lambda14(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLogCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-15, reason: not valid java name */
    public static final void m2547transferData$lambda39$lambda15(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForStartLogsCount(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityStartLogCommand finished successfully.", null, 2, null);
        this$0.printStartLogs(it.getTempActivityLog().getTempStartLogs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-16, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2548transferData$lambda39$lambda16(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLogCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-17, reason: not valid java name */
    public static final void m2549transferData$lambda39$lambda17(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForEndLogsCount(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityEndLogCommand finished successfully.", null, 2, null);
        this$0.printEndLogs(it.getTempActivityLog().getTempEndLogs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-18, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2550transferData$lambda39$lambda18(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLogCommand(), uid, it, null, f * 0.3f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-20, reason: not valid java name */
    public static final void m2552transferData$lambda39$lambda20(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityDeltaLogCommand finished successfully.", null, 2, null);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gen2DataInfo, "gen2DataInfo");
        logsCountChecker.checkForDeltaLogsCount(gen2DataInfo);
        gen2DataInfo.getActivityInfo().getActivityDataLogs().addAll(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.exportActivityDataLogs(gen2DataInfo.getTempActivityLog()));
        java.util.Iterator<T> it = gen2DataInfo.getActivityInfo().getActivityDataLogs().iterator();
        while (it.hasNext()) {
            this$0.printActivityDeltaLogs(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog) it.next()).getDeltaLogs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-21, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2553transferData$lambda39$lambda21(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommand(it.getRtlData()), uid, it, null, f * 0.2f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-22, reason: not valid java name */
    public static final void m2554transferData$lambda39$lambda22(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForBackgroundLogsCount(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2BackgroundLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-23, reason: not valid java name */
    public static final void m2555transferData$lambda39$lambda23(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("---- Header start " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateStringDashed(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())) + "----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-24, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2556transferData$lambda39$lambda24(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2HeaderTraceLogCommand(), uid, it, null, 1.0f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-25, reason: not valid java name */
    public static final void m2557transferData$lambda39$lambda25(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("\n---- Header end ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2HeaderTraceLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-26, reason: not valid java name */
    public static final void m2558transferData$lambda39$lambda26(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("---- Accel data start ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-27, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2559transferData$lambda39$lambda27(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AccelDataTraceLogCommand(), uid, it, null, 1.0f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-28, reason: not valid java name */
    public static final void m2560transferData$lambda39$lambda28(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("\n---- Accel data end ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2AccelDataTraceLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-29, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2561transferData$lambda39$lambda29(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanAllLogsCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-30, reason: not valid java name */
    public static final void m2563transferData$lambda39$lambda30(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanAllLogsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-31, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2564transferData$lambda39$lambda31(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopAmDTPCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-32, reason: not valid java name */
    public static final void m2565transferData$lambda39$lambda32(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StopAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-36, reason: not valid java name */
    public static final void m2566transferData$lambda39$lambda36(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
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
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl gen2Ver2SyncExecutorImpl = this$0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Total log entries: ");
        sb.append(gen2DataInfo.getDataInfo().getActivityLogs().size());
        sb.append(" \n Sleep log entries: ");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> activityLogs = gen2DataInfo.getDataInfo().getActivityLogs();
        if (!(activityLogs instanceof java.util.Collection) || !activityLogs.isEmpty()) {
            java.util.Iterator<T> it3 = activityLogs.iterator();
            while (it3.hasNext()) {
                if (((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) it3.next()).isSleep() && (i = i + 1) < 0) {
                    kotlin.collections.CollectionsKt.throwCountOverflow();
                }
            }
        }
        sb.append(i);
        sb.append(" \n Total steps retrieved: ");
        sb.append(walkingSteps + runningSteps);
        sb.append(" \n Total number of activities retrieved: ");
        sb.append(gen2DataInfo.getDataInfo().getRunningLogs().size());
        sb.append("\nRTL timestamps: ");
        sb.append(gen2DataInfo.getRtlData());
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2Ver2SyncExecutorImpl, sb.toString(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-37, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2567transferData$lambda39$lambda37(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2DataInfo, "gen2DataInfo");
        return this$0.reformatDataLogs(gen2DataInfo).getDataInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-39$lambda-38, reason: not valid java name */
    public static final void m2568transferData$lambda39$lambda38(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver2SyncExecutorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.e(this$0.TAG, "Sync failed. Reason: ", th);
    }
}
