package powerwatch.matrix.com.pwgen2android.sdk.protocol.commands;

/* JADX INFO: compiled from: Commands.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/AlertsInfo;", "", "gen2AlertsData", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "subtitle", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGen2AlertsData", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "getMessage", "()Ljava/lang/String;", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AlertsInfo {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData;
    private final java.lang.String message;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo copy$default(powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo alertsInfo, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            gen2AlertsData = alertsInfo.gen2AlertsData;
        }
        if ((i & 2) != 0) {
            str = alertsInfo.title;
        }
        if ((i & 4) != 0) {
            str2 = alertsInfo.subtitle;
        }
        if ((i & 8) != 0) {
            str3 = alertsInfo.message;
        }
        return alertsInfo.copy(gen2AlertsData, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData getGen2AlertsData() {
        return this.gen2AlertsData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo copy(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, java.lang.String title, java.lang.String subtitle, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "gen2AlertsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        return new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo(gen2AlertsData, title, subtitle, message);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo alertsInfo = (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.AlertsInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.gen2AlertsData, alertsInfo.gen2AlertsData) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, alertsInfo.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, alertsInfo.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, alertsInfo.message);
    }

    public int hashCode() {
        return (((((this.gen2AlertsData.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.message.hashCode();
    }

    public java.lang.String toString() {
        return "AlertsInfo(gen2AlertsData=" + this.gen2AlertsData + ", title=" + this.title + ", subtitle=" + this.subtitle + ", message=" + this.message + ')';
    }

    public AlertsInfo(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, java.lang.String title, java.lang.String subtitle, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "gen2AlertsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.gen2AlertsData = gen2AlertsData;
        this.title = title;
        this.subtitle = subtitle;
        this.message = message;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData getGen2AlertsData() {
        return this.gen2AlertsData;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }
}
