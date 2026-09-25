package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: OTAExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\nJ\b\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J2\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\nH\u0002J(\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "otaCallback", "powerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1", "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor$otaCallback$1;", "otaProgress", "Lio/reactivex/subjects/PublishSubject;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAProgressData;", "power", "", "getPower", "()F", "setPower", "(F)V", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "Lpowerwatch/matrix/com/pwgen2android/ota/AmOtaService;", "executeOTA", "Lio/reactivex/Observable;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "data", "", "releaseResources", "", "sendGen1OTA", "Lio/reactivex/Completable;", "sendGen2OTA", "Lpowerwatch/matrix/com/pwgen2android/main/OTACallback;", "startOtaProcess", "deviceId", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OTAExecutor implements powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.main.OTAExecutor$otaCallback$1 otaCallback;
    private io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.main.OTAProgressData> otaProgress;
    private float power;
    private final powerwatch.matrix.com.pwgen2android.ota.AmOtaService service;

    public OTAExecutor() {
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.main.OTAProgressData> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<OTAProgressData>()");
        this.otaProgress = publishSubjectCreate;
        this.power = 1.0f;
        this.service = new powerwatch.matrix.com.pwgen2android.ota.AmOtaService();
        this.otaCallback = new powerwatch.matrix.com.pwgen2android.main.OTAExecutor$otaCallback$1(this);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final float getPower() {
        return this.power;
    }

    public final void setPower(float f) {
        this.power = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseResources() {
        this.service.dispose();
        this.service.amOtaStop();
    }

    public static /* synthetic */ io.reactivex.Observable executeOTA$default(powerwatch.matrix.com.pwgen2android.main.OTAExecutor oTAExecutor, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, byte[] bArr, float f, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f = 1.0f;
        }
        return oTAExecutor.executeOTA(deviceInfo, communicator, bArr, f);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAProgressData> executeOTA(final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, final byte[] data, final float power) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAProgressData> observableDefer = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$j6dQZ1oljgepFbqxHT4IgsZQ-bs
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1602executeOTA$lambda2(deviceInfo, this, communicator, data, power);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDefer, "defer {\n            if (!deviceInfo.isConnected) return@defer Observable.error<OTAProgressData>(OTAError.DeviceNotConnected())\n\n            return@defer if (deviceInfo.connectionInfos.any { it.protocolType == ProtocolType.BLE_OTA }) { //gen2 has OTA service all the time\n                sendGen2OTA(deviceInfo, otaCallback, communicator, data, power)\n            } else {\n                sendGen1OTA(deviceInfo, communicator, data)\n            }.andThen(otaProgress)\n                    .doOnTerminate {\n                        releaseResources()\n                    }\n        }");
        return observableDefer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOTA$lambda-2, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1602executeOTA$lambda2(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, byte[] data, float f) {
        io.reactivex.Completable completableSendGen1OTA;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "$communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        if (!deviceInfo.isConnected()) {
            return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotConnected());
        }
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos = deviceInfo.getConnectionInfos();
        boolean z = true;
        if (!(connectionInfos instanceof java.util.Collection) || !connectionInfos.isEmpty()) {
            java.util.Iterator<T> it = connectionInfos.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!(((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) it.next()).getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA));
        } else {
            z = false;
            break;
        }
        if (z) {
            completableSendGen1OTA = this$0.sendGen2OTA(deviceInfo, this$0.otaCallback, communicator, data, f);
        } else {
            completableSendGen1OTA = this$0.sendGen1OTA(deviceInfo, communicator, data);
        }
        return completableSendGen1OTA.andThen(this$0.otaProgress).doOnTerminate(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$p2v2zZm8yi1S1rakOFqoGuDBXpI
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1603executeOTA$lambda2$lambda1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: executeOTA$lambda-2$lambda-1, reason: not valid java name */
    public static final void m1603executeOTA$lambda2$lambda1(powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.releaseResources();
    }

    private final io.reactivex.Completable sendGen1OTA(final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, final byte[] data) {
        io.reactivex.Completable completableIgnoreElements = io.reactivex.Observable.just(deviceInfo).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$qv1kPUy8wRjl_DhUGaoWsJ4_KHI
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1611sendGen1OTA$lambda4((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$CkltSTqUhIXJaMuNDqsB7sHka1Y
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1612sendGen1OTA$lambda5((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$mpsaXNvl3KoXiLlAwjY9FPoHAh0
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1613sendGen1OTA$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$NvO897UdTdfmxT8a5rPDHP2XXww
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1614sendGen1OTA$lambda7(deviceInfo, (powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$GIxjZDihcxvmShuQHop5adXfASU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1615sendGen1OTA$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$ZwsswIRzPLS2ePdRgGcV_p41XD8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1616sendGen1OTA$lambda9(communicator, data, (powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$EhUd5qyom6jK5EqohK9sZ6pM_QQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1607sendGen1OTA$lambda14(communicator, deviceInfo, this, (byte[]) obj);
            }
        }).ignoreElements();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "just(deviceInfo)\n                .flatMap { info ->\n                    val connectionInfo = info.connectionInfos.firstOrNull { it.protocolType == ProtocolType.BLE_DTP || it.protocolType == ProtocolType.BLE_DTP_X }\n                    if (connectionInfo == null) Observable.error(Exception(\"Error! No DTP service found on gen1 device\"))\n                    else {\n                        Observable.just(connectionInfo)\n                    }\n                }\n                .map { it.protocolType }\n                .doOnNext { otaCallback.connectingToDevice() }\n\n                .flatMap {\n                    Observable.just(CommunicationMessage(deviceInfo.uid, ProtocolMessage(ProtocolPayload(\n                            byteArrayOf(0x81.toByte(), 0x0F, 0x04, 0x00, 0x82.toByte()))), TechnologyType.BLE_COMMUNICATION, it))\n                            .delay(7, TimeUnit.SECONDS)\n                }\n                .doOnNext { debug(\"Sending command: ${it.protocolMessage.payload.data.formatToString()}\") }\n                .flatMap {\n                    communicator.sendMessage(it)\n                            .toSingleDefault(data)\n                            .toObservable()\n                            .delay(5, TimeUnit.SECONDS)\n\n                }\n                .flatMap { fileData ->\n                    communicator.connectedDevicesChange()\n                            .filter { it.uid == deviceInfo.uid }\n                            .filter { device -> device.connectionInfos.any { it.protocolType == ProtocolType.BLE_OTA } }\n                            .take(1)\n                            .timeout(45, TimeUnit.SECONDS)\n                            .doOnNext {\n                                otaCallback.otaStarted()\n                                startOtaProcess(it.uid, otaCallback, communicator, fileData)\n                            }\n                }\n                .ignoreElements()");
        return completableIgnoreElements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1611sendGen1OTA$lambda4(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo info) {
        java.lang.Object next;
        io.reactivex.Observable observableJust;
        powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "info");
        java.util.Iterator<T> it = info.getConnectionInfos().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            connectionInfo = (powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) next;
        } while (!(connectionInfo.getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP || connectionInfo.getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_DTP_X));
        powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo connectionInfo2 = (powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) next;
        if (connectionInfo2 == null) {
            observableJust = io.reactivex.Observable.error(new java.lang.Exception("Error! No DTP service found on gen1 device"));
        } else {
            observableJust = io.reactivex.Observable.just(connectionInfo2);
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-5, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType m1612sendGen1OTA$lambda5(powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getProtocolType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-6, reason: not valid java name */
    public static final void m1613sendGen1OTA$lambda6(powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType protocolType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.otaCallback.connectingToDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1614sendGen1OTA$lambda7(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage(deviceInfo.getUid(), new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolMessage(new powerwatch.matrix.com.pwgen2android.sdk.model.ProtocolPayload(new byte[]{-127, 15, 4, 0, -126}), null, null, 6, null), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION, it)).delay(7L, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-8, reason: not valid java name */
    public static final void m1615sendGen1OTA$lambda8(powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage communicationMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Sending command: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(communicationMessage.getProtocolMessage().getPayload().getData(), false, 1, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1616sendGen1OTA$lambda9(powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, byte[] data, powerwatch.matrix.com.pwgen2android.sdk.communicator.CommunicationMessage it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "$communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return communicator.sendMessage(it).toSingleDefault(data).toObservable().delay(5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-14, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1607sendGen1OTA$lambda14(final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0, final byte[] fileData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "$communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileData, "fileData");
        return communicator.connectedDevicesChange().filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$nXR1dDU49bZbmlE4OLfZNBkYI0k
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1608sendGen1OTA$lambda14$lambda10(deviceInfo, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$o1db-CZiAg6_NlMIpsL7yF0U71k
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1609sendGen1OTA$lambda14$lambda12((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        }).take(1L).timeout(45L, java.util.concurrent.TimeUnit.SECONDS).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$z5hWM9TgIZsA-0bboyb024OIjbc
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1610sendGen1OTA$lambda14$lambda13(this.f$0, communicator, fileData, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-14$lambda-10, reason: not valid java name */
    public static final boolean m1608sendGen1OTA$lambda14$lambda10(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(it.getUid(), deviceInfo.getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-14$lambda-12, reason: not valid java name */
    public static final boolean m1609sendGen1OTA$lambda14$lambda12(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos = device.getConnectionInfos();
        if (!(connectionInfos instanceof java.util.Collection) || !connectionInfos.isEmpty()) {
            java.util.Iterator<T> it = connectionInfos.iterator();
            while (it.hasNext()) {
                if (((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) it.next()).getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.BLE_OTA) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen1OTA$lambda-14$lambda-13, reason: not valid java name */
    public static final void m1610sendGen1OTA$lambda14$lambda13(powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, byte[] fileData, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "$communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileData, "$fileData");
        this$0.otaCallback.otaStarted();
        this$0.startOtaProcess(deviceInfo.getUid(), this$0.otaCallback, communicator, fileData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.reactivex.Completable sendGen2OTA(final powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.OTACallback otaCallback, final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, final byte[] data, final float power) {
        io.reactivex.Completable completableCreate = io.reactivex.Completable.create(new io.reactivex.CompletableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$OTAExecutor$Xea7oL57tPY03GqlCw_XyeJgafY
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(io.reactivex.CompletableEmitter completableEmitter) {
                powerwatch.matrix.com.pwgen2android.main.OTAExecutor.m1617sendGen2OTA$lambda15(otaCallback, power, this, deviceInfo, communicator, data, completableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(completableCreate, "create {\n            otaCallback.phasePower = power\n            startOtaProcess(deviceInfo.uid, otaCallback, communicator, data)\n            it.onComplete()\n        }");
        return completableCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendGen2OTA$lambda-15, reason: not valid java name */
    public static final void m1617sendGen2OTA$lambda15(powerwatch.matrix.com.pwgen2android.main.OTACallback otaCallback, float f, powerwatch.matrix.com.pwgen2android.main.OTAExecutor this$0, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, byte[] data, io.reactivex.CompletableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaCallback, "$otaCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "$communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "$data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        otaCallback.setPhasePower(f);
        this$0.startOtaProcess(deviceInfo.getUid(), otaCallback, communicator, data);
        it.onComplete();
    }

    private final void startOtaProcess(java.lang.String deviceId, powerwatch.matrix.com.pwgen2android.main.OTACallback otaCallback, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, byte[] data) {
        powerwatch.matrix.com.pwgen2android.ota.OtaCommunicatorImpl otaCommunicatorImpl = new powerwatch.matrix.com.pwgen2android.ota.OtaCommunicatorImpl(communicator);
        this.service.registerToOTA(otaCommunicatorImpl);
        this.service.amOtaStart(new java.io.ByteArrayInputStream(data), otaCommunicatorImpl, otaCallback, deviceId);
    }
}
