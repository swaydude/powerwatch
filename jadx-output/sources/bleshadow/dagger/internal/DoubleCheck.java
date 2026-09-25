package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleCheck<T> implements bleshadow.javax.inject.Provider<T>, bleshadow.dagger.Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = new java.lang.Object();
    private volatile java.lang.Object instance = UNINITIALIZED;
    private volatile bleshadow.javax.inject.Provider<T> provider;

    private DoubleCheck(bleshadow.javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public T get() {
        T t = (T) this.instance;
        java.lang.Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    java.lang.Object obj2 = this.instance;
                    if (obj2 != obj && obj2 != t) {
                        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + t + ". This is likely due to a circular dependency.");
                    }
                    this.instance = t;
                    this.provider = null;
                }
            }
        }
        return t;
    }

    public static <P extends bleshadow.javax.inject.Provider<T>, T> bleshadow.javax.inject.Provider<T> provider(P delegate) {
        bleshadow.dagger.internal.Preconditions.checkNotNull(delegate);
        return delegate instanceof bleshadow.dagger.internal.DoubleCheck ? delegate : new bleshadow.dagger.internal.DoubleCheck(delegate);
    }

    public static <P extends bleshadow.javax.inject.Provider<T>, T> bleshadow.dagger.Lazy<T> lazy(P provider) {
        if (provider instanceof bleshadow.dagger.Lazy) {
            return (bleshadow.dagger.Lazy) provider;
        }
        return new bleshadow.dagger.internal.DoubleCheck((bleshadow.javax.inject.Provider) bleshadow.dagger.internal.Preconditions.checkNotNull(provider));
    }
}
