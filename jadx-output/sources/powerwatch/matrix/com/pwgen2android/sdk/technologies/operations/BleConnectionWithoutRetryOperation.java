package powerwatch.matrix.com.pwgen2android.sdk.technologies.operations;

/* JADX INFO: compiled from: BleConnectionWithoutRetryOperation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithoutRetryOperation;", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;", "Lcom/polidea/rxandroidble2/RxBleDevice;", "Lio/reactivex/Observable;", "Lcom/polidea/rxandroidble2/RxBleConnection;", "()V", "executeOperation", "input", "accessoryProvider", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleConnectionWithoutRetryOperation implements powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation<com.polidea.rxandroidble2.RxBleDevice, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection>> {
    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> executeOperation(final com.polidea.rxandroidble2.RxBleDevice input, final powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryProvider, "accessoryProvider");
        io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> observableOnErrorResumeNext = input.establishConnection(false).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.-$$Lambda$BleConnectionWithoutRetryOperation$2HRz4bi7oLMg0pkviBT7djzwt88
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionWithoutRetryOperation.m2771executeOperation$lambda0(accessoryProvider, input, (java.lang.Throwable) obj);
            }
        }).onErrorResumeNext(io.reactivex.Observable.empty());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "input.establishConnection(false)\n                .doOnError {\n                    accessoryProvider.clear(input.macAddress)\n                }\n                .onErrorResumeNext(Observable.empty())");
        return observableOnErrorResumeNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOperation$lambda-0, reason: not valid java name */
    public static final void m2771executeOperation$lambda0(powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider, com.polidea.rxandroidble2.RxBleDevice input, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryProvider, "$accessoryProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "$input");
        java.lang.String macAddress = input.getMacAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(macAddress, "input.macAddress");
        accessoryProvider.clear(macAddress);
    }
}
