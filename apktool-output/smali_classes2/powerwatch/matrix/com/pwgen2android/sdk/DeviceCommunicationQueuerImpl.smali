.class public final Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;
.super Ljava/lang/Object;
.source "DeviceCommunicationQueuer.kt"

# interfaces
.implements Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;
.implements Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u0002H\u00190\u0011\"\u0004\u0008\u0000\u0010\u00192\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u0002H\u00190\u0014H\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\n\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c0\u000c0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003 \u0006*\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00140\u00140\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;",
        "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;",
        "()V",
        "TAG",
        "",
        "kotlin.jvm.PlatformType",
        "blockingOperationWaiting",
        "Lio/reactivex/subjects/BehaviorSubject;",
        "",
        "operationCompletionSubject",
        "Lio/reactivex/subjects/PublishSubject;",
        "Lkotlin/Pair;",
        "",
        "operationScheduler",
        "Ljava/util/concurrent/ExecutorService;",
        "queueObservable",
        "Lio/reactivex/Observable;",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;",
        "requestSubject",
        "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;",
        "clear",
        "",
        "createQueueObservable",
        "queue",
        "T",
        "operation",
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
.field private final TAG:Ljava/lang/String;

.field private final blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/BehaviorSubject<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private operationCompletionSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private final operationScheduler:Ljava/util/concurrent/ExecutorService;

.field private queueObservable:Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;",
            ">;"
        }
    .end annotation
.end field

.field private requestSubject:Lio/reactivex/subjects/PublishSubject;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/PublishSubject<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->TAG:Ljava/lang/String;

    .line 45
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationScheduler:Ljava/util/concurrent/ExecutorService;

    .line 46
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<Pair<String, Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationCompletionSubject:Lio/reactivex/subjects/PublishSubject;

    .line 47
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<DeviceCommunicationOperation<*>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->requestSubject:Lio/reactivex/subjects/PublishSubject;

    .line 48
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable()Lio/reactivex/Observable;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queueObservable:Lio/reactivex/Observable;

    const/4 v0, 0x0

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lio/reactivex/subjects/BehaviorSubject;->createDefault(Ljava/lang/Object;)Lio/reactivex/subjects/BehaviorSubject;

    move-result-object v0

    const-string v1, "createDefault<Int>(0)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    return-void
.end method

.method private final createQueueObservable()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;",
            ">;"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->requestSubject:Lio/reactivex/subjects/PublishSubject;

    .line 94
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$n8idSlo5Rx1Rk66F3Y8q7NXdDCI;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$n8idSlo5Rx1Rk66F3Y8q7NXdDCI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/PublishSubject;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 102
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$yMdkwxE7pJAG_T__VG_9-u-0a7E;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$yMdkwxE7pJAG_T__VG_9-u-0a7E;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->concatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v0

    .line 128
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$XBuO4wpwgMPK_s1q1YUxw34VJYk;

    invoke-direct {v1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$XBuO4wpwgMPK_s1q1YUxw34VJYk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/Consumer;)Lio/reactivex/Observable;

    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lio/reactivex/Observable;->repeat()Lio/reactivex/Observable;

    move-result-object v0

    .line 133
    invoke-virtual {v0}, Lio/reactivex/Observable;->retry()Lio/reactivex/Observable;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lio/reactivex/Observable;->publish()Lio/reactivex/observables/ConnectableObservable;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Lio/reactivex/observables/ConnectableObservable;->autoConnect()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "requestSubject\n                .doOnNext {\n//                    debug(\"New Operation Request arrived. Putting it into a queue.\")\n                    Log.d(TAG,\"New Operation Request arrived. Putting it into a queue.\")\n                    if (it.operationType == OperationType.Blocker) {\n                        blockingOperationWaiting.onNext((blockingOperationWaiting.value ?: 0) + 1)\n                    }\n                    println(\"notif_blocking: blocker count on insert - ${blockingOperationWaiting.value ?: 0}\")\n                }\n                .concatMap {\n                    return@concatMap Observable.defer {\n                        val currentOperationID = it.operationID\n//                        debug(\"Operation retrieved from a queue. Triggering operation with ID: $currentOperationID.\")\n                        Log.d(TAG,\"Operation retrieved from a queue. Triggering operation with ID: $currentOperationID.\")\n                        operationCompletionSubject.onNext(Pair(currentOperationID, false))\n                        it.operationObs\n                                .map { OperationResult(currentOperationID, it) }\n                                .onErrorReturn {\n                                    OperationResult(currentOperationID, error = it)\n                                }\n                                .doOnComplete {\n//                                    debug(\"Operation with ID: $currentOperationID completed.\")\n                                    Log.d(TAG,\"Operation with ID: $currentOperationID completed.\")\n\n                                    if (it.operationType == OperationType.Blocker) {\n                                        blockingOperationWaiting.onNext((blockingOperationWaiting.value ?: 1) - 1)\n                                    }\n                                    println(\"notif_blocking: blocker count after complete - ${blockingOperationWaiting.value ?: 0}\")\n\n                                    // this is pushed to signal that observable has terminated, so it could be disposed automatically\n                                    operationCompletionSubject.onNext(Pair(currentOperationID, true))\n                                }\n                    }\n                            .subscribeOn(Schedulers.from(operationScheduler))\n                }\n                .doOnNext {\n//                    debug(\"Operation progress event. Current operationID: ${it.operationID}\")\n                    Log.d(TAG,\"Operation progress event. Current operationID: ${it.operationID}\")\n                }\n                .repeat()\n                .retry()\n                .publish()\n                .autoConnect()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final createQueueObservable$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->TAG:Ljava/lang/String;

    const-string v1, "New Operation Request arrived. Putting it into a queue."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationType()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 98
    iget-object p1, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    move-object v1, v0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 100
    :cond_1
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p0}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, p0

    :goto_0
    const-string p0, "notif_blocking: blocker count on insert - "

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method private static final createQueueObservable$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$AaSVQCGpQPHmW78TMZSm2exebxU;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$AaSVQCGpQPHmW78TMZSm2exebxU;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 126
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationScheduler:Ljava/util/concurrent/ExecutorService;

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lio/reactivex/schedulers/Schedulers;->from(Ljava/util/concurrent/Executor;)Lio/reactivex/Scheduler;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createQueueObservable$lambda-15$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;
    .locals 4

    const-string v0, "$it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationID()Ljava/lang/String;

    move-result-object v0

    .line 106
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Operation retrieved from a queue. Triggering operation with ID: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationCompletionSubject:Lio/reactivex/subjects/PublishSubject;

    new-instance v2, Lkotlin/Pair;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 108
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationObs()Lio/reactivex/Observable;

    move-result-object v1

    .line 109
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$PzVinEBibNKAVEoPvNtj1-ngOW0;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$PzVinEBibNKAVEoPvNtj1-ngOW0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 110
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$W5xXFiz5_Jq-0VOeJCzknxilR1o;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$W5xXFiz5_Jq-0VOeJCzknxilR1o;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->onErrorReturn(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object v1

    .line 113
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$oeHuUTlyV3V-C4WADMWXwPXdLHo;

    invoke-direct {v2, p1, v0, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$oeHuUTlyV3V-C4WADMWXwPXdLHo;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final createQueueObservable$lambda-15$lambda-14$lambda-11(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 8

    const-string v0, "$currentOperationID"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;-><init>(Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final createQueueObservable$lambda-15$lambda-14$lambda-12(Ljava/lang/String;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 8

    const-string v0, "$currentOperationID"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    move-object v5, p1

    invoke-direct/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;-><init>(Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final createQueueObservable$lambda-15$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$currentOperationID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Operation with ID: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " completed."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    invoke-virtual {p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationType()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    move-result-object p2

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Blocker;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_1

    .line 118
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p2}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sub-int/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, Lio/reactivex/subjects/BehaviorSubject;->onNext(Ljava/lang/Object;)V

    .line 120
    :cond_1
    iget-object p2, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {p2}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    if-nez p2, :cond_2

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_2
    const-string v1, "notif_blocking: blocker count after complete - "

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 123
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationCompletionSubject:Lio/reactivex/subjects/PublishSubject;

    new-instance p2, Lkotlin/Pair;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private static final createQueueObservable$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->getOperationID()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Operation progress event. Current operationID: "

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic lambda$36iyNS0Ww2tyHprrN2kI_M8Qrs8(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$AaSVQCGpQPHmW78TMZSm2exebxU(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-15$lambda-14(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$OuYnt63RfWFoZU913eM1esVaOAI()V
    .locals 0

    invoke-static {}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-7()V

    return-void
.end method

.method public static synthetic lambda$PzVinEBibNKAVEoPvNtj1-ngOW0(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-15$lambda-14$lambda-11(Ljava/lang/String;Ljava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$QVzHyzwNfAlHTOsa2oCBLJa3gPk(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lio/reactivex/ObservableEmitter;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lio/reactivex/ObservableEmitter;)V

    return-void
.end method

.method public static synthetic lambda$QtvJ8Ujrifkpc3ZB9p37GkqPyRQ(Lkotlin/Pair;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-3(Lkotlin/Pair;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$W5xXFiz5_Jq-0VOeJCzknxilR1o(Ljava/lang/String;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-15$lambda-14$lambda-12(Ljava/lang/String;Ljava/lang/Throwable;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$XBuO4wpwgMPK_s1q1YUxw34VJYk(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-16(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)V

    return-void
.end method

.method public static synthetic lambda$XyIBROSMPgfYFyktKRdwpVEy9s8(Ljava/lang/String;Lkotlin/Pair;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-2(Ljava/lang/String;Lkotlin/Pair;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$Y4QryVKbDeE0779pxr-R37xb2Ho(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Lkotlin/Unit;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Lkotlin/Unit;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$a87I3HUNkH_xIdHw9FQEYc-NooU(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Z
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$hHVtWYhYKy8VCzG3EBe_cD_Y0nI(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$ktztbgOM2MRcYWOThsI6qJgAMDY(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Z
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-1(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic lambda$n8idSlo5Rx1Rk66F3Y8q7NXdDCI(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-10(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V

    return-void
.end method

.method public static synthetic lambda$oeHuUTlyV3V-C4WADMWXwPXdLHo(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-15$lambda-14$lambda-13(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V

    return-void
.end method

.method public static synthetic lambda$wc6PW918mCVOV5kzWrm2w4Lffy0(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queue$lambda-9$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic lambda$yMdkwxE7pJAG_T__VG_9-u-0a7E(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/ObservableSource;
    .locals 0

    invoke-static {p0, p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable$lambda-15(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/ObservableSource;

    move-result-object p0

    return-object p0
.end method

.method private static final queue$lambda-9(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)Lio/reactivex/ObservableSource;
    .locals 4

    const-string v0, "$operation"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationID()Ljava/lang/String;

    move-result-object v0

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "notif_blocking: blocker count on read for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationType()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v2}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 57
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;->getOperationType()Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType;

    move-result-object v1

    sget-object v2, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Discard;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/OperationType$Discard;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->blockingOperationWaiting:Lio/reactivex/subjects/BehaviorSubject;

    invoke-virtual {v1}, Lio/reactivex/subjects/BehaviorSubject;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-lez v1, :cond_2

    .line 58
    invoke-static {}, Lio/reactivex/Completable;->complete()Lio/reactivex/Completable;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/Completable;->toObservable()Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 61
    :cond_2
    new-instance v1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;

    invoke-direct {v1, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)V

    invoke-static {v1}, Lio/reactivex/Observable;->create(Lio/reactivex/ObservableOnSubscribe;)Lio/reactivex/Observable;

    move-result-object p0

    const-string v1, "create<Unit> {\n                requestSubject.onNext(operation)\n                it.onNext(Unit)\n                it.onComplete()\n            }"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queueObservable:Lio/reactivex/Observable;

    .line 68
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$ktztbgOM2MRcYWOThsI6qJgAMDY;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$ktztbgOM2MRcYWOThsI6qJgAMDY;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object v1

    check-cast v1, Lio/reactivex/ObservableSource;

    .line 69
    iget-object p1, p1, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationCompletionSubject:Lio/reactivex/subjects/PublishSubject;

    .line 70
    new-instance v2, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$XyIBROSMPgfYFyktKRdwpVEy9s8;

    invoke-direct {v2, v0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$XyIBROSMPgfYFyktKRdwpVEy9s8;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lio/reactivex/subjects/PublishSubject;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QtvJ8Ujrifkpc3ZB9p37GkqPyRQ;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$QtvJ8Ujrifkpc3ZB9p37GkqPyRQ;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p1

    check-cast p1, Lio/reactivex/ObservableSource;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8;

    .line 67
    invoke-static {v1, p1, v0}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$a87I3HUNkH_xIdHw9FQEYc-NooU;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$a87I3HUNkH_xIdHw9FQEYc-NooU;

    .line 74
    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->takeWhile(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    move-result-object p1

    .line 78
    check-cast p1, Lio/reactivex/ObservableSource;

    check-cast p0, Lio/reactivex/ObservableSource;

    sget-object v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$Y4QryVKbDeE0779pxr-R37xb2Ho;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$Y4QryVKbDeE0779pxr-R37xb2Ho;

    .line 77
    invoke-static {p1, p0, v0}, Lio/reactivex/Observable;->combineLatest(Lio/reactivex/ObservableSource;Lio/reactivex/ObservableSource;Lio/reactivex/functions/BiFunction;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$OuYnt63RfWFoZU913eM1esVaOAI;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$OuYnt63RfWFoZU913eM1esVaOAI;

    .line 81
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->doOnComplete(Lio/reactivex/functions/Action;)Lio/reactivex/Observable;

    move-result-object p0

    sget-object p1, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$wc6PW918mCVOV5kzWrm2w4Lffy0;->INSTANCE:Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$wc6PW918mCVOV5kzWrm2w4Lffy0;

    .line 84
    invoke-virtual {p0, p1}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/Function;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method

.method private static final queue$lambda-9$lambda-0(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lio/reactivex/ObservableEmitter;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object p0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->requestSubject:Lio/reactivex/subjects/PublishSubject;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/PublishSubject;->onNext(Ljava/lang/Object;)V

    .line 63
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p2, p0}, Lio/reactivex/ObservableEmitter;->onNext(Ljava/lang/Object;)V

    .line 64
    invoke-interface {p2}, Lio/reactivex/ObservableEmitter;->onComplete()V

    return-void
.end method

.method private static final queue$lambda-9$lambda-1(Ljava/lang/String;Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Z
    .locals 1

    const-string v0, "$operationID"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p1}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->getOperationID()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final queue$lambda-9$lambda-2(Ljava/lang/String;Lkotlin/Pair;)Z
    .locals 1

    const-string v0, "$operationID"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final queue$lambda-9$lambda-3(Lkotlin/Pair;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final queue$lambda-9$lambda-4(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Ljava/lang/Boolean;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 8

    const-string v0, "operationResult"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xb

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->copy$default(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Throwable;ILjava/lang/Object;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;

    move-result-object p0

    return-object p0
.end method

.method private static final queue$lambda-9$lambda-5(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->getCompleted()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final queue$lambda-9$lambda-6(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;Lkotlin/Unit;)Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;
    .locals 1

    const-string v0, "res"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$noName_1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final queue$lambda-9$lambda-7()V
    .locals 0

    return-void
.end method

.method private static final queue$lambda-9$lambda-8(Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;)Lio/reactivex/ObservableSource;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->getError()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->getError()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0

    .line 87
    :cond_0
    invoke-virtual {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;->getResult()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p0

    check-cast p0, Lio/reactivex/ObservableSource;

    return-object p0
.end method


# virtual methods
.method public clear()V
    .locals 2

    .line 40
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<Pair<String, Boolean>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationCompletionSubject:Lio/reactivex/subjects/PublishSubject;

    .line 41
    invoke-static {}, Lio/reactivex/subjects/PublishSubject;->create()Lio/reactivex/subjects/PublishSubject;

    move-result-object v0

    const-string v1, "create<DeviceCommunicationOperation<*>>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->requestSubject:Lio/reactivex/subjects/PublishSubject;

    .line 42
    invoke-direct {p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->createQueueObservable()Lio/reactivex/Observable;

    move-result-object v0

    iput-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->queueObservable:Lio/reactivex/Observable;

    return-void
.end method

.method public getKoin()Lorg/koin/core/Koin;
    .locals 1

    .line 35
    move-object v0, p0

    check-cast v0, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;

    invoke-static {v0}, Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable$DefaultImpls;->getKoin(Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;)Lorg/koin/core/Koin;

    move-result-object v0

    return-object v0
.end method

.method public queue(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    new-instance v0, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;

    invoke-direct {v0, p1, p0}, Lpowerwatch/matrix/com/pwgen2android/sdk/-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI;-><init>(Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;)V

    invoke-static {v0}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object p1

    .line 89
    iget-object v0, p0, Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;->operationScheduler:Ljava/util/concurrent/ExecutorService;

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-static {v0}, Lio/reactivex/schedulers/Schedulers;->from(Ljava/util/concurrent/Executor;)Lio/reactivex/Scheduler;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    move-result-object p1

    const-string v0, "defer {\n\n            val operationID = operation.operationID\n\n            println(\"notif_blocking: blocker count on read for ${operation.operationType.javaClass.simpleName}- ${blockingOperationWaiting.value ?: 0}\")\n            if (operation.operationType == OperationType.Discard && (blockingOperationWaiting.value ?: 0) > 0) {\n                return@defer Completable.complete().toObservable<T>()\n            }\n\n            val request = Observable.create<Unit> {\n                requestSubject.onNext(operation)\n                it.onNext(Unit)\n                it.onComplete()\n            }\n\n            val response = Observable.combineLatest(queueObservable\n                    .filter { operationID == it.operationID },\n                    operationCompletionSubject\n                            .filter { operationID == it.first }.map { it.second },\n                    BiFunction<OperationResult, Boolean, OperationResult> { operationResult, completed ->\n                        operationResult.copy(completed = completed)\n                    })\n                    .takeWhile { !it.completed }\n\n            Observable\n                    .combineLatest(\n                            response, request, BiFunction<OperationResult, Unit, OperationResult> { res, _ ->\n                        res\n                    })\n                    .doOnComplete {\n                        Unit\n                    }\n                    .flatMap {\n                        @Suppress(\"UNCHECKED_CAST\")\n                        if (it.error != null) return@flatMap Observable.error<T>(it.error)\n                        else Observable.just(it.result as T)\n                    }\n        }.subscribeOn(Schedulers.from(operationScheduler))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
