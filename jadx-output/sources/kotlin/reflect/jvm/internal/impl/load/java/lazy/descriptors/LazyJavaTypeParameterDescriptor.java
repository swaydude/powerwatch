package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* JADX INFO: compiled from: LazyJavaTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations annotations;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* JADX INFO: renamed from: reportSupertypeLoopError */
    protected void mo1271reportSupertypeLoopError(kotlin.reflect.jvm.internal.impl.types.KotlinType type) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(type, "type");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter, int i, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration) {
        super(c.getStorageManager(), containingDeclaration, javaTypeParameter.getName(), kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, false, i, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, c.getComponents().getSupertypeLoopChecker());
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaTypeParameter, "javaTypeParameter");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        this.c = c;
        this.javaTypeParameter = javaTypeParameter;
        this.annotations = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations(c, javaTypeParameter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations getAnnotations() {
        return this.annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> resolveUpperBounds() {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> upperBounds = this.javaTypeParameter.getUpperBounds();
        if (upperBounds.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType anyType = this.c.getModule().getBuiltIns().getAnyType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(anyType, "c.module.builtIns.anyType");
            kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = this.c.getModule().getBuiltIns().getNullableAnyType();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(nullableAnyType, "c.module.builtIns.nullableAnyType");
            return kotlin.collections.CollectionsKt.listOf(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(anyType, nullableAnyType));
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> collection = upperBounds;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.getTypeResolver().transformJavaType((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType) it.next(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON, false, this, 1, null)));
        }
        return arrayList;
    }
}
