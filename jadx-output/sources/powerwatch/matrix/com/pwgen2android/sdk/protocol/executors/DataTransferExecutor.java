package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J2\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rH&J<\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H&J2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\rH&J6\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00140\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\rH&¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/DataTransferExecutor;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "observeProgress", "Lio/reactivex/Observable;", "", "send", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "uid", "", "command", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Command;", "dataInfo", "power", "", "sendAndWait", com.polidea.rxandroidble2.ClientComponent.NamedSchedulers.TIMEOUT, "transferData", "pairingConfig", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/PairingConfig;", "transferDataWithProgress", "Lkotlin/Pair;", "phasePower", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface DataTransferExecutor extends powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    io.reactivex.Observable<java.lang.Integer> observeProgress();

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> send(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power);

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> sendAndWait(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power, int timeout);

    io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo> transferData(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float power);

    io.reactivex.Observable<kotlin.Pair<java.lang.Integer, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo>> transferDataWithProgress(java.lang.String uid, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float phasePower);

    /* JADX INFO: compiled from: Executors.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static org.koin.core.Koin getKoin(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataTransferExecutor, "this");
            return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(dataTransferExecutor);
        }

        public static /* synthetic */ io.reactivex.Observable transferData$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float f, int i, java.lang.Object obj) {
            if (obj == null) {
                return dataTransferExecutor.transferData(str, pairingConfig, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(str, null, null, null, 0, null, 62, null), 0.0f, null, null, null, 0L, null, 507, null) : dataInfo, (i & 8) != 0 ? 1.0f : f);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transferData");
        }

        public static /* synthetic */ io.reactivex.Observable sendAndWait$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float f, int i, int i2, java.lang.Object obj) {
            if (obj == null) {
                return dataTransferExecutor.sendAndWait(str, command, (i2 & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(str, null, null, null, 0, null, 62, null), 0.0f, null, null, null, 0L, null, 507, null) : dataInfo, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? 8 : i);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAndWait");
        }

        public static /* synthetic */ io.reactivex.Observable send$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Command command, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, float f, int i, java.lang.Object obj) {
            if (obj == null) {
                return dataTransferExecutor.send(str, command, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(str, null, null, null, 0, null, 62, null), 0.0f, null, null, null, 0L, null, 507, null) : dataInfo, (i & 8) != 0 ? 1.0f : f);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }

        public static /* synthetic */ io.reactivex.Observable transferDataWithProgress$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.DataTransferExecutor dataTransferExecutor, java.lang.String str, powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.PairingConfig pairingConfig, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transferDataWithProgress");
            }
            if ((i & 4) != 0) {
                f = 1.0f;
            }
            return dataTransferExecutor.transferDataWithProgress(str, pairingConfig, f);
        }
    }
}
