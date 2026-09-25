package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: LogsCountChecker.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/LogsCountChecker;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "checkForBackgroundLogsCount", "", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "checkForDeltaLogsCount", "checkForEndLogsCount", "checkForHeaderLogs", "checkForStartLogsCount", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class LogsCountChecker implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final boolean checkForStartLogsCount(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(dataInfo.getTempActivityLog().getTempStartLogs().size())) & 4294967295L;
        long activityStartLogs = dataInfo.getGen2LogsCount().getActivityStartLogs();
        if (activityStartLogs == jM107constructorimpl) {
            return true;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Number of Start Logs (" + jM107constructorimpl + ") differs from Start Logs Count in command (" + activityStartLogs + ')', null, null, 4, null);
        return false;
    }

    public final boolean checkForHeaderLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        long jM107constructorimpl = (((long) kotlin.UInt.m107constructorimpl(dataInfo.getTempActivityLog().getTempStartLogs().size())) & 4294967295L) + (4294967295L & ((long) kotlin.UInt.m107constructorimpl(dataInfo.getTempActivityLog().getTempEndLogs().size())));
        long activityHeaderLogs = dataInfo.getGen2LogsCount().getActivityHeaderLogs();
        if (activityHeaderLogs == jM107constructorimpl) {
            return true;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Number of Header Logs (" + jM107constructorimpl + ") differs from Start + End Logs Count in command (" + activityHeaderLogs + ')', null, null, 4, null);
        return false;
    }

    public final boolean checkForEndLogsCount(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(dataInfo.getTempActivityLog().getTempEndLogs().size())) & 4294967295L;
        long activityEndLog = dataInfo.getGen2LogsCount().getActivityEndLog();
        if (activityEndLog == jM107constructorimpl) {
            return true;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Number of End Logs (" + jM107constructorimpl + ") differs from End Logs Count in command (" + activityEndLog + ')', null, null, 4, null);
        return false;
    }

    public final boolean checkForDeltaLogsCount(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(dataInfo.getTempActivityLog().getTempDeltaLogs().size())) & 4294967295L;
        long activityDeltaLogs = dataInfo.getGen2LogsCount().getActivityDeltaLogs();
        if (activityDeltaLogs == jM107constructorimpl) {
            return true;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Number of Delta Logs (" + jM107constructorimpl + ") differs from Delta Logs Count in command (" + activityDeltaLogs + ')', null, null, 4, null);
        return false;
    }

    public final boolean checkForBackgroundLogsCount(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        long jM107constructorimpl = ((long) kotlin.UInt.m107constructorimpl(dataInfo.getDataInfo().getActivityLogs().size())) & 4294967295L;
        long backgroundLogs = dataInfo.getGen2LogsCount().getBackgroundLogs();
        if (backgroundLogs == jM107constructorimpl) {
            return true;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this, "Number of Background Logs (" + jM107constructorimpl + ") differs from Background Logs in command (" + backgroundLogs + ')', null, null, 4, null);
        return false;
    }
}
