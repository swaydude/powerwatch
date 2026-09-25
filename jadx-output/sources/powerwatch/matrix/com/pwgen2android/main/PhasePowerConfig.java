package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OtaProcessExecutorImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/PhasePowerConfig;", "", "downloadExecutorPower", "", "syncExecutorPower", "otaExecutorPower", "(FFF)V", "getDownloadExecutorPower", "()F", "getOtaExecutorPower", "getSyncExecutorPower", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PhasePowerConfig {
    private final float downloadExecutorPower;
    private final float otaExecutorPower;
    private final float syncExecutorPower;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig copy$default(powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig phasePowerConfig, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = phasePowerConfig.downloadExecutorPower;
        }
        if ((i & 2) != 0) {
            f2 = phasePowerConfig.syncExecutorPower;
        }
        if ((i & 4) != 0) {
            f3 = phasePowerConfig.otaExecutorPower;
        }
        return phasePowerConfig.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getDownloadExecutorPower() {
        return this.downloadExecutorPower;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSyncExecutorPower() {
        return this.syncExecutorPower;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getOtaExecutorPower() {
        return this.otaExecutorPower;
    }

    public final powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig copy(float downloadExecutorPower, float syncExecutorPower, float otaExecutorPower) {
        return new powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig(downloadExecutorPower, syncExecutorPower, otaExecutorPower);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig phasePowerConfig = (powerwatch.matrix.com.pwgen2android.main.PhasePowerConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.downloadExecutorPower), (java.lang.Object) java.lang.Float.valueOf(phasePowerConfig.downloadExecutorPower)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.syncExecutorPower), (java.lang.Object) java.lang.Float.valueOf(phasePowerConfig.syncExecutorPower)) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) java.lang.Float.valueOf(this.otaExecutorPower), (java.lang.Object) java.lang.Float.valueOf(phasePowerConfig.otaExecutorPower));
    }

    public int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.downloadExecutorPower) * 31) + java.lang.Float.floatToIntBits(this.syncExecutorPower)) * 31) + java.lang.Float.floatToIntBits(this.otaExecutorPower);
    }

    public java.lang.String toString() {
        return "PhasePowerConfig(downloadExecutorPower=" + this.downloadExecutorPower + ", syncExecutorPower=" + this.syncExecutorPower + ", otaExecutorPower=" + this.otaExecutorPower + ')';
    }

    public PhasePowerConfig(float f, float f2, float f3) {
        this.downloadExecutorPower = f;
        this.syncExecutorPower = f2;
        this.otaExecutorPower = f3;
    }

    public final float getDownloadExecutorPower() {
        return this.downloadExecutorPower;
    }

    public final float getOtaExecutorPower() {
        return this.otaExecutorPower;
    }

    public final float getSyncExecutorPower() {
        return this.syncExecutorPower;
    }
}
