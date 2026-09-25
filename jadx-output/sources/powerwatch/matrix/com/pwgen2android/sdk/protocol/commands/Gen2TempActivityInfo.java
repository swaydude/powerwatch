package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2TempActivityInfo;", "", "tempStartLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityStartLog;", "tempEndLogs", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityEndLog;", "tempDeltaLogs", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDeltaLog;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTempDeltaLogs", "()Ljava/util/List;", "setTempDeltaLogs", "(Ljava/util/List;)V", "getTempEndLogs", "setTempEndLogs", "getTempStartLogs", "setTempStartLogs", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Gen2TempActivityInfo {
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> tempDeltaLogs;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> tempEndLogs;
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> tempStartLogs;

    public Gen2TempActivityInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = gen2TempActivityInfo.tempStartLogs;
        }
        if ((i & 2) != 0) {
            list2 = gen2TempActivityInfo.tempEndLogs;
        }
        if ((i & 4) != 0) {
            list3 = gen2TempActivityInfo.tempDeltaLogs;
        }
        return gen2TempActivityInfo.copy(list, list2, list3);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> component1() {
        return this.tempStartLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> component2() {
        return this.tempEndLogs;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> component3() {
        return this.tempDeltaLogs;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo copy(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> tempStartLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> tempEndLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> tempDeltaLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempStartLogs, "tempStartLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempEndLogs, "tempEndLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempDeltaLogs, "tempDeltaLogs");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo(tempStartLogs, tempEndLogs, tempDeltaLogs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo gen2TempActivityInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2TempActivityInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tempStartLogs, gen2TempActivityInfo.tempStartLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.tempEndLogs, gen2TempActivityInfo.tempEndLogs) && kotlin.jvm.internal.Intrinsics.areEqual(this.tempDeltaLogs, gen2TempActivityInfo.tempDeltaLogs);
    }

    public int hashCode() {
        return (((this.tempStartLogs.hashCode() * 31) + this.tempEndLogs.hashCode()) * 31) + this.tempDeltaLogs.hashCode();
    }

    public java.lang.String toString() {
        return "Gen2TempActivityInfo(tempStartLogs=" + this.tempStartLogs + ", tempEndLogs=" + this.tempEndLogs + ", tempDeltaLogs=" + this.tempDeltaLogs + ')';
    }

    public Gen2TempActivityInfo(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> tempStartLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> tempEndLogs, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> tempDeltaLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempStartLogs, "tempStartLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempEndLogs, "tempEndLogs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tempDeltaLogs, "tempDeltaLogs");
        this.tempStartLogs = tempStartLogs;
        this.tempEndLogs = tempEndLogs;
        this.tempDeltaLogs = tempDeltaLogs;
    }

    public /* synthetic */ Gen2TempActivityInfo(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : arrayList, (i & 2) != 0 ? new java.util.ArrayList() : arrayList2, (i & 4) != 0 ? new java.util.ArrayList() : arrayList3);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> getTempStartLogs() {
        return this.tempStartLogs;
    }

    public final void setTempStartLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityStartLog> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tempStartLogs = list;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> getTempEndLogs() {
        return this.tempEndLogs;
    }

    public final void setTempEndLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityEndLog> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tempEndLogs = list;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> getTempDeltaLogs() {
        return this.tempDeltaLogs;
    }

    public final void setTempDeltaLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDeltaLog> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.tempDeltaLogs = list;
    }
}
