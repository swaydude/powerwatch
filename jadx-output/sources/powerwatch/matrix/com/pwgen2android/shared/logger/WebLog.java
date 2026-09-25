package powerwatch.matrix.com.pwgen2android.shared.logger;

/* JADX INFO: compiled from: WebBridgeLoggerExtension.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/logger/WebLog;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "", com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL, "tag", "timestamp", "env", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnv", "()Ljava/lang/String;", "getLevel", "getMessage", "getTag", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class WebLog {
    private final java.lang.String env;
    private final java.lang.String level;
    private final java.lang.String message;
    private final java.lang.String tag;
    private final java.lang.String timestamp;

    public WebLog() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.logger.WebLog copy$default(powerwatch.matrix.com.pwgen2android.shared.logger.WebLog webLog, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = webLog.message;
        }
        if ((i & 2) != 0) {
            str2 = webLog.level;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = webLog.tag;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = webLog.timestamp;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = webLog.env;
        }
        return webLog.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final java.lang.String getEnv() {
        return this.env;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.WebLog copy(java.lang.String message, java.lang.String level, java.lang.String tag, java.lang.String timestamp, java.lang.String env) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "env");
        return new powerwatch.matrix.com.pwgen2android.shared.logger.WebLog(message, level, tag, timestamp, env);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.logger.WebLog)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.logger.WebLog webLog = (powerwatch.matrix.com.pwgen2android.shared.logger.WebLog) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, webLog.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.level, webLog.level) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, webLog.tag) && kotlin.jvm.internal.Intrinsics.areEqual(this.timestamp, webLog.timestamp) && kotlin.jvm.internal.Intrinsics.areEqual(this.env, webLog.env);
    }

    public int hashCode() {
        return (((((((this.message.hashCode() * 31) + this.level.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.env.hashCode();
    }

    public java.lang.String toString() {
        return "WebLog(message=" + this.message + ", level=" + this.level + ", tag=" + this.tag + ", timestamp=" + this.timestamp + ", env=" + this.env + ')';
    }

    public WebLog(java.lang.String message, java.lang.String level, java.lang.String tag, java.lang.String timestamp, java.lang.String env) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(env, "env");
        this.message = message;
        this.level = level;
        this.tag = tag;
        this.timestamp = timestamp;
        this.env = env;
    }

    public /* synthetic */ WebLog(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "debug" : str2, (i & 4) != 0 ? "WEB_BRIDGE" : str3, (i & 8) != 0 ? "UNKNOWN" : str4, (i & 16) != 0 ? "dev" : str5);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getLevel() {
        return this.level;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String getTimestamp() {
        return this.timestamp;
    }

    public final java.lang.String getEnv() {
        return this.env;
    }
}
