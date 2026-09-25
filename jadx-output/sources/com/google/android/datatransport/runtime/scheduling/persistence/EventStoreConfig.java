package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class EventStoreConfig {
    private static final int LOAD_BATCH_SIZE = 200;
    private static final int LOCK_TIME_OUT_MS = 10000;
    private static final long MAX_DB_STORAGE_SIZE_IN_BYTES = 10485760;
    private static final long DURATION_ONE_WEEK_MS = 604800000;
    static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig DEFAULT = builder().setMaxStorageSizeInBytes(MAX_DB_STORAGE_SIZE_IN_BYTES).setLoadBatchSize(200).setCriticalSectionEnterTimeoutMs(10000).setEventCleanUpAge(DURATION_ONE_WEEK_MS).build();

    abstract int getCriticalSectionEnterTimeoutMs();

    abstract long getEventCleanUpAge();

    abstract int getLoadBatchSize();

    abstract long getMaxStorageSizeInBytes();

    EventStoreConfig() {
    }

    static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder builder() {
        return new com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig.Builder();
    }

    com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder toBuilder() {
        return builder().setMaxStorageSizeInBytes(getMaxStorageSizeInBytes()).setLoadBatchSize(getLoadBatchSize()).setCriticalSectionEnterTimeoutMs(getCriticalSectionEnterTimeoutMs()).setEventCleanUpAge(getEventCleanUpAge());
    }

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    static abstract class Builder {
        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig build();

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setCriticalSectionEnterTimeoutMs(int i);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setEventCleanUpAge(long j);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setLoadBatchSize(int i);

        abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder setMaxStorageSizeInBytes(long j);

        Builder() {
        }
    }
}
