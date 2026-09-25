package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.LifecycleOwner {
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry = null;

    FragmentViewLifecycleOwner() {
    }

    void initialize() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        }
    }

    boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
        initialize();
        return this.mLifecycleRegistry;
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event event) {
        this.mLifecycleRegistry.handleLifecycleEvent(event);
    }
}
