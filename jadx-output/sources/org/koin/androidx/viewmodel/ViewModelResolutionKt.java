package org.koin.androidx.viewmodel;

/* JADX INFO: compiled from: ViewModelResolution.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a'\u0010\t\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010\n\u001a'\u0010\u000b\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¢\u0006\u0002\u0010\r\u001a\"\u0010\u000e\u001a\u00020\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\b¨\u0006\u0010"}, d2 = {"createViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "vmStore", "Landroidx/lifecycle/ViewModelStore;", "parameters", "Lorg/koin/androidx/viewmodel/ViewModelParameters;", "getInstance", "(Landroidx/lifecycle/ViewModelProvider;Lorg/koin/androidx/viewmodel/ViewModelParameters;)Landroidx/lifecycle/ViewModel;", "getViewModel", "Lorg/koin/core/Koin;", "(Lorg/koin/core/Koin;Lorg/koin/androidx/viewmodel/ViewModelParameters;)Landroidx/lifecycle/ViewModel;", "getViewModelStore", "Landroidx/lifecycle/LifecycleOwner;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 1, 15})
public final class ViewModelResolutionKt {
    public static final <T extends androidx.lifecycle.ViewModel> T getViewModel(org.koin.core.Koin getViewModel, org.koin.androidx.viewmodel.ViewModelParameters<T> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getViewModel, "$this$getViewModel");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        return (T) getInstance(createViewModelProvider(getViewModel.getRootScope(), getViewModelStore(parameters.getOwner(), parameters), parameters), parameters);
    }

    public static final <T extends androidx.lifecycle.ViewModel> T getInstance(final androidx.lifecycle.ViewModelProvider getInstance, final org.koin.androidx.viewmodel.ViewModelParameters<T> parameters) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getInstance, "$this$getInstance");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        final java.lang.Class<T> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) parameters.getClazz());
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("!- ViewModelProvider getting instance");
            kotlin.Pair pairMeasureDuration = org.koin.core.time.MeasureKt.measureDuration(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.androidx.viewmodel.ViewModelResolutionKt.getInstance.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Incorrect return type in method signature: ()TT; */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.lifecycle.ViewModel invoke() {
                    if (parameters.getQualifier() != null) {
                        return getInstance.get(parameters.getQualifier().toString(), javaClass);
                    }
                    return getInstance.get(javaClass);
                }
            });
            T instance = (T) pairMeasureDuration.component1();
            double dDoubleValue = ((java.lang.Number) pairMeasureDuration.component2()).doubleValue();
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("!- ViewModelProvider got instance in " + dDoubleValue);
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(instance, "instance");
            return instance;
        }
        if (parameters.getQualifier() != null) {
            t = (T) getInstance.get(parameters.getQualifier().toString(), javaClass);
        } else {
            t = (T) getInstance.get(javaClass);
        }
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(t, "if (parameters.qualifier….get(javaClass)\n        }");
        return t;
    }

    public static final <T extends androidx.lifecycle.ViewModel> androidx.lifecycle.ViewModelStore getViewModelStore(androidx.lifecycle.LifecycleOwner getViewModelStore, org.koin.androidx.viewmodel.ViewModelParameters<T> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getViewModelStore, "$this$getViewModelStore");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        if (parameters.getFrom() != null) {
            androidx.lifecycle.ViewModelStore viewModelStore = parameters.getFrom().invoke().getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "parameters.from.invoke().viewModelStore");
            return viewModelStore;
        }
        if (getViewModelStore instanceof androidx.fragment.app.FragmentActivity) {
            androidx.lifecycle.ViewModelStore viewModelStore2 = ((androidx.fragment.app.FragmentActivity) getViewModelStore).getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(viewModelStore2, "this.viewModelStore");
            return viewModelStore2;
        }
        if (getViewModelStore instanceof androidx.fragment.app.Fragment) {
            androidx.lifecycle.ViewModelStore viewModelStore3 = ((androidx.fragment.app.Fragment) getViewModelStore).getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(viewModelStore3, "this.viewModelStore");
            return viewModelStore3;
        }
        throw new java.lang.IllegalStateException(("Can't getByClass ViewModel '" + parameters.getClazz() + "' on " + getViewModelStore + " - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner").toString());
    }

    public static final <T extends androidx.lifecycle.ViewModel> androidx.lifecycle.ViewModelProvider createViewModelProvider(final org.koin.core.scope.Scope createViewModelProvider, androidx.lifecycle.ViewModelStore vmStore, final org.koin.androidx.viewmodel.ViewModelParameters<T> parameters) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createViewModelProvider, "$this$createViewModelProvider");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(vmStore, "vmStore");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(parameters, "parameters");
        return new androidx.lifecycle.ViewModelProvider(vmStore, new androidx.lifecycle.ViewModelProvider.Factory() { // from class: org.koin.androidx.viewmodel.ViewModelResolutionKt.createViewModelProvider.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modelClass, "modelClass");
                return (T) createViewModelProvider.get(parameters.getClazz(), parameters.getQualifier(), parameters.getParameters());
            }
        });
    }
}
