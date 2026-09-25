package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2HomeScreenCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "", "mode", "", "(B)V", "getMode", "()B", "Power", "SleepHR", "StepsCalories", "Temperature", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$StepsCalories;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$SleepHR;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Temperature;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Power;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class HomeScreenMode {
    private final byte mode;

    public /* synthetic */ HomeScreenMode(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: compiled from: Gen2HomeScreenCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$StepsCalories;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StepsCalories extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.StepsCalories INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.StepsCalories();

        private StepsCalories() {
            super((byte) 0, null);
        }
    }

    private HomeScreenMode(byte b) {
        this.mode = b;
    }

    public final byte getMode() {
        return this.mode;
    }

    /* JADX INFO: compiled from: Gen2HomeScreenCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$SleepHR;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepHR extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.SleepHR INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.SleepHR();

        private SleepHR() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2HomeScreenCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Temperature;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Temperature extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Temperature INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Temperature();

        private Temperature() {
            super((byte) 2, null);
        }
    }

    /* JADX INFO: compiled from: Gen2HomeScreenCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode$Power;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/HomeScreenMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Power extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Power INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.HomeScreenMode.Power();

        private Power() {
            super((byte) 3, null);
        }
    }
}
