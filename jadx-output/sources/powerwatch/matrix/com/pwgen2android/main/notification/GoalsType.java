package powerwatch.matrix.com.pwgen2android.main.notification;

/* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;", "", "storeKey", "", "(Ljava/lang/String;)V", "getStoreKey", "()Ljava/lang/String;", "Calories", "Power", "Sleep", "Steps", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class GoalsType {
    private final java.lang.String storeKey;

    public /* synthetic */ GoalsType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Steps;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Steps extends powerwatch.matrix.com.pwgen2android.main.notification.GoalsType {
        public static final powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Steps INSTANCE = new powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Steps();

        private Steps() {
            super("goals_steps_hit", null);
        }
    }

    private GoalsType(java.lang.String str) {
        this.storeKey = str;
    }

    public final java.lang.String getStoreKey() {
        return this.storeKey;
    }

    /* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Sleep;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Sleep extends powerwatch.matrix.com.pwgen2android.main.notification.GoalsType {
        public static final powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Sleep INSTANCE = new powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Sleep();

        private Sleep() {
            super("goals_sleep_hit", null);
        }
    }

    /* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Calories;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Calories extends powerwatch.matrix.com.pwgen2android.main.notification.GoalsType {
        public static final powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Calories INSTANCE = new powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Calories();

        private Calories() {
            super("goals_calories_hit", null);
        }
    }

    /* JADX INFO: compiled from: ConnectionNotificationPersistence.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType$Power;", "Lpowerwatch/matrix/com/pwgen2android/main/notification/GoalsType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Power extends powerwatch.matrix.com.pwgen2android.main.notification.GoalsType {
        public static final powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Power INSTANCE = new powerwatch.matrix.com.pwgen2android.main.notification.GoalsType.Power();

        private Power() {
            super("goals_power_hit", null);
        }
    }
}
