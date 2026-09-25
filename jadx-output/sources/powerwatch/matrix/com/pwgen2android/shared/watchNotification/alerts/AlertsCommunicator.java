package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts;

/* JADX INFO: compiled from: AlertsCommunicator.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ:\u0010\u0018\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00150 0\u001fH\u0002J:\u0010!\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u00020\u00150 0\u001fH\u0002J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u0019J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001bH\u0002J\u001c\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0019H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsCommunicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "alertsManager", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "appContext", "Landroid/content/Context;", "alertsCache", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;", "(Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsManager;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V", "alertsLiteCommunicator", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "deviceStatusSubject", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "kotlin.jvm.PlatformType", "notificationsDisposable", "createSendingEventObservable", "", "T", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/events/AlertEvent;", "eventObservable", "Lio/reactivex/Observable;", "action", "Lio/reactivex/functions/Consumer;", "Lkotlin/Pair;", "createSendingMissingObservable", "", "missingObservable", "destroy", "init", "logSendingMessage", "messageType", "", "messageEvent", "sendNotification", "operationObs", "Lio/reactivex/Completable;", "discardIfNeeded", "", "subscribeToGen1", "subscribeToGen2", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlertsCommunicator implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache alertsCache;
    private powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager alertsManager;
    private final android.content.Context appContext;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> deviceStatusSubject;
    private io.reactivex.disposables.CompositeDisposable notificationsDisposable;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendNotification$lambda-28$lambda-26, reason: not valid java name */
    public static final void m3530sendNotification$lambda28$lambda26(kotlin.Unit unit) {
    }

    public AlertsCommunicator(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager alertsManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, android.content.Context appContext, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache alertsCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsManager, "alertsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsCache, "alertsCache");
        this.alertsManager = alertsManager;
        this.communicator = communicator;
        this.deviceManager = deviceManager;
        this.deviceCommunicationQueuer = deviceCommunicationQueuer;
        this.appContext = appContext;
        this.alertsCache = alertsCache;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.notificationsDisposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<DeviceInfo>()");
        this.deviceStatusSubject = publishSubjectCreate;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ AlertsCommunicator(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsManager alertsManager, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, android.content.Context context, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache sentAlertsCache, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(alertsManager, communicator, deviceManager, deviceCommunicationQueuer, context, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache() : sentAlertsCache);
    }

    public final void init() {
        this.compositeDisposable.dispose();
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.notificationsDisposable.dispose();
        this.notificationsDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.compositeDisposable.add(powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(this.deviceManager, false, 1, null).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$ICVfqYjNioAG7GcH2YeGuQhLv3U
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3521init$lambda0((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$Sq0RI6lQGDPl9JSKdtrmnytTpjc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3522init$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$fg_dEtuqIp3XBOq9dD3igfACZV4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3523init$lambda3(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final boolean m3521init$lambda0(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !it.isDefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-2, reason: not valid java name */
    public static final void m3522init$lambda2(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (deviceInfo.isConnected()) {
            boolean z = true;
            androidx.core.app.JobIntentService.enqueueWork(this$0.appContext, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.NotificationCollectorMonitorService.class, 1, new android.content.Intent());
            java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos = deviceInfo.getConnectionInfos();
            if (!(connectionInfos instanceof java.util.Collection) || !connectionInfos.isEmpty()) {
                java.util.Iterator<T> it = connectionInfos.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                } while (!(((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) it.next()).getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS));
            } else {
                z = false;
                break;
            }
            if (z) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator = this$0.communicator;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceInfo, "deviceInfo");
                this$0.alertsLiteCommunicator = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator(communicator, deviceInfo, null, this$0.alertsCache, 4, null);
                this$0.subscribeToGen2();
            } else {
                this$0.alertsLiteCommunicator = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen1AlertsLiteCommunicator(this$0.communicator, null, null, null, 14, null);
                this$0.subscribeToGen1();
            }
        } else {
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Clearing notification subscribers on watch disconnect...", null, 2, null);
            this$0.notificationsDisposable.clear();
        }
        this$0.deviceStatusSubject.onNext(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-3, reason: not valid java name */
    public static final void m3523init$lambda3(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError(this$0, "Connection for sending notifications died!", th);
    }

    private final void subscribeToGen1() {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Listener for Gen1 subscribed, waiting for notifications to be pushed..", null, 2, null);
        createSendingEventObservable(this.alertsManager.getRealtimeCallEvents(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING), new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$RNnGU4QG1cV4lrF7hJN9T5Lo0XA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3537subscribeToGen1$lambda5(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> observableDistinctUntilChanged = this.alertsManager.getSMSRealtimeEvent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "alertsManager.getSMSRealtimeEvent(SMSState.RECEIVED)\n                .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$wfIDDF9rDqUVddGnMYtBXJXiips
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3538subscribeToGen1$lambda6(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<java.lang.Integer> observableFilter = this.alertsManager.getNumOfMissedCalls().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$SVqmpyZ9nLJIdLWvGtZn9wha9Po
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3539subscribeToGen1$lambda7((java.lang.Integer) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "alertsManager.getNumOfMissedCalls()\n                .filter { it > 0 }");
        createSendingMissingObservable(observableFilter, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$v5zvv7JdN9Z-SZYb_S8WWdyjt4o
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3540subscribeToGen1$lambda8(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<java.lang.Integer> observableFilter2 = this.alertsManager.getNumOfMissedCalls().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$Dk3WYMzu1Cta5FDMjkgFGrnWlt8
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3541subscribeToGen1$lambda9((java.lang.Integer) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter2, "alertsManager.getNumOfMissedCalls()\n                .filter { it == 0 }");
        createSendingMissingObservable(observableFilter2, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$rXc0nLU7qxmQByX-wVKV28ZgmX8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3532subscribeToGen1$lambda10(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<java.lang.Integer> observableFilter3 = this.alertsManager.getNumOfUnreadSMS().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$FIGsXhR1utIFPATqgjXAnuwHkqQ
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3533subscribeToGen1$lambda11((java.lang.Integer) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter3, "alertsManager.getNumOfUnreadSMS()\n                .filter { it > 0 }");
        createSendingMissingObservable(observableFilter3, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$mkUrE9XMvsh6cI323Pzg2X1OB28
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3534subscribeToGen1$lambda12(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<java.lang.Integer> observableFilter4 = this.alertsManager.getNumOfUnreadSMS().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$whapDCeeq1XwNXIRKiyo4CunKPw
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3535subscribeToGen1$lambda13((java.lang.Integer) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter4, "alertsManager.getNumOfUnreadSMS()\n                .filter { it == 0 }");
        createSendingMissingObservable(observableFilter4, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$8vdWCZOGizQ8qdns6KQZBu9FFc4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3536subscribeToGen1$lambda14(this.f$0, (kotlin.Pair) obj);
            }
        });
        this.alertsManager.invalidateNotifications(this.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-5, reason: not valid java name */
    public static final void m3537subscribeToGen1$lambda5(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) pair.getFirst();
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        if (alertsLiteCommunicator == null) {
            return;
        }
        io.reactivex.Observable observable = alertsLiteCommunicator.sendImportantCallAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) callEvent.getId(), callEvent.getTitle(), callEvent.getSubTitle(), callEvent.getText(), callEvent.getPostTimestamp(), callEvent.getNotificationTimestamp()).toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "alertsCommunicatorNotNull.sendImportantCallAlert(it.second.uid, notification.id.toShort(), notification.title, notification.subTitle, notification.text, notification.postTimestamp, notification.notificationTimestamp)\n                                .toObservable<Unit>()");
        this$0.deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable, null, null, 6, null)).subscribe();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-6, reason: not valid java name */
    public static final void m3538subscribeToGen1$lambda6(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent messageEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) pair.getFirst();
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendImportantMessageAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) messageEvent.getId(), messageEvent.getTitle(), messageEvent.getSubTitle(), messageEvent.getText(), messageEvent.getPostTimestamp(), messageEvent.getNotificationTimestamp()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-7, reason: not valid java name */
    public static final boolean m3539subscribeToGen1$lambda7(java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.intValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-8, reason: not valid java name */
    public static final void m3540subscribeToGen1$lambda8(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendSilentCallAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) -1, "", "", "", 0L, 0L), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-9, reason: not valid java name */
    public static final boolean m3541subscribeToGen1$lambda9(java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.intValue() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-10, reason: not valid java name */
    public static final void m3532subscribeToGen1$lambda10(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendClearCallIconAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) -1, "", "", "", 0L, 0L), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-11, reason: not valid java name */
    public static final boolean m3533subscribeToGen1$lambda11(java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.intValue() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-12, reason: not valid java name */
    public static final void m3534subscribeToGen1$lambda12(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendSilentMessageAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) -1, "", "", "", 0L, 0L), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-13, reason: not valid java name */
    public static final boolean m3535subscribeToGen1$lambda13(java.lang.Integer it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.intValue() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen1$lambda-14, reason: not valid java name */
    public static final void m3536subscribeToGen1$lambda14(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendClearMessageIconAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) -1, "", "", "", 0L, 0L), false, 2, null);
    }

    private final void subscribeToGen2() {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Listener for Gen2 subscribed, waiting for notifications to be pushed..", null, 2, null);
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> observableDistinctUntilChanged = this.alertsManager.getCurrentCallNotifications(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "alertsManager.getCurrentCallNotifications(CallState.MISSED)\n                        .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$Wv0w1eOVNyw1vMmeq7q9ziRKU3M
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3542subscribeToGen2$lambda15(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> observableDistinctUntilChanged2 = this.alertsManager.getCurrentMessagesNotifications(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "alertsManager.getCurrentMessagesNotifications(SMSState.RECEIVED)\n                .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged2, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$Ix79mZ30ofUuHWPXzraS__oDEGM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3543subscribeToGen2$lambda16(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> observableDistinctUntilChanged3 = this.alertsManager.getRealtimeCallEvents(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.RINGING).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "alertsManager.getRealtimeCallEvents(CallState.RINGING)\n                        .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged3, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$xWsk-i7bxiWhHjAB_7GIlnBggfI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3544subscribeToGen2$lambda17(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent> observableDistinctUntilChanged4 = this.alertsManager.getRealtimeCallEvents(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.MISSED).throttleFirst(2000L, java.util.concurrent.TimeUnit.MILLISECONDS).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "alertsManager.getRealtimeCallEvents(CallState.MISSED)\n                        .throttleFirst(2000, TimeUnit.MILLISECONDS)\n                        .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged4, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$8SuO7AE5W3DZRd9Vuw8uIS4xVuM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3545subscribeToGen2$lambda18(this.f$0, (kotlin.Pair) obj);
            }
        });
        createSendingEventObservable(this.alertsManager.getRealtimeCallEvents(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.DISMISSED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallState.ANSWERED), new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$dnNLDmWaFUBriiT8qCHcyILdGf4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3546subscribeToGen2$lambda19(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> observableDistinctUntilChanged5 = this.alertsManager.getSMSRealtimeEvent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.RECEIVED).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "alertsManager.getSMSRealtimeEvent(SMSState.RECEIVED)\n                        .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged5, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$2IyLh5TL3qiWFD-t32NFEQxzT84
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3547subscribeToGen2$lambda20(this.f$0, (kotlin.Pair) obj);
            }
        });
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent> observableDistinctUntilChanged6 = this.alertsManager.getSMSRealtimeEvent(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.SMSState.DISMISSED).distinctUntilChanged();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "alertsManager.getSMSRealtimeEvent(SMSState.DISMISSED)\n                .distinctUntilChanged()");
        createSendingEventObservable(observableDistinctUntilChanged6, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$pGHpbAcgDpI0zUBUzesQ6QLv0iE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3548subscribeToGen2$lambda21(this.f$0, (kotlin.Pair) obj);
            }
        });
        this.alertsManager.invalidateNotifications(this.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-15, reason: not valid java name */
    public static final void m3542subscribeToGen2$lambda15(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent notification = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notification, "notification");
        this$0.logSendingMessage("important call from existing", notification);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendPreExistingCallAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-16, reason: not valid java name */
    public static final void m3543subscribeToGen2$lambda16(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent notification = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notification, "notification");
        this$0.logSendingMessage("silent message", notification);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendPreExistingMessageAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-17, reason: not valid java name */
    public static final void m3544subscribeToGen2$lambda17(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent notification = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notification, "notification");
        this$0.logSendingMessage("important call realtime", notification);
        io.reactivex.Completable completableSendImportantCallAlert = null;
        if (notification.isVoip()) {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
            if (alertsLiteCommunicator != null) {
                completableSendImportantCallAlert = alertsLiteCommunicator.sendSilentIncomingCallAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp());
            }
        } else {
            powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator2 = this$0.alertsLiteCommunicator;
            if (alertsLiteCommunicator2 != null) {
                completableSendImportantCallAlert = alertsLiteCommunicator2.sendImportantCallAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp());
            }
        }
        this$0.sendNotification(completableSendImportantCallAlert, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-18, reason: not valid java name */
    public static final void m3545subscribeToGen2$lambda18(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent notification = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notification, "notification");
        this$0.logSendingMessage("silent call", notification);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendSilentCallAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-19, reason: not valid java name */
    public static final void m3546subscribeToGen2$lambda19(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent callEvent = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.CallEvent) pair.getFirst();
        this$0.logSendingMessage("clear call", callEvent);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendClearCallIconAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) callEvent.getId(), callEvent.getTitle(), callEvent.getSubTitle(), callEvent.getText(), callEvent.getPostTimestamp(), callEvent.getNotificationTimestamp()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-20, reason: not valid java name */
    public static final void m3547subscribeToGen2$lambda20(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent notification = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notification, "notification");
        this$0.logSendingMessage("silent message", notification);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendSilentMessageAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp()), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribeToGen2$lambda-21, reason: not valid java name */
    public static final void m3548subscribeToGen2$lambda21(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator this$0, kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent notification = (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.MessageEvent) pair.getFirst();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notification, "notification");
        this$0.logSendingMessage("clear message", notification);
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator alertsLiteCommunicator = this$0.alertsLiteCommunicator;
        sendNotification$default(this$0, alertsLiteCommunicator == null ? null : alertsLiteCommunicator.sendClearMessageIconAlert(((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) pair.getSecond()).getUid(), (short) notification.getId(), notification.getTitle(), notification.getSubTitle(), notification.getText(), notification.getPostTimestamp(), notification.getNotificationTimestamp()), false, 2, null);
    }

    private final void logSendingMessage(java.lang.String messageType, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent messageEvent) {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator alertsCommunicator = this;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Sending ");
        sb.append(messageType);
        sb.append(" notification: ");
        java.lang.String appPackageName = messageEvent.getAppPackageName();
        if (appPackageName == null) {
            appPackageName = "null";
        }
        sb.append(appPackageName);
        sb.append(", time - ");
        sb.append(messageEvent.getNotificationTimestamp());
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(alertsCommunicator, sb.toString(), null, 2, null);
    }

    private final <T extends powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent> void createSendingEventObservable(io.reactivex.Observable<T> eventObservable, io.reactivex.functions.Consumer<kotlin.Pair<T, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo>> action) {
        this.notificationsDisposable.add(eventObservable.withLatestFrom(this.deviceStatusSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$TIY8vhzBSjXcHPyj5tkyeshMbXU
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3517createSendingEventObservable$lambda22((powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent) obj, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$cB25r7Jtgp28CwcTb6MtnMmkl_g
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3518createSendingEventObservable$lambda23((kotlin.Pair) obj);
            }
        }).subscribe(action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createSendingEventObservable$lambda-22, reason: not valid java name */
    public static final kotlin.Pair m3517createSendingEventObservable$lambda22(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.events.AlertEvent call, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return new kotlin.Pair(call, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createSendingEventObservable$lambda-23, reason: not valid java name */
    public static final boolean m3518createSendingEventObservable$lambda23(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) it.getSecond()).isConnected();
    }

    private final <T extends java.lang.Number> void createSendingMissingObservable(io.reactivex.Observable<T> missingObservable, io.reactivex.functions.Consumer<kotlin.Pair<T, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo>> action) {
        this.notificationsDisposable.add(io.reactivex.Observable.combineLatest(missingObservable, this.deviceStatusSubject, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$-aTIMPS2DNBhqTuGQmgaL6rBnxo
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3519createSendingMissingObservable$lambda24((java.lang.Number) obj, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj2);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$l-HEwcwD6IWIDlti7QPPuNZzyM0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3520createSendingMissingObservable$lambda25((kotlin.Pair) obj);
            }
        }).subscribe(action));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createSendingMissingObservable$lambda-24, reason: not valid java name */
    public static final kotlin.Pair m3519createSendingMissingObservable$lambda24(java.lang.Number missedNumber, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missedNumber, "missedNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        return new kotlin.Pair(missedNumber, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createSendingMissingObservable$lambda-25, reason: not valid java name */
    public static final boolean m3520createSendingMissingObservable$lambda25(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return ((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) it.getSecond()).isConnected();
    }

    static /* synthetic */ void sendNotification$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator alertsCommunicator, io.reactivex.Completable completable, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        alertsCommunicator.sendNotification(completable, z);
    }

    private final void sendNotification(io.reactivex.Completable operationObs, boolean discardIfNeeded) {
        if (operationObs == null) {
            return;
        }
        io.reactivex.Observable observable = operationObs.toObservable();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observable, "it\n                            .toObservable<Unit>()");
        this.deviceCommunicationQueuer.queue(new powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation(observable, discardIfNeeded ? powerwatch.matrix.com.pwgen2android.sdk.OperationType.Discard.INSTANCE : powerwatch.matrix.com.pwgen2android.sdk.OperationType.Delayer.INSTANCE, null, 4, null)).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$6ijcxN8Z2G5cSU5QgPO7efUngXY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsCommunicator.m3530sendNotification$lambda28$lambda26((kotlin.Unit) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.-$$Lambda$AlertsCommunicator$_AblNJuM3VJ6rQqR799Joy3pEd4
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.lang.Throwable) obj).printStackTrace();
            }
        });
    }

    public final void destroy() {
        this.notificationsDisposable.dispose();
        this.compositeDisposable.dispose();
    }
}
