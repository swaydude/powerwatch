package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaTypeParameter.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "element$annotations", "()V", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "", "hashCode", "", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaTypeParameter extends kotlin.reflect.jvm.internal.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner {
    private final java.lang.reflect.TypeVariable<?> typeVariable;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.getAnnotations(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public ReflectJavaTypeParameter(java.lang.reflect.TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeVariable, "typeVariable");
        this.typeVariable = typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
    public java.util.List<kotlin.reflect.jvm.internal.structure.ReflectJavaClassifierType> getUpperBounds() {
        java.lang.reflect.Type[] bounds = this.typeVariable.getBounds();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(bounds, "typeVariable.bounds");
        java.util.ArrayList arrayList = new java.util.ArrayList(bounds.length);
        for (java.lang.reflect.Type type : bounds) {
            arrayList.add(new kotlin.reflect.jvm.internal.structure.ReflectJavaClassifierType(type));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.structure.ReflectJavaClassifierType reflectJavaClassifierType = (kotlin.reflect.jvm.internal.structure.ReflectJavaClassifierType) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) arrayList2);
        return kotlin.jvm.internal.Intrinsics.areEqual(reflectJavaClassifierType != null ? reflectJavaClassifierType.getReflectType() : null, java.lang.Object.class) ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner
    public java.lang.reflect.AnnotatedElement getElement() {
        java.lang.reflect.TypeVariable<?> typeVariable = this.typeVariable;
        if (!(typeVariable instanceof java.lang.reflect.AnnotatedElement)) {
            typeVariable = null;
        }
        return (java.lang.reflect.AnnotatedElement) typeVariable;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name nameIdentifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(this.typeVariable.getName());
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nameIdentifier, "Name.identifier(typeVariable.name)");
        return nameIdentifier;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeVariable, ((kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter) other).typeVariable);
    }

    public int hashCode() {
        return this.typeVariable.hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + this.typeVariable;
    }
}
