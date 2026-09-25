package com.google.android.gms.vision.clearcut;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class VisionClearcutLogger {
    private final com.google.android.gms.clearcut.ClearcutLogger zzbv;
    private boolean zzbw = true;

    public VisionClearcutLogger(android.content.Context context) {
        this.zzbv = new com.google.android.gms.clearcut.ClearcutLogger(context, "VISION", null);
    }

    public final void zzb(int i, com.google.android.gms.internal.vision.zzea.zzo zzoVar) {
        byte[] byteArray = zzoVar.toByteArray();
        if (i < 0 || i > 3) {
            com.google.android.gms.vision.L.i("Illegal event code: %d", java.lang.Integer.valueOf(i));
            return;
        }
        try {
            if (this.zzbw) {
                this.zzbv.newEvent(byteArray).setEventCode(i).log();
                return;
            }
            com.google.android.gms.internal.vision.zzea.zzo.zza zzaVarZzdi = com.google.android.gms.internal.vision.zzea.zzo.zzdi();
            try {
                zzaVarZzdi.zza(byteArray, 0, byteArray.length, com.google.android.gms.internal.vision.zzgd.zzfm());
                com.google.android.gms.vision.L.e("Would have logged:\n%s", zzaVarZzdi.toString());
            } catch (java.lang.Exception e) {
                com.google.android.gms.vision.L.e(e, "Parsing error", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception e2) {
            com.google.android.gms.internal.vision.zzds.zza(e2);
            com.google.android.gms.vision.L.e(e2, "Failed to log", new java.lang.Object[0]);
        }
    }
}
