package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "ClockFonts", "FontCoreLib", "FontLookupTable", "Gauges", "Icons", "UserLocation1", "UserLocation2", "UserLocation3", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontCoreLib;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$ClockFonts;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Gauges;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Icons;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation1;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation2;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation3;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontLookupTable;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class FontType {
    private java.lang.String name;

    public /* synthetic */ FontType(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontCoreLib;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FontCoreLib extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.FontCoreLib INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.FontCoreLib();

        private FontCoreLib() {
            super("FONT_CORE_LIB", null);
        }
    }

    private FontType(java.lang.String str) {
        this.name = str;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final void setName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$ClockFonts;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ClockFonts extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.ClockFonts INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.ClockFonts();

        private ClockFonts() {
            super("CLOCK_FONTS", null);
        }
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Gauges;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Gauges extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.Gauges INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.Gauges();

        private Gauges() {
            super("CLOCK_FONTS", null);
        }
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$Icons;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Icons extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.Icons INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.Icons();

        private Icons() {
            super("ICONS", null);
        }
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation1;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UserLocation1 extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation1 INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation1();

        private UserLocation1() {
            super("USER_LOCATION_1", null);
        }
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation2;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UserLocation2 extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation2 INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation2();

        private UserLocation2() {
            super("USER_LOCATION_2", null);
        }
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$UserLocation3;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UserLocation3 extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation3 INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.UserLocation3();

        private UserLocation3() {
            super("USER_LOCATION_3", null);
        }
    }

    /* JADX INFO: compiled from: Commands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType$FontLookupTable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class FontLookupTable extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.FontLookupTable INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontType.FontLookupTable();

        private FontLookupTable() {
            super("FONT_LOOKUP_TABLE", null);
        }
    }
}
