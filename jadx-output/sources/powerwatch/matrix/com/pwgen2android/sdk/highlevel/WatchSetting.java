package powerwatch.matrix.com.pwgen2android.sdk.highlevel;

/* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "", "deviceID", "", "(Ljava/lang/String;)V", "getDeviceID", "()Ljava/lang/String;", "Biometrics", "Goals", "Language", "SleepTime", "Units", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class WatchSetting {
    private final java.lang.String deviceID;

    public /* synthetic */ WatchSetting(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private WatchSetting(java.lang.String str) {
        this.deviceID = str;
    }

    public /* synthetic */ WatchSetting(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, null);
    }

    public final java.lang.String getDeviceID() {
        return this.deviceID;
    }

    /* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Units;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "deviceID", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;)V", "getUser", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Units extends powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting {
        private final powerwatch.matrix.com.pwgen2android.shared.data.models.User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Units(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
            this.user = user;
        }

        public /* synthetic */ Units(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(user, (i & 2) != 0 ? null : str);
        }

        public final powerwatch.matrix.com.pwgen2android.shared.data.models.User getUser() {
            return this.user;
        }
    }

    /* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Biometrics;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "deviceID", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/lang/String;)V", "getUser", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Biometrics extends powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting {
        private final powerwatch.matrix.com.pwgen2android.shared.data.models.User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Biometrics(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
            this.user = user;
        }

        public /* synthetic */ Biometrics(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(user, (i & 2) != 0 ? null : str);
        }

        public final powerwatch.matrix.com.pwgen2android.shared.data.models.User getUser() {
            return this.user;
        }
    }

    /* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Goals;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "goals", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "deviceID", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;Ljava/lang/String;)V", "getGoals", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Goals extends powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting {
        private final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Goals(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goals, java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
            this.goals = goals;
        }

        public /* synthetic */ Goals(powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(goalConfiguration, (i & 2) != 0 ? null : str);
        }

        public final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration getGoals() {
            return this.goals;
        }
    }

    /* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$Language;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "locale", "Ljava/util/Locale;", "deviceID", "", "(Ljava/util/Locale;Ljava/lang/String;)V", "getLocale", "()Ljava/util/Locale;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Language extends powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting {
        private final java.util.Locale locale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Language(java.util.Locale locale, java.lang.String str) {
            super(null, 1, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
            this.locale = locale;
        }

        public /* synthetic */ Language(java.util.Locale locale, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(locale, (i & 2) != 0 ? null : str);
        }

        public final java.util.Locale getLocale() {
            return this.locale;
        }
    }

    /* JADX INFO: compiled from: SettingsLiteCommunicator.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting$SleepTime;", "Lpowerwatch/matrix/com/pwgen2android/sdk/highlevel/WatchSetting;", "user", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "locale", "Ljava/util/Locale;", "goals", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "sleepTime", "", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;Ljava/util/Locale;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;I)V", "getGoals", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/GoalConfiguration;", "getLocale", "()Ljava/util/Locale;", "getSleepTime", "()I", "getUser", "()Lpowerwatch/matrix/com/pwgen2android/shared/data/models/User;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepTime extends powerwatch.matrix.com.pwgen2android.sdk.highlevel.WatchSetting {
        private final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goals;
        private final java.util.Locale locale;
        private final int sleepTime;
        private final powerwatch.matrix.com.pwgen2android.shared.data.models.User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SleepTime(powerwatch.matrix.com.pwgen2android.shared.data.models.User user, java.util.Locale locale, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goals, int i) {
            super(null, 1, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "user");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "goals");
            this.user = user;
            this.locale = locale;
            this.goals = goals;
            this.sleepTime = i;
        }

        public final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration getGoals() {
            return this.goals;
        }

        public final java.util.Locale getLocale() {
            return this.locale;
        }

        public final int getSleepTime() {
            return this.sleepTime;
        }

        public final powerwatch.matrix.com.pwgen2android.shared.data.models.User getUser() {
            return this.user;
        }
    }
}
