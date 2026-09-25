package org.koin.androidx.viewmodel.ext.android;

/* JADX INFO: compiled from: FragmentExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a_\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000e¢\u0006\u0002\u0010\u000f\u001aV\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000eH\u0086\b¢\u0006\u0002\u0010\u0010\u001a`\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000e\u001aW\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b2\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\tj\u0004\u0018\u0001`\u000eH\u0086\b¨\u0006\u0013"}, d2 = {"getSharedViewModel", "T", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "clazz", "Lkotlin/reflect/KClass;", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "from", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lorg/koin/androidx/viewmodel/ViewModelStoreOwnerDefinition;", "parameters", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "(Landroidx/fragment/app/Fragment;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/ViewModel;", "sharedViewModel", "Lkotlin/Lazy;", "koin-androidx-viewmodel_release"}, k = 2, mv = {1, 1, 15})
public final class FragmentExtKt {
    static /* synthetic */ kotlin.Lazy sharedViewModel$default(final androidx.fragment.app.Fragment fragment, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStoreOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.sharedViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.lifecycle.ViewModelStoreOwner invoke() {
                    androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        return activity;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = (kotlin.jvm.functions.Function0) null;
        }
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.androidx.viewmodel.ext.android.FragmentExtKt.C02662(fragment, qualifier, function0, function1));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.androidx.viewmodel.ext.android.FragmentExtKt$sharedViewModel$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentExt.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 1, 15})
    public static final class C02662<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
        final /* synthetic */ kotlin.jvm.functions.Function0 $from;
        final /* synthetic */ kotlin.jvm.functions.Function0 $parameters;
        final /* synthetic */ org.koin.core.qualifier.Qualifier $qualifier;
        final /* synthetic */ androidx.fragment.app.Fragment $this_sharedViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02662(androidx.fragment.app.Fragment fragment, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1) {
            super(0);
            this.$this_sharedViewModel = fragment;
            this.$qualifier = qualifier;
            this.$from = function0;
            this.$parameters = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModel invoke() {
            androidx.fragment.app.Fragment fragment = this.$this_sharedViewModel;
            org.koin.core.qualifier.Qualifier qualifier = this.$qualifier;
            kotlin.jvm.functions.Function0 function0 = this.$from;
            kotlin.jvm.functions.Function0 function1 = this.$parameters;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return org.koin.androidx.viewmodel.ext.android.FragmentExtKt.getSharedViewModel(fragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), qualifier, function0, function1);
        }
    }

    private static final <T extends androidx.lifecycle.ViewModel> kotlin.Lazy<T> sharedViewModel(androidx.fragment.app.Fragment fragment, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> function0, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function1) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.androidx.viewmodel.ext.android.FragmentExtKt.C02662(fragment, qualifier, function0, function1));
    }

    public static /* synthetic */ kotlin.Lazy sharedViewModel$default(final androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass kClass, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStoreOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.sharedViewModel.3
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.lifecycle.ViewModelStoreOwner invoke() {
                    androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        return activity;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = (kotlin.jvm.functions.Function0) null;
        }
        return sharedViewModel(fragment, kClass, qualifier, function0, function1);
    }

    public static final <T extends androidx.lifecycle.ViewModel> kotlin.Lazy<T> sharedViewModel(final androidx.fragment.app.Fragment sharedViewModel, final kotlin.reflect.KClass<T> clazz, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> from, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(sharedViewModel, "$this$sharedViewModel");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.sharedViewModel.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.FragmentExtKt.getSharedViewModel(sharedViewModel, clazz, qualifier, from, function0);
            }
        });
    }

    static /* synthetic */ androidx.lifecycle.ViewModel getSharedViewModel$default(final androidx.fragment.app.Fragment fragment, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            function0 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStoreOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.getSharedViewModel.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.lifecycle.ViewModelStoreOwner invoke() {
                    androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        return activity;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
        }
        if ((i & 4) != 0) {
            function1 = (kotlin.jvm.functions.Function0) null;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return getSharedViewModel(fragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), qualifier, function0, function1);
    }

    private static final <T extends androidx.lifecycle.ViewModel> T getSharedViewModel(androidx.fragment.app.Fragment fragment, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> function0, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function1) {
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) getSharedViewModel(fragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), qualifier, function0, function1);
    }

    public static /* synthetic */ androidx.lifecycle.ViewModel getSharedViewModel$default(final androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass kClass, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStoreOwner>() { // from class: org.koin.androidx.viewmodel.ext.android.FragmentExtKt.getSharedViewModel.2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.lifecycle.ViewModelStoreOwner invoke() {
                    androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
                    if (activity != null) {
                        return activity;
                    }
                    throw new kotlin.TypeCastException("null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = (kotlin.jvm.functions.Function0) null;
        }
        return getSharedViewModel(fragment, kClass, qualifier, function0, function1);
    }

    public static final <T extends androidx.lifecycle.ViewModel> T getSharedViewModel(androidx.fragment.app.Fragment getSharedViewModel, kotlin.reflect.KClass<T> clazz, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> from, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getSharedViewModel, "$this$getSharedViewModel");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(from, "from");
        return (T) org.koin.androidx.viewmodel.ViewModelResolutionKt.getViewModel(org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(getSharedViewModel), new org.koin.androidx.viewmodel.ViewModelParameters(clazz, getSharedViewModel, qualifier, from, function0));
    }
}
