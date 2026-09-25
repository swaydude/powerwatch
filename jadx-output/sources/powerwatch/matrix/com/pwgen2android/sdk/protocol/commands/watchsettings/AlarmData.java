package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2AlarmCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmData;", "", "hour", "", "minute", "isAM", "", "daySelection", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;", "alarmControl", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;", "(BBZLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;)V", "getAlarmControl", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/AlarmControl;", "getDaySelection", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DaySelection;", "getHour", "()B", "()Z", "getMinute", "component1", "component2", "component3", "component4", "component5", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AlarmData {
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl alarmControl;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection;
    private final byte hour;
    private final boolean isAM;
    private final byte minute;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmData, byte b, byte b2, boolean z, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl alarmControl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            b = alarmData.hour;
        }
        if ((i & 2) != 0) {
            b2 = alarmData.minute;
        }
        byte b3 = b2;
        if ((i & 4) != 0) {
            z = alarmData.isAM;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            daySelection = alarmData.daySelection;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection2 = daySelection;
        if ((i & 16) != 0) {
            alarmControl = alarmData.alarmControl;
        }
        return alarmData.copy(b, b3, z2, daySelection2, alarmControl);
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
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection getDaySelection() {
        return this.daySelection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl getAlarmControl() {
        return this.alarmControl;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData copy(byte hour, byte minute, boolean isAM, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl alarmControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySelection, "daySelection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmControl, "alarmControl");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData(hour, minute, isAM, daySelection, alarmControl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData alarmData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmData) other;
        return this.hour == alarmData.hour && this.minute == alarmData.minute && this.isAM == alarmData.isAM && kotlin.jvm.internal.Intrinsics.areEqual(this.daySelection, alarmData.daySelection) && kotlin.jvm.internal.Intrinsics.areEqual(this.alarmControl, alarmData.alarmControl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int i = ((this.hour * 31) + this.minute) * 31;
        boolean z = this.isAM;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((i + r1) * 31) + this.daySelection.hashCode()) * 31) + this.alarmControl.hashCode();
    }

    public java.lang.String toString() {
        return "AlarmData(hour=" + ((int) this.hour) + ", minute=" + ((int) this.minute) + ", isAM=" + this.isAM + ", daySelection=" + this.daySelection + ", alarmControl=" + this.alarmControl + ')';
    }

    public AlarmData(byte b, byte b2, boolean z, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection daySelection, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl alarmControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daySelection, "daySelection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmControl, "alarmControl");
        this.hour = b;
        this.minute = b2;
        this.isAM = z;
        this.daySelection = daySelection;
        this.alarmControl = alarmControl;
    }

    public final byte getHour() {
        return this.hour;
    }

    public final byte getMinute() {
        return this.minute;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DaySelection getDaySelection() {
        return this.daySelection;
    }

    public final boolean isAM() {
        return this.isAM;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.AlarmControl getAlarmControl() {
        return this.alarmControl;
    }
}
