package powerwatch.matrix.com.pwgen2android.sdk.technologies;

/* JADX INFO: compiled from: BleScanningTechnology.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;", "", "Lcom/polidea/rxandroidble2/scan/ScanFilter;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "rxBleClient", "Lcom/polidea/rxandroidble2/RxBleClient;", "bluetoothScanner", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;", "bleScanner", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;", "accessoryProvider", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "(Landroid/content/Context;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V", "getContext", "()Landroid/content/Context;", "monitorDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "accessoryStatus", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "addAccessory", "", "accessoryID", "", "removeAccessory", "startMonitoring", "filter", "stopMonitoring", "destroyAll", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleScanningTechnology implements powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology<java.util.List<? extends com.polidea.rxandroidble2.scan.ScanFilter>>, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider;
    private final powerwatch.matrix.com.pwgen2android.sdk.core.BleScanner bleScanner;
    private final powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScanner bluetoothScanner;
    private final android.content.Context context;
    private final io.reactivex.disposables.CompositeDisposable monitorDisposables;
    private final com.polidea.rxandroidble2.RxBleClient rxBleClient;

    public BleScanningTechnology(android.content.Context context, com.polidea.rxandroidble2.RxBleClient rxBleClient, powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScanner bluetoothScanner, powerwatch.matrix.com.pwgen2android.sdk.core.BleScanner bleScanner, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothScanner, "bluetoothScanner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleScanner, "bleScanner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryProvider, "accessoryProvider");
        this.context = context;
        this.rxBleClient = rxBleClient;
        this.bluetoothScanner = bluetoothScanner;
        this.bleScanner = bleScanner;
        this.accessoryProvider = accessoryProvider;
        this.monitorDisposables = new io.reactivex.disposables.CompositeDisposable();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleScanningTechnology(android.content.Context context, com.polidea.rxandroidble2.RxBleClient rxBleClient, powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl bluetoothScannerImpl, powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerImpl bleScannerImpl, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProviderImpl accessoryProviderImpl, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            rxBleClient = com.polidea.rxandroidble2.RxBleClient.create(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rxBleClient, "<init>");
        }
        com.polidea.rxandroidble2.RxBleClient rxBleClient2 = rxBleClient;
        this(context, rxBleClient2, (i & 4) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl(context, null, 2, null) : bluetoothScannerImpl, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerImpl(rxBleClient2) : bleScannerImpl, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProviderImpl() : accessoryProviderImpl);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void stopMonitoring(boolean destroyAll) {
        this.monitorDisposables.clear();
        if (destroyAll) {
            this.accessoryProvider.clearAll();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> accessoryStatus() {
        return this.accessoryProvider.getAccessoryChange();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void startMonitoring(java.util.List<? extends com.polidea.rxandroidble2.scan.ScanFilter> filter) {
        io.reactivex.Observable map;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Start monitoring called, starting bluetooth/ble scanning", null, 2, null);
        powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration bleScannerConfiguration = filter != null ? new powerwatch.matrix.com.pwgen2android.sdk.core.BleScannerConfiguration(null, filter, null, 5, null) : null;
        this.monitorDisposables.clear();
        if (bleScannerConfiguration == null) {
            map = this.bluetoothScanner.devices().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$1Htz1OTzOKZ4VovTt8VPOxbsY9I
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2757startMonitoring$lambda0((android.bluetooth.BluetoothDevice) obj);
                }
            });
        } else {
            map = this.bleScanner.scan(bleScannerConfiguration).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk
                @Override // io.reactivex.functions.Predicate
                public final boolean test(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2758startMonitoring$lambda1((com.polidea.rxandroidble2.scan.ScanResult) obj);
                }
            }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$08QEOWXhCEpynGZIuPoZsmqWH_A
                @Override // io.reactivex.functions.Consumer
                public final void accept(java.lang.Object obj) {
                    powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2759startMonitoring$lambda2(this.f$0, (com.polidea.rxandroidble2.scan.ScanResult) obj);
                }
            }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$nyvGdlWHs7AI5dbuvOF77wzi3kw
                @Override // io.reactivex.functions.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2760startMonitoring$lambda4(this.f$0, (com.polidea.rxandroidble2.scan.ScanResult) obj);
                }
            });
        }
        this.monitorDisposables.add(map.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$rIviZFiBhDjYtQNAvN4GsEscReM
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2761startMonitoring$lambda5(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.Accessory) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$Fl1UnmsVdwAd_WLp1CtVgUccdI8
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2762startMonitoring$lambda6(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.Accessory) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleScanningTechnology$QPKL0YsXF_TOe1xKHotq0QbOltY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology.m2763startMonitoring$lambda7(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-0, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.Accessory m2757startMonitoring$lambda0(android.bluetooth.BluetoothDevice it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        java.lang.String deviceID = it.getAddress();
        java.lang.String deviceName = it.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceID, "deviceID");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceName, "deviceName");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.Accessory(new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo(deviceID, null, (short) 0, 0, deviceName, null, null, null, 238, null), kotlin.collections.CollectionsKt.emptyList(), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_SCANNING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-1, reason: not valid java name */
    public static final boolean m2758startMonitoring$lambda1(com.polidea.rxandroidble2.scan.ScanResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        com.polidea.rxandroidble2.RxBleDevice bleDevice = it.getBleDevice();
        return (bleDevice == null ? null : bleDevice.getBluetoothDevice()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-2, reason: not valid java name */
    public static final void m2759startMonitoring$lambda2(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology this$0, com.polidea.rxandroidble2.scan.ScanResult scanResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Device PW2 found, extracting advertising information...", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.model.Accessory m2760startMonitoring$lambda4(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology this$0, com.polidea.rxandroidble2.scan.ScanResult scanResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        android.util.SparseArray<byte[]> manufacturerSpecificData = scanResult.getScanRecord().getManufacturerSpecificData();
        for (int i = 0; i < manufacturerSpecificData.size(); i++) {
            int iKeyAt = manufacturerSpecificData.keyAt(i);
            byte[] bArr = manufacturerSpecificData.get(iKeyAt);
            byte[] bArr2 = new byte[bArr.length + 2];
            bArr2[0] = (byte) (iKeyAt & 255);
            bArr2[1] = (byte) ((iKeyAt >> 8) & 255);
            java.lang.System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
            arrayList.add(bArr2);
        }
        short s = -1;
        short s2 = 1;
        for (byte[] bArr3 : arrayList) {
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr3);
            short s3 = byteBufferWrap.getShort();
            s2 = byteBufferWrap.get();
            powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology bleScanningTechnology = this$0;
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(bleScanningTechnology, kotlin.jvm.internal.Intrinsics.stringPlus("Data: ", powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.formatToString$default(bArr3, false, 1, null)), null, 2, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("PairingCode: ");
            java.lang.String string = java.lang.Integer.toString(s3, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(10)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string);
            sb.append("\nProtocolVersion: ");
            java.lang.String string2 = java.lang.Integer.toString(s2, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(10)));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            sb.append(string2);
            powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(bleScanningTechnology, sb.toString(), null, 2, null);
            s = s3;
        }
        java.lang.String deviceID = scanResult.getBleDevice().getBluetoothDevice().getAddress();
        java.lang.String name = scanResult.getBleDevice().getBluetoothDevice().getName();
        if (name == null) {
            name = "Powerwatch";
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceID, "deviceID");
        return new powerwatch.matrix.com.pwgen2android.sdk.model.Accessory(new powerwatch.matrix.com.pwgen2android.sdk.model.DeviceInfo(deviceID, java.lang.Short.valueOf(s), s2, 0, name, null, null, null, 232, null), kotlin.collections.CollectionsKt.emptyList(), powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_SCANNING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-5, reason: not valid java name */
    public static final boolean m2761startMonitoring$lambda5(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology this$0, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory accessory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessory, "accessory");
        return !this$0.accessoryProvider.contains(accessory.getDeviceInfo().getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-6, reason: not valid java name */
    public static final void m2762startMonitoring$lambda6(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology this$0, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Accessory created, adding it into map and pushing to communicator..", null, 2, null);
        powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider = this$0.accessoryProvider;
        java.lang.String uid = it.getDeviceInfo().getUid();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        accessoryProvider.add(uid, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7, reason: not valid java name */
    public static final void m2763startMonitoring$lambda7(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleScanningTechnology this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        th.printStackTrace();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.error$default(this$0, "StartMonitoring channel error occurred.", th, null, 4, null);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void addAccessory(java.lang.String accessoryID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void removeAccessory(java.lang.String accessoryID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        this.accessoryProvider.clear(accessoryID);
    }
}
