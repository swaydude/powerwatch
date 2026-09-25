.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;
.super Ljava/lang/Object;
.source "BleScanner.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBleScanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleScanner.kt\npowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n37#2,2:48\n*S KotlinDebug\n*F\n+ 1 BleScanner.kt\npowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl\n*L\n37#1:48,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScanner;",
        "rxBleClient",
        "Lcom/polidea/rxandroidble2/RxBleClient;",
        "(Lcom/polidea/rxandroidble2/RxBleClient;)V",
        "scan",
        "Lio/reactivex/Observable;",
        "Lcom/polidea/rxandroidble2/scan/ScanResult;",
        "bleScannerConfiguration",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;",
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
.field private final rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;


# direct methods
.method public constructor <init>(Lcom/polidea/rxandroidble2/RxBleClient;)V
    .locals 1

    const-string v0, "rxBleClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;->rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;

    return-void
.end method

.method public static synthetic lambda$6OF8SJb4CEQ4l6VeXdjAWtn17is(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;->scan$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final scan$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;)Lio/reactivex/ObservableSource;
    .locals 3

    const-string v0, "$bleScannerConfiguration"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    new-instance v0, Lcom/polidea/rxandroidble2/scan/ScanSettings$Builder;

    invoke-direct {v0}, Lcom/polidea/rxandroidble2/scan/ScanSettings$Builder;-><init>()V

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->getScanMode()Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;

    move-result-object v1

    invoke-virtual {v1}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/ScanMode;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/polidea/rxandroidble2/scan/ScanSettings$Builder;->setScanMode(I)Lcom/polidea/rxandroidble2/scan/ScanSettings$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/polidea/rxandroidble2/scan/ScanSettings$Builder;->build()Lcom/polidea/rxandroidble2/scan/ScanSettings;

    move-result-object v0

    .line 37
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->getScanFilters()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/polidea/rxandroidble2/scan/ScanFilter;

    .line 49
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    check-cast v1, [Lcom/polidea/rxandroidble2/scan/ScanFilter;

    .line 39
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->getScanTimeout()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 40
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;->rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/polidea/rxandroidble2/scan/ScanFilter;

    invoke-virtual {p1, v0, v1}, Lcom/polidea/rxandroidble2/RxBleClient;->scanBleDevices(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/Observable;

    move-result-object p1

    .line 41
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;->getScanTimeout()Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object p0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p0}, Lio/reactivex/Observable;->timeout(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 43
    :cond_0
    iget-object p0, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;->rxBleClient:Lcom/polidea/rxandroidble2/RxBleClient;

    array-length p1, v1

    invoke-static {v1, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/polidea/rxandroidble2/scan/ScanFilter;

    invoke-virtual {p0, v0, p1}, Lcom/polidea/rxandroidble2/RxBleClient;->scanBleDevices(Lcom/polidea/rxandroidble2/scan/ScanSettings;[Lcom/polidea/rxandroidble2/scan/ScanFilter;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method


# virtual methods
.method public scan(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;",
            ")",
            "Lio/reactivex/Observable<",
            "Lcom/polidea/rxandroidble2/scan/ScanResult;",
            ">;"
        }
    .end annotation

    const-string v0, "bleScannerConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/core/-$$Lambda$BleScannerImpl$6OF8SJb4CEQ4l6VeXdjAWtn17is;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerConfiguration;Lpowerwatch/matrix/com/pwgen2android/sdk/core/BleScannerImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n            val scanSettings = ScanSettings.Builder().setScanMode(bleScannerConfiguration.scanMode.ordinal).build()\n            val filters = bleScannerConfiguration.scanFilters.toTypedArray()\n\n            if (bleScannerConfiguration.scanTimeout != null) {\n                return@defer rxBleClient.scanBleDevices(scanSettings, *filters)\n                        .timeout(bleScannerConfiguration.scanTimeout, TimeUnit.MILLISECONDS)\n            }\n            rxBleClient.scanBleDevices(scanSettings, *filters)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
