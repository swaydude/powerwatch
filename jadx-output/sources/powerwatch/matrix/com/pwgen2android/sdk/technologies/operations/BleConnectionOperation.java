package powerwatch.matrix.com.pwgen2android.sdk.technologies.operations;

/* JADX INFO: compiled from: BleConnectionOperation.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;", "OperationInput", "OperationResult", "", "executeOperation", "input", "accessoryProvider", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "(Ljava/lang/Object;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface BleConnectionOperation<OperationInput, OperationResult> {
    OperationResult executeOperation(OperationInput input, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider);
}
