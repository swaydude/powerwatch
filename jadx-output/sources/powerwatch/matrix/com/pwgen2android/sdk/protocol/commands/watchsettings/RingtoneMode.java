package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2RingtoneCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;", "", "mode", "", "(B)V", "getMode", "()B", "Double", "Single", "Triple", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Double;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Triple;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class RingtoneMode {
    private final byte mode;

    public /* synthetic */ RingtoneMode(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: compiled from: Gen2RingtoneCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Single;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Single extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Single INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Single();

        private Single() {
            super((byte) 0, null);
        }
    }

    private RingtoneMode(byte b) {
        this.mode = b;
    }

    public final byte getMode() {
        return this.mode;
    }

    /* JADX INFO: compiled from: Gen2RingtoneCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Double;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Double extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Double INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Double();

        private Double() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2RingtoneCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode$Triple;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/RingtoneMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Triple extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Triple INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.RingtoneMode.Triple();

        private Triple() {
            super((byte) 2, null);
        }
    }
}
