.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;
.super Ljava/lang/Object;
.source "Communicator.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCommunicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Communicator.kt\npowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,264:1\n1547#2:265\n1618#2,3:266\n1547#2:269\n1618#2,3:270\n211#3,2:273\n*S KotlinDebug\n*F\n+ 1 Communicator.kt\npowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl\n*L\n230#1:265\n230#1:266,3\n236#1:269\n236#1:270,3\n259#1:273,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J\u000e\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u000e\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001cH\u0016J\u000e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u000e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001dH\u0016J\u000e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001dH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0008\u0010\'\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0018H\u0016J\u0016\u0010.\u001a\u00020%2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001cH\u0016J\u0018\u00100\u001a\u00020%2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\u001cH\u0016J\u0008\u00103\u001a\u00020%H\u0016J\u0008\u00104\u001a\u00020%H\u0016J\u0008\u00105\u001a\u00020%H\u0016J\u0010\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\u000eH\u0016R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00180\u00180\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00130\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0013`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "connectionPreference",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;",
        "bleCommunicationTechnology",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;",
        "bleScanningTechnology",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;",
        "(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V",
        "connectedDevices",
        "Ljava/util/HashMap;",
        "",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;",
        "Lkotlin/collections/HashMap;",
        "connectedDevicesChange",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "kotlin.jvm.PlatformType",
        "connectionDisposables",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "messageOut",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
        "scannedDeviceChange",
        "scannedDevices",
        "scannedDisposables",
        "",
        "Lio/reactivex/Observable;",
        "defaultConnectedDevice",
        "disconnectedDevicesChange",
        "foundDevices",
        "foundDevicesChange",
        "lostDevicesChange",
        "messageOutput",
        "refreshConnection",
        "",
        "uid",
        "releaseScanningResources",
        "resubscribeCharacteristics",
        "Lio/reactivex/Completable;",
        "protocolType",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;",
        "sendMessage",
        "message",
        "startConnection",
        "devicesToConnect",
        "startScanning",
        "scanFilters",
        "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
        "stopConnection",
        "stopScanning",
        "unpairConnectedDevices",
        "unpairDevice",
        "bluetoothAddress",
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
.field private final bleCommunicationTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

.field private final bleScanningTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

.field private final connectedDevices:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final connectedDevicesChange:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final connectionDisposables:Lio/reactivex/disposables/CompositeDisposable;

.field private final messageOut:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation
.end field

.field private final scannedDeviceChange:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final scannedDevices:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final scannedDisposables:Lio/reactivex/disposables/CompositeDisposable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "connectionPreference"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bleCommunicationTechnology"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bleScanningTechnology"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleCommunicationTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    .line 105
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleScanningTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    .line 118
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    .line 120
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDevices:Ljava/util/HashMap;

    .line 122
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<CommunicationMessage>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->messageOut:Lio/reactivex/subjects/PublishSubject;

    .line 123
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectionDisposables:Lio/reactivex/disposables/CompositeDisposable;

    .line 125
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDisposables:Lio/reactivex/disposables/CompositeDisposable;

    .line 127
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<DeviceInfo>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevicesChange:Lio/reactivex/subjects/PublishSubject;

    .line 128
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDeviceChange:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    .line 104
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x7c

    const/4 v10, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolCreator;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleConnectionOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/BleAccessoryCreatorOperation;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    and-int/lit8 v1, p5, 0x8

    if-eqz v1, :cond_1

    .line 105
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x1e

    const/4 v9, 0x0

    move-object v2, v1

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;-><init>(Landroid/content/Context;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, p0

    move-object v4, p2

    goto :goto_1

    :cond_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v1, p4

    .line 102
    :goto_1
    invoke-direct {p0, p1, p2, v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;-><init>(Landroid/content/Context;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/operations/ConnectionPreference;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V

    return-void
.end method

.method private static final connectedDevicesChange$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final disconnectedDevicesChange$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$3LYjFY5A8_0heI0O7iTwn5b5ucs(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->lostDevicesChange$lambda-17(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$5C2GRpau2-Y28csHfChGMVDizFM(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$5RTkW2rWl7YPXru35DEslFcyUPg(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$63Vyxp6g8qUGqcVtrbo4HRa8Ibs(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startScanning$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$6PfGVrsMe2pssK4Ve42dSl9vjBs(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startScanning$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$HPy3jNxJK95pOwcwvohknGXzjvI(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevicesChange$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$JjnBLwdZBYaXrYAagAWGQKXrFXE(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->sendMessage$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZcYsXvQzJ4NcZded5t1LBjdgrkA(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-1(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$b4-d8hQNqOejM0Zr5GYl8H2bk7g(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->sendMessage$lambda-12$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$cNNZ8BWFfCN9hFhFzff3whinn4s(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    return-void
.end method

.method public static synthetic lambda$f-HLo2r1Uo1JH5_jCdlPUE8Qn0Q(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->sendMessage$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$lt2gCwVen2iRbGD9Pu-tJMvjHQc(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$p1L-VjzqNWmGyRvUJr08RvM8I6Q(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->disconnectedDevicesChange$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$skgDTm9d3xWygPVah3IIZr5BpVk(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startScanning$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->startConnection$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final lostDevicesChange$lambda-17(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    return p0
.end method

.method private static final sendMessage$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/CompletableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    .line 216
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "Device not initialized"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v0

    .line 217
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$b4-d8hQNqOejM0Zr5GYl8H2bk7g;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$b4-d8hQNqOejM0Zr5GYl8H2bk7g;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p1

    .line 220
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$f-HLo2r1Uo1JH5_jCdlPUE8Qn0Q;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$f-HLo2r1Uo1JH5_jCdlPUE8Qn0Q;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Completable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    goto :goto_1

    .line 215
    :cond_1
    move-object p0, v0

    check-cast p0, Lio/reactivex/CompletableSource;

    :goto_1
    return-object p0
.end method

.method private static final sendMessage$lambda-12$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;->getUid()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Message successfully sent to device: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final sendMessage$lambda-12$lambda-11(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "Tried to send message to not connected device, throwing error."

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final startConnection$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lkotlin/Pair;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    if-nez v0, :cond_0

    .line 137
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;

    invoke-direct {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/DeviceImpl;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    .line 138
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    check-cast p0, Ljava/util/Map;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    new-instance p0, Lkotlin/Pair;

    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 141
    :cond_0
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->updateWithAccessory(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    .line 142
    new-instance p0, Lkotlin/Pair;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object p0
.end method

.method private static final startConnection$lambda-1(Lkotlin/Pair;)Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 146
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    return-object p0
.end method

.method private static final startConnection$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->deviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final startConnection$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getConnectionInfos()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 153
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final startConnection$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 13

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDevices:Ljava/util/HashMap;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    if-eqz v0, :cond_0

    const-string v1, "it"

    .line 159
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getProtocolVersion()S

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0xfb

    const/4 v12, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v12}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    .line 161
    :cond_0
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevicesChange:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startConnection$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    invoke-interface {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->messageOutput()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startConnection$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->messageOut:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startScanning$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p0

    return-object p0
.end method

.method private static final startScanning$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDevices:Ljava/util/HashMap;

    check-cast p0, Ljava/util/Map;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final startScanning$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDeviceChange:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public connectedDevices()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 230
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "connectedDevices.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 265
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 266
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 267
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    .line 231
    invoke-interface {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->deviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 268
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public connectedDevicesChange()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 241
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevicesChange:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$HPy3jNxJK95pOwcwvohknGXzjvI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$HPy3jNxJK95pOwcwvohknGXzjvI;

    .line 242
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "connectedDevicesChange\n            .filter { it.connectionInfos.isNotEmpty() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 2

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "connectedDevices.entries"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->deviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v1

    :goto_0
    return-object v1
.end method

.method public disconnectedDevicesChange()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 245
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevicesChange:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$p1L-VjzqNWmGyRvUJr08RvM8I6Q;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$p1L-VjzqNWmGyRvUJr08RvM8I6Q;

    .line 246
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "connectedDevicesChange\n            .filter { it.connectionInfos.isEmpty() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public foundDevices()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 236
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDevices:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "scannedDevices.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 269
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 270
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 271
    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 237
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 272
    :cond_0
    check-cast v1, Ljava/util/List;

    return-object v1
.end method

.method public foundDevicesChange()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 249
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDeviceChange:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 102
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public lostDevicesChange()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 251
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDeviceChange:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$3LYjFY5A8_0heI0O7iTwn5b5ucs;

    .line 252
    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "scannedDeviceChange\n            .filter { it.connectionInfos.isEmpty() }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public messageOutput()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;",
            ">;"
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->messageOut:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public refreshConnection(Ljava/lang/String;)V
    .locals 1

    const-string v0, "uid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->refresh()V

    :goto_0
    return-void
.end method

.method public releaseScanningResources()V
    .locals 2

    .line 207
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleScanningTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->stopMonitoring(Z)V

    .line 208
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public resubscribeCharacteristics(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Completable;
    .locals 2

    const-string v0, "protocolType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "connectedDevices.entries"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Device;->resubscribeCharacteristics(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/ProtocolType;)Lio/reactivex/Completable;

    move-result-object v1

    :goto_0
    if-nez v1, :cond_2

    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v1

    const-string p1, "complete()"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-object v1
.end method

.method public sendMessage(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$JjnBLwdZBYaXrYAagAWGQKXrFXE;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$JjnBLwdZBYaXrYAagAWGQKXrFXE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicationMessage;)V

    invoke-static {v0}, Lio/reactivex/Completable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "defer {\n\n        connectedDevices[message.uid]?.sendMessage(message)\n                ?: Completable.error(Throwable(\"Device not initialized\"))\n                        .doOnComplete {\n                            debug(\"Message successfully sent to device: ${message.uid}\")\n                        }\n                        .doOnError {\n                            error(\"Tried to send message to not connected device, throwing error.\", it)\n                        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public startConnection(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "devicesToConnect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->stopConnection()V

    .line 132
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleCommunicationTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    .line 133
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->accessoryStatus()Lio/reactivex/Observable;

    move-result-object v0

    .line 134
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$xZLCLrKLvgeDpf_Qa3JZ_a7aiSA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$ZcYsXvQzJ4NcZded5t1LBjdgrkA;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$ZcYsXvQzJ4NcZded5t1LBjdgrkA;

    .line 146
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/ConnectableObservable;

    move-result-object v0

    .line 149
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectionDisposables:Lio/reactivex/disposables/CompositeDisposable;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$KhIEmYfGzvBn1L7-ZSaJ-E1wDOk;

    .line 150
    invoke-virtual {v0, v2}, Lio/reactivex/observables/ConnectableObservable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 151
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$5C2GRpau2-Y28csHfChGMVDizFM;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$5C2GRpau2-Y28csHfChGMVDizFM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v2

    .line 156
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$lt2gCwVen2iRbGD9Pu-tJMvjHQc;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$lt2gCwVen2iRbGD9Pu-tJMvjHQc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v2

    .line 149
    invoke-virtual {v1, v2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 164
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectionDisposables:Lio/reactivex/disposables/CompositeDisposable;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$5RTkW2rWl7YPXru35DEslFcyUPg;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$5RTkW2rWl7YPXru35DEslFcyUPg;

    .line 165
    invoke-virtual {v0, v2}, Lio/reactivex/observables/ConnectableObservable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v2

    .line 166
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$cNNZ8BWFfCN9hFhFzff3whinn4s;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$cNNZ8BWFfCN9hFhFzff3whinn4s;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v2

    .line 164
    invoke-virtual {v1, v2}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 171
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectionDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/observables/ConnectableObservable;->connect()Lio/reactivex/disposables/Disposable;

    move-result-object v0

    invoke-virtual {v1, v0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 173
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleCommunicationTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;->startMonitoring(Ljava/util/List;)V

    return-void
.end method

.method public startScanning(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;)V"
        }
    .end annotation

    .line 183
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->stopScanning()V

    .line 184
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDisposables:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleScanningTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    .line 185
    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryStatus()Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$skgDTm9d3xWygPVah3IIZr5BpVk;

    .line 186
    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 187
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$6PfGVrsMe2pssK4Ve42dSl9vjBs;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$6PfGVrsMe2pssK4Ve42dSl9vjBs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v1

    .line 190
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$63Vyxp6g8qUGqcVtrbo4HRa8Ibs;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/-$$Lambda$CommunicatorImpl$63Vyxp6g8qUGqcVtrbo4HRa8Ibs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 184
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 194
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleScanningTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    invoke-virtual {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring(Ljava/util/List;)V

    return-void
.end method

.method public stopConnection()V
    .locals 4

    .line 178
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleCommunicationTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleCommunicationTechnology;

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology$DefaultImpls;->stopMonitoring$default(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;ZILjava/lang/Object;)V

    .line 179
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectionDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public stopScanning()V
    .locals 2

    .line 199
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->bleScanningTechnology:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->stopMonitoring(Z)V

    .line 200
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->scannedDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method

.method public unpairConnectedDevices()V
    .locals 2

    .line 259
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->connectedDevices:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    .line 273
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 260
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/CommunicatorImpl;->unpairDevice(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public unpairDevice(Ljava/lang/String;)V
    .locals 1

    const-string v0, "bluetoothAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    invoke-static {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/UnpairController;->unPairDevice(Ljava/lang/String;)V

    return-void
.end method
