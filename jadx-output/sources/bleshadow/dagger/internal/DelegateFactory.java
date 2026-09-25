package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class DelegateFactory<T> implements bleshadow.dagger.internal.Factory<T> {
    private bleshadow.javax.inject.Provider<T> delegate;

    @Override // bleshadow.javax.inject.Provider
    public T get() {
        bleshadow.javax.inject.Provider<T> provider = this.delegate;
        if (provider == null) {
            throw new java.lang.IllegalStateException();
        }
        return provider.get();
    }

    public void setDelegatedProvider(bleshadow.javax.inject.Provider<T> delegate) {
        if (delegate == null) {
            throw new java.lang.IllegalArgumentException();
        }
        if (this.delegate != null) {
            throw new java.lang.IllegalStateException();
        }
        this.delegate = delegate;
    }
}
