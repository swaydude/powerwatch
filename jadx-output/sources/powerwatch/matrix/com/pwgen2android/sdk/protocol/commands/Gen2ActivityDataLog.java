package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;", "", "type", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "startLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;", "endLog", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "deltaLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;Ljava/util/List;)V", "getDeltaLogs", "()Ljava/util/List;", "setDeltaLogs", "(Ljava/util/List;)V", "getEndLog", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "setEndLog", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;)V", "getStartLog", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;", "setStartLog", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;)V", "getType", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;", "setType", "(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2ActivityDataLog {
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> deltaLogs;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog endLog;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog startLog;
    private powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type;

    public Gen2ActivityDataLog() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog gen2ActivityDataLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType activityType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog gen2ActivityStartLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog gen2ActivityEndLog, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityType = gen2ActivityDataLog.type;
        }
        if ((i & 2) != 0) {
            gen2ActivityStartLog = gen2ActivityDataLog.startLog;
        }
        if ((i & 4) != 0) {
            gen2ActivityEndLog = gen2ActivityDataLog.endLog;
        }
        if ((i & 8) != 0) {
            list = gen2ActivityDataLog.deltaLogs;
        }
        return gen2ActivityDataLog.copy(activityType, gen2ActivityStartLog, gen2ActivityEndLog, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog getStartLog() {
        return this.startLog;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog getEndLog() {
        return this.endLog;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> component4() {
        return this.deltaLogs;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog copy(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog startLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog endLog, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> deltaLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startLog, "startLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endLog, "endLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deltaLogs, "deltaLogs");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog(type, startLog, endLog, deltaLogs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog gen2ActivityDataLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, gen2ActivityDataLog.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.startLog, gen2ActivityDataLog.startLog) && kotlin.jvm.internal.Intrinsics.areEqual(this.endLog, gen2ActivityDataLog.endLog) && kotlin.jvm.internal.Intrinsics.areEqual(this.deltaLogs, gen2ActivityDataLog.deltaLogs);
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.startLog.hashCode()) * 31) + this.endLog.hashCode()) * 31) + this.deltaLogs.hashCode();
    }

    public java.lang.String toString() {
        return "Gen2ActivityDataLog(type=" + this.type + ", startLog=" + this.startLog + ", endLog=" + this.endLog + ", deltaLogs=" + this.deltaLogs + ')';
    }

    public Gen2ActivityDataLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType type, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog startLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog endLog, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> deltaLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startLog, "startLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endLog, "endLog");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deltaLogs, "deltaLogs");
        this.type = type;
        this.startLog = startLog;
        this.endLog = endLog;
        this.deltaLogs = deltaLogs;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Gen2ActivityDataLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType activityType, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog gen2ActivityStartLog, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog gen2ActivityEndLog, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING running = (i & 1) != 0 ? powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType.RUNNING.INSTANCE : activityType;
        this(running, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog(running, 0, 0L, 0, 0.0f, 0.0f, 0.0f, 0L, 0, 0, 0, 0, 0, 0, 0, null, 65534, null) : gen2ActivityStartLog, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog(0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 1048575, null) : gen2ActivityEndLog, (i & 8) != 0 ? new java.util.ArrayList() : list);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType getType() {
        return this.type;
    }

    public final void setType(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityType activityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "<set-?>");
        this.type = activityType;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog getStartLog() {
        return this.startLog;
    }

    public final void setStartLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog gen2ActivityStartLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2ActivityStartLog, "<set-?>");
        this.startLog = gen2ActivityStartLog;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog getEndLog() {
        return this.endLog;
    }

    public final void setEndLog(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog gen2ActivityEndLog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2ActivityEndLog, "<set-?>");
        this.endLog = gen2ActivityEndLog;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> getDeltaLogs() {
        return this.deltaLogs;
    }

    public final void setDeltaLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.deltaLogs = list;
    }
}
