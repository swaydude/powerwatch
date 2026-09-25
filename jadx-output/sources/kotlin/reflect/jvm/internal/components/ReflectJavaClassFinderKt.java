package kotlin.reflect.jvm.internal.components;

/* JADX INFO: compiled from: ReflectJavaClassFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"tryLoadClass", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "fqName", "", "descriptors.runtime"}, k = 2, mv = {1, 1, 15})
public final class ReflectJavaClassFinderKt {
    public static final java.lang.Class<?> tryLoadClass(java.lang.ClassLoader tryLoadClass, java.lang.String fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(tryLoadClass, "$this$tryLoadClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        try {
            return tryLoadClass.loadClass(fqName);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }
}
