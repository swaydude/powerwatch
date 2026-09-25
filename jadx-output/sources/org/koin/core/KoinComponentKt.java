package org.koin.core;

/* JADX INFO: compiled from: KoinComponent.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00032\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¢\u0006\u0002\u0010\b\u001a>\u0010\t\u001a\u0002H\n\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¢\u0006\u0002\u0010\r\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f\"\u0006\b\u0000\u0010\n\u0018\u0001*\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\n\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007H\u0086\b¨\u0006\u0010"}, d2 = {"bind", "S", "P", "Lorg/koin/core/KoinComponent;", "parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/KoinComponent;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "T", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Lorg/koin/core/KoinComponent;Lorg/koin/core/qualifier/Qualifier;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "inject", "Lkotlin/Lazy;", "koin-core"}, k = 2, mv = {1, 1, 15})
public final class KoinComponentKt {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object get$default(org.koin.core.KoinComponent koinComponent, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        org.koin.core.scope.Scope rootScope = koinComponent.getKoin().getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return rootScope.get((kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, (kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters>) function0);
    }

    private static final <T> T get(org.koin.core.KoinComponent koinComponent, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        org.koin.core.scope.Scope rootScope = koinComponent.getKoin().getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) rootScope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, function0);
    }

    static /* synthetic */ kotlin.Lazy inject$default(org.koin.core.KoinComponent koinComponent, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        final org.koin.core.scope.Scope rootScope = koinComponent.getKoin().getRootScope();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.KoinComponentKt$inject$$inlined$inject$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                org.koin.core.scope.Scope scope = rootScope;
                org.koin.core.qualifier.Qualifier qualifier2 = qualifier;
                kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function1 = function0;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier2, function1);
            }
        });
    }

    private static final <T> kotlin.Lazy<T> inject(org.koin.core.KoinComponent koinComponent, final org.koin.core.qualifier.Qualifier qualifier, final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        final org.koin.core.scope.Scope rootScope = koinComponent.getKoin().getRootScope();
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<T>() { // from class: org.koin.core.KoinComponentKt$inject$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                org.koin.core.scope.Scope scope = rootScope;
                org.koin.core.qualifier.Qualifier qualifier2 = qualifier;
                kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function1 = function0;
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier2, function1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object bind$default(org.koin.core.KoinComponent koinComponent, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = (kotlin.jvm.functions.Function0) null;
        }
        org.koin.core.scope.Scope rootScope = koinComponent.getKoin().getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "S");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return rootScope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, function0);
    }

    private static final <S, P> S bind(org.koin.core.KoinComponent koinComponent, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        org.koin.core.scope.Scope rootScope = koinComponent.getKoin().getRootScope();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "S");
        kotlin.reflect.KClass<?> orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "P");
        return (S) rootScope.bind(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), orCreateKotlinClass, function0);
    }
}
