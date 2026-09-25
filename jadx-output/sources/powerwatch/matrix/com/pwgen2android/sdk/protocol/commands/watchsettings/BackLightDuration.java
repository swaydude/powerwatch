package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: BacklightCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;", "", "duration", "", "(B)V", "getDuration", "()B", "timed10Sec", "timed2Sec", "timed5Sec", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed2Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed5Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed10Sec;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class BackLightDuration {
    private final byte duration;

    public /* synthetic */ BackLightDuration(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: compiled from: BacklightCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed2Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class timed2Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed2Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed2Sec();

        private timed2Sec() {
            super((byte) 0, null);
        }
    }

    private BackLightDuration(byte b) {
        this.duration = b;
    }

    public final byte getDuration() {
        return this.duration;
    }

    /* JADX INFO: compiled from: BacklightCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed5Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class timed5Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed5Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed5Sec();

        private timed5Sec() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: BacklightCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration$timed10Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/BackLightDuration;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class timed10Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed10Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.BackLightDuration.timed10Sec();

        private timed10Sec() {
            super((byte) 2, null);
        }
    }
}
