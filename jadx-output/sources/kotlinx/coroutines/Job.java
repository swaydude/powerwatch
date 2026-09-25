package kotlinx.coroutines;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 )2\u00020\u0001:\u0001)J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H&J\u0014\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H'J\r\u0010\u0017\u001a\u00020\u0007H\u0017¢\u0006\u0002\b\u0013J\f\u0010\u0018\u001a\u00060\u0019j\u0002`\u001aH'JE\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072'\u0010\u001f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140 j\u0002`#H'J1\u0010\u001b\u001a\u00020\u001c2'\u0010\u001f\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140 j\u0002`#H&J\u0011\u0010$\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010%J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0097\u0002J\b\u0010(\u001a\u00020\u0007H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0012\u0010\t\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\bR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "cancel0", "getCancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus", com.google.android.gms.fitness.FitnessActivities.OTHER, "start", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public interface Job extends kotlin.coroutines.CoroutineContext.Element {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.Job.Companion INSTANCE = kotlinx.coroutines.Job.Companion.$$INSTANCE;

    kotlinx.coroutines.ChildHandle attachChild(kotlinx.coroutines.ChildJob child);

    void cancel();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Left here for binary compatibility")
    /* JADX INFO: renamed from: cancel, reason: collision with other method in class */
    /* synthetic */ boolean mo1400cancel();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use CompletableDeferred.completeExceptionally(cause) or Job.cancel() instead", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {}))
    boolean cancel(java.lang.Throwable cause);

    java.util.concurrent.CancellationException getCancellationException();

    kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren();

    kotlinx.coroutines.selects.SelectClause0 getOnJoin();

    kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler);

    kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    java.lang.Object join(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    kotlinx.coroutines.Job plus(kotlinx.coroutines.Job other);

    boolean start();

    /* JADX INFO: renamed from: kotlinx.coroutines.Job$Key, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Job.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/Job$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Job;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.Job> {
        static final /* synthetic */ kotlinx.coroutines.Job.Companion $$INSTANCE = new kotlinx.coroutines.Job.Companion();

        static {
            kotlinx.coroutines.CoroutineExceptionHandler.Companion companion = kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Job.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        public static <R> R fold(kotlinx.coroutines.Job job, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(operation, "operation");
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(job, r, operation);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlinx.coroutines.Job job, kotlin.coroutines.CoroutineContext.Key<E> key) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(job, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(kotlinx.coroutines.Job job, kotlin.coroutines.CoroutineContext.Key<?> key) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(key, "key");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(job, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(kotlinx.coroutines.Job job, kotlin.coroutines.CoroutineContext context) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(job, context);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static kotlinx.coroutines.Job plus(kotlinx.coroutines.Job job, kotlinx.coroutines.Job other) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(other, "other");
            return other;
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use CompletableDeferred.completeExceptionally(cause) or Job.cancel() instead", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {}))
        public static /* synthetic */ boolean cancel$default(kotlinx.coroutines.Job job, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = (java.lang.Throwable) null;
            }
            return job.cancel(th);
        }

        public static /* synthetic */ kotlinx.coroutines.DisposableHandle invokeOnCompletion$default(kotlinx.coroutines.Job job, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return job.invokeOnCompletion(z, z2, function1);
        }
    }
}
