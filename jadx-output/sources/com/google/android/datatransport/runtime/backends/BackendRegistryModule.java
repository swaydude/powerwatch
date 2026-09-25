package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
@dagger.Module
public abstract class BackendRegistryModule {
    @dagger.Binds
    abstract com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry metadataBackendRegistry);
}
