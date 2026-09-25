package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleCheck<T> implements javax.inject.Provider<T>, dagger.Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = new java.lang.Object();
    private volatile java.lang.Object instance = UNINITIALIZED;
    private volatile javax.inject.Provider<T> provider;

    private DoubleCheck(javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.instance;
        java.lang.Object obj = UNINITIALIZED;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.instance;
                if (t == obj) {
                    t = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t);
                    this.provider = null;
                }
            }
        }
        return t;
    }

    public static java.lang.Object reentrantCheck(java.lang.Object obj, java.lang.Object obj2) {
        if (!((obj == UNINITIALIZED || (obj instanceof dagger.internal.MemoizedSentinel)) ? false : true) || obj == obj2) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        dagger.internal.Preconditions.checkNotNull(p);
        return p instanceof dagger.internal.DoubleCheck ? p : new dagger.internal.DoubleCheck(p);
    }

    public static <P extends javax.inject.Provider<T>, T> dagger.Lazy<T> lazy(P p) {
        if (p instanceof dagger.Lazy) {
            return (dagger.Lazy) p;
        }
        return new dagger.internal.DoubleCheck((javax.inject.Provider) dagger.internal.Preconditions.checkNotNull(p));
    }
}
