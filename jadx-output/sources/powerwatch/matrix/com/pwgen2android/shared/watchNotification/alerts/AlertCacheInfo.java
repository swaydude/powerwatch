package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: SentAlertsCache.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertCacheInfo;", "", "time", "", "alertId", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "isMessage", "", "(JILjava/lang/String;Z)V", "getAlertId", "()I", "()Z", "getTime", "()J", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AlertCacheInfo {
    private final int alertId;
    private final boolean isMessage;
    private final long time;
    private final java.lang.String title;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo copy$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertCacheInfo, long j, int i, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = alertCacheInfo.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = alertCacheInfo.alertId;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = alertCacheInfo.title;
        }
        java.lang.String str2 = str;
        if ((i2 & 8) != 0) {
            z = alertCacheInfo.isMessage;
        }
        return alertCacheInfo.copy(j2, i3, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAlertId() {
        return this.alertId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMessage() {
        return this.isMessage;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo copy(long time, int alertId, java.lang.String title, boolean isMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo(time, alertId, title, isMessage);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo alertCacheInfo = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo) other;
        return this.time == alertCacheInfo.time && this.alertId == alertCacheInfo.alertId && kotlin.jvm.internal.Intrinsics.areEqual(this.title, alertCacheInfo.title) && this.isMessage == alertCacheInfo.isMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iM0 = ((((powerwatch.matrix.com.pwgen2android.googlefit.GoogleFitDataWriter$SleepSession$$ExternalSynthetic0.m0(this.time) * 31) + this.alertId) * 31) + this.title.hashCode()) * 31;
        boolean z = this.isMessage;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iM0 + r1;
    }

    public java.lang.String toString() {
        return "AlertCacheInfo(time=" + this.time + ", alertId=" + this.alertId + ", title=" + this.title + ", isMessage=" + this.isMessage + ')';
    }

    public AlertCacheInfo(long j, int i, java.lang.String title, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        this.time = j;
        this.alertId = i;
        this.title = title;
        this.isMessage = z;
    }

    public /* synthetic */ AlertCacheInfo(long j, int i, java.lang.String str, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, (i2 & 8) != 0 ? false : z);
    }

    public final int getAlertId() {
        return this.alertId;
    }

    public final long getTime() {
        return this.time;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final boolean isMessage() {
        return this.isMessage;
    }
}
