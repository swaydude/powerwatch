package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ActivityInfo;", "", "latitudeSum", "", "longitudeSum", "activityDataLogs", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Gen2ActivityDataLog;", "(DDLjava/util/List;)V", "getActivityDataLogs", "()Ljava/util/List;", "setActivityDataLogs", "(Ljava/util/List;)V", "getLatitudeSum", "()D", "setLatitudeSum", "(D)V", "getLongitudeSum", "setLongitudeSum", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ActivityInfo {
    private java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> activityDataLogs;
    private double latitudeSum;
    private double longitudeSum;

    public ActivityInfo() {
        this(0.0d, 0.0d, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo, double d, double d2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = activityInfo.latitudeSum;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = activityInfo.longitudeSum;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            list = activityInfo.activityDataLogs;
        }
        return activityInfo.copy(d3, d4, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitudeSum() {
        return this.latitudeSum;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitudeSum() {
        return this.longitudeSum;
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> component3() {
        return this.activityDataLogs;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo copy(double latitudeSum, double longitudeSum, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> activityDataLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDataLogs, "activityDataLogs");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo(latitudeSum, longitudeSum, activityDataLogs);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo activityInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.latitudeSum), (java.lang.Object) java.lang.Double.valueOf(activityInfo.latitudeSum)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Double.valueOf(this.longitudeSum), (java.lang.Object) java.lang.Double.valueOf(activityInfo.longitudeSum)) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityDataLogs, activityInfo.activityDataLogs);
    }

    public int hashCode() {
        return (((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.latitudeSum) * 31) + powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ActivityInfo$$ExternalSynthetic0.m0(this.longitudeSum)) * 31) + this.activityDataLogs.hashCode();
    }

    public java.lang.String toString() {
        return "ActivityInfo(latitudeSum=" + this.latitudeSum + ", longitudeSum=" + this.longitudeSum + ", activityDataLogs=" + this.activityDataLogs + ')';
    }

    public ActivityInfo(double d, double d2, java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> activityDataLogs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDataLogs, "activityDataLogs");
        this.latitudeSum = d;
        this.longitudeSum = d2;
        this.activityDataLogs = activityDataLogs;
    }

    public final double getLatitudeSum() {
        return this.latitudeSum;
    }

    public final double getLongitudeSum() {
        return this.longitudeSum;
    }

    public final void setLatitudeSum(double d) {
        this.latitudeSum = d;
    }

    public final void setLongitudeSum(double d) {
        this.longitudeSum = d;
    }

    public /* synthetic */ ActivityInfo(double d, double d2, java.util.ArrayList arrayList, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) == 0 ? d2 : 0.0d, (i & 4) != 0 ? new java.util.ArrayList() : arrayList);
    }

    public final java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> getActivityDataLogs() {
        return this.activityDataLogs;
    }

    public final void setActivityDataLogs(java.util.List<powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Gen2ActivityDataLog> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.activityDataLogs = list;
    }
}
