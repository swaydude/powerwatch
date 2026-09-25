package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class EventStoreModule_StoreConfigFactory implements dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory INSTANCE = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory();

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig get() {
        return storeConfig();
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory create() {
        return INSTANCE;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
        return (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) dagger.internal.Preconditions.checkNotNull(com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.storeConfig(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
