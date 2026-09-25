package powerwatch.matrix.com.pwgen2android.shared.extensions;

/* JADX INFO: compiled from: NotificationExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"extractAnyTextOrEmpty", "", "Landroid/service/notification/StatusBarNotification;", "app_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class NotificationExtensionsKt {
    public static final java.lang.String extractAnyTextOrEmpty(android.service.notification.StatusBarNotification statusBarNotification) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusBarNotification, "<this>");
        java.lang.CharSequence charSequence = statusBarNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TEXT);
        java.lang.String string2 = charSequence == null ? null : charSequence.toString();
        if (string2 != null) {
            return string2;
        }
        java.lang.CharSequence charSequence2 = statusBarNotification.getNotification().extras.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
        return (charSequence2 == null || (string = charSequence2.toString()) == null) ? "" : string;
    }
}
