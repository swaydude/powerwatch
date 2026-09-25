package io.fabric.sdk.android.services.persistence;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceStoreStrategy<T> implements io.fabric.sdk.android.services.persistence.PersistenceStrategy<T> {
    private final java.lang.String key;
    private final io.fabric.sdk.android.services.persistence.SerializationStrategy<T> serializer;
    private final io.fabric.sdk.android.services.persistence.PreferenceStore store;

    public PreferenceStoreStrategy(io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore, io.fabric.sdk.android.services.persistence.SerializationStrategy<T> serializationStrategy, java.lang.String str) {
        this.store = preferenceStore;
        this.serializer = serializationStrategy;
        this.key = str;
    }

    @Override // io.fabric.sdk.android.services.persistence.PersistenceStrategy
    public void save(T t) {
        io.fabric.sdk.android.services.persistence.PreferenceStore preferenceStore = this.store;
        preferenceStore.save(preferenceStore.edit().putString(this.key, this.serializer.serialize(t)));
    }

    @Override // io.fabric.sdk.android.services.persistence.PersistenceStrategy
    public T restore() {
        return this.serializer.deserialize(this.store.get().getString(this.key, null));
    }

    @Override // io.fabric.sdk.android.services.persistence.PersistenceStrategy
    public void clear() {
        this.store.edit().remove(this.key).commit();
    }
}
