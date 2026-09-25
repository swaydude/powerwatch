package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlarmsCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;", "", "hour", "", "minute", "repeat", "Ljava/util/ArrayList;", "(IILjava/util/ArrayList;)V", "getHour", "()I", "getMinute", "getRepeat", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Alarm {
    private final int hour;
    private final int minute;
    private final java.util.ArrayList<java.lang.Integer> repeat;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm copy$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm, int i, int i2, java.util.ArrayList arrayList, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = alarm.hour;
        }
        if ((i3 & 2) != 0) {
            i2 = alarm.minute;
        }
        if ((i3 & 4) != 0) {
            arrayList = alarm.repeat;
        }
        return alarm.copy(i, i2, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    public final java.util.ArrayList<java.lang.Integer> component3() {
        return this.repeat;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm copy(int hour, int minute, java.util.ArrayList<java.lang.Integer> repeat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeat, "repeat");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm(hour, minute, repeat);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm) other;
        return this.hour == alarm.hour && this.minute == alarm.minute && kotlin.jvm.internal.Intrinsics.areEqual(this.repeat, alarm.repeat);
    }

    public int hashCode() {
        return (((this.hour * 31) + this.minute) * 31) + this.repeat.hashCode();
    }

    public java.lang.String toString() {
        return "Alarm(hour=" + this.hour + ", minute=" + this.minute + ", repeat=" + this.repeat + ')';
    }

    public Alarm(int i, int i2, java.util.ArrayList<java.lang.Integer> repeat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeat, "repeat");
        this.hour = i;
        this.minute = i2;
        this.repeat = repeat;
    }

    public /* synthetic */ Alarm(int i, int i2, java.util.ArrayList arrayList, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? new java.util.ArrayList(7) : arrayList);
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final java.util.ArrayList<java.lang.Integer> getRepeat() {
        return this.repeat;
    }
}
