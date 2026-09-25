package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events;

/* JADX INFO: compiled from: AlertEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0014\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u0018\u0010\u0017\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0005\"\u0004\b\u0019\u0010\u0007R\u0018\u0010\u001a\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "Landroid/os/Parcelable;", "appPackageName", "", "getAppPackageName", "()Ljava/lang/String;", "setAppPackageName", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "notificationTimestamp", "", "getNotificationTimestamp", "()J", "postTimestamp", "getPostTimestamp", "subTitle", "getSubTitle", "setSubTitle", "text", "getText", "setText", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "getTitle", "setTitle", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AlertEvent extends android.os.Parcelable {
    java.lang.String getAppPackageName();

    int getId();

    long getNotificationTimestamp();

    long getPostTimestamp();

    java.lang.String getSubTitle();

    java.lang.String getText();

    java.lang.String getTitle();

    void setAppPackageName(java.lang.String str);

    void setId(int i);

    void setSubTitle(java.lang.String str);

    void setText(java.lang.String str);

    void setTitle(java.lang.String str);
}
