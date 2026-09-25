package org.koin.core.scope;

/* JADX INFO: compiled from: ScopeDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R)\u0010\u0005\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lorg/koin/core/scope/ScopeDefinition;", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "(Lorg/koin/core/qualifier/Qualifier;)V", "definitions", "Ljava/util/HashSet;", "Lorg/koin/core/definition/BeanDefinition;", "Lkotlin/collections/HashSet;", "getDefinitions", "()Ljava/util/HashSet;", "getQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "component1", "copy", "equals", "", com.google.android.gms.fitness.FitnessActivities.OTHER, "hashCode", "", "release", "", "instance", "Lorg/koin/core/scope/Scope;", "release$koin_core", "toString", "", "koin-core"}, k = 1, mv = {1, 1, 15})
public final /* data */ class ScopeDefinition {
    private final java.util.HashSet<org.koin.core.definition.BeanDefinition<?>> definitions;
    private final org.koin.core.qualifier.Qualifier qualifier;

    public static /* synthetic */ org.koin.core.scope.ScopeDefinition copy$default(org.koin.core.scope.ScopeDefinition scopeDefinition, org.koin.core.qualifier.Qualifier qualifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qualifier = scopeDefinition.qualifier;
        }
        return scopeDefinition.copy(qualifier);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final org.koin.core.qualifier.Qualifier getQualifier() {
        return this.qualifier;
    }

    public final org.koin.core.scope.ScopeDefinition copy(org.koin.core.qualifier.Qualifier qualifier) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(qualifier, "qualifier");
        return new org.koin.core.scope.ScopeDefinition(qualifier);
    }

    public boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof org.koin.core.scope.ScopeDefinition) && kotlin.jvm.internal.Intrinsics.areEqual(this.qualifier, ((org.koin.core.scope.ScopeDefinition) other).qualifier);
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

    public java.lang.String toString() {
        return "ScopeDefinition(qualifier=" + this.qualifier + ")";
    }

    public ScopeDefinition(org.koin.core.qualifier.Qualifier qualifier) {
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

    public final void release$koin_core(org.koin.core.scope.Scope instance) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(instance, "instance");
        java.util.Iterator<T> it = this.definitions.iterator();
        while (it.hasNext()) {
            org.koin.core.instance.DefinitionInstance beanDefinition = ((org.koin.core.definition.BeanDefinition) it.next()).getInstance();
            if (beanDefinition != null) {
                beanDefinition.release(new org.koin.core.instance.InstanceContext(null, instance, null, 5, null));
            }
        }
    }
}
