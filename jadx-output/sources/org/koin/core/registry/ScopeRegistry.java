package org.koin.core.registry;

/* JADX INFO: compiled from: ScopeRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\f2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0005J\u0012\u0010\u001b\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0013J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0013J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001b\u0010 \u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0000¢\u0006\u0002\b#J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020\nH\u0002J\u0010\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020(H\u0002J\u001b\u0010+\u001a\u00020\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0000¢\u0006\u0002\b,J\u0010\u0010-\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lorg/koin/core/registry/ScopeRegistry;", "", "()V", "definitions", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lorg/koin/core/scope/ScopeDefinition;", "getDefinitions$koin_core", "()Ljava/util/concurrent/ConcurrentHashMap;", "instances", "Lorg/koin/core/scope/Scope;", "close", "", "closeRelatedScopes", "originalSet", "createScopeInstance", "koin", "Lorg/koin/core/Koin;", "id", "Lorg/koin/core/scope/ScopeID;", "scopeName", "Lorg/koin/core/qualifier/Qualifier;", "declareScopes", "module", "Lorg/koin/core/module/Module;", "deleteScopeInstance", "getScopeDefinition", "getScopeInstance", "getScopeInstanceOrNull", "getScopeSets", "", "loadDefaultScopes", "loadScopes", "modules", "", "loadScopes$koin_core", "registerScopeInstance", "instance", "saveDefinition", "scopeSet", "Lorg/koin/dsl/ScopeSet;", "saveInstance", "unloadDefinition", "unloadScopedDefinitions", "unloadScopedDefinitions$koin_core", "unloadScopes", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class ScopeRegistry {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.koin.core.scope.ScopeDefinition> definitions = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.koin.core.scope.Scope> instances = new java.util.concurrent.ConcurrentHashMap<>();

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, org.koin.core.scope.ScopeDefinition> getDefinitions$koin_core() {
        return this.definitions;
    }

    public final java.util.Collection<org.koin.core.scope.ScopeDefinition> getScopeSets() {
        java.util.Collection<org.koin.core.scope.ScopeDefinition> collectionValues = this.definitions.values();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionValues, "definitions.values");
        return collectionValues;
    }

    private final void unloadScopes(org.koin.core.module.Module module) {
        java.util.Iterator<T> it = module.getScopes$koin_core().iterator();
        while (it.hasNext()) {
            unloadDefinition((org.koin.dsl.ScopeSet) it.next());
        }
    }

    public final void loadDefaultScopes(org.koin.core.Koin koin) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(koin, "koin");
        saveInstance(koin.getRootScope());
    }

    private final void declareScopes(org.koin.core.module.Module module) {
        java.util.Iterator<T> it = module.getScopes$koin_core().iterator();
        while (it.hasNext()) {
            saveDefinition((org.koin.dsl.ScopeSet) it.next());
        }
    }

    private final void unloadDefinition(org.koin.dsl.ScopeSet scopeSet) {
        org.koin.core.scope.ScopeDefinition scopeDefinition = this.definitions.get(scopeSet.getQualifier().toString());
        if (scopeDefinition != null) {
            if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
                org.koin.core.KoinApplication.INSTANCE.getLogger().info("unbind scoped definitions: " + scopeSet.getDefinitions() + " from '" + scopeSet.getQualifier() + '\'');
            }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(scopeDefinition, "scopeDefinition");
            closeRelatedScopes(scopeDefinition);
            scopeDefinition.getDefinitions().removeAll(scopeSet.getDefinitions());
        }
    }

    private final void closeRelatedScopes(org.koin.core.scope.ScopeDefinition originalSet) {
        java.util.Collection<org.koin.core.scope.Scope> collectionValues = this.instances.values();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionValues, "instances.values");
        for (org.koin.core.scope.Scope scope : collectionValues) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(scope.getScopeDefinition(), originalSet)) {
                scope.close();
            }
        }
    }

    private final void saveDefinition(org.koin.dsl.ScopeSet scopeSet) {
        org.koin.core.scope.ScopeDefinition scopeDefinition = this.definitions.get(scopeSet.getQualifier().toString());
        if (scopeDefinition == null) {
            this.definitions.put(scopeSet.getQualifier().toString(), scopeSet.createDefinition());
        } else {
            scopeDefinition.getDefinitions().addAll(scopeSet.getDefinitions());
        }
    }

    public final org.koin.core.scope.ScopeDefinition getScopeDefinition(java.lang.String scopeName) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeName, "scopeName");
        return this.definitions.get(scopeName);
    }

    public final org.koin.core.scope.Scope createScopeInstance(org.koin.core.Koin koin, java.lang.String id, org.koin.core.qualifier.Qualifier scopeName) throws org.koin.core.error.ScopeAlreadyCreatedException, org.koin.core.error.NoScopeDefinitionFoundException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(koin, "koin");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(id, "id");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scopeName, "scopeName");
        org.koin.core.scope.ScopeDefinition scopeDefinition = this.definitions.get(scopeName.toString());
        if (scopeDefinition == null) {
            throw new org.koin.core.error.NoScopeDefinitionFoundException("No scope definition found for scopeName '" + scopeName + '\'');
        }
        org.koin.core.scope.Scope scope = new org.koin.core.scope.Scope(id, false, koin, 2, null);
        scope.setScopeDefinition(scopeDefinition);
        scope.declareDefinitionsFromScopeSet$koin_core();
        registerScopeInstance(scope);
        return scope;
    }

    private final void registerScopeInstance(org.koin.core.scope.Scope instance) throws org.koin.core.error.ScopeAlreadyCreatedException {
        if (this.instances.get(instance.getId()) != null) {
            throw new org.koin.core.error.ScopeAlreadyCreatedException("A scope with id '" + instance.getId() + "' already exists. Reuse or close it.");
        }
        saveInstance(instance);
    }

    public final org.koin.core.scope.Scope getScopeInstance(java.lang.String id) throws org.koin.core.error.ScopeNotCreatedException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(id, "id");
        org.koin.core.scope.Scope scope = this.instances.get(id);
        if (scope != null) {
            return scope;
        }
        throw new org.koin.core.error.ScopeNotCreatedException("ScopeInstance with id '" + id + "' not found. Create a scope instance with id '" + id + '\'');
    }

    private final void saveInstance(org.koin.core.scope.Scope instance) {
        this.instances.put(instance.getId(), instance);
    }

    public final org.koin.core.scope.Scope getScopeInstanceOrNull(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(id, "id");
        return this.instances.get(id);
    }

    public final void deleteScopeInstance(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(id, "id");
        this.instances.remove(id);
    }

    public final void close() {
        java.util.Collection<org.koin.core.scope.Scope> collectionValues = this.instances.values();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(collectionValues, "instances.values");
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((org.koin.core.scope.Scope) it.next()).close();
        }
        this.definitions.clear();
        this.instances.clear();
    }

    public final void loadScopes$koin_core(java.lang.Iterable<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        java.util.Iterator<org.koin.core.module.Module> it = modules.iterator();
        while (it.hasNext()) {
            declareScopes(it.next());
        }
    }

    public final void unloadScopedDefinitions$koin_core(java.lang.Iterable<org.koin.core.module.Module> modules) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(modules, "modules");
        java.util.Iterator<org.koin.core.module.Module> it = modules.iterator();
        while (it.hasNext()) {
            unloadScopes(it.next());
        }
    }
}
