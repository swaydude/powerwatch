.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;
.super Ljava/lang/Object;
.source "BluetoothScanner.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBluetoothScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothScanner.kt\npowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,130:1\n764#2:131\n855#2,2:132\n764#2:134\n855#2:135\n1547#2:136\n1618#2,3:137\n856#2:140\n*S KotlinDebug\n*F\n+ 1 BluetoothScanner.kt\npowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl\n*L\n109#1:131\n109#1:132,2\n113#1:134\n113#1:135\n114#1:136\n114#1:137,3\n113#1:140\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0011H\u0016J\u001c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00112\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u001e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00112\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScanner;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "context",
        "Landroid/content/Context;",
        "bluetoothAdapter",
        "Landroid/bluetooth/BluetoothAdapter;",
        "(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;)V",
        "bluetoothReceiver",
        "Landroid/content/BroadcastReceiver;",
        "foundDevices",
        "Lio/reactivex/subjects/PublishSubject;",
        "Landroid/bluetooth/BluetoothDevice;",
        "kotlin.jvm.PlatformType",
        "intentFilter",
        "Landroid/content/IntentFilter;",
        "devices",
        "Lio/reactivex/Observable;",
        "deviceAddresses",
        "",
        "",
        "scan",
        "Companion",
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


# static fields
.field public static final Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field private final bluetoothReceiver:Landroid/content/BroadcastReceiver;

.field private final context:Landroid/content/Context;

.field private final foundDevices:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private final intentFilter:Landroid/content/IntentFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->Companion:Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$Companion;

    .line 127
    const-class v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->context:Landroid/content/Context;

    iput-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    .line 36
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string p2, "create<BluetoothDevice>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->foundDevices:Lio/reactivex/subjects/PublishSubject;

    .line 37
    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->intentFilter:Landroid/content/IntentFilter;

    const-string p2, "android.bluetooth.device.action.FOUND"

    .line 40
    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p2, "android.bluetooth.adapter.action.DISCOVERY_FINISHED"

    .line 41
    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string p2, "android.bluetooth.adapter.action.DISCOVERY_STARTED"

    .line 42
    invoke-virtual {p1, p2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 44
    new-instance p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$1;

    invoke-direct {p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl$1;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V

    check-cast p1, Landroid/content/BroadcastReceiver;

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothReceiver:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 32
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p2

    const-string p3, "getDefaultAdapter()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;)V

    return-void
.end method

.method public static final synthetic access$getFoundDevices$p(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)Lio/reactivex/subjects/PublishSubject;
    .locals 0

    .line 32
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->foundDevices:Lio/reactivex/subjects/PublishSubject;

    return-object p0
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 32
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic lambda$2xAAW-NoWB6qVrmw5gjvhOTfKic(Ljava/util/List;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-1(Ljava/util/List;Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$CvEg5WHdHjVIWeEMdfkqlahkzmU(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;Lio/reactivex/disposables/Disposable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;Lio/reactivex/disposables/Disposable;)V

    return-void
.end method

.method public static synthetic lambda$KrOHei6ojjPpGSNkM5FKaloXVwY(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-2(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$YBPyyxMV394IiBVrp9i7OiAeK44(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V

    return-void
.end method

.method public static synthetic lambda$ZJWPdyXTD_WOSQcdzqBwaYoBw8A(Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-5$lambda-4(Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$jTC2_kiFn8CQa7YAbopQO3Zhe04(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-3(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic lambda$oMUjpwAMvs79yZiBD9hkC5_UISE(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$q7Kka9rUa46yeL9GSQbVcx2UGZ4(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$lambda-5(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private final scan(Ljava/util/List;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    .line 73
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$oMUjpwAMvs79yZiBD9hkC5_UISE;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$oMUjpwAMvs79yZiBD9hkC5_UISE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    .line 81
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$2xAAW-NoWB6qVrmw5gjvhOTfKic;

    invoke-direct {v1, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$2xAAW-NoWB6qVrmw5gjvhOTfKic;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$KrOHei6ojjPpGSNkM5FKaloXVwY;

    .line 82
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$jTC2_kiFn8CQa7YAbopQO3Zhe04;

    .line 83
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 84
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2cec

    invoke-virtual {p1, v1, v2, v0}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$q7Kka9rUa46yeL9GSQbVcx2UGZ4;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$q7Kka9rUa46yeL9GSQbVcx2UGZ4;

    .line 85
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->retryWhen(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 92
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$CvEg5WHdHjVIWeEMdfkqlahkzmU;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$CvEg5WHdHjVIWeEMdfkqlahkzmU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnSubscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object p1

    .line 95
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$YBPyyxMV394IiBVrp9i7OiAeK44;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$YBPyyxMV394IiBVrp9i7OiAeK44;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->doOnDispose(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n            info(\"Starting bluetooth classic scanning...\")\n            bluetoothAdapter.cancelDiscovery()\n            val started = bluetoothAdapter.startDiscovery()\n            info(\"Bluetooth classic scanning started: $started\")\n\n            foundDevices\n        }\n                .filter { bluetoothDevice -> deviceAddresses.isEmpty() || deviceAddresses.contains(bluetoothDevice.address) }\n                .filter { it.isPowerWatchDevice() }\n                .doOnNext { bluetoothDevice -> Log.d(TAG, \"Found PowerWatch device, Address is: ${bluetoothDevice.address}\") }\n                .timeout(11500, TimeUnit.MILLISECONDS)\n                .retryWhen { observable ->\n                    observable.flatMap { throwable ->\n                        if (throwable is TimeoutException) {\n                            Observable.just(0)\n                        } else Observable.error(throwable)\n                    }\n                }\n                .doOnSubscribe {\n                    context.registerReceiver(bluetoothReceiver, intentFilter)\n                }\n                .doOnDispose {\n                    if (bluetoothAdapter.isDiscovering) {\n                        Log.d(TAG, \"Unsubscribe called, canceling discovery...\")\n                        bluetoothAdapter.cancelDiscovery()\n                    }\n                    context.unregisterReceiver(bluetoothReceiver)\n\n                }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic scan$default(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;Ljava/util/List;ILjava/lang/Object;)Lio/reactivex/Observable;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 71
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan(Ljava/util/List;)Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method private static final scan$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)Lio/reactivex/ObservableSource;
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    const-string v1, "Starting bluetooth classic scanning..."

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 75
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 76
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->startDiscovery()Z

    move-result v1

    .line 77
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v4, "Bluetooth classic scanning started: "

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2, v3, v2}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/PWLoggerInputKt;->info$default(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 79
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->foundDevices:Lio/reactivex/subjects/PublishSubject;

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final scan$lambda-1(Ljava/util/List;Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    const-string v0, "$deviceAddresses"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothDevice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static final scan$lambda-2(Landroid/bluetooth/BluetoothDevice;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->isPowerWatchDevice(Landroid/bluetooth/BluetoothDevice;)Z

    move-result p0

    return p0
.end method

.method private static final scan$lambda-3(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    .line 83
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Found PowerWatch device, Address is: "

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final scan$lambda-5(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BluetoothScannerImpl$ZJWPdyXTD_WOSQcdzqBwaYoBw8A;

    invoke-virtual {p0, v0}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final scan$lambda-5$lambda-4(Ljava/lang/Throwable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "throwable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    instance-of v0, p0, Ljava/util/concurrent/TimeoutException;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 88
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    goto :goto_0

    .line 89
    :cond_0
    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    :goto_0
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final scan$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;Lio/reactivex/disposables/Disposable;)V
    .locals 1

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->context:Landroid/content/Context;

    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothReceiver:Landroid/content/BroadcastReceiver;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->intentFilter:Landroid/content/IntentFilter;

    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private static final scan$lambda-7(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isDiscovering()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    const-string v1, "Unsubscribe called, canceling discovery..."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->cancelDiscovery()Z

    .line 100
    :cond_0
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->context:Landroid/content/Context;

    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothReceiver:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method


# virtual methods
.method public devices()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 67
    invoke-static {p0, v0, v1, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan$default(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;Ljava/util/List;ILjava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public devices(Ljava/util/List;)Lio/reactivex/Observable;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/Observable<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation

    const-string v0, "deviceAddresses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/extensions/BluetoothExtensionsKt;->powerWatchDevices(Landroid/bluetooth/BluetoothAdapter;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 131
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 109
    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 133
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 111
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .line 134
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .line 135
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 114
    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    .line 136
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .line 137
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 138
    check-cast v7, Landroid/bluetooth/BluetoothDevice;

    .line 114
    invoke-virtual {v7}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 139
    :cond_3
    check-cast v6, Ljava/util/List;

    .line 114
    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 140
    :cond_4
    check-cast v2, Ljava/util/List;

    .line 116
    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->TAG:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 119
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lio/reactivex/rxkotlin/ObservableKt;->toObservable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1

    .line 121
    :cond_5
    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lio/reactivex/rxkotlin/ObservableKt;->toObservable(Ljava/lang/Iterable;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    invoke-direct {p0, v2}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BluetoothScannerImpl;->scan(Ljava/util/List;)Lio/reactivex/Observable;

    move-result-object v0

    check-cast v0, Lio/reactivex/ObservableSource;

    invoke-static {p1, v0}, Lio/reactivex/Observable;->merge(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "merge(appPairedBondedDevices.toObservable(), scan(notBondedDevicesToScan))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 32
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method
