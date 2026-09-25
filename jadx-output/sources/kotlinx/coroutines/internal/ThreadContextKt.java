package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"ZERO", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "restoreState", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class ThreadContextKt {
    private static final kotlinx.coroutines.internal.Symbol ZERO = new kotlinx.coroutines.internal.Symbol("ZERO");
    private static final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object> countAll = new kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.CoroutineContext.Element, java.lang.Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.CoroutineContext.Element element) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
            if (!(element instanceof kotlinx.coroutines.ThreadContextElement)) {
                return obj;
            }
            if (!(obj instanceof java.lang.Integer)) {
                obj = null;
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element : java.lang.Integer.valueOf(iIntValue + 1);
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>> findOne = new kotlin.jvm.functions.Function2<kotlinx.coroutines.ThreadContextElement<?>, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.ThreadContextElement<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlinx.coroutines.ThreadContextElement<?> invoke(kotlinx.coroutines.ThreadContextElement<?> threadContextElement, kotlin.coroutines.CoroutineContext.Element element) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
            if (threadContextElement != null) {
                return threadContextElement;
            }
            if (!(element instanceof kotlinx.coroutines.ThreadContextElement)) {
                element = null;
            }
            return (kotlinx.coroutines.ThreadContextElement) element;
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> updateState = new kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlinx.coroutines.internal.ThreadState invoke(kotlinx.coroutines.internal.ThreadState state, kotlin.coroutines.CoroutineContext.Element element) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(state, "state");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
            if (element instanceof kotlinx.coroutines.ThreadContextElement) {
                state.append(((kotlinx.coroutines.ThreadContextElement) element).updateThreadContext(state.getContext()));
            }
            return state;
        }
    };
    private static final kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState> restoreState = new kotlin.jvm.functions.Function2<kotlinx.coroutines.internal.ThreadState, kotlin.coroutines.CoroutineContext.Element, kotlinx.coroutines.internal.ThreadState>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$restoreState$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlinx.coroutines.internal.ThreadState invoke(kotlinx.coroutines.internal.ThreadState state, kotlin.coroutines.CoroutineContext.Element element) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(state, "state");
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(element, "element");
            if (element instanceof kotlinx.coroutines.ThreadContextElement) {
                ((kotlinx.coroutines.ThreadContextElement) element).restoreThreadContext(state.getContext(), state.take());
            }
            return state;
        }
    };

    public static final java.lang.Object threadContextElements(kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        java.lang.Object objFold = context.fold(0, countAll);
        if (objFold == null) {
            kotlin.jvm.internal.Intrinsics.throwNpe();
        }
        return objFold;
    }

    public static final java.lang.Object updateThreadContext(kotlin.coroutines.CoroutineContext context, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        if (obj == null) {
            obj = threadContextElements(context);
        }
        if (obj == 0) {
            return ZERO;
        }
        if (obj instanceof java.lang.Integer) {
            return context.fold(new kotlinx.coroutines.internal.ThreadState(context, ((java.lang.Number) obj).intValue()), updateState);
        }
        if (obj == null) {
            throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        return ((kotlinx.coroutines.ThreadContextElement) obj).updateThreadContext(context);
    }

    public static final void restoreThreadContext(kotlin.coroutines.CoroutineContext context, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        if (obj == ZERO) {
            return;
        }
        if (obj instanceof kotlinx.coroutines.internal.ThreadState) {
            ((kotlinx.coroutines.internal.ThreadState) obj).start();
            context.fold(obj, restoreState);
        } else {
            java.lang.Object objFold = context.fold(null, findOne);
            if (objFold == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((kotlinx.coroutines.ThreadContextElement) objFold).restoreThreadContext(context, obj);
        }
    }
}
