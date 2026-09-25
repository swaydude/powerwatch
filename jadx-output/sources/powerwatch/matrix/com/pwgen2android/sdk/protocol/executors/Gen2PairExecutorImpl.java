package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2PairExecutorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2ExecutorImpl;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;)V", "transferData", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "dataInfo", "power", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2PairExecutorImpl extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gen2PairExecutorImpl(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator) {
        super(communicator);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$XLm7gP0AUO81mUqlkDfB8hQ-Ltw
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2496transferData$lambda0(this.f$0, dataInfo, observableEmitter);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$m20blTbUydhiANbnhZ2SuJ2l-5A
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2497transferData$lambda12(this.f$0, uid, dataInfo, power, pairingConfig, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "create<DataInfo> {\n            syncProgressChannel.tempPowersConfig = pairConfigPowers\n            syncProgressChannel.reset()\n            it.onNext(dataInfo)\n            it.onComplete()\n        }.flatMap {\n            sendAndWait(uid, Gen2DeviceInfoCommand(), dataInfo = dataInfo, power = 0.1F * power)\n\n                    .flatMap { sendSingleCommandWithAck(Gen2StartPairingCommand(), uid, Gen2DataInfo(dataInfo = it), power = 0.1F * power) }\n\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveUserInformationCommand(), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendUserInformationCommand(pairingConfig.unitsInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendBiometricsCommand(pairingConfig.userInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendLanguageCommand(pairingConfig.languageInfoData.locale), uid, it, power = 0.1F * power) }\n                    .doOnNext { debug(\"Gen2SendLanguageCommand finished successfully.\") }\n                    .flatMap { sendSingleCommandWithAck(Gen2ReceiveStepsDistanceGoals(), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendStepsDistanceGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2SendCaloriesSleepGoal(pairingConfig.goalInfoData), uid, it, power = 0.1F * power) }\n                    .flatMap { sendSingleCommandWithAck(Gen2StopPairingCommand(), uid, it, power = 0.1F * power) }\n                    .map { it.dataInfo }\n        }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final void m2496transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.getSyncProgressChannel().setTempPowersConfig(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.SyncProgressChannelKt.getPairConfigPowers());
        this$0.getSyncProgressChannel().reset();
        it.onNext(dataInfo);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2497transferData$lambda12(final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float f, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "$dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, f * 0.1f, 0, 16, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$ZwqI_uZz2hq2xxcu2G_GpthCOBs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2498transferData$lambda12$lambda1(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$lwx8JPk4vGKo2_A222rgHKXoD1g
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2501transferData$lambda12$lambda2(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$1pv-qWTDWdg5HwHB2dUWWvymbL0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2502transferData$lambda12$lambda3(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$ysD19o9tWoIuo-vb93Ujapm7cnY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2503transferData$lambda12$lambda4(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$zDrYSn8cDcmayVUaqPC7zEnIcrE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2504transferData$lambda12$lambda5(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$4M7YoZ_LyNxz1LBneCve3N0Jfdk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2505transferData$lambda12$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$LxaRgECsLluK9hemP6Tf4jQ_50Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2506transferData$lambda12$lambda7(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$8jy3T7rNjzKWKXWdUsse7qGZy7c
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2507transferData$lambda12$lambda8(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$ri5mt3BmzHe_r-se2P64F-wVHtM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2508transferData$lambda12$lambda9(this.f$0, pairingConfig, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$_d7qA21r_AMdlfvk04tJOubJVjQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2499transferData$lambda12$lambda10(this.f$0, uid, f, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2PairExecutorImpl$sls6pv_BpbdQlud0PJ5NldsOIjU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl.m2500transferData$lambda12$lambda11((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2498transferData$lambda12$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StartPairingCommand(), uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(null, null, null, it, null, null, 55, null), null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2501transferData$lambda12$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ReceiveUserInformationCommand(), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2502transferData$lambda12$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendUserInformationCommand(pairingConfig.getUnitsInfoData()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2503transferData$lambda12$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendBiometricsCommand(pairingConfig.getUserInfoData()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2504transferData$lambda12$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendLanguageCommand(pairingConfig.getLanguageInfoData().getLocale()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-6, reason: not valid java name */
    public static final void m2505transferData$lambda12$lambda6(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Gen2SendLanguageCommand finished successfully.", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2506transferData$lambda12$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ReceiveStepsDistanceGoals(), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2507transferData$lambda12$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendStepsDistanceGoal(pairingConfig.getGoalInfoData()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2508transferData$lambda12$lambda9(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SendCaloriesSleepGoal(pairingConfig.getGoalInfoData()), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2499transferData$lambda12$lambda10(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2PairExecutorImpl this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2ExecutorImpl.sendSingleCommandWithAck$default(this$0, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2StopPairingCommand(), uid, it, null, f * 0.1f, 0L, null, 104, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo m2500transferData$lambda12$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getDataInfo();
    }
}
