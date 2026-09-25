package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: LoggerModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "", "levelTag", "", "(Ljava/lang/String;)V", "getLevelTag", "()Ljava/lang/String;", "DEBUG", "ERROR", "INFO", "WARN", "WTF", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class LogLevel {
    private final java.lang.String levelTag;

    public /* synthetic */ LogLevel(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$INFO;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class INFO extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.INFO();

        private INFO() {
            super("INFO", null);
        }
    }

    private LogLevel(java.lang.String str) {
        this.levelTag = str;
    }

    public final java.lang.String getLevelTag() {
        return this.levelTag;
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$DEBUG;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DEBUG extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.DEBUG();

        private DEBUG() {
            super("DEBUG", null);
        }
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WARN;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WARN extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WARN();

        private WARN() {
            super("WARN", null);
        }
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$ERROR;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ERROR extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.ERROR();

        private ERROR() {
            super("ERROR", null);
        }
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel$WTF;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class WTF extends powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel.WTF();

        private WTF() {
            super("WTF", null);
        }
    }
}
