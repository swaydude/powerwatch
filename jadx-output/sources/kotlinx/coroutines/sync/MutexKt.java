package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u001a5\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018*\u00020\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001cH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\"\u0016\u0010\u000f\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003\"\u0016\u0010\u0011\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"EMPTY_LOCKED", "Lkotlinx/coroutines/sync/Empty;", "EMPTY_LOCKED$annotations", "()V", "EMPTY_UNLOCKED", "EMPTY_UNLOCKED$annotations", "ENQUEUE_FAIL", "Lkotlinx/coroutines/internal/Symbol;", "ENQUEUE_FAIL$annotations", "LOCKED", "LOCKED$annotations", "LOCK_FAIL", "LOCK_FAIL$annotations", "SELECT_SUCCESS", "SELECT_SUCCESS$annotations", "UNLOCKED", "UNLOCKED$annotations", "UNLOCK_FAIL", "UNLOCK_FAIL$annotations", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class MutexKt {
    private static final kotlinx.coroutines.sync.Empty EMPTY_LOCKED;
    private static final kotlinx.coroutines.sync.Empty EMPTY_UNLOCKED;
    private static final kotlinx.coroutines.internal.Symbol LOCKED;
    private static final kotlinx.coroutines.internal.Symbol UNLOCKED;
    private static final kotlinx.coroutines.internal.Symbol LOCK_FAIL = new kotlinx.coroutines.internal.Symbol("LOCK_FAIL");
    private static final kotlinx.coroutines.internal.Symbol ENQUEUE_FAIL = new kotlinx.coroutines.internal.Symbol("ENQUEUE_FAIL");
    private static final kotlinx.coroutines.internal.Symbol UNLOCK_FAIL = new kotlinx.coroutines.internal.Symbol("UNLOCK_FAIL");
    private static final kotlinx.coroutines.internal.Symbol SELECT_SUCCESS = new kotlinx.coroutines.internal.Symbol("SELECT_SUCCESS");

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086Hø\u0001\u0000"}, d2 = {"withLock", "", "T", "Lkotlinx/coroutines/sync/Mutex;", "owner", "action", "Lkotlin/Function0;", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 1, 13})
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {108}, m = "withLock", n = {"$receiver", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.sync.MutexKt.withLock(null, null, null, this);
        }
    }

    private static /* synthetic */ void EMPTY_LOCKED$annotations() {
    }

    private static /* synthetic */ void EMPTY_UNLOCKED$annotations() {
    }

    private static /* synthetic */ void ENQUEUE_FAIL$annotations() {
    }

    private static /* synthetic */ void LOCKED$annotations() {
    }

    private static /* synthetic */ void LOCK_FAIL$annotations() {
    }

    private static /* synthetic */ void SELECT_SUCCESS$annotations() {
    }

    private static /* synthetic */ void UNLOCKED$annotations() {
    }

    private static /* synthetic */ void UNLOCK_FAIL$annotations() {
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean z) {
        return new kotlinx.coroutines.sync.MutexImpl(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.sync.MutexKt.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.sync.MutexKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.sync.MutexKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.sync.MutexKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.sync.MutexKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj2 = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (kotlin.jvm.functions.Function0) anonymousClass1.L$2;
            obj = anonymousClass1.L$1;
            mutex = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$0;
            if (obj2 instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) obj2).exception;
            }
        } else {
            if (obj2 instanceof kotlin.Result.Failure) {
                throw ((kotlin.Result.Failure) obj2).exception;
            }
            anonymousClass1.L$0 = mutex;
            anonymousClass1.L$1 = obj;
            anonymousClass1.L$2 = function0;
            anonymousClass1.label = 1;
            if (mutex.lock(obj, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    private static final java.lang.Object withLock$$forInline(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(obj, continuation);
        kotlin.jvm.internal.InlineMarker.mark(2);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    static {
        kotlinx.coroutines.internal.Symbol symbol = new kotlinx.coroutines.internal.Symbol("LOCKED");
        LOCKED = symbol;
        kotlinx.coroutines.internal.Symbol symbol2 = new kotlinx.coroutines.internal.Symbol("UNLOCKED");
        UNLOCKED = symbol2;
        EMPTY_LOCKED = new kotlinx.coroutines.sync.Empty(symbol);
        EMPTY_UNLOCKED = new kotlinx.coroutines.sync.Empty(symbol2);
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(obj, continuation);
        kotlin.jvm.internal.InlineMarker.mark(2);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
