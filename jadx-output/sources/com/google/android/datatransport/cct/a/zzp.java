package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.a.zze> {
    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        objectEncoderContext.add("logRequest", ((com.google.android.datatransport.cct.a.zze) obj).zza());
    }
}
