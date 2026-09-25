package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0096\u0001J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096\u0001J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0096\u0001J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J4\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u001c0\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2DeviceInfoExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "dataTransferExecutor", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;)V", "getKoin", "Lorg/koin/core/Koin;", "observeProgress", "Lio/reactivex/Observable;", "", "readInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "", "send", "command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "dataInfo", "power", "", "sendAndWait", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "transferData", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "transferDataWithProgress", "Lkotlin/Pair;", "phasePower", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2DeviceInfoExecutor implements powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
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

    public Gen2DeviceInfoExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor dataTransferExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataTransferExecutor, "dataTransferExecutor");
        this.communicator = communicator;
        this.dataTransferExecutor = dataTransferExecutor;
        dataTransferExecutor.setProtocolType(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS);
    }

    public /* synthetic */ Gen2DeviceInfoExecutor(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor baseDataTransferExecutor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.BaseDataTransferExecutor(communicator) : baseDataTransferExecutor);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), dataInfo, power, 0, 16, null);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> readInfo(java.lang.String uid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.sendAndWait$default(this, uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DeviceInfoCommand(), null, 0.0f, 0, 28, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2DeviceInfoExecutor$fb5j83thdnAkU1pSyfrTIShkqlU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2DeviceInfoExecutor.m2352readInfo$lambda0((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "sendAndWait(uid, Gen2DeviceInfoCommand())\n                .flatMap {\n                    if (!it.data.isFirmwareVersionValid()) Observable.error(InvalidVersionThrowable(it))\n                    else Observable.just(it)\n                }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readInfo$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2352readInfo$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.CommandsKt.isFirmwareVersionValid(it.getData()) ? io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable(it)) : io.reactivex.Observable.just(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> transferDataWithProgress(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float phasePower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> observableMerge = io.reactivex.Observable.merge(observeProgress().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2DeviceInfoExecutor$XYcCnWc4N0O6B4dV9agYsmTiytg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2DeviceInfoExecutor.m2353transferDataWithProgress$lambda1((java.lang.Integer) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferData$default(this, uid, pairingConfig, null, phasePower, 4, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$Gen2DeviceInfoExecutor$KprHRL2Xe7F3g4Qm6ftZGeHqNW8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2DeviceInfoExecutor.m2354transferDataWithProgress$lambda2((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(\n                observeProgress()\n                        .map { progress -> Pair(progress, null) },\n                transferData(uid, pairingConfig, power = phasePower)\n\n                        .map { data -> Pair(100, data) }\n        )");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-1, reason: not valid java name */
    public static final kotlin.Pair m2353transferDataWithProgress$lambda1(java.lang.Integer progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        return new kotlin.Pair(progress, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-2, reason: not valid java name */
    public static final kotlin.Pair m2354transferDataWithProgress$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new kotlin.Pair(100, data);
    }
}
