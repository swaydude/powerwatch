package org.koin.android.ext.android;

/* JADX INFO: compiled from: ComponentCallbackExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00032\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¢\u0006\u0002\u0010\b\u001aB\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b*\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¢\u0006\u0002\u0010\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0003\u001aC\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\n0\u0012\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\u000b*\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¨\u0006\u0013"}, d2 = {"bind", "S", "P", "Landroid/content/ComponentCallbacks;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Landroid/content/ComponentCallbacks;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "T", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Landroid/content/ComponentCallbacks;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getKoin", "Lorg/koin/core/Koin;", "inject", "Lkotlin/Lazy;", "koin-android_release"}, k = 2, mv = {1, 1, 15})
public final class ComponentCallbackExtKt {
    public static final org.koin.core.Koin getKoin(android.content.ComponentCallbacks getKoin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(getKoin, "$this$getKoin");
        return getKoin instanceof org.koin.core.KoinComponent ? ((org.koin.core.KoinComponent) getKoin).getKoin() : org.koin.core.context.GlobalContext.get().getKoin();
    }

    static /* synthetic */ kotlin.Lazy inject$default(android.content.ComponentCallbacks componentCallbacks, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.android.ext.android.ComponentCallbackExtKt.AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.android.ext.android.ComponentCallbackExtKt$inject$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComponentCallbackExt.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
        final /* synthetic */ kotlin.jvm.functions.Function0 $parameters;
        final /* synthetic */ org.koin.core.qualifier.Qualifier $qualifier;
        final /* synthetic */ android.content.ComponentCallbacks $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(android.content.ComponentCallbacks componentCallbacks, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0) {
            super(0);
            this.$this_inject = componentCallbacks;
            this.$qualifier = qualifier;
            this.$parameters = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            android.content.ComponentCallbacks componentCallbacks = this.$this_inject;
            org.koin.core.qualifier.Qualifier qualifier = this.$qualifier;
            kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = this.$parameters;
            org.koin.core.scope.Scope rootScope = org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(componentCallbacks).getRootScope();
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            return (T) rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, function0);
        }
    }

    private static final <T> kotlin.Lazy<T> inject(android.content.ComponentCallbacks componentCallbacks, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new org.koin.android.ext.android.ComponentCallbackExtKt.AnonymousClass1(componentCallbacks, qualifier, function0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object get$default(android.content.ComponentCallbacks componentCallbacks, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        org.koin.core.scope.Scope rootScope = getKoin(componentCallbacks).getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope.get((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
    }

    private static final <T> T get(android.content.ComponentCallbacks componentCallbacks, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        org.koin.core.scope.Scope rootScope = getKoin(componentCallbacks).getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object bind$default(android.content.ComponentCallbacks componentCallbacks, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        org.koin.core.scope.Scope rootScope = getKoin(componentCallbacks).getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "S");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return rootScope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, function0);
    }

    private static final <S, P> S bind(android.content.ComponentCallbacks componentCallbacks, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        org.koin.core.scope.Scope rootScope = getKoin(componentCallbacks).getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "S");
        kotlin.reflect.KClass<?> orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return (S) rootScope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, function0);
    }
}
