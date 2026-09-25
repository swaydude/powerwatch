package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ProviderOfLazy<T> implements javax.inject.Provider<dagger.Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final javax.inject.Provider<T> provider;

    private ProviderOfLazy(javax.inject.Provider<T> provider) {
        this.provider = provider;
    }

    @Override // javax.inject.Provider
    public dagger.Lazy<T> get() {
        return dagger.internal.DoubleCheck.lazy(this.provider);
    }

    public static <T> javax.inject.Provider<dagger.Lazy<T>> create(javax.inject.Provider<T> provider) {
        return new dagger.internal.ProviderOfLazy((javax.inject.Provider) dagger.internal.Preconditions.checkNotNull(provider));
    }
}
