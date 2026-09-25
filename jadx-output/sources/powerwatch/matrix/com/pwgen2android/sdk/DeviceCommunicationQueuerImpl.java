package powerwatch.matrix.com.pwgen2android.sdk;

/* JADX INFO: compiled from: DeviceCommunicationQueuer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0011\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0014H\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\n\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0006*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u00140\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuerImpl;", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationQueuer;", "Lpowerwatch/matrix/com/pwgen2android/shared/logger/Loggable;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "blockingOperationWaiting", "Lio/reactivex/subjects/BehaviorSubject;", "", "operationCompletionSubject", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "", "operationScheduler", "Ljava/util/concurrent/ExecutorService;", "queueObservable", "Lio/reactivex/Observable;", "Lpowerwatch/matrix/com/pwgen2android/sdk/OperationResult;", "requestSubject", "Lpowerwatch/matrix/com/pwgen2android/sdk/DeviceCommunicationOperation;", "clear", "", "createQueueObservable", "queue", "T", "operation", "app_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DeviceCommunicationQueuerImpl implements powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer, powerwatch.matrix.com.pwgen2android.shared.logger.Loggable {
    private final io.reactivex.subjects.BehaviorSubject<java.lang.Integer> blockingOperationWaiting;
    private io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, java.lang.Boolean>> operationCompletionSubject;
    private io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.OperationResult> queueObservable;
    private io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<?>> requestSubject;
    private final java.lang.String TAG = getClass().getSimpleName();
    private final java.util.concurrent.ExecutorService operationScheduler = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-6, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.OperationResult m2165queue$lambda9$lambda6(powerwatch.matrix.com.pwgen2android.sdk.OperationResult res, kotlin.Unit noName_1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(res, "res");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noName_1, "$noName_1");
        return res;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-7, reason: not valid java name */
    public static final void m2166queue$lambda9$lambda7() {
    }

    public DeviceCommunicationQueuerImpl() {
        io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, java.lang.Boolean>> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Pair<String, Boolean>>()");
        this.operationCompletionSubject = publishSubjectCreate;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<?>> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<DeviceCommunicationOperation<*>>()");
        this.requestSubject = publishSubjectCreate2;
        this.queueObservable = createQueueObservable();
        io.reactivex.subjects.BehaviorSubject<java.lang.Integer> behaviorSubjectCreateDefault = io.reactivex.subjects.BehaviorSubject.createDefault(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault<Int>(0)");
        this.blockingOperationWaiting = behaviorSubjectCreateDefault;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return powerwatch.matrix.com.pwgen2android.shared.logger.Loggable.DefaultImpls.getKoin(this);
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer
    public void clear() {
        io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.String, java.lang.Boolean>> publishSubjectCreate = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create<Pair<String, Boolean>>()");
        this.operationCompletionSubject = publishSubjectCreate;
        io.reactivex.subjects.PublishSubject<powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<?>> publishSubjectCreate2 = io.reactivex.subjects.PublishSubject.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create<DeviceCommunicationOperation<*>>()");
        this.requestSubject = publishSubjectCreate2;
        this.queueObservable = createQueueObservable();
    }

    @Override // powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuer
    public <T> io.reactivex.Observable<T> queue(final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation<T> operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "operation");
        io.reactivex.Observable<T> observableSubscribeOn = io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$hHVtWYhYKy8VCzG3EBe_cD_Y0nI
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2158queue$lambda9(operation, this);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.from(this.operationScheduler));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableSubscribeOn, "defer {\n\n            val operationID = operation.operationID\n\n            println(\"notif_blocking: blocker count on read for ${operation.operationType.javaClass.simpleName}- ${blockingOperationWaiting.value ?: 0}\")\n            if (operation.operationType == OperationType.Discard && (blockingOperationWaiting.value ?: 0) > 0) {\n                return@defer Completable.complete().toObservable<T>()\n            }\n\n            val request = Observable.create<Unit> {\n                requestSubject.onNext(operation)\n                it.onNext(Unit)\n                it.onComplete()\n            }\n\n            val response = Observable.combineLatest(queueObservable\n                    .filter { operationID == it.operationID },\n                    operationCompletionSubject\n                            .filter { operationID == it.first }.map { it.second },\n                    BiFunction<OperationResult, Boolean, OperationResult> { operationResult, completed ->\n                        operationResult.copy(completed = completed)\n                    })\n                    .takeWhile { !it.completed }\n\n            Observable\n                    .combineLatest(\n                            response, request, BiFunction<OperationResult, Unit, OperationResult> { res, _ ->\n                        res\n                    })\n                    .doOnComplete {\n                        Unit\n                    }\n                    .flatMap {\n                        @Suppress(\"UNCHECKED_CAST\")\n                        if (it.error != null) return@flatMap Observable.error<T>(it.error)\n                        else Observable.just(it.result as T)\n                    }\n        }.subscribeOn(Schedulers.from(operationScheduler))");
        return observableSubscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2158queue$lambda9(final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation operation, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "$operation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        final java.lang.String operationID = operation.getOperationID();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("notif_blocking: blocker count on read for ");
        sb.append((java.lang.Object) operation.getOperationType().getClass().getSimpleName());
        sb.append("- ");
        java.lang.Integer value = this$0.blockingOperationWaiting.getValue();
        java.lang.Integer num = 0;
        if (value == null) {
            value = num;
        }
        sb.append(value.intValue());
        java.lang.System.out.println((java.lang.Object) sb.toString());
        if (kotlin.jvm.internal.Intrinsics.areEqual(operation.getOperationType(), powerwatch.matrix.com.pwgen2android.sdk.OperationType.Discard.INSTANCE)) {
            java.lang.Integer value2 = this$0.blockingOperationWaiting.getValue();
            if ((value2 != null ? value2 : 0).intValue() > 0) {
                return io.reactivex.Completable.complete().toObservable();
            }
        }
        io.reactivex.Observable observableCreate = io.reactivex.Observable.create(new io.reactivex.ObservableOnSubscribe() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$QVzHyzwNfAlHTOsa2oCBLJa3gPk
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(io.reactivex.ObservableEmitter observableEmitter) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2159queue$lambda9$lambda0(this.f$0, operation, observableEmitter);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableCreate, "create<Unit> {\n                requestSubject.onNext(operation)\n                it.onNext(Unit)\n                it.onComplete()\n            }");
        return io.reactivex.Observable.combineLatest(io.reactivex.Observable.combineLatest(this$0.queueObservable.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$ktztbgOM2MRcYWOThsI6qJgAMDY
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2160queue$lambda9$lambda1(operationID, (powerwatch.matrix.com.pwgen2android.sdk.OperationResult) obj);
            }
        }), this$0.operationCompletionSubject.filter(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$XyIBROSMPgfYFyktKRdwpVEy9s8
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2161queue$lambda9$lambda2(operationID, (kotlin.Pair) obj);
            }
        }).map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$QtvJ8Ujrifkpc3ZB9p37GkqPyRQ
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2162queue$lambda9$lambda3((kotlin.Pair) obj);
            }
        }), new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$36iyNS0Ww2tyHprrN2kI_M8Qrs8
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2163queue$lambda9$lambda4((powerwatch.matrix.com.pwgen2android.sdk.OperationResult) obj, (java.lang.Boolean) obj2);
            }
        }).takeWhile(new io.reactivex.functions.Predicate() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$a87I3HUNkH_xIdHw9FQEYc-NooU
            @Override // io.reactivex.functions.Predicate
            public final boolean test(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2164queue$lambda9$lambda5((powerwatch.matrix.com.pwgen2android.sdk.OperationResult) obj);
            }
        }), observableCreate, new io.reactivex.functions.BiFunction() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$Y4QryVKbDeE0779pxr-R37xb2Ho
            @Override // io.reactivex.functions.BiFunction
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2165queue$lambda9$lambda6((powerwatch.matrix.com.pwgen2android.sdk.OperationResult) obj, (kotlin.Unit) obj2);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$OuYnt63RfWFoZU913eM1esVaOAI
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2166queue$lambda9$lambda7();
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$wc6PW918mCVOV5kzWrm2w4Lffy0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2167queue$lambda9$lambda8((powerwatch.matrix.com.pwgen2android.sdk.OperationResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-0, reason: not valid java name */
    public static final void m2159queue$lambda9$lambda0(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation operation, io.reactivex.ObservableEmitter it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "$operation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        this$0.requestSubject.onNext(operation);
        it.onNext(kotlin.Unit.INSTANCE);
        it.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-1, reason: not valid java name */
    public static final boolean m2160queue$lambda9$lambda1(java.lang.String operationID, powerwatch.matrix.com.pwgen2android.sdk.OperationResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationID, "$operationID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(operationID, it.getOperationID());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-2, reason: not valid java name */
    public static final boolean m2161queue$lambda9$lambda2(java.lang.String operationID, kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationID, "$operationID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return kotlin.jvm.internal.Intrinsics.areEqual(operationID, it.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-3, reason: not valid java name */
    public static final java.lang.Boolean m2162queue$lambda9$lambda3(kotlin.Pair it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return (java.lang.Boolean) it.getSecond();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-4, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.OperationResult m2163queue$lambda9$lambda4(powerwatch.matrix.com.pwgen2android.sdk.OperationResult operationResult, java.lang.Boolean completed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationResult, "operationResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completed, "completed");
        return powerwatch.matrix.com.pwgen2android.sdk.OperationResult.copy$default(operationResult, null, null, completed.booleanValue(), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-5, reason: not valid java name */
    public static final boolean m2164queue$lambda9$lambda5(powerwatch.matrix.com.pwgen2android.sdk.OperationResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return !it.getCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: queue$lambda-9$lambda-8, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2167queue$lambda9$lambda8(powerwatch.matrix.com.pwgen2android.sdk.OperationResult it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return it.getError() != null ? io.reactivex.Observable.error(it.getError()) : io.reactivex.Observable.just(it.getResult());
    }

    private final io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.OperationResult> createQueueObservable() {
        io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.sdk.OperationResult> observableAutoConnect = this.requestSubject.doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$n8idSlo5Rx1Rk66F3Y8q7NXdDCI
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2145createQueueObservable$lambda10(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation) obj);
            }
        }).concatMap(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$yMdkwxE7pJAG_T__VG_9-u-0a7E
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2146createQueueObservable$lambda15(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation) obj);
            }
        }).doOnNext(new io.reactivex.functions.Consumer() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$XBuO4wpwgMPK_s1q1YUxw34VJYk
            @Override // io.reactivex.functions.Consumer
            public final void accept(java.lang.Object obj) {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2151createQueueObservable$lambda16(this.f$0, (powerwatch.matrix.com.pwgen2android.sdk.OperationResult) obj);
            }
        }).repeat().retry().publish().autoConnect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(observableAutoConnect, "requestSubject\n                .doOnNext {\n//                    debug(\"New Operation Request arrived. Putting it into a queue.\")\n                    Log.d(TAG,\"New Operation Request arrived. Putting it into a queue.\")\n                    if (it.operationType == OperationType.Blocker) {\n                        blockingOperationWaiting.onNext((blockingOperationWaiting.value ?: 0) + 1)\n                    }\n                    println(\"notif_blocking: blocker count on insert - ${blockingOperationWaiting.value ?: 0}\")\n                }\n                .concatMap {\n                    return@concatMap Observable.defer {\n                        val currentOperationID = it.operationID\n//                        debug(\"Operation retrieved from a queue. Triggering operation with ID: $currentOperationID.\")\n                        Log.d(TAG,\"Operation retrieved from a queue. Triggering operation with ID: $currentOperationID.\")\n                        operationCompletionSubject.onNext(Pair(currentOperationID, false))\n                        it.operationObs\n                                .map { OperationResult(currentOperationID, it) }\n                                .onErrorReturn {\n                                    OperationResult(currentOperationID, error = it)\n                                }\n                                .doOnComplete {\n//                                    debug(\"Operation with ID: $currentOperationID completed.\")\n                                    Log.d(TAG,\"Operation with ID: $currentOperationID completed.\")\n\n                                    if (it.operationType == OperationType.Blocker) {\n                                        blockingOperationWaiting.onNext((blockingOperationWaiting.value ?: 1) - 1)\n                                    }\n                                    println(\"notif_blocking: blocker count after complete - ${blockingOperationWaiting.value ?: 0}\")\n\n                                    // this is pushed to signal that observable has terminated, so it could be disposed automatically\n                                    operationCompletionSubject.onNext(Pair(currentOperationID, true))\n                                }\n                    }\n                            .subscribeOn(Schedulers.from(operationScheduler))\n                }\n                .doOnNext {\n//                    debug(\"Operation progress event. Current operationID: ${it.operationID}\")\n                    Log.d(TAG,\"Operation progress event. Current operationID: ${it.operationID}\")\n                }\n                .repeat()\n                .retry()\n                .publish()\n                .autoConnect()");
        return observableAutoConnect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-10, reason: not valid java name */
    public static final void m2145createQueueObservable$lambda10(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation deviceCommunicationOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.TAG, "New Operation Request arrived. Putting it into a queue.");
        java.lang.Integer num = 0;
        if (kotlin.jvm.internal.Intrinsics.areEqual(deviceCommunicationOperation.getOperationType(), powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker.INSTANCE)) {
            io.reactivex.subjects.BehaviorSubject<java.lang.Integer> behaviorSubject = this$0.blockingOperationWaiting;
            java.lang.Integer value = behaviorSubject.getValue();
            if (value == null) {
                value = num;
            }
            behaviorSubject.onNext(java.lang.Integer.valueOf(value.intValue() + 1));
        }
        java.lang.Integer value2 = this$0.blockingOperationWaiting.getValue();
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("notif_blocking: blocker count on insert - ", value2 != null ? value2 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-15, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2146createQueueObservable$lambda15(final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return io.reactivex.Observable.defer(new java.util.concurrent.Callable() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$AaSVQCGpQPHmW78TMZSm2exebxU
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2147createQueueObservable$lambda15$lambda14(it, this$0);
            }
        }).subscribeOn(io.reactivex.schedulers.Schedulers.from(this$0.operationScheduler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-15$lambda-14, reason: not valid java name */
    public static final io.reactivex.ObservableSource m2147createQueueObservable$lambda15$lambda14(final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation it, final powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        final java.lang.String operationID = it.getOperationID();
        android.util.Log.d(this$0.TAG, "Operation retrieved from a queue. Triggering operation with ID: " + operationID + '.');
        this$0.operationCompletionSubject.onNext(new kotlin.Pair<>(operationID, false));
        return it.getOperationObs().map(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$PzVinEBibNKAVEoPvNtj1-ngOW0
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2148createQueueObservable$lambda15$lambda14$lambda11(operationID, obj);
            }
        }).onErrorReturn(new io.reactivex.functions.Function() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$W5xXFiz5_Jq-0VOeJCzknxilR1o
            @Override // io.reactivex.functions.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2149createQueueObservable$lambda15$lambda14$lambda12(operationID, (java.lang.Throwable) obj);
            }
        }).doOnComplete(new io.reactivex.functions.Action() { // from class: powerwatch.matrix.com.pwgen2android.sdk.-$$Lambda$DeviceCommunicationQueuerImpl$oeHuUTlyV3V-C4WADMWXwPXdLHo
            @Override // io.reactivex.functions.Action
            public final void run() {
                powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl.m2150createQueueObservable$lambda15$lambda14$lambda13(this.f$0, operationID, it);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-15$lambda-14$lambda-11, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.OperationResult m2148createQueueObservable$lambda15$lambda14$lambda11(java.lang.String currentOperationID, java.lang.Object it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentOperationID, "$currentOperationID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.sdk.OperationResult(currentOperationID, it, false, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-15$lambda-14$lambda-12, reason: not valid java name */
    public static final powerwatch.matrix.com.pwgen2android.sdk.OperationResult m2149createQueueObservable$lambda15$lambda14$lambda12(java.lang.String currentOperationID, java.lang.Throwable it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentOperationID, "$currentOperationID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        return new powerwatch.matrix.com.pwgen2android.sdk.OperationResult(currentOperationID, null, false, it, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-15$lambda-14$lambda-13, reason: not valid java name */
    public static final void m2150createQueueObservable$lambda15$lambda14$lambda13(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0, java.lang.String currentOperationID, powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationOperation it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentOperationID, "$currentOperationID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "$it");
        android.util.Log.d(this$0.TAG, "Operation with ID: " + currentOperationID + " completed.");
        if (kotlin.jvm.internal.Intrinsics.areEqual(it.getOperationType(), powerwatch.matrix.com.pwgen2android.sdk.OperationType.Blocker.INSTANCE)) {
            io.reactivex.subjects.BehaviorSubject<java.lang.Integer> behaviorSubject = this$0.blockingOperationWaiting;
            java.lang.Integer value = behaviorSubject.getValue();
            if (value == null) {
                value = 1;
            }
            behaviorSubject.onNext(java.lang.Integer.valueOf(value.intValue() - 1));
        }
        java.lang.Integer value2 = this$0.blockingOperationWaiting.getValue();
        if (value2 == null) {
            value2 = 0;
        }
        java.lang.System.out.println((java.lang.Object) kotlin.jvm.internal.Intrinsics.stringPlus("notif_blocking: blocker count after complete - ", value2));
        this$0.operationCompletionSubject.onNext(new kotlin.Pair<>(currentOperationID, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createQueueObservable$lambda-16, reason: not valid java name */
    public static final void m2151createQueueObservable$lambda16(powerwatch.matrix.com.pwgen2android.sdk.DeviceCommunicationQueuerImpl this$0, powerwatch.matrix.com.pwgen2android.sdk.OperationResult operationResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        android.util.Log.d(this$0.TAG, kotlin.jvm.internal.Intrinsics.stringPlus("Operation progress event. Current operationID: ", operationResult.getOperationID()));
    }
}
