.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;
.super Ljava/lang/Object;
.source "BleAccessoryCreatorOperationImpl.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleAccessoryCreatorOperationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleAccessoryCreatorOperationImpl.kt\npowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1783#2,2:81\n1547#2:83\n1618#2,3:84\n1785#2:87\n*S KotlinDebug\n*F\n+ 1 BleAccessoryCreatorOperationImpl.kt\npowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl\n*L\n55#1:81,2\n57#1:83\n57#1:84,3\n55#1:87\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J.\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;",
        "()V",
        "createBleCreatorConfig",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;",
        "gattServices",
        "",
        "Landroid/bluetooth/BluetoothGattService;",
        "executeOperation",
        "Lio/reactivex/Single;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "bleConnection",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "protocolCreator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
        "bleDevice",
        "Lcom/polidea/rxandroidble2/RxBleDevice;",
        "technologyType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
        "resolveCommunicationChannel",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createBleCreatorConfig(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/bluetooth/BluetoothGattService;",
            ">;)",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;"
        }
    .end annotation

    .line 54
    check-cast p1, Ljava/lang/Iterable;

    .line 55
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGattService;

    .line 56
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object v2

    .line 57
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGattService;->getCharacteristics()Ljava/util/List;

    move-result-object v1

    const-string v3, "bluetoothGattService.characteristics"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .line 83
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 84
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 85
    check-cast v4, Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 57
    invoke-virtual {v4}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 86
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 83
    check-cast v3, Ljava/lang/Iterable;

    .line 57
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    .line 56
    new-instance v3, Lkotlin/Pair;

    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->getServices()Ljava/util/Map;

    move-result-object v1

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;->copy(Ljava/util/Map;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final executeOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleDeviceServices;)Ljava/util/List;
    .locals 1

    const-string v0, "$protocolCreator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$technologyType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-virtual {p3}, Lcom/polidea/rxandroidble2/RxBleDeviceServices;->getBluetoothGattServices()Ljava/util/List;

    move-result-object p3

    const-string v0, "it.bluetoothGattServices"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->createBleCreatorConfig(Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;

    move-result-object p2

    .line 27
    invoke-interface {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;->createProtocols(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/BleCreatorConfig;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final executeOperation$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$technologyType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleDevice"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocols"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    check-cast p4, Ljava/lang/Iterable;

    invoke-static {p4}, Lio/reactivex/Observable;->fromIterable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p4

    .line 32
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;

    invoke-direct {v0, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$Pt8ovEh5X9y6kG7VWuxqXOYi0TI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V

    invoke-virtual {p4, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$EHL_Ttni7eG9nMB1ioOE2Scfmr0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$EHL_Ttni7eG9nMB1ioOE2Scfmr0;

    .line 36
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    .line 43
    invoke-virtual {p0}, Lio/reactivex/Observable;->toList()Lio/reactivex/Single;

    move-result-object p0

    .line 44
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$OtQyhDgb9OEwufUqYmoykY4DPig;

    invoke-direct {p1, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$OtQyhDgb9OEwufUqYmoykY4DPig;-><init>(Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {p0, p1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final executeOperation$lambda-5$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bleConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$technologyType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-interface {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->resolveCommunicationChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lcom/polidea/rxandroidble2/RxBleConnection;)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    move-result-object p0

    .line 34
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    invoke-interface {p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;->getType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;

    move-result-object v0

    invoke-direct {p1, p3, p0, p2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)V

    return-object p1
.end method

.method private static final executeOperation$lambda-5$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "connection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;->open()Lio/reactivex/Single;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lio/reactivex/Single;->toObservable()Lio/reactivex/Observable;

    move-result-object v0

    .line 39
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$qCMTjxNbT_2sklQaZCvG0-gWJnM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$qCMTjxNbT_2sklQaZCvG0-gWJnM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final executeOperation$lambda-5$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;
    .locals 1

    const-string v0, "$connection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final executeOperation$lambda-5$lambda-4(Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 12

    const-string v0, "$bleDevice"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-interface {p0}, Lcom/polidea/rxandroidble2/RxBleDevice;->getBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 46
    invoke-interface {p0}, Lcom/polidea/rxandroidble2/RxBleDevice;->getBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, "Powerwatch"

    :cond_0
    move-object v6, p0

    .line 47
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    const-string v0, "deviceID"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xee

    const/4 v11, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v11}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 48
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_COMMUNICATION:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-direct {v0, p0, p1, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V

    return-object v0
.end method

.method public static synthetic lambda$74zRx2R71RfNMPJXMTvvTEAtfjI(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->executeOperation$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$B6lryC0leN7woRt5Ny5_Nfa7jZ8(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleDeviceServices;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->executeOperation$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleDeviceServices;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$EHL_Ttni7eG9nMB1ioOE2Scfmr0(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->executeOperation$lambda-5$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OtQyhDgb9OEwufUqYmoykY4DPig(Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->executeOperation$lambda-5$lambda-4(Lcom/polidea/rxandroidble2/RxBleDevice;Ljava/util/List;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Pt8ovEh5X9y6kG7VWuxqXOYi0TI(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->executeOperation$lambda-5$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/Protocol;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$qCMTjxNbT_2sklQaZCvG0-gWJnM(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;->executeOperation$lambda-5$lambda-3$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/InitInfo;)Lpowerwatch/matrix/com/pwgen2android/sdk/connection/ConnectionImpl;

    move-result-object p0

    return-object p0
.end method

.method private final resolveCommunicationChannel(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;Lcom/polidea/rxandroidble2/RxBleConnection;)Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;
    .locals 8

    .line 64
    new-instance v7, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p2

    invoke-direct/range {v0 .. v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;-><init>(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    .line 74
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;-><init>(Lcom/polidea/rxandroidble2/RxBleConnection;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    goto :goto_0

    .line 73
    :pswitch_1
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-direct {p1, v7, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    goto :goto_0

    .line 72
    :pswitch_2
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;

    invoke-direct {p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;-><init>(Lcom/polidea/rxandroidble2/RxBleConnection;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    goto :goto_0

    .line 68
    :pswitch_3
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;

    const-string v0, "00002760-08C2-11E1-9073-0E8AC72E0001"

    const-string v2, "00002760-08C2-11E1-9073-0E8AC72E0002"

    invoke-direct {p1, p2, v0, v2, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BLECommunicationChannel;-><init>(Lcom/polidea/rxandroidble2/RxBleConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    goto :goto_0

    .line 67
    :pswitch_4
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-direct {p1, v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/SimpleBLECommunicationChannel;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    goto :goto_0

    .line 66
    :pswitch_5
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;

    check-cast v7, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    invoke-direct {p1, v7, v1, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/BleStreamCommunicationChannel;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Lpowerwatch/matrix/com/pwgen2android/sdk/channels/stream/ChannelStream;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public executeOperation(Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lcom/polidea/rxandroidble2/RxBleDevice;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/RxBleConnection;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;",
            "Lcom/polidea/rxandroidble2/RxBleDevice;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
            ">;"
        }
    .end annotation

    const-string v0, "bleConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocolCreator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleDevice"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "technologyType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-interface {p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->discoverServices()Lio/reactivex/Single;

    move-result-object v0

    .line 26
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;

    invoke-direct {v1, p2, p4, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$B6lryC0leN7woRt5Ny5_Nfa7jZ8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p2

    .line 30
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;

    invoke-direct {v0, p0, p1, p4, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/-$$Lambda$BleAccessoryCreatorOperationImpl$74zRx2R71RfNMPJXMTvvTEAtfjI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperationImpl;Lcom/polidea/rxandroidble2/RxBleConnection;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;Lcom/polidea/rxandroidble2/RxBleDevice;)V

    invoke-virtual {p2, v0}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "bleConnection.discoverServices()\n                .map {\n                    protocolCreator.createProtocols(technologyType,\n                            bleCreatorConfig = createBleCreatorConfig(it.bluetoothGattServices))\n                }\n                .flatMap { protocols ->\n                    Observable.fromIterable(protocols)\n                            .map { protocol ->\n                                val channel = resolveCommunicationChannel(protocol.getType(), bleConnection)\n                                ConnectionImpl(protocol, channel, technologyType, protocol.getType())\n                            }\n                            .flatMap { connection ->\n                                connection.open()\n                                        .toObservable()\n                                        .map {\n                                            connection\n                                        }\n                            }\n                            .toList()\n                            .map { connections ->\n                                val deviceID = bleDevice.bluetoothDevice.address\n                                val deviceName = bleDevice.bluetoothDevice.name ?: \"Powerwatch\"\n                                val deviceInfo = DeviceInfo(deviceID, deviceName = deviceName)\n                                Accessory(deviceInfo, connections, TechnologyType.BLE_COMMUNICATION)\n                            }\n                }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
