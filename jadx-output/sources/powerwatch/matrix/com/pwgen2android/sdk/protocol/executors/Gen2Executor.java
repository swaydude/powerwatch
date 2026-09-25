package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Gen2Executor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2Executor;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Gen2Executor extends powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor {

    /* JADX INFO: compiled from: Gen2Executor.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static org.koin.core.Koin getKoin(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2Executor gen2Executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2Executor, "this");
            return powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor.DefaultImpls.getKoin(gen2Executor);
        }
    }
}
