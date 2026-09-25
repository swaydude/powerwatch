package powerwatch.matrix.com.pwgen2android.shared.data.metrics;

/* JADX INFO: compiled from: DeviceEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/metrics/EventDetails;", "", "status", "", "(Ljava/lang/String;)V", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class EventDetails {

    @com.google.gson.annotations.SerializedName("status")
    private final java.lang.String status;

    /* JADX WARN: Multi-variable type inference failed */
    public EventDetails() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final java.lang.String getStatus() {
        return this.status;
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails copy$default(powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails eventDetails, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = eventDetails.status;
        }
        return eventDetails.copy(str);
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails copy(java.lang.String status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        return new powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails(status);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((powerwatch.matrix.com.pwgen2android.shared.data.metrics.EventDetails) other).status);
    }

    public int hashCode() {
        return this.status.hashCode();
    }

    public java.lang.String toString() {
        return "EventDetails(status=" + this.status + ')';
    }

    public EventDetails(java.lang.String status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
    }

    public /* synthetic */ EventDetails(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
