package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaAnnotationsKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations resolveAnnotations(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext resolveAnnotations, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner annotationsOwner) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(resolveAnnotations, "$this$resolveAnnotations");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotationsOwner, "annotationsOwner");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(resolveAnnotations, annotationsOwner);
    }
}
