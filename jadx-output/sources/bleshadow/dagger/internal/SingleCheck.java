package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class SingleCheck<T> implements bleshadow.javax.inject.Provider<T>, bleshadow.dagger.Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = new java.lang.Object();
    private volatile java.lang.Object instance = UNINITIALIZED;
    private volatile bleshadow.javax.inject.Provider<T> provider;

    private SingleCheck(bleshadow.javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public T get() {
        bleshadow.javax.inject.Provider<T> provider = this.provider;
        if (this.instance == UNINITIALIZED) {
            this.instance = provider.get();
            this.provider = null;
        }
        return (T) this.instance;
    }

    public static <P extends bleshadow.javax.inject.Provider<T>, T> bleshadow.javax.inject.Provider<T> provider(P provider) {
        return ((provider instanceof bleshadow.dagger.internal.SingleCheck) || (provider instanceof bleshadow.dagger.internal.DoubleCheck)) ? provider : new bleshadow.dagger.internal.SingleCheck((bleshadow.javax.inject.Provider) bleshadow.dagger.internal.Preconditions.checkNotNull(provider));
    }
}
