package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: LoggerModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "", "()V", "DEV", "PROD", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$DEV;", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class Env {
    public /* synthetic */ Env(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$PROD;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PROD extends powerwatch.matrix.com.pwgen2android.shared.logger.Env {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.Env.PROD INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.Env.PROD();

        private PROD() {
            super(null);
        }
    }

    private Env() {
    }

    /* JADX INFO: compiled from: LoggerModule.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env$DEV;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "()V", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DEV extends powerwatch.matrix.com.pwgen2android.shared.logger.Env {
        public static final powerwatch.matrix.com.pwgen2android.shared.logger.Env.DEV INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.logger.Env.DEV();

        private DEV() {
            super(null);
        }
    }
}
