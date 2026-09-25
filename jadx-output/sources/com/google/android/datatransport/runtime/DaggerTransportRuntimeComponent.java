package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class DaggerTransportRuntimeComponent extends com.google.android.datatransport.runtime.TransportRuntimeComponent {
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> configProvider;
    private javax.inject.Provider creationContextFactoryProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> defaultSchedulerProvider;
    private javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private javax.inject.Provider metadataBackendRegistryProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> sQLiteEventStoreProvider;
    private javax.inject.Provider schemaManagerProvider;
    private javax.inject.Provider<android.content.Context> setApplicationContextProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.TransportRuntime> transportRuntimeProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> uploaderProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> workInitializerProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    private DaggerTransportRuntimeComponent(android.content.Context context) {
        initialize(context);
    }

    public static com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder builder() {
        return new com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.Builder();
    }

    private void initialize(android.content.Context context) {
        this.executorProvider = dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.create());
        dagger.internal.Factory factoryCreate = dagger.internal.InstanceFactory.create(context);
        this.setApplicationContextProvider = factoryCreate;
        com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory creationContextFactory_FactoryCreate = com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory.create(factoryCreate, com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create());
        this.creationContextFactoryProvider = creationContextFactory_FactoryCreate;
        this.metadataBackendRegistryProvider = dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, creationContextFactory_FactoryCreate));
        this.schemaManagerProvider = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory.create(this.setApplicationContextProvider, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.create());
        this.sQLiteEventStoreProvider = dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory.create(com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create(), com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.create(), this.schemaManagerProvider));
        com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory schedulingConfigModule_ConfigFactoryCreate = com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory.create(com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create());
        this.configProvider = schedulingConfigModule_ConfigFactoryCreate;
        com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactoryCreate = com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory.create(this.setApplicationContextProvider, this.sQLiteEventStoreProvider, schedulingConfigModule_ConfigFactoryCreate, com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create());
        this.workSchedulerProvider = schedulingModule_WorkSchedulerFactoryCreate;
        javax.inject.Provider<java.util.concurrent.Executor> provider = this.executorProvider;
        javax.inject.Provider provider2 = this.metadataBackendRegistryProvider;
        javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> provider3 = this.sQLiteEventStoreProvider;
        this.defaultSchedulerProvider = com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory.create(provider, provider2, schedulingModule_WorkSchedulerFactoryCreate, provider3, provider3);
        javax.inject.Provider<android.content.Context> provider4 = this.setApplicationContextProvider;
        javax.inject.Provider provider5 = this.metadataBackendRegistryProvider;
        javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> provider6 = this.sQLiteEventStoreProvider;
        this.uploaderProvider = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory.create(provider4, provider5, provider6, this.workSchedulerProvider, this.executorProvider, provider6, com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create());
        javax.inject.Provider<java.util.concurrent.Executor> provider7 = this.executorProvider;
        javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> provider8 = this.sQLiteEventStoreProvider;
        this.workInitializerProvider = com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory.create(provider7, provider8, this.workSchedulerProvider, provider8);
        this.transportRuntimeProvider = dagger.internal.DoubleCheck.provider(com.google.android.datatransport.runtime.TransportRuntime_Factory.create(com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create(), com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create(), this.defaultSchedulerProvider, this.uploaderProvider, this.workInitializerProvider));
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime() {
        return this.transportRuntimeProvider.get();
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore() {
        return this.sQLiteEventStoreProvider.get();
    }

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    private static final class Builder implements com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder {
        private android.content.Context setApplicationContext;

        private Builder() {
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.Builder setApplicationContext(android.content.Context context) {
            this.setApplicationContext = (android.content.Context) dagger.internal.Preconditions.checkNotNull(context);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public com.google.android.datatransport.runtime.TransportRuntimeComponent build() {
            dagger.internal.Preconditions.checkBuilderRequirement(this.setApplicationContext, android.content.Context.class);
            return new com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent(this.setApplicationContext);
        }
    }
}
