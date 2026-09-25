package kotlinx.coroutines;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u00052\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0087\b\u001a\u0012\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\n\u0010\f\u001a\u00020\b*\u00020\u0002\u001a\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u001a\u0011\u0010\u000f\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\f\u001a\u0015\u0010\u0010\u001a\u00020\b*\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\n\u0010\u0012\u001a\u00020\b*\u00020\u0002\u001a\u0018\u0010\u0012\u001a\u00020\b*\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u001a\n\u0010\u0012\u001a\u00020\b*\u00020\n\u001a\u0018\u0010\u0012\u001a\u00020\b*\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0005H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"isActive", "", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)Z", "DisposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "block", "Lkotlin/Function0;", "", "Job", "Lkotlinx/coroutines/Job;", "parent", "cancel", "cause", "", "cancel0", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelChildren", "disposeOnCompletion", "handle", "kotlinx-coroutines-core"}, k = 5, mv = {1, 1, 13}, xs = "kotlinx/coroutines/JobKt")
final /* synthetic */ class JobKt__JobKt {
    public static final kotlinx.coroutines.Job Job(kotlinx.coroutines.Job job) {
        return new kotlinx.coroutines.JobImpl(job);
    }

    public static /* synthetic */ kotlinx.coroutines.Job Job$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = (kotlinx.coroutines.Job) null;
        }
        return kotlinx.coroutines.JobKt.Job(job);
    }

    public static final kotlinx.coroutines.DisposableHandle DisposableHandle(final kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        return new kotlinx.coroutines.DisposableHandle() { // from class: kotlinx.coroutines.JobKt__JobKt.DisposableHandle.1
            @Override // kotlinx.coroutines.DisposableHandle
            public void dispose() {
                block.invoke();
            }
        };
    }

    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(kotlinx.coroutines.Job receiver$0, kotlinx.coroutines.DisposableHandle handle) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(handle, "handle");
        return receiver$0.invokeOnCompletion(new kotlinx.coroutines.DisposeOnCompletion(receiver$0, handle));
    }

    public static final java.lang.Object cancelAndJoin(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        job.cancel();
        return job.join(continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancelChildren() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancelChildren()", imports = {}))
    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job job, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = (java.lang.Throwable) null;
        }
        kotlinx.coroutines.JobKt.cancelChildren(job, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancelChildren() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancelChildren()", imports = {}))
    public static final void cancelChildren(kotlinx.coroutines.Job receiver$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        java.util.Iterator<kotlinx.coroutines.Job> it = receiver$0.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel(th);
        }
    }

    public static final void cancelChildren(kotlinx.coroutines.Job receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        java.util.Iterator<kotlinx.coroutines.Job> it = receiver$0.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public static final boolean isActive(kotlin.coroutines.CoroutineContext receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        return job != null && job.isActive();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /* JADX INFO: renamed from: cancel, reason: collision with other method in class */
    public static final /* synthetic */ boolean m1402cancel(kotlin.coroutines.CoroutineContext receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            return true;
        }
        job.cancel();
        return true;
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext receiver$0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            job.cancel();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancel() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {}))
    public static /* synthetic */ boolean cancel$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = (java.lang.Throwable) null;
        }
        return kotlinx.coroutines.JobKt.cancel(coroutineContext, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancel() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancel()", imports = {}))
    public static final boolean cancel(kotlin.coroutines.CoroutineContext receiver$0, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job.cancel(th);
        }
        return false;
    }

    public static final void cancelChildren(kotlin.coroutines.CoroutineContext receiver$0) {
        kotlin.sequences.Sequence<kotlinx.coroutines.Job> children;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancelChildren() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancelChildren()", imports = {}))
    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = (java.lang.Throwable) null;
        }
        kotlinx.coroutines.JobKt.cancelChildren(coroutineContext, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use cancelChildren() without cause", replaceWith = @kotlin.ReplaceWith(expression = "cancelChildren()", imports = {}))
    public static final void cancelChildren(kotlin.coroutines.CoroutineContext receiver$0, java.lang.Throwable th) {
        kotlin.sequences.Sequence<kotlinx.coroutines.Job> children;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) receiver$0.get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(th);
        }
    }
}
