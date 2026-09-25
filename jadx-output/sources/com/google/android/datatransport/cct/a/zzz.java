package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.a.zzn> {
    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        com.google.android.datatransport.cct.a.zzn zznVar = (com.google.android.datatransport.cct.a.zzn) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        if (zznVar.zzb() != null) {
            objectEncoderContext2.add("mobileSubtype", zznVar.zzb().name());
        }
        if (zznVar.zzc() != null) {
            objectEncoderContext2.add("networkType", zznVar.zzc().name());
        }
    }
}
