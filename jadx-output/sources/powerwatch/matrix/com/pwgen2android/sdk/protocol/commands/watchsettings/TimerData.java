package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2TimerCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerData;", "", "hour", "", "minute", "seconds", "timerControl", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;", "(BBBLpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;)V", "getHour", "()B", "getMinute", "getSeconds", "getTimerControl", "()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/TimerControl;", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TimerData {
    private final byte hour;
    private final byte minute;
    private final byte seconds;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl timerControl;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData timerData, byte b, byte b2, byte b3, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl timerControl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            b = timerData.hour;
        }
        if ((i & 2) != 0) {
            b2 = timerData.minute;
        }
        if ((i & 4) != 0) {
            b3 = timerData.seconds;
        }
        if ((i & 8) != 0) {
            timerControl = timerData.timerControl;
        }
        return timerData.copy(b, b2, b3, timerControl);
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
    public final byte getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl getTimerControl() {
        return this.timerControl;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData copy(byte hour, byte minute, byte seconds, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl timerControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerControl, "timerControl");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData(hour, minute, seconds, timerControl);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData timerData = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerData) other;
        return this.hour == timerData.hour && this.minute == timerData.minute && this.seconds == timerData.seconds && kotlin.jvm.internal.Intrinsics.areEqual(this.timerControl, timerData.timerControl);
    }

    public int hashCode() {
        return (((((this.hour * 31) + this.minute) * 31) + this.seconds) * 31) + this.timerControl.hashCode();
    }

    public java.lang.String toString() {
        return "TimerData(hour=" + ((int) this.hour) + ", minute=" + ((int) this.minute) + ", seconds=" + ((int) this.seconds) + ", timerControl=" + this.timerControl + ')';
    }

    public TimerData(byte b, byte b2, byte b3, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl timerControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timerControl, "timerControl");
        this.hour = b;
        this.minute = b2;
        this.seconds = b3;
        this.timerControl = timerControl;
    }

    public final byte getHour() {
        return this.hour;
    }

    public final byte getMinute() {
        return this.minute;
    }

    public final byte getSeconds() {
        return this.seconds;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.TimerControl getTimerControl() {
        return this.timerControl;
    }
}
