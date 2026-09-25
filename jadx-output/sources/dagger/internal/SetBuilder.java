package dagger.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class SetBuilder<T> {
    private static final java.lang.String SET_CONTRIBUTIONS_CANNOT_BE_NULL = "Set contributions cannot be null";
    private final java.util.List<T> contributions;

    private SetBuilder(int i) {
        this.contributions = new java.util.ArrayList(i);
    }

    public static <T> dagger.internal.SetBuilder<T> newSetBuilder(int i) {
        return new dagger.internal.SetBuilder<>(i);
    }

    public dagger.internal.SetBuilder<T> add(T t) {
        this.contributions.add((T) dagger.internal.Preconditions.checkNotNull(t, SET_CONTRIBUTIONS_CANNOT_BE_NULL));
        return this;
    }

    public dagger.internal.SetBuilder<T> addAll(java.util.Collection<? extends T> collection) {
        java.util.Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            dagger.internal.Preconditions.checkNotNull(it.next(), SET_CONTRIBUTIONS_CANNOT_BE_NULL);
        }
        this.contributions.addAll(collection);
        return this;
    }

    public java.util.Set<T> build() {
        int size = this.contributions.size();
        if (size == 0) {
            return java.util.Collections.emptySet();
        }
        if (size == 1) {
            return java.util.Collections.singleton(this.contributions.get(0));
        }
        return java.util.Collections.unmodifiableSet(new java.util.HashSet(this.contributions));
    }
}
