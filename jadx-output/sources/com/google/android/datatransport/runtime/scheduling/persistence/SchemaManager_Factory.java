package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SchemaManager_Factory implements dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> {
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<java.lang.Integer> schemaVersionProvider;

    public SchemaManager_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<java.lang.Integer> provider2) {
        this.contextProvider = provider;
        this.schemaVersionProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager get() {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager(this.contextProvider.get(), this.schemaVersionProvider.get().intValue());
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<java.lang.Integer> provider2) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory(provider, provider2);
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager newInstance(android.content.Context context, int i) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager(context, i);
    }
}
