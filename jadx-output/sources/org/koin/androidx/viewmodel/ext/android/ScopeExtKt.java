package org.koin.androidx.viewmodel.ext.android;

/* JADX INFO: compiled from: ScopeExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aS\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r¢\u0006\u0002\u0010\u000e\u001aJ\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\b¢\u0006\u0002\u0010\u000f\u001aT\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0011\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\r\u001aK\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0011\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\u0004\u0018\u0001`\rH\u0086\b¨\u0006\u0012"}, d2 = {"getViewModel", "T", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/LifecycleOwner;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Lorg/koin/core/scope/Scope;Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "viewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 1, 15})
public final class ScopeExtKt {
    public static /* synthetic */ kotlin.Lazy viewModel$default(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.reflect.KClass kClass, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 8) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        return viewModel(scope, lifecycleOwner, kClass, qualifier, function0);
    }

    public static final <T extends androidx.lifecycle.ViewModel> kotlin.Lazy<T> viewModel(final org.koin.core.scope.Scope viewModel, final androidx.lifecycle.LifecycleOwner owner, final kotlin.reflect.KClass<T> clazz, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(viewModel, "$this$viewModel");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.ScopeExtKt.viewModel.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ScopeExtKt.getViewModel(viewModel, owner, clazz, qualifier, function0);
            }
        });
    }

    static /* synthetic */ kotlin.Lazy viewModel$default(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 4) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.androidx.viewmodel.ext.android.ScopeExtKt.AnonymousClass2(scope, lifecycleOwner, qualifier, function0));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.ScopeExtKt$viewModel$2, reason: invalid class name */
    /* JADX INFO: compiled from: ScopeExt.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 1, 15})
    public static final class AnonymousClass2<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
        final /* synthetic */ androidx.lifecycle.LifecycleOwner $owner;
        final /* synthetic */ kotlin.jvm.functions.Function0 $parameters;
        final /* synthetic */ org.koin.core.qualifier.Qualifier $qualifier;
        final /* synthetic */ org.koin.core.scope.Scope $this_viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0) {
            super(0);
            this.$this_viewModel = scope;
            this.$owner = lifecycleOwner;
            this.$qualifier = qualifier;
            this.$parameters = function0;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModel invoke() {
            org.koin.core.scope.Scope scope = this.$this_viewModel;
            androidx.lifecycle.LifecycleOwner lifecycleOwner = this.$owner;
            org.koin.core.qualifier.Qualifier qualifier = this.$qualifier;
            kotlin.jvm.functions.Function0 function0 = this.$parameters;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return org.koin.androidx.viewmodel.ext.android.ScopeExtKt.getViewModel(scope, lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), qualifier, function0);
        }
    }

    private static final <T extends androidx.lifecycle.ViewModel> kotlin.Lazy<T> viewModel(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.androidx.viewmodel.ext.android.ScopeExtKt.AnonymousClass2(scope, lifecycleOwner, qualifier, function0));
    }

    static /* synthetic */ androidx.lifecycle.ViewModel getViewModel$default(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 4) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return getViewModel(scope, lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), qualifier, function0);
    }

    private static final <T extends androidx.lifecycle.ViewModel> T getViewModel(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) getViewModel(scope, lifecycleOwner, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), qualifier, function0);
    }

    public static /* synthetic */ androidx.lifecycle.ViewModel getViewModel$default(org.koin.core.scope.Scope scope, androidx.lifecycle.LifecycleOwner lifecycleOwner, kotlin.reflect.KClass kClass, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 8) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        return getViewModel(scope, lifecycleOwner, kClass, qualifier, function0);
    }

    public static final <T extends androidx.lifecycle.ViewModel> T getViewModel(org.koin.core.scope.Scope getViewModel, androidx.lifecycle.LifecycleOwner owner, kotlin.reflect.KClass<T> clazz, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getViewModel, "$this$getViewModel");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        return (T) org.koin.androidx.viewmodel.ViewModelScopeResolutionKt.getViewModel(getViewModel, new org.koin.androidx.viewmodel.ViewModelParameters(clazz, owner, qualifier, null, function0, 8, null));
    }
}
