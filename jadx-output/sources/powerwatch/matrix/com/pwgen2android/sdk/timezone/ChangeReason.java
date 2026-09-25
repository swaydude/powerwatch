package powerwatch.matrix.com.pwgen2android.sdk.timezone;

/* JADX INFO: compiled from: TimezoneListener.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;", "", "()V", "TimeChange", "TimeZoneChange", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeZoneChange;", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeChange;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ChangeReason {
    public /* synthetic */ ChangeReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: TimezoneListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeZoneChange;", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TimeZoneChange extends powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason {
        public static final powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeZoneChange INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeZoneChange();

        private TimeZoneChange() {
            super(null);
        }
    }

    private ChangeReason() {
    }

    /* JADX INFO: compiled from: TimezoneListener.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason$TimeChange;", "Lpowerwatch/matrix/com/pwgen2android/sdk/timezone/ChangeReason;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TimeChange extends powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason {
        public static final powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeChange INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.timezone.ChangeReason.TimeChange();

        private TimeChange() {
            super(null);
        }
    }
}
