package powerwatch.matrix.com.pwgen2android.main.update;

/* JADX INFO: compiled from: FirmwareAvailableViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/update/UpdatePreconditionsState;", "", "bluetooth", "", "network", "deviceConnection", "(ZZZ)V", "getBluetooth", "()Z", "getDeviceConnection", "getNetwork", "component1", "component2", "component3", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class UpdatePreconditionsState {
    private final boolean bluetooth;
    private final boolean deviceConnection;
    private final boolean network;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState copy$default(powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState updatePreconditionsState, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = updatePreconditionsState.bluetooth;
        }
        if ((i & 2) != 0) {
            z2 = updatePreconditionsState.network;
        }
        if ((i & 4) != 0) {
            z3 = updatePreconditionsState.deviceConnection;
        }
        return updatePreconditionsState.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBluetooth() {
        return this.bluetooth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDeviceConnection() {
        return this.deviceConnection;
    }

    public final powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState copy(boolean bluetooth, boolean network, boolean deviceConnection) {
        return new powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState(bluetooth, network, deviceConnection);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState updatePreconditionsState = (powerwatch.matrix.com.pwgen2android.main.update.UpdatePreconditionsState) other;
        return this.bluetooth == updatePreconditionsState.bluetooth && this.network == updatePreconditionsState.network && this.deviceConnection == updatePreconditionsState.deviceConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.bluetooth;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.network;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.deviceConnection;
        return i2 + (z3 ? 1 : z3);
    }

    public java.lang.String toString() {
        return "UpdatePreconditionsState(bluetooth=" + this.bluetooth + ", network=" + this.network + ", deviceConnection=" + this.deviceConnection + ')';
    }

    public UpdatePreconditionsState(boolean z, boolean z2, boolean z3) {
        this.bluetooth = z;
        this.network = z2;
        this.deviceConnection = z3;
    }

    public final boolean getBluetooth() {
        return this.bluetooth;
    }

    public final boolean getDeviceConnection() {
        return this.deviceConnection;
    }

    public final boolean getNetwork() {
        return this.network;
    }
}
