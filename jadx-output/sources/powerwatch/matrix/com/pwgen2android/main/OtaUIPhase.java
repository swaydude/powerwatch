package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhase;", "", "phase", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "status", "Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;", "(Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;)V", "getPhase", "()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "getStatus", "()Lpowerwatch/matrix/com/pwgen2android/main/OtaUIPhaseStatus;", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class OtaUIPhase {
    private final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase;
    private final powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus status;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.OtaUIPhase copy$default(powerwatch.matrix.com.pwgen2android.main.OtaUIPhase otaUIPhase, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase otaProcessPhase, powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus otaUIPhaseStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            otaProcessPhase = otaUIPhase.phase;
        }
        if ((i & 2) != 0) {
            otaUIPhaseStatus = otaUIPhase.status;
        }
        return otaUIPhase.copy(otaProcessPhase, otaUIPhaseStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus getStatus() {
        return this.status;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OtaUIPhase copy(powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase, powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        return new powerwatch.matrix.com.pwgen2android.main.OtaUIPhase(phase, status);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.OtaUIPhase)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.OtaUIPhase otaUIPhase = (powerwatch.matrix.com.pwgen2android.main.OtaUIPhase) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phase, otaUIPhase.phase) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, otaUIPhase.status);
    }

    public int hashCode() {
        return (this.phase.hashCode() * 31) + this.status.hashCode();
    }

    public java.lang.String toString() {
        return "OtaUIPhase(phase=" + this.phase + ", status=" + this.status + ')';
    }

    public OtaUIPhase(powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase, powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.phase = phase;
        this.status = status;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase getPhase() {
        return this.phase;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OtaUIPhaseStatus getStatus() {
        return this.status;
    }
}
