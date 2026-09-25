package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* JADX INFO: compiled from: KotlinClassFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinClassFinderKt {
    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder findKotlinClass, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findKotlinClass, "$this$findKotlinClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(classId, "classId");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result resultFindKotlinClassOrContent = findKotlinClass.findKotlinClassOrContent(classId);
        if (resultFindKotlinClassOrContent != null) {
            return resultFindKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass findKotlinClass(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder findKotlinClass, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findKotlinClass, "$this$findKotlinClass");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaClass, "javaClass");
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result resultFindKotlinClassOrContent = findKotlinClass.findKotlinClassOrContent(javaClass);
        if (resultFindKotlinClassOrContent != null) {
            return resultFindKotlinClassOrContent.toKotlinJvmBinaryClass();
        }
        return null;
    }
}
