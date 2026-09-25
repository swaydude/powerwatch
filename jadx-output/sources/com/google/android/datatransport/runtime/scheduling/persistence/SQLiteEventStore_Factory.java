package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> configProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> schemaManagerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> wallClockProvider;

    public SQLiteEventStore_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> provider4) {
        this.wallClockProvider = provider;
        this.clockProvider = provider2;
        this.configProvider = provider3;
        this.schemaManagerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore get() {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get());
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> provider3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> provider4) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory(provider, provider2, provider3, provider4);
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore newInstance(com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2, java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore(clock, clock2, (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) obj, (com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager) obj2);
    }
}
