package com.google.android.datatransport.runtime;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class TransportImpl<T> implements com.google.android.datatransport.Transport<T> {
    private final java.lang.String name;
    private final com.google.android.datatransport.Encoding payloadEncoding;
    private final com.google.android.datatransport.Transformer<T, byte[]> transformer;
    private final com.google.android.datatransport.runtime.TransportContext transportContext;
    private final com.google.android.datatransport.runtime.TransportInternal transportInternal;

    static /* synthetic */ void lambda$send$0(java.lang.Exception exc) {
    }

    TransportImpl(com.google.android.datatransport.runtime.TransportContext transportContext, java.lang.String str, com.google.android.datatransport.Encoding encoding, com.google.android.datatransport.Transformer<T, byte[]> transformer, com.google.android.datatransport.runtime.TransportInternal transportInternal) {
        this.transportContext = transportContext;
        this.name = str;
        this.payloadEncoding = encoding;
        this.transformer = transformer;
        this.transportInternal = transportInternal;
    }

    @Override // com.google.android.datatransport.Transport
    public void send(com.google.android.datatransport.Event<T> event) {
        schedule(event, com.google.android.datatransport.runtime.TransportImpl$$Lambda$1.instance);
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(com.google.android.datatransport.Event<T> event, com.google.android.datatransport.TransportScheduleCallback transportScheduleCallback) {
        this.transportInternal.send(com.google.android.datatransport.runtime.SendRequest.builder().setTransportContext(this.transportContext).setEvent(event).setTransportName(this.name).setTransformer(this.transformer).setEncoding(this.payloadEncoding).build(), transportScheduleCallback);
    }
}
