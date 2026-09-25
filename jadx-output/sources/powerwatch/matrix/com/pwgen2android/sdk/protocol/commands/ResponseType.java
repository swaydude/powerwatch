package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Gen2Comands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0006\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "", "stringCode", "", "hex", "", "(Ljava/lang/String;I)V", "getHex", "()I", "getStringCode", "()Ljava/lang/String;", "ERROR", "LOCKED", "PROCESSING", "SUCCESS", "UNKNOWN", "WAIT", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class ResponseType {
    private final int hex;
    private final java.lang.String stringCode;

    public /* synthetic */ ResponseType(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    private ResponseType(java.lang.String str, int i) {
        this.stringCode = str;
        this.hex = i;
    }

    public final int getHex() {
        return this.hex;
    }

    public final java.lang.String getStringCode() {
        return this.stringCode;
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$SUCCESS;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SUCCESS extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.SUCCESS INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.SUCCESS();

        private SUCCESS() {
            super("E200", 57856, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$ERROR;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ERROR extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.ERROR INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.ERROR();

        private ERROR() {
            super("E404", 58372, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$LOCKED;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class LOCKED extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.LOCKED INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.LOCKED();

        private LOCKED() {
            super("E423", 58403, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$WAIT;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WAIT extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.WAIT INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.WAIT();

        private WAIT() {
            super("E102", 57602, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$PROCESSING;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PROCESSING extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.PROCESSING INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.PROCESSING();

        private PROCESSING() {
            super("E202", 57858, null);
        }
    }

    /* JADX INFO: compiled from: Gen2Comands.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType$UNKNOWN;", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/ResponseType;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UNKNOWN extends powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType {
        public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.UNKNOWN INSTANCE = new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.ResponseType.UNKNOWN();

        private UNKNOWN() {
            super("F", 15, null);
        }
    }
}
