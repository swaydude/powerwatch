package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\f\r\u000eB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "ActivityDeltaLogSizeMismatch", "ActivityEndLogSizeMismatch", "ActivityStartLogSizeMismatch", "BackgroundLogEntryWithUnknownType", "BackgroundLogSizeMismatch", "InvalidBackLogTimestampIndex", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class DTPProtocolParsingError extends java.lang.Throwable {
    private final int code;

    public /* synthetic */ DTPProtocolParsingError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityStartLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActivityStartLogSizeMismatch extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityStartLogSizeMismatch();

        private ActivityStartLogSizeMismatch() {
            super("ActivityStartLog parsing error: Log size mismatch", 1, null);
        }
    }

    private DTPProtocolParsingError(java.lang.String str, int i) {
        super(str);
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityDeltaLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActivityDeltaLogSizeMismatch extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityDeltaLogSizeMismatch();

        private ActivityDeltaLogSizeMismatch() {
            super("ActivityDeltaLog parsing error: Log size mismatch", 2, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$ActivityEndLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ActivityEndLogSizeMismatch extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.ActivityEndLogSizeMismatch();

        private ActivityEndLogSizeMismatch() {
            super("ActivityEndLog parsing error: Log size mismatch", 3, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogSizeMismatch;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BackgroundLogSizeMismatch extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogSizeMismatch();

        private BackgroundLogSizeMismatch() {
            super("BackgroundLog parsing error: Log size mismatch", 4, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$InvalidBackLogTimestampIndex;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class InvalidBackLogTimestampIndex extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.InvalidBackLogTimestampIndex();

        private InvalidBackLogTimestampIndex() {
            super("BackgroundLog index error", 5, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError$BackgroundLogEntryWithUnknownType;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DTPProtocolParsingError;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BackgroundLogEntryWithUnknownType extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogEntryWithUnknownType INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DTPProtocolParsingError.BackgroundLogEntryWithUnknownType();

        private BackgroundLogEntryWithUnknownType() {
            super("BackgroundLog with unknown type", 6, null);
        }
    }
}
