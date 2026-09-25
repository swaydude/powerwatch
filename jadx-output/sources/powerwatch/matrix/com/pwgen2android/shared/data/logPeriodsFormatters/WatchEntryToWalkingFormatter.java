package powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters;

/* JADX INFO: compiled from: WatchEntryToLogFormatter.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WatchEntryToWalkingFormatter;", "", "()V", "format", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/logPeriodsFormatters/WalkingLog;", "watchLogEntries", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;", "totalDisplayedData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;", "logInterval", "", "isGen2", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class WatchEntryToWalkingFormatter {
    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> format(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> watchLogEntries, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData totalDisplayedData, long logInterval, boolean isGen2) {
        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchLogEntries, "watchLogEntries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalDisplayedData, "totalDisplayedData");
        long lastLogTime = totalDisplayedData.getLastLogTime();
        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) kotlin.collections.CollectionsKt.reversed(watchLogEntries));
        int i = isGen2 ? 1 : 1000;
        java.util.List list = mutableList;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) obj;
            long timestamp = watchLogEntry.getTimestamp();
            long j = ((long) 60000) + timestamp;
            if (!isGen2) {
                j = lastLogTime - (((long) i2) * logInterval);
                timestamp = j - logInterval;
            }
            long j2 = timestamp;
            long j3 = j;
            if (watchLogEntry.getWalkingSteps() <= 0 || watchLogEntry.isSleep()) {
                walkingLog = null;
            } else {
                int iRoundToInt = kotlin.math.MathKt.roundToInt((j3 - j2) / ((double) 60000));
                int walkingSteps = (int) (watchLogEntry.getWalkingSteps() + watchLogEntry.getRunningSteps());
                int activeCalories = watchLogEntry.getActiveCalories() * i;
                int bmrCalories = watchLogEntry.getBmrCalories() * i;
                float pulseCount = watchLogEntry.getPulseCount();
                int pulseCount2 = watchLogEntry.getPulseCount();
                int pulseCount3 = watchLogEntry.getPulseCount();
                walkingLog = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog(j2, walkingSteps, watchLogEntry.getDistance(), j3, pulseCount, watchLogEntry.getWatchPowerLog().getThermalGen(), watchLogEntry.getWatchPowerLog().getSolarGen(), watchLogEntry.getWatchPowerLog().getSkinTemp(), 0.0f, 0.0f, watchLogEntry.getWatchPowerLog().getCaseTemp(), 0.0f, 0.0f, activeCalories, watchLogEntry.getHrv(), false, bmrCalories, pulseCount2, pulseCount3, null, iRoundToInt, 563968, null);
            }
            arrayList.add(walkingLog);
            i2 = i3;
        }
        return kotlin.collections.CollectionsKt.filterNotNull(arrayList);
    }
}
