package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.a.zzg> {
    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        com.google.android.datatransport.cct.a.zzg zzgVar = (com.google.android.datatransport.cct.a.zzg) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        if (zzgVar.zzc() != null) {
            objectEncoderContext2.add("clientType", zzgVar.zzc().name());
        }
        if (zzgVar.zzb() != null) {
            objectEncoderContext2.add("androidClientInfo", zzgVar.zzb());
        }
    }
}
