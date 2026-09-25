package bleshadow.dagger.internal;

/* JADX INFO: loaded from: classes.dex */
public final class SetFactory<T> implements bleshadow.dagger.internal.Factory<java.util.Set<T>> {
    private static final bleshadow.dagger.internal.Factory<java.util.Set<java.lang.Object>> EMPTY_FACTORY = bleshadow.dagger.internal.InstanceFactory.create(java.util.Collections.emptySet());
    private final java.util.List<bleshadow.javax.inject.Provider<java.util.Collection<T>>> collectionProviders;
    private final java.util.List<bleshadow.javax.inject.Provider<T>> individualProviders;

    public static <T> bleshadow.dagger.internal.Factory<java.util.Set<T>> empty() {
        return (bleshadow.dagger.internal.Factory<java.util.Set<T>>) EMPTY_FACTORY;
    }

    public static <T> bleshadow.dagger.internal.SetFactory.Builder<T> builder(int individualProviderSize, int collectionProviderSize) {
        return new bleshadow.dagger.internal.SetFactory.Builder<>(individualProviderSize, collectionProviderSize);
    }

    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.List<bleshadow.javax.inject.Provider<java.util.Collection<T>>> collectionProviders;
        private final java.util.List<bleshadow.javax.inject.Provider<T>> individualProviders;

        private Builder(int individualProviderSize, int collectionProviderSize) {
            this.individualProviders = bleshadow.dagger.internal.DaggerCollections.presizedList(individualProviderSize);
            this.collectionProviders = bleshadow.dagger.internal.DaggerCollections.presizedList(collectionProviderSize);
        }

        public bleshadow.dagger.internal.SetFactory.Builder<T> addProvider(bleshadow.javax.inject.Provider<? extends T> individualProvider) {
            this.individualProviders.add(individualProvider);
            return this;
        }

        public bleshadow.dagger.internal.SetFactory.Builder<T> addCollectionProvider(bleshadow.javax.inject.Provider<? extends java.util.Collection<? extends T>> collectionProvider) {
            this.collectionProviders.add(collectionProvider);
            return this;
        }

        public bleshadow.dagger.internal.SetFactory<T> build() {
            return new bleshadow.dagger.internal.SetFactory<>(this.individualProviders, this.collectionProviders);
        }
    }

    private SetFactory(java.util.List<bleshadow.javax.inject.Provider<T>> individualProviders, java.util.List<bleshadow.javax.inject.Provider<java.util.Collection<T>>> collectionProviders) {
        this.individualProviders = individualProviders;
        this.collectionProviders = collectionProviders;
    }

    @Override // bleshadow.javax.inject.Provider
    public java.util.Set<T> get() {
        int size = this.individualProviders.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.collectionProviders.size());
        int size2 = this.collectionProviders.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection<T> collection = this.collectionProviders.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSetNewHashSetWithExpectedSize = bleshadow.dagger.internal.DaggerCollections.newHashSetWithExpectedSize(size);
        int size3 = this.individualProviders.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSetNewHashSetWithExpectedSize.add(bleshadow.dagger.internal.Preconditions.checkNotNull(this.individualProviders.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            java.util.Iterator it = ((java.util.Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                hashSetNewHashSetWithExpectedSize.add(bleshadow.dagger.internal.Preconditions.checkNotNull(it.next()));
            }
        }
        return java.util.Collections.unmodifiableSet(hashSetNewHashSetWithExpectedSize);
    }
}
