package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\nHÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003Jo\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010?\u001a\u00020\u00032\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001c¨\u0006E"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "", "parsingStarted", "", "parsingFinished", "data", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;", "dataToProcess", "", "activityLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchLogEntry;", "runningLogs", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningLogEntry;", "activitySummary", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;", "activityLogInterval", "", "alertsData", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "(ZZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;FLjava/util/List;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;JLpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V", "getActivityLogInterval", "()J", "setActivityLogInterval", "(J)V", "getActivityLogs", "()Ljava/util/List;", "setActivityLogs", "(Ljava/util/List;)V", "getActivitySummary", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;", "setActivitySummary", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/TotalActivityData;)V", "getAlertsData", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "setAlertsData", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;)V", "getData", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;", "setData", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;)V", "getDataToProcess", "()F", "setDataToProcess", "(F)V", "getParsingFinished", "()Z", "setParsingFinished", "(Z)V", "getParsingStarted", "setParsingStarted", "getRunningLogs", "setRunningLogs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DataInfo {
    private long activityLogInterval;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> activityLogs;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData activitySummary;
    private powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData alertsData;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo data;
    private float dataToProcess;
    private boolean parsingFinished;
    private boolean parsingStarted;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> runningLogs;

    public DataInfo() {
        this(false, false, null, 0.0f, null, null, null, 0L, null, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getParsingStarted() {
        return this.parsingStarted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getParsingFinished() {
        return this.parsingFinished;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getDataToProcess() {
        return this.dataToProcess;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> component5() {
        return this.activityLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> component6() {
        return this.runningLogs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData getActivitySummary() {
        return this.activitySummary;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getActivityLogInterval() {
        return this.activityLogInterval;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData getAlertsData() {
        return this.alertsData;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo copy(boolean parsingStarted, boolean parsingFinished, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo data, float dataToProcess, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> activityLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> runningLogs, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData activitySummary, long activityLogInterval, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData alertsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLogs, "activityLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningLogs, "runningLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySummary, "activitySummary");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsData, "alertsData");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(parsingStarted, parsingFinished, data, dataToProcess, activityLogs, runningLogs, activitySummary, activityLogInterval, alertsData);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) other;
        return this.parsingStarted == dataInfo.parsingStarted && this.parsingFinished == dataInfo.parsingFinished && kotlin.jvm.internal.Intrinsics.areEqual(this.data, dataInfo.data) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.dataToProcess), (java.lang.Object) java.lang.Float.valueOf(dataInfo.dataToProcess)) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityLogs, dataInfo.activityLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.runningLogs, dataInfo.runningLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.activitySummary, dataInfo.activitySummary) && this.activityLogInterval == dataInfo.activityLogInterval && kotlin.jvm.internal.Intrinsics.areEqual(this.alertsData, dataInfo.alertsData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    public int hashCode() {
        boolean z = this.parsingStarted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.parsingFinished;
        return ((((((((((((((i + (z2 ? 1 : z2)) * 31) + this.data.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.dataToProcess)) * 31) + this.activityLogs.hashCode()) * 31) + this.runningLogs.hashCode()) * 31) + this.activitySummary.hashCode()) * 31) + powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.activityLogInterval)) * 31) + this.alertsData.hashCode();
    }

    public java.lang.String toString() {
        return "DataInfo(parsingStarted=" + this.parsingStarted + ", parsingFinished=" + this.parsingFinished + ", data=" + this.data + ", dataToProcess=" + this.dataToProcess + ", activityLogs=" + this.activityLogs + ", runningLogs=" + this.runningLogs + ", activitySummary=" + this.activitySummary + ", activityLogInterval=" + this.activityLogInterval + ", alertsData=" + this.alertsData + ')';
    }

    public DataInfo(boolean z, boolean z2, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo data, float f, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> activityLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> runningLogs, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData activitySummary, long j, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData alertsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLogs, "activityLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningLogs, "runningLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySummary, "activitySummary");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsData, "alertsData");
        this.parsingStarted = z;
        this.parsingFinished = z2;
        this.data = data;
        this.dataToProcess = f;
        this.activityLogs = activityLogs;
        this.runningLogs = runningLogs;
        this.activitySummary = activitySummary;
        this.activityLogInterval = j;
        this.alertsData = alertsData;
    }

    public final boolean getParsingStarted() {
        return this.parsingStarted;
    }

    public final void setParsingStarted(boolean z) {
        this.parsingStarted = z;
    }

    public final boolean getParsingFinished() {
        return this.parsingFinished;
    }

    public final void setParsingFinished(boolean z) {
        this.parsingFinished = z;
    }

    public /* synthetic */ DataInfo(boolean z, boolean z2, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo watchDataInfo, float f, java.util.List list, java.util.List list2, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData totalActivityData, long j, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo(null, null, null, null, 0, null, 63, null) : watchDataInfo, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? new java.util.ArrayList() : list, (i & 32) != 0 ? new java.util.ArrayList() : list2, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData(0L, 0L, 0L, 0, 15, null) : totalActivityData, (i & 128) != 0 ? -1L : j, (i & 256) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(null, (short) 0, null, null, (byte) 0, null, null, null, 0, 0, 0, 0L, 0L, 8191, null) : gen2AlertsData);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo getData() {
        return this.data;
    }

    public final void setData(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchDataInfo watchDataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watchDataInfo, "<set-?>");
        this.data = watchDataInfo;
    }

    public final float getDataToProcess() {
        return this.dataToProcess;
    }

    public final void setDataToProcess(float f) {
        this.dataToProcess = f;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> getActivityLogs() {
        return this.activityLogs;
    }

    public final void setActivityLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchLogEntry> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.activityLogs = list;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> getRunningLogs() {
        return this.runningLogs;
    }

    public final void setRunningLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningLogEntry> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.runningLogs = list;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData getActivitySummary() {
        return this.activitySummary;
    }

    public final void setActivitySummary(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.TotalActivityData totalActivityData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalActivityData, "<set-?>");
        this.activitySummary = totalActivityData;
    }

    public final long getActivityLogInterval() {
        return this.activityLogInterval;
    }

    public final void setActivityLogInterval(long j) {
        this.activityLogInterval = j;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData getAlertsData() {
        return this.alertsData;
    }

    public final void setAlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "<set-?>");
        this.alertsData = gen2AlertsData;
    }
}
