package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\r\u001a\u00020\u000eH\u0000\u001a\b\u0010\u000f\u001a\u00020\u0010H\u0000\u001a4\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0017H\u0080\b¢\u0006\u0002\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\n*\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\nH\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"COROUTINES_SCHEDULER_PROPERTY_NAME", "", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "DEBUG_THREAD_NAME_SEPARATOR", "useCoroutinesScheduler", "", "getUseCoroutinesScheduler", "()Z", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "createDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "resetCoroutineId", "", "withCoroutineContext", "T", "context", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "newCoroutineContext", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class CoroutineContextKt {
    public static final java.lang.String COROUTINES_SCHEDULER_PROPERTY_NAME = "kotlinx.coroutines.scheduler";
    private static final java.util.concurrent.atomic.AtomicLong COROUTINE_ID = new java.util.concurrent.atomic.AtomicLong();
    private static final java.lang.String DEBUG_THREAD_NAME_SEPARATOR = " @";
    private static final boolean useCoroutinesScheduler;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r0.equals("") != false) goto L19;
     */
    static {
        /*
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            kotlinx.coroutines.CoroutineContextKt.COROUTINE_ID = r0
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0)
            if (r0 != 0) goto L10
            goto L3a
        L10:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L32
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L29
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L3e
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3e
            r0 = 0
            goto L3b
        L29:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3e
            goto L3a
        L32:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3e
        L3a:
            r0 = 1
        L3b:
            kotlinx.coroutines.CoroutineContextKt.useCoroutinesScheduler = r0
            return
        L3e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineContextKt.<clinit>():void");
    }

    public static final void resetCoroutineId() {
        COROUTINE_ID.set(0L);
    }

    public static final boolean getUseCoroutinesScheduler() {
        return useCoroutinesScheduler;
    }

    public static final kotlinx.coroutines.CoroutineDispatcher createDefaultDispatcher() {
        return useCoroutinesScheduler ? kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE : kotlinx.coroutines.CommonPool.INSTANCE;
    }

    public static final kotlin.coroutines.CoroutineContext newCoroutineContext(kotlinx.coroutines.CoroutineScope receiver$0, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.coroutines.CoroutineContext coroutineContextPlus = receiver$0.getCoroutineContext().plus(context);
        kotlin.coroutines.CoroutineContext coroutineContextPlus2 = kotlinx.coroutines.DebugKt.DEBUG ? coroutineContextPlus.plus(new kotlinx.coroutines.CoroutineId(COROUTINE_ID.incrementAndGet())) : coroutineContextPlus;
        return (coroutineContextPlus == kotlinx.coroutines.Dispatchers.getDefault() || coroutineContextPlus.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE) != null) ? coroutineContextPlus2 : coroutineContextPlus2.plus(kotlinx.coroutines.Dispatchers.getDefault());
    }

    public static final <T> T withCoroutineContext(kotlin.coroutines.CoroutineContext context, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(block, "block");
        java.lang.Object objUpdateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj);
        try {
            return block.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static final java.lang.String getCoroutineName(kotlin.coroutines.CoroutineContext receiver$0) {
        kotlinx.coroutines.CoroutineId coroutineId;
        java.lang.String name;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(receiver$0, "receiver$0");
        if (!kotlinx.coroutines.DebugKt.DEBUG || (coroutineId = (kotlinx.coroutines.CoroutineId) receiver$0.get(kotlinx.coroutines.CoroutineId.INSTANCE)) == null) {
            return null;
        }
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) receiver$0.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        return name + '#' + coroutineId.getId();
    }
}
