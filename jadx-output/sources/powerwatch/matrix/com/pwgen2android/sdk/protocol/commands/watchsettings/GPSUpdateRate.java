package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings;

/* JADX INFO: compiled from: Gen2GPSUpdateRateCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "", "rate", "", "(B)V", "getRate", "()B", "Auto", "Timed10Sec", "Timed1Sec", "Timed2Sec", "Timed5Sec", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Auto;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed1Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed2Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed5Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed10Sec;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class GPSUpdateRate {
    private final byte rate;

    public /* synthetic */ GPSUpdateRate(byte b, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    /* JADX INFO: compiled from: Gen2GPSUpdateRateCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Auto;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Auto extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Auto INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Auto();

        private Auto() {
            super((byte) 0, null);
        }
    }

    private GPSUpdateRate(byte b) {
        this.rate = b;
    }

    public final byte getRate() {
        return this.rate;
    }

    /* JADX INFO: compiled from: Gen2GPSUpdateRateCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed1Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Timed1Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed1Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed1Sec();

        private Timed1Sec() {
            super((byte) 1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2GPSUpdateRateCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed2Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Timed2Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed2Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed2Sec();

        private Timed2Sec() {
            super((byte) 2, null);
        }
    }

    /* JADX INFO: compiled from: Gen2GPSUpdateRateCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed5Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Timed5Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed5Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed5Sec();

        private Timed5Sec() {
            super((byte) 3, null);
        }
    }

    /* JADX INFO: compiled from: Gen2GPSUpdateRateCommand.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate$Timed10Sec;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/watchsettings/GPSUpdateRate;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Timed10Sec extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed10Sec INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.watchsettings.GPSUpdateRate.Timed10Sec();

        private Timed10Sec() {
            super((byte) 4, null);
        }
    }
}
