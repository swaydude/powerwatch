package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CreationContextFactory_Factory implements dagger.internal.Factory<com.google.android.datatransport.runtime.backends.CreationContextFactory> {
    private final javax.inject.Provider<android.content.Context> applicationContextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> monotonicClockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> wallClockProvider;

    public CreationContextFactory_Factory(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider3) {
        this.applicationContextProvider = provider;
        this.wallClockProvider = provider2;
        this.monotonicClockProvider = provider3;
    }

    @Override // javax.inject.Provider
    public com.google.android.datatransport.runtime.backends.CreationContextFactory get() {
        return new com.google.android.datatransport.runtime.backends.CreationContextFactory(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }

    public static com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory create(javax.inject.Provider<android.content.Context> provider, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider2, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> provider3) {
        return new com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory(provider, provider2, provider3);
    }

    public static com.google.android.datatransport.runtime.backends.CreationContextFactory newInstance(android.content.Context context, com.google.android.datatransport.runtime.time.Clock clock, com.google.android.datatransport.runtime.time.Clock clock2) {
        return new com.google.android.datatransport.runtime.backends.CreationContextFactory(context, clock, clock2);
    }
}
