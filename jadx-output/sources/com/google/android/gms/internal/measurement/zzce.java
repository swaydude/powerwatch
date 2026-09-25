package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzce {
    public static <V> V zza(com.google.android.gms.internal.measurement.zzcd<V> zzcdVar) {
        try {
            return zzcdVar.zza();
        } catch (java.lang.SecurityException unused) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                return zzcdVar.zza();
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
