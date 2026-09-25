package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2DNDCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;", "", "mode", "", "(B)V", "getMode", "()B", "AUTO", "OFF", "ON", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$OFF;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$ON;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$AUTO;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DNDMode {
    private final byte mode;

    public /* synthetic */ DNDMode(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: compiled from: Gen2DNDCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$OFF;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OFF extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.OFF INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.OFF();

        private OFF() {
            super((byte) 0, null);
        }
    }

    private DNDMode(byte b) {
        this.mode = b;
    }

    public final byte getMode() {
        return this.mode;
    }

    /* JADX INFO: compiled from: Gen2DNDCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$ON;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ON extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.ON INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.ON();

        private ON() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2DNDCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode$AUTO;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/DNDMode;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AUTO extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.AUTO INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.DNDMode.AUTO();

        private AUTO() {
            super((byte) 2, null);
        }
    }
}
