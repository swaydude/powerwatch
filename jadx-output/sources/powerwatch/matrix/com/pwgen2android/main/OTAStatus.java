package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "", "phaseProgress", "", "phase", "Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "phaseWeight", "", "totalProgress", "otaError", "", "(ILpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;FILjava/lang/Throwable;)V", "getOtaError", "()Ljava/lang/Throwable;", "getPhase", "()Lpowerwatch/matrix/com/pwgen2android/main/OtaProcessPhase;", "getPhaseProgress", "()I", "getPhaseWeight", "()F", "getTotalProgress", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class OTAStatus {
    private final java.lang.Throwable otaError;
    private final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase;
    private final int phaseProgress;
    private final float phaseWeight;
    private final int totalProgress;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.OTAStatus copy$default(powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus, int i, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase otaProcessPhase, float f, int i2, java.lang.Throwable th, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = oTAStatus.phaseProgress;
        }
        if ((i3 & 2) != 0) {
            otaProcessPhase = oTAStatus.phase;
        }
        powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase otaProcessPhase2 = otaProcessPhase;
        if ((i3 & 4) != 0) {
            f = oTAStatus.phaseWeight;
        }
        float f2 = f;
        if ((i3 & 8) != 0) {
            i2 = oTAStatus.totalProgress;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            th = oTAStatus.otaError;
        }
        return oTAStatus.copy(i, otaProcessPhase2, f2, i4, th);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPhaseProgress() {
        return this.phaseProgress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase getPhase() {
        return this.phase;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPhaseWeight() {
        return this.phaseWeight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalProgress() {
        return this.totalProgress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.Throwable getOtaError() {
        return this.otaError;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OTAStatus copy(int phaseProgress, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase, float phaseWeight, int totalProgress, java.lang.Throwable otaError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        return new powerwatch.matrix.com.pwgen2android.main.OTAStatus(phaseProgress, phase, phaseWeight, totalProgress, otaError);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.OTAStatus)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus = (powerwatch.matrix.com.pwgen2android.main.OTAStatus) other;
        return this.phaseProgress == oTAStatus.phaseProgress && kotlin.jvm.internal.Intrinsics.areEqual(this.phase, oTAStatus.phase) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.phaseWeight), (java.lang.Object) java.lang.Float.valueOf(oTAStatus.phaseWeight)) && this.totalProgress == oTAStatus.totalProgress && kotlin.jvm.internal.Intrinsics.areEqual(this.otaError, oTAStatus.otaError);
    }

    public int hashCode() {
        int iHashCode = ((((((this.phaseProgress * 31) + this.phase.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.phaseWeight)) * 31) + this.totalProgress) * 31;
        java.lang.Throwable th = this.otaError;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    public java.lang.String toString() {
        return "OTAStatus(phaseProgress=" + this.phaseProgress + ", phase=" + this.phase + ", phaseWeight=" + this.phaseWeight + ", totalProgress=" + this.totalProgress + ", otaError=" + this.otaError + ')';
    }

    public OTAStatus(int i, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase phase, float f, int i2, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phase, "phase");
        this.phaseProgress = i;
        this.phase = phase;
        this.phaseWeight = f;
        this.totalProgress = i2;
        this.otaError = th;
    }

    public /* synthetic */ OTAStatus(int i, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase otaProcessPhase, float f, int i2, java.lang.Throwable th, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, otaProcessPhase, (i3 & 4) != 0 ? 1.0f : f, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : th);
    }

    public final java.lang.Throwable getOtaError() {
        return this.otaError;
    }

    public final powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase getPhase() {
        return this.phase;
    }

    public final int getPhaseProgress() {
        return this.phaseProgress;
    }

    public final float getPhaseWeight() {
        return this.phaseWeight;
    }

    public final int getTotalProgress() {
        return this.totalProgress;
    }
}
