package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Module
public abstract class EventStoreModule {
    @dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore);

    @dagger.Binds
    abstract com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore);

    @dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT;
    }

    @dagger.Provides
    @javax.inject.Named("SCHEMA_VERSION")
    static int schemaVersion() {
        return com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.SCHEMA_VERSION;
    }
}
