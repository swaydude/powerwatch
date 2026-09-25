package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class EventStoreModule_SchemaVersionFactory implements dagger.internal.Factory<java.lang.Integer> {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory INSTANCE = new com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory();

    @Override // javax.inject.Provider
    public java.lang.Integer get() {
        return java.lang.Integer.valueOf(schemaVersion());
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory create() {
        return INSTANCE;
    }

    public static int schemaVersion() {
        return com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.schemaVersion();
    }
}
