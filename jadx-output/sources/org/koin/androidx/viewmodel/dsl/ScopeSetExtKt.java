package org.koin.androidx.viewmodel.dsl;

/* JADX INFO: compiled from: ScopeSetExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a`\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2)\b\b\u0010\t\u001a#\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\u00020\nj\b\u0012\u0004\u0012\u0002H\u0002`\r¢\u0006\u0002\b\u000eH\u0086\b¨\u0006\u000f"}, d2 = {"viewModel", "Lorg/koin/core/definition/BeanDefinition;", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/dsl/ScopeSet;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "override", "", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 1, 15})
public final class ScopeSetExtKt {
    static /* synthetic */ org.koin.core.definition.BeanDefinition viewModel$default(org.koin.dsl.ScopeSet scopeSet, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) throws org.koin.core.error.DefinitionOverrideException {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.qualifier.Qualifier qualifier2 = scopeSet.getQualifier();
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<?> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        scopeSet.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, z));
        org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition);
        if (!scopeSet.getDefinitions().contains(beanDefinition)) {
            scopeSet.getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + scopeSet.getQualifier() + " as it already exists");
    }

    private static final <T extends androidx.lifecycle.ViewModel> org.koin.core.definition.BeanDefinition<T> viewModel(org.koin.dsl.ScopeSet scopeSet, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> function2) throws org.koin.core.error.DefinitionOverrideException {
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.qualifier.Qualifier qualifier2 = scopeSet.getQualifier();
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        scopeSet.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, z));
        org.koin.androidx.viewmodel.dsl.ModuleExtKt.setIsViewModel(beanDefinition);
        if (!scopeSet.getDefinitions().contains(beanDefinition)) {
            scopeSet.getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + scopeSet.getQualifier() + " as it already exists");
    }
}
