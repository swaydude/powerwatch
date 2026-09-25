package powerwatch.matrix.com.pwgen2android.sdk.communicator;

/* JADX INFO: compiled from: Communicator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001dH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eH\u0016J\b\u0010'\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0018H\u0016J\u0016\u0010.\u001a\u00020%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016J\u0018\u00100\u001a\u00020%2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u001cH\u0016J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u00020%H\u0016J\b\u00105\u001a\u00020%H\u0016J\u0010\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00180\u00180\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0013`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "connectionPreference", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;", "bleCommunicationTechnology", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;", "bleScanningTechnology", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V", "connectedDevices", "Ljava/util/HashMap;", "", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;", "Lkotlin/collections/HashMap;", "connectedDevicesChange", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "kotlin.jvm.PlatformType", "connectionDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "messageOut", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;", "scannedDeviceChange", "scannedDevices", "scannedDisposables", "", "Lio/reactivex/Observable;", "defaultConnectedDevice", "disconnectedDevicesChange", "foundDevices", "foundDevicesChange", "lostDevicesChange", "messageOutput", "refreshConnection", "", "uid", "releaseScanningResources", "resubscribeCharacteristics", "Lio/reactivex/Completable;", "protocolType", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;", "sendMessage", io.fabric.sdk.android.services.settings.SettingsJsonConstants.PROMPT_MESSAGE_KEY, "startConnection", "devicesToConnect", "startScanning", "scanFilters", "Lcom/polidea/rxandroidble2/scan/ScanFilter;", "stopConnection", "stopScanning", "unpairConnectedDevices", "unpairDevice", "bluetoothAddress", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CommunicatorImpl implements powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology bleCommunicationTechnology;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology bleScanningTechnology;
    private final java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.communicator.Device> connectedDevices;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connectedDevicesChange;
    private final io.reactivex.disposables.CompositeDisposable connectionDisposables;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOut;
    private final io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> scannedDeviceChange;
    private final java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> scannedDevices;
    private final io.reactivex.disposables.CompositeDisposable scannedDisposables;

    public CommunicatorImpl(android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference, powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology bleCommunicationTechnology, powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology bleScanningTechnology) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionPreference, "connectionPreference");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleCommunicationTechnology, "bleCommunicationTechnology");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleScanningTechnology, "bleScanningTechnology");
        this.bleCommunicationTechnology = bleCommunicationTechnology;
        this.bleScanningTechnology = bleScanningTechnology;
        this.connectedDevices = new java.util.HashMap<>();
        this.scannedDevices = new java.util.HashMap<>();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<CommunicationMessage>()");
        this.messageOut = publishSubjectCreate;
        this.connectionDisposables = new io.reactivex.disposables.CompositeDisposable();
        this.scannedDisposables = new io.reactivex.disposables.CompositeDisposable();
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<DeviceInfo>()");
        this.connectedDevicesChange = publishSubjectCreate2;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> publishSubjectCreate3 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate3, "create<DeviceInfo>()");
        this.scannedDeviceChange = publishSubjectCreate3;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public /* synthetic */ CommunicatorImpl(android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference, powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology bleCommunicationTechnology, powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology bleScanningTechnology, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, connectionPreference, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology(context, connectionPreference, null, null, null, null, null, 124, null) : bleCommunicationTechnology, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology(context, null, null, null, null, 30, null) : bleScanningTechnology);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Completable resubscribeCharacteristics(powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Device device;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        java.util.Set<java.util.Map.Entry<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.communicator.Device>> setEntrySet = this.connectedDevices.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setEntrySet, "connectedDevices.entries");
        java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.firstOrNull(setEntrySet);
        io.reactivex.Completable completableResubscribeCharacteristics = null;
        if (entry != null && (device = (powerwatch.matrix.com.pwgen2android.sdk.communicator.Device) entry.getValue()) != null) {
            completableResubscribeCharacteristics = device.resubscribeCharacteristics(protocolType);
        }
        if (completableResubscribeCharacteristics != null) {
            return completableResubscribeCharacteristics;
        }
        io.reactivex.Completable completableComplete = io.reactivex.Completable.complete();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableComplete, "complete()");
        return completableComplete;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo defaultConnectedDevice() {
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Device device;
        java.util.Set<java.util.Map.Entry<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.communicator.Device>> setEntrySet = this.connectedDevices.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setEntrySet, "connectedDevices.entries");
        java.util.Map.Entry entry = (java.util.Map.Entry) kotlin.collections.CollectionsKt.firstOrNull(setEntrySet);
        if (entry == null || (device = (powerwatch.matrix.com.pwgen2android.sdk.communicator.Device) entry.getValue()) == null) {
            return null;
        }
        return device.getDeviceInfo();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void startConnection(java.util.List<java.lang.String> devicesToConnect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(devicesToConnect, "devicesToConnect");
        stopConnection();
        io.reactivex.observables.ConnectableObservable connectableObservablePublish = this.bleCommunicationTechnology.accessoryStatus().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2248startConnection$lambda0(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.Accessory) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$ZcYsXvQzJ4NcZded5t1LBjdgrkA
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2249startConnection$lambda1((kotlin.Pair) obj);
            }
        }).publish();
        this.connectionDisposables.add(connectableObservablePublish.map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2250startConnection$lambda2((powerwatch.matrix.com.pwgen2android.sdk.communicator.Device) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$5C2GRpau2-Y28csHfChGMVDizFM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2251startConnection$lambda3(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$lt2gCwVen2iRbGD9Pu-tJMvjHQc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2252startConnection$lambda4(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }));
        this.connectionDisposables.add(connectableObservablePublish.flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$5RTkW2rWl7YPXru35DEslFcyUPg
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2253startConnection$lambda5((powerwatch.matrix.com.pwgen2android.sdk.communicator.Device) obj);
            }
        }).subscribe((io.reactivex.functions.Consumer<? super R>) new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$cNNZ8BWFfCN9hFhFzff3whinn4s
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2254startConnection$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }));
        this.connectionDisposables.add(connectableObservablePublish.connect());
        this.bleCommunicationTechnology.startMonitoring2(devicesToConnect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-0, reason: not valid java name */
    public static final kotlin.Pair m2248startConnection$lambda0(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Device device = this$0.connectedDevices.get(it.getDeviceInfo().getUid());
        if (device == null) {
            powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl deviceImpl = new powerwatch.matrix.com.pwgen2android.sdk.communicator.DeviceImpl(it);
            this$0.connectedDevices.put(it.getDeviceInfo().getUid(), deviceImpl);
            return new kotlin.Pair(deviceImpl, true);
        }
        device.updateWithAccessory(it);
        return new kotlin.Pair(device, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-1, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.communicator.Device m2249startConnection$lambda1(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (powerwatch.matrix.com.pwgen2android.sdk.communicator.Device) it.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo m2250startConnection$lambda2(powerwatch.matrix.com.pwgen2android.sdk.communicator.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getDeviceInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-3, reason: not valid java name */
    public static final void m2251startConnection$lambda3(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (deviceInfo.getConnectionInfos().isEmpty()) {
            this$0.connectedDevices.remove(deviceInfo.getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-4, reason: not valid java name */
    public static final void m2252startConnection$lambda4(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo = this$0.scannedDevices.get(it.getUid());
        if (deviceInfo != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            it = it.copy((255 & 1) != 0 ? it.uid : null, (255 & 2) != 0 ? it.pairingCode : null, (255 & 4) != 0 ? it.protocolVersion : deviceInfo.getProtocolVersion(), (255 & 8) != 0 ? it.time : 0, (255 & 16) != 0 ? it.deviceName : null, (255 & 32) != 0 ? it.extendedDeviceInfo : null, (255 & 64) != 0 ? it.connectionInfos : null, (255 & 128) != 0 ? it.sectionInfoMap : null);
        }
        this$0.connectedDevicesChange.onNext(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2253startConnection$lambda5(powerwatch.matrix.com.pwgen2android.sdk.communicator.Device it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.messageOutput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startConnection$lambda-6, reason: not valid java name */
    public static final void m2254startConnection$lambda6(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.messageOut.onNext(communicationMessage);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void stopConnection() {
        powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology.DefaultImpls.stopMonitoring$default(this.bleCommunicationTechnology, false, 1, null);
        this.connectionDisposables.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void startScanning(java.util.List<? extends com.polidea.rxandroidble2.scan.ScanFilter> scanFilters) {
        stopScanning();
        this.scannedDisposables.add(this.bleScanningTechnology.accessoryStatus().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2255startScanning$lambda7((powerwatch.matrix.com.pwgen2android.sdk.model.Accessory) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$6PfGVrsMe2pssK4Ve42dSl9vjBs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2256startScanning$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$63Vyxp6g8qUGqcVtrbo4HRa8Ibs
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2257startScanning$lambda9(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }));
        this.bleScanningTechnology.startMonitoring(scanFilters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startScanning$lambda-7, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo m2255startScanning$lambda7(powerwatch.matrix.com.pwgen2android.sdk.model.Accessory it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getDeviceInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startScanning$lambda-8, reason: not valid java name */
    public static final void m2256startScanning$lambda8(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        java.util.HashMap<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> map = this$0.scannedDevices;
        java.lang.String uid = it.getUid();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        map.put(uid, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startScanning$lambda-9, reason: not valid java name */
    public static final void m2257startScanning$lambda9(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.scannedDeviceChange.onNext(deviceInfo);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void stopScanning() {
        this.bleScanningTechnology.stopMonitoring(false);
        this.scannedDisposables.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void releaseScanningResources() {
        this.bleScanningTechnology.stopMonitoring(true);
        this.scannedDisposables.clear();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage> messageOutput() {
        return this.messageOut;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Completable sendMessage(final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        io.reactivex.Completable completableDefer = io.reactivex.Completable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$JjnBLwdZBYaXrYAagAWGQKXrFXE
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2245sendMessage$lambda12(this.f$0, message);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableDefer, "defer {\n\n        connectedDevices[message.uid]?.sendMessage(message)\n                ?: Completable.error(Throwable(\"Device not initialized\"))\n                        .doOnComplete {\n                            debug(\"Message successfully sent to device: ${message.uid}\")\n                        }\n                        .doOnError {\n                            error(\"Tried to send message to not connected device, throwing error.\", it)\n                        }\n    }");
        return completableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-12, reason: not valid java name */
    public static final io.reactivex.CompletableSource m2245sendMessage$lambda12(final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Device device = this$0.connectedDevices.get(message.getUid());
        io.reactivex.Completable completableSendMessage = device == null ? null : device.sendMessage(message);
        if (completableSendMessage != null) {
            return completableSendMessage;
        }
        return io.reactivex.Completable.error(new java.lang.Throwable("Device not initialized")).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$b4-d8hQNqOejM0Zr5GYl8H2bk7g
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2246sendMessage$lambda12$lambda10(this.f$0, message);
            }
        }).doOnError(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$f-HLo2r1Uo1JH5_jCdlPUE8Qn0Q
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2247sendMessage$lambda12$lambda11(this.f$0, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-12$lambda-10, reason: not valid java name */
    public static final void m2246sendMessage$lambda12$lambda10(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "$message");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Message successfully sent to device: ", message.getUid()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendMessage$lambda-12$lambda-11, reason: not valid java name */
    public static final void m2247sendMessage$lambda12$lambda11(powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "Tried to send message to not connected device, throwing error.", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void refreshConnection(java.lang.String uid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uid, "uid");
        powerwatch.matrix.com.pwgen2android.sdk.communicator.Device device = this.connectedDevices.get(uid);
        if (device == null) {
            return;
        }
        device.refresh();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connectedDevices() {
        java.util.Collection<powerwatch.matrix.com.pwgen2android.sdk.communicator.Device> collectionValues = this.connectedDevices.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "connectedDevices.values");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.sdk.communicator.Device> collection = collectionValues;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((powerwatch.matrix.com.pwgen2android.sdk.communicator.Device) it.next()).getDeviceInfo());
        }
        return arrayList;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> foundDevices() {
        java.util.Collection<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> collectionValues = this.scannedDevices.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collectionValues, "scannedDevices.values");
        java.util.Collection<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> collection = collectionValues;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) it.next());
        }
        return arrayList;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> connectedDevicesChange() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> observableFilter = this.connectedDevicesChange.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$HPy3jNxJK95pOwcwvohknGXzjvI
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2236connectedDevicesChange$lambda15((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "connectedDevicesChange\n            .filter { it.connectionInfos.isNotEmpty() }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: connectedDevicesChange$lambda-15, reason: not valid java name */
    public static final boolean m2236connectedDevicesChange$lambda15(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !it.getConnectionInfos().isEmpty();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> disconnectedDevicesChange() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> observableFilter = this.connectedDevicesChange.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$p1L-VjzqNWmGyRvUJr08RvM8I6Q
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2237disconnectedDevicesChange$lambda16((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "connectedDevicesChange\n            .filter { it.connectionInfos.isEmpty() }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: disconnectedDevicesChange$lambda-16, reason: not valid java name */
    public static final boolean m2237disconnectedDevicesChange$lambda16(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getConnectionInfos().isEmpty();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> foundDevicesChange() {
        return this.scannedDeviceChange;
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> lostDevicesChange() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo> observableFilter = this.scannedDeviceChange.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.communicator.-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicatorImpl.m2244lostDevicesChange$lambda17((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableFilter, "scannedDeviceChange\n            .filter { it.connectionInfos.isEmpty() }");
        return observableFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lostDevicesChange$lambda-17, reason: not valid java name */
    public static final boolean m2244lostDevicesChange$lambda17(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getConnectionInfos().isEmpty();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void unpairDevice(java.lang.String bluetoothAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAddress, "bluetoothAddress");
        powerwatch.matrix.com.pwgen2android.sdk.communicator.UnpairController.unPairDevice(bluetoothAddress);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator
    public void unpairConnectedDevices() {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, powerwatch.matrix.com.pwgen2android.sdk.communicator.Device>> it = this.connectedDevices.entrySet().iterator();
        while (it.hasNext()) {
            unpairDevice(it.next().getKey());
        }
    }
}
