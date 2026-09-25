package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003JQ\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00064"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2DataInfo;", "", "rtlData", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;", "activityInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;", "tempActivityLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;", "dataInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "sleepLogData", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2SleepEntryLog;", "gen2LogsCount", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;", "(Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;)V", "getActivityInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;", "setActivityInfo", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;)V", "getDataInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;", "setDataInfo", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V", "getGen2LogsCount", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;", "setGen2LogsCount", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2LogsCount;)V", "getRtlData", "()Ljava/util/List;", "setRtlData", "(Ljava/util/List;)V", "getSleepLogData", "setSleepLogData", "getTempActivityLog", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;", "setTempActivityLog", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2DataInfo {
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> rtlData;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog> sleepLogData;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo tempActivityLog;

    public Gen2DataInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo, java.util.List list, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.util.List list2, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = gen2DataInfo.rtlData;
        }
        if ((i & 2) != 0) {
            activityInfo = gen2DataInfo.activityInfo;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo2 = activityInfo;
        if ((i & 4) != 0) {
            gen2TempActivityInfo = gen2DataInfo.tempActivityLog;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo2 = gen2TempActivityInfo;
        if ((i & 8) != 0) {
            dataInfo = gen2DataInfo.dataInfo;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo2 = dataInfo;
        if ((i & 16) != 0) {
            list2 = gen2DataInfo.sleepLogData;
        }
        java.util.List list3 = list2;
        if ((i & 32) != 0) {
            gen2LogsCount = gen2DataInfo.gen2LogsCount;
        }
        return gen2DataInfo.copy(list, activityInfo2, gen2TempActivityInfo2, dataInfo2, list3, gen2LogsCount);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> component1() {
        return this.rtlData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo getTempActivityLog() {
        return this.tempActivityLog;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
        return this.dataInfo;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog> component5() {
        return this.sleepLogData;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount getGen2LogsCount() {
        return this.gen2LogsCount;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo copy(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> rtlData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo tempActivityLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog> sleepLogData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rtlData, "rtlData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInfo, "activityInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempActivityLog, "tempActivityLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogData, "sleepLogData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2LogsCount, "gen2LogsCount");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo(rtlData, activityInfo, tempActivityLog, dataInfo, sleepLogData, gen2LogsCount);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo gen2DataInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2DataInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rtlData, gen2DataInfo.rtlData) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityInfo, gen2DataInfo.activityInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.tempActivityLog, gen2DataInfo.tempActivityLog) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataInfo, gen2DataInfo.dataInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.sleepLogData, gen2DataInfo.sleepLogData) && kotlin.jvm.internal.Intrinsics.areEqual(this.gen2LogsCount, gen2DataInfo.gen2LogsCount);
    }

    public int hashCode() {
        return (((((((((this.rtlData.hashCode() * 31) + this.activityInfo.hashCode()) * 31) + this.tempActivityLog.hashCode()) * 31) + this.dataInfo.hashCode()) * 31) + this.sleepLogData.hashCode()) * 31) + this.gen2LogsCount.hashCode();
    }

    public java.lang.String toString() {
        return "Gen2DataInfo(rtlData=" + this.rtlData + ", activityInfo=" + this.activityInfo + ", tempActivityLog=" + this.tempActivityLog + ", dataInfo=" + this.dataInfo + ", sleepLogData=" + this.sleepLogData + ", gen2LogsCount=" + this.gen2LogsCount + ')';
    }

    public Gen2DataInfo(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> rtlData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo tempActivityLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog> sleepLogData, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rtlData, "rtlData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInfo, "activityInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempActivityLog, "tempActivityLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "dataInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sleepLogData, "sleepLogData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2LogsCount, "gen2LogsCount");
        this.rtlData = rtlData;
        this.activityInfo = activityInfo;
        this.tempActivityLog = tempActivityLog;
        this.dataInfo = dataInfo;
        this.sleepLogData = sleepLogData;
        this.gen2LogsCount = gen2LogsCount;
    }

    public /* synthetic */ Gen2DataInfo(java.util.List list, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo, java.util.List list2, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo(0.0d, 0.0d, null, 7, null) : activityInfo, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo(null, null, null, 7, null) : gen2TempActivityInfo, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo(false, false, null, 0.0f, null, null, null, 0L, null, 511, null) : dataInfo, (i & 16) != 0 ? new java.util.ArrayList() : list2, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null) : gen2LogsCount);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> getRtlData() {
        return this.rtlData;
    }

    public final void setRtlData(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.rtlData = list;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    public final void setActivityInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityInfo, "<set-?>");
        this.activityInfo = activityInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo getTempActivityLog() {
        return this.tempActivityLog;
    }

    public final void setTempActivityLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2TempActivityInfo, "<set-?>");
        this.tempActivityLog = gen2TempActivityInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo getDataInfo() {
        return this.dataInfo;
    }

    public final void setDataInfo(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInfo, "<set-?>");
        this.dataInfo = dataInfo;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog> getSleepLogData() {
        return this.sleepLogData;
    }

    public final void setSleepLogData(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2SleepEntryLog> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepLogData = list;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount getGen2LogsCount() {
        return this.gen2LogsCount;
    }

    public final void setGen2LogsCount(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2LogsCount gen2LogsCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2LogsCount, "<set-?>");
        this.gen2LogsCount = gen2LogsCount;
    }
}
