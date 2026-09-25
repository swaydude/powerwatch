package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WatchEntryToLogFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToSleepFormatter;", "", "()V", "format", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/SleepLog;", "watchLogEntries", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;", "lastEntryTime", "", "logInterval", "isGen2", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchEntryToSleepFormatter {
    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> format(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> watchLogEntries, long lastEntryTime, long logInterval, boolean isGen2) {
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchLogEntries, "watchLogEntries");
        int i = isGen2 ? 1 : 1000;
        java.util.List listReversed = kotlin.collections.CollectionsKt.reversed(watchLogEntries);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listReversed, 10));
        int i2 = 0;
        for (java.lang.Object obj : listReversed) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) obj;
            long timestamp = watchLogEntry.getTimestamp();
            long j = ((long) 60000) + timestamp;
            if (!isGen2) {
                j = lastEntryTime - (((long) i2) * logInterval);
                timestamp = j - logInterval;
            }
            long j2 = timestamp;
            long j3 = j;
            if (watchLogEntry.isSleep()) {
                int state = watchLogEntry.getState();
                if (state == 1) {
                    sleepType = powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.RESTLESS;
                } else if (state == 3) {
                    sleepType = powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.LIGHT;
                } else if (state == 5) {
                    sleepType = powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.DEEP;
                } else {
                    sleepType = powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType.SLEEP_AWAKE;
                }
                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType2 = sleepType;
                int iRoundToInt = kotlin.math.MathKt.roundToInt((j3 - j2) / ((double) 60000));
                int activeCalories = watchLogEntry.getActiveCalories() * i;
                int bmrCalories = watchLogEntry.getBmrCalories() * i;
                sleepLog = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog(j2, j3, watchLogEntry.getPulseCount(), watchLogEntry.getWatchPowerLog().getThermalGen(), watchLogEntry.getWatchPowerLog().getSolarGen(), watchLogEntry.getWatchPowerLog().getSkinTemp(), 0.0f, 0.0f, watchLogEntry.getWatchPowerLog().getCaseTemp(), 0.0f, 0.0f, activeCalories, sleepType2, watchLogEntry.getHrv(), false, bmrCalories, watchLogEntry.getPulseCount(), watchLogEntry.getPulseCount(), null, iRoundToInt, 280256, null);
            } else {
                sleepLog = null;
            }
            arrayList.add(sleepLog);
            i2 = i3;
        }
        return kotlin.collections.CollectionsKt.filterNotNull(arrayList);
    }
}
