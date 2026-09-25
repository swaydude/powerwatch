package org.koin.androidx.scope;

/* JADX INFO: compiled from: ScopeObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lorg/koin/androidx/scope/ScopeObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Lorg/koin/core/KoinComponent;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "target", "", "scope", "Lorg/koin/core/scope/Scope;", "(Landroidx/lifecycle/Lifecycle$Event;Ljava/lang/Object;Lorg/koin/core/scope/Scope;)V", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "getScope", "()Lorg/koin/core/scope/Scope;", "getTarget", "()Ljava/lang/Object;", "onDestroy", "", "onStop", "koin-androidx-scope_release"}, k = 1, mv = {1, 1, 15})
public final class ScopeObserver implements androidx.lifecycle.LifecycleObserver, org.koin.core.KoinComponent {
    private final androidx.lifecycle.Lifecycle.Event event;
    private final org.koin.core.scope.Scope scope;
    private final java.lang.Object target;

    public ScopeObserver(androidx.lifecycle.Lifecycle.Event event, java.lang.Object target, org.koin.core.scope.Scope scope) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(event, "event");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(target, "target");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(scope, "scope");
        this.event = event;
        this.target = target;
        this.scope = scope;
    }

    public final androidx.lifecycle.Lifecycle.Event getEvent() {
        return this.event;
    }

    @Override // org.koin.core.KoinComponent
    public org.koin.core.Koin getKoin() {
        return org.koin.core.KoinComponent.DefaultImpls.getKoin(this);
    }

    public final org.koin.core.scope.Scope getScope() {
        return this.scope;
    }

    public final java.lang.Object getTarget() {
        return this.target;
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug(this.target + " received ON_STOP");
            this.scope.close();
        }
    }

    @androidx.lifecycle.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (this.event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            org.koin.core.KoinApplication.INSTANCE.getLogger().debug(this.target + " received ON_DESTROY");
            this.scope.close();
        }
    }
}
