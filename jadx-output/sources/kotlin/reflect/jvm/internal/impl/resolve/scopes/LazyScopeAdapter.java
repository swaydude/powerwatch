package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* JADX INFO: compiled from: LazyScopeAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LazyScopeAdapter extends kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> scope;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter(kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<? extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope> scope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scope, "scope");
        this.scope = scope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    protected kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getWorkerScope() {
        return this.scope.invoke();
    }
}
