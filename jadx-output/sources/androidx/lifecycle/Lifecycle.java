package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lifecycle {
    java.util.concurrent.atomic.AtomicReference<java.lang.Object> mInternalScopeRef = new java.util.concurrent.atomic.AtomicReference<>();

    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public abstract void addObserver(androidx.lifecycle.LifecycleObserver lifecycleObserver);

    public abstract androidx.lifecycle.Lifecycle.State getCurrentState();

    public abstract void removeObserver(androidx.lifecycle.LifecycleObserver lifecycleObserver);

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State state) {
            return compareTo(state) >= 0;
        }
    }
}
