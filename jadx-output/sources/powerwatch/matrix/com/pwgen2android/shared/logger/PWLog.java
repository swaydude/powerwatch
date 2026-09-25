package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: PWLoggerInput.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLog;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", "tag", "logLevel", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "timestamp", "env", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;)V", "getEnv", "()Lpowerwatch/matrix/com/pwgen2android/shared/logger/Env;", "getLogLevel", "()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "getMessage", "()Ljava/lang/String;", "getTag", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PWLog {
    private final powerwatch.matrix.com.pwgen2android.shared.logger.Env env;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel;
    private final java.lang.String message;
    private final java.lang.String tag;
    private final java.lang.String timestamp;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.logger.PWLog copy$default(powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog, java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel, java.lang.String str3, powerwatch.matrix.com.pwgen2android.shared.logger.Env env, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pWLog.message;
        }
        if ((i & 2) != 0) {
            str2 = pWLog.tag;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            logLevel = pWLog.logLevel;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel2 = logLevel;
        if ((i & 8) != 0) {
            str3 = pWLog.timestamp;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            env = pWLog.env;
        }
        return pWLog.copy(str, str4, logLevel2, str5, env);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.logger.Env getEnv() {
        return this.env;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.PWLog copy(java.lang.String message, java.lang.String tag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel, java.lang.String timestamp, powerwatch.matrix.com.pwgen2android.shared.logger.Env env) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "env");
        return new powerwatch.matrix.com.pwgen2android.shared.logger.PWLog(message, tag, logLevel, timestamp, env);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.logger.PWLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLog pWLog = (powerwatch.matrix.com.pwgen2android.shared.logger.PWLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, pWLog.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, pWLog.tag) && kotlin.jvm.internal.Intrinsics.areEqual(this.logLevel, pWLog.logLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.timestamp, pWLog.timestamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.env, pWLog.env);
    }

    public int hashCode() {
        return (((((((this.message.hashCode() * 31) + this.tag.hashCode()) * 31) + this.logLevel.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.env.hashCode();
    }

    public java.lang.String toString() {
        return "PWLog(message=" + this.message + ", tag=" + this.tag + ", logLevel=" + this.logLevel + ", timestamp=" + this.timestamp + ", env=" + this.env + ')';
    }

    public PWLog(java.lang.String message, java.lang.String tag, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel, java.lang.String timestamp, powerwatch.matrix.com.pwgen2android.shared.logger.Env env) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "env");
        this.message = message;
        this.tag = tag;
        this.logLevel = logLevel;
        this.timestamp = timestamp;
        this.env = env;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.Env getEnv() {
        return this.env;
    }
}
