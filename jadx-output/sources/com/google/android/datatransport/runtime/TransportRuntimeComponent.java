package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Component(modules = {com.google.android.datatransport.runtime.backends.BackendRegistryModule.class, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.class, com.google.android.datatransport.runtime.ExecutionModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.class, com.google.android.datatransport.runtime.time.TimeModule.class})
@javax.inject.Singleton
abstract class TransportRuntimeComponent implements java.io.Closeable {

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    @dagger.Component.Builder
    interface Builder {
        com.google.android.datatransport.runtime.TransportRuntimeComponent build();

        @dagger.BindsInstance
        com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder setApplicationContext(android.content.Context context);
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore();

    abstract com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime();

    TransportRuntimeComponent() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        getEventStore().close();
    }
}
