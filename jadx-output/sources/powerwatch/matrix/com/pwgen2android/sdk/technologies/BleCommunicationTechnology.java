package powerwatch.matrix.com.pwgen2android.sdk.technologies;

/* JADX INFO: compiled from: BleCommunicationTechnology.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004BY\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;", "", "", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "context", "Landroid/content/Context;", "preference", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;", "rxBleClient", "Lcom/polidea/rxandroidble2/RxBleClient;", "protocolCreator", "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;", "accessoryProvider", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;", "connectionOperation", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;", "Lcom/polidea/rxandroidble2/RxBleDevice;", "Lio/reactivex/Observable;", "Lcom/polidea/rxandroidble2/RxBleConnection;", "accessoryCreatorOperation", "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;", "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;)V", "getContext", "()Landroid/content/Context;", "monitorDisposables", "Lio/reactivex/disposables/CompositeDisposable;", "accessoryStatus", "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;", "addAccessory", "", "accessoryID", "removeAccessory", "startMonitoring", "filter", "stopMonitoring", "destroyAll", "", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BleCommunicationTechnology implements powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology<java.util.List<? extends java.lang.String>>, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperation accessoryCreatorOperation;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation<com.polidea.rxandroidble2.RxBleDevice, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection>> connectionOperation;
    private final android.content.Context context;
    private final io.reactivex.disposables.CompositeDisposable monitorDisposables;
    private final powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference preference;
    private final powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator protocolCreator;
    private final com.polidea.rxandroidble2.RxBleClient rxBleClient;

    public BleCommunicationTechnology(android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference preference, com.polidea.rxandroidble2.RxBleClient rxBleClient, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator protocolCreator, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation<com.polidea.rxandroidble2.RxBleDevice, io.reactivex.Observable<com.polidea.rxandroidble2.RxBleConnection>> connectionOperation, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperation accessoryCreatorOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "preference");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocolCreator, "protocolCreator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryProvider, "accessoryProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionOperation, "connectionOperation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryCreatorOperation, "accessoryCreatorOperation");
        this.context = context;
        this.preference = preference;
        this.rxBleClient = rxBleClient;
        this.protocolCreator = protocolCreator;
        this.accessoryProvider = accessoryProvider;
        this.connectionOperation = connectionOperation;
        this.accessoryCreatorOperation = accessoryCreatorOperation;
        this.monitorDisposables = new io.reactivex.disposables.CompositeDisposable();
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public /* bridge */ /* synthetic */ void startMonitoring(java.util.List<? extends java.lang.String> list) {
        startMonitoring2((java.util.List<java.lang.String>) list);
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleCommunicationTechnology(android.content.Context context, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.ConnectionPreference connectionPreference, com.polidea.rxandroidble2.RxBleClient rxBleClient, powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreator protocolCreator, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionOperation bleConnectionOperation, powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperation bleAccessoryCreatorOperation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        com.polidea.rxandroidble2.RxBleClient rxBleClient2;
        if ((i & 4) != 0) {
            com.polidea.rxandroidble2.RxBleClient rxBleClientCreate = com.polidea.rxandroidble2.RxBleClient.create(context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rxBleClientCreate, "class BleCommunicationTechnology(\n        val context: Context,\n        private val preference: ConnectionPreference,\n        private val rxBleClient: RxBleClient = RxBleClient.create(context),\n        private val protocolCreator: ProtocolCreator = ProtocolCreatorImpl(),\n        private val accessoryProvider: AccessoryProvider = AccessoryProviderImpl(),\n        private val connectionOperation: BleConnectionOperation<RxBleDevice, Observable<RxBleConnection>>\n        = BleConnectionWithRetryOperation(preference),\n        private val accessoryCreatorOperation: BleAccessoryCreatorOperation = BleAccessoryCreatorOperationImpl())\n    : BleTechnology<List<String>>, Loggable {\n\n    private val monitorDisposables = CompositeDisposable()\n\n    override fun startMonitoring(filter: List<String>?) {\n        debug(\"Start monitoring called, triggering connection for devices: $filter\")\n        monitorDisposables.clear()\n\n        val filterData = filter ?: listOf()\n        monitorDisposables.add(\n                filterData.toObservable()\n                        .map { rxBleClient.getBleDevice(it) }\n                        .concatMap { bleDevice ->\n                            Observable.just(accessoryProvider)\n                                    .doOnNext { debug(\"Starting connection with auto-enabled: ${preference.isAutoConnectEnabled()}\") }\n                                    .concatMap {\n                                        connectionOperation.executeOperation(bleDevice, accessoryProvider)\n                                                .concatMapSingle { bleConnection ->\n                                                    accessoryCreatorOperation.executeOperation(\n                                                            bleConnection,\n                                                            protocolCreator,\n                                                            bleDevice,\n                                                            TechnologyType.BLE_COMMUNICATION)\n                                                }\n                                    }\n                                    .retryWhen {\n                                        it.doOnNext { throwable ->\n                                            println(\"Received error ${throwable.javaClass.simpleName}\")\n                                        }.flatMap { error ->\n                                            accessoryProvider.clear(bleDevice.macAddress)\n                                            if (BluetoothAdapter.getDefaultAdapter().isEnabled) {\n                                                if (error is BleException && error !is BleAlreadyConnectedException) {\n                                                    return@flatMap Observable.just(0)\n                                                            .delay(2000, TimeUnit.MILLISECONDS)\n                                                }\n                                                return@flatMap Observable.just(0)\n                                                        .delay(15000, TimeUnit.MILLISECONDS)\n                                            }\n                                            Observable.empty<Int>()\n                                        }\n                                    }\n\n                        }\n                        .subscribe({\n                            debug(\"Accessory created, adding it into map and pushing to communicator..\")\n                            accessoryProvider.add(it.deviceInfo.uid, it)\n                        }, {\n\n                            wtfError(\"StartMonitoring channel error occurred: ${it.javaClass.simpleName}\")\n                            it.printStackTrace()\n                        }))\n    }\n\n    override fun stopMonitoring(destroyAll: Boolean) {\n        debug(\"Stop monitoring called, clearing accessories.\")\n        monitorDisposables.clear()\n        accessoryProvider.clearAll()\n\n    }\n\n    override fun accessoryStatus(): Observable<Accessory> {\n        return accessoryProvider.accessoryChange\n    }\n\n    override fun removeAccessory(accessoryID: String) {\n        TODO(\"not implemented\") //To change body of created functions use File | Settings | File Templates.\n    }\n\n    override fun addAccessory(accessoryID: String) {\n        TODO(\"not implemented\") //To change body of created functions use File | Settings | File Templates.\n    }\n}");
            rxBleClient2 = rxBleClientCreate;
        } else {
            rxBleClient2 = rxBleClient;
        }
        this(context, connectionPreference, rxBleClient2, (i & 8) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.protocol.ProtocolCreatorImpl() : protocolCreator, (i & 16) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProviderImpl() : accessoryProvider, (i & 32) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleConnectionWithRetryOperation(connectionPreference) : bleConnectionOperation, (i & 64) != 0 ? new powerwatch.matrix.com.pwgen2android.sdk.technologies.operations.BleAccessoryCreatorOperationImpl() : bleAccessoryCreatorOperation);
    }

    /* JADX INFO: renamed from: startMonitoring, reason: avoid collision after fix types in other method */
    public void startMonitoring2(java.util.List<java.lang.String> filter) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, kotlin.jvm.internal.Intrinsics.stringPlus("Start monitoring called, triggering connection for devices: ", filter), null, 2, null);
        this.monitorDisposables.clear();
        if (filter == null) {
            filter = kotlin.collections.CollectionsKt.emptyList();
        }
        this.monitorDisposables.add(io.reactivex.rxkotlin.ObservableKt.toObservable(filter).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$tsSiDqJZ970ObmNL8Mq8s-R7VaM
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2747startMonitoring$lambda0(this.f$0, (java.lang.String) obj);
            }
        }).concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$Bpf4wSnljY4cdluFOKHHvsF1ZbQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2748startMonitoring$lambda7(this.f$0, (com.polidea.rxandroidble2.RxBleDevice) obj);
            }
        }).subscribe(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$QgWYuuc1DIE2VTfmiCWN0yWGksQ
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2755startMonitoring$lambda8(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.model.Accessory) obj);
            }
        }, new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$9Kc2XYRlRKQb3U_jnYmq36_UQaM
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2756startMonitoring$lambda9(this.f$0, (java.lang.Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-0, reason: not valid java name */
    public static final com.polidea.rxandroidble2.RxBleDevice m2747startMonitoring$lambda0(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, java.lang.String it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.rxBleClient.getBleDevice(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2748startMonitoring$lambda7(final powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, final com.polidea.rxandroidble2.RxBleDevice bleDevice) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "bleDevice");
        return io.reactivex.Observable.just(this$0.accessoryProvider).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$isEETtW0hYBZUjNTk8de7NTdMjw
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2749startMonitoring$lambda7$lambda1(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider) obj);
            }
        }).concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$fElYt0Oy1DzQSUfYNRr4hG8ktl8
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2750startMonitoring$lambda7$lambda3(this.f$0, bleDevice, (powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider) obj);
            }
        }).retryWhen(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$R32sY-ooQMBD4sN_H7bKTjlmmnk
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2752startMonitoring$lambda7$lambda6(this.f$0, bleDevice, (io.reactivex.Observable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7$lambda-1, reason: not valid java name */
    public static final void m2749startMonitoring$lambda7$lambda1(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("Starting connection with auto-enabled: ", java.lang.Boolean.valueOf(this$0.preference.isAutoConnectEnabled())), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7$lambda-3, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2750startMonitoring$lambda7$lambda3(final powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, final com.polidea.rxandroidble2.RxBleDevice bleDevice, powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "$bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return this$0.connectionOperation.executeOperation(bleDevice, this$0.accessoryProvider).concatMapSingle(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2751startMonitoring$lambda7$lambda3$lambda2(this.f$0, bleDevice, (com.polidea.rxandroidble2.RxBleConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7$lambda-3$lambda-2, reason: not valid java name */
    public static final io.reactivex.SingleSource m2751startMonitoring$lambda7$lambda3$lambda2(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, com.polidea.rxandroidble2.RxBleDevice bleDevice, com.polidea.rxandroidble2.RxBleConnection bleConnection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "$bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleConnection, "bleConnection");
        return this$0.accessoryCreatorOperation.executeOperation(bleConnection, this$0.protocolCreator, bleDevice, powerwatch.matrix.com.pwgen2android.sdk.technologies.TechnologyType.BLE_COMMUNICATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7$lambda-6, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2752startMonitoring$lambda7$lambda6(final powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, final com.polidea.rxandroidble2.RxBleDevice bleDevice, io.reactivex.Observable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "$bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$tSg-0x6X-8KormxWBrfi0XzA-HY
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2753startMonitoring$lambda7$lambda6$lambda4((java.lang.Throwable) obj);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.technologies.-$$Lambda$BleCommunicationTechnology$NjoBAQXPfkxoVUKcFySzTK08MWc
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology.m2754startMonitoring$lambda7$lambda6$lambda5(this.f$0, bleDevice, (java.lang.Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7$lambda-6$lambda-4, reason: not valid java name */
    public static final void m2753startMonitoring$lambda7$lambda6$lambda4(java.lang.Throwable th) {
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("Received error ", th.getClass().getSimpleName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-7$lambda-6$lambda-5, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2754startMonitoring$lambda7$lambda6$lambda5(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, com.polidea.rxandroidble2.RxBleDevice bleDevice, java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bleDevice, "$bleDevice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider = this$0.accessoryProvider;
        java.lang.String macAddress = bleDevice.getMacAddress();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(macAddress, "bleDevice.macAddress");
        accessoryProvider.clear(macAddress);
        if (android.bluetooth.BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            if ((error instanceof com.polidea.rxandroidble2.exceptions.BleException) && !(error instanceof com.polidea.rxandroidble2.exceptions.BleAlreadyConnectedException)) {
                return io.reactivex.Observable.just(0).delay(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            return io.reactivex.Observable.just(0).delay(15000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
        return io.reactivex.Observable.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-8, reason: not valid java name */
    public static final void m2755startMonitoring$lambda8(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, powerwatch.matrix.com.pwgen2android.sdk.model.Accessory it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this$0, "Accessory created, adding it into map and pushing to communicator..", null, 2, null);
        powerwatch.matrix.com.pwgen2android.sdk.technologies.AccessoryProvider accessoryProvider = this$0.accessoryProvider;
        java.lang.String uid = it.getDeviceInfo().getUid();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        accessoryProvider.add(uid, it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startMonitoring$lambda-9, reason: not valid java name */
    public static final void m2756startMonitoring$lambda9(powerwatch.matrix.com.pwgen2android.sdk.technologies.BleCommunicationTechnology this$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.wtfError$default(this$0, kotlin.jvm.internal.Intrinsics.stringPlus("StartMonitoring channel error occurred: ", th.getClass().getSimpleName()), null, 2, null);
        th.printStackTrace();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void stopMonitoring(boolean destroyAll) {
        powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInputKt.debug$default(this, "Stop monitoring called, clearing accessories.", null, 2, null);
        this.monitorDisposables.clear();
        this.accessoryProvider.clearAll();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.model.Accessory> accessoryStatus() {
        return this.accessoryProvider.getAccessoryChange();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void removeAccessory(java.lang.String accessoryID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.technologies.BleTechnology
    public void addAccessory(java.lang.String accessoryID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessoryID, "accessoryID");
        throw new kotlin.NotImplementedError("An operation is not implemented: not implemented");
    }
}
