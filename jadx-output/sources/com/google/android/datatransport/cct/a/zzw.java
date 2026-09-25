package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.a.zzk> {
    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        com.google.android.datatransport.cct.a.zzk zzkVar = (com.google.android.datatransport.cct.a.zzk) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add("requestTimeMs", zzkVar.zzf()).add("requestUptimeMs", zzkVar.zzg());
        if (zzkVar.zzb() != null) {
            objectEncoderContext2.add("clientInfo", zzkVar.zzb());
        }
        if (zzkVar.zze() != null) {
            objectEncoderContext2.add("logSourceName", zzkVar.zze());
        } else {
            if (zzkVar.zzd() == Integer.MIN_VALUE) {
                throw new com.google.firebase.encoders.EncodingException("Log request must have either LogSourceName or LogSource");
            }
            objectEncoderContext2.add("logSource", zzkVar.zzd());
        }
        if (zzkVar.zzc().isEmpty()) {
            return;
        }
        objectEncoderContext2.add("logEvent", zzkVar.zzc());
    }
}
