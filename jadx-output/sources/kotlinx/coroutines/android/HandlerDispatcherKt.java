package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0011\u0010\b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a\u001d\u0010\u000f\u001a\u00020\u0003*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\b\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Main$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 1, 13})
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final kotlinx.coroutines.android.HandlerDispatcher Main;
    private static volatile android.view.Choreographer choreographer;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void Main$annotations() {
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ kotlinx.coroutines.android.HandlerDispatcher from$default(android.os.Handler handler, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = (java.lang.String) null;
        }
        return from(handler, str);
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler receiver$0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        return new kotlinx.coroutines.android.HandlerContext(receiver$0, str);
    }

    public static final android.os.Handler asHandler(android.os.Looper receiver$0, boolean z) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (!z || android.os.Build.VERSION.SDK_INT < 16) {
            return new android.os.Handler(receiver$0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.lang.Object objInvoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, receiver$0);
            if (objInvoke != null) {
                return (android.os.Handler) objInvoke;
            }
            throw new kotlin.TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            java.lang.reflect.Constructor declaredConstructor = android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            java.lang.Object objNewInstance = declaredConstructor.newInstance(receiver$0, null, true);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objNewInstance, "constructor.newInstance(this, null, true)");
            return (android.os.Handler) objNewInstance;
        } catch (java.lang.NoSuchMethodException unused) {
            return new android.os.Handler(receiver$0);
        }
    }

    static {
        java.lang.Object objM13constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
            objM13constructorimpl = kotlin.Result.m13constructorimpl(new kotlinx.coroutines.android.HandlerContext(asHandler(mainLooper, true), "Main"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM13constructorimpl = kotlin.Result.m13constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m19isFailureimpl(objM13constructorimpl)) {
            objM13constructorimpl = null;
        }
        Main = (kotlinx.coroutines.android.HandlerDispatcher) objM13constructorimpl;
    }

    public static final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        android.view.Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            postFrameCallback(choreographer2, cancellableContinuationImpl);
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
        kotlinx.coroutines.Dispatchers.getMain().mo1406dispatch(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, new java.lang.Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$$special$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.android.HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(cancellableContinuationImpl3);
            }
        });
        java.lang.Object result2 = cancellableContinuationImpl2.getResult();
        if (result2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> cancellableContinuation) {
        android.view.Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = android.view.Choreographer.getInstance();
            if (choreographer2 == null) {
                kotlin.jvm.internal.Intrinsics.throwNpe();
            }
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(android.view.Choreographer choreographer2, final kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new android.view.Choreographer.FrameCallback() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt.postFrameCallback.1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                cancellableContinuation.resumeUndispatched(kotlinx.coroutines.Dispatchers.getMain(), java.lang.Long.valueOf(j));
            }
        });
    }
}
