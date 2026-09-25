.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;
.super Ljava/lang/Object;
.source "Gen2BLECommunicationChannel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0008H\u0017J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0008\u0010\u001a\u001a\u00020\rH\u0016J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00080\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "rxBleConnection",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "(Lcom/polidea/rxandroidble2/RxBleConnection;)V",
        "refreshSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "subscription",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "close",
        "Lio/reactivex/Completable;",
        "open",
        "read",
        "Lio/reactivex/Single;",
        "",
        "characteristic",
        "",
        "receivedData",
        "Lio/reactivex/Observable;",
        "refresh",
        "requestMTU",
        "",
        "mtu",
        "resubscribeCharacteristics",
        "send",
        "data",
        "sendEvent",
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
.field private final refreshSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

.field private subscription:Lio/reactivex/disposables/CompositeDisposable;


# direct methods
.method public constructor <init>(Lcom/polidea/rxandroidble2/RxBleConnection;)V
    .locals 1

    const-string v0, "rxBleConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 21
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    .line 23
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<Unit>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->refreshSubject:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private static final close$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Lio/reactivex/CompletableObserver;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public static synthetic lambda$AHE7G03gMNtsufYQ0q-iuF270Hw(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->open$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$DhT-GB9bKX8Q19Wo9RWNigPIlt4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->resubscribeCharacteristics$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    return-void
.end method

.method public static synthetic lambda$TF7Do_qnHDLMwxSmRNqBo_hKWLE(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->open$lambda-4$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ZoNi1x9JqGHhlRCuYYbNsi33qu8(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Lio/reactivex/CompletableObserver;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->close$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Lio/reactivex/CompletableObserver;)V

    return-void
.end method

.method public static synthetic lambda$qoQG45XoxdoLqlTdFlX5nsV9C-I(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->open$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    return-void
.end method

.method public static synthetic lambda$zGN1RWdX_-sdng7GpP13ETZCGKY(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->open$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    return-void
.end method

.method private static final open$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V
    .locals 5

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {v0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    .line 47
    new-instance v0, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {v0}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    .line 49
    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->refreshSubject:Lio/reactivex/subjects/PublishSubject;

    .line 50
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x7530

    invoke-virtual {v1, v3, v4, v2}, Lio/reactivex/subjects/PublishSubject;->throttleFirst(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v1

    .line 51
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$TF7Do_qnHDLMwxSmRNqBo_hKWLE;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$TF7Do_qnHDLMwxSmRNqBo_hKWLE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/Function;)Lio/reactivex/Completable;

    move-result-object v1

    .line 53
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$qoQG45XoxdoLqlTdFlX5nsV9C-I;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$qoQG45XoxdoLqlTdFlX5nsV9C-I;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    .line 55
    new-instance v3, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$AHE7G03gMNtsufYQ0q-iuF270Hw;

    invoke-direct {v3, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$AHE7G03gMNtsufYQ0q-iuF270Hw;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    .line 53
    invoke-virtual {v1, v2, v3}, Lio/reactivex/Completable;->subscribe(Lio/reactivex/functions/Action;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p0

    .line 48
    invoke-virtual {v0, p0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    return-void
.end method

.method private static final open$lambda-4$lambda-1(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Lkotlin/Unit;)Lio/reactivex/CompletableSource;
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v0, 0x1

    const-wide/16 v1, 0x3e8

    invoke-interface {p0, v0, v1, v2, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->requestConnectionPriority(IJLjava/util/concurrent/TimeUnit;)Lio/reactivex/Completable;

    move-result-object p0

    check-cast p0, Lio/reactivex/CompletableSource;

    return-object p0
.end method

.method private static final open$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Connection updated successfully."

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final open$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;Ljava/lang/Throwable;)V
    .locals 0

    const-string p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Connection updating failed."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private static final resubscribeCharacteristics$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 2

    .line 62
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    .line 63
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$ZoNi1x9JqGHhlRCuYYbNsi33qu8;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$ZoNi1x9JqGHhlRCuYYbNsi33qu8;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "complete()\n                .andThen {\n                    subscription.dispose()\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public eventData()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 19
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel$DefaultImpls;->eventData(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 19
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public open()Lio/reactivex/Completable;
    .locals 2

    .line 45
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$zGN1RWdX_-sdng7GpP13ETZCGKY;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$zGN1RWdX_-sdng7GpP13ETZCGKY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n            subscription.dispose()\n            subscription = CompositeDisposable()\n            this.subscription.add(\n                    refreshSubject\n                            .throttleFirst(30000, TimeUnit.MILLISECONDS)\n                            .flatMapCompletable {\n                                rxBleConnection.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_HIGH, 1000, TimeUnit.MILLISECONDS)\n                            }.subscribe({\n                                Log.d(javaClass.simpleName, \"Connection updated successfully.\")\n                            }, {\n                                Log.e(javaClass.simpleName, \"Connection updating failed.\")\n                            }))\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public open(Ljava/util/UUID;)Lio/reactivex/Completable;
    .locals 0

    .line 19
    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel$DefaultImpls;->open(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;Ljava/util/UUID;)Lio/reactivex/Completable;

    move-result-object p1

    return-object p1
.end method

.method public read(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    invoke-static {p1}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->readCharacteristic(Ljava/util/UUID;)Lio/reactivex/Single;

    move-result-object p1

    const-string v0, "rxBleConnection.readCharacteristic(UUID.fromString(characteristic))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public receivedData()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 78
    new-instance v0, Lkotlin/NotImplementedError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "An operation is not implemented: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "not implemented"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Throwable;

    throw v0
.end method

.method public refresh()V
    .locals 2

    .line 41
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->refreshSubject:Lio/reactivex/subjects/PublishSubject;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public requestMTU(I)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lio/reactivex/Single<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 82
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

.method public resubscribeCharacteristics()Lio/reactivex/Completable;
    .locals 2

    .line 28
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$DhT-GB9bKX8Q19Wo9RWNigPIlt4;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2BLECommunicationChannel$DhT-GB9bKX8Q19Wo9RWNigPIlt4;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 31
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2BLECommunicationChannel;->open()Lio/reactivex/Completable;

    move-result-object v1

    check-cast v1, Lio/reactivex/CompletableSource;

    invoke-virtual {v0, v1}, Lio/reactivex/Completable;->andThen(Lio/reactivex/CompletableSource;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "fromAction {\n                    subscription.clear()\n                }\n                .andThen(this.open())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public send([B)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
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

.method public sendEvent([B)Lio/reactivex/Single;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/Single<",
            "[B>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
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
