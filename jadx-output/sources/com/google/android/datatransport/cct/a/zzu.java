package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu implements com.google.firebase.encoders.ObjectEncoder<com.google.android.datatransport.cct.a.zzi> {
    @Override // com.google.firebase.encoders.Encoder
    public void encode(java.lang.Object obj, com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext) throws com.google.firebase.encoders.EncodingException, java.io.IOException {
        com.google.android.datatransport.cct.a.zzi zziVar = (com.google.android.datatransport.cct.a.zzi) obj;
        com.google.firebase.encoders.ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add("eventTimeMs", zziVar.zza()).add("eventUptimeMs", zziVar.zzb()).add("timezoneOffsetSeconds", zziVar.zzc());
        if (zziVar.zzf() != null) {
            objectEncoderContext2.add("sourceExtension", zziVar.zzf());
        }
        if (zziVar.zzg() != null) {
            objectEncoderContext2.add("sourceExtensionJsonProto3", zziVar.zzg());
        }
        if (zziVar.zzd() != Integer.MIN_VALUE) {
            objectEncoderContext2.add("eventCode", zziVar.zzd());
        }
        if (zziVar.zze() != null) {
            objectEncoderContext2.add("networkConnectionInfo", zziVar.zze());
        }
    }
}
