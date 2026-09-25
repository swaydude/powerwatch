package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events;

/* JADX INFO: compiled from: AlertEvent.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a4\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0001\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0004\b\b\u0010\u0005¨\u0006\u001e"}, d2 = {"incomingCallString", "", "getIncomingCallString", "()Ljava/lang/String;", "setIncomingCallString", "(Ljava/lang/String;)V", "missedCallString", "getMissedCallString", "setMissedCallString", "adjustNotificationText", "Lkotlin/Pair;", "oldTitle", "oldText", "callState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;", "context", "Landroid/content/Context;", "createCallNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;", "statusBarNotification", "Landroid/service/notification/StatusBarNotification;", "createMessageNotification", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;", "messageState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;", "getAppNameFromPkgName", "packageName", "getNotificationTimestamp", "", "notification", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class AlertEventKt {
    private static java.lang.String incomingCallString = "Incoming call";
    private static java.lang.String missedCallString = "Missed call";

    public static final java.lang.String getIncomingCallString() {
        return incomingCallString;
    }

    public static final void setIncomingCallString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        incomingCallString = str;
    }

    public static final java.lang.String getMissedCallString() {
        return missedCallString;
    }

    public static final void setMissedCallString(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        missedCallString = str;
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent createCallNotification(android.service.notification.StatusBarNotification statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "callState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String charSequence = statusBarNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE);
        if (charSequence == null) {
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairAdjustNotificationText = adjustNotificationText(charSequence.toString(), powerwatch.matrix.com.pwgen2android.shared.extensions.NotificationExtensionsKt.extractAnyTextOrEmpty(statusBarNotification).toString(), callState, context);
        java.lang.String first = pairAdjustNotificationText.getFirst();
        java.lang.String second = pairAdjustNotificationText.getSecond();
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent(first.toString(), "", statusBarNotification.getPackageName(), callState, statusBarNotification.getId(), statusBarNotification.getPostTime(), getNotificationTimestamp(statusBarNotification), second, false, 256, null);
        callEvent.setId(callEvent.hashCode());
        return callEvent;
    }

    private static final kotlin.Pair<java.lang.String, java.lang.String> adjustNotificationText(java.lang.String str, java.lang.String str2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState, android.content.Context context) {
        java.lang.String str3 = callState == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING ? "Incoming Call" : "Missed Call";
        java.lang.String str4 = callState == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING ? incomingCallString : missedCallString;
        if (kotlin.text.StringsKt.equals(str, str3, true) || kotlin.text.StringsKt.equals(str, str4, true)) {
            str = str2;
        }
        return new kotlin.Pair<>(str, str4);
    }

    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent createMessageNotification(android.service.notification.StatusBarNotification statusBarNotification, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState messageState, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "statusBarNotification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageState, "messageState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String charSequence = statusBarNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE);
        if (charSequence == null) {
        }
        java.lang.String strExtractAnyTextOrEmpty = powerwatch.matrix.com.pwgen2android.shared.extensions.NotificationExtensionsKt.extractAnyTextOrEmpty(statusBarNotification);
        int id = statusBarNotification.getId();
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent messageEvent = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent(charSequence.toString(), "", statusBarNotification.getPackageName(), messageState, statusBarNotification.getPostTime(), getNotificationTimestamp(statusBarNotification), strExtractAnyTextOrEmpty.toString(), id);
        messageEvent.setId(messageEvent.hashCode());
        return messageEvent;
    }

    private static final long getNotificationTimestamp(android.service.notification.StatusBarNotification statusBarNotification) {
        return statusBarNotification.getNotification().when == 0 ? statusBarNotification.getPostTime() : statusBarNotification.getNotification().when;
    }

    public static final java.lang.String getAppNameFromPkgName(android.content.Context context, java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)");
            return packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
