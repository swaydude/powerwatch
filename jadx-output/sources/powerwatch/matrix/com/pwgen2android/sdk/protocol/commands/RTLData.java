package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/RTLData;", "", "timestamp", "", "(J)V", "getTimestamp", "()J", "setTimestamp", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class RTLData {
    private long timestamp;

    public RTLData() {
        this(0L, 1, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData rTLData, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = rTLData.timestamp;
        }
        return rTLData.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData copy(long timestamp) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData(timestamp);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData) && this.timestamp == ((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.RTLData) other).timestamp;
    }

    public int hashCode() {
        return powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.timestamp);
    }

    public RTLData(long j) {
        this.timestamp = j;
    }

    public /* synthetic */ RTLData(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public java.lang.String toString() {
        return "RTLData(timestamp=" + (this.timestamp / ((long) 1000)) + ')';
    }
}
