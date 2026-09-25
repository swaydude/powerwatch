package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsLiteCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096\u0001J@\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010\u001f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010 \u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J(\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%H\u0002J@\u0010&\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010(\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J@\u0010*\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Gen1AlertsLiteCommunicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "alertsMessageFormatter", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;", "alarmsCommunicator", "alertsConfiguration", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsMessageFormatter;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlarmsCommunicator;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;)V", "disableAlarm", "Lio/reactivex/Completable;", "deviceId", "", "enableAlarm", androidx.core.app.NotificationCompat.CATEGORY_ALARM, "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/Alarm;", "initAlerts", "alertsConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;", "sendClearCallIconAlert", "uid", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "subTitle", "body", "postTime", "", "notificationTime", "sendClearMessageIconAlert", "sendImportantCallAlert", "sendImportantMessageAlert", "sendMessageToComm", "data", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "sendPreExistingCallAlert", "sendPreExistingMessageAlert", "sendSilentCallAlert", "sendSilentIncomingCallAlert", "sendSilentMessageAlert", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen1AlertsLiteCommunicator implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator {
    private static final java.lang.String TAG = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlertsLiteCommunicator.class.getSimpleName();
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator alarmsCommunicator;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration alertsConfiguration;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsMessageFormatter alertsMessageFormatter;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator
    public io.reactivex.Completable disableAlarm(java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return this.alarmsCommunicator.disableAlarm(deviceId);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator
    public io.reactivex.Completable enableAlarm(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Alarm alarm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarm, "alarm");
        return this.alarmsCommunicator.enableAlarm(deviceId, alarm);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration
    public io.reactivex.Completable initAlerts(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfig alertsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsConfig, "alertsConfig");
        return this.alertsConfiguration.initAlerts(deviceId, alertsConfig);
    }

    public Gen1AlertsLiteCommunicator(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsMessageFormatter alertsMessageFormatter, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlarmsCommunicator alarmsCommunicator, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration alertsConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsMessageFormatter, "alertsMessageFormatter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alarmsCommunicator, "alarmsCommunicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsConfiguration, "alertsConfiguration");
        this.communicator = communicator;
        this.alertsMessageFormatter = alertsMessageFormatter;
        this.alarmsCommunicator = alarmsCommunicator;
        this.alertsConfiguration = alertsConfiguration;
    }

    public /* synthetic */ Gen1AlertsLiteCommunicator(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsMessageFormatter alertsMessageFormatter, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator gen1AlarmsCommunicator, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlertsConfiguration gen1AlertsConfiguration, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, (i & 2) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsMessageFormatter() : alertsMessageFormatter, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlarmsCommunicator(communicator) : gen1AlarmsCommunicator, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlertsConfiguration(communicator) : gen1AlertsConfiguration);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendPreExistingCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendPreExistingMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    private final io.reactivex.Completable sendMessageToComm(java.lang.String deviceId, java.util.ArrayList<byte[]> data) {
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator = this.communicator;
        java.util.ArrayList<byte[]> arrayList = data;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(kotlin.collections.ArraysKt.toMutableList((byte[]) it.next()));
        }
        return communicator.sendMessage(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicatorKt.createMessage(deviceId, kotlin.collections.CollectionsKt.toByteArray(kotlin.collections.CollectionsKt.flatten(kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList2)))));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendImportantCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendMessageToComm(deviceId, this.alertsMessageFormatter.createIncomingCall(title, body));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendSilentCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendMessageToComm(deviceId, this.alertsMessageFormatter.createMissedCall(title, body));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendImportantMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendMessageToComm(deviceId, this.alertsMessageFormatter.createMessagePayload(title, body));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendSilentMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendMessageToComm(deviceId, this.alertsMessageFormatter.createMissedMessagePayload(title, body));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendClearCallIconAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendMessageToComm(deviceId, this.alertsMessageFormatter.clearCallIcon());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendClearMessageIconAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendMessageToComm(deviceId, this.alertsMessageFormatter.clearMessageIcon());
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendSilentIncomingCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
