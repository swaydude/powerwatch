package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class SetFactory<T> implements dagger.internal.Factory<java.util.Set<T>> {
    private static final dagger.internal.Factory<java.util.Set<java.lang.Object>> EMPTY_FACTORY = dagger.internal.InstanceFactory.create(java.util.Collections.emptySet());
    private final java.util.List<javax.inject.Provider<java.util.Collection<T>>> collectionProviders;
    private final java.util.List<javax.inject.Provider<T>> individualProviders;

    public static <T> dagger.internal.Factory<java.util.Set<T>> empty() {
        return (dagger.internal.Factory<java.util.Set<T>>) EMPTY_FACTORY;
    }

    public static <T> dagger.internal.SetFactory.Builder<T> builder(int i, int i2) {
        return new dagger.internal.SetFactory.Builder<>(i, i2);
    }

    public static final class Builder<T> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.List<javax.inject.Provider<java.util.Collection<T>>> collectionProviders;
        private final java.util.List<javax.inject.Provider<T>> individualProviders;

        private Builder(int i, int i2) {
            this.individualProviders = dagger.internal.DaggerCollections.presizedList(i);
            this.collectionProviders = dagger.internal.DaggerCollections.presizedList(i2);
        }

        public dagger.internal.SetFactory.Builder<T> addProvider(javax.inject.Provider<? extends T> provider) {
            this.individualProviders.add(provider);
            return this;
        }

        public dagger.internal.SetFactory.Builder<T> addCollectionProvider(javax.inject.Provider<? extends java.util.Collection<? extends T>> provider) {
            this.collectionProviders.add(provider);
            return this;
        }

        public dagger.internal.SetFactory<T> build() {
            return new dagger.internal.SetFactory<>(this.individualProviders, this.collectionProviders);
        }
    }

    private SetFactory(java.util.List<javax.inject.Provider<T>> list, java.util.List<javax.inject.Provider<java.util.Collection<T>>> list2) {
        this.individualProviders = list;
        this.collectionProviders = list2;
    }

    @Override // javax.inject.Provider
    public java.util.Set<T> get() {
        int size = this.individualProviders.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(this.collectionProviders.size());
        int size2 = this.collectionProviders.size();
        for (int i = 0; i < size2; i++) {
            java.util.Collection<T> collection = this.collectionProviders.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        java.util.HashSet hashSetNewHashSetWithExpectedSize = dagger.internal.DaggerCollections.newHashSetWithExpectedSize(size);
        int size3 = this.individualProviders.size();
        for (int i2 = 0; i2 < size3; i2++) {
            hashSetNewHashSetWithExpectedSize.add(dagger.internal.Preconditions.checkNotNull(this.individualProviders.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            java.util.Iterator it = ((java.util.Collection) arrayList.get(i3)).iterator();
            while (it.hasNext()) {
                hashSetNewHashSetWithExpectedSize.add(dagger.internal.Preconditions.checkNotNull(it.next()));
            }
        }
        return java.util.Collections.unmodifiableSet(hashSetNewHashSetWithExpectedSize);
    }
}
