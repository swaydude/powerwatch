.class Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;
.super Ljava/lang/Object;
.source "NotificationAndIndicationManager.java"


# annotations
.annotation runtime Lcom/polidea/rxandroidble2/internal/connection/ConnectionScope;
.end annotation


# static fields
.field static final CLIENT_CHARACTERISTIC_CONFIG_UUID:Ljava/util/UUID;


# instance fields
.field private final activeNotificationObservableMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/polidea/rxandroidble2/internal/util/CharacteristicNotificationId;",
            "Lcom/polidea/rxandroidble2/internal/util/ActiveCharacteristicNotification;",
            ">;"
        }
    .end annotation
.end field

.field private final bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

.field private final configDisable:[B

.field private final configEnableIndication:[B

.field private final configEnableNotification:[B

.field private final descriptorWriter:Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;

.field private final gattCallback:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    .line 43
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->CLIENT_CHARACTERISTIC_CONFIG_UUID:Ljava/util/UUID;

    return-void
.end method

.method constructor <init>([B[B[BLandroid/bluetooth/BluetoothGatt;Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;)V
    .locals 1
    .param p1    # [B
        .annotation runtime Lbleshadow/javax/inject/Named;
            value = "enable-notification-value"
        .end annotation
    .end param
    .param p2    # [B
        .annotation runtime Lbleshadow/javax/inject/Named;
            value = "enable-indication-value"
        .end annotation
    .end param
    .param p3    # [B
        .annotation runtime Lbleshadow/javax/inject/Named;
            value = "disable-notification-value"
        .end annotation
    .end param
    .annotation runtime Lbleshadow/javax/inject/Inject;
    .end annotation

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->activeNotificationObservableMap:Ljava/util/Map;

    .line 63
    iput-object p1, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->configEnableNotification:[B

    .line 64
    iput-object p2, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->configEnableIndication:[B

    .line 65
    iput-object p3, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->configDisable:[B

    .line 66
    iput-object p4, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    .line 67
    iput-object p5, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->gattCallback:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    .line 68
    iput-object p6, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->descriptorWriter:Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;

    return-void
.end method

.method static synthetic access$000(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)Ljava/util/Map;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->activeNotificationObservableMap:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic access$100(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)[B
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->configEnableIndication:[B

    return-object p0
.end method

.method static synthetic access$1000(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/util/CharacteristicNotificationId;)Lio/reactivex/Observable;
    .locals 0

    .line 41
    invoke-static {p0, p1}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->observeOnCharacteristicChangeCallbacks(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/util/CharacteristicNotificationId;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$1100(Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;[B)Lio/reactivex/Completable;
    .locals 0

    .line 41
    invoke-static {p0, p1, p2}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->writeClientCharacteristicConfig(Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;[B)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)[B
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->configEnableNotification:[B

    return-object p0
.end method

.method static synthetic access$300(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->gattCallback:Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;

    return-object p0
.end method

.method static synthetic access$400(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->descriptorWriter:Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;

    return-object p0
.end method

.method static synthetic access$500(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)[B
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->configDisable:[B

    return-object p0
.end method

.method static synthetic access$600(Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;Landroid/bluetooth/BluetoothGattCharacteristic;[BLcom/polidea/rxandroidble2/NotificationSetupMode;)Lio/reactivex/CompletableTransformer;
    .locals 0

    .line 41
    invoke-static {p0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->teardownModeTransformer(Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;Landroid/bluetooth/BluetoothGattCharacteristic;[BLcom/polidea/rxandroidble2/NotificationSetupMode;)Lio/reactivex/CompletableTransformer;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$700(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 41
    iget-object p0, p0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->bluetoothGatt:Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method

.method static synthetic access$800(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lio/reactivex/Completable;
    .locals 0

    .line 41
    invoke-static {p0, p1, p2}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$900(Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;Landroid/bluetooth/BluetoothGattCharacteristic;[BLcom/polidea/rxandroidble2/NotificationSetupMode;)Lio/reactivex/ObservableTransformer;
    .locals 0

    .line 41
    invoke-static {p0, p1, p2, p3}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->setupModeTransformer(Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;Landroid/bluetooth/BluetoothGattCharacteristic;[BLcom/polidea/rxandroidble2/NotificationSetupMode;)Lio/reactivex/ObservableTransformer;

    move-result-object p0

    return-object p0
.end method

.method private static observeOnCharacteristicChangeCallbacks(Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;Lcom/polidea/rxandroidble2/internal/util/CharacteristicNotificationId;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;",
            "Lcom/polidea/rxandroidble2/internal/util/CharacteristicNotificationId;",
            ")",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 207
    invoke-virtual {p0}, Lcom/polidea/rxandroidble2/internal/connection/RxBleGattCallback;->getOnCharacteristicChanged()Lio/reactivex/Observable;

    move-result-object p0

    new-instance v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$6;

    invoke-direct {v0, p1}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$6;-><init>(Lcom/polidea/rxandroidble2/internal/util/CharacteristicNotificationId;)V

    .line 208
    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p0

    new-instance p1, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$5;

    invoke-direct {p1}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$5;-><init>()V

    .line 214
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static setCharacteristicNotification(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)Lio/reactivex/Completable;
    .locals 1

    .line 139
    new-instance v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$2;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Z)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method

.method private static setupModeTransformer(Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;Landroid/bluetooth/BluetoothGattCharacteristic;[BLcom/polidea/rxandroidble2/NotificationSetupMode;)Lio/reactivex/ObservableTransformer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "[B",
            "Lcom/polidea/rxandroidble2/NotificationSetupMode;",
            ")",
            "Lio/reactivex/ObservableTransformer<",
            "Lio/reactivex/Observable<",
            "[B>;",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    .line 158
    new-instance v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$3;

    invoke-direct {v0, p3, p1, p0, p2}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$3;-><init>(Lcom/polidea/rxandroidble2/NotificationSetupMode;Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;[B)V

    return-object v0
.end method

.method private static teardownModeTransformer(Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;Landroid/bluetooth/BluetoothGattCharacteristic;[BLcom/polidea/rxandroidble2/NotificationSetupMode;)Lio/reactivex/CompletableTransformer;
    .locals 1

    .line 192
    new-instance v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$4;

    invoke-direct {v0, p3, p1, p0, p2}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$4;-><init>(Lcom/polidea/rxandroidble2/NotificationSetupMode;Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;[B)V

    return-object v0
.end method

.method private static writeClientCharacteristicConfig(Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;[B)Lio/reactivex/Completable;
    .locals 1

    .line 228
    sget-object v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;->CLIENT_CHARACTERISTIC_CONFIG_UUID:Ljava/util/UUID;

    invoke-virtual {p0, v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    if-nez v0, :cond_0

    .line 230
    new-instance p1, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/polidea/rxandroidble2/exceptions/BleCannotSetCharacteristicNotificationException;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;ILjava/lang/Throwable;)V

    invoke-static {p1}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0

    .line 237
    :cond_0
    invoke-virtual {p1, v0, p2}, Lcom/polidea/rxandroidble2/internal/connection/DescriptorWriter;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lio/reactivex/Completable;

    move-result-object p1

    new-instance p2, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$7;

    invoke-direct {p2, p0}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$7;-><init>(Landroid/bluetooth/BluetoothGattCharacteristic;)V

    .line 238
    invoke-virtual {p1, p2}, Lio/reactivex/Completable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method setupServerInitiatedCharacteristicRead(Landroid/bluetooth/BluetoothGattCharacteristic;Lcom/polidea/rxandroidble2/NotificationSetupMode;Z)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "Lcom/polidea/rxandroidble2/NotificationSetupMode;",
            "Z)",
            "Lio/reactivex/Observable<",
            "Lio/reactivex/Observable<",
            "[B>;>;"
        }
    .end annotation

    .line 74
    new-instance v0, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$1;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager$1;-><init>(Lcom/polidea/rxandroidble2/internal/connection/NotificationAndIndicationManager;Landroid/bluetooth/BluetoothGattCharacteristic;ZLcom/polidea/rxandroidble2/NotificationSetupMode;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
