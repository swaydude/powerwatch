package org.koin.core.instance;

/* JADX INFO: compiled from: DefinitionInstance.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lorg/koin/core/instance/InstanceContext;", "", "koin", "Lorg/koin/core/Koin;", "scope", "Lorg/koin/core/scope/Scope;", "_parameters", "Lkotlin/Function0;", "Lorg/koin/core/parameter/DefinitionParameters;", "Lorg/koin/core/parameter/ParametersDefinition;", "(Lorg/koin/core/Koin;Lorg/koin/core/scope/Scope;Lkotlin/jvm/functions/Function0;)V", "getKoin", "()Lorg/koin/core/Koin;", "parameters", "getParameters", "()Lorg/koin/core/parameter/DefinitionParameters;", "getScope", "()Lorg/koin/core/scope/Scope;", "koin-core"}, k = 1, mv = {1, 1, 15})
public final class InstanceContext {
    private final kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> _parameters;
    private final org.koin.core.Koin koin;
    private final org.koin.core.parameter.DefinitionParameters parameters;
    private final org.koin.core.scope.Scope scope;

    public InstanceContext() {
        this(null, null, null, 7, null);
    }

    public InstanceContext(org.koin.core.Koin koin, org.koin.core.scope.Scope scope, kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0) {
        org.koin.core.parameter.DefinitionParameters definitionParametersInvoke;
        this.koin = koin;
        this.scope = scope;
        this._parameters = function0;
        this.parameters = (function0 == null || (definitionParametersInvoke = function0.invoke()) == null) ? org.koin.core.parameter.DefinitionParametersKt.emptyParametersHolder() : definitionParametersInvoke;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InstanceContext(org.koin.core.Koin koin, org.koin.core.scope.Scope scope, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        koin = (i & 1) != 0 ? (org.koin.core.Koin) null : koin;
        if ((i & 2) != 0) {
            scope = koin != null ? koin.getRootScope() : null;
        }
        this(koin, scope, (i & 4) != 0 ? (kotlin.jvm.functions.Function0) null : function0);
    }

    public final org.koin.core.Koin getKoin() {
        return this.koin;
    }

    public final org.koin.core.scope.Scope getScope() {
        return this.scope;
    }

    public final org.koin.core.parameter.DefinitionParameters getParameters() {
        return this.parameters;
    }
}
