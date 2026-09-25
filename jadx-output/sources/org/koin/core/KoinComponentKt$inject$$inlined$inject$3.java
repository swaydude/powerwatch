package org.koin.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;", "org/koin/core/scope/Scope$inject$1"}, k = 3, mv = {1, 1, 15})
public final class KoinComponentKt$inject$$inlined$inject$3<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
    final /* synthetic */ kotlin.jvm.functions.Function0 $parameters;
    final /* synthetic */ org.koin.core.qualifier.Qualifier $qualifier;
    final /* synthetic */ org.koin.core.scope.Scope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinComponentKt$inject$$inlined$inject$3(org.koin.core.scope.Scope scope, org.koin.core.qualifier.Qualifier qualifier, kotlin.jvm.functions.Function0 function0) {
        super(0);
        this.this$0 = scope;
        this.$qualifier = qualifier;
        this.$parameters = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        org.koin.core.scope.Scope scope = this.this$0;
        org.koin.core.qualifier.Qualifier qualifier = this.$qualifier;
        kotlin.jvm.functions.Function0<org.koin.core.parameter.DefinitionParameters> function0 = this.$parameters;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) scope.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), qualifier, function0);
    }
}
