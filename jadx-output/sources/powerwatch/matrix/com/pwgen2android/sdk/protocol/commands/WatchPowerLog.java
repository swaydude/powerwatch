package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchPowerLog;", "", "caseTemp", "", "skinTemp", "thermalGen", "solarGen", "powerConsumed", "(IIIII)V", "getCaseTemp", "()I", "setCaseTemp", "(I)V", "getPowerConsumed", "setPowerConsumed", "getSkinTemp", "setSkinTemp", "getSolarGen", "setSolarGen", "getThermalGen", "setThermalGen", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WatchPowerLog {
    private int caseTemp;
    private int powerConsumed;
    private int skinTemp;
    private int solarGen;
    private int thermalGen;

    public WatchPowerLog() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog, int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            i = watchPowerLog.caseTemp;
        }
        if ((i6 & 2) != 0) {
            i2 = watchPowerLog.skinTemp;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = watchPowerLog.thermalGen;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = watchPowerLog.solarGen;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = watchPowerLog.powerConsumed;
        }
        return watchPowerLog.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCaseTemp() {
        return this.caseTemp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSkinTemp() {
        return this.skinTemp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getThermalGen() {
        return this.thermalGen;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSolarGen() {
        return this.solarGen;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPowerConsumed() {
        return this.powerConsumed;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog copy(int caseTemp, int skinTemp, int thermalGen, int solarGen, int powerConsumed) {
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog(caseTemp, skinTemp, thermalGen, solarGen, powerConsumed);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog watchPowerLog = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.WatchPowerLog) other;
        return this.caseTemp == watchPowerLog.caseTemp && this.skinTemp == watchPowerLog.skinTemp && this.thermalGen == watchPowerLog.thermalGen && this.solarGen == watchPowerLog.solarGen && this.powerConsumed == watchPowerLog.powerConsumed;
    }

    public int hashCode() {
        return (((((((this.caseTemp * 31) + this.skinTemp) * 31) + this.thermalGen) * 31) + this.solarGen) * 31) + this.powerConsumed;
    }

    public java.lang.String toString() {
        return "WatchPowerLog(caseTemp=" + this.caseTemp + ", skinTemp=" + this.skinTemp + ", thermalGen=" + this.thermalGen + ", solarGen=" + this.solarGen + ", powerConsumed=" + this.powerConsumed + ')';
    }

    public WatchPowerLog(int i, int i2, int i3, int i4, int i5) {
        this.caseTemp = i;
        this.skinTemp = i2;
        this.thermalGen = i3;
        this.solarGen = i4;
        this.powerConsumed = i5;
    }

    public /* synthetic */ WatchPowerLog(int i, int i2, int i3, int i4, int i5, int i6, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }

    public final int getCaseTemp() {
        return this.caseTemp;
    }

    public final int getSkinTemp() {
        return this.skinTemp;
    }

    public final void setCaseTemp(int i) {
        this.caseTemp = i;
    }

    public final void setSkinTemp(int i) {
        this.skinTemp = i;
    }

    public final int getSolarGen() {
        return this.solarGen;
    }

    public final int getThermalGen() {
        return this.thermalGen;
    }

    public final void setSolarGen(int i) {
        this.solarGen = i;
    }

    public final void setThermalGen(int i) {
        this.thermalGen = i;
    }

    public final int getPowerConsumed() {
        return this.powerConsumed;
    }

    public final void setPowerConsumed(int i) {
        this.powerConsumed = i;
    }
}
