package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0004¢\u0006\u0002\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "member", "getMember", "()Ljava/lang/reflect/Method;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", "", "instance", "args", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public abstract class InternalUnderlyingValOfInlineClass implements kotlin.reflect.jvm.internal.calls.Caller<java.lang.reflect.Method> {
    private final java.util.List<java.lang.reflect.Type> parameterTypes;
    private final java.lang.reflect.Type returnType;
    private final java.lang.reflect.Method unboxMethod;

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public final java.lang.reflect.Method mo1260getMember() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InternalUnderlyingValOfInlineClass(java.lang.reflect.Method method, java.util.List<? extends java.lang.reflect.Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "unboxMethod.returnType");
        this.returnType = returnType;
    }

    public /* synthetic */ InternalUnderlyingValOfInlineClass(java.lang.reflect.Method method, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    public void checkArguments(java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        kotlin.reflect.jvm.internal.calls.Caller.DefaultImpls.checkArguments(this, args);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final java.lang.reflect.Type getReturnType() {
        return this.returnType;
    }

    protected final java.lang.Object callMethod(java.lang.Object instance, java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        return this.unboxMethod.invoke(instance, java.util.Arrays.copyOf(args, args.length));
    }

    /* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Unbound extends kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unbound(java.lang.reflect.Method unboxMethod) {
            super(unboxMethod, kotlin.collections.CollectionsKt.listOf(unboxMethod.getDeclaringClass()), null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(unboxMethod, "unboxMethod");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            java.lang.Object[] objArrCopyOfRange;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            java.lang.Object obj = args[0];
            kotlin.reflect.jvm.internal.calls.CallerImpl.Companion companion = kotlin.reflect.jvm.internal.calls.CallerImpl.INSTANCE;
            if (args.length <= 1) {
                objArrCopyOfRange = new java.lang.Object[0];
            } else {
                objArrCopyOfRange = kotlin.collections.ArraysKt.copyOfRange(args, 1, args.length);
                if (objArrCopyOfRange == null) {
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return callMethod(obj, objArrCopyOfRange);
        }
    }

    /* JADX INFO: compiled from: InternalUnderlyingValOfInlineClass.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000bR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "unboxMethod", "Ljava/lang/reflect/Method;", "boundReceiver", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
    public static final class Bound extends kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass implements kotlin.reflect.jvm.internal.calls.BoundCaller {
        private final java.lang.Object boundReceiver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bound(java.lang.reflect.Method unboxMethod, java.lang.Object obj) {
            super(unboxMethod, kotlin.collections.CollectionsKt.emptyList(), null);
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(unboxMethod, "unboxMethod");
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public java.lang.Object call(java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
            checkArguments(args);
            return callMethod(this.boundReceiver, args);
        }
    }
}
