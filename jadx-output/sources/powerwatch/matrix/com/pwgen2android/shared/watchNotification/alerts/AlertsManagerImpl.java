package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsManagerImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000£\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011*\u00011\u0018\u0000 h2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001hB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u000105H\u0002J\u0012\u0010<\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u000105H\u0002J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J'\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020C0B\"\u00020CH\u0016¢\u0006\u0002\u0010DJ'\u0010E\u001a\b\u0012\u0004\u0012\u0002080\"2\u0012\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020G0B\"\u00020GH\u0016¢\u0006\u0002\u0010HJ\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020)0\"H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020)0\"H\u0016J'\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\"2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020C0B\"\u00020CH\u0016¢\u0006\u0002\u0010DJ'\u0010N\u001a\b\u0012\u0004\u0012\u0002080\"2\u0012\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020G0B\"\u00020GH\u0016¢\u0006\u0002\u0010HJ\u0012\u0010O\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u000105H\u0002J\u0012\u0010P\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u000105H\u0002J\u0010\u0010Q\u001a\u00020R2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010S\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010T\u001a\u0002052\u0006\u0010U\u001a\u00020\u0011H\u0016J\u001c\u0010V\u001a\u00020\u00112\b\u0010T\u001a\u0004\u0018\u0001052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010Z\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010[\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\\\u001a\u00020R2\u0006\u0010]\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010^\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010_\u001a\u00020R2\u0006\u0010T\u001a\u0002052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\u0011H\u0002J0\u0010a\u001a\u00020X2\u0006\u0010b\u001a\u00020\u00112\u0006\u0010c\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010f\u001a\u00020R2\u0006\u0010T\u001a\u0002052\u0006\u0010g\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u001f0\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010%0%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001c\u0010,\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010)0)0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+R\u001c\u0010/\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010)0)0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102R\u0014\u00103\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020504X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u000108080\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u00109\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u000108080\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006i"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsStorage;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "notificationTypeController", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;", "whiteListResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;", "phoneCallResolver", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/type/NotificationTypeController;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/resolver/WhiteListResolver;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/PhoneCallResolver;)V", "activityGoalsNotificationSubject", "Lio/reactivex/subjects/ReplaySubject;", "", "kotlin.jvm.PlatformType", "alarmsNotificationSubject", "areAlarmsEnabled", "getAreAlarmsEnabled", "()Z", "areCallsEnabled", "getAreCallsEnabled", "areGoalsEnabled", "getAreGoalsEnabled", "areMessagesEnabled", "getAreMessagesEnabled", "callImportantSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallEvent;", "callSilentSubject", "callsNotificationSubject", "Lio/reactivex/Observable;", "deviceSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "mNotificationsEnabledGlobally", "messagesNotificationSubject", "missedCallsCount", "", "getMissedCallsCount", "()I", "missedCallsSubject", "missedMessageCount", "getMissedMessageCount", "missedSMSSubject", "notificationsReceiver", "powerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$notificationsReceiver$1;", "numOfMissedCalls", "Ljava/util/HashSet;", "", "numOfMissedMessages", "smsImportantSubject", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/MessageEvent;", "smsSilentSubject", "decrementNumOfCalls", "eventPackageName", "decrementNumOfMessages", "getActivityGoalsNotification", "getAlarmsNotification", "getCallsNotification", "getCurrentCallNotifications", "callState", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;", "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/CallState;)Lio/reactivex/Observable;", "getCurrentMessagesNotifications", "smsState", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;", "([Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/SMSState;)Lio/reactivex/Observable;", "getMessagesNotification", "getNotificationsEnabledGlobally", "getNumOfMissedCalls", "getNumOfUnreadSMS", "getRealtimeCallEvents", "getSMSRealtimeEvent", "incrementNumOfCalls", "incrementNumOfMessages", "invalidateNotifications", "", "isAppNotificationEnabled", "appPackageName", "defaultValue", "isNotificationForAppEnabled", "setActivityGoalsNotificationEnabled", "Lio/reactivex/Completable;", "isEnabled", "setAlarmsNotificationEnabled", "setCallsNotificationEnabled", "setInitialNotificationsStates", "device", "setMessagesNotificationEnabled", "setNotificationForAppEnabled", "value", "setNotificationTypesEnabled", "calls", "messages", "alarms", "activityGoals", "setThirdPartAppEnabled", "enabled", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlertsManagerImpl implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    public static final java.lang.String ACTION_NOTIFICATION_LISTENER_SETTINGS = "android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS";
    private static final java.lang.String APP_NOTIFICATION_ENABLED = "com.matrix.powerwatch.APP_NOTIFICATION_ENABLED";
    private static final java.lang.String CALLS_COUNT = "com.matrix.powerwatch.CALLS_COUNT";
    private static final java.lang.String GLOBAL_NOTIFICATION_SERVICE_USER_DISABLED = "global_notification_setting";
    private static final java.lang.String MESSAGE_COUNT = "com.matrix.powerwatch.MESSAGE_COUNT";
    private final io.reactivex.subjects.ReplaySubject<java.lang.Boolean> activityGoalsNotificationSubject;
    private final io.reactivex.subjects.ReplaySubject<java.lang.Boolean> alarmsNotificationSubject;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> callImportantSubject;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> callSilentSubject;
    private final io.reactivex.Observable<java.lang.Boolean> callsNotificationSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> deviceSubject;
    private final io.reactivex.subjects.ReplaySubject<java.lang.Boolean> mNotificationsEnabledGlobally;
    private final io.reactivex.Observable<java.lang.Boolean> messagesNotificationSubject;
    private final io.reactivex.subjects.ReplaySubject<java.lang.Integer> missedCallsSubject;
    private final io.reactivex.subjects.ReplaySubject<java.lang.Integer> missedSMSSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl$notificationsReceiver$1 notificationsReceiver;
    private final java.util.HashSet<java.lang.String> numOfMissedCalls;
    private final java.util.HashSet<java.lang.String> numOfMissedMessages;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PhoneCallResolver phoneCallResolver;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> smsImportantSubject;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> smsSilentSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.Companion INSTANCE = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.Companion(null);
    private static final java.lang.String TAG = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager.class.getSimpleName();
    private static final android.net.Uri MISSED_CALLS_URI = android.net.Uri.parse("content://call_log/calls");
    private static final android.net.Uri MISSED_SMS_URI = android.net.Uri.parse("content://sms/inbox");
    private static final java.lang.String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";

    /* JADX WARN: Type inference failed for: r4v3, types: [powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl$notificationsReceiver$1] */
    public AlertsManagerImpl(final android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PhoneCallResolver phoneCallResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationTypeController, "notificationTypeController");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whiteListResolver, "whiteListResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCallResolver, "phoneCallResolver");
        this.deviceRepository = deviceRepository;
        this.notificationTypeController = notificationTypeController;
        this.whiteListResolver = whiteListResolver;
        this.phoneCallResolver = phoneCallResolver;
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> behaviorSubjectCreate = io.reactivex.subjects.BehaviorSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create<Device>()");
        this.deviceSubject = behaviorSubjectCreate;
        this.numOfMissedCalls = new java.util.HashSet<>();
        this.numOfMissedMessages = new java.util.HashSet<>();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<CallEvent>()");
        this.callImportantSubject = publishSubjectCreate;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<MessageEvent>()");
        this.smsImportantSubject = publishSubjectCreate2;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> publishSubjectCreate3 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate3, "create<CallEvent>()");
        this.callSilentSubject = publishSubjectCreate3;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> publishSubjectCreate4 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate4, "create<MessageEvent>()");
        this.smsSilentSubject = publishSubjectCreate4;
        io.reactivex.subjects.ReplaySubject<java.lang.Integer> replaySubjectCreateWithSize = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize, "createWithSize<Int>(1)");
        this.missedCallsSubject = replaySubjectCreateWithSize;
        io.reactivex.subjects.ReplaySubject<java.lang.Integer> replaySubjectCreateWithSize2 = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize2, "createWithSize<Int>(1)");
        this.missedSMSSubject = replaySubjectCreateWithSize2;
        this.callsNotificationSubject = notificationTypeController.listenForChange(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE);
        io.reactivex.subjects.ReplaySubject<java.lang.Boolean> replaySubjectCreateWithSize3 = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize3, "createWithSize<Boolean>(1)");
        this.activityGoalsNotificationSubject = replaySubjectCreateWithSize3;
        io.reactivex.subjects.ReplaySubject<java.lang.Boolean> replaySubjectCreateWithSize4 = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize4, "createWithSize<Boolean>(1)");
        this.alarmsNotificationSubject = replaySubjectCreateWithSize4;
        this.messagesNotificationSubject = notificationTypeController.listenForChange(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE);
        io.reactivex.subjects.ReplaySubject<java.lang.Boolean> replaySubjectCreateWithSize5 = io.reactivex.subjects.ReplaySubject.createWithSize(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(replaySubjectCreateWithSize5, "createWithSize<Boolean>(1)");
        this.mNotificationsEnabledGlobally = replaySubjectCreateWithSize5;
        ?? r4 = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl$notificationsReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                if (intent.getAction() == null) {
                    return;
                }
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent alertEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent) intent.getParcelableExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.PARCELABLE_EVENT_KEY);
                powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) this.this$0.deviceSubject.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_ENABLED, intent.getAction())) {
                    if (device != null) {
                        this.this$0.setInitialNotificationsStates(device, context2);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_CALLS, intent.getAction())) {
                    java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent> parcelableArrayListExtra = intent.getParcelableArrayListExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.CALLS_EXTRAS_KEY);
                    this.this$0.numOfMissedCalls.clear();
                    if (parcelableArrayListExtra != null) {
                        for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent alertEvent2 : parcelableArrayListExtra) {
                            this.this$0.incrementNumOfCalls(alertEvent2.getAppPackageName());
                            if (alertEvent2 instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) {
                                this.this$0.callSilentSubject.onNext(alertEvent2);
                            }
                        }
                    }
                    this.this$0.missedCallsSubject.onNext(java.lang.Integer.valueOf(this.this$0.getMissedCallsCount()));
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_MESSAGES, intent.getAction())) {
                    java.util.ArrayList<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent> parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.MESSAGES_EXTRAS_KEY);
                    this.this$0.numOfMissedMessages.clear();
                    if (parcelableArrayListExtra2 != null) {
                        for (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent alertEvent3 : parcelableArrayListExtra2) {
                            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl alertsManagerImpl = this.this$0;
                            java.lang.String appPackageName = alertEvent3.getAppPackageName();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(appPackageName);
                            alertsManagerImpl.incrementNumOfMessages(appPackageName);
                            if (alertEvent3 instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) {
                                this.this$0.smsSilentSubject.onNext(alertEvent3);
                            }
                        }
                    }
                    this.this$0.missedSMSSubject.onNext(java.lang.Integer.valueOf(this.this$0.getMissedMessageCount()));
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_REMOVED, intent.getAction())) {
                    if (alertEvent instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) {
                        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) alertEvent;
                        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, kotlin.jvm.internal.Intrinsics.stringPlus("AlertEvent_removed, Call event detected: State is: ", callEvent.getCallState()), null, 2, null);
                        this.this$0.missedCallsSubject.onNext(java.lang.Integer.valueOf(this.this$0.decrementNumOfCalls(callEvent.getAppPackageName())));
                        this.this$0.callImportantSubject.onNext(alertEvent);
                        return;
                    }
                    if (alertEvent instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) {
                        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent messageEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) alertEvent;
                        android.util.Log.d("AlertEvent", kotlin.jvm.internal.Intrinsics.stringPlus("SMS event detected: State is: ", messageEvent.getSmsState()));
                        this.this$0.missedSMSSubject.onNext(java.lang.Integer.valueOf(this.this$0.decrementNumOfMessages(messageEvent.getAppPackageName())));
                        this.this$0.smsImportantSubject.onNext(alertEvent);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_POSTED, intent.getAction())) {
                    if (alertEvent instanceof powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) {
                        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent2 = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) alertEvent;
                        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState = callEvent2.getCallState();
                        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, kotlin.jvm.internal.Intrinsics.stringPlus("AlertEvent_posted, Call event detected: State is: ", callState.name()), null, 2, null);
                        if (callState == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING || callState == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED || callState == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.ANSWERED) {
                            this.this$0.callImportantSubject.onNext(alertEvent);
                            return;
                        } else {
                            if (callState == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED) {
                                this.this$0.missedCallsSubject.onNext(java.lang.Integer.valueOf(this.this$0.incrementNumOfCalls(callEvent2.getAppPackageName())));
                                return;
                            }
                            return;
                        }
                    }
                    java.util.Objects.requireNonNull(alertEvent, "null cannot be cast to non-null type powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent");
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent messageEvent2 = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) alertEvent;
                    android.util.Log.d("AlertEvent", kotlin.jvm.internal.Intrinsics.stringPlus("SMS event detected: State is: ", messageEvent2.getSmsState()));
                    this.this$0.missedSMSSubject.onNext(java.lang.Integer.valueOf(this.this$0.incrementNumOfMessages(messageEvent2.getAppPackageName())));
                    this.this$0.smsImportantSubject.onNext(messageEvent2);
                }
            }
        };
        this.notificationsReceiver = r4;
        android.util.Log.d(TAG, "AlertsManager initialized.");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_REMOVED);
        intentFilter.addAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATION_POSTED);
        intentFilter.addAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_ENABLED);
        intentFilter.addAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_MESSAGES);
        intentFilter.addAction(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.ACTION_NOTIFICATIONS_CALLS);
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(context).registerReceiver((android.content.BroadcastReceiver) r4, intentFilter);
        powerwatch.matrix.com.pwgen2android.shared.data.repositories.ObserveRepository.DefaultImpls.load$default(deviceRepository, true, false, 2, null).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$42T3S4ewA6xXu_J23kEqvJSJIGI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3549_init_$lambda0(this.f$0, context, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        });
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl$mCallStateReceiver$1
            /* JADX WARN: Code duplicated, block: B:16:0x006b  */
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                int i;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                android.util.Log.d(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.TAG, "Call event received");
                if (intent.getExtras() != null) {
                    android.os.Bundle extras = intent.getExtras();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(extras);
                    java.lang.String string = extras.getString("state");
                    android.os.Bundle extras2 = intent.getExtras();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(extras2);
                    java.lang.String string2 = extras2.getString("incoming_number");
                    if (string2 == null && (string2 = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.CallServiceKt.getLatestIncomingCall()) == null) {
                        string2 = "";
                    }
                    powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, kotlin.jvm.internal.Intrinsics.stringPlus("call_receiver - Call event detected: State is: ", string), null, 2, null);
                    if (context2 == null || !this.this$0.whiteListResolver.isAppEnabled(this.this$0.whiteListResolver.getMainDialerPackage())) {
                        return;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(android.telephony.TelephonyManager.EXTRA_STATE_IDLE, string)) {
                        i = 0;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(android.telephony.TelephonyManager.EXTRA_STATE_OFFHOOK, string)) {
                        i = 2;
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(android.telephony.TelephonyManager.EXTRA_STATE_RINGING, string)) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (string2.length() == 0) {
                        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, "call_receiver - No number found", null, 2, null);
                    }
                    java.lang.String contactDisplayNameByNumber = powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.INSTANCE.getContactDisplayNameByNumber(context2, string2);
                    if (contactDisplayNameByNumber == null) {
                        contactDisplayNameByNumber = string2;
                    }
                    powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this.this$0, "call_receiver - contact resolved", null, 2, null);
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent event = this.this$0.phoneCallResolver.getEvent(i, java.lang.System.currentTimeMillis(), contactDisplayNameByNumber);
                    event.setAppPackageName(this.this$0.whiteListResolver.getMainDialerPackage());
                    event.setVoip(false);
                    event.setId(event.hashCode());
                    android.util.Log.d("call_receiver", "Call event detected: State is: " + event.getCallState() + ", number: " + string2);
                    if (event.getCallState() == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.CALL_ENDED) {
                        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.apps.dismissed.CellularCallAlertDismissedKt.setBlockSendingMissedCall(true);
                    }
                    if (event.getCallState() != powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED) {
                        this.this$0.callImportantSubject.onNext(event);
                    }
                }
            }
        };
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.intent.action.PHONE_STATE");
        context.registerReceiver(broadcastReceiver, intentFilter2);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ AlertsManagerImpl(android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationTypeController notificationTypeController, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.WhiteListResolver whiteListResolver, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PhoneCallResolver phoneCallResolver, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, deviceRepository, notificationTypeController, whiteListResolver, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.PhoneCallResolver() : phoneCallResolver);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public boolean getAreCallsEnabled() {
        return this.notificationTypeController.isAppEnabled(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public boolean getAreMessagesEnabled() {
        return this.notificationTypeController.isAppEnabled(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public boolean getAreAlarmsEnabled() {
        java.lang.Boolean value = this.alarmsNotificationSubject.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public boolean getAreGoalsEnabled() {
        java.lang.Boolean value = this.activityGoalsNotificationSubject.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMissedMessageCount() {
        return this.numOfMissedMessages.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMissedCallsCount() {
        return this.numOfMissedCalls.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m3549_init_$lambda0(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl this$0, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.data.models.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        this$0.setInitialNotificationsStates(it, context);
        this$0.deviceSubject.onNext(it);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> getSMSRealtimeEvent(final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState... smsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsState, "smsState");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> observableFilter = this.smsImportantSubject.distinctUntilChanged().withLatestFrom(this.messagesNotificationSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$vaKfFoH2CNchonBlfKFezZqq_No
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3568getSMSRealtimeEvent$lambda1((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) obj, (java.lang.Boolean) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$CDT-CVXAzcaaYpFv8vchClQgAFU
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3569getSMSRealtimeEvent$lambda2((android.util.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$3yafTInAPbdBFM1QNjtLQwGf9N0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3570getSMSRealtimeEvent$lambda3((android.util.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$OPvq8cuLTX6bVYoU0pX_ZhG0u1o
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3571getSMSRealtimeEvent$lambda4(smsState, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "smsImportantSubject\n                .distinctUntilChanged()\n                .withLatestFrom(messagesNotificationSubject,\n                        BiFunction<MessageEvent, Boolean, Pair<Boolean, MessageEvent>> { smsEvent, enabled ->\n                            Pair(enabled, smsEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { smsEvent ->\n                    for (state in smsState) {\n                        if (smsEvent.smsState === state) return@filter true\n                    }\n                    false\n                }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSMSRealtimeEvent$lambda-1, reason: not valid java name */
    public static final android.util.Pair m3568getSMSRealtimeEvent$lambda1(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent smsEvent, java.lang.Boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsEvent, "smsEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new android.util.Pair(enabled, smsEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSMSRealtimeEvent$lambda-2, reason: not valid java name */
    public static final boolean m3569getSMSRealtimeEvent$lambda2(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        java.lang.Object obj = booleanSMSEventPair.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "booleanSMSEventPair.first");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSMSRealtimeEvent$lambda-3, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent m3570getSMSRealtimeEvent$lambda3(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) booleanSMSEventPair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getSMSRealtimeEvent$lambda-4, reason: not valid java name */
    public static final boolean m3571getSMSRealtimeEvent$lambda4(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState[] smsState, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent smsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsState, "$smsState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsEvent, "smsEvent");
        int length = smsState.length;
        int i = 0;
        while (i < length) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState sMSState = smsState[i];
            i++;
            if (smsEvent.getSmsState() == sMSState) {
                return true;
            }
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> getCurrentCallNotifications(final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState... callState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "callState");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> observableFilter = this.callSilentSubject.withLatestFrom(this.messagesNotificationSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$ePUgZilne9kxY02iqWUSWbODY_g
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3550getCurrentCallNotifications$lambda5((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) obj, (java.lang.Boolean) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$OSQkOZF7Q6ClyIVLt-p-qF2-GKw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3551getCurrentCallNotifications$lambda6((android.util.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$--tERVaOinS8-BE2NF7ayjI_48o
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3552getCurrentCallNotifications$lambda7((android.util.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$OXCT3RBnJ3SrSHsQm8iuGEQ7Rbs
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3553getCurrentCallNotifications$lambda8(callState, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "callSilentSubject\n                .withLatestFrom(messagesNotificationSubject,\n                        BiFunction<CallEvent, Boolean, Pair<Boolean, CallEvent>> { callEvent, enabled ->\n                            Pair(enabled, callEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { callEvent ->\n                    for (state in callState) {\n                        if (callEvent.callState === state) return@filter true\n                    }\n                    false\n                }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentCallNotifications$lambda-5, reason: not valid java name */
    public static final android.util.Pair m3550getCurrentCallNotifications$lambda5(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent, java.lang.Boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callEvent, "callEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new android.util.Pair(enabled, callEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentCallNotifications$lambda-6, reason: not valid java name */
    public static final boolean m3551getCurrentCallNotifications$lambda6(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        java.lang.Object obj = booleanSMSEventPair.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "booleanSMSEventPair.first");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentCallNotifications$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent m3552getCurrentCallNotifications$lambda7(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) booleanSMSEventPair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentCallNotifications$lambda-8, reason: not valid java name */
    public static final boolean m3553getCurrentCallNotifications$lambda8(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState[] callState, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "$callState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callEvent, "callEvent");
        int length = callState.length;
        int i = 0;
        while (i < length) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState2 = callState[i];
            i++;
            if (callEvent.getCallState() == callState2) {
                return true;
            }
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> getCurrentMessagesNotifications(final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState... smsState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsState, "smsState");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> observableFilter = this.smsSilentSubject.distinctUntilChanged().withLatestFrom(this.messagesNotificationSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$5E-zq145KmMb7cq2g7wpVCKbvxA
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3557getCurrentMessagesNotifications$lambda9((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) obj, (java.lang.Boolean) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$_YjO6dVYYZ6n0RViLeBYVcQOQ8Q
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3554getCurrentMessagesNotifications$lambda10((android.util.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$ti-8ncM7jIFA_0oyDR5SVGldIB4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3555getCurrentMessagesNotifications$lambda11((android.util.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$a94oKEr22e9JsNa0A-vvGlv1VxM
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3556getCurrentMessagesNotifications$lambda12(smsState, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "smsSilentSubject\n                .distinctUntilChanged()\n                .withLatestFrom(messagesNotificationSubject,\n                        BiFunction<MessageEvent, Boolean, Pair<Boolean, MessageEvent>> { smsEvent, enabled ->\n                            Pair(enabled, smsEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { smsEvent ->\n                    for (state in smsState) {\n                        if (smsEvent.smsState === state) return@filter true\n                    }\n                    false\n                }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentMessagesNotifications$lambda-9, reason: not valid java name */
    public static final android.util.Pair m3557getCurrentMessagesNotifications$lambda9(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent smsEvent, java.lang.Boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsEvent, "smsEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new android.util.Pair(enabled, smsEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentMessagesNotifications$lambda-10, reason: not valid java name */
    public static final boolean m3554getCurrentMessagesNotifications$lambda10(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        java.lang.Object obj = booleanSMSEventPair.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "booleanSMSEventPair.first");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentMessagesNotifications$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent m3555getCurrentMessagesNotifications$lambda11(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) booleanSMSEventPair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentMessagesNotifications$lambda-12, reason: not valid java name */
    public static final boolean m3556getCurrentMessagesNotifications$lambda12(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState[] smsState, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent smsEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsState, "$smsState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsEvent, "smsEvent");
        int length = smsState.length;
        int i = 0;
        while (i < length) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState sMSState = smsState[i];
            i++;
            if (smsEvent.getSmsState() == sMSState) {
                return true;
            }
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> getRealtimeCallEvents(final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState... callState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "callState");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> observableFilter = this.callImportantSubject.withLatestFrom(this.callsNotificationSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$6G-iVidEIJuUccfhbK0d_FcOYQo
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3564getRealtimeCallEvents$lambda13((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) obj, (java.lang.Boolean) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$i-qMZA8SLu3AumXSChla29JeYZ4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3565getRealtimeCallEvents$lambda14((android.util.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$zbV5heF0J6Ke9AcJ6DLfUVu9Wcw
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3566getRealtimeCallEvents$lambda15((android.util.Pair) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$vRM4tLXSbB7N5RixeNo4YYcvTFQ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3567getRealtimeCallEvents$lambda16(callState, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "callImportantSubject\n                .withLatestFrom(callsNotificationSubject,\n                        BiFunction<CallEvent, Boolean, Pair<Boolean, CallEvent>> { callEvent, enabled ->\n                            Pair(enabled, callEvent)\n                        })\n                .filter { booleanSMSEventPair -> booleanSMSEventPair.first }\n                .map { booleanSMSEventPair -> booleanSMSEventPair.second }\n                .filter { callEvent ->\n                    for (state in callState) {\n                        if (callEvent.callState === state) return@filter true\n                    }\n                    false\n                }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRealtimeCallEvents$lambda-13, reason: not valid java name */
    public static final android.util.Pair m3564getRealtimeCallEvents$lambda13(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent, java.lang.Boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callEvent, "callEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enabled, "enabled");
        return new android.util.Pair(enabled, callEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRealtimeCallEvents$lambda-14, reason: not valid java name */
    public static final boolean m3565getRealtimeCallEvents$lambda14(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        java.lang.Object obj = booleanSMSEventPair.first;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "booleanSMSEventPair.first");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRealtimeCallEvents$lambda-15, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent m3566getRealtimeCallEvents$lambda15(android.util.Pair booleanSMSEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(booleanSMSEventPair, "booleanSMSEventPair");
        return (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) booleanSMSEventPair.second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getRealtimeCallEvents$lambda-16, reason: not valid java name */
    public static final boolean m3567getRealtimeCallEvents$lambda16(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState[] callState, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callState, "$callState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callEvent, "callEvent");
        int length = callState.length;
        int i = 0;
        while (i < length) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState callState2 = callState[i];
            i++;
            if (callEvent.getCallState() == callState2) {
                return true;
            }
        }
        return false;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Integer> getNumOfMissedCalls() {
        io.reactivex.Observable<java.lang.Integer> map = io.reactivex.Observable.combineLatest(this.missedCallsSubject, this.callsNotificationSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$Lwm9gSD9o9oHa35k-u4roG0WwSI
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3558getNumOfMissedCalls$lambda17((java.lang.Integer) obj, (java.lang.Boolean) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$x32AfLmYU3RPpdxVNB9ou0r2AdQ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3559getNumOfMissedCalls$lambda18((android.util.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$cr2N_G2BtNPF3tqezqqWDr0bTSA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3560getNumOfMissedCalls$lambda19((android.util.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "combineLatest<Int, Boolean, Pair<Int, Boolean>>(missedCallsSubject, callsNotificationSubject,\n                BiFunction<Int, Boolean, Pair<Int, Boolean>>\n                { numOdMissedCalls, areCallsEnabled -> Pair(numOdMissedCalls, areCallsEnabled) })\n                .filter { integerCallEventPair -> integerCallEventPair.second }\n                .map { integerBooleanPair -> integerBooleanPair.first }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getNumOfMissedCalls$lambda-17, reason: not valid java name */
    public static final android.util.Pair m3558getNumOfMissedCalls$lambda17(java.lang.Integer numOdMissedCalls, java.lang.Boolean areCallsEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(numOdMissedCalls, "numOdMissedCalls");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(areCallsEnabled, "areCallsEnabled");
        return new android.util.Pair(numOdMissedCalls, areCallsEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getNumOfMissedCalls$lambda-18, reason: not valid java name */
    public static final boolean m3559getNumOfMissedCalls$lambda18(android.util.Pair integerCallEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integerCallEventPair, "integerCallEventPair");
        java.lang.Object obj = integerCallEventPair.second;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "integerCallEventPair.second");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getNumOfMissedCalls$lambda-19, reason: not valid java name */
    public static final java.lang.Integer m3560getNumOfMissedCalls$lambda19(android.util.Pair integerBooleanPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integerBooleanPair, "integerBooleanPair");
        return (java.lang.Integer) integerBooleanPair.first;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Integer> getNumOfUnreadSMS() {
        io.reactivex.Observable<java.lang.Integer> map = io.reactivex.Observable.combineLatest(this.missedSMSSubject, this.messagesNotificationSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$LotaF-_85C0DXSrWfVTbAkXmn38
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3561getNumOfUnreadSMS$lambda20((java.lang.Integer) obj, (java.lang.Boolean) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$AweHaWaP5PYQ4sf6SwDj0Avo4pc
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3562getNumOfUnreadSMS$lambda21((android.util.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$nJmRg5EnG-y6qjAEWrMHt5pQA_k
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3563getNumOfUnreadSMS$lambda22((android.util.Pair) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(map, "combineLatest<Int, Boolean, Pair<Int, Boolean>>(missedSMSSubject,\n                messagesNotificationSubject,\n                BiFunction<Int, Boolean, Pair<Int, Boolean>> { first, second -> Pair(first, second) })\n                .filter { integerMessageEventPair -> integerMessageEventPair.second }\n                .map { integerBooleanPair -> integerBooleanPair.first }");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getNumOfUnreadSMS$lambda-20, reason: not valid java name */
    public static final android.util.Pair m3561getNumOfUnreadSMS$lambda20(java.lang.Integer first, java.lang.Boolean second) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(first, "first");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(second, "second");
        return new android.util.Pair(first, second);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getNumOfUnreadSMS$lambda-21, reason: not valid java name */
    public static final boolean m3562getNumOfUnreadSMS$lambda21(android.util.Pair integerMessageEventPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integerMessageEventPair, "integerMessageEventPair");
        java.lang.Object obj = integerMessageEventPair.second;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "integerMessageEventPair.second");
        return ((java.lang.Boolean) obj).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getNumOfUnreadSMS$lambda-22, reason: not valid java name */
    public static final java.lang.Integer m3563getNumOfUnreadSMS$lambda22(android.util.Pair integerBooleanPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integerBooleanPair, "integerBooleanPair");
        return (java.lang.Integer) integerBooleanPair.first;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Boolean> getCallsNotification() {
        return this.callsNotificationSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Boolean> getMessagesNotification() {
        return this.messagesNotificationSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Boolean> getAlarmsNotification() {
        return this.alarmsNotificationSubject;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Boolean> getActivityGoalsNotification() {
        return this.activityGoalsNotificationSubject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInitialNotificationsStates(powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, android.content.Context context) {
        boolean z = false;
        if (!INSTANCE.isNotificationServiceEnabled(context)) {
            this.notificationTypeController.enableApp((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE, false);
            this.notificationTypeController.enableApp((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType) powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE, false);
            return;
        }
        boolean areNotificationSupported = device.getAreNotificationSupported();
        this.mNotificationsEnabledGlobally.onNext(java.lang.Boolean.valueOf(areNotificationSupported));
        this.notificationTypeController.enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE, device.getAreCallsNotificationEnabled() && areNotificationSupported);
        this.alarmsNotificationSubject.onNext(java.lang.Boolean.valueOf(device.getAreAlarmsNotificationsEnabled() && areNotificationSupported));
        this.notificationTypeController.enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE, device.getAreMessagesNotificationEnabled() && areNotificationSupported);
        io.reactivex.subjects.ReplaySubject<java.lang.Boolean> replaySubject = this.activityGoalsNotificationSubject;
        if (device.getAreGoalsNotificationEnabled() && areNotificationSupported) {
            z = true;
        }
        replaySubject.onNext(java.lang.Boolean.valueOf(z));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public void invalidateNotifications(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.numOfMissedCalls.clear();
        this.numOfMissedMessages.clear();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(context).sendBroadcast(new android.content.Intent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConstantsKt.CURRENT_NOTIFICATIONS_REQUEST));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager
    public io.reactivex.Observable<java.lang.Boolean> getNotificationsEnabledGlobally() {
        return this.mNotificationsEnabledGlobally;
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public io.reactivex.Completable setCallsNotificationEnabled(final boolean isEnabled, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device value = this.deviceSubject.getValue();
        if (value != null) {
            io.reactivex.Completable completableDoOnComplete = this.deviceRepository.update(value.copy((1535 & 1) != 0 ? value.uid : 0L, (1535 & 2) != 0 ? value.serialNumber : null, (1535 & 4) != 0 ? value.bluetoothAddress : null, (1535 & 8) != 0 ? value.pid : 0, (1535 & 16) != 0 ? value.firmwareVersion : null, (1535 & 32) != 0 ? value.productName : null, (1535 & 64) != 0 ? value.shouldSync : null, (1535 & 128) != 0 ? value.callNotification : isEnabled, (1535 & 256) != 0 ? value.messageNotification : false, (1535 & 512) != 0 ? value.activityGoalNotification : false, (1535 & 1024) != 0 ? value.alarmNotification : false)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$8vHlpSvQkHyBDk6KaS2DSB8oSOM
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3585setCallsNotificationEnabled$lambda23(isEnabled, this);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "{\n\n            val updatedDevice = device.copy(callNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete {\n                        if (!isEnabled) {\n                            // clear notifications if exists\n                            missedCallsSubject.onNext(0)\n                        } else {\n                            // send current state of call notifications\n                            missedCallsSubject.onNext(missedMessageCount)\n                        }\n                        notificationTypeController.enableApp(NotificationAppType.Calls, isEnabled)\n                    }\n        }");
            return completableDoOnComplete;
        }
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("Device doesn't exist"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"Device doesn't exist\"))");
        return completableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCallsNotificationEnabled$lambda-23, reason: not valid java name */
    public static final void m3585setCallsNotificationEnabled$lambda23(boolean z, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            this$0.missedCallsSubject.onNext(0);
        } else {
            this$0.missedCallsSubject.onNext(java.lang.Integer.valueOf(this$0.getMissedMessageCount()));
        }
        this$0.notificationTypeController.enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE, z);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public io.reactivex.Completable setMessagesNotificationEnabled(final boolean isEnabled, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device value = this.deviceSubject.getValue();
        if (value != null) {
            io.reactivex.Completable completableDoOnComplete = this.deviceRepository.update(value.copy((1535 & 1) != 0 ? value.uid : 0L, (1535 & 2) != 0 ? value.serialNumber : null, (1535 & 4) != 0 ? value.bluetoothAddress : null, (1535 & 8) != 0 ? value.pid : 0, (1535 & 16) != 0 ? value.firmwareVersion : null, (1535 & 32) != 0 ? value.productName : null, (1535 & 64) != 0 ? value.shouldSync : null, (1535 & 128) != 0 ? value.callNotification : false, (1535 & 256) != 0 ? value.messageNotification : isEnabled, (1535 & 512) != 0 ? value.activityGoalNotification : false, (1535 & 1024) != 0 ? value.alarmNotification : false)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$W561JzjDs39CjvJwP8AJx8Qhhqc
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3586setMessagesNotificationEnabled$lambda24(isEnabled, this);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "{\n            val updatedDevice = device.copy(messageNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete {\n                        if (!isEnabled) {\n                            missedSMSSubject.onNext(0)\n                        } else {\n                            missedSMSSubject.onNext(missedMessageCount)\n                        }\n                        notificationTypeController.enableApp(NotificationAppType.SMS, isEnabled)\n                    }\n        }");
            return completableDoOnComplete;
        }
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("Device doesn't exist"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"Device doesn't exist\"))");
        return completableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setMessagesNotificationEnabled$lambda-24, reason: not valid java name */
    public static final void m3586setMessagesNotificationEnabled$lambda24(boolean z, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z) {
            this$0.missedSMSSubject.onNext(0);
        } else {
            this$0.missedSMSSubject.onNext(java.lang.Integer.valueOf(this$0.getMissedMessageCount()));
        }
        this$0.notificationTypeController.enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE, z);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public io.reactivex.Completable setAlarmsNotificationEnabled(final boolean isEnabled, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device value = this.deviceSubject.getValue();
        if (value != null) {
            io.reactivex.Completable completableDoOnComplete = this.deviceRepository.update(value.copy((1535 & 1) != 0 ? value.uid : 0L, (1535 & 2) != 0 ? value.serialNumber : null, (1535 & 4) != 0 ? value.bluetoothAddress : null, (1535 & 8) != 0 ? value.pid : 0, (1535 & 16) != 0 ? value.firmwareVersion : null, (1535 & 32) != 0 ? value.productName : null, (1535 & 64) != 0 ? value.shouldSync : null, (1535 & 128) != 0 ? value.callNotification : false, (1535 & 256) != 0 ? value.messageNotification : false, (1535 & 512) != 0 ? value.activityGoalNotification : false, (1535 & 1024) != 0 ? value.alarmNotification : isEnabled)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$dGMCy0aLPcvgA2_nA5NZ98g2e6k
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3584setAlarmsNotificationEnabled$lambda25(this.f$0, isEnabled);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "{\n            val updatedDevice = device.copy(alarmNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete { alarmsNotificationSubject.onNext(isEnabled) }\n        }");
            return completableDoOnComplete;
        }
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("Device doesn't exist"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"Device doesn't exist\"))");
        return completableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setAlarmsNotificationEnabled$lambda-25, reason: not valid java name */
    public static final void m3584setAlarmsNotificationEnabled$lambda25(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.alarmsNotificationSubject.onNext(java.lang.Boolean.valueOf(z));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public io.reactivex.Completable setActivityGoalsNotificationEnabled(final boolean isEnabled, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device value = this.deviceSubject.getValue();
        if (value != null) {
            io.reactivex.Completable completableDoOnComplete = this.deviceRepository.update(value.copy((1535 & 1) != 0 ? value.uid : 0L, (1535 & 2) != 0 ? value.serialNumber : null, (1535 & 4) != 0 ? value.bluetoothAddress : null, (1535 & 8) != 0 ? value.pid : 0, (1535 & 16) != 0 ? value.firmwareVersion : null, (1535 & 32) != 0 ? value.productName : null, (1535 & 64) != 0 ? value.shouldSync : null, (1535 & 128) != 0 ? value.callNotification : false, (1535 & 256) != 0 ? value.messageNotification : false, (1535 & 512) != 0 ? value.activityGoalNotification : isEnabled, (1535 & 1024) != 0 ? value.alarmNotification : false)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$0L28i3nB6qjcma1zB6AGIWRL7vk
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3583setActivityGoalsNotificationEnabled$lambda26(this.f$0, isEnabled);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "{\n            val updatedDevice = device.copy(activityGoalNotification = isEnabled)\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete { activityGoalsNotificationSubject.onNext(isEnabled) }\n        }");
            return completableDoOnComplete;
        }
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("Device doesn't exist"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"Device doesn't exist\"))");
        return completableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setActivityGoalsNotificationEnabled$lambda-26, reason: not valid java name */
    public static final void m3583setActivityGoalsNotificationEnabled$lambda26(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl this$0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activityGoalsNotificationSubject.onNext(java.lang.Boolean.valueOf(z));
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage
    public void setThirdPartAppEnabled(java.lang.String appPackageName, boolean enabled, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        setNotificationForAppEnabled(appPackageName, context, enabled);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ThirdPartyAppStorage
    public boolean isAppNotificationEnabled(android.content.Context context, java.lang.String appPackageName, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        return isNotificationForAppEnabled(appPackageName, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int incrementNumOfMessages(java.lang.String eventPackageName) {
        if (eventPackageName != null) {
            this.numOfMissedMessages.add(eventPackageName);
        }
        return this.numOfMissedMessages.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int decrementNumOfMessages(java.lang.String eventPackageName) {
        if (eventPackageName != null) {
            this.numOfMissedMessages.remove(eventPackageName);
        }
        return this.numOfMissedMessages.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int incrementNumOfCalls(java.lang.String eventPackageName) {
        if (eventPackageName != null) {
            this.numOfMissedCalls.add(eventPackageName);
        }
        return this.numOfMissedCalls.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int decrementNumOfCalls(java.lang.String eventPackageName) {
        java.util.HashSet<java.lang.String> hashSet = this.numOfMissedCalls;
        java.util.Objects.requireNonNull(hashSet, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(hashSet).remove(eventPackageName);
        return this.numOfMissedCalls.size();
    }

    private final boolean isNotificationForAppEnabled(java.lang.String appPackageName, android.content.Context context) {
        if (context == null) {
            return true;
        }
        android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        kotlin.jvm.internal.Intrinsics.checkNotNull(appPackageName);
        return defaultSharedPreferences.getBoolean(kotlin.jvm.internal.Intrinsics.stringPlus(APP_NOTIFICATION_ENABLED, appPackageName), true);
    }

    private final void setNotificationForAppEnabled(java.lang.String appPackageName, android.content.Context context, boolean value) {
        android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(kotlin.jvm.internal.Intrinsics.stringPlus(APP_NOTIFICATION_ENABLED, appPackageName), value).apply();
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsStorage
    public io.reactivex.Completable setNotificationTypesEnabled(final boolean calls, final boolean messages, final boolean alarms, final boolean activityGoals, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        powerwatch.matrix.com.pwgen2android.shared.data.models.Device value = this.deviceSubject.getValue();
        if (value != null) {
            io.reactivex.Completable completableDoOnComplete = this.deviceRepository.update(value.copy((1535 & 1) != 0 ? value.uid : 0L, (1535 & 2) != 0 ? value.serialNumber : null, (1535 & 4) != 0 ? value.bluetoothAddress : null, (1535 & 8) != 0 ? value.pid : 0, (1535 & 16) != 0 ? value.firmwareVersion : null, (1535 & 32) != 0 ? value.productName : null, (1535 & 64) != 0 ? value.shouldSync : null, (1535 & 128) != 0 ? value.callNotification : calls, (1535 & 256) != 0 ? value.messageNotification : messages, (1535 & 512) != 0 ? value.activityGoalNotification : activityGoals, (1535 & 1024) != 0 ? value.alarmNotification : alarms)).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsManagerImpl$unZamR3mbqonm3O1iChY3E4O9WY
                @Override // io.reactivex.functions.Action
                public final void run() {
                    powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.m3587setNotificationTypesEnabled$lambda31(this.f$0, calls, messages, alarms, activityGoals);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "{\n\n            val updatedDevice = device.copy(\n                    callNotification = calls,\n                    messageNotification = messages,\n                    alarmNotification = alarms,\n                    activityGoalNotification = activityGoals\n            )\n\n            deviceRepository.update(updatedDevice)\n                    .doOnComplete {\n\n                        // clear call notifications if exists\n                        missedCallsSubject.onNext(if (calls) missedCallsCount else 0)\n                        notificationTypeController.enableApp(NotificationAppType.Calls, calls)\n\n                        // clear message notifications if exists\n                        missedSMSSubject.onNext(if (messages) missedMessageCount else 0)\n                        notificationTypeController.enableApp(NotificationAppType.SMS, messages)//TODO Provjeriti da li treba messages ovde?\n\n                        alarmsNotificationSubject.onNext(alarms)\n                        activityGoalsNotificationSubject.onNext(activityGoals)\n                    }\n        }");
            return completableDoOnComplete;
        }
        io.reactivex.Completable completableError = io.reactivex.Completable.error(new java.lang.Throwable("Device doesn't exist"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableError, "error(Throwable(\"Device doesn't exist\"))");
        return completableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setNotificationTypesEnabled$lambda-31, reason: not valid java name */
    public static final void m3587setNotificationTypesEnabled$lambda31(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl this$0, boolean z, boolean z2, boolean z3, boolean z4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.missedCallsSubject.onNext(java.lang.Integer.valueOf(z ? this$0.getMissedCallsCount() : 0));
        this$0.notificationTypeController.enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.Calls.INSTANCE, z);
        this$0.missedSMSSubject.onNext(java.lang.Integer.valueOf(z2 ? this$0.getMissedMessageCount() : 0));
        this$0.notificationTypeController.enableApp(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.resolver.type.NotificationAppType.SMS.INSTANCE, z2);
        this$0.alarmsNotificationSubject.onNext(java.lang.Boolean.valueOf(z3));
        this$0.activityGoalsNotificationSubject.onNext(java.lang.Boolean.valueOf(z4));
    }

    /* JADX INFO: compiled from: AlertsManagerImpl.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManagerImpl$Companion;", "", "()V", "ACTION_NOTIFICATION_LISTENER_SETTINGS", "", "APP_NOTIFICATION_ENABLED", "CALLS_COUNT", "ENABLED_NOTIFICATION_LISTENERS", "GLOBAL_NOTIFICATION_SERVICE_USER_DISABLED", "MESSAGE_COUNT", "MISSED_CALLS_URI", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "MISSED_SMS_URI", "TAG", "getContactDisplayNameByNumber", "context", "Landroid/content/Context;", "number", "isGlobalServiceUserDeclined", "", "isNotificationServiceEnabled", "userDeclinedGlobalService", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final java.lang.String getContactDisplayNameByNumber(android.content.Context context, java.lang.String number) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "number");
            java.lang.String string = null;
            if (number.length() == 0) {
                return null;
            }
            try {
                android.database.Cursor cursorQuery = context.getContentResolver().query(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, android.net.Uri.encode(number)), new java.lang.String[]{"_id", "display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                        }
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            } catch (java.lang.SecurityException unused) {
            }
            return string;
        }

        public final boolean isGlobalServiceUserDeclined(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.GLOBAL_NOTIFICATION_SERVICE_USER_DISABLED, false);
        }

        public final void userDeclinedGlobalService(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            androidx.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.GLOBAL_NOTIFICATION_SERVICE_USER_DISABLED, true).commit();
        }

        public final boolean isNotificationServiceEnabled(android.content.Context context) {
            java.util.List listEmptyList;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.lang.String packageName = context.getPackageName();
            java.lang.String flat = android.provider.Settings.Secure.getString(context.getContentResolver(), powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManagerImpl.ENABLED_NOTIFICATION_LISTENERS);
            java.lang.String str = flat;
            if (!android.text.TextUtils.isEmpty(str)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flat, "flat");
                java.util.List<java.lang.String> listSplit = new kotlin.text.Regex(":").split(str, 0);
                if (!listSplit.isEmpty()) {
                    java.util.ListIterator<java.lang.String> listIterator = listSplit.listIterator(listSplit.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (!(listIterator.previous().length() == 0)) {
                                listEmptyList = kotlin.collections.CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                            break;
                        }
                    }
                } else {
                    listEmptyList = kotlin.collections.CollectionsKt.emptyList();
                    break;
                }
                java.lang.Object[] array = listEmptyList.toArray(new java.lang.String[0]);
                java.util.Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                java.lang.String[] strArr = (java.lang.String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    java.lang.String str2 = strArr[i];
                    i++;
                    android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str2);
                    if (componentNameUnflattenFromString != null && android.text.TextUtils.equals(packageName, componentNameUnflattenFromString.getPackageName())) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
