package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public interface TransportBackend {
    com.google.android.datatransport.runtime.EventInternal decorate(com.google.android.datatransport.runtime.EventInternal eventInternal);

    com.google.android.datatransport.runtime.backends.BackendResponse send(com.google.android.datatransport.runtime.backends.BackendRequest backendRequest);
}
