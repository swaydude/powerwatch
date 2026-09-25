package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0096\u0001J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001J3\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000bH\u0096\u0001J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J7\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001b0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u0014H\u0096\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/GenXDataTransferExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "dataTransferExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;)V", "getKoin", "Lorg/koin/core/Koin;", "observeProgress", "Lio/reactivex/Observable;", "", "send", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "", "command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "dataInfo", "power", "", "sendAndWait", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "transferData", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "transferDataWithProgress", "Lkotlin/Pair;", "phasePower", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class GenXDataTransferExecutor implements powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor dataTransferExecutor;

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return this.dataTransferExecutor.getKoin();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<java.lang.Integer> observeProgress() {
        return this.dataTransferExecutor.observeProgress();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> send(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        return this.dataTransferExecutor.send(uid, command, dataInfo, power);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> sendAndWait(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power, int timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(command, "command");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        return this.dataTransferExecutor.sendAndWait(uid, command, dataInfo, power, timeout);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> transferDataWithProgress(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float phasePower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        return this.dataTransferExecutor.transferDataWithProgress(uid, pairingConfig, phasePower);
    }

    public GenXDataTransferExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor dataTransferExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataTransferExecutor, "dataTransferExecutor");
        this.dataTransferExecutor = dataTransferExecutor;
        dataTransferExecutor.setProtocolType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X);
    }

    public /* synthetic */ GenXDataTransferExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor baseDataTransferExecutor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor(communicator) : baseDataTransferExecutor);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchInfoRequest(), null, power * 0.1f, 15, 4, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$wdT82o7ZUr9ZvKnICkDXr3gvr-8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2710transferData$lambda0(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$rZ8K3bB0oNQkhbHSjxxw0OtYBPM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2711transferData$lambda1(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$N6iNuDWNDlnv4jaltIrR2Fa-VuE
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2715transferData$lambda2(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$0wrL-WdzaGiJmpIUVMV0OaZ9YOc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2716transferData$lambda3(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$CaW0YmIHyCsTNG0nDT3wj7E6nwI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2717transferData$lambda4(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$_S84Cglk-O9GJYXUuMcwErepxxk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2718transferData$lambda5(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$yldWO3r96bquJqgQZF8LqTXA6T8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2719transferData$lambda6(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$9WvcIIalpjO4UEOmuGcKJGcLwnM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2720transferData$lambda7(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$ZhPIbR_XhvIiNgJWFzDwVgtGKa4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2721transferData$lambda8(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$5g5jEU9LQD7vOFvyPihd0J24IZM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2722transferData$lambda9(this.f$0, uid, pairingConfig, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$icyXRLFd-UYx_MZd5hL4ZMotgpw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2712transferData$lambda10(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$oPWiEc6wYVw1ku9HOIcI-osVcJs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2713transferData$lambda11(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$GenXDataTransferExecutor$9-yz4F0_fTLuY_IVBYYI3o4wqsc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor.m2714transferData$lambda12(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "sendAndWait(uid, WatchInfoRequest(), power = 0.1f * power, timeout = 15)\n                .flatMap { send(uid, WriteUTCWithTimezone(), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, GetWrittenDataRequest(), it, 0.1f * power) }\n                .flatMap { send(uid, WriteHourFormat(pairingConfig.unitsInfoData.twelveHourFormat), it, 0.05f * power) }\n                .flatMap { send(uid, WriteUnitsFormat(pairingConfig.unitsInfoData.metricsFormat), it, 0.05f * power) }\n                .flatMap { send(uid, WriteUserInfoData(pairingConfig.userInfoData), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, ReadUserInfoData(), it, 0.1f * power) }\n\n                .flatMap { send(uid, WriteStepsGoalCommand(pairingConfig.goalInfoData.stepsGoal), it, 0.05f * power) }\n                .flatMap { send(uid, WriteCaloriesGoalCommand(pairingConfig.goalInfoData.caloriesGoal), it, 0.05f * power) }\n                .flatMap { send(uid, WriteDistanceGoalCommand(pairingConfig.goalInfoData.distanceGoal), it, 0.05f * power) }\n                .flatMap { send(uid, WriteSleepGoalCommand(pairingConfig.goalInfoData.sleepGoal), it, 0.05f * power) }\n                .flatMap { sendAndWait(uid, ReadGoalsCommand(), it, 0.1f * power) }\n\n                .flatMap { send(uid, WritePairCodeCommand(), it, 0.1f * power) }\n                .flatMap { send(uid, WriteSaveDataCommand(), it, 0.1f * power) }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2710transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteUTCWithTimezone(), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-1, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2711transferData$lambda1(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.GetWrittenDataRequest(), it, f * 0.1f, 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2715transferData$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteHourFormat(pairingConfig.getUnitsInfoData().getTwelveHourFormat()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2716transferData$lambda3(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteUnitsFormat(pairingConfig.getUnitsInfoData().getMetricsFormat()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2717transferData$lambda4(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteUserInfoData(pairingConfig.getUserInfoData()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2718transferData$lambda5(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ReadUserInfoData(), it, f * 0.1f, 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2719transferData$lambda6(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteStepsGoalCommand(pairingConfig.getGoalInfoData().getStepsGoal()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2720transferData$lambda7(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteCaloriesGoalCommand(pairingConfig.getGoalInfoData().getCaloriesGoal()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2721transferData$lambda8(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteDistanceGoalCommand(pairingConfig.getGoalInfoData().getDistanceGoal()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2722transferData$lambda9(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "$pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteSleepGoalCommand(pairingConfig.getGoalInfoData().getSleepGoal()), it, f * 0.05f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2712transferData$lambda10(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this$0, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ReadGoalsCommand(), it, f * 0.1f, 0, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-11, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2713transferData$lambda11(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WritePairCodeCommand(0, 1, null), it, f * 0.1f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-12, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2714transferData$lambda12(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.GenXDataTransferExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WriteSaveDataCommand(), it, f * 0.1f);
    }
}
