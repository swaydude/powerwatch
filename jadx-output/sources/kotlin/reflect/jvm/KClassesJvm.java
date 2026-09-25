package kotlin.reflect.jvm;

/* JADX INFO: compiled from: KClassesJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"jvmName", "", "Lkotlin/reflect/KClass;", "getJvmName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "kotlin-reflection"}, k = 2, mv = {1, 1, 15})
public final class KClassesJvm {
    public static final java.lang.String getJvmName(kotlin.reflect.KClass<?> jvmName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(jvmName, "$this$jvmName");
        java.lang.String name = ((kotlin.reflect.jvm.internal.KClassImpl) jvmName).getJClass().getName();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(name, "(this as KClassImpl).jClass.name");
        return name;
    }
}
