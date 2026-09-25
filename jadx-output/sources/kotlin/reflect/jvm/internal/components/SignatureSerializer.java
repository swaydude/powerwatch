package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: ReflectKotlinClass.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD, "Ljava/lang/reflect/Method;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
final class SignatureSerializer {
    public static final kotlin.reflect.jvm.internal.components.SignatureSerializer INSTANCE = new kotlin.reflect.jvm.internal.components.SignatureSerializer();

    private SignatureSerializer() {
    }

    public final java.lang.String methodDesc(java.lang.reflect.Method method) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(method, "method");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        for (java.lang.Class<?> parameterType : method.getParameterTypes()) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterType, "parameterType");
            sb.append(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(parameterType));
        }
        sb.append(")");
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(returnType, "method.returnType");
        sb.append(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(returnType));
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "sb.toString()");
        return string;
    }

    public final java.lang.String constructorDesc(java.lang.reflect.Constructor<?> constructor) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(constructor, "constructor");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        for (java.lang.Class<?> parameterType : constructor.getParameterTypes()) {
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(parameterType, "parameterType");
            sb.append(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(parameterType));
        }
        sb.append(")V");
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(string, "sb.toString()");
        return string;
    }

    public final java.lang.String fieldDesc(java.lang.reflect.Field field) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(field, "field");
        java.lang.Class<?> type = field.getType();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(type, "field.type");
        return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getDesc(type);
    }
}
