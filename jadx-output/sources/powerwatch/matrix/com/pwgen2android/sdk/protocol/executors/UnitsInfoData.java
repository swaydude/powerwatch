package powerwatch.matrix.com.pwgen2android.sdk.protocol.executors;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/UnitsInfoData;", "", "twelveHourFormat", "", "metricsFormat", "(ZZ)V", "getMetricsFormat", "()Z", "getTwelveHourFormat", "component1", "component2", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UnitsInfoData {
    private final boolean metricsFormat;
    private final boolean twelveHourFormat;

    /* JADX WARN: Illegal instructions before constructor call */
    public UnitsInfoData() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = unitsInfoData.twelveHourFormat;
        }
        if ((i & 2) != 0) {
            z2 = unitsInfoData.metricsFormat;
        }
        return unitsInfoData.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getTwelveHourFormat() {
        return this.twelveHourFormat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMetricsFormat() {
        return this.metricsFormat;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData copy(boolean twelveHourFormat, boolean metricsFormat) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData(twelveHourFormat, metricsFormat);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData unitsInfoData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.UnitsInfoData) other;
        return this.twelveHourFormat == unitsInfoData.twelveHourFormat && this.metricsFormat == unitsInfoData.metricsFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.twelveHourFormat;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.metricsFormat;
        return i + (z2 ? 1 : z2);
    }

    public java.lang.String toString() {
        return "UnitsInfoData(twelveHourFormat=" + this.twelveHourFormat + ", metricsFormat=" + this.metricsFormat + ')';
    }

    public UnitsInfoData(boolean z, boolean z2) {
        this.twelveHourFormat = z;
        this.metricsFormat = z2;
    }

    public /* synthetic */ UnitsInfoData(boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? true : z2);
    }

    public final boolean getTwelveHourFormat() {
        return this.twelveHourFormat;
    }

    public final boolean getMetricsFormat() {
        return this.metricsFormat;
    }
}
