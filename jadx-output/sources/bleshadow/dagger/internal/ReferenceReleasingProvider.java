package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ReferenceReleasingProvider<T> implements bleshadow.javax.inject.Provider<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object NULL = new java.lang.Object();
    private final bleshadow.javax.inject.Provider<T> provider;
    private volatile java.lang.Object strongReference;
    private volatile java.lang.ref.WeakReference<T> weakReference;

    private ReferenceReleasingProvider(bleshadow.javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    public void releaseStrongReference() {
        java.lang.Object obj = this.strongReference;
        if (obj == null || obj == NULL) {
            return;
        }
        synchronized (this) {
            this.weakReference = new java.lang.ref.WeakReference<>(obj);
            this.strongReference = null;
        }
    }

    public void restoreStrongReference() {
        T t;
        java.lang.Object obj = this.strongReference;
        if (this.weakReference == null || obj != null) {
            return;
        }
        synchronized (this) {
            java.lang.Object obj2 = this.strongReference;
            if (this.weakReference != null && obj2 == null && (t = this.weakReference.get()) != null) {
                this.strongReference = t;
                this.weakReference = null;
            }
        }
    }

    @Override // bleshadow.javax.inject.Provider
    public T get() {
        T tCurrentValue = (T) currentValue();
        if (tCurrentValue == null) {
            synchronized (this) {
                tCurrentValue = currentValue();
                if (tCurrentValue == null) {
                    tCurrentValue = this.provider.get();
                    if (tCurrentValue == null) {
                        tCurrentValue = (T) NULL;
                    }
                    this.strongReference = tCurrentValue;
                }
            }
        }
        if (tCurrentValue == NULL) {
            return null;
        }
        return (T) tCurrentValue;
    }

    private java.lang.Object currentValue() {
        java.lang.Object obj = this.strongReference;
        if (obj != null) {
            return obj;
        }
        if (this.weakReference != null) {
            return this.weakReference.get();
        }
        return null;
    }

    public static <T> bleshadow.dagger.internal.ReferenceReleasingProvider<T> create(bleshadow.javax.inject.Provider<T> delegate, bleshadow.dagger.internal.ReferenceReleasingProviderManager references) {
        bleshadow.dagger.internal.ReferenceReleasingProvider<T> referenceReleasingProvider = new bleshadow.dagger.internal.ReferenceReleasingProvider<>((bleshadow.javax.inject.Provider) bleshadow.dagger.internal.Preconditions.checkNotNull(delegate));
        references.addProvider(referenceReleasingProvider);
        return referenceReleasingProvider;
    }
}
