package org.koin.androidx.viewmodel.dsl;

/* JADX INFO: compiled from: ModuleExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0004\u001a`\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0004\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032)\b\b\u0010\u000e\u001a#\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u0002H\b0\u000fj\b\u0012\u0004\u0012\u0002H\b`\u0012¢\u0006\u0002\b\u0013H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"ATTRIBUTE_VIEW_MODEL", "", org.koin.androidx.viewmodel.dsl.ModuleExtKt.ATTRIBUTE_VIEW_MODEL, "", "Lorg/koin/core/definition/BeanDefinition;", "setIsViewModel", "", "viewModel", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/module/Module;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "override", "definition", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 1, 15})
public final class ModuleExtKt {
    public static final java.lang.String ATTRIBUTE_VIEW_MODEL = "isViewModel";

    static /* synthetic */ org.koin.core.definition.BeanDefinition viewModel$default(org.koin.core.module.Module module, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition beanDefinition = new org.koin.core.definition.BeanDefinition(qualifier, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, z, 1, null));
        setIsViewModel(beanDefinition);
        return beanDefinition;
    }

    public static final void setIsViewModel(org.koin.core.definition.BeanDefinition<?> setIsViewModel) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(setIsViewModel, "$this$setIsViewModel");
        setIsViewModel.getProperties().set(ATTRIBUTE_VIEW_MODEL, true);
    }

    public static final boolean isViewModel(org.koin.core.definition.BeanDefinition<?> isViewModel) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(isViewModel, "$this$isViewModel");
        java.lang.Boolean bool = (java.lang.Boolean) isViewModel.getProperties().getOrNull(ATTRIBUTE_VIEW_MODEL);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final <T extends androidx.lifecycle.ViewModel> org.koin.core.definition.BeanDefinition<T> viewModel(org.koin.core.module.Module module, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> function2) {
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, (org.koin.core.qualifier.Qualifier) null, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        module.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, z, 1, null));
        setIsViewModel(beanDefinition);
        return beanDefinition;
    }
}
