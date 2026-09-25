package kotlin.reflect.jvm.internal;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class RuntimeTypeMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getSignature(java.lang.reflect.Method method) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(method.getName());
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterTypes, "parameterTypes");
        sb.append(kotlin.collections.ArraysKt.joinToString$default(parameterTypes, "", "(", ")", 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.String>() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$signature$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(java.lang.Class<?> it) {
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(it, "it");
                return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(it);
            }
        }, 24, (java.lang.Object) null));
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "returnType");
        sb.append(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(returnType));
        return sb.toString();
    }
}
