.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;
.super Ljava/lang/Object;
.source "BleCommunicationTechnology.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology<",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004BY\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u001a\u0008\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u0010\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u00020\u001e2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;",
        "",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "preference",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
        "rxBleClient",
        "Lcom/polidea/rxandroidble2/RxBleClient;",
        "protocolCreator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
        "accessoryProvider",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
        "connectionOperation",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;",
        "Lcom/polidea/rxandroidble2/RxBleDevice;",
        "Lio/reactivex/Observable;",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "accessoryCreatorOperation",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;)V",
        "getContext",
        "()Landroid/content/Context;",
        "monitorDisposables",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "accessoryStatus",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "addAccessory",
        "",
        "accessoryID",
        "removeAccessory",
        "startMonitoring",
        "filter",
        "stopMonitoring",
        "destroyAll",
        "",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final accessoryCreatorOperation:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;

.field private final accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

.field private final connectionOperation:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation<",
            "Lcom/polidea/rxandroidble2/RxBleDevice;",
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/RxBleConnection;",
            ">;>;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

.field private final preference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

.field private final protocolCreator:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

.field private final rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
            "Lcom/polidea/rxandroidble2/RxBleClient;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation<",
            "Lcom/polidea/rxandroidble2/RxBleDevice;",
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/RxBleConnection;",
            ">;>;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBleClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolCreator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessoryProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionOperation"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessoryCreatorOperation"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->context:Landroid/content/Context;

    .line 24
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->preference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    .line 25
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;

    .line 26
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->protocolCreator:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

    .line 27
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    .line 28
    iput-object p6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->connectionOperation:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;

    .line 30
    iput-object p7, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryCreatorOperation:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;

    .line 33
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    .line 25
    invoke-static {p1}, Lcom/polidea/rxandroidble2/RxBleClient;->create(Landroid/content/Context;)Lcom/polidea/rxandroidble2/RxBleClient;

    move-result-object v0

    const-string v1, "class BleCommunicationTechnology(\n        val context: Context,\n        private val preference: ConnectionPreference,\n        private val rxBleClient: RxBleClient = RxBleClient.create(context),\n        private val protocolCreator: ProtocolCreator = ProtocolCreatorImpl(),\n        private val accessoryProvider: AccessoryProvider = AccessoryProviderImpl(),\n        private val connectionOperation: BleConnectionOperation<RxBleDevice, Observable<RxBleConnection>>\n        = BleConnectionWithRetryOperation(preference),\n        private val accessoryCreatorOperation: BleAccessoryCreatorOperation = BleAccessoryCreatorOperationImpl())\n    : BleTechnology<List<String>>, Loggable {\n\n    private val monitorDisposables = CompositeDisposable()\n\n    override fun startMonitoring(filter: List<String>?) {\n        debug(\"Start monitoring called, triggering connection for devices: $filter\")\n        monitorDisposables.clear()\n\n        val filterData = filter ?: listOf()\n        monitorDisposables.add(\n                filterData.toObservable()\n                        .map { rxBleClient.getBleDevice(it) }\n                        .concatMap { bleDevice ->\n                            Observable.just(accessoryProvider)\n                                    .doOnNext { debug(\"Starting connection with auto-enabled: ${preference.isAutoConnectEnabled()}\") }\n                                    .concatMap {\n                                        connectionOperation.executeOperation(bleDevice, accessoryProvider)\n                                                .concatMapSingle { bleConnection ->\n                                                    accessoryCreatorOperation.executeOperation(\n                                                            bleConnection,\n                                                            protocolCreator,\n                                                            bleDevice,\n                                                            TechnologyType.BLE_COMMUNICATION)\n                                                }\n                                    }\n                                    .retryWhen {\n                                        it.doOnNext { throwable ->\n                                            println(\"Received error ${throwable.javaClass.simpleName}\")\n                                        }.flatMap { error ->\n                                            accessoryProvider.clear(bleDevice.macAddress)\n                                            if (BluetoothAdapter.getDefaultAdapter().isEnabled) {\n                                                if (error is BleException && error !is BleAlreadyConnectedException) {\n                                                    return@flatMap Observable.just(0)\n                                                            .delay(2000, TimeUnit.MILLISECONDS)\n                                                }\n                                                return@flatMap Observable.just(0)\n                                                        .delay(15000, TimeUnit.MILLISECONDS)\n                                            }\n                                            Observable.empty<Int>()\n                                        }\n                                    }\n\n                        }\n                        .subscribe({\n                            debug(\"Accessory created, adding it into map and pushing to communicator..\")\n                            accessoryProvider.add(it.deviceInfo.uid, it)\n                        }, {\n\n                            wtfError(\"StartMonitoring channel error occurred: ${it.javaClass.simpleName}\")\n                            it.printStackTrace()\n                        }))\n    }\n\n    override fun stopMonitoring(destroyAll: Boolean) {\n        debug(\"Stop monitoring called, clearing accessories.\")\n        monitorDisposables.clear()\n        accessoryProvider.clearAll()\n\n    }\n\n    override fun accessoryStatus(): Observable<Accessory> {\n        return accessoryProvider.accessoryChange\n    }\n\n    override fun removeAccessory(accessoryID: String) {\n        TODO(\"not implemented\") //To change body of created functions use File | Settings | File Templates.\n    }\n\n    override fun addAccessory(accessoryID: String) {\n        TODO(\"not implemented\") //To change body of created functions use File | Settings | File Templates.\n    }\n}"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    goto :goto_0

    :cond_0
    move-object v5, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    .line 26
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreatorImpl;-><init>()V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    .line 27
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;-><init>()V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    .line 29
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;

    move-object v1, p2

    invoke-direct {v0, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionWithRetryOperation;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;)V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;

    move-object v8, v0

    goto :goto_3

    :cond_3
    move-object v1, p2

    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;

    invoke-direct {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;-><init>()V

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;

    move-object v9, v0

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    .line 22
    invoke-direct/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;)V

    return-void
.end method

.method public static synthetic lambda$9Kc2XYRlRKQb3U_jnYmq36_UQaM(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Bpf4wSnljY4cdluFOKHHvsF1ZbQ(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NjoBAQXPfkxoVUKcFySzTK08MWc(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QgWYuuc1DIE2VTfmiCWN0yWGksQ(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    return-void
.end method

.method public static synthetic lambda$R32sY-ooQMBD4sN_H7bKTjlmmnk(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$fElYt0Oy1DzQSUfYNRr4hG8ktl8(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$isEETtW0hYBZUjNTk8de7NTdMjw(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V

    return-void
.end method

.method public static synthetic lambda$j0P0ltIFsQ54B9A29TUNQErcls4(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lcom/polidea/rxandroidble2/RxBleConnection;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lcom/polidea/rxandroidble2/RxBleConnection;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$tSg-0x6X-8KormxWBrfi0XzA-HY(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-7$lambda-6$lambda-4(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$tsSiDqJZ970ObmNL8Mq8s-R7VaM(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/String;)Lcom/polidea/rxandroidble2/RxBleDevice;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/String;)Lcom/polidea/rxandroidble2/RxBleDevice;

    move-result-object p0

    return-object p0
.end method

.method private static final startMonitoring$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/String;)Lcom/polidea/rxandroidble2/RxBleDevice;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;

    invoke-virtual {p0, p1}, Lcom/polidea/rxandroidble2/RxBleClient;->getBleDevice(Ljava/lang/String;)Lcom/polidea/rxandroidble2/RxBleDevice;

    move-result-object p0

    return-object p0
.end method

.method private static final startMonitoring$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    .line 45
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$isEETtW0hYBZUjNTk8de7NTdMjw;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$isEETtW0hYBZUjNTk8de7NTdMjw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 46
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$fElYt0Oy1DzQSUfYNRr4hG8ktl8;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$fElYt0Oy1DzQSUfYNRr4hG8ktl8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 56
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$R32sY-ooQMBD4sN_H7bKTjlmmnk;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$R32sY-ooQMBD4sN_H7bKTjlmmnk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->retryWhen(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startMonitoring$lambda-7$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->preference:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;->isAutoConnectEnabled()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v0, "Starting connection with auto-enabled: "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final startMonitoring$lambda-7$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->connectionOperation:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {p2, p1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;->executeOperation(Ljava/lang/Object;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/reactivex/Observable;

    .line 48
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$j0P0ltIFsQ54B9A29TUNQErcls4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->concatMapSingle(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startMonitoring$lambda-7$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lcom/polidea/rxandroidble2/RxBleConnection;)Lio/reactivex/SingleSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleConnection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryCreatorOperation:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;

    .line 51
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->protocolCreator:Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;

    .line 53
    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    .line 49
    invoke-interface {v0, p2, p0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;->executeOperation(Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final startMonitoring$lambda-7$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tSg-0x6X-8KormxWBrfi0XzA-HY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tSg-0x6X-8KormxWBrfi0XzA-HY;

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p2

    .line 59
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$NjoBAQXPfkxoVUKcFySzTK08MWc;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$NjoBAQXPfkxoVUKcFySzTK08MWc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startMonitoring$lambda-7$lambda-6$lambda-4(Ljava/lang/Throwable;)V
    .locals 1

    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Received error "

    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startMonitoring$lambda-7$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {p1}, Lcom/polidea/rxandroidble2/RxBleDevice;->getMacAddress()Ljava/lang/String;

    move-result-object p1

    const-string v0, "bleDevice.macAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->clear(Ljava/lang/String;)V

    .line 61
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 62
    instance-of p0, p2, Lcom/polidea/rxandroidble2/exceptions/BleException;

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    instance-of p0, p2, Lcom/polidea/rxandroidble2/exceptions/BleAlreadyConnectedException;

    if-nez p0, :cond_0

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    const-wide/16 p1, 0x7d0

    .line 64
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, v0}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 66
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    const-wide/16 p1, 0x3a98

    .line 67
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, p1, p2, v0}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 69
    :cond_1
    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startMonitoring$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Accessory created, adding it into map and pushing to communicator.."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 76
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->add(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    return-void
.end method

.method private static final startMonitoring$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Ljava/lang/Throwable;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StartMonitoring channel error occurred: "

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method


# virtual methods
.method public accessoryStatus()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->getAccessoryChange()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public addAccessory(Ljava/lang/String;)V
    .locals 2

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 23
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 22
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public removeAccessory(Ljava/lang/String;)V
    .locals 2

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    new-instance p1, Lkotlin/NotImplementedError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "An operation is not implemented: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "not implemented"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public bridge synthetic startMonitoring(Ljava/lang/Object;)V
    .locals 0

    .line 22
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring(Ljava/util/List;)V

    return-void
.end method

.method public startMonitoring(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 36
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Start monitoring called, triggering connection for devices: "

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    if-nez p1, :cond_0

    .line 39
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 40
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    .line 41
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/rxkotlin/ObservableKt;->toObservable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 42
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tsSiDqJZ970ObmNL8Mq8s-R7VaM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$tsSiDqJZ970ObmNL8Mq8s-R7VaM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 43
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$Bpf4wSnljY4cdluFOKHHvsF1ZbQ;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$Bpf4wSnljY4cdluFOKHHvsF1ZbQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 74
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$QgWYuuc1DIE2VTfmiCWN0yWGksQ;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$QgWYuuc1DIE2VTfmiCWN0yWGksQ;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;)V

    .line 77
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$9Kc2XYRlRKQb3U_jnYmq36_UQaM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleCommunicationTechnology$9Kc2XYRlRKQb3U_jnYmq36_UQaM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;)V

    .line 74
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public stopMonitoring(Z)V
    .locals 3

    .line 85
    move-object p1, p0

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v0, "Stop monitoring called, clearing accessories."

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 86
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 87
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->clearAll()V

    return-void
.end method
