.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;
.super Ljava/lang/Object;
.source "Gen2HeartRateChannel.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0008\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00122\u0006\u0010\u000f\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0015H\u0016J\u0008\u0010\u0016\u001a\u00020\u0017H\u0016J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0008\u0010\u001b\u001a\u00020\rH\u0016J\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00122\u0006\u0010\u001d\u001a\u00020\u0008H\u0016J\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00122\u0006\u0010\u001d\u001a\u00020\u0008H\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\u000c\u0012\n \t*\u0004\u0018\u00010\u00080\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "rxBleConnection",
        "Lcom/polidea/rxandroidble2/RxBleConnection;",
        "(Lcom/polidea/rxandroidble2/RxBleConnection;)V",
        "dataOutput",
        "Lio/reactivex/subjects/PublishSubject;",
        "",
        "kotlin.jvm.PlatformType",
        "subscription",
        "Lio/reactivex/disposables/CompositeDisposable;",
        "close",
        "Lio/reactivex/Completable;",
        "open",
        "characteristic",
        "Ljava/util/UUID;",
        "read",
        "Lio/reactivex/Single;",
        "",
        "receivedData",
        "Lio/reactivex/Observable;",
        "refresh",
        "",
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
.field private final dataOutput:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "[B>;"
        }
    .end annotation
.end field

.field private final rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

.field private final subscription:Lio/reactivex/disposables/CompositeDisposable;


# direct methods
.method public constructor <init>(Lcom/polidea/rxandroidble2/RxBleConnection;)V
    .locals 1

    const-string v0, "rxBleConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 45
    new-instance p1, Lio/reactivex/disposables/CompositeDisposable;

    invoke-direct {p1}, Lio/reactivex/disposables/CompositeDisposable;-><init>()V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    .line 46
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object p1

    const-string v0, "create<ByteArray>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    return-void
.end method

.method private static final close$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Lio/reactivex/CompletableObserver;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->dispose()V

    return-void
.end method

.method public static synthetic lambda$-Q9cJcnQz1oWmTuwllK0Ii1abaM(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->open$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic lambda$XsmmWN1vUStZUHvZhnq9h3Hr0tE(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;[B)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->open$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;[B)V

    return-void
.end method

.method public static synthetic lambda$axBuiDgwyWlmn9ilTh1QnquZx04(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->resubscribeCharacteristics$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V

    return-void
.end method

.method public static synthetic lambda$jxCf_22PThNg8MBWJMnzfW6Be7Y(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Lio/reactivex/CompletableObserver;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->close$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Lio/reactivex/CompletableObserver;)V

    return-void
.end method

.method public static synthetic lambda$tHRbzWvrT0q9meASe_eHC4zIKDI(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->open$lambda-4$lambda-1(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$w6P_B-K0LZF8qLF7YxfC2WjOSlY(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/util/UUID;Lio/reactivex/CompletableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->open$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/util/UUID;Lio/reactivex/CompletableEmitter;)V

    return-void
.end method

.method private static final open$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/util/UUID;Lio/reactivex/CompletableEmitter;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    iget-object v1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->rxBleConnection:Lcom/polidea/rxandroidble2/RxBleConnection;

    .line 28
    invoke-interface {v1, p1}, Lcom/polidea/rxandroidble2/RxBleConnection;->setupNotification(Ljava/util/UUID;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$tHRbzWvrT0q9meASe_eHC4zIKDI;

    .line 30
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    .line 33
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$XsmmWN1vUStZUHvZhnq9h3Hr0tE;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$XsmmWN1vUStZUHvZhnq9h3Hr0tE;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V

    .line 35
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$-Q9cJcnQz1oWmTuwllK0Ii1abaM;

    invoke-direct {v2, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$-Q9cJcnQz1oWmTuwllK0Ii1abaM;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V

    .line 33
    invoke-virtual {p1, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    move-result-object p0

    .line 27
    invoke-virtual {v0, p0}, Lio/reactivex/disposables/CompositeDisposable;->add(Lio/reactivex/disposables/Disposable;)Z

    .line 40
    invoke-interface {p2}, Lio/reactivex/CompletableEmitter;->onComplete()V

    return-void
.end method

.method private static final open$lambda-4$lambda-1(Lio/reactivex/Observable;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "observable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final open$lambda-4$lambda-2(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;[B)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final open$lambda-4$lambda-3(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static final resubscribeCharacteristics$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->subscription:Lio/reactivex/disposables/CompositeDisposable;

    invoke-virtual {p0}, Lio/reactivex/disposables/CompositeDisposable;->clear()V

    return-void
.end method


# virtual methods
.method public close()Lio/reactivex/Completable;
    .locals 2

    .line 54
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object v0

    .line 55
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$jxCf_22PThNg8MBWJMnzfW6Be7Y;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$jxCf_22PThNg8MBWJMnzfW6Be7Y;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V

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

    .line 14
    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel$DefaultImpls;->eventData(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/CommunicationChannel;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 14
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public open()Lio/reactivex/Completable;
    .locals 2

    .line 50
    new-instance v0, Ljava/lang/Throwable;

    const-string v1, "not implemented"

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/Completable;->error(Ljava/lang/Throwable;)Lio/reactivex/Completable;

    move-result-object v0

    const-string v1, "error(Throwable(\"not implemented\"))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public open(Ljava/util/UUID;)Lio/reactivex/Completable;
    .locals 1

    const-string v0, "characteristic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;

    invoke-direct {v0, p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$w6P_B-K0LZF8qLF7YxfC2WjOSlY;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;Ljava/util/UUID;)V

    invoke-static {v0}, Lio/reactivex/Completable;->create(Lio/reactivex/CompletableOnSubscribe;)Lio/reactivex/Completable;

    move-result-object p1

    const-string v0, "create { emitter ->\n\n//            debug(\"Running open on channel\")\n            subscription.add(rxBleConnection\n                    .setupNotification(characteristic)\n//                    .doOnNext { debug(\"Characteristic set!\") }\n                    .flatMap { observable ->\n                        observable\n                    }\n                    .subscribe({\n                        dataOutput.onNext(it)\n                    }, {\n                        dataOutput.onError(it)\n                    }))\n\n\n            emitter.onComplete()\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public read(Ljava/lang/String;)Lio/reactivex/Single;
    .locals 2
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

    .line 75
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

.method public receivedData()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "[B>;"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->dataOutput:Lio/reactivex/subjects/PublishSubject;

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public refresh()V
    .locals 0

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

    .line 79
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

    .line 18
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$axBuiDgwyWlmn9ilTh1QnquZx04;

    invoke-direct {v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/-$$Lambda$Gen2HeartRateChannel$axBuiDgwyWlmn9ilTh1QnquZx04;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;)V

    invoke-static {v0}, Lio/reactivex/Completable;->fromAction(Lio/reactivex/functions/Action;)Lio/reactivex/Completable;

    move-result-object v0

    .line 21
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/channels/Gen2HeartRateChannel;->open()Lio/reactivex/Completable;

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

    .line 67
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

    .line 71
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
