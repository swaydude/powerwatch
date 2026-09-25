package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsLiteCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u00002\u00020\u0001JH\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JH\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&JB\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0016"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;", "", "sendClearCallIconAlert", "Lio/reactivex/Completable;", "deviceId", "", "uid", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "subTitle", "body", "postTime", "", "notificationTime", "sendClearMessageIconAlert", "sendImportantCallAlert", "sendImportantMessageAlert", "sendPreExistingCallAlert", "sendPreExistingMessageAlert", "sendSilentCallAlert", "sendSilentIncomingCallAlert", "sendSilentMessageAlert", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface AlertsLiteCommunicator {
    io.reactivex.Completable sendClearCallIconAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendClearMessageIconAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendImportantCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendImportantMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendPreExistingCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendPreExistingMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendSilentCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendSilentIncomingCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    io.reactivex.Completable sendSilentMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime);

    /* JADX INFO: compiled from: AlertsLiteCommunicator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ io.reactivex.Completable sendImportantCallAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendImportantCallAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImportantCallAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendSilentCallAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendSilentCallAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSilentCallAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendPreExistingCallAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendPreExistingCallAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPreExistingCallAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendImportantMessageAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendImportantMessageAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImportantMessageAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendSilentMessageAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendSilentMessageAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSilentMessageAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendPreExistingMessageAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendPreExistingMessageAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPreExistingMessageAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendClearCallIconAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendClearCallIconAlert(str, (i & 2) != 0 ? (short) 0 : s, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendClearCallIconAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendClearMessageIconAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendClearMessageIconAlert(str, (i & 2) != 0 ? (short) 0 : s, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendClearMessageIconAlert");
        }

        public static /* synthetic */ io.reactivex.Completable sendSilentIncomingCallAlert$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator, java.lang.String str, short s, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, int i, java.lang.Object obj) {
            if (obj == null) {
                return alertsLiteCommunicator.sendSilentIncomingCallAlert(str, (i & 2) != 0 ? (short) 0 : s, str2, str3, str4, j, j2);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSilentIncomingCallAlert");
        }
    }
}
