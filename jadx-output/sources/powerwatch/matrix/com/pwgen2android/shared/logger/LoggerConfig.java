package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: LoggerModule.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/LoggerConfig;", "", "env", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V", "getEnv", "()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class LoggerConfig {
    private final powerwatch.matrix.com.pwgen2android.shared.logger.Env env;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig copy$default(powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig loggerConfig, powerwatch.matrix.com.pwgen2android.shared.logger.Env env, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            env = loggerConfig.env;
        }
        return loggerConfig.copy(env);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.logger.Env getEnv() {
        return this.env;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig copy(powerwatch.matrix.com.pwgen2android.shared.logger.Env env) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "env");
        return new powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig(env);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.env, ((powerwatch.matrix.com.pwgen2android.shared.logger.LoggerConfig) other).env);
    }

    public int hashCode() {
        return this.env.hashCode();
    }

    public java.lang.String toString() {
        return "LoggerConfig(env=" + this.env + ')';
    }

    public LoggerConfig(powerwatch.matrix.com.pwgen2android.shared.logger.Env env) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "env");
        this.env = env;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.Env getEnv() {
        return this.env;
    }
}
