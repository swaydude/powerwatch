package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class DelegateFactory<T> implements dagger.internal.Factory<T> {
    private javax.inject.Provider<T> delegate;

    @Override // javax.inject.Provider
    public T get() {
        javax.inject.Provider<T> provider = this.delegate;
        if (provider == null) {
            throw new java.lang.IllegalStateException();
        }
        return provider.get();
    }

    @java.lang.Deprecated
    public void setDelegatedProvider(javax.inject.Provider<T> provider) {
        setDelegate(this, provider);
    }

    public static <T> void setDelegate(javax.inject.Provider<T> provider, javax.inject.Provider<T> provider2) {
        dagger.internal.Preconditions.checkNotNull(provider2);
        dagger.internal.DelegateFactory delegateFactory = (dagger.internal.DelegateFactory) provider;
        if (delegateFactory.delegate != null) {
            throw new java.lang.IllegalStateException();
        }
        delegateFactory.delegate = provider2;
    }

    javax.inject.Provider<T> getDelegate() {
        return (javax.inject.Provider) dagger.internal.Preconditions.checkNotNull(this.delegate);
    }
}
