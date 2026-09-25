package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "SyncLocked", "Unknown", "WatchBusy", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DTPProtocolError extends java.lang.Throwable {
    public /* synthetic */ DTPProtocolError(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$SyncLocked;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SyncLocked extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.SyncLocked();

        private SyncLocked() {
            super("Error: activity is in progress", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.LOCKED.INSTANCE.getStringCode(), null);
        }
    }

    private DTPProtocolError(java.lang.String str, java.lang.String str2) {
        super(str);
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$WatchBusy;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WatchBusy extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.WatchBusy();

        private WatchBusy() {
            super("Watch is busy, sync not available", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.WAIT.INSTANCE.getStringCode(), null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError$Unknown;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Unknown extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.Unknown INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolError.Unknown();

        private Unknown() {
            super("Error: Unknown", powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.UNKNOWN.INSTANCE.getStringCode(), null);
        }
    }
}
