package org.koin.core.instance;

/* JADX INFO: compiled from: ScopeDefinitionInstance.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J\u001b\u0010\u000f\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lorg/koin/core/instance/ScopeDefinitionInstance;", "T", "Lorg/koin/core/instance/DefinitionInstance;", "beanDefinition", "Lorg/koin/core/definition/BeanDefinition;", "(Lorg/koin/core/definition/BeanDefinition;)V", "values", "", "", "checkScopeResolution", "", "definition", "scope", "Lorg/koin/core/scope/Scope;", "close", "get", "context", "Lorg/koin/core/instance/InstanceContext;", "(Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "isCreated", "", "release", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class ScopeDefinitionInstance<T> extends org.koin.core.instance.DefinitionInstance<T> {
    private final java.util.Map<java.lang.String, T> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeDefinitionInstance(org.koin.core.definition.BeanDefinition<T> beanDefinition) {
        super(beanDefinition);
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(beanDefinition, "beanDefinition");
        this.values = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // org.koin.core.instance.DefinitionInstance
    public boolean isCreated(org.koin.core.instance.InstanceContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        return (context.getScope() == null || this.values.get(context.getScope().getId()) == null) ? false : true;
    }

    @Override // org.koin.core.instance.DefinitionInstance
    public void release(org.koin.core.instance.InstanceContext context) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        org.koin.core.scope.Scope scope = context.getScope();
        if (scope == null) {
            throw new java.lang.IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
        }
        if (org.koin.core.KoinApplication.INSTANCE.getLogger().isAt(org.koin.core.logger.Level.DEBUG)) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug("releasing '" + scope + "' ~ " + getBeanDefinition() + ' ');
        }
        kotlin.jvm.functions.Function1<T, kotlin.Unit> onRelease = getBeanDefinition().getOnRelease();
        if (onRelease != null) {
        }
        this.values.remove(scope.getId());
    }

    @Override // org.koin.core.instance.DefinitionInstance
    public <T> T get(org.koin.core.instance.InstanceContext context) throws org.koin.core.error.BadScopeInstanceException, org.koin.core.error.ScopeNotCreatedException {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(context, "context");
        if (context.getKoin() == null) {
            throw new java.lang.IllegalStateException("ScopeDefinitionInstance has no registered Koin instance".toString());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(context.getScope(), context.getKoin().getRootScope())) {
            throw new org.koin.core.error.ScopeNotCreatedException("No scope instance created to resolve " + getBeanDefinition());
        }
        org.koin.core.scope.Scope scope = context.getScope();
        if (scope == null) {
            throw new java.lang.IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
        }
        checkScopeResolution(getBeanDefinition(), scope);
        java.lang.String id = scope.getId();
        T tCreate = this.values.get(id);
        if (tCreate == null) {
            tCreate = create(context);
            java.util.Map<java.lang.String, T> map = this.values;
            if (tCreate == null) {
                throw new java.lang.IllegalStateException(("Instance creation from " + getBeanDefinition() + " should not be null").toString());
            }
            map.put(id, tCreate);
        }
        return tCreate;
    }

    @Override // org.koin.core.instance.DefinitionInstance
    public void close() {
        kotlin.jvm.functions.Function1<T, kotlin.Unit> onClose = getBeanDefinition().getOnClose();
        if (onClose != null) {
            onClose.invoke(null);
        }
        this.values.clear();
    }

    private final void checkScopeResolution(org.koin.core.definition.BeanDefinition<?> definition, org.koin.core.scope.Scope scope) throws org.koin.core.error.BadScopeInstanceException {
        org.koin.core.scope.ScopeDefinition scopeDefinition = scope.getScopeDefinition();
        org.koin.core.qualifier.Qualifier qualifier = scopeDefinition != null ? scopeDefinition.getQualifier() : null;
        org.koin.core.qualifier.Qualifier scopeName = definition.getScopeName();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(scopeName, qualifier)) {
            if (qualifier == null) {
                throw new org.koin.core.error.BadScopeInstanceException("Can't use definition " + definition + " defined for scope '" + scopeName + "', with an open scope instance " + scope + ". Use a scope instance with scope '" + scopeName + '\'');
            }
            if (scopeName == null) {
                return;
            }
            throw new org.koin.core.error.BadScopeInstanceException("Can't use definition " + definition + " defined for scope '" + scopeName + "' with scope instance " + scope + ". Use a scope instance with scope '" + scopeName + "'.");
        }
    }
}
