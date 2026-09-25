package org.koin.dsl;

/* JADX INFO: compiled from: ScopeSet.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00072\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003JX\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00182)\b\b\u0010\u0014\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00130\u001cj\b\u0012\u0004\u0012\u0002H\u0013`\u001f¢\u0006\u0002\b H\u0086\bJ\t\u0010!\u001a\u00020\"HÖ\u0001JX\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00182)\b\b\u0010\u0014\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00130\u001cj\b\u0012\u0004\u0012\u0002H\u0013`\u001f¢\u0006\u0002\b H\u0086\bJX\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0007\"\u0006\b\u0000\u0010\u0013\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00182)\b\b\u0010\u0014\u001a#\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00130\u001cj\b\u0012\u0004\u0012\u0002H\u0013`\u001f¢\u0006\u0002\b H\u0087\bJ\b\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R)\u0010\u0005\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006("}, d2 = {"Lorg/koin/dsl/ScopeSet;", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Lorg/koin/core/qualifier/Qualifier;)V", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "getDefinitions", "()Ljava/util/HashSet;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "component1", "copy", "createDefinition", "Lorg/koin/core/scope/ScopeDefinition;", "declareDefinition", "", "T", "definition", "options", "Lorg/koin/core/definition/Options;", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "factory", "override", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/definition/Definition;", "Lkotlin/ExtensionFunctionType;", "hashCode", "", "scoped", "single", "toString", "", "updateOptions", "koin-core"}, k = 1, mv = {1, 1, 15})
public final /* data */ class ScopeSet {
    private final java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> definitions;
    private final org.koin.core.qualifier.Qualifier qualifier;

    public static /* synthetic */ org.koin.dsl.ScopeSet copy$default(org.koin.dsl.ScopeSet scopeSet, org.koin.core.qualifier.Qualifier qualifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = scopeSet.qualifier;
        }
        return scopeSet.copy(qualifier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final org.koin.core.qualifier.Qualifier getQualifier() {
        return this.qualifier;
    }

    public final org.koin.dsl.ScopeSet copy(org.koin.core.qualifier.Qualifier qualifier) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        return new org.koin.dsl.ScopeSet(qualifier);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof org.koin.dsl.ScopeSet) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifier, ((org.koin.dsl.ScopeSet) other).qualifier);
        }
        return true;
    }

    public int hashCode() {
        org.koin.core.qualifier.Qualifier qualifier = this.qualifier;
        if (qualifier != null) {
            return qualifier.hashCode();
        }
        return 0;
    }

    public ScopeSet(org.koin.core.qualifier.Qualifier qualifier) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        this.qualifier = qualifier;
        this.definitions = new java.util.HashSet<>();
    }

    public final org.koin.core.qualifier.Qualifier getQualifier() {
        return this.qualifier;
    }

    public final java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> getDefinitions() {
        return this.definitions;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Can't use Single in a scope. Use Scoped instead")
    static /* synthetic */ org.koin.core.definition.BeanDefinition single$default(org.koin.dsl.ScopeSet scopeSet, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
        }
        int i2 = i & 2;
        throw new java.lang.IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Can't use Single in a scope. Use Scoped instead")
    private final <T> org.koin.core.definition.BeanDefinition<T> single(org.koin.core.qualifier.Qualifier qualifier, boolean override, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) {
        throw new java.lang.IllegalStateException("Scoped definition is deprecated and has been replaced with Single scope definitions".toString());
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition scoped$default(org.koin.dsl.ScopeSet scopeSet, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) throws org.koin.core.error.DefinitionOverrideException {
        if ((i & 1) != 0) {
            qualifier = (org.koin.core.qualifier.Qualifier) null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.qualifier.Qualifier qualifier2 = scopeSet.getQualifier();
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Scoped;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<?> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(function2);
        beanDefinition.setKind(kind);
        scopeSet.declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, z));
        if (!scopeSet.getDefinitions().contains(beanDefinition)) {
            scopeSet.getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + scopeSet.getQualifier() + " as it already exists");
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> scoped(org.koin.core.qualifier.Qualifier qualifier, boolean override, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) throws org.koin.core.error.DefinitionOverrideException {
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.qualifier.Qualifier qualifier2 = getQualifier();
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Scoped;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, override));
        if (!getDefinitions().contains(beanDefinition)) {
            getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + getQualifier() + " as it already exists");
    }

    static /* synthetic */ org.koin.core.definition.BeanDefinition factory$default(org.koin.dsl.ScopeSet scopeSet, org.koin.core.qualifier.Qualifier qualifier, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) throws org.koin.core.error.DefinitionOverrideException {
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
        if (!scopeSet.getDefinitions().contains(beanDefinition)) {
            scopeSet.getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + scopeSet.getQualifier() + " as it already exists");
    }

    private final <T> org.koin.core.definition.BeanDefinition<T> factory(org.koin.core.qualifier.Qualifier qualifier, boolean override, kotlin.jvm.functions.Function2<? super org.koin.core.scope.Scope, ? super org.koin.core.parameter.DefinitionParameters, ? extends T> definition) throws org.koin.core.error.DefinitionOverrideException {
        org.koin.core.definition.DefinitionFactory definitionFactory = org.koin.core.definition.DefinitionFactory.INSTANCE;
        org.koin.core.qualifier.Qualifier qualifier2 = getQualifier();
        org.koin.core.definition.Kind kind = org.koin.core.definition.Kind.Factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        org.koin.core.definition.BeanDefinition<T> beanDefinition = new org.koin.core.definition.BeanDefinition<>(qualifier, qualifier2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
        beanDefinition.setDefinition(definition);
        beanDefinition.setKind(kind);
        declareDefinition(beanDefinition, new org.koin.core.definition.Options(false, override));
        if (!getDefinitions().contains(beanDefinition)) {
            getDefinitions().add(beanDefinition);
            return beanDefinition;
        }
        throw new org.koin.core.error.DefinitionOverrideException("Can't add definition " + beanDefinition + " for scope " + getQualifier() + " as it already exists");
    }

    public final org.koin.core.scope.ScopeDefinition createDefinition() {
        org.koin.core.scope.ScopeDefinition scopeDefinition = new org.koin.core.scope.ScopeDefinition(this.qualifier);
        scopeDefinition.getDefinitions().addAll(this.definitions);
        return scopeDefinition;
    }

    public final <T> void declareDefinition(org.koin.core.definition.BeanDefinition<T> definition, org.koin.core.definition.Options options) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(definition, "definition");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(options, "options");
        updateOptions(definition, options);
    }

    private final void updateOptions(org.koin.core.definition.BeanDefinition<?> beanDefinition, org.koin.core.definition.Options options) {
        beanDefinition.getOptions().setCreatedAtStart(options.isCreatedAtStart());
        beanDefinition.getOptions().setOverride(options.getOverride());
    }

    public java.lang.String toString() {
        return "Scope['" + this.qualifier + "']";
    }
}
