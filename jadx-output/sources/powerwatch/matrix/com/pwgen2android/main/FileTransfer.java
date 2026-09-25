package powerwatch.matrix.com.pwgen2android.main;

/* JADX INFO: compiled from: FileTransfer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/main/FileTransfer;", "", "otaExecutor", "Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;", "communicator", "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;", "deviceManager", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;", "(Lpowerwatch/matrix/com/pwgen2android/main/OTAExecutor;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;)V", "transferFile", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/main/OTAStatus;", "deviceInfo", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;", "updateInfoData", "Lpowerwatch/matrix/com/pwgen2android/main/update/FirmwareDisplayData;", "data", "", "expectVersionUpgrade", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FileTransfer {
    private final powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator;
    private final powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager;
    private final powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor;

    public FileTransfer(powerwatch.matrix.com.pwgen2android.main.OTAExecutor otaExecutor, powerwatch.matrix.com.pwgen2android.sdk.communicator.Communicator communicator, powerwatch.matrix.com.pwgen2android.sdk.DeviceManager deviceManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otaExecutor, "otaExecutor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(communicator, "communicator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        this.otaExecutor = otaExecutor;
        this.communicator = communicator;
        this.deviceManager = deviceManager;
    }

    public static /* synthetic */ io.reactivex.Observable transferFile$default(powerwatch.matrix.com.pwgen2android.main.FileTransfer fileTransfer, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData firmwareDisplayData, byte[] bArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return fileTransfer.transferFile(deviceInfo, firmwareDisplayData, bArr, z);
    }

    public final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> transferFile(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo deviceInfo, final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, byte[] data, final boolean expectVersionUpgrade) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.main.OTAStatus> observableDoOnNext = powerwatch.matrix.com.pwgen2android.main.OTAExecutor.executeOTA$default(this.otaExecutor, deviceInfo, this.communicator, data, 0.0f, 8, null).takeWhile(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$YKCFgkrJfQwNoYnEa1YLlykDqgc
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1539transferFile$lambda0((powerwatch.matrix.com.pwgen2android.main.OTAProgressData) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$Z3-qrIc6iZTHlfLJta2G2-F7Hyo
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1540transferFile$lambda1((powerwatch.matrix.com.pwgen2android.main.OTAProgressData) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$QXfUigi9C2_o_jEIHy4VijN7TJ8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1541transferFile$lambda2(this.f$0, (powerwatch.matrix.com.pwgen2android.main.OTAProgressData) obj);
            }
        }).distinctUntilChanged().flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$SK8VtjXjwH7AlhMy01-ubY_gMFY
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1542transferFile$lambda8(updateInfoData, expectVersionUpgrade, this, (powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$trBbnKZqOryvk5yNl3bh_kEr55Y
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1547transferFile$lambda9((powerwatch.matrix.com.pwgen2android.main.OTAStatus) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "otaExecutor.executeOTA(deviceInfo, communicator, data)\n                .takeWhile { it.phase != OtaPhase.FINISHED}\n                .doOnNext {\n                    println(\"AGPS - File transfer sending phase ${it.phase}, ${it.phaseProgress}\")\n                }\n                .map {\n                    //case when AGPS is transferred\n                    if (it.phase == OtaPhase.SUCCESS) {\n                        OTAStatus(it.phaseProgress, OtaProcessPhase.COMPLETE, otaExecutor.power)\n                    }\n                    else OTAStatus(it.phaseProgress, OtaProcessPhase.FILE_TRANSFER, otaExecutor.power)\n                }\n                .distinctUntilChanged()\n                .flatMap {\n                    var returnObs: Observable<OTAStatus> = Observable.just(it)\n\n                    if (it.phaseProgress == 100 && it.phase == OtaProcessPhase.COMPLETE) {\n                        // if it is gen2 device, perform send reset command and perform version checking\n                        if (updateInfoData.pid == 4) {\n                            //case when AGPS is transferred\n                            if (!expectVersionUpgrade) {\n                                returnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                            }\n                            // waiting for reconnect event\n                            else returnObs = deviceManager.connect()\n                                    // here we need to filter replay value\n                                    .skip(1)\n                                    .filter { it.isConnected }\n                                    .timeout(9, TimeUnit.MINUTES)\n                                    .onErrorResumeNext (Function {\n                                        Observable.error<DeviceInfo>(OTAError.DeviceNotAppeared())\n                                    })\n                                    .filter { device ->\n                                        // TODO what if filter returns false??\n                                        // TODO check if we need device uid comparing\n                                        //  device.uid == deviceID &&\n                                        device.connectionInfos.any { connection ->\n                                            connection.protocolType == ProtocolType.GEN2_STANDARD_BASICS\n                                        }\n                                    }\n                                    .take(1)\n                                    .flatMap { device ->\n                                        var comparingReturnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                                        // fw version is read after each connect, we can use that info to compare versions\n                                        val readVersion = device.extendedDeviceInfo.firmwareVersion\n                                        val updateVersion = updateInfoData.version\n                                        if (readVersion != updateVersion) { //expectVersionUpgrade is not needed here since AGPS will have early exit above\n                                            comparingReturnObs = Observable.error<OTAStatus>(OTAError.VersionMismatch())\n                                        }\n                                        comparingReturnObs\n\n                                    }\n                        } else {\n                            // if it is not Gen2 device, just send completed event\n                            returnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                        }\n                    }\n                    returnObs\n                }\n                .doOnNext {\n                    println(\"AGPS - Sending on file transfer exit ${it.phase}, ${it.phaseProgress}\")\n                }");
        return observableDoOnNext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-0, reason: not valid java name */
    public static final boolean m1539transferFile$lambda0(powerwatch.matrix.com.pwgen2android.main.OTAProgressData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaPhase.FINISHED.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-1, reason: not valid java name */
    public static final void m1540transferFile$lambda1(powerwatch.matrix.com.pwgen2android.main.OTAProgressData oTAProgressData) {
        java.lang.System.out.println((java.lang.Object) ("AGPS - File transfer sending phase " + oTAProgressData.getPhase() + ", " + oTAProgressData.getPhaseProgress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-2, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.main.OTAStatus m1541transferFile$lambda2(powerwatch.matrix.com.pwgen2android.main.FileTransfer this$0, powerwatch.matrix.com.pwgen2android.main.OTAProgressData it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        if (kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaPhase.SUCCESS.INSTANCE)) {
            return new powerwatch.matrix.com.pwgen2android.main.OTAStatus(it.getPhaseProgress(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE, this$0.otaExecutor.getPower(), 0, null, 24, null);
        }
        return new powerwatch.matrix.com.pwgen2android.main.OTAStatus(it.getPhaseProgress(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.FILE_TRANSFER.INSTANCE, this$0.otaExecutor.getPower(), 0, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1542transferFile$lambda8(final powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, boolean z, final powerwatch.matrix.com.pwgen2android.main.FileTransfer this$0, powerwatch.matrix.com.pwgen2android.main.OTAStatus it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        io.reactivex.Observable observableJust = io.reactivex.Observable.just(it);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(it)");
        if (it.getPhaseProgress() == 100 && kotlin.jvm.internal.Intrinsics.areEqual(it.getPhase(), powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE)) {
            if (updateInfoData.getPid() != 4) {
                observableJust = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.main.OTAStatus(100, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE, this$0.otaExecutor.getPower(), 0, null, 24, null));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))");
            } else if (!z) {
                observableJust = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.main.OTAStatus(100, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE, this$0.otaExecutor.getPower(), 0, null, 24, null));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))");
            } else {
                observableJust = powerwatch.matrix.com.pwgen2android.sdk.DeviceManager.DefaultImpls.connect$default(this$0.deviceManager, false, 1, null).skip(1L).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$BsguT4oXw8OiZ53bb2Ukl8d0xLk
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1543transferFile$lambda8$lambda3((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
                    }
                }).timeout(9L, java.util.concurrent.TimeUnit.MINUTES).onErrorResumeNext(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$np6tWe3HoNy1xumyz7zmG_cPL9I
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1544transferFile$lambda8$lambda4((java.lang.Throwable) obj);
                    }
                }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$Zc9zR6pvBmn-a7CdjEjgu9IL6-U
                    @Override // io.reactivex.functions.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1545transferFile$lambda8$lambda6((powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
                    }
                }).take(1L).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.main.-$$Lambda$FileTransfer$GcIfuwOnM4o_-Y2f9IVRpd04F-A
                    @Override // io.reactivex.functions.Function
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return powerwatch.matrix.com.pwgen2android.main.FileTransfer.m1546transferFile$lambda8$lambda7(this.f$0, updateInfoData, (powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo) obj);
                    }
                });
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "deviceManager.connect()\n                                    // here we need to filter replay value\n                                    .skip(1)\n                                    .filter { it.isConnected }\n                                    .timeout(9, TimeUnit.MINUTES)\n                                    .onErrorResumeNext (Function {\n                                        Observable.error<DeviceInfo>(OTAError.DeviceNotAppeared())\n                                    })\n                                    .filter { device ->\n                                        // TODO what if filter returns false??\n                                        // TODO check if we need device uid comparing\n                                        //  device.uid == deviceID &&\n                                        device.connectionInfos.any { connection ->\n                                            connection.protocolType == ProtocolType.GEN2_STANDARD_BASICS\n                                        }\n                                    }\n                                    .take(1)\n                                    .flatMap { device ->\n                                        var comparingReturnObs = Observable.just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))\n                                        // fw version is read after each connect, we can use that info to compare versions\n                                        val readVersion = device.extendedDeviceInfo.firmwareVersion\n                                        val updateVersion = updateInfoData.version\n                                        if (readVersion != updateVersion) { //expectVersionUpgrade is not needed here since AGPS will have early exit above\n                                            comparingReturnObs = Observable.error<OTAStatus>(OTAError.VersionMismatch())\n                                        }\n                                        comparingReturnObs\n\n                                    }");
            }
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-8$lambda-3, reason: not valid java name */
    public static final boolean m1543transferFile$lambda8$lambda3(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-8$lambda-4, reason: not valid java name */
    public static final io.reactivex.Observable m1544transferFile$lambda8$lambda4(java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.main.OTAError.DeviceNotAppeared());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-8$lambda-6, reason: not valid java name */
    public static final boolean m1545transferFile$lambda8$lambda6(powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        java.util.List<powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo> connectionInfos = device.getConnectionInfos();
        if (!(connectionInfos instanceof java.util.Collection) || !connectionInfos.isEmpty()) {
            java.util.Iterator<T> it = connectionInfos.iterator();
            while (it.hasNext()) {
                if (((powerwatch.matrix.com.pwgen2android.sdk.model.ConnectionInfo) it.next()).getProtocolType() == powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolType.GEN2_STANDARD_BASICS) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-8$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m1546transferFile$lambda8$lambda7(powerwatch.matrix.com.pwgen2android.main.FileTransfer this$0, powerwatch.matrix.com.pwgen2android.main.update.FirmwareDisplayData updateInfoData, powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo device) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateInfoData, "$updateInfoData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        io.reactivex.Observable observableJust = io.reactivex.Observable.just(new powerwatch.matrix.com.pwgen2android.main.OTAStatus(100, powerwatch.matrix.com.pwgen2android.main.OtaProcessPhase.COMPLETE.INSTANCE, this$0.otaExecutor.getPower(), 0, null, 24, null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "just(OTAStatus(100, OtaProcessPhase.COMPLETE, otaExecutor.power))");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(device.getExtendedDeviceInfo().getFirmwareVersion(), updateInfoData.getVersion())) {
            observableJust = io.reactivex.Observable.error(new powerwatch.matrix.com.pwgen2android.main.OTAError.VersionMismatch());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableJust, "error<OTAStatus>(OTAError.VersionMismatch())");
        }
        return observableJust;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: transferFile$lambda-9, reason: not valid java name */
    public static final void m1547transferFile$lambda9(powerwatch.matrix.com.pwgen2android.main.OTAStatus oTAStatus) {
        java.lang.System.out.println((java.lang.Object) ("AGPS - Sending on file transfer exit " + oTAStatus.getPhase() + ", " + oTAStatus.getPhaseProgress()));
    }
}
