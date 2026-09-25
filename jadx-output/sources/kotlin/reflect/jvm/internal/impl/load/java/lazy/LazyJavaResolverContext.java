package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaResolverContext {
    static final /* synthetic */ kotlin.reflect.KProperty[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext.class), "defaultTypeQualifiers", "getDefaultTypeQualifiers()Lorg/jetbrains/kotlin/load/java/lazy/JavaTypeQualifiersByElementType;"))};
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents components;
    private final kotlin.Lazy defaultTypeQualifiers$delegate;
    private final kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver typeResolver;

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        kotlin.Lazy lazy = this.defaultTypeQualifiers$delegate;
        kotlin.reflect.KProperty kProperty = $$delegatedProperties[0];
        return (kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType) lazy.getValue();
    }

    public LazyJavaResolverContext(kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents components, kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver typeParameterResolver, kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(components, "components");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(typeParameterResolver, "typeParameterResolver");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.components = components;
        this.typeParameterResolver = typeParameterResolver;
        this.delegateForDefaultTypeQualifiers = delegateForDefaultTypeQualifiers;
        this.defaultTypeQualifiers$delegate = delegateForDefaultTypeQualifiers;
        this.typeResolver = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver(this, typeParameterResolver);
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents getComponents() {
        return this.components;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    public final kotlin.Lazy<kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule() {
        return this.components.getModule();
    }
}
