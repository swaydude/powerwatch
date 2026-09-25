.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;
.super Ljava/lang/Object;
.source "BleScanningTechnology.kt"

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
        "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
        ">;>;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleScanningTechnology.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleScanningTechnology.kt\npowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1849#2,2:112\n*S KotlinDebug\n*F\n+ 1 BleScanningTechnology.kt\npowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology\n*L\n73#1:112,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleTechnology;",
        "",
        "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "rxBleClient",
        "Lcom/polidea/rxandroidble2/RxBleClient;",
        "bluetoothScanner",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;",
        "bleScanner",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;",
        "accessoryProvider",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;",
        "(Landroid/content/Context;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V",
        "getContext",
        "()Landroid/content/Context;",
        "monitorDisposables",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "accessoryStatus",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;",
        "addAccessory",
        "",
        "accessoryID",
        "",
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
.field private final accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

.field private final bleScanner:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;

.field private final bluetoothScanner:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;

.field private final context:Landroid/content/Context;

.field private final monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

.field private final rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxBleClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothScanner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleScanner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessoryProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->context:Landroid/content/Context;

    .line 19
    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;

    .line 20
    iput-object p3, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->bluetoothScanner:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;

    .line 21
    iput-object p4, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->bleScanner:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;

    .line 22
    iput-object p5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    .line 26
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 19
    invoke-static {p1}, Lcom/polidea/rxandroidble2/RxBleClient;->create(Landroid/content/Context;)Lcom/polidea/rxandroidble2/RxBleClient;

    move-result-object p2

    const-string p7, "<init>"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 20
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;

    const/4 p3, 0x0

    const/4 p7, 0x2

    invoke-direct {p2, p1, p3, p7, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, p2

    check-cast p3, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 21
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;

    invoke-direct {p2, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;-><init>(Lcom/polidea/rxandroidble2/RxBleClient;)V

    move-object p4, p2

    check-cast p4, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 22
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;

    invoke-direct {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProviderImpl;-><init>()V

    move-object p5, p2

    check-cast p5, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    :cond_3
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    .line 17
    invoke-direct/range {v0 .. v5}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;-><init>(Landroid/content/Context;Lcom/polidea/rxandroidble2/RxBleClient;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;)V

    return-void
.end method

.method public static synthetic lambda$08QEOWXhCEpynGZIuPoZsmqWH_A(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)V

    return-void
.end method

.method public static synthetic lambda$1Htz1OTzOKZ4VovTt8VPOxbsY9I(Landroid/bluetooth/BluetoothDevice;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-0(Landroid/bluetooth/BluetoothDevice;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Fl1UnmsVdwAd_WLp1CtVgUccdI8(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    return-void
.end method

.method public static synthetic lambda$QPKL0YsXF_TOe1xKHotq0QbOltY(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$ntmpL5E3ljs9dgDG4N5VupvGQFk(Lcom/polidea/rxandroidble2/scan/ScanResult;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-1(Lcom/polidea/rxandroidble2/scan/ScanResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$nyvGdlWHs7AI5dbuvOF77wzi3kw(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$rIviZFiBhDjYtQNAvN4GsEscReM(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Z

    move-result p0

    return p0
.end method

.method private static final startMonitoring$lambda-0(Landroid/bluetooth/BluetoothDevice;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 12

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 47
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v6

    .line 48
    new-instance p0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    const-string v0, "deviceID"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceName"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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

    .line 49
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_SCANNING:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-direct {v0, p0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V

    return-object v0
.end method

.method private static final startMonitoring$lambda-1(Lcom/polidea/rxandroidble2/scan/ScanResult;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/scan/ScanResult;->getBleDevice()Lcom/polidea/rxandroidble2/RxBleDevice;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lcom/polidea/rxandroidble2/RxBleDevice;->getBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method private static final startMonitoring$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)V
    .locals 2

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string p1, "Device PW2 found, extracting advertising information..."

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final startMonitoring$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lcom/polidea/rxandroidble2/scan/ScanResult;)Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "scanResult"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual/range {p1 .. p1}, Lcom/polidea/rxandroidble2/scan/ScanResult;->getScanRecord()Lcom/polidea/rxandroidble2/scan/ScanRecord;

    move-result-object v3

    invoke-interface {v3}, Lcom/polidea/rxandroidble2/scan/ScanRecord;->getManufacturerSpecificData()Landroid/util/SparseArray;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 60
    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ge v5, v6, :cond_0

    .line 61
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    .line 62
    invoke-virtual {v3, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    .line 63
    array-length v10, v9

    add-int/2addr v10, v7

    new-array v10, v10, [B

    and-int/lit16 v11, v6, 0xff

    int-to-byte v11, v11

    .line 64
    aput-byte v11, v10, v4

    shr-int/lit8 v6, v6, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-byte v6, v6

    .line 65
    aput-byte v6, v10, v8

    .line 66
    array-length v6, v9

    invoke-static {v9, v4, v10, v7, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    .line 73
    check-cast v1, Ljava/lang/Iterable;

    .line 112
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v12, 0x1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 74
    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v6

    .line 76
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    int-to-short v12, v5

    .line 77
    move-object v5, v0

    check-cast v5, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const/4 v9, 0x0

    invoke-static {v3, v4, v8, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->formatToString$default([BZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v10, "Data: "

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3, v9, v7, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PairingCode: "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0xa

    invoke-static {v10}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v11

    invoke-static {v11}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v11

    invoke-static {v6, v11}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v11

    const-string v13, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "\nProtocolVersion: "

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    invoke-static {v10}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v10

    invoke-static {v10}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v10

    invoke-static {v12, v10}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3, v9, v7, v9}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    move v3, v6

    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/polidea/rxandroidble2/scan/ScanResult;->getBleDevice()Lcom/polidea/rxandroidble2/RxBleDevice;

    move-result-object v0

    invoke-interface {v0}, Lcom/polidea/rxandroidble2/RxBleDevice;->getBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v10

    .line 83
    invoke-virtual/range {p1 .. p1}, Lcom/polidea/rxandroidble2/scan/ScanResult;->getBleDevice()Lcom/polidea/rxandroidble2/RxBleDevice;

    move-result-object v0

    invoke-interface {v0}, Lcom/polidea/rxandroidble2/RxBleDevice;->getBluetoothDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "Powerwatch"

    :cond_2
    move-object v14, v0

    .line 85
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    const-string v1, "deviceID"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xe8

    const/16 v19, 0x0

    move-object v9, v0

    invoke-direct/range {v9 .. v19}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;->BLE_SCANNING:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;

    invoke-direct {v1, v0, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Ljava/util/List;Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/TechnologyType;)V

    return-object v1
.end method

.method private static final startMonitoring$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)Z
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accessory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->contains(Ljava/lang/String;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final startMonitoring$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Accessory created, adding it into map and pushing to communicator.."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 97
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;->getDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->add(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/Accessory;)V

    return-void
.end method

.method private static final startMonitoring$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;Ljava/lang/Throwable;)V
    .locals 7

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 100
    move-object v1, p0

    check-cast v1, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v2, "StartMonitoring channel error occurred."

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->error$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Object;ILjava/lang/Object;)V

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

    .line 36
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->getAccessoryChange()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public addAccessory(Ljava/lang/String;)V
    .locals 2

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
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

    .line 18
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 17
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public removeAccessory(Ljava/lang/String;)V
    .locals 1

    const-string v0, "accessoryID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {v0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->clear(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic startMonitoring(Ljava/lang/Object;)V
    .locals 0

    .line 17
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->startMonitoring(Ljava/util/List;)V

    return-void
.end method

.method public startMonitoring(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/polidea/rxandroidble2/scan/ScanFilter;",
            ">;)V"
        }
    .end annotation

    .line 40
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Start monitoring called, starting bluetooth/ble scanning"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 41
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x5

    const/4 v9, 0x0

    move-object v4, v2

    move-object v6, p1

    invoke-direct/range {v4 .. v9}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;Ljava/util/List;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    :cond_0
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p1}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    if-nez v2, :cond_1

    .line 44
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->bluetoothScanner:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;->devices()Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$1Htz1OTzOKZ4VovTt8VPOxbsY9I;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$1Htz1OTzOKZ4VovTt8VPOxbsY9I;

    .line 45
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    .line 51
    :cond_1
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->bleScanner:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;

    invoke-interface {p1, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;->scan(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$ntmpL5E3ljs9dgDG4N5VupvGQFk;

    .line 52
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 53
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$08QEOWXhCEpynGZIuPoZsmqWH_A;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$08QEOWXhCEpynGZIuPoZsmqWH_A;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 56
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$nyvGdlWHs7AI5dbuvOF77wzi3kw;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$nyvGdlWHs7AI5dbuvOF77wzi3kw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 90
    :goto_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    .line 92
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$rIviZFiBhDjYtQNAvN4GsEscReM;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$rIviZFiBhDjYtQNAvN4GsEscReM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 95
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$Fl1UnmsVdwAd_WLp1CtVgUccdI8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$Fl1UnmsVdwAd_WLp1CtVgUccdI8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V

    .line 98
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$QPKL0YsXF_TOe1xKHotq0QbOltY;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/-$$Lambda$BleScanningTechnology$QPKL0YsXF_TOe1xKHotq0QbOltY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;)V

    .line 95
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p1

    .line 90
    invoke-virtual {v0, p1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method public stopMonitoring(Z)V
    .locals 1

    .line 29
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->monitorDisposables:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    if-eqz p1, :cond_0

    .line 31
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/BleScanningTechnology;->accessoryProvider:Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;

    invoke-interface {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/technologies/AccessoryProvider;->clearAll()V

    :cond_0
    return-void
.end method
