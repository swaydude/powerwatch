package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status;", "", "statusCode", "", "(I)V", "getStatusCode", "()I", "AppSync", "Auto", "GPSSync", "Unknown", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$Auto;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$AppSync;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$GPSSync;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Status {
    private final int statusCode;

    public /* synthetic */ Status(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.Unknown INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.Unknown();

        private Unknown() {
            super(0, null);
        }
    }

    private Status(int i) {
        this.statusCode = i;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$Auto;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Auto extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.Auto INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.Auto();

        private Auto() {
            super(1, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$AppSync;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AppSync extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.AppSync INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.AppSync();

        private AppSync() {
            super(2, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status$GPSSync;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/Status;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class GPSSync extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.GPSSync INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.Status.GPSSync();

        private GPSSync() {
            super(3, null);
        }
    }
}
