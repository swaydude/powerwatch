package powerwatch.matrix.com.pwgen2android.sdk.core;

/* JADX INFO: compiled from: BluetoothScanner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;)V", "bluetoothReceiver", "Landroid/content/BroadcastReceiver;", "foundDevices", "Lio/reactivex/subjects/PublishSubject;", "Landroid/bluetooth/BluetoothDevice;", "kotlin.jvm.PlatformType", "intentFilter", "Landroid/content/IntentFilter;", "devices", "Lio/reactivex/Observable;", "deviceAddresses", "", "", "scan", "Companion", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BluetoothScannerImpl implements powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScanner, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.class).getSimpleName();
    private final android.bluetooth.BluetoothAdapter bluetoothAdapter;
    private final android.content.BroadcastReceiver bluetoothReceiver;
    private final android.content.Context context;
    private final io.reactivex.subjects.PublishSubject<android.bluetooth.BluetoothDevice> foundDevices;
    private final android.content.IntentFilter intentFilter;

    public BluetoothScannerImpl(android.content.Context context, android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothAdapter, "bluetoothAdapter");
        this.context = context;
        this.bluetoothAdapter = bluetoothAdapter;
        io.reactivex.subjects.PublishSubject<android.bluetooth.BluetoothDevice> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<BluetoothDevice>()");
        this.foundDevices = publishSubjectCreate;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        this.intentFilter = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        this.bluetoothReceiver = new android.content.BroadcastReceiver() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                if (kotlin.jvm.internal.Intrinsics.areEqual("android.bluetooth.device.action.FOUND", intent.getAction())) {
                    android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null) {
                        powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.this.foundDevices.onNext(bluetoothDevice);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual("android.bluetooth.adapter.action.DISCOVERY_FINISHED", intent.getAction())) {
                    android.util.Log.d(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.TAG, "Bluetooth Classic discovering finished!");
                } else if (kotlin.jvm.internal.Intrinsics.areEqual("android.bluetooth.adapter.action.DISCOVERY_STARTED", intent.getAction())) {
                    android.util.Log.d(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.TAG, "Bluetooth discovering started!");
                }
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BluetoothScannerImpl(android.content.Context context, android.bluetooth.BluetoothAdapter bluetoothAdapter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            bluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bluetoothAdapter, "getDefaultAdapter()");
        }
        this(context, bluetoothAdapter);
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScanner
    public io.reactivex.Observable<android.bluetooth.BluetoothDevice> devices() {
        return scan$default(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ io.reactivex.Observable scan$default(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl bluetoothScannerImpl, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return bluetoothScannerImpl.scan(list);
    }

    private final io.reactivex.Observable<android.bluetooth.BluetoothDevice> scan(final java.util.List<java.lang.String> deviceAddresses) {
        io.reactivex.Observable<android.bluetooth.BluetoothDevice> observableDoOnDispose = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$oMUjpwAMvs79yZiBD9hkC5_UISE
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2278scan$lambda0(this.f$0);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$2xAAW-NoWB6qVrmw5gjvhOTfKic
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2279scan$lambda1(deviceAddresses, (android.bluetooth.BluetoothDevice) obj);
            }
        }).filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2280scan$lambda2((android.bluetooth.BluetoothDevice) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2281scan$lambda3((android.bluetooth.BluetoothDevice) obj);
            }
        }).timeout(11500L, java.util.concurrent.TimeUnit.MILLISECONDS).retryWhen(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$q7Kka9rUa46yeL9GSQbVcx2UGZ4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2282scan$lambda5((io.reactivex.Observable) obj);
            }
        }).doOnSubscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$CvEg5WHdHjVIWeEMdfkqlahkzmU
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2284scan$lambda6(this.f$0, (io.reactivex.disposables.Disposable) obj);
            }
        }).doOnDispose(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$YBPyyxMV394IiBVrp9i7OiAeK44
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2285scan$lambda7(this.f$0);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableDoOnDispose, "defer {\n            info(\"Starting bluetooth classic scanning...\")\n            bluetoothAdapter.cancelDiscovery()\n            val started = bluetoothAdapter.startDiscovery()\n            info(\"Bluetooth classic scanning started: $started\")\n\n            foundDevices\n        }\n                .filter { bluetoothDevice -> deviceAddresses.isEmpty() || deviceAddresses.contains(bluetoothDevice.address) }\n                .filter { it.isPowerWatchDevice() }\n                .doOnNext { bluetoothDevice -> Log.d(TAG, \"Found PowerWatch device, Address is: ${bluetoothDevice.address}\") }\n                .timeout(11500, TimeUnit.MILLISECONDS)\n                .retryWhen { observable ->\n                    observable.flatMap { throwable ->\n                        if (throwable is TimeoutException) {\n                            Observable.just(0)\n                        } else Observable.error(throwable)\n                    }\n                }\n                .doOnSubscribe {\n                    context.registerReceiver(bluetoothReceiver, intentFilter)\n                }\n                .doOnDispose {\n                    if (bluetoothAdapter.isDiscovering) {\n                        Log.d(TAG, \"Unsubscribe called, canceling discovery...\")\n                        bluetoothAdapter.cancelDiscovery()\n                    }\n                    context.unregisterReceiver(bluetoothReceiver)\n\n                }");
        return observableDoOnDispose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-0, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2278scan$lambda0(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl bluetoothScannerImpl = this$0;
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(bluetoothScannerImpl, "Starting bluetooth classic scanning...", null, 2, null);
        this$0.bluetoothAdapter.cancelDiscovery();
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.info$default(bluetoothScannerImpl, kotlin.jvm.internal.Intrinsics.stringPlus("Bluetooth classic scanning started: ", java.lang.Boolean.valueOf(this$0.bluetoothAdapter.startDiscovery())), null, 2, null);
        return this$0.foundDevices;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-1, reason: not valid java name */
    public static final boolean m2279scan$lambda1(java.util.List deviceAddresses, android.bluetooth.BluetoothDevice bluetoothDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAddresses, "$deviceAddresses");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bluetoothDevice, "bluetoothDevice");
        return deviceAddresses.isEmpty() || deviceAddresses.contains(bluetoothDevice.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-2, reason: not valid java name */
    public static final boolean m2280scan$lambda2(android.bluetooth.BluetoothDevice it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.isPowerWatchDevice(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-3, reason: not valid java name */
    public static final void m2281scan$lambda3(android.bluetooth.BluetoothDevice bluetoothDevice) {
        android.util.Log.d(TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Found PowerWatch device, Address is: ", bluetoothDevice.getAddress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2282scan$lambda5(io.reactivex.Observable observable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observable, "observable");
        return observable.flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.core.-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl.m2283scan$lambda5$lambda4((java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-5$lambda-4, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2283scan$lambda5$lambda4(java.lang.Throwable throwable) {
        io.reactivex.Observable observableError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof java.util.concurrent.TimeoutException) {
            observableError = io.reactivex.Observable.just(0);
        } else {
            observableError = io.reactivex.Observable.error(throwable);
        }
        return observableError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-6, reason: not valid java name */
    public static final void m2284scan$lambda6(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl this$0, io.reactivex.disposables.Disposable disposable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.context.registerReceiver(this$0.bluetoothReceiver, this$0.intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: scan$lambda-7, reason: not valid java name */
    public static final void m2285scan$lambda7(powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScannerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.bluetoothAdapter.isDiscovering()) {
            android.util.Log.d(TAG, "Unsubscribe called, canceling discovery...");
            this$0.bluetoothAdapter.cancelDiscovery();
        }
        this$0.context.unregisterReceiver(this$0.bluetoothReceiver);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.core.BluetoothScanner
    public io.reactivex.Observable<android.bluetooth.BluetoothDevice> devices(java.util.List<java.lang.String> deviceAddresses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAddresses, "deviceAddresses");
        android.util.Log.d(TAG, java.lang.String.valueOf(deviceAddresses.size()));
        java.util.List<android.bluetooth.BluetoothDevice> listPowerWatchDevices = powerwatch.matrix.com.pwgen2android.shared.extensions.BluetoothExtensionsKt.powerWatchDevices(this.bluetoothAdapter);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listPowerWatchDevices) {
            if (deviceAddresses.contains(((android.bluetooth.BluetoothDevice) obj).getAddress())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        android.util.Log.d(TAG, java.lang.String.valueOf(arrayList2.size()));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : deviceAddresses) {
            java.lang.String str = (java.lang.String) obj2;
            java.util.ArrayList arrayList4 = arrayList2;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(((android.bluetooth.BluetoothDevice) it.next()).getAddress());
            }
            if (!arrayList5.contains(str)) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList6 = arrayList3;
        android.util.Log.d(TAG, java.lang.String.valueOf(deviceAddresses.size()));
        if (arrayList6.isEmpty()) {
            return io.reactivex.rxkotlin.ObservableKt.toObservable(arrayList2);
        }
        io.reactivex.Observable<android.bluetooth.BluetoothDevice> observableMerge = io.reactivex.Observable.merge(io.reactivex.rxkotlin.ObservableKt.toObservable(arrayList2), scan(arrayList6));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(appPairedBondedDevices.toObservable(), scan(notBondedDevicesToScan))");
        return observableMerge;
    }
}
