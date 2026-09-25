.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;
.super Ljava/lang/Object;
.source "DeviceManager.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManager.kt\npowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1849#2,2:255\n*S KotlinDebug\n*F\n+ 1 DeviceManager.kt\npowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl\n*L\n230#1:255,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0018H\u0016J\u0008\u0010+\u001a\u00020\'H\u0016J\u0008\u0010,\u001a\u00020\'H\u0016J\u0008\u0010-\u001a\u00020%H\u0002J \u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00180/2\u0006\u00100\u001a\u00020\u00182\u0008\u00101\u001a\u0004\u0018\u000102H\u0016J\u0008\u00103\u001a\u00020\'H\u0002J\u0008\u00104\u001a\u00020\'H\u0002R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u000c\u0012\n \u001b*\u0004\u0018\u00010\u00180\u00180\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u000c\u0012\n \u001b*\u0004\u0018\u00010\u001e0\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManager;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "deviceRepository",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;",
        "deviceProtocolStorage",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;",
        "communicator",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;",
        "notificationManager",
        "Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;",
        "bluetoothProvider",
        "Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;",
        "deviceCommunicationQueuer",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "context",
        "Landroid/content/Context;",
        "(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;)V",
        "compositeDisposable",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "connectionCompositeDisposable",
        "connectionRunning",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "defaultDisconnectedDeviceInfo",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
        "deviceInfoOutput",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "kotlin.jvm.PlatformType",
        "monitoringEvent",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;",
        "monitoringEvents",
        "Lio/reactivex/Observable;",
        "getMonitoringEvents",
        "()Lio/reactivex/Observable;",
        "connect",
        "forceRefresh",
        "",
        "connectTo",
        "",
        "id",
        "",
        "defaultDevice",
        "destroy",
        "init",
        "isMotorola",
        "readDeviceInfo",
        "Lio/reactivex/Single;",
        "deviceInfo",
        "device",
        "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
        "startConnection",
        "stopConnection",
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
.field private final bluetoothProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

.field private final communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

.field private final compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final connectionCompositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

.field private final connectionRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final context:Landroid/content/Context;

# PATCHED: retry counter for the bootstrap re-trigger in startConnection$lambda-8
.field private bootstrapRetryCount:I

.field private final defaultDisconnectedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

.field private final deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

.field private final deviceInfoOutput:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

.field private final deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

.field private final monitoringEvent:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;


# direct methods
.method public constructor <init>(Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;Landroid/content/Context;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    const-string v8, "deviceRepository"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "deviceProtocolStorage"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "communicator"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "notificationManager"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "bluetoothProvider"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "deviceCommunicationQueuer"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "context"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    .line 56
    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    .line 57
    iput-object v3, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    .line 58
    iput-object v4, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    .line 59
    iput-object v5, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->bluetoothProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    .line 60
    iput-object v6, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    .line 61
    iput-object v7, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->context:Landroid/content/Context;

    .line 64
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    const-string v10, ""

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v14, ""

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0xee

    const/16 v19, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v19}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/Short;SILjava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;Ljava/util/List;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->defaultDisconnectedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    .line 66
    new-instance v2, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v2}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 67
    new-instance v2, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v2}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionCompositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 69
    invoke-static {v1}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v1

    const-string v2, "createDefault(defaultDisconnectedDeviceInfo)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceInfoOutput:Lio/reactivex/subjects/BehaviorSubject;

    .line 70
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v1

    const-string v2, "create<MonitoringEvent>()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->monitoringEvent:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private static final connect$lambda-1(ZLpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 120
    invoke-direct {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->isMotorola()Z

    move-result p0

    if-nez p0, :cond_0

    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->refreshConnection(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection()V

    goto :goto_0

    .line 87
    :cond_0
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 88
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->stopConnection()V

    :cond_1
    :goto_0
    return-void
.end method

.method private final isMotorola()Z
    .locals 5

    .line 112
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 113
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    move-object v2, p0

    check-cast v2, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Testing for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", os - "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v2, v1, v3, v4, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v1, "manufacturer"

    .line 115
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    const-string v1, "Motorola"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    return v0
.end method

.method public static synthetic lambda$4yNMYEPm6puJP_63ZPeDGDhj_NI(Ljava/lang/Throwable;Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-11$lambda-9(Ljava/lang/Throwable;Ljava/lang/Integer;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$8IqZpi0WP15sUEAFVNvAuZg01eY(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$CkNCoiJ0fY0Q0s72wY_B6YdntjU(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$DIMulxrDu4kpgSWsmc9UF1GWAyM(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$Fb39-sEfutUfkmJZbJZ4q1DQzIg(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$H30gkb1Jmn0RfbJczjEHuIhlgVA(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->init$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)V

    return-void
.end method

.method public static synthetic lambda$HGnzI9WyZ7yifaNp-SGhiYtE9Zs(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-6$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$J2yeyg9C5yy0-EymV6_ufcAxjko(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$Jarv623cIgHMoBH9FjHaoOgk4tc(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$MBAuDivaAK6YEFVi8AQHqBizyJ0(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$Mi0TyWDWhuxcvRoRNaBGINQ1D6U(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-11(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$NFSuBBruxsYgKXGEXxoYzS5uvas(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-14$lambda-13$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    return-void
.end method

.method public static synthetic lambda$Pf-RvvOlAy1yHdjPWEUgXSxvtGw(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$VOhN7IZSPYid6_i5adm6w2C7ihI(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$_ILeUIQAirEWYIQ3wusLw73Bdm8(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/SingleSource;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-20(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/SingleSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$_mGFyJODzalfnq8Fup4QsWy1R8k(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-21(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$b2rx5uaztrizl0ph1frb2q7ci1Q(ZLpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connect$lambda-1(ZLpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V

    return-void
.end method

.method public static synthetic lambda$wG2Pq4Ar8Nvf1bbq_u33WDdPCps(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    return-void
.end method

.method public static synthetic lambda$xeZR8OUzDhN0iaINlFWExiuHttM(Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo$lambda-11$lambda-10(Lkotlin/Pair;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final readDeviceInfo$lambda-11(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "errorObs"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x6

    .line 185
    invoke-static {v0, v1}, Lio/reactivex/Observable;->range(II)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$4yNMYEPm6puJP_63ZPeDGDhj_NI;

    .line 184
    invoke-virtual {p0, v0, v1}, Lio/reactivex/Observable;->zipWith(Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$xeZR8OUzDhN0iaINlFWExiuHttM;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$xeZR8OUzDhN0iaINlFWExiuHttM;

    .line 187
    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readDeviceInfo$lambda-11$lambda-10(Lkotlin/Pair;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "countPair"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionThrowable;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 190
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionReportThrowable;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionThrowable;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionThrowable;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionReportThrowable;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V

    check-cast v0, Ljava/lang/Throwable;

    .line 189
    invoke-static {v0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 193
    :cond_0
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    int-to-long v0, p0

    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p0}, Lio/reactivex/Observable;->timer(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readDeviceInfo$lambda-11$lambda-9(Ljava/lang/Throwable;Ljava/lang/Integer;)Lkotlin/Pair;
    .locals 1

    const-string v0, "t"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    new-instance v0, Lkotlin/Pair;

    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final readDeviceInfo$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)Lio/reactivex/Observable;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$DIMulxrDu4kpgSWsmc9UF1GWAyM;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$DIMulxrDu4kpgSWsmc9UF1GWAyM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final readDeviceInfo$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    instance-of v0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionReportThrowable;

    if-eqz v0, :cond_0

    .line 201
    move-object v0, p1

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionReportThrowable;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/InvalidVersionReportThrowable;->getDataInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x1

    .line 202
    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->take(J)Lio/reactivex/Observable;

    move-result-object v0

    .line 203
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$NFSuBBruxsYgKXGEXxoYzS5uvas;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 210
    :cond_0
    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final readDeviceInfo$lambda-14$lambda-13$lambda-12(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 1

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$throwable"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Give up, return invalid version: "

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p0, p1, p2, v0, p2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final readDeviceInfo$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected error occurred in reading info from watch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final readDeviceInfo$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Firmware version successfully read. FWVersion is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", DIS table: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object p1

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->formatDISTable()Ljava/lang/String;

    move-result-object p1

    .line 217
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private static final readDeviceInfo$lambda-20(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;)Lio/reactivex/SingleSource;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$deviceInfo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "it"

    move-object/from16 v3, p3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_0

    goto :goto_1

    .line 222
    :cond_0
    move-object v6, v2

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    if-eqz v6, :cond_2

    .line 223
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getExtendedDeviceInfo()Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;

    move-result-object v6

    invoke-virtual {v6, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/ExtendedDeviceInfo;->setFirmwareVersion(Ljava/lang/String;)V

    .line 227
    :cond_2
    :goto_1
    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getDisTableVersion()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_3

    .line 228
    :cond_3
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->getMtpVersion()S

    move-result v6

    invoke-virtual {v1, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->setProtocolVersion(S)V

    .line 229
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->getTimestamp()I

    move-result v6

    invoke-virtual {v1, v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->setTime(I)V

    .line 230
    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DISTableVersion;->getSections()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/SectionsInfo;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 255
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;

    .line 231
    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getSectionInfoMap()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->getFontType()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;

    move-result-object v8

    invoke-virtual {v8}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontType;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/FontSectionInfo;->getVersion()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 236
    :cond_4
    :goto_3
    iget-object v2, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceProtocolStorage:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;

    invoke-virtual/range {p1 .. p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v7

    invoke-virtual {v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getGetProtocolVersion()I

    move-result v7

    invoke-virtual {v2, v6, v7}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceProtocolStorage;->saveDeviceProtocolVersion(Ljava/lang/String;I)V

    .line 238
    invoke-static/range {p1 .. p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v2

    const-string v6, "just(deviceInfo)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_7

    .line 239
    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    if-eqz v6, :cond_5

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    const/4 v4, 0x1

    :cond_6
    if-nez v4, :cond_7

    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v4

    invoke-static {v4}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/CommandsKt;->isFirmwareVersionValid(Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 240
    invoke-virtual/range {p2 .. p2}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v6

    invoke-virtual {v6}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    .line 241
    iget-object v0, v0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-virtual/range {p3 .. p3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/DataInfo;->getData()Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;

    move-result-object v2

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/commands/WatchDataInfo;->getFirmwareVersion()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v14, 0x0

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x7af

    const/16 v21, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v7 .. v21}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->copy$default(Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZZZILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;

    move-result-object v2

    invoke-interface {v0, v2, v5}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->save(Ljava/lang/Object;Z)Lio/reactivex/Completable;

    move-result-object v0

    .line 242
    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->toSingleDefault(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object v2

    const-string v0, "deviceRepository.save(device.copy(firmwareVersion = it.data.firmwareVersion!!, shouldSync = true), toCacheOnly = true)\n                                    .toSingleDefault(deviceInfo)"

    .line 241
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    :cond_7
    check-cast v2, Lio/reactivex/SingleSource;

    return-object v2
.end method

.method private static final readDeviceInfo$lambda-21(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected error occurred in storing read info from watch: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->debug$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method

.method private final startConnection()V
    .locals 4

    .line 136
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionCompositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 137
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceRepository:Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/repositories/DeviceRepository;->defaultDevice()Lio/reactivex/Single;

    move-result-object v1

    .line 138
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$wG2Pq4Ar8Nvf1bbq_u33WDdPCps;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$wG2Pq4Ar8Nvf1bbq_u33WDdPCps;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v1

    .line 144
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$CkNCoiJ0fY0Q0s72wY_B6YdntjU;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$CkNCoiJ0fY0Q0s72wY_B6YdntjU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Single;->flatMapObservable(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 170
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$J2yeyg9C5yy0-EymV6_ufcAxjko;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$J2yeyg9C5yy0-EymV6_ufcAxjko;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    .line 172
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$MBAuDivaAK6YEFVi8AQHqBizyJ0;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$MBAuDivaAK6YEFVi8AQHqBizyJ0;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    .line 170
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 176
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->monitoringEvent:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingStarted;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingStarted;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startConnection$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevices()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 141
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;->getBluetoothAddress()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->startConnection(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method private static final startConnection$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/ObservableSource;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 147
    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevicesChange()Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    invoke-static {v0, v1}, Lio/reactivex/Observable;->concat(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "concat(Observable.just(connectedDevice), communicator.connectedDevicesChange())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 148
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->connectedDevicesChange()Lio/reactivex/Observable;

    move-result-object v0

    .line 152
    :goto_0
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;

    invoke-direct {v1, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$HGnzI9WyZ7yifaNp-SGhiYtE9Zs;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 157
    invoke-virtual {p1}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object p1

    .line 158
    invoke-virtual {p1}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object p1

    .line 159
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Fb39-sEfutUfkmJZbJZ4q1DQzIg;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Fb39-sEfutUfkmJZbJZ4q1DQzIg;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    .line 163
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->disconnectedDevicesChange()Lio/reactivex/Observable;

    move-result-object v0

    .line 164
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$VOhN7IZSPYid6_i5adm6w2C7ihI;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$VOhN7IZSPYid6_i5adm6w2C7ihI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    .line 150
    invoke-static {p1, p0}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final startConnection$lambda-6$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)Lio/reactivex/SingleSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-virtual {p0, p2, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->readDeviceInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Single;

    move-result-object p0

    check-cast p0, Lio/reactivex/SingleSource;

    return-object p0
.end method

.method private static final startConnection$lambda-6$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 11

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->context:Landroid/content/Context;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchConnectedTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchConnectedBody()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showWatchConnectedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    iget-object v5, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    iget-object v6, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->context:Landroid/content/Context;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager$DefaultImpls;->showConnectionNotification$default(Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;Landroid/content/Context;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/UIRealtimeDataNotification;ILjava/lang/Object;)V

    return-void
.end method

.method private static final startConnection$lambda-6$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->clear()V

    .line 166
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->context:Landroid/content/Context;

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchDisconnectedTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/main/battery/ResourcesKt;->getWatchDisconnectedBody()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, p1, v1, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->showWatchConnectedMessage(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->context:Landroid/content/Context;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getCONNECT_NOTIFICATION_ID()I

    move-result v0

    invoke-interface {p1, p0, v0}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->dismissNotification(Landroid/content/Context;I)V

    return-void
.end method

.method private static final startConnection$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceInfoOutput:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final startConnection$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection observable died because of error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->wtfError(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 174
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    # --- PATCHED (offline sync fix #1): the one-shot bootstrap stream dies on
    # any error (e.g. the Room device table is still empty at first launch,
    # before "Device saved."), and nothing ever re-runs it -> watch never
    # connects. Re-trigger startConnection() after a short delay, capped at
    # 30 tries (~5 min), so the bootstrap self-heals once the device row
    # exists. ---
    # the check-cast Loggable above re-typed p0 for the verifier - cast back
    # to DeviceManagerImpl before touching its fields/methods
    check-cast p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;

    iget v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->bootstrapRetryCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->bootstrapRetryCount:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_pw_offline_retry_exhausted

    # sleep 10s on the (dead stream) error thread, then re-bootstrap
    # wide (J) param needs BOTH halves in a non-/range invoke register list
    const-wide/32 v0, 0x2710

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    # startConnection() is private -> invoke-direct (no virtual dispatch on
    # private methods in DEX)
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->startConnection()V

    goto :cond_pw_offline_retry_done

    :cond_pw_offline_retry_exhausted

    :cond_pw_offline_retry_done
    return-void
.end method

.method private final stopConnection()V
    .locals 2

    .line 130
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionCompositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 131
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->stopConnection()V

    .line 132
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->monitoringEvent:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingEnded;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent$observingEnded;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public connect(Z)Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceInfoOutput:Lio/reactivex/subjects/BehaviorSubject;

    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;

    invoke-direct {v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$b2rx5uaztrizl0ph1frb2q7ci1Q;-><init>(ZLpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "deviceInfoOutput.doOnNext {\n            if (forceRefresh && !isMotorola()) communicator.refreshConnection(it.uid)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public connectTo(Ljava/lang/String;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
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

.method public defaultDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;
    .locals 1

    .line 97
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->defaultConnectedDevice()Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 3

    .line 101
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->notificationManager:Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->context:Landroid/content/Context;

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;

    invoke-virtual {v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/ConnectionForegroundService$Companion;->getCONNECT_NOTIFICATION_ID()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/localNotifications/NotificationManager;->dismissNotification(Landroid/content/Context;I)V

    .line 102
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionCompositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 103
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 104
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->unpairConnectedDevices()V

    .line 105
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;->stopConnection()V

    .line 106
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceInfoOutput:Lio/reactivex/subjects/BehaviorSubject;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->defaultDisconnectedDeviceInfo:Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->deviceCommunicationQueuer:Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;

    invoke-interface {v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;->clear()V

    return-void
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 55
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public getMonitoringEvents()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/MonitoringEvent;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->monitoringEvent:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public init()V
    .locals 5

    .line 77
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 78
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    .line 79
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->compositeDisposable:Lio/reactivex/disposables/CompositeDisposable;

    .line 80
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->bluetoothProvider:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;

    const/4 v2, 0x2

    new-array v2, v2, [Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v3, 0x0

    .line 81
    sget-object v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Enabled;

    check-cast v4, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    aput-object v4, v2, v3

    sget-object v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState$Disabled;

    check-cast v3, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v1, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothManager;->getChangeState([Lpowerwatch/matrix/com/pwgen2android/shared/host/BluetoothState;)Lio/reactivex/Observable;

    move-result-object v1

    .line 82
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$H30gkb1Jmn0RfbJczjEHuIhlgVA;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$H30gkb1Jmn0RfbJczjEHuIhlgVA;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 92
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->connectionRunning:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    return-void
.end method

.method public readDeviceInfo(Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)Lio/reactivex/Single;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            "Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;",
            ")",
            "Lio/reactivex/Single<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->isGen2()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2DeviceInfoExecutor;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;->communicator:Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2DeviceInfoExecutor;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/communicator/Communicator;Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/BaseDataTransferExecutor;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/protocol/executors/Gen2DeviceInfoExecutor;->readInfo(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Mi0TyWDWhuxcvRoRNaBGINQ1D6U;

    .line 183
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->retryWhen(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 198
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Pf-RvvOlAy1yHdjPWEUgXSxvtGw;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Pf-RvvOlAy1yHdjPWEUgXSxvtGw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->onErrorResumeNext(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 212
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Jarv623cIgHMoBH9FjHaoOgk4tc;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$Jarv623cIgHMoBH9FjHaoOgk4tc;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 215
    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/Single;

    move-result-object v0

    .line 216
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$8IqZpi0WP15sUEAFVNvAuZg01eY;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$8IqZpi0WP15sUEAFVNvAuZg01eY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->doOnSuccess(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object v0

    .line 220
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$_ILeUIQAirEWYIQ3wusLw73Bdm8;

    invoke-direct {v1, p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$_ILeUIQAirEWYIQ3wusLw73Bdm8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/model/DeviceInfo;Lpowerwatch/matrix/com/pwgen2android/shared/data/models/Device;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Single;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Single;

    move-result-object p1

    .line 245
    new-instance p2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$_mGFyJODzalfnq8Fup4QsWy1R8k;

    invoke-direct {p2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceManagerImpl$_mGFyJODzalfnq8Fup4QsWy1R8k;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceManagerImpl;)V

    invoke-virtual {p1, p2}, Lio/reactivex/Single;->doOnError(Lio/reactivex/functions/Consumer;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "Gen2DeviceInfoExecutor(communicator).readInfo(deviceInfo.uid)\n                    .retryWhen { errorObs ->\n                        errorObs.zipWith(\n                                Observable.range(1,6),\n                                BiFunction<Throwable, Int, Pair<Throwable, Int>> { t, counter -> Pair(t, counter) }\n                        ).flatMap { countPair ->\n                            if (countPair.first is InvalidVersionThrowable && countPair.second == 6) {\n                                Observable.error<InvalidVersionReportThrowable>(\n                                        InvalidVersionReportThrowable((countPair.first as InvalidVersionThrowable).dataInfo )\n                                )\n                            } else {\n                                Observable.timer(countPair.second.toLong(), TimeUnit.SECONDS)\n                            }\n\n                        }\n                    }\n                    .onErrorResumeNext(Function {\n                        Observable.just(it).flatMap { throwable ->\n                            if (throwable is InvalidVersionReportThrowable) {\n                                Observable.just<DataInfo>(throwable.dataInfo)\n                                        .take(1)\n                                        .doOnNext { debug(\"Give up, return invalid version: ${throwable.message}\") }\n                            }\n//                            else Observable.just(DataInfo(\n//                                    parsingStarted = false,\n//                                    parsingFinished = true,\n//                                    data = WatchDataInfo(uid = deviceInfo.uid, pid = 4)\n//                            ))\n                            else Observable.error<DataInfo>(throwable)\n                        }\n                    }).doOnError {\n                        debug(\"Unexpected error occurred in reading info from watch: ${it.javaClass.simpleName} + ${it.message}\")\n                    }\n                    .firstOrError()\n                    .doOnSuccess {\n                        info(\"Firmware version successfully read. FWVersion is: ${it.data.firmwareVersion}, \" +\n                                \"DIS table: ${it.data.formatDISTable()}\")\n                    }\n                    .flatMap {\n                        it.data.firmwareVersion?.let { firmwareVersionNotNull ->\n                            if (firmwareVersionNotNull.isNotEmpty()) {\n                                deviceInfo.extendedDeviceInfo.firmwareVersion = firmwareVersionNotNull\n                            }\n                        }\n\n                        it.data.disTableVersion?.let { disVersion ->\n                            deviceInfo.protocolVersion = disVersion.mtpVersion\n                            deviceInfo.time = disVersion.timestamp\n                            disVersion.sections.sections.forEach { section ->\n                                deviceInfo.sectionInfoMap[section.fontType.name] = section.version\n                            }\n                        }\n\n\n                        deviceProtocolStorage.saveDeviceProtocolVersion(deviceInfo.uid, it.data.getProtocolVersion)\n\n                        var result = Single.just(deviceInfo)\n                        if (device != null && !it.data.firmwareVersion.isNullOrEmpty() && it.data.isFirmwareVersionValid() &&\n                                device.firmwareVersion != it.data.firmwareVersion) {\n                            result = deviceRepository.save(device.copy(firmwareVersion = it.data.firmwareVersion!!, shouldSync = true), toCacheOnly = true)\n                                    .toSingleDefault(deviceInfo)\n                        }\n                        result\n                    }.doOnError {\n                        debug(\"Unexpected error occurred in storing read info from watch: ${it.javaClass.simpleName} + ${it.message}\")\n                    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 250
    :cond_0
    invoke-static {p1}, Lio/reactivex/Single;->just(Ljava/lang/Object;)Lio/reactivex/Single;

    move-result-object p1

    const-string p2, "just(deviceInfo)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
