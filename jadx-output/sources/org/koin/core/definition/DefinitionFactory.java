package org.koin.core.definition;

/* JADX INFO: compiled from: DefinitionFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J^\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0086\bJZ\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\rH\u0086\bJZ\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\rH\u0086\bJZ\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0006\b\u0000\u0010\u0005\u0018\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072)\b\b\u0010\b\u001a#\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00050\tj\b\u0012\u0004\u0012\u0002H\u0005`\f¢\u0006\u0002\b\rH\u0086\b¨\u0006\u0014"}, d2 = {"Lorg/koin/core/definition/DefinitionFactory;", "", "()V", "createDefinition", "Lorg/koin/core/definition/BeanDefinition;", "T", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "kind", "Lorg/koin/core/definition/Kind;", "scopeName", "createFactory", "createScoped", "createSingle", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class DefinitionFactory {
    public static final org.koin.core.definition.DefinitionFactory INSTANCE = new org.koin.core.definition.DefinitionFactory();

    private DefinitionFactory() {
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition createSingle$default(org.koin.core.definition.DefinitionFactory definitionFactory, org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier qualifier2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            qualifier2 = (org.koin.core.qualifier.Qualifier) null;
        }
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> createSingle(org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier scopeName, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) {
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Single;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, scopeName, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition createScoped$default(org.koin.core.definition.DefinitionFactory definitionFactory, org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier qualifier2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            qualifier2 = (org.koin.core.qualifier.Qualifier) null;
        }
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Scoped;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> createScoped(org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier scopeName, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) {
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Scoped;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, scopeName, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition createFactory$default(org.koin.core.definition.DefinitionFactory definitionFactory, org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier qualifier2, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            qualifier2 = (org.koin.core.qualifier.Qualifier) null;
        }
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> createFactory(org.koin.core.qualifier.Qualifier qualifier, org.koin.core.qualifier.Qualifier scopeName, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) {
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, scopeName, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> createDefinition(org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition, org.koin.core.definition.Kind kind, org.koin.core.qualifier.Qualifier scopeName) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, scopeName, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        return beanDefinition;
    }
}
