package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ProviderOfLazy<T> implements bleshadow.javax.inject.Provider<bleshadow.dagger.Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final bleshadow.javax.inject.Provider<T> provider;

    private ProviderOfLazy(bleshadow.javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // bleshadow.javax.inject.Provider
    public bleshadow.dagger.Lazy<T> get() {
        return bleshadow.dagger.internal.DoubleCheck.lazy(this.provider);
    }

    public static <T> bleshadow.javax.inject.Provider<bleshadow.dagger.Lazy<T>> create(bleshadow.javax.inject.Provider<T> provider) {
        return new bleshadow.dagger.internal.ProviderOfLazy((bleshadow.javax.inject.Provider) bleshadow.dagger.internal.Preconditions.checkNotNull(provider));
    }
}
