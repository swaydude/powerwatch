package powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2;

/* JADX INFO: compiled from: AlertsExecutor.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B)\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\"\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020#H\u0002J@\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u0010-\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u0010.\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00100\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00101\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00102\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00103\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J@\u00104\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014 \u000f*\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsCommunicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsLiteCommunicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "gen2AlertsConfiguration", "alertsCache", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;", "(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfiguration;Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/SentAlertsCache;)V", "alertExecutorObs", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "alertRequestSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/Gen2AlertsData;", "alertsExecutor", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/gen2/AlertsExecutor;", "getCommunicator", "()Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "getDeviceInfo", "()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "initAlerts", "Lio/reactivex/Completable;", "deviceId", "alertsConfig", "Lpowerwatch/matrix/com/pwgen2android/shared/watchNotification/alerts/AlertsConfig;", "sendAlertToExecutor", "gen2AlertsData", "checkCache", "", "sendClearCallIconAlert", "uid", "", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_TITLE_KEY, "subTitle", "body", "postTime", "", "notificationTime", "sendClearMessageIconAlert", "sendImportantCallAlert", "sendImportantMessageAlert", "sendPreExistingCallAlert", "sendPreExistingMessageAlert", "sendSilentCallAlert", "sendSilentIncomingCallAlert", "sendSilentMessageAlert", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Gen2AlertsCommunicator implements powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.Observable<kotlin.Unit> alertExecutorObs;
    private final io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData>> alertRequestSubject;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache alertsCache;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor alertsExecutor;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo;
    private final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration gen2AlertsConfiguration;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-7$lambda-4, reason: not valid java name */
    public static final void m3617sendAlertToExecutor$lambda7$lambda4(java.lang.Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-8, reason: not valid java name */
    public static final void m3620sendAlertToExecutor$lambda8(io.reactivex.disposables.Disposable disposable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-9, reason: not valid java name */
    public static final void m3621sendAlertToExecutor$lambda9(java.lang.Throwable th) {
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration
    public io.reactivex.Completable initAlerts(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfig alertsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsConfig, "alertsConfig");
        return this.gen2AlertsConfiguration.initAlerts(deviceId, alertsConfig);
    }

    public Gen2AlertsCommunicator(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsConfiguration gen2AlertsConfiguration, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache alertsCache) {
        powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsVer2Executor alertsExecutor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsConfiguration, "gen2AlertsConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertsCache, "alertsCache");
        this.communicator = communicator;
        this.deviceInfo = deviceInfo;
        this.gen2AlertsConfiguration = gen2AlertsConfiguration;
        this.alertsCache = alertsCache;
        short protocolVersion = deviceInfo.getProtocolVersion();
        if (protocolVersion == 0 || protocolVersion == 1) {
            alertsExecutor = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor(communicator);
        } else {
            alertsExecutor = new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsVer2Executor(communicator);
        }
        this.alertsExecutor = alertsExecutor;
        io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData>> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Pair<String, Gen2AlertsData>>()");
        this.alertRequestSubject = publishSubjectCreate;
        io.reactivex.Observable<kotlin.Unit> observableAutoConnect = publishSubjectCreate.concatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$gqs4V9xus_Bm7Uk-0UBPcG5vreo
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3607alertExecutorObs$lambda2(this.f$0, (kotlin.Pair) obj);
            }
        }).repeat().publish().autoConnect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "alertRequestSubject\n            .concatMapSingle {\n                alertsExecutor.sendAlert(it.first, it.second)\n                        .toSingleDefault(Unit)\n                        .doOnError {error ->\n                            error(\"Notification sending failed. Error is: \", error)\n                            error.printStackTrace()\n                        }\n                        .onErrorReturn {\n                            Unit\n                        }\n            }\n            .repeat()\n            .publish()\n            .autoConnect()");
        this.alertExecutorObs = observableAutoConnect;
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator getCommunicator() {
        return this.communicator;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public /* synthetic */ Gen2AlertsCommunicator(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen2AlertsConfiguration gen2AlertsConfiguration, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache sentAlertsCache, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(communicator, deviceInfo, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.Gen2AlertsConfiguration() : gen2AlertsConfiguration, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.SentAlertsCache() : sentAlertsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: alertExecutorObs$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m3607alertExecutorObs$lambda2(final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.AlertsExecutor.sendAlert$default(this$0.alertsExecutor, (java.lang.String) it.getFirst(), (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData) it.getSecond(), 0.0f, 4, null).toSingleDefault(kotlin.Unit.INSTANCE).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$JOULsAztzApoPaUScgAJnXgI8bE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3608alertExecutorObs$lambda2$lambda0(this.f$0, (java.lang.Throwable) obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$FTdX8x2X8TOrS1Yi9kDVELkRiQ4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3609alertExecutorObs$lambda2$lambda1((java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: alertExecutorObs$lambda-2$lambda-0, reason: not valid java name */
    public static final void m3608alertExecutorObs$lambda2$lambda0(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Notification sending failed. Error is: ", th, null, 4, null);
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: alertExecutorObs$lambda-2$lambda-1, reason: not valid java name */
    public static final kotlin.Unit m3609alertExecutorObs$lambda2$lambda1(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ io.reactivex.Completable sendAlertToExecutor$default(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator gen2AlertsCommunicator, java.lang.String str, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return gen2AlertsCommunicator.sendAlertToExecutor(str, gen2AlertsData, z);
    }

    private final io.reactivex.Completable sendAlertToExecutor(final java.lang.String deviceId, final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, final boolean checkCache) {
        io.reactivex.Completable completableDoOnError = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$pKezd1LZYkIdPJ2zGWqjyul2gUw
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3615sendAlertToExecutor$lambda7(checkCache, this, gen2AlertsData, deviceId);
            }
        }).doOnSubscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$0NCXpaynKWFTWnqonmc5QX3izoE
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3620sendAlertToExecutor$lambda8((io.reactivex.disposables.Disposable) obj);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$4dZjv0OC6aK1xw6_DugQdegKwSs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3621sendAlertToExecutor$lambda9((java.lang.Throwable) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDoOnError, "defer {\n            if (checkCache && alertsCache.contains(AlertCacheInfo(gen2AlertsData.notificationTime, gen2AlertsData.uid.toInt(), \"\")))\n                return@defer Completable.complete()\n\n            val request = Single.create<Unit> {\n                alertRequestSubject.onNext(Pair(deviceId, gen2AlertsData))\n                it.onSuccess(Unit)\n            }\n\n            Single.zip(\n                    alertExecutorObs.firstOrError()\n                            .doOnError {\n                                Unit\n                            }, request, BiFunction<Unit, Unit, Unit> { _, _ ->\n                Unit\n            }).ignoreElement()\n                    .doOnComplete {\n                        if (checkCache)\n                            alertsCache.add(AlertCacheInfo(gen2AlertsData.notificationTime, gen2AlertsData.uid.toInt(), gen2AlertsData.title,\n                                    gen2AlertsData.categoryId == ANCSConstants.CategoryID.CATEGORY_ID_OTHER &&\n                                            checkCache &&\n                                            gen2AlertsData.eventId == ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED))\n                    }\n        }\n                .doOnSubscribe { Unit }\n                .doOnError { Unit }");
        return completableDoOnError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-7, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3615sendAlertToExecutor$lambda7(final boolean z, final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, final java.lang.String deviceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "$gen2AlertsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        if (z && this$0.alertsCache.contains(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo(gen2AlertsData.getNotificationTime(), gen2AlertsData.getUid(), "", false, 8, null))) {
            return io.reactivex.Completable.complete();
        }
        io.reactivex.Single singleCreate = io.reactivex.Single.create(new io.reactivex.SingleOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$6plNiEGN1SXTbJWJpe_-dy1BzwQ
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(io.reactivex.SingleEmitter singleEmitter) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3616sendAlertToExecutor$lambda7$lambda3(this.f$0, deviceId, gen2AlertsData, singleEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleCreate, "create<Unit> {\n                alertRequestSubject.onNext(Pair(deviceId, gen2AlertsData))\n                it.onSuccess(Unit)\n            }");
        return io.reactivex.Single.zip(this$0.alertExecutorObs.firstOrError().doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$mKCVCWyaLwTk_GErGAu-iRcrbho
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3617sendAlertToExecutor$lambda7$lambda4((java.lang.Throwable) obj);
            }
        }), singleCreate, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$zLU7yhD2RJQpQCEIDBfPWKfau-4
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3618sendAlertToExecutor$lambda7$lambda5((kotlin.Unit) obj, (kotlin.Unit) obj2);
            }
        }).ignoreElement().doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$v9LOYo6FuOiHgHnIiN2WhbUxYnM
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3619sendAlertToExecutor$lambda7$lambda6(z, this$0, gen2AlertsData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-7$lambda-3, reason: not valid java name */
    public static final void m3616sendAlertToExecutor$lambda7$lambda3(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData, io.reactivex.SingleEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "$gen2AlertsData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.alertRequestSubject.onNext(new kotlin.Pair<>(deviceId, gen2AlertsData));
        it.onSuccess(kotlin.Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-7$lambda-5, reason: not valid java name */
    public static final kotlin.Unit m3618sendAlertToExecutor$lambda7$lambda5(kotlin.Unit noName_0, kotlin.Unit noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendAlertToExecutor$lambda-7$lambda-6, reason: not valid java name */
    public static final void m3619sendAlertToExecutor$lambda7$lambda6(boolean z, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData gen2AlertsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gen2AlertsData, "$gen2AlertsData");
        if (z) {
            this$0.alertsCache.add(new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo(gen2AlertsData.getNotificationTime(), gen2AlertsData.getUid(), gen2AlertsData.getTitle(), gen2AlertsData.getCategoryId() == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER && z && gen2AlertsData.getEventId() == powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED));
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendImportantCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor$default(this, deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_INCOMING_CALL, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_IMPORTANT, (byte) 0, title, null, body, 0, 0, 0, postTime, notificationTime, 1872, null), false, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendSilentIncomingCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor$default(this, deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_INCOMING_CALL, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT, (byte) 0, title, null, body, 0, 0, 0, postTime, notificationTime, 1872, null), false, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendSilentCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor(deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_MISSED_CALL, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT, (byte) 0, title, null, body, 0, 0, 0, postTime, notificationTime, 1872, null), true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendPreExistingCallAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor(deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_MISSED_CALL, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_PRE_EXISTING, (byte) 0, title, null, body, 0, 0, 0, postTime, notificationTime, 1872, null), true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendImportantMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor(deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_IMPORTANT, (byte) 0, title, subTitle, body, 0, 0, 0, postTime, notificationTime, 1808, null), true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendSilentMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor(deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT, (byte) 0, title, subTitle, body, 0, 0, 0, postTime, notificationTime, 1808, null), true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendPreExistingMessageAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor(deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_ADDED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_PRE_EXISTING, (byte) 0, title, subTitle, body, 0, 0, 0, postTime, notificationTime, 1808, null), true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendClearCallIconAlert(java.lang.String deviceId, short uid, java.lang.String title, java.lang.String subTitle, java.lang.String body, long postTime, long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        return sendAlertToExecutor$default(this, deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_MISSED_CALL, uid, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT, (byte) 0, title, subTitle, body, 0, 0, 0, postTime, notificationTime, 1808, null), false, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertsLiteCommunicator
    public io.reactivex.Completable sendClearMessageIconAlert(final java.lang.String deviceId, final short uid, final java.lang.String title, final java.lang.String subTitle, final java.lang.String body, final long postTime, final long notificationTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$-iv7mKQiY4tqGS4nC04ObdYJpV8
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3622sendClearMessageIconAlert$lambda11(this.f$0, title, deviceId, uid, subTitle, body, postTime, notificationTime);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n            if (alertsCache.contains(title)) {\n                Observable.fromIterable(alertsCache.fetchAndRemove(title))\n                        .concatMapCompletable {\n                            sendAlertToExecutor(\n                                    deviceId,\n                                    Gen2AlertsData(\n                                            notificationTime = notificationTime,\n                                            postTime = postTime,\n                                            uid = it.alertId.toShort(),\n                                            title = it.title,\n                                            subTitle = subTitle,\n                                            message = body,\n                                            eventId = ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED,\n                                            eventFlags = ANCSConstants.EventFlag.EVENT_FLAG_SILENT,\n                                            categoryId = ANCSConstants.CategoryID.CATEGORY_ID_OTHER)\n                            )\n                        }\n            } else\n                sendAlertToExecutor(deviceId,\n                        Gen2AlertsData(\n                                notificationTime = notificationTime,\n                                postTime = postTime,\n                                uid = uid,\n                                title = title,\n                                subTitle = subTitle,\n                                message = body,\n                                eventId = ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED,\n                                eventFlags = ANCSConstants.EventFlag.EVENT_FLAG_SILENT,\n                                categoryId = ANCSConstants.CategoryID.CATEGORY_ID_OTHER))\n        }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendClearMessageIconAlert$lambda-11, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3622sendClearMessageIconAlert$lambda11(final powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, java.lang.String title, final java.lang.String deviceId, short s, final java.lang.String subTitle, final java.lang.String body, final long j, final long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "$title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "$subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "$body");
        if (this$0.alertsCache.contains(title)) {
            return io.reactivex.Observable.fromIterable(this$0.alertsCache.fetchAndRemove(title)).concatMapCompletable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.-$$Lambda$Gen2AlertsCommunicator$70wi97uUdpStKTigMuUSKRaFW7o
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator.m3623sendClearMessageIconAlert$lambda11$lambda10(this.f$0, deviceId, subTitle, body, j, j2, (powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo) obj);
                }
            });
        }
        return sendAlertToExecutor$default(this$0, deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER, s, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT, (byte) 0, title, subTitle, body, 0, 0, 0, j, j2, 1808, null), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendClearMessageIconAlert$lambda-11$lambda-10, reason: not valid java name */
    public static final io.reactivex.CompletableSource m3623sendClearMessageIconAlert$lambda11$lambda10(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsCommunicator this$0, java.lang.String deviceId, java.lang.String subTitle, java.lang.String body, long j, long j2, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.AlertCacheInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "$deviceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subTitle, "$subTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "$body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        short alertId = (short) it.getAlertId();
        java.lang.String title = it.getTitle();
        return sendAlertToExecutor$default(this$0, deviceId, new powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.gen2.Gen2AlertsData(powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.CategoryID.CATEGORY_ID_OTHER, alertId, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventID.EVENT_ID_NOTIFICATION_REMOVED, powerwatch.matrix.com.pwgen2android.shared.watchNotification.alerts.ANCSConstants.EventFlag.EVENT_FLAG_SILENT, (byte) 0, title, subTitle, body, 0, 0, 0, j, j2, 1808, null), false, 4, null);
    }
}
