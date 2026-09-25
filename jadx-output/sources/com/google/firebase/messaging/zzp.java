package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzp implements com.google.android.datatransport.Transformer {
    static final com.google.android.datatransport.Transformer zza = new com.google.firebase.messaging.zzp();

    private zzp() {
    }

    @Override // com.google.android.datatransport.Transformer
    public final java.lang.Object apply(java.lang.Object obj) {
        return ((java.lang.String) obj).getBytes();
    }
}
