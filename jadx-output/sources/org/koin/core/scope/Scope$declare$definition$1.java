package org.koin.core.scope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/DefinitionParameters;", "invoke", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
public final class Scope$declare$definition$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<org.koin.core.scope.Scope, org.koin.core.parameter.DefinitionParameters, T> {
    final /* synthetic */ java.lang.Object $instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$declare$definition$1(java.lang.Object obj) {
        super(2);
        this.$instance = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final T invoke(org.koin.core.scope.Scope createSingle, org.koin.core.parameter.DefinitionParameters it) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(createSingle, "$this$createSingle");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(it, "it");
        return (T) this.$instance;
    }
}
