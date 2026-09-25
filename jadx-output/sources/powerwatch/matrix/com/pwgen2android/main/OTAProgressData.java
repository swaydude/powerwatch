package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OTAModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;", "", "phaseProgress", "", "phase", "Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;", "(ILpowerwatch/matrix/com/pwgen2android/main/OtaPhase;)V", "getPhase", "()Lpowerwatch/matrix/com/pwgen2android/main/OtaPhase;", "getPhaseProgress", "()I", "component1", "component2", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class OTAProgressData {
    private final powerwatch.matrix.com.pwgen2android.main.OtaPhase phase;
    private final int phaseProgress;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.OTAProgressData copy$default(powerwatch.matrix.com.pwgen2android.main.OTAProgressData oTAProgressData, int i, powerwatch.matrix.com.pwgen2android.main.OtaPhase otaPhase, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = oTAProgressData.phaseProgress;
        }
        if ((i2 & 2) != 0) {
            otaPhase = oTAProgressData.phase;
        }
        return oTAProgressData.copy(i, otaPhase);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPhaseProgress() {
        return this.phaseProgress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.OtaPhase getPhase() {
        return this.phase;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OTAProgressData copy(int phaseProgress, powerwatch.matrix.com.pwgen2android.main.OtaPhase phase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        return new powerwatch.matrix.com.pwgen2android.main.OTAProgressData(phaseProgress, phase);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.OTAProgressData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.OTAProgressData oTAProgressData = (powerwatch.matrix.com.pwgen2android.main.OTAProgressData) other;
        return this.phaseProgress == oTAProgressData.phaseProgress && kotlin.jvm.internal.Intrinsics.areEqual(this.phase, oTAProgressData.phase);
    }

    public int hashCode() {
        return (this.phaseProgress * 31) + this.phase.hashCode();
    }

    public java.lang.String toString() {
        return "OTAProgressData(phaseProgress=" + this.phaseProgress + ", phase=" + this.phase + ')';
    }

    public OTAProgressData(int i, powerwatch.matrix.com.pwgen2android.main.OtaPhase phase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        this.phaseProgress = i;
        this.phase = phase;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OtaPhase getPhase() {
        return this.phase;
    }

    public final int getPhaseProgress() {
        return this.phaseProgress;
    }
}
