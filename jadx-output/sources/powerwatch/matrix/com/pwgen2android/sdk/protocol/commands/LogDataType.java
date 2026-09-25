package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: TraceLogger.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "", "()V", "Accel", "Header", "HeartRate", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class LogDataType {
    public /* synthetic */ LogDataType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: TraceLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Header;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Header extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Header();

        private Header() {
            super(null);
        }
    }

    private LogDataType() {
    }

    /* JADX INFO: compiled from: TraceLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$Accel;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Accel extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.Accel();

        private Accel() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: TraceLogger.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType$HeartRate;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/LogDataType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class HeartRate extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.LogDataType.HeartRate();

        private HeartRate() {
            super(null);
        }
    }
}
