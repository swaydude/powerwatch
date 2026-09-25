package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchRunningSplitEntry;", "", "gpsPosition", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "heartRate", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "runningSplit", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V", "getGpsPosition", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;", "setGpsPosition", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GPSPosition;)V", "getHeartRate", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;", "setHeartRate", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/HeartRate;)V", "getRunningSplit", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;", "setRunningSplit", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/RunningSplit;)V", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WatchRunningSplitEntry {
    private powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate;
    private powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry watchRunningSplitEntry, powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            gPSPosition = watchRunningSplitEntry.gpsPosition;
        }
        if ((i & 2) != 0) {
            heartRate = watchRunningSplitEntry.heartRate;
        }
        if ((i & 4) != 0) {
            runningSplit = watchRunningSplitEntry.runningSplit;
        }
        return watchRunningSplitEntry.copy(gPSPosition, heartRate, runningSplit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition getGpsPosition() {
        return this.gpsPosition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit getRunningSplit() {
        return this.runningSplit;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry copy(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPosition, "gpsPosition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningSplit, "runningSplit");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry(gpsPosition, heartRate, runningSplit);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry watchRunningSplitEntry = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchRunningSplitEntry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.gpsPosition, watchRunningSplitEntry.gpsPosition) && kotlin.jvm.internal.Intrinsics.areEqual(this.heartRate, watchRunningSplitEntry.heartRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.runningSplit, watchRunningSplitEntry.runningSplit);
    }

    public int hashCode() {
        return (((this.gpsPosition.hashCode() * 31) + this.heartRate.hashCode()) * 31) + this.runningSplit.hashCode();
    }

    public java.lang.String toString() {
        return "WatchRunningSplitEntry(gpsPosition=" + this.gpsPosition + ", heartRate=" + this.heartRate + ", runningSplit=" + this.runningSplit + ')';
    }

    public WatchRunningSplitEntry(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gpsPosition, powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate, powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gpsPosition, "gpsPosition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "heartRate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningSplit, "runningSplit");
        this.gpsPosition = gpsPosition;
        this.heartRate = heartRate;
        this.runningSplit = runningSplit;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition getGpsPosition() {
        return this.gpsPosition;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate getHeartRate() {
        return this.heartRate;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit getRunningSplit() {
        return this.runningSplit;
    }

    public final void setGpsPosition(powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition gPSPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gPSPosition, "<set-?>");
        this.gpsPosition = gPSPosition;
    }

    public final void setHeartRate(powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate heartRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartRate, "<set-?>");
        this.heartRate = heartRate;
    }

    public final void setRunningSplit(powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit runningSplit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningSplit, "<set-?>");
        this.runningSplit = runningSplit;
    }
}
