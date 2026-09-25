package io.reactivex.rxkotlin;

/* JADX INFO: compiled from: subscribers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\n*\u00020\u0007*\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001a\u0012\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0002\u001aX\u0010\u000e\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aX\u0010\u000e\u001a\u00020\u0002\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001a2\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001aX\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aX\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00172\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aX\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00132\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\u001aH\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\n*\u00020\u0007*\b\u0012\u0004\u0012\u0002H\n0\u00192\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00020\u0004H\u0007\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"onCompleteStub", "Lkotlin/Function0;", "", "onErrorStub", "Lkotlin/Function1;", "", "onNextStub", "", "asConsumer", "Lio/reactivex/functions/Consumer;", "T", "asOnCompleteAction", "Lio/reactivex/functions/Action;", "asOnErrorConsumer", "blockingSubscribeBy", "Lio/reactivex/Flowable;", "onError", "onComplete", "onNext", "Lio/reactivex/Observable;", "subscribeBy", "Lio/reactivex/disposables/Disposable;", "Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "onSuccess", "Lio/reactivex/Single;", "rxkotlin"}, k = 2, mv = {1, 1, 11})
public final class SubscribersKt {
    private static final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> onNextStub = new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onNextStub$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj) {
            invoke2(obj);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Object it) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onErrorStub = new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onErrorStub$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
            invoke2(th);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(java.lang.Throwable it) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
        }
    };
    private static final kotlin.jvm.functions.Function0<kotlin.Unit> onCompleteStub = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: io.reactivex.rxkotlin.SubscribersKt$onCompleteStub$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            invoke2();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    };

    private static final <T> io.reactivex.functions.Consumer<T> asConsumer(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (function1 == onNextStub) {
            io.reactivex.functions.Consumer<T> consumerEmptyConsumer = io.reactivex.internal.functions.Functions.emptyConsumer();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(consumerEmptyConsumer, "Functions.emptyConsumer()");
            return consumerEmptyConsumer;
        }
        if (function1 != null) {
            function1 = (kotlin.jvm.functions.Function1<? super T, kotlin.Unit>) new io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0(function1);
        }
        return (io.reactivex.functions.Consumer) function1;
    }

    private static final io.reactivex.functions.Consumer<java.lang.Throwable> asOnErrorConsumer(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        java.lang.Object subscribersKt$sam$io_reactivex_functions_Consumer$0 = function1;
        if (function1 == onErrorStub) {
            io.reactivex.functions.Consumer<java.lang.Throwable> consumer = io.reactivex.internal.functions.Functions.ON_ERROR_MISSING;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(consumer, "Functions.ON_ERROR_MISSING");
            return consumer;
        }
        if (function1 != null) {
            subscribersKt$sam$io_reactivex_functions_Consumer$0 = new io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0(function1);
        }
        return (io.reactivex.functions.Consumer) subscribersKt$sam$io_reactivex_functions_Consumer$0;
    }

    private static final io.reactivex.functions.Action asOnCompleteAction(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        java.lang.Object subscribersKt$sam$io_reactivex_functions_Action$0 = function0;
        if (function0 == onCompleteStub) {
            io.reactivex.functions.Action action = io.reactivex.internal.functions.Functions.EMPTY_ACTION;
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(action, "Functions.EMPTY_ACTION");
            return action;
        }
        if (function0 != null) {
            subscribersKt$sam$io_reactivex_functions_Action$0 = new io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Action$0(function0);
        }
        return (io.reactivex.functions.Action) subscribersKt$sam$io_reactivex_functions_Action$0;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static /* bridge */ /* synthetic */ io.reactivex.disposables.Disposable subscribeBy$default(io.reactivex.Observable observable, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function0 = onCompleteStub;
        }
        if ((i & 4) != 0) {
            function2 = onNextStub;
        }
        return subscribeBy(observable, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, function2);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.disposables.Disposable subscribeBy(io.reactivex.Observable<T> receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        io.reactivex.disposables.Disposable disposableSubscribe = receiver.subscribe(asConsumer(onNext), asOnErrorConsumer(onError), asOnCompleteAction(onComplete));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static /* bridge */ /* synthetic */ io.reactivex.disposables.Disposable subscribeBy$default(io.reactivex.Flowable flowable, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function0 = onCompleteStub;
        }
        if ((i & 4) != 0) {
            function2 = onNextStub;
        }
        return subscribeBy(flowable, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, function2);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.disposables.Disposable subscribeBy(io.reactivex.Flowable<T> receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        io.reactivex.disposables.Disposable disposableSubscribe = receiver.subscribe(asConsumer(onNext), asOnErrorConsumer(onError), asOnCompleteAction(onComplete));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onNext.asConsu…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static /* bridge */ /* synthetic */ io.reactivex.disposables.Disposable subscribeBy$default(io.reactivex.Single single, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function2 = onNextStub;
        }
        return subscribeBy(single, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, function2);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.disposables.Disposable subscribeBy(io.reactivex.Single<T> receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onSuccess, "onSuccess");
        io.reactivex.disposables.Disposable disposableSubscribe = receiver.subscribe(asConsumer(onSuccess), asOnErrorConsumer(onError));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onSuccess.asCo…rror.asOnErrorConsumer())");
        return disposableSubscribe;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static /* bridge */ /* synthetic */ io.reactivex.disposables.Disposable subscribeBy$default(io.reactivex.Maybe maybe, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function0 = onCompleteStub;
        }
        if ((i & 4) != 0) {
            function2 = onNextStub;
        }
        return subscribeBy(maybe, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, function2);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final <T> io.reactivex.disposables.Disposable subscribeBy(io.reactivex.Maybe<T> receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onSuccess, "onSuccess");
        io.reactivex.disposables.Disposable disposableSubscribe = receiver.subscribe(asConsumer(onSuccess), asOnErrorConsumer(onError), asOnCompleteAction(onComplete));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe(onSuccess.asCo…ete.asOnCompleteAction())");
        return disposableSubscribe;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static /* bridge */ /* synthetic */ io.reactivex.disposables.Disposable subscribeBy$default(io.reactivex.Completable completable, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function0 = onCompleteStub;
        }
        return subscribeBy(completable, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.CheckReturnValue
    public static final io.reactivex.disposables.Disposable subscribeBy(io.reactivex.Completable receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1 = onErrorStub;
        if (onError == function1 && onComplete == onCompleteStub) {
            io.reactivex.disposables.Disposable disposableSubscribe = receiver.subscribe();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe, "subscribe()");
            return disposableSubscribe;
        }
        if (onError == function1) {
            io.reactivex.disposables.Disposable disposableSubscribe2 = receiver.subscribe(new io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Action$0(onComplete));
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe2, "subscribe(onComplete)");
            return disposableSubscribe2;
        }
        io.reactivex.disposables.Disposable disposableSubscribe3 = receiver.subscribe(asOnCompleteAction(onComplete), new io.reactivex.rxkotlin.SubscribersKt$sam$io_reactivex_functions_Consumer$0(onError));
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(disposableSubscribe3, "subscribe(onComplete.asO…ion(), Consumer(onError))");
        return disposableSubscribe3;
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    public static /* bridge */ /* synthetic */ void blockingSubscribeBy$default(io.reactivex.Observable observable, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function0 = onCompleteStub;
        }
        if ((i & 4) != 0) {
            function2 = onNextStub;
        }
        blockingSubscribeBy(observable, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, function2);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    public static final <T> void blockingSubscribeBy(io.reactivex.Observable<T> receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        receiver.blockingSubscribe(asConsumer(onNext), asOnErrorConsumer(onError), asOnCompleteAction(onComplete));
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public static /* bridge */ /* synthetic */ void blockingSubscribeBy$default(io.reactivex.Flowable flowable, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = onErrorStub;
        }
        if ((i & 2) != 0) {
            function0 = onCompleteStub;
        }
        if ((i & 4) != 0) {
            function2 = onNextStub;
        }
        blockingSubscribeBy(flowable, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, function2);
    }

    @io.reactivex.annotations.SchedulerSupport(io.reactivex.annotations.SchedulerSupport.NONE)
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.UNBOUNDED_IN)
    public static final <T> void blockingSubscribeBy(io.reactivex.Flowable<T> receiver, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, kotlin.jvm.functions.Function0<kotlin.Unit> onComplete, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(onNext, "onNext");
        receiver.blockingSubscribe(asConsumer(onNext), asOnErrorConsumer(onError), asOnCompleteAction(onComplete));
    }
}
