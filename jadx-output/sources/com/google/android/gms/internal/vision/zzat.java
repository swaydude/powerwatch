package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzat {
    public static <V> V zza(com.google.android.gms.internal.vision.zzaw<V> zzawVar) {
        try {
            return zzawVar.zzt();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzawVar.zzt();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
