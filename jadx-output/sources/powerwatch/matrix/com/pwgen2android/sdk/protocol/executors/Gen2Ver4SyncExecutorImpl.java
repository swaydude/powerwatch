package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Ver4SyncExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "locationInfoProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;)V", "TAG", "", "kotlin.jvm.PlatformType", "getLocationInfoProvider", "()Lpowerwatch/matrix/com/pwgen2android/shared/host/LocationInfoProvider;", "logsCountChecker", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;", "transferData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "dataInfo", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class Gen2Ver4SyncExecutorImpl extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    private final java.lang.String TAG;
    private final powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2Ver4SyncExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.host.LocationInfoProvider locationInfoProvider) {
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
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$iPz8LOThkstNfprVoXx6_QyCQUA
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2641transferData$lambda0(this.f$0, dataInfo, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$p3ifsTyYtTY5krgbjZv-34eipt4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2642transferData$lambda42(this.f$0, uid, dataInfo, power, gen2DataInfo, pairingConfig, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = syncConfigPowers2Ver3\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.05F * power)\n                    .doOnNext { debug(\"Gen2DeviceInfoCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2StartAmDTPCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    .flatMap {\n                        locationInfoProvider.getLastStoredLocation().toObservable()\n                                .flatMap {\n                                    if (it.first && locationInfoProvider.isLocationValid(it.second))\n                                        sendSingleCommandWithAck(Gen2SendUserLocationCommand(it.second!!), uid, dataInfoWrapper, power = 0.05F * power)\n                                    else Observable.just(it)\n                                }\n                                .doOnNext { debug(\"Gen2StartAmDTPCommand finished successfully.\") }\n\n                    }\n\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3GetLogCountCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext {\n                        debug(\"Gen2Ver3GetLogCountCommand finished successfully.\\n ${it.gen2LogsCount}\")\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2GetUserAndGoalsCommandVer3(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2GetUserAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2SendUserPrefsAndGoalsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLStatusCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLStatusCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(RTLTimeCommand(), uid, dataInfoWrapper, power = 0.05F * power) }\n                    .doOnNext { debug(\"RTLTimeCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3ActivityHeaderCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForHeaderLogs(it)\n                        debug(\"Gen2ActivityHeaderCommand finished successfully.\")\n                        printStartLogs(it.tempActivityLog.tempStartLogs)\n                        printEndLogs(it.tempActivityLog.tempEndLogs)\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2Ver3ActivityDeltaCommand(), uid, it, power = 0.3F * power) }\n                    .doOnNext { gen2DataInfo ->\n                        debug(\"Gen2ActivityDeltaLogCommand finished successfully.\")\n                        logsCountChecker.checkForDeltaLogsCount(gen2DataInfo)\n\n                        val list = gen2DataInfo.tempActivityLog.exportPaired()\n                        gen2DataInfo.activityInfo.activityDataLogs.addAll(list)\n                        gen2DataInfo.activityInfo.activityDataLogs.forEach {\n                            printActivityDeltaLogs(it.deltaLogs)\n                        }\n                    }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2BackgroundLogCommand(it.rtlData), uid, it, power = 0.2F * power) }\n                    .doOnNext {\n                        logsCountChecker.checkForBackgroundLogsCount(it)\n                        debug(\"Gen2BackgroundLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Header start ${System.currentTimeMillis().toCalendar().toDateStringDashed()}----\\n\", LogDataType.Header) }\n                    .flatMap { sendSingleCommandWithAck(Gen2HeaderTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Header end ----\\n\", LogDataType.Header)\n                        debug(\"Gen2HeaderTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .doOnNext { traceLogger.log(\"---- Accel data start ----\\n\", LogDataType.Accel) }\n                    .flatMap { sendSingleCommandWithAck(Gen2AccelDataTraceLogCommand(), uid, it, power = 1f) }\n                    .doOnNext {\n                        traceLogger.log(\"\\n---- Accel data end ----\\n\", LogDataType.Accel)\n                        debug(\"Gen2AccelDataTraceLogCommand finished successfully.\")\n                    }\n\n\n                    .flatMap { sendSingleCommandWithAck(Gen2CleanAllLogsCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2CleanAllLogsCommand finished successfully.\") }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ErrorLogCommand(), uid, it, power = 0.025F * power) }\n                    .doOnNext { debug(\"Gen2ErrorLogCommand finished successfully.\") }\n\n\n                    //TODO sleep log command\n                    // if any error has occurred, send sync end command\n                    // output of this operator should be only ERROR\n                    .onErrorResumeNext(handleSyncError(uid, dataInfoWrapper))\n                    .flatMap { sendSingleCommandWithAck(Gen2StopAmDTPCommand(), uid, it, power = 0.05F * power) }\n                    .doOnNext { debug(\"Gen2StopAmDTPCommand finished successfully.\") }\n                    .doOnNext {\n\n                        val totalSteps = it.dataInfo.activityLogs.sumBy { it.walkingSteps.toInt() }\n                        val totalRunningSteps = it.dataInfo.activityLogs.sumBy { it.runningSteps.toInt() }\n\n                        debug(\"Total log entries: ${it.dataInfo.activityLogs.size} \\n \" +\n                                \"Sleep log entries: ${it.dataInfo.activityLogs.count { it.isSleep }} \\n \" +\n                                \"Total steps retrieved: ${totalSteps + totalRunningSteps} \\n \" +\n                                \"Total number of activities retrieved: ${it.dataInfo.runningLogs.size}\\n\" +\n                                \"RTL timestamps: ${it.rtlData}\"\n                        )\n                    }\n                    .map { gen2DataInfo -> reformatDataLogs(gen2DataInfo).dataInfo }\n                    .doOnError {\n                        Log.e(TAG, \"Sync failed. Reason: \", it)\n                    }\n        }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final void m2641transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSyncProgressChannel().setTempPowersConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getSyncConfigPowers2Ver3());
        this$0.getSyncProgressChannel().reset();
        it.onNext(dataInfo);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2642transferData$lambda42(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float f, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, f * 0.05f, 0, 16, null).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$ZovTXbUSnulQkVUFLUCVu7AWKC0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2643transferData$lambda42$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$EmFAXK38GyTNCA4f2ZhQFRxC3AQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2654transferData$lambda42$lambda2(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$3mLE3fnd9ez1WpcRWnZxG6U7Lmk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2664transferData$lambda42$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$1zjjF8wd1c_k5x1UBxUOwKkx6Y0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2674transferData$lambda42$lambda6(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$MUOFxD34LlOuA6zaSCmohsz1Dfo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2677transferData$lambda42$lambda7(this.f$0, uid, dataInfoWrapper, f, obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$4k-J07mOehPm67xw982AgmhVQXA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2678transferData$lambda42$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$rDJyb84-tJlEw8581FKwLh6FIoQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2679transferData$lambda42$lambda9(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$grcit7KB73xn1eDjZ7qiCojwbaE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2644transferData$lambda42$lambda10(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$A_PIUTfLbJXfPD8TjGH6Y3YtCNc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2645transferData$lambda42$lambda11(this.f$0, pairingConfig, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$OkmWFqkLkRuO2Yc-IgOM554gnas
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2646transferData$lambda42$lambda12(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$TvB94u9fTBHESzaiROB3x6Zz7Do
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2647transferData$lambda42$lambda13(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$TBjzraXjwm3pKvLgPvq1MvAI7wQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2648transferData$lambda42$lambda14(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$epL3VNBHxAZumlulvqU_3mzmuCY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2649transferData$lambda42$lambda15(this.f$0, uid, dataInfoWrapper, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$ar_GRrTZ0Jl4gBwsJAi_0oiu9rg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2650transferData$lambda42$lambda16(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$gREWA2ENJ-7FyUrptRW1Jw8g-JY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2651transferData$lambda42$lambda17(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$5Wh7aF975BVglojDvEf-HsWgIE8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2652transferData$lambda42$lambda18(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$7p-wM2RQRoV0v5_CSsV-rrWLWDU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2653transferData$lambda42$lambda19(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$pVmXNK5vcejjj6r_NKYUx7C2O7c
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2655transferData$lambda42$lambda21(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$UmbZxjVmtjgrnEaIcWwAhuiyyYs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2656transferData$lambda42$lambda22(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$_bVRZ8H0s0iFD8opbzLJ_qJ-t0U
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2657transferData$lambda42$lambda23(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$s2N_RgVv6FYGokDRdhMpCI5sD4s
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2658transferData$lambda42$lambda24(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$eSKfB-7yVf-DjzSApRPnJ_pHy8w
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2659transferData$lambda42$lambda25(this.f$0, uid, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$kYjSX6pf23IBBZDdii3KQdJdOag
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2660transferData$lambda42$lambda26(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$LUNJV8FrME4hTFu5AsdKPToru4w
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2661transferData$lambda42$lambda27(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$pRSEkcJgnIKZpIbB8CbNow6xqMM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2662transferData$lambda42$lambda28(this.f$0, uid, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$pzQxr2L5_esGdyWL9pWRDi2fNlA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2663transferData$lambda42$lambda29(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$Z3cqzrPQJe-F5msCbhCj8xwgFgw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2665transferData$lambda42$lambda30(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$aav9nQkN2v15v7xtNQiuf44HiM0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2666transferData$lambda42$lambda31(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$QzOdZy2m6Dqv1UuN6_nAdW-ohY4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2667transferData$lambda42$lambda32(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$7EHOvgDezo0C9Hfhr3HU8RfKpq8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2668transferData$lambda42$lambda33(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).onErrorResumeNext(this$0.handleSyncError(uid, dataInfoWrapper)).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$r3VfhpfvrtKvX4ygWfhe6IOlyks
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2669transferData$lambda42$lambda34(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$YDGrDCreyoaLif2ap4m-gdPbTN0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2670transferData$lambda42$lambda35(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$AK-fdQaq2_7sg5ixt5DEEdl0yzc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2671transferData$lambda42$lambda39(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$RzaEwswSdh9ZerxLeaK_EhgtjjM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2672transferData$lambda42$lambda40(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$aIGTHxyvAzm0a5hrpkpejPtRqvw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2673transferData$lambda42$lambda41(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-1, reason: not valid java name */
    public static final void m2643transferData$lambda42$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2DeviceInfoCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2654transferData$lambda42$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StartAmDTPCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-3, reason: not valid java name */
    public static final void m2664transferData$lambda42$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StartAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2674transferData$lambda42$lambda6(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, final float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.getLocationInfoProvider().getLastStoredLocation().toObservable().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$k9iEZhAlOfvvDJSBQVKxjQ47Kcw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2675transferData$lambda42$lambda6$lambda4(this.f$0, uid, dataInfoWrapper, f, (kotlin.Pair) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2Ver4SyncExecutorImpl$onhTefiQKGO5kIh8qPUTnOM7SX4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl.m2676transferData$lambda42$lambda6$lambda5(this.f$0, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-6$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2675transferData$lambda42$lambda6$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, kotlin.Pair it) {
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
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-6$lambda-5, reason: not valid java name */
    public static final void m2676transferData$lambda42$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StartAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2677transferData$lambda42$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Ver3GetLogCountCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-8, reason: not valid java name */
    public static final void m2678transferData$lambda42$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Gen2Ver3GetLogCountCommand finished successfully.\n ", gen2DataInfo.getGen2LogsCount()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2679transferData$lambda42$lambda9(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2GetUserAndGoalsCommandVer3(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-10, reason: not valid java name */
    public static final void m2644transferData$lambda42$lambda10(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2GetUserAndGoalsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-11, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2645transferData$lambda42$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserPrefsAndGoalsCommandVer3(pairingConfig), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-12, reason: not valid java name */
    public static final void m2646transferData$lambda42$lambda12(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendUserPrefsAndGoalsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-13, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2647transferData$lambda42$lambda13(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLStatusCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-14, reason: not valid java name */
    public static final void m2648transferData$lambda42$lambda14(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLStatusCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-15, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2649transferData$lambda42$lambda15(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfoWrapper, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfoWrapper, "$dataInfoWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLTimeCommand(), uid, dataInfoWrapper, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-16, reason: not valid java name */
    public static final void m2650transferData$lambda42$lambda16(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "RTLTimeCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-17, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2651transferData$lambda42$lambda17(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Ver3ActivityHeaderCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-18, reason: not valid java name */
    public static final void m2652transferData$lambda42$lambda18(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForHeaderLogs(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ActivityHeaderCommand finished successfully.", null, 2, null);
        this$0.printStartLogs(it.getTempActivityLog().getTempStartLogs());
        this$0.printEndLogs(it.getTempActivityLog().getTempEndLogs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-19, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2653transferData$lambda42$lambda19(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2Ver3ActivityDeltaCommand(), uid, it, null, f * 0.3f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-21, reason: not valid java name */
    public static final void m2655transferData$lambda42$lambda21(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
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
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-22, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2656transferData$lambda42$lambda22(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2BackgroundLogCommand(it.getRtlData()), uid, it, null, f * 0.2f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-23, reason: not valid java name */
    public static final void m2657transferData$lambda42$lambda23(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.LogsCountChecker logsCountChecker = this$0.logsCountChecker;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        logsCountChecker.checkForBackgroundLogsCount(it);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2BackgroundLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-24, reason: not valid java name */
    public static final void m2658transferData$lambda42$lambda24(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("---- Header start " + powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toDateStringDashed(powerwatch.matrix.com.pwgen2android.shared.extensions.DateTimeExtensionsKt.toCalendar(java.lang.System.currentTimeMillis())) + "----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-25, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2659transferData$lambda42$lambda25(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2HeaderTraceLogCommand(), uid, it, null, 1.0f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-26, reason: not valid java name */
    public static final void m2660transferData$lambda42$lambda26(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("\n---- Header end ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header.INSTANCE);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2HeaderTraceLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-27, reason: not valid java name */
    public static final void m2661transferData$lambda42$lambda27(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("---- Accel data start ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-28, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2662transferData$lambda42$lambda28(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2AccelDataTraceLogCommand(), uid, it, null, 1.0f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-29, reason: not valid java name */
    public static final void m2663transferData$lambda42$lambda29(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getTraceLogger().log("\n---- Accel data end ----\n", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel.INSTANCE);
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2AccelDataTraceLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-30, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2665transferData$lambda42$lambda30(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2CleanAllLogsCommand(), uid, it, null, f * 0.025f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-31, reason: not valid java name */
    public static final void m2666transferData$lambda42$lambda31(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2CleanAllLogsCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-32, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2667transferData$lambda42$lambda32(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ErrorLogCommand(), uid, it, null, f * 0.025f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-33, reason: not valid java name */
    public static final void m2668transferData$lambda42$lambda33(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2ErrorLogCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-34, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2669transferData$lambda42$lambda34(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopAmDTPCommand(), uid, it, null, f * 0.05f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-35, reason: not valid java name */
    public static final void m2670transferData$lambda42$lambda35(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2StopAmDTPCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-39, reason: not valid java name */
    public static final void m2671transferData$lambda42$lambda39(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
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
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl gen2Ver4SyncExecutorImpl = this$0;
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
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(gen2Ver4SyncExecutorImpl, sb.toString(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-40, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2672transferData$lambda42$lambda40(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2DataInfo, "gen2DataInfo");
        return this$0.reformatDataLogs(gen2DataInfo).getDataInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-42$lambda-41, reason: not valid java name */
    public static final void m2673transferData$lambda42$lambda41(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Ver4SyncExecutorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.e(this$0.TAG, "Sync failed. Reason: ", th);
    }
}
