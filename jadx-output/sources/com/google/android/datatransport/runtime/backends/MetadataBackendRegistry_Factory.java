package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements dagger.internal.Factory<com.google.android.datatransport.runtime.backends.MetadataBackendRegistry> {
    private final javax.inject.Provider<android.content.Context> applicationContextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> provider2) {
        this.applicationContextProvider = provider;
        this.creationContextFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.backends.MetadataBackendRegistry get() {
        return new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }

    public static com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.backends.CreationContextFactory> provider2) {
        return new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static com.google.android.datatransport.runtime.backends.MetadataBackendRegistry newInstance(android.content.Context context, java.lang.Object obj) {
        return new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry(context, (com.google.android.datatransport.runtime.backends.CreationContextFactory) obj);
    }
}
