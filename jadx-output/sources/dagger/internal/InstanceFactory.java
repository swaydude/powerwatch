package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class InstanceFactory<T> implements dagger.internal.Factory<T>, dagger.Lazy<T> {
    private static final dagger.internal.InstanceFactory<java.lang.Object> NULL_INSTANCE_FACTORY = new dagger.internal.InstanceFactory<>(null);
    private final T instance;

    public static <T> dagger.internal.Factory<T> create(T t) {
        return new dagger.internal.InstanceFactory(dagger.internal.Preconditions.checkNotNull(t, "instance cannot be null"));
    }

    public static <T> dagger.internal.Factory<T> createNullable(T t) {
        if (t == null) {
            return nullInstanceFactory();
        }
        return new dagger.internal.InstanceFactory(t);
    }

    private static <T> dagger.internal.InstanceFactory<T> nullInstanceFactory() {
        return (dagger.internal.InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    private InstanceFactory(T t) {
        this.instance = t;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.instance;
    }
}
