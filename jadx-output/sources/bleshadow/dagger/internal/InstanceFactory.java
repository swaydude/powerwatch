package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceFactory<T> implements bleshadow.dagger.internal.Factory<T>, bleshadow.dagger.Lazy<T> {
    private static final bleshadow.dagger.internal.InstanceFactory<java.lang.Object> NULL_INSTANCE_FACTORY = new bleshadow.dagger.internal.InstanceFactory<>(null);
    private final T instance;

    public static <T> bleshadow.dagger.internal.Factory<T> create(T instance) {
        return new bleshadow.dagger.internal.InstanceFactory(bleshadow.dagger.internal.Preconditions.checkNotNull(instance, "instance cannot be null"));
    }

    public static <T> bleshadow.dagger.internal.Factory<T> createNullable(T instance) {
        if (instance == null) {
            return nullInstanceFactory();
        }
        return new bleshadow.dagger.internal.InstanceFactory(instance);
    }

    private static <T> bleshadow.dagger.internal.InstanceFactory<T> nullInstanceFactory() {
        return (bleshadow.dagger.internal.InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    private InstanceFactory(T instance) {
        this.instance = instance;
    }

    @Override // bleshadow.javax.inject.Provider
    public T get() {
        return this.instance;
    }
}
