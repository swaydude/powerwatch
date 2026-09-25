package powerwatch.matrix.com.pwgen2android.shared.data;

/* JADX INFO: compiled from: ActivitySessionsFormatters.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/RunningSessionActivityFormatter;", "", "runningLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;", "email", "", "context", "Landroid/content/Context;", "(Ljava/util/List;Ljava/lang/String;Landroid/content/Context;)V", "format", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/UserActivitySession;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RunningSessionActivityFormatter {
    private final android.content.Context context;
    private final java.lang.String email;
    private final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> runningLogs;

    public RunningSessionActivityFormatter(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> runningLogs, java.lang.String email, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningLogs, "runningLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.runningLogs = runningLogs;
        this.email = email;
        this.context = context;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> format() {
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> list = this.runningLogs;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry watchRunningLogEntry : list) {
            kotlin.Triple<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit>, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition>, java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate>> tripleMapSplits = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityLogExtensionsKt.mapSplits(watchRunningLogEntry);
            java.lang.String strMapActivityTypeToName = powerwatch.matrix.com.pwgen2android.shared.extensions.ActivityPeriodsExtensionsKt.mapActivityTypeToName(watchRunningLogEntry.getSessionType(), this.context);
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> second = tripleMapSplits.getSecond();
            java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> third = tripleMapSplits.getThird();
            arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession(this.email + '_' + watchRunningLogEntry.getRunningStart(), strMapActivityTypeToName, watchRunningLogEntry.getSessionType(), "", watchRunningLogEntry.getDistance(), (int) watchRunningLogEntry.getSteps(), watchRunningLogEntry.getRunningStart(), watchRunningLogEntry.getRunningEnd(), 0.0f, watchRunningLogEntry.getActiveCalories(), 0, null, second, third, null, false, null, 118016, null));
        }
        return arrayList;
    }
}
