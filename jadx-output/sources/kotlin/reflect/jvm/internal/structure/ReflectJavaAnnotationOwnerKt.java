package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaAnnotationOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"findAnnotation", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "", "", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "([Ljava/lang/annotation/Annotation;Lorg/jetbrains/kotlin/name/FqName;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "", "([Ljava/lang/annotation/Annotation;)Ljava/util/List;", "descriptors.runtime"}, k = 2, mv = {1, 1, 15})
public final class ReflectJavaAnnotationOwnerKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation> getAnnotations(java.lang.annotation.Annotation[] getAnnotations) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getAnnotations, "$this$getAnnotations");
        java.util.ArrayList arrayList = new java.util.ArrayList(getAnnotations.length);
        for (java.lang.annotation.Annotation annotation : getAnnotations) {
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation(annotation));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static final kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation findAnnotation(java.lang.annotation.Annotation[] findAnnotation, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(findAnnotation, "$this$findAnnotation");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        for (java.lang.annotation.Annotation annotation : findAnnotation) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation))).asSingleFqName(), fqName)) {
                if (annotation != null) {
                    return new kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation(annotation);
        }
        return null;
    }
}
