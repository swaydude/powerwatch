package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleCheck<T> implements javax.inject.Provider<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = new java.lang.Object();
    private volatile java.lang.Object instance = UNINITIALIZED;
    private volatile javax.inject.Provider<T> provider;

    private SingleCheck(javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public T get() {
        T t = (T) this.instance;
        if (t != UNINITIALIZED) {
            return t;
        }
        javax.inject.Provider<T> provider = this.provider;
        if (provider == null) {
            return (T) this.instance;
        }
        T t2 = provider.get();
        this.instance = t2;
        this.provider = null;
        return t2;
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P p) {
        return ((p instanceof dagger.internal.SingleCheck) || (p instanceof dagger.internal.DoubleCheck)) ? p : new dagger.internal.SingleCheck((javax.inject.Provider) dagger.internal.Preconditions.checkNotNull(p));
    }
}
