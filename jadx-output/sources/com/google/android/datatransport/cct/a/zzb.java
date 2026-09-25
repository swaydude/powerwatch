package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.a.zzd> {
    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        com.google.android.datatransport.cct.a.zzd zzdVar = (com.google.android.datatransport.cct.a.zzd) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        if (zzdVar.zzi() != Integer.MIN_VALUE) {
            objectEncoderContext2.add("sdkVersion", zzdVar.zzi());
        }
        if (zzdVar.zzf() != null) {
            objectEncoderContext2.add("model", zzdVar.zzf());
        }
        if (zzdVar.zzd() != null) {
            objectEncoderContext2.add("hardware", zzdVar.zzd());
        }
        if (zzdVar.zzb() != null) {
            objectEncoderContext2.add("device", zzdVar.zzb());
        }
        if (zzdVar.zzh() != null) {
            objectEncoderContext2.add("product", zzdVar.zzh());
        }
        if (zzdVar.zzg() != null) {
            objectEncoderContext2.add("osBuild", zzdVar.zzg());
        }
        if (zzdVar.zze() != null) {
            objectEncoderContext2.add("manufacturer", zzdVar.zze());
        }
        if (zzdVar.zzc() != null) {
            objectEncoderContext2.add("fingerprint", zzdVar.zzc());
        }
    }
}
