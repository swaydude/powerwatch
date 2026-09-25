package powerwatch.matrix.com.pwgen2android.main.battery;

/* JADX INFO: compiled from: BatteryNotificationPersistence.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", "", "threshold", "", "(F)V", "getThreshold", "()F", "Companion", "Critical", "Low", "Normal", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Normal;", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BatteryChangeLevel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Companion(null);
    private final float threshold;

    public /* synthetic */ BatteryChangeLevel(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* JADX INFO: compiled from: BatteryNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Normal;", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Normal extends powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel {
        public static final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Normal INSTANCE = new powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Normal();

        private Normal() {
            super(100.0f, null);
        }
    }

    private BatteryChangeLevel(float f) {
        this.threshold = f;
    }

    public final float getThreshold() {
        return this.threshold;
    }

    /* JADX INFO: compiled from: BatteryNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Low;", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Low extends powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel {
        public static final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Low INSTANCE = new powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Low();

        private Low() {
            super(10.0f, null);
        }
    }

    /* JADX INFO: compiled from: BatteryNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Critical;", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Critical extends powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel {
        public static final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Critical INSTANCE = new powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Critical();

        private Critical() {
            super(5.0f, null);
        }
    }

    /* JADX INFO: compiled from: BatteryNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel$Companion;", "", "()V", "getLevel", "Lpowerwatch/matrix/com/pwgen2android/main/battery/BatteryChangeLevel;", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel getLevel(float level) {
            if (level <= powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Critical.INSTANCE.getThreshold()) {
                return powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Critical.INSTANCE;
            }
            return level <= powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Low.INSTANCE.getThreshold() ? powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Low.INSTANCE : powerwatch.matrix.com.pwgen2android.main.battery.BatteryChangeLevel.Normal.INSTANCE;
        }
    }
}
