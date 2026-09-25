package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: ActivityLogExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u001a\u0010\u0005\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a.\u0010\n\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b*\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013¨\u0006\u0014"}, d2 = {"exportActivityDataLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;", "exportPaired", "extractDeltaLogs", "startLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;", "endLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "mapSplits", "Lkotlin/Triple;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;", "parseValueToFloat", "", "", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ActivityLogExtensionsKt {
    public static final kotlin.Triple<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit>, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate>> mapSplits(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry watchRunningLogEntry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchRunningLogEntry, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : watchRunningLogEntry.getRunningSplits()) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry watchRunningSplitEntry = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry) obj;
            arrayList.add(watchRunningSplitEntry.getRunningSplit());
            arrayList2.add(watchRunningSplitEntry.getGpsPosition());
            arrayList3.add(watchRunningSplitEntry.getHeartRate());
            i = i2;
        }
        return new kotlin.Triple<>(arrayList, arrayList2, arrayList3);
    }

    public static final float parseValueToFloat(int i) {
        return java.lang.Float.intBitsToFloat(i);
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> exportActivityDataLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2TempActivityInfo, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> tempStartLogs = gen2TempActivityInfo.getTempStartLogs();
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> tempEndLogs = gen2TempActivityInfo.getTempEndLogs();
        java.util.Iterator<T> it = tempStartLogs.iterator();
        java.util.Iterator<T> it2 = tempEndLogs.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tempStartLogs, 10), kotlin.collections.CollectionsKt.collectionSizeOrDefault(tempEndLogs, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(extractDeltaLogs(gen2TempActivityInfo, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog) it.next(), (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog) it2.next()));
        }
        return arrayList;
    }

    public static final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> exportPaired(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo) {
        java.lang.Object next;
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog gen2ActivityDataLog;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2TempActivityInfo, "<this>");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> tempStartLogs = gen2TempActivityInfo.getTempStartLogs();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(tempStartLogs, 10));
        for (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog gen2ActivityStartLog : tempStartLogs) {
            java.util.Iterator<T> it = gen2TempActivityInfo.getTempEndLogs().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog) next).getActivityId() == gen2ActivityStartLog.getActivityId()));
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog gen2ActivityEndLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog) next;
            if (gen2ActivityEndLog != null) {
                gen2ActivityDataLog = extractDeltaLogs(gen2TempActivityInfo, gen2ActivityStartLog, gen2ActivityEndLog);
            } else {
                gen2ActivityDataLog = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog(gen2ActivityStartLog.getType(), gen2ActivityStartLog, null, null, 12, null);
            }
            arrayList.add(gen2ActivityDataLog);
        }
        return arrayList;
    }

    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog extractDeltaLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog startLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog endLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2TempActivityInfo, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startLog, "startLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endLog, "endLog");
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog gen2ActivityDataLog = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog(null, null, null, null, 15, null);
        int startLogIndex = startLog.getStartLogIndex();
        int endLogIndex = endLog.getEndLogIndex();
        int size = gen2TempActivityInfo.getTempDeltaLogs().size();
        gen2ActivityDataLog.setType(startLog.getType());
        gen2ActivityDataLog.setStartLog(startLog);
        gen2ActivityDataLog.setEndLog(endLog);
        android.util.Log.d("activity_tracker", "Activity transform: start: " + startLogIndex + ", end: " + endLogIndex);
        if (java.lang.Float.isNaN(startLog.getStartLatitude())) {
            android.util.Log.d("activity_tracker", "No valid gps locations found, will skip delta logs for this activity");
        } else if (startLogIndex >= 0) {
            if (endLogIndex >= size) {
                endLogIndex = size;
            }
            java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> listSubList = gen2TempActivityInfo.getTempDeltaLogs().subList(startLogIndex, endLogIndex + 1);
            android.util.Log.d("gen2_pair", kotlin.jvm.internal.Intrinsics.stringPlus("Running transform: ", java.lang.Integer.valueOf(listSubList.size())));
            gen2ActivityDataLog.getDeltaLogs().addAll(listSubList);
        }
        return gen2ActivityDataLog;
    }
}
