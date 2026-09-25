package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaTypeParameterResolver implements kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c;
    private final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor> resolve;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, java.lang.Integer> typeParameters;
    private final int typeParametersIndexOffset;

    public LazyJavaTypeParameterResolver(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext c, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner typeParameterOwner, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(c, "c");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameterOwner, "typeParameterOwner");
        this.c = c;
        this.containingDeclaration = containingDeclaration;
        this.typeParametersIndexOffset = i;
        this.typeParameters = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.mapToIndex(typeParameterOwner.getTypeParameters());
        this.resolve = c.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor invoke(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter typeParameter) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameter, "typeParameter");
                java.lang.Integer num = (java.lang.Integer) this.this$0.typeParameters.get(typeParameter);
                if (num == null) {
                    return null;
                }
                return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor(kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.child(this.this$0.c, this.this$0), typeParameter, this.this$0.typeParametersIndexOffset + num.intValue(), this.this$0.containingDeclaration);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor resolveTypeParameter(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter javaTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(javaTypeParameter, "javaTypeParameter");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.resolve.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }
}
