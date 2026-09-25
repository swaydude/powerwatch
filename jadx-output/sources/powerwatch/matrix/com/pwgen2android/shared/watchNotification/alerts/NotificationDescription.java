package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: PowerWatch2AlertsService.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/NotificationDescription;", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "text", "subText", "metadataInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMetadataInfo", "()Ljava/lang/String;", "getSubText", "getText", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "toString", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class NotificationDescription {
    private final java.lang.String metadataInfo;
    private final java.lang.String subText;
    private final java.lang.String text;
    private final java.lang.String title;

    public static /* synthetic */ powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription copy$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription notificationDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = notificationDescription.title;
        }
        if ((i & 2) != 0) {
            str2 = notificationDescription.text;
        }
        if ((i & 4) != 0) {
            str3 = notificationDescription.subText;
        }
        if ((i & 8) != 0) {
            str4 = notificationDescription.metadataInfo;
        }
        return notificationDescription.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getMetadataInfo() {
        return this.metadataInfo;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription copy(java.lang.String title, java.lang.String text, java.lang.String subText, java.lang.String metadataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subText, "subText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataInfo, "metadataInfo");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription(title, text, subText, metadataInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription notificationDescription = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationDescription) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, notificationDescription.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, notificationDescription.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.subText, notificationDescription.subText) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadataInfo, notificationDescription.metadataInfo);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.subText.hashCode()) * 31) + this.metadataInfo.hashCode();
    }

    public java.lang.String toString() {
        return "NotificationDescription(title=" + this.title + ", text=" + this.text + ", subText=" + this.subText + ", metadataInfo=" + this.metadataInfo + ')';
    }

    public NotificationDescription(java.lang.String title, java.lang.String text, java.lang.String subText, java.lang.String metadataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subText, "subText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataInfo, "metadataInfo");
        this.title = title;
        this.text = text;
        this.subText = subText;
        this.metadataInfo = metadataInfo;
    }

    public final java.lang.String getMetadataInfo() {
        return this.metadataInfo;
    }

    public final java.lang.String getSubText() {
        return this.subText;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }
}
