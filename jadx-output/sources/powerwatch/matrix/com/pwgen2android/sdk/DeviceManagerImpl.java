package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010+\u001a\u00020'H\u0016J\b\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020%H\u0002J \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180/2\u0006\u00100\u001a\u00020\u00182\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020'H\u0002J\b\u00104\u001a\u00020'H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00180\u00180\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "deviceRepository", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;", "deviceProtocolStorage", "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "notificationManager", "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;", "bluetoothProvider", "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;", "deviceCommunicationQueuer", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "context", "Landroid/content/Context;", "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "connectionCompositeDisposable", "connectionRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "defaultDisconnectedDeviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "deviceInfoOutput", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "monitoringEvent", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;", "monitoringEvents", "Lio/reactivex/Observable;", "getMonitoringEvents", "()Lio/reactivex/Observable;", "connect", "forceRefresh", "", "connectTo", "", "id", "", "defaultDevice", "destroy", "init", "isMotorola", "readDeviceInfo", "Lio/reactivex/Single;", "deviceInfo", "device", "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;", "startConnection", "stopConnection", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceManagerImpl implements powerwatch.matrix.com.pwgen2android.sdk.DeviceManager, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothProvider;
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable;
    private final io.reactivex.disposables.CompositeDisposable connectionCompositeDisposable;
    private final java.util.concurrent.atomic.AtomicBoolean connectionRunning;
    private final android.content.Context context;
    private final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo defaultDisconnectedDeviceInfo;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer;
    private final io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> deviceInfoOutput;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage;
    private final powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent> monitoringEvent;
    private final powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager;

    public DeviceManagerImpl(powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository, powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceProtocolStorage deviceProtocolStorage, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager notificationManager, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothManager bluetoothProvider, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer deviceCommunicationQueuer, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRepository, "deviceRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceProtocolStorage, "deviceProtocolStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothProvider, "bluetoothProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceCommunicationQueuer, "deviceCommunicationQueuer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.deviceRepository = deviceRepository;
        this.deviceProtocolStorage = deviceProtocolStorage;
        this.communicator = communicator;
        this.notificationManager = notificationManager;
        this.bluetoothProvider = bluetoothProvider;
        this.deviceCommunicationQueuer = deviceCommunicationQueuer;
        this.context = context;
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo("", null, (short) 0, 0, "", null, null, null, 238, null);
        this.defaultDisconnectedDeviceInfo = deviceInfo;
        this.compositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        this.connectionCompositeDisposable = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.BehaviorSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(deviceInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(defaultDisconnectedDeviceInfo)");
        this.deviceInfoOutput = behaviorSubjectCreateDefault;
        this.connectionRunning = new java.util.concurrent.atomic.AtomicBoolean(false);
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<MonitoringEvent>()");
        this.monitoringEvent = publishSubjectCreate;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent> getMonitoringEvents() {
        return this.monitoringEvent;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public void init() {
        if (this.connectionRunning.get()) {
            return;
        }
        this.compositeDisposable.clear();
        this.compositeDisposable.add(this.bluetoothProvider.getChangeState(powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$H30gkb1Jmn0RfbJczjEHuIhlgVA
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2169init$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState) obj);
            }
        }));
        this.connectionRunning.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m2169init$lambda0(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState bluetoothState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Enabled.INSTANCE)) {
            this$0.startConnection();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(bluetoothState, powerwatch.matrix.com.pwgen2android.shared.host.BluetoothState.Disabled.INSTANCE)) {
            this$0.stopConnection();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo defaultDevice() {
        return this.communicator.defaultConnectedDevice();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public void destroy() {
        this.notificationManager.dismissNotification(this.context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getCONNECT_NOTIFICATION_ID());
        this.connectionCompositeDisposable.clear();
        this.compositeDisposable.clear();
        this.communicator.unpairConnectedDevices();
        this.communicator.stopConnection();
        this.deviceInfoOutput.onNext(this.defaultDisconnectedDeviceInfo);
        this.connectionRunning.set(false);
        this.deviceCommunicationQueuer.clear();
    }

    private final boolean isMotorola() {
        java.lang.String manufacturer = android.os.Build.MANUFACTURER;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Testing for " + ((java.lang.Object) manufacturer) + ", os - " + android.os.Build.VERSION.SDK_INT, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(manufacturer, "manufacturer");
        return kotlin.text.StringsKt.contains((java.lang.CharSequence) manufacturer, (java.lang.CharSequence) "Motorola", true);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connect(final boolean forceRefresh) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> observableDoOnNext = this.deviceInfoOutput.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2168connect$lambda1(forceRefresh, this, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "deviceInfoOutput.doOnNext {\n            if (forceRefresh && !isMotorola()) communicator.refreshConnection(it.uid)\n        }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: connect$lambda-1, reason: not valid java name */
    public static final void m2168connect$lambda1(boolean z, powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z || this$0.isMotorola()) {
            return;
        }
        this$0.communicator.refreshConnection(deviceInfo.getUid());
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public void connectTo(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    private final void stopConnection() {
        this.connectionCompositeDisposable.clear();
        this.communicator.stopConnection();
        this.monitoringEvent.onNext(powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingEnded.INSTANCE);
    }

    private final void startConnection() {
        this.connectionCompositeDisposable.add(this.deviceRepository.defaultDevice().doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$wG2Pq4Ar8Nvf1bbq_u33WDdPCps
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2184startConnection$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).flatMapObservable(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$CkNCoiJ0fY0Q0s72wY_B6YdntjU
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2185startConnection$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.shared.data.models.Device) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$J2yeyg9C5yy0-EymV6_ufcAxjko
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2189startConnection$lambda7(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$MBAuDivaAK6YEFVi8AQHqBizyJ0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2190startConnection$lambda8(this.f$0, (java.lang.Throwable) obj);
            }
        }));
        this.monitoringEvent.onNext(powerwatch.matrix.com.pwgen2android.sdk.MonitoringEvent.observingStarted.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-2, reason: not valid java name */
    public static final void m2184startConnection$lambda2(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this$0.communicator.connectedDevices());
        if (kotlin.jvm.internal.Intrinsics.areEqual(deviceInfo == null ? null : deviceInfo.getUid(), device.getBluetoothAddress())) {
            return;
        }
        this$0.communicator.startConnection(kotlin.collections.CollectionsKt.listOf(device.getBluetoothAddress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2185startConnection$lambda6(final powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, final powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> observableConnectedDevicesChange;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfoDefaultConnectedDevice = this$0.communicator.defaultConnectedDevice();
        if (deviceInfoDefaultConnectedDevice != null) {
            observableConnectedDevicesChange = io.reactivex.Observable.concat(io.reactivex.Observable.just(deviceInfoDefaultConnectedDevice), this$0.communicator.connectedDevicesChange());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableConnectedDevicesChange, "concat(Observable.just(connectedDevice), communicator.connectedDevicesChange())");
        } else {
            observableConnectedDevicesChange = this$0.communicator.connectedDevicesChange();
        }
        return io.reactivex.Observable.merge(observableConnectedDevicesChange.flatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2186startConnection$lambda6$lambda3(this.f$0, device, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).retry().repeat().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$Fb39-sEfutUfkmJZbJZ4q1DQzIg
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2187startConnection$lambda6$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }), this$0.communicator.disconnectedDevicesChange().doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$VOhN7IZSPYid6_i5adm6w2C7ihI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2188startConnection$lambda6$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-6$lambda-3, reason: not valid java name */
    public static final io.reactivex.SingleSource m2186startConnection$lambda6$lambda3(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "$device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return this$0.readDeviceInfo(deviceInfo, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-6$lambda-4, reason: not valid java name */
    public static final void m2187startConnection$lambda6$lambda4(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notificationManager.showWatchConnectedMessage(deviceInfo.getUid(), this$0.context, powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchConnectedTitle(), powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchConnectedBody());
        powerwatch.matrix.com.pwgen2android.shared.localNotifications.NotificationManager.DefaultImpls.showConnectionNotification$default(this$0.notificationManager, this$0.context, deviceInfo.getDeviceName(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-6$lambda-5, reason: not valid java name */
    public static final void m2188startConnection$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deviceCommunicationQueuer.clear();
        this$0.notificationManager.showWatchConnectedMessage(deviceInfo.getUid(), this$0.context, powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchDisconnectedTitle(), powerwatch.matrix.com.pwgen2android.main.battery.ResourcesKt.getWatchDisconnectedBody());
        this$0.notificationManager.dismissNotification(this$0.context, powerwatch.matrix.com.pwgen2android.sdk.ConnectionForegroundService.INSTANCE.getCONNECT_NOTIFICATION_ID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-7, reason: not valid java name */
    public static final void m2189startConnection$lambda7(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.deviceInfoOutput.onNext(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-8, reason: not valid java name */
    public static final void m2190startConnection$lambda8(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError(this$0, "Connection observable died because of error: " + ((java.lang.Object) th.getClass().getSimpleName()) + " + " + ((java.lang.Object) th.getMessage()), th);
        th.printStackTrace();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceManager
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> readDeviceInfo(final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        if (deviceInfo.isGen2()) {
            io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> singleDoOnError = new powerwatch.matrix.com.pwgen2android.sdk.protocol.executors.Gen2DeviceInfoExecutor(this.communicator, null, 2, null).readInfo(deviceInfo.getUid()).retryWhen(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2174readDeviceInfo$lambda11((io.reactivex.Observable) obj);
                }
            }).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$Pf-RvvOlAy1yHdjPWEUgXSxvtGw
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2177readDeviceInfo$lambda14(this.f$0, (java.lang.Throwable) obj);
                }
            }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$Jarv623cIgHMoBH9FjHaoOgk4tc
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2180readDeviceInfo$lambda15(this.f$0, (java.lang.Throwable) obj);
                }
            }).firstOrError().doOnSuccess(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$8IqZpi0WP15sUEAFVNvAuZg01eY
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2181readDeviceInfo$lambda16(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
                }
            }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$_ILeUIQAirEWYIQ3wusLw73Bdm8
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2182readDeviceInfo$lambda20(this.f$0, deviceInfo, device, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
                }
            }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$_mGFyJODzalfnq8Fup4QsWy1R8k
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2183readDeviceInfo$lambda21(this.f$0, (java.lang.Throwable) obj);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleDoOnError, "Gen2DeviceInfoExecutor(communicator).readInfo(deviceInfo.uid)\n                    .retryWhen { errorObs ->\n                        errorObs.zipWith(\n                                Observable.range(1,6),\n                                BiFunction<Throwable, Int, Pair<Throwable, Int>> { t, counter -> Pair(t, counter) }\n                        ).flatMap { countPair ->\n                            if (countPair.first is InvalidVersionThrowable && countPair.second == 6) {\n                                Observable.error<InvalidVersionReportThrowable>(\n                                        InvalidVersionReportThrowable((countPair.first as InvalidVersionThrowable).dataInfo )\n                                )\n                            } else {\n                                Observable.timer(countPair.second.toLong(), TimeUnit.SECONDS)\n                            }\n\n                        }\n                    }\n                    .onErrorResumeNext(Function {\n                        Observable.just(it).flatMap { throwable ->\n                            if (throwable is InvalidVersionReportThrowable) {\n                                Observable.just<DataInfo>(throwable.dataInfo)\n                                        .take(1)\n                                        .doOnNext { debug(\"Give up, return invalid version: ${throwable.message}\") }\n                            }\n//                            else Observable.just(DataInfo(\n//                                    parsingStarted = false,\n//                                    parsingFinished = true,\n//                                    data = WatchDataInfo(uid = deviceInfo.uid, pid = 4)\n//                            ))\n                            else Observable.error<DataInfo>(throwable)\n                        }\n                    }).doOnError {\n                        debug(\"Unexpected error occurred in reading info from watch: ${it.javaClass.simpleName} + ${it.message}\")\n                    }\n                    .firstOrError()\n                    .doOnSuccess {\n                        info(\"Firmware version successfully read. FWVersion is: ${it.data.firmwareVersion}, \" +\n                                \"DIS table: ${it.data.formatDISTable()}\")\n                    }\n                    .flatMap {\n                        it.data.firmwareVersion?.let { firmwareVersionNotNull ->\n                            if (firmwareVersionNotNull.isNotEmpty()) {\n                                deviceInfo.extendedDeviceInfo.firmwareVersion = firmwareVersionNotNull\n                            }\n                        }\n\n                        it.data.disTableVersion?.let { disVersion ->\n                            deviceInfo.protocolVersion = disVersion.mtpVersion\n                            deviceInfo.time = disVersion.timestamp\n                            disVersion.sections.sections.forEach { section ->\n                                deviceInfo.sectionInfoMap[section.fontType.name] = section.version\n                            }\n                        }\n\n\n                        deviceProtocolStorage.saveDeviceProtocolVersion(deviceInfo.uid, it.data.getProtocolVersion)\n\n                        var result = Single.just(deviceInfo)\n                        if (device != null && !it.data.firmwareVersion.isNullOrEmpty() && it.data.isFirmwareVersionValid() &&\n                                device.firmwareVersion != it.data.firmwareVersion) {\n                            result = deviceRepository.save(device.copy(firmwareVersion = it.data.firmwareVersion!!, shouldSync = true), toCacheOnly = true)\n                                    .toSingleDefault(deviceInfo)\n                        }\n                        result\n                    }.doOnError {\n                        debug(\"Unexpected error occurred in storing read info from watch: ${it.javaClass.simpleName} + ${it.message}\")\n                    }");
            return singleDoOnError;
        }
        io.reactivex.Single<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> singleJust = io.reactivex.Single.just(deviceInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "just(deviceInfo)");
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-11, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2174readDeviceInfo$lambda11(io.reactivex.Observable errorObs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorObs, "errorObs");
        return errorObs.zipWith(io.reactivex.Observable.range(1, 6), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2176readDeviceInfo$lambda11$lambda9((java.lang.Throwable) obj, (java.lang.Integer) obj2);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$xeZR8OUzDhN0iaINlFWExiuHttM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2175readDeviceInfo$lambda11$lambda10((kotlin.Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-11$lambda-9, reason: not valid java name */
    public static final kotlin.Pair m2176readDeviceInfo$lambda11$lambda9(java.lang.Throwable t, java.lang.Integer counter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counter, "counter");
        return new kotlin.Pair(t, counter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-11$lambda-10, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2175readDeviceInfo$lambda11$lambda10(kotlin.Pair countPair) {
        io.reactivex.Observable<java.lang.Long> observableTimer;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countPair, "countPair");
        if ((countPair.getFirst() instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable) && ((java.lang.Number) countPair.getSecond()).intValue() == 6) {
            observableTimer = io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionReportThrowable(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionThrowable) countPair.getFirst()).getDataInfo()));
        } else {
            observableTimer = io.reactivex.Observable.timer(((java.lang.Number) countPair.getSecond()).intValue(), java.util.concurrent.TimeUnit.SECONDS);
        }
        return observableTimer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-14, reason: not valid java name */
    public static final io.reactivex.Observable m2177readDeviceInfo$lambda14(final powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.just(it).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$DIMulxrDu4kpgSWsmc9UF1GWAyM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2178readDeviceInfo$lambda14$lambda13(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-14$lambda-13, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2178readDeviceInfo$lambda14$lambda13(final powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, final java.lang.Throwable throwable) {
        io.reactivex.Observable observableError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionReportThrowable) {
            observableError = io.reactivex.Observable.just(((powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.InvalidVersionReportThrowable) throwable).getDataInfo()).take(1L).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl.m2179readDeviceInfo$lambda14$lambda13$lambda12(this.f$0, throwable, (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo) obj);
                }
            });
        } else {
            observableError = io.reactivex.Observable.error(throwable);
        }
        return observableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-14$lambda-13$lambda-12, reason: not valid java name */
    public static final void m2179readDeviceInfo$lambda14$lambda13$lambda12(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, java.lang.Throwable throwable, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "$throwable");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Give up, return invalid version: ", throwable.getMessage()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-15, reason: not valid java name */
    public static final void m2180readDeviceInfo$lambda15(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Unexpected error occurred in reading info from watch: " + ((java.lang.Object) th.getClass().getSimpleName()) + " + " + ((java.lang.Object) th.getMessage()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-16, reason: not valid java name */
    public static final void m2181readDeviceInfo$lambda16(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo dataInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(this$0, "Firmware version successfully read. FWVersion is: " + ((java.lang.Object) dataInfo.getData().getFirmwareVersion()) + ", DIS table: " + dataInfo.getData().formatDISTable(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-20, reason: not valid java name */
    public static final io.reactivex.SingleSource m2182readDeviceInfo$lambda20(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device, powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DataInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String firmwareVersion = it.getData().getFirmwareVersion();
        if (firmwareVersion != null) {
            if (firmwareVersion.length() > 0) {
                deviceInfo.getExtendedDeviceInfo().setFirmwareVersion(firmwareVersion);
            }
        }
        powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.DISTableVersion disTableVersion = it.getData().getDisTableVersion();
        if (disTableVersion != null) {
            deviceInfo.setProtocolVersion(disTableVersion.getMtpVersion());
            deviceInfo.setTime(disTableVersion.getTimestamp());
            for (powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.FontSectionInfo fontSectionInfo : disTableVersion.getSections().getSections()) {
                deviceInfo.getSectionInfoMap().put(fontSectionInfo.getFontType().getName(), java.lang.Long.valueOf(fontSectionInfo.getVersion()));
            }
        }
        this$0.deviceProtocolStorage.saveDeviceProtocolVersion(deviceInfo.getUid(), it.getData().getGetProtocolVersion());
        io.reactivex.Single singleJust = io.reactivex.Single.just(deviceInfo);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "just(deviceInfo)");
        if (device != null) {
            java.lang.String firmwareVersion2 = it.getData().getFirmwareVersion();
            if (!(firmwareVersion2 == null || firmwareVersion2.length() == 0) && powerwatch.matrix.com.pwgen2android.sdk.protocol.commands.CommandsKt.isFirmwareVersionValid(it.getData()) && !kotlin.jvm.internal.Intrinsics.areEqual(device.getFirmwareVersion(), it.getData().getFirmwareVersion())) {
                powerwatch.matrix.com.pwgen2android.shared.data.repositories.DeviceRepository deviceRepository = this$0.deviceRepository;
                java.lang.String firmwareVersion3 = it.getData().getFirmwareVersion();
                kotlin.jvm.internal.Intrinsics.checkNotNull(firmwareVersion3);
                singleJust = deviceRepository.save(device.copy((1535 & 1) != 0 ? device.uid : 0L, (1535 & 2) != 0 ? device.serialNumber : null, (1535 & 4) != 0 ? device.bluetoothAddress : null, (1535 & 8) != 0 ? device.pid : 0, (1535 & 16) != 0 ? device.firmwareVersion : firmwareVersion3, (1535 & 32) != 0 ? device.productName : null, (1535 & 64) != 0 ? device.shouldSync : true, (1535 & 128) != 0 ? device.callNotification : false, (1535 & 256) != 0 ? device.messageNotification : false, (1535 & 512) != 0 ? device.activityGoalNotification : false, (1535 & 1024) != 0 ? device.alarmNotification : false), true).toSingleDefault(deviceInfo);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleJust, "deviceRepository.save(device.copy(firmwareVersion = it.data.firmwareVersion!!, shouldSync = true), toCacheOnly = true)\n                                    .toSingleDefault(deviceInfo)");
            }
        }
        return singleJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readDeviceInfo$lambda-21, reason: not valid java name */
    public static final void m2183readDeviceInfo$lambda21(powerwatch.matrix.com.pwgen2android.sdk.DeviceManagerImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Unexpected error occurred in storing read info from watch: " + ((java.lang.Object) th.getClass().getSimpleName()) + " + " + ((java.lang.Object) th.getMessage()), null, 2, null);
    }
}
