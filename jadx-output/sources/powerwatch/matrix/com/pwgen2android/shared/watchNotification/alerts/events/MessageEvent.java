package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events;

/* JADX INFO: compiled from: MessageEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J[\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0096\u0002J\b\u00103\u001a\u00020\u000eH\u0016J\t\u00104\u001a\u00020\u0004HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u000eHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\r\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R\u001a\u0010\f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013¨\u0006:"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "Landroid/os/Parcelable;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "subTitle", "appPackageName", "smsState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;", "postTimestamp", "", "notificationTimestamp", "text", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;JJLjava/lang/String;I)V", "getAppPackageName", "()Ljava/lang/String;", "setAppPackageName", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getNotificationTimestamp", "()J", "getPostTimestamp", "getSmsState", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;", "setSmsState", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)V", "getSubTitle", "setSubTitle", "getText", "setText", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class MessageEvent implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent.Creator();
    private java.lang.String appPackageName;
    private int id;
    private final long notificationTimestamp;
    private final long postTimestamp;
    private powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState smsState;
    private java.lang.String subTitle;
    private java.lang.String text;
    private java.lang.String title;

    /* JADX INFO: compiled from: MessageEvent.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent(parcel.readString(), parcel.readString(), parcel.readString(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent[i];
        }
    }

    public final java.lang.String component1() {
        return getTitle();
    }

    public final java.lang.String component2() {
        return getSubTitle();
    }

    public final java.lang.String component3() {
        return getAppPackageName();
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState getSmsState() {
        return this.smsState;
    }

    public final long component5() {
        return getPostTimestamp();
    }

    public final long component6() {
        return getNotificationTimestamp();
    }

    public final java.lang.String component7() {
        return getText();
    }

    public final int component8() {
        return getId();
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent copy(java.lang.String title, java.lang.String subTitle, java.lang.String appPackageName, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState smsState, long postTimestamp, long notificationTimestamp, java.lang.String text, int id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsState, "smsState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent(title, subTitle, appPackageName, smsState, postTimestamp, notificationTimestamp, text, id);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MessageEvent(title=" + getTitle() + ", subTitle=" + getSubTitle() + ", appPackageName=" + ((java.lang.Object) getAppPackageName()) + ", smsState=" + this.smsState + ", postTimestamp=" + getPostTimestamp() + ", notificationTimestamp=" + getNotificationTimestamp() + ", text=" + getText() + ", id=" + getId() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.appPackageName);
        parcel.writeString(this.smsState.name());
        parcel.writeLong(this.postTimestamp);
        parcel.writeLong(this.notificationTimestamp);
        parcel.writeString(this.text);
        parcel.writeInt(this.id);
    }

    public MessageEvent(java.lang.String title, java.lang.String subTitle, java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState smsState, long j, long j2, java.lang.String text, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsState, "smsState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.title = title;
        this.subTitle = subTitle;
        this.appPackageName = str;
        this.smsState = smsState;
        this.postTimestamp = j;
        this.notificationTimestamp = j2;
        this.text = text;
        this.id = i;
    }

    public /* synthetic */ MessageEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState sMSState, long j, long j2, java.lang.String str4, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, sMSState, j, j2, str4, (i2 & 128) != 0 ? -1 : i);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public java.lang.String getTitle() {
        return this.title;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public void setTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public java.lang.String getSubTitle() {
        return this.subTitle;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public void setSubTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subTitle = str;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public java.lang.String getAppPackageName() {
        return this.appPackageName;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public void setAppPackageName(java.lang.String str) {
        this.appPackageName = str;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState getSmsState() {
        return this.smsState;
    }

    public final void setSmsState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState sMSState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sMSState, "<set-?>");
        this.smsState = sMSState;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public long getPostTimestamp() {
        return this.postTimestamp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public long getNotificationTimestamp() {
        return this.notificationTimestamp;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public java.lang.String getText() {
        return this.text;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public void setText(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public int getId() {
        return this.id;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public void setId(int i) {
        this.id = i;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent messageEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getTitle(), messageEvent.getTitle()) && kotlin.jvm.internal.Intrinsics.areEqual(getText(), messageEvent.getText()) && this.smsState == messageEvent.smsState && kotlin.jvm.internal.Intrinsics.areEqual(getAppPackageName(), messageEvent.getAppPackageName()) && java.lang.Math.abs(getPostTimestamp() - messageEvent.getPostTimestamp()) < 2000;
    }

    public int hashCode() {
        int iHashCode = getTitle().hashCode() * 31;
        java.lang.String appPackageName = getAppPackageName();
        return ((((iHashCode + (appPackageName == null ? 0 : appPackageName.hashCode())) * 31) + getText().hashCode()) * 31) + ((int) (getNotificationTimestamp() / ((long) 1000)));
    }
}
