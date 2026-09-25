package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver3SyncExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V", "TAG", "", "kotlin.jvm.PlatformType", "getLocationInfoProvider", "()Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "logsCountChecker", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;", "transferData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "dataInfo", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class Gen2Ver3SyncExecutorImpl extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    private final java.lang.String TAG;
    private final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2Ver3SyncExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfoProvider, "locationInfoProvider");
        this.locationInfoProvider = locationInfoProvider;
        this.TAG = getClass().getSimpleName();
        this.logsCountChecker = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider getLocationInfoProvider() {
        return this.locationInfoProvider;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, dataInfo, null, null, 55, null);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$75Ujt92TebCghkzJqHqoeqs-Ck0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2591transferData$lambda0(this.f$0, dataInfo, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$d7pGl6dljAHsj4RXaf8A3Vvq4TY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2592transferData$lambda40(this.f$0, uid, dataInfo, power, gen2DataInfo, pairingConfig, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = syncConfigPowers2Ver3\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.05F * power)\n                    .doOnNext { debug(\"Gen2DeviceInfoCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2StartAmDTPCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    .flatMap {\n                        locationInfoProvider.getLastStoredLocation().toObservable()\n                                .flatMap {\n                                    if (it.first && locationInfoProvider.isLocationValid(it.second))\n                                        sendSingleCommandWithAck(Gen2SendUserLocationCommand(it.second!!), uid, dataInfoWrapper, power = 0.05F * power)\n                                    else Observable.just(it)\n                                }\n                                .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    }\n\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3GetLogCountCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext {\n                        debug(\"Gen2Ver3GetLogCountCommand finished successfully.\\n ${it.gen2LogsCount}\")\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2GetUserAndGoalsCommandVer3(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2GetUserAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendUserPrefsAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLStatusCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLStatusCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLTimeCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLTimeCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3ActivityHeaderCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForHeaderLogs(it)\n                        debug(\"Gen2ActivityHeaderCommand finished successfully.\")\n                        printStartLogs(it.tempActivityLog.tempStartLogs)\n                        printEndLogs(it.tempActivityLog.tempEndLogs)\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3ActivityDeltaCommand(), uid, it, power = 0.3F * power) }\n                    .doOnNext { gen2DataInfo ->\n                        debug(\"Gen2ActivityDeltaLogCommand finished successfully.\")\n                        logsCountChecker.checkForDeltaLogsCount(gen2DataInfo)\n\n                        val list = gen2DataInfo.tempActivityLog.exportPaired()\n                        gen2DataInfo.activityInfo.activityDataLogs.addAll(list)\n                        gen2DataInfo.activityInfo.activityDataLogs.forEach {\n                            printActivityDeltaLogs(it.deltaLogs)\n                        }\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2BackgroundLogCommand(it.rtlData), uid, it, power = 0.2F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForBackgroundLogsCount(it)\n                        debug(\"Gen2BackgroundLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Header start ${System.currentTimeMillis().toCalendar().toDateStringDashed()}----\\n\", LogDataType.Header) }\n                    .flatMap { sendSingleCommandWithAck(Gen2HeaderTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Header end ----\\n\", LogDataType.Header)\n                        debug(\"Gen2HeaderTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Accel data start ----\\n\", LogDataType.Accel) }\n                    .flatMap { sendSingleCommandWithAck(Gen2AccelDataTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Accel data end ----\\n\", LogDataType.Accel)\n                        debug(\"Gen2AccelDataTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanAllLogsCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2CleanAllLogsCommand finished successfully.\") }\n\n                    //TODO sleep log command\n                    // if any error has occurred, send sync end command\n                    // output of this operator should be only ERROR\n                    .onErrorResumeNext(handleSyncError(uid, dataInfoWrapper))\n                    .flatMap { sendSingleCommandWithAck(Gen2StopAmDTPCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StopAmDTPCommand finished successfully.\") }\n                    .doOnNext {\n\n                        val totalSteps = it.dataInfo.activityLogs.sumBy { it.walkingSteps.toInt() }\n                        val totalRunningSteps = it.dataInfo.activityLogs.sumBy { it.runningSteps.toInt() }\n\n                        debug(\"Total log entries: ${it.dataInfo.activityLogs.size} \\n \" +\n                                \"Sleep log entries: ${it.dataInfo.activityLogs.count { it.isSleep }} \\n \" +\n                                \"Total steps retrieved: ${totalSteps + totalRunningSteps} \\n \" +\n                                \"Total number of activities retrieved: ${it.dataInfo.runningLogs.size}\\n\" +\n                                \"RTL timestamps: ${it.rtlData}\"\n                        )\n                    }\n                    .map { gen2DataInfo -> reformatDataLogs(gen2DataInfo).dataInfo }\n                    .doOnError {\n                        Log.e(TAG, \"Sync failed. Reason: \", it)\n                    }\n        }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final void m2591transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSyncProgressChannel().setTempPowersConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getSyncConfigPowers2Ver3());
        this$0.getSyncProgressChannel().reset();
        it.onNext(dataInfo);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2592transferData$lambda40(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float f, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, f * 0.05f, 0, 16, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$Iw-pqC8EvmwgLK-6ig-8ImpSnok
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2593transferData$lambda40$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$pgNKf7ibBf2WNgN84InWK2PKTEU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2604transferData$lambda40$lambda2(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$tzF77Op-zl4GYbC2CRO4TTisLIU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2614transferData$lambda40$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$xlVMa5RD2_IBafZ57DcO7ohniJ0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2622transferData$lambda40$lambda6(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$8bGFCaOQTlTZtNao6cn838ZwF9M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2625transferData$lambda40$lambda7(this.f$0, uid, dataInfoWrapper, f, obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$E4ZWWAboreasxz0_o_nGLUiLnaA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2626transferData$lambda40$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$q5C97CsGh7mVys1nQZHauRtDoO4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2627transferData$lambda40$lambda9(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$xiVFryydjxG1VRJmlIABXqFxO8E
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2594transferData$lambda40$lambda10(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$5gSZMsc-V1mIL1qhk05gAeKPL_M
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2595transferData$lambda40$lambda11(this.f$0, pairingConfig, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$TU0lUbeVlTMsvKlm_q77sUkyGRc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2596transferData$lambda40$lambda12(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$z9C2ie5Gy2AWd95s4Jhizm38ByI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2597transferData$lambda40$lambda13(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$6wZDd0jsErGUSH4cxyb8YX5vQlw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2598transferData$lambda40$lambda14(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$Y7glxglxc2M_MItIAqdYf0v0yZw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2599transferData$lambda40$lambda15(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$0KIkBHCdNRjiSQyktpjYPKwaa7E
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2600transferData$lambda40$lambda16(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$XBRz_fIzOSLcmv8G2qbyv-9X62w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2601transferData$lambda40$lambda17(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$vApiexZcXt7kVOgHtibezvSZsuU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2602transferData$lambda40$lambda18(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$Rsk-1CQgOIxBTBsDkeHmqoTaEQU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2603transferData$lambda40$lambda19(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$waNikGi5t7Ks-1Qk2fFlv8Ghs60
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2605transferData$lambda40$lambda21(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$_gJ3t9wfbLxj4XKc5afMpDKdmiM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2606transferData$lambda40$lambda22(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$VPQtbsKU4f4Dne6jFLrLFOZEU-Y
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2607transferData$lambda40$lambda23(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$NBEauGEO9F599zmDWaQwfHrhETE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2608transferData$lambda40$lambda24(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$oAV8p2DM1mlUSGd_6dDBhuznmjE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2609transferData$lambda40$lambda25(this.f$0, uid, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$ECz-PjTSYPxwk72stC_WAAMBVwY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2610transferData$lambda40$lambda26(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$dyJFVuaa0wIMGze7Y1wgF0p7xr4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2611transferData$lambda40$lambda27(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$UjEfb-0jo4Ce90IQKbn4D-eeBiQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2612transferData$lambda40$lambda28(this.f$0, uid, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$zsTf0rhnUBEdZDk6Q_V2DE5YTNc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2613transferData$lambda40$lambda29(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$Qfg2cj-IJJwdHmRRO5aYlmW0ZSA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2615transferData$lambda40$lambda30(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$meE8Yk6qlQJL7xOkRvNvbcH8_Xs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2616transferData$lambda40$lambda31(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).onErrorResumeNext(this$0.handleSyncError(uid, dataInfoWrapper)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$mTq3Y66vEWAR-pRZhuRIy9wUhiE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2617transferData$lambda40$lambda32(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$lR-0tTKne6osl2QOekJbL80fZu0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2618transferData$lambda40$lambda33(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$IdryLOXQYmucOYiP-rYoWgWMLO4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2619transferData$lambda40$lambda37(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$kFMhyclltO0H--nS5tiqDH-432Q
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2620transferData$lambda40$lambda38(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$HoCj2jH5tJBqB2ej3e6LCGzA4No
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2621transferData$lambda40$lambda39(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-1, reason: not valid java name */
    public static final void m2593transferData$lambda40$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2DeviceInfoCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2604transferData$lambda40$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StartAmDTPCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-3, reason: not valid java name */
    public static final void m2614transferData$lambda40$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StartAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2622transferData$lambda40$lambda6(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getLocationInfoProvider().getLastStoredLocation().toObservable().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$gYLCbM4r9ruyUSh1mIuU76DPBdg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2623transferData$lambda40$lambda6$lambda4(this.f$0, uid, dataInfoWrapper, f, (kotlin.Pair) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver3SyncExecutorImpl$-S0bTHH3_Kuy32NV31sYMqLccxc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl.m2624transferData$lambda40$lambda6$lambda5(this.f$0, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-6$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2623transferData$lambda40$lambda6$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, kotlin.Pair it) {
        io.reactivex.Observable observableJust;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (((java.lang.Boolean) it.getFirst()).booleanValue() && this$0.getLocationInfoProvider().isLocationValid((powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) it.getSecond())) {
            powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition = (powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition) it.getSecond();
            kotlin.jvm.internal.Intrinsics.checkNotNull(gPSPosition);
            observableJust = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserLocationCommand(gPSPosition), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
        } else {
            observableJust = io.reactivex.Observable.just(it);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(it)");
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-6$lambda-5, reason: not valid java name */
    public static final void m2624transferData$lambda40$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StartAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2625transferData$lambda40$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Ver3GetLogCountCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-8, reason: not valid java name */
    public static final void m2626transferData$lambda40$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Gen2Ver3GetLogCountCommand finished successfully.\n ", gen2DataInfo.getGen2LogsCount()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2627transferData$lambda40$lambda9(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2GetUserAndGoalsCommandVer3(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-10, reason: not valid java name */
    public static final void m2594transferData$lambda40$lambda10(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2GetUserAndGoalsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-11, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2595transferData$lambda40$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-12, reason: not valid java name */
    public static final void m2596transferData$lambda40$lambda12(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendUserPrefsAndGoalsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-13, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2597transferData$lambda40$lambda13(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLStatusCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-14, reason: not valid java name */
    public static final void m2598transferData$lambda40$lambda14(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLStatusCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-15, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2599transferData$lambda40$lambda15(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLTimeCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-16, reason: not valid java name */
    public static final void m2600transferData$lambda40$lambda16(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLTimeCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-17, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2601transferData$lambda40$lambda17(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Ver3ActivityHeaderCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-18, reason: not valid java name */
    public static final void m2602transferData$lambda40$lambda18(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForHeaderLogs(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityHeaderCommand finished successfully.", null, 2, null);
        this$0.printStartLogs(it.getTempActivityLog().getTempStartLogs());
        this$0.printEndLogs(it.getTempActivityLog().getTempEndLogs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-19, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2603transferData$lambda40$lambda19(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Ver3ActivityDeltaCommand(), uid, it, null, f * 0.3f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-21, reason: not valid java name */
    public static final void m2605transferData$lambda40$lambda21(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityDeltaLogCommand finished successfully.", null, 2, null);
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gen2DataInfo, "gen2DataInfo");
        logsCountChecker.checkForDeltaLogsCount(gen2DataInfo);
        gen2DataInfo.getActivityInfo().getActivityDataLogs().addAll(powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.exportPaired(gen2DataInfo.getTempActivityLog()));
        java.util.Iterator<T> it = gen2DataInfo.getActivityInfo().getActivityDataLogs().iterator();
        while (it.hasNext()) {
            this$0.printActivityDeltaLogs(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog) it.next()).getDeltaLogs());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-22, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2606transferData$lambda40$lambda22(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommand(it.getRtlData()), uid, it, null, f * 0.2f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-23, reason: not valid java name */
    public static final void m2607transferData$lambda40$lambda23(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForBackgroundLogsCount(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2BackgroundLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-24, reason: not valid java name */
    public static final void m2608transferData$lambda40$lambda24(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("---- Header start " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateStringDashed(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())) + "----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-25, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2609transferData$lambda40$lambda25(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2HeaderTraceLogCommand(), uid, it, null, 1.0f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-26, reason: not valid java name */
    public static final void m2610transferData$lambda40$lambda26(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("\n---- Header end ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2HeaderTraceLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-27, reason: not valid java name */
    public static final void m2611transferData$lambda40$lambda27(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("---- Accel data start ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-28, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2612transferData$lambda40$lambda28(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AccelDataTraceLogCommand(), uid, it, null, 1.0f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-29, reason: not valid java name */
    public static final void m2613transferData$lambda40$lambda29(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("\n---- Accel data end ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2AccelDataTraceLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-30, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2615transferData$lambda40$lambda30(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanAllLogsCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-31, reason: not valid java name */
    public static final void m2616transferData$lambda40$lambda31(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanAllLogsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-32, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2617transferData$lambda40$lambda32(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopAmDTPCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-33, reason: not valid java name */
    public static final void m2618transferData$lambda40$lambda33(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StopAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-37, reason: not valid java name */
    public static final void m2619transferData$lambda40$lambda37(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
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
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl gen2Ver3SyncExecutorImpl = this$0;
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
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2Ver3SyncExecutorImpl, sb.toString(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-38, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2620transferData$lambda40$lambda38(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2DataInfo, "gen2DataInfo");
        return this$0.reformatDataLogs(gen2DataInfo).getDataInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-40$lambda-39, reason: not valid java name */
    public static final void m2621transferData$lambda40$lambda39(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver3SyncExecutorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.e(this$0.TAG, "Sync failed. Reason: ", th);
    }
}
