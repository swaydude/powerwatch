package powerwatch.matrix.com.pwgen2android.shared.data.providers;

/* JADX INFO: compiled from: SettingsDataRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/data/providers/AlarmSaveData;", "", "hour", "", "minute", "isAM", "", "daySelection", "", "alarmControl", "(BBZII)V", "getAlarmControl", "()I", "getDaySelection", "getHour", "()B", "()Z", "getMinute", "component1", "component2", "component3", "component4", "component5", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AlarmSaveData {
    private final int alarmControl;
    private final int daySelection;
    private final byte hour;
    private final boolean isAM;
    private final byte minute;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData copy$default(powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData alarmSaveData, byte b, byte b2, boolean z, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            b = alarmSaveData.hour;
        }
        if ((i3 & 2) != 0) {
            b2 = alarmSaveData.minute;
        }
        byte b3 = b2;
        if ((i3 & 4) != 0) {
            z = alarmSaveData.isAM;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            i = alarmSaveData.daySelection;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = alarmSaveData.alarmControl;
        }
        return alarmSaveData.copy(b, b3, z2, i4, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte getMinute() {
        return this.minute;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAM() {
        return this.isAM;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDaySelection() {
        return this.daySelection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAlarmControl() {
        return this.alarmControl;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData copy(byte hour, byte minute, boolean isAM, int daySelection, int alarmControl) {
        return new powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData(hour, minute, isAM, daySelection, alarmControl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData alarmSaveData = (powerwatch.matrix.com.pwgen2android.shared.data.providers.AlarmSaveData) other;
        return this.hour == alarmSaveData.hour && this.minute == alarmSaveData.minute && this.isAM == alarmSaveData.isAM && this.daySelection == alarmSaveData.daySelection && this.alarmControl == alarmSaveData.alarmControl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int i = ((this.hour * 31) + this.minute) * 31;
        boolean z = this.isAM;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((i + r1) * 31) + this.daySelection) * 31) + this.alarmControl;
    }

    public java.lang.String toString() {
        return "AlarmSaveData(hour=" + ((int) this.hour) + ", minute=" + ((int) this.minute) + ", isAM=" + this.isAM + ", daySelection=" + this.daySelection + ", alarmControl=" + this.alarmControl + ')';
    }

    public AlarmSaveData(byte b, byte b2, boolean z, int i, int i2) {
        this.hour = b;
        this.minute = b2;
        this.isAM = z;
        this.daySelection = i;
        this.alarmControl = i2;
    }

    public final byte getHour() {
        return this.hour;
    }

    public final byte getMinute() {
        return this.minute;
    }

    public final int getDaySelection() {
        return this.daySelection;
    }

    public final boolean isAM() {
        return this.isAM;
    }

    public final int getAlarmControl() {
        return this.alarmControl;
    }
}
