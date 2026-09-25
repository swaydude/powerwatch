package kotlin.reflect.jvm.internal.structure;

/* JADX INFO: compiled from: ReflectJavaClassifierType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/Collection;", "classifier", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifier;", "getClassifier", "()Lorg/jetbrains/kotlin/load/java/structure/JavaClassifier;", "classifierQualifiedName", "", "getClassifierQualifiedName", "()Ljava/lang/String;", "isDeprecatedInJavaDoc", "", "()Z", "isRaw", "presentableText", "getPresentableText", "getReflectType", "()Ljava/lang/reflect/Type;", "typeArguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "getTypeArguments", "()Ljava/util/List;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"}, k = 1, mv = {1, 1, 15})
public final class ReflectJavaClassifierType extends kotlin.reflect.jvm.internal.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType {
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier classifier;
    private final java.lang.reflect.Type reflectType;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public ReflectJavaClassifierType(java.lang.reflect.Type reflectType) {
        kotlin.reflect.jvm.internal.structure.ReflectJavaClass reflectJavaClass;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(reflectType, "reflectType");
        this.reflectType = reflectType;
        java.lang.reflect.Type reflectType2 = getReflectType();
        if (reflectType2 instanceof java.lang.Class) {
            reflectJavaClass = new kotlin.reflect.jvm.internal.structure.ReflectJavaClass((java.lang.Class) reflectType2);
        } else if (reflectType2 instanceof java.lang.reflect.TypeVariable) {
            reflectJavaClass = new kotlin.reflect.jvm.internal.structure.ReflectJavaTypeParameter((java.lang.reflect.TypeVariable) reflectType2);
        } else {
            if (!(reflectType2 instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Not a classifier type (" + reflectType2.getClass() + "): " + reflectType2);
            }
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) reflectType2).getRawType();
            if (rawType == null) {
                throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
            reflectJavaClass = new kotlin.reflect.jvm.internal.structure.ReflectJavaClass((java.lang.Class) rawType);
        }
        this.classifier = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.structure.ReflectJavaType
    public java.lang.reflect.Type getReflectType() {
        return this.reflectType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public java.lang.String getClassifierQualifiedName() {
        throw new java.lang.UnsupportedOperationException("Type not found: " + getReflectType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public java.lang.String getPresentableText() {
        return getReflectType().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public boolean isRaw() {
        java.lang.reflect.Type reflectType = getReflectType();
        if (!(reflectType instanceof java.lang.Class)) {
            return false;
        }
        java.lang.reflect.TypeVariable[] typeParameters = ((java.lang.Class) reflectType).getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType> getTypeArguments() {
        java.util.List<java.lang.reflect.Type> parameterizedTypeArguments = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        kotlin.reflect.jvm.internal.structure.ReflectJavaType.Companion factory = kotlin.reflect.jvm.internal.structure.ReflectJavaType.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameterizedTypeArguments, 10));
        java.util.Iterator<T> it = parameterizedTypeArguments.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.create((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotations() {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
