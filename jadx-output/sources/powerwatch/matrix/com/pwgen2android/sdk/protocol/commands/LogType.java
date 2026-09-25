package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "", "enumValue", "", "(I)V", "getEnumValue", "()I", "AwakeBike", "AwakeRunning", "AwakeStill", "AwakeVehicle", "AwakeWalking", "DevOffWrist", "SleepDeep", "SleepLight", "SleepRestless", "StateUnknown", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$StateUnknown;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class LogType {
    private final int enumValue;

    public /* synthetic */ LogType(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$DevOffWrist;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DevOffWrist extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.DevOffWrist INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.DevOffWrist();

        private DevOffWrist() {
            super(0, null);
        }
    }

    private LogType(int i) {
        this.enumValue = i;
    }

    public final int getEnumValue() {
        return this.enumValue;
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepDeep;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepDeep extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepDeep INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepDeep();

        private SleepDeep() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepLight;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepLight extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepLight INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepLight();

        private SleepLight() {
            super(2, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$SleepRestless;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SleepRestless extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepRestless INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.SleepRestless();

        private SleepRestless() {
            super(3, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeStill;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AwakeStill extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeStill INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeStill();

        private AwakeStill() {
            super(4, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeWalking;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AwakeWalking extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeWalking INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeWalking();

        private AwakeWalking() {
            super(5, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeRunning;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AwakeRunning extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeRunning INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeRunning();

        private AwakeRunning() {
            super(6, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeBike;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AwakeBike extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeBike INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeBike();

        private AwakeBike() {
            super(7, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$AwakeVehicle;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AwakeVehicle extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeVehicle INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.AwakeVehicle();

        private AwakeVehicle() {
            super(8, null);
        }
    }

    /* JADX INFO: compiled from: Gen2BackgroundLogCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType$StateUnknown;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StateUnknown extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.StateUnknown INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogType.StateUnknown();

        private StateUnknown() {
            super(9, null);
        }
    }
}
