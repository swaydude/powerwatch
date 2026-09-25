package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0096\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J=\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0096\u0001J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J4\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00180\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingExecutor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "dataTransferExecutor", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;)V", "getKoin", "Lorg/koin/core/Koin;", "observeProgress", "Lio/reactivex/Observable;", "", "send", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "", "command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "dataInfo", "power", "", "sendAndWait", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "transferData", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "transferDataWithProgress", "Lkotlin/Pair;", "phasePower", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PairingExecutor implements powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor;

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

    public PairingExecutor(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataTransferExecutor, "dataTransferExecutor");
        this.dataTransferExecutor = dataTransferExecutor;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(final java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> observableFlatMap = powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferData$default(this.dataTransferExecutor, uid, pairingConfig, null, power * 0.8f, 4, null).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$PairingExecutor$hCCDi0pL_jNJo_gtcsEtU7k6Wk4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingExecutor.m2723transferData$lambda0(this.f$0, uid, power, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFlatMap, "dataTransferExecutor.transferData(uid, pairingConfig, power = 0.8f * power)\n                .flatMap { send(uid, SoffCommand(), it, 0.2F * power) }");
        return observableFlatMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferData$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2723transferData$lambda0(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingExecutor this$0, java.lang.String uid, float f, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "$uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.send(uid, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.SoffCommand(), it, f * 0.2f);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> transferDataWithProgress(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float phasePower) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairingConfig, "pairingConfig");
        io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> observableMerge = io.reactivex.Observable.merge(observeProgress().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$PairingExecutor$RxcDYWf4HbEBhhEwUCwk7BoHjWQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingExecutor.m2724transferDataWithProgress$lambda1((java.lang.Integer) obj);
            }
        }), powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.transferData$default(this, uid, pairingConfig, null, phasePower, 4, null).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.-$$Lambda$PairingExecutor$a5ZMaPIEYVJGVrj_vcxpd0f9R4I
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingExecutor.m2725transferDataWithProgress$lambda2((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(\n                observeProgress()\n                        .map { progress -> Pair(progress, null) },\n                transferData(uid, pairingConfig, power = phasePower)\n                        .map { data -> Pair(100, data) }\n        )");
        return observableMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-1, reason: not valid java name */
    public static final kotlin.Pair m2724transferDataWithProgress$lambda1(java.lang.Integer progress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progress, "progress");
        return new kotlin.Pair(progress, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferDataWithProgress$lambda-2, reason: not valid java name */
    public static final kotlin.Pair m2725transferDataWithProgress$lambda2(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new kotlin.Pair(100, data);
    }
}
