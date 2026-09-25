package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaAnnotation.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "annotation", "", "(Ljava/lang/annotation/Annotation;)V", "getAnnotation", "()Ljava/lang/annotation/Annotation;", "arguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "getArguments", "()Ljava/util/Collection;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "resolve", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaAnnotation extends kotlin.reflect.jvm.internal.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation {
    private final java.lang.annotation.Annotation annotation;

    public ReflectJavaAnnotation(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(annotation, "annotation");
        this.annotation = annotation;
    }

    public final java.lang.annotation.Annotation getAnnotation() {
        return this.annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public boolean isIdeExternalAnnotation() {
        return kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation.DefaultImpls.isIdeExternalAnnotation(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument> getArguments() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method[] declaredMethods = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(this.annotation)).getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.Companion companion = kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationArgument.INSTANCE;
            java.lang.Object objInvoke = method.invoke(this.annotation, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(objInvoke, "method.invoke(annotation)");
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(method, "method");
            arrayList.add(companion.create(objInvoke, kotlin.reflect.jvm.internal.impl.name.Name.identifier(method.getName())));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getClassId(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(this.annotation)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation
    public kotlin.reflect.jvm.internal.structure.ReflectJavaClass resolve() {
        return new kotlin.reflect.jvm.internal.structure.ReflectJavaClass(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(this.annotation)));
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation) && kotlin.jvm.internal.Intrinsics.areEqual(this.annotation, ((kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation) other).annotation);
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + this.annotation;
    }
}
