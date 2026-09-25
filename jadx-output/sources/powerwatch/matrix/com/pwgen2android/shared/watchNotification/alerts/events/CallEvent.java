package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events;

/* JADX INFO: compiled from: CallEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\u0004HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\u0010HÆ\u0003Je\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\t\u00107\u001a\u00020\nHÖ\u0001J\u0013\u00108\u001a\u00020\u00102\b\u00109\u001a\u0004\u0018\u00010:H\u0096\u0002J\b\u0010;\u001a\u00020\nH\u0016J\t\u0010<\u001a\u00020\u0004HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\nHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0013\"\u0004\b(\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010\u0015¨\u0006B"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "Landroid/os/Parcelable;", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "", "subTitle", "appPackageName", "callState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;", "id", "", "postTimestamp", "", "notificationTimestamp", "text", "isVoip", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;IJJLjava/lang/String;Z)V", "getAppPackageName", "()Ljava/lang/String;", "setAppPackageName", "(Ljava/lang/String;)V", "getCallState", "()Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;", "setCallState", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)V", "getId", "()I", "setId", "(I)V", "()Z", "setVoip", "(Z)V", "getNotificationTimestamp", "()J", "setNotificationTimestamp", "(J)V", "getPostTimestamp", "setPostTimestamp", "getSubTitle", "setSubTitle", "getText", "setText", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CallEvent implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> CREATOR = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent.Creator();
    private java.lang.String appPackageName;
    private powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState;
    private int id;
    private boolean isVoip;
    private long notificationTimestamp;
    private long postTimestamp;
    private java.lang.String subTitle;
    private java.lang.String text;
    private java.lang.String title;

    /* JADX INFO: compiled from: CallEvent.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> {
        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent(parcel.readString(), parcel.readString(), parcel.readString(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.valueOf(parcel.readString()), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent[] newArray(int i) {
            return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent[i];
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
    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState getCallState() {
        return this.callState;
    }

    public final int component5() {
        return getId();
    }

    public final long component6() {
        return getPostTimestamp();
    }

    public final long component7() {
        return getNotificationTimestamp();
    }

    public final java.lang.String component8() {
        return getText();
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsVoip() {
        return this.isVoip;
    }

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent copy(java.lang.String title, java.lang.String subTitle, java.lang.String appPackageName, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState, int id, long postTimestamp, long notificationTimestamp, java.lang.String text, boolean isVoip) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "callState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent(title, subTitle, appPackageName, callState, id, postTimestamp, notificationTimestamp, text, isVoip);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "CallEvent(title=" + getTitle() + ", subTitle=" + getSubTitle() + ", appPackageName=" + ((java.lang.Object) getAppPackageName()) + ", callState=" + this.callState + ", id=" + getId() + ", postTimestamp=" + getPostTimestamp() + ", notificationTimestamp=" + getNotificationTimestamp() + ", text=" + getText() + ", isVoip=" + this.isVoip + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.title);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.appPackageName);
        parcel.writeString(this.callState.name());
        parcel.writeInt(this.id);
        parcel.writeLong(this.postTimestamp);
        parcel.writeLong(this.notificationTimestamp);
        parcel.writeString(this.text);
        parcel.writeInt(this.isVoip ? 1 : 0);
    }

    public CallEvent(java.lang.String title, java.lang.String subTitle, java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState, int i, long j, long j2, java.lang.String text, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "callState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        this.title = title;
        this.subTitle = subTitle;
        this.appPackageName = str;
        this.callState = callState;
        this.id = i;
        this.postTimestamp = j;
        this.notificationTimestamp = j2;
        this.text = text;
        this.isVoip = z;
    }

    public /* synthetic */ CallEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState, int i, long j, long j2, java.lang.String str4, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, callState, (i2 & 16) != 0 ? -1 : i, j, j2, str4, (i2 & 256) != 0 ? true : z);
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

    public final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState getCallState() {
        return this.callState;
    }

    public final void setCallState(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "<set-?>");
        this.callState = callState;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public int getId() {
        return this.id;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public void setId(int i) {
        this.id = i;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public long getPostTimestamp() {
        return this.postTimestamp;
    }

    public void setPostTimestamp(long j) {
        this.postTimestamp = j;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent
    public long getNotificationTimestamp() {
        return this.notificationTimestamp;
    }

    public void setNotificationTimestamp(long j) {
        this.notificationTimestamp = j;
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

    public final boolean isVoip() {
        return this.isVoip;
    }

    public final void setVoip(boolean z) {
        this.isVoip = z;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent)) {
            return false;
        }
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getTitle(), callEvent.getTitle()) && kotlin.jvm.internal.Intrinsics.areEqual(getText(), callEvent.getText()) && this.callState == callEvent.callState && kotlin.jvm.internal.Intrinsics.areEqual(getAppPackageName(), callEvent.getAppPackageName()) && this.isVoip == callEvent.isVoip && java.lang.Math.abs(getPostTimestamp() - callEvent.getPostTimestamp()) < 2000;
    }

    public int hashCode() {
        int iHashCode = kotlin.text.StringsKt.replace$default(getTitle(), " ", "", false, 4, (java.lang.Object) null).hashCode() * 31;
        java.lang.String appPackageName = getAppPackageName();
        return ((((((iHashCode + (appPackageName == null ? 0 : appPackageName.hashCode())) * 31) + getId()) * 31) + ((int) (getNotificationTimestamp() / ((long) 1000)))) * 31) + getText().hashCode();
    }
}
