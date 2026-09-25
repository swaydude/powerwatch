package powerwatch.matrix.com.pwgen2android.shared.ui.notifications;

/* JADX INFO: compiled from: NotificationLoggerViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/ui/notifications/NotificationLogView;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT, "logLevel", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "time", "(Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getLogLevel", "()Lpowerwatch/matrix/com/pwgen2android/shared/logger/LogLevel;", "getTime", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class NotificationLogView {
    private final java.lang.String content;
    private final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel;
    private final java.lang.String time;
    private final java.lang.String title;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView copy$default(powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView notificationLogView, java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = notificationLogView.title;
        }
        if ((i & 2) != 0) {
            str2 = notificationLogView.content;
        }
        if ((i & 4) != 0) {
            logLevel = notificationLogView.logLevel;
        }
        if ((i & 8) != 0) {
            str3 = notificationLogView.time;
        }
        return notificationLogView.copy(str, str2, logLevel, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getTime() {
        return this.time;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView copy(java.lang.String title, java.lang.String content, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel, java.lang.String time) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        return new powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView(title, content, logLevel, time);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView notificationLogView = (powerwatch.matrix.com.pwgen2android.shared.ui.notifications.NotificationLogView) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, notificationLogView.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.content, notificationLogView.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.logLevel, notificationLogView.logLevel) && kotlin.jvm.internal.Intrinsics.areEqual(this.time, notificationLogView.time);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.logLevel.hashCode()) * 31) + this.time.hashCode();
    }

    public java.lang.String toString() {
        return "NotificationLogView(title=" + this.title + ", content=" + this.content + ", logLevel=" + this.logLevel + ", time=" + this.time + ')';
    }

    public NotificationLogView(java.lang.String title, java.lang.String content, powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel logLevel, java.lang.String time) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "time");
        this.title = title;
        this.content = content;
        this.logLevel = logLevel;
        this.time = time;
    }

    public final java.lang.String getContent() {
        return this.content;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.logger.LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final java.lang.String getTime() {
        return this.time;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }
}
