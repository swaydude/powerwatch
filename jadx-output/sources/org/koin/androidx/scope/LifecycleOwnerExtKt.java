package org.koin.androidx.scope;

/* JADX INFO: compiled from: LifecycleOwnerExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0002\u001a\f\u0010\u0011\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0012\u001a\u00020\f*\u00020\u0002H\u0002\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0002H\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0015"}, d2 = {"currentScope", "Lorg/koin/core/scope/Scope;", "Landroidx/lifecycle/LifecycleOwner;", "getCurrentScope", "(Landroidx/lifecycle/LifecycleOwner;)Lorg/koin/core/scope/Scope;", "bindScope", "", "scope", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "createAndBindScope", "scopeId", "", "qualifier", "Lorg/koin/core/qualifier/Qualifier;", "getKoin", "Lorg/koin/core/Koin;", "getOrCreateCurrentScope", "getScopeId", "getScopeName", "Lorg/koin/core/qualifier/TypeQualifier;", "koin-androidx-scope_release"}, k = 2, mv = {1, 1, 15})
public final class LifecycleOwnerExtKt {
    private static final org.koin.core.Koin getKoin(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            return org.koin.android.ext.android.ComponentCallbackExtKt.getKoin((android.content.ComponentCallbacks) lifecycleOwner);
        }
        throw new kotlin.TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }

    private static final org.koin.core.qualifier.TypeQualifier getScopeName(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        return new org.koin.core.qualifier.TypeQualifier(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(lifecycleOwner.getClass()));
    }

    private static final java.lang.String getScopeId(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        return org.koin.ext.KClassExtKt.getFullName(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(lifecycleOwner.getClass())) + "@" + java.lang.System.identityHashCode(lifecycleOwner);
    }

    private static final org.koin.core.scope.Scope getOrCreateCurrentScope(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        java.lang.String scopeId = getScopeId(lifecycleOwner);
        org.koin.core.scope.Scope scopeOrNull = getKoin(lifecycleOwner).getScopeOrNull(scopeId);
        return scopeOrNull != null ? scopeOrNull : createAndBindScope(lifecycleOwner, scopeId, getScopeName(lifecycleOwner));
    }

    private static final org.koin.core.scope.Scope createAndBindScope(androidx.lifecycle.LifecycleOwner lifecycleOwner, java.lang.String str, org.koin.core.qualifier.Qualifier qualifier) {
        org.koin.core.scope.Scope scopeCreateScope = getKoin(lifecycleOwner).createScope(str, qualifier);
        bindScope$default(lifecycleOwner, scopeCreateScope, null, 2, null);
        return scopeCreateScope;
    }

    public static /* synthetic */ void bindScope$default(androidx.lifecycle.LifecycleOwner lifecycleOwner, org.koin.core.scope.Scope scope, androidx.lifecycle.Lifecycle.Event event, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            event = androidx.lifecycle.Lifecycle.Event.ON_DESTROY;
        }
        bindScope(lifecycleOwner, scope, event);
    }

    public static final void bindScope(androidx.lifecycle.LifecycleOwner bindScope, org.koin.core.scope.Scope scope, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(bindScope, "$this$bindScope");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(event, "event");
        bindScope.getLifecycle().addObserver(new org.koin.androidx.scope.ScopeObserver(event, bindScope, scope));
    }

    public static final org.koin.core.scope.Scope getCurrentScope(androidx.lifecycle.LifecycleOwner currentScope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(currentScope, "$this$currentScope");
        return getOrCreateCurrentScope(currentScope);
    }
}
