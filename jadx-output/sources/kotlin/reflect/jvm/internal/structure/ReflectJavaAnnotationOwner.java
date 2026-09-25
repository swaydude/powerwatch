package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaAnnotationOwner.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "isDeprecatedInJavaDoc", "", "()Z", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public interface ReflectJavaAnnotationOwner extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner {
    java.lang.reflect.AnnotatedElement getElement();

    /* JADX INFO: compiled from: ReflectJavaAnnotationOwner.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class DefaultImpls {
        public static boolean isDeprecatedInJavaDoc(kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            return false;
        }

        public static java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation> getAnnotations(kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner reflectJavaAnnotationOwner) {
            java.lang.annotation.Annotation[] declaredAnnotations;
            java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation> annotations;
            java.lang.reflect.AnnotatedElement element = reflectJavaAnnotationOwner.getElement();
            return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? kotlin.collections.CollectionsKt.emptyList() : annotations;
        }

        public static kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner reflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            java.lang.annotation.Annotation[] declaredAnnotations;
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
            java.lang.reflect.AnnotatedElement element = reflectJavaAnnotationOwner.getElement();
            if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
                return null;
            }
            return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
        }
    }
}
