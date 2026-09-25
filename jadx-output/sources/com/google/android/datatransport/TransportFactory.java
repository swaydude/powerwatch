package com.google.android.datatransport;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public interface TransportFactory {
    <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String str, java.lang.Class<T> cls, com.google.android.datatransport.Encoding encoding, com.google.android.datatransport.Transformer<T, byte[]> transformer);

    @java.lang.Deprecated
    <T> com.google.android.datatransport.Transport<T> getTransport(java.lang.String str, java.lang.Class<T> cls, com.google.android.datatransport.Transformer<T, byte[]> transformer);
}
