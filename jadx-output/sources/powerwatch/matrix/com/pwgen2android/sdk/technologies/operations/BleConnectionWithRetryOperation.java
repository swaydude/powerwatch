package powerwatch.matrix.com.pwgen2android.sdk.technologies.operations;

/* JADX INFO: compiled from: BleConnectionWithRetryOperation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;", "Lcom/polidea/rxandroidble2/RxBleDevice;", "Lio/reactivex/Observable;", "Lcom/polidea/rxandroidble2/RxBleConnection;", "connectionPreference", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;)V", "executeOperation", "input", "accessoryProvider", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleConnectionWithRetryOperation implements powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation<com.polidea.rxandroidble2.RxBleDevice, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection>> {
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference;

    public BleConnectionWithRetryOperation(powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPreference, "connectionPreference");
        this.connectionPreference = connectionPreference;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation
    public io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> executeOperation(com.polidea.rxandroidble2.RxBleDevice input, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryProvider, "accessoryProvider");
        io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection> observableEstablishConnection = input.establishConnection(this.connectionPreference.isAutoConnectEnabled());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableEstablishConnection, "input.establishConnection(connectionPreference.isAutoConnectEnabled())");
        return observableEstablishConnection;
    }
}
