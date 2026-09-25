package kotlin.reflect.jvm.internal.calls;

/* JADX INFO: compiled from: ThrowingCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "()V", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 1, 15})
public final class ThrowingCaller implements kotlin.reflect.jvm.internal.calls.Caller {
    public static final kotlin.reflect.jvm.internal.calls.ThrowingCaller INSTANCE = new kotlin.reflect.jvm.internal.calls.ThrowingCaller();

    public java.lang.Void getMember() {
        return null;
    }

    private ThrowingCaller() {
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public /* bridge */ /* synthetic */ java.lang.reflect.Member mo1260getMember() {
        return (java.lang.reflect.Member) getMember();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.util.List<java.lang.reflect.Type> getParameterTypes() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.lang.reflect.Type getReturnType() {
        java.lang.Class cls = java.lang.Void.TYPE;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(cls, "Void.TYPE");
        return cls;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(args, "args");
        throw new java.lang.UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}
