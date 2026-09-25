package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005¨\u0006\u0006"}, d2 = {"isFirmwareVersionValid", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;", "logLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class CommandsKt {
    public static final boolean isFirmwareVersionValid(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo watchDataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchDataInfo, "<this>");
        java.lang.String firmwareVersion = watchDataInfo.getFirmwareVersion();
        if (firmwareVersion == null) {
            return false;
        }
        return kotlin.text.StringsKt.startsWith(firmwareVersion, "v", true);
    }

    public static final java.lang.String logLogs(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "<this>");
        if (dataInfo.getActivityLogs().isEmpty()) {
            return "No logs";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry : dataInfo.getActivityLogs()) {
            arrayList.add(watchLogEntry.copy((4095 & 1) != 0 ? watchLogEntry.isSleep : false, (4095 & 2) != 0 ? watchLogEntry.timestamp : 0L, (4095 & 4) != 0 ? watchLogEntry.state : 0, (4095 & 8) != 0 ? watchLogEntry.battery : 0, (4095 & 16) != 0 ? watchLogEntry.activeCalories : 0, (4095 & 32) != 0 ? watchLogEntry.bmrCalories : 0, (4095 & 64) != 0 ? watchLogEntry.hrv : 0, (4095 & 128) != 0 ? watchLogEntry.pulseCount : 0, (4095 & 256) != 0 ? watchLogEntry.walkingSteps : 0L, (4095 & 512) != 0 ? watchLogEntry.runningSteps : 0L, (4095 & 1024) != 0 ? watchLogEntry.distance : 0L, (4095 & 2048) != 0 ? watchLogEntry.watchPowerLog : null));
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry2 = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) it.next();
            powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry3 = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) next;
            watchLogEntry3.setActiveCalories(watchLogEntry3.getActiveCalories() + watchLogEntry2.getActiveCalories());
            watchLogEntry3.setDistance(watchLogEntry3.getDistance() + watchLogEntry2.getDistance());
            watchLogEntry3.setWalkingSteps(watchLogEntry3.getWalkingSteps() + watchLogEntry2.getWalkingSteps());
            watchLogEntry3.setRunningSteps(watchLogEntry3.getRunningSteps() + watchLogEntry2.getRunningSteps());
            next = watchLogEntry3;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry watchLogEntry4 = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry) next;
        return kotlin.jvm.internal.Intrinsics.stringPlus(watchLogEntry4.isSleep() ? "Active: " : "Sleep: ", watchLogEntry4);
    }
}
