package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdi {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.gms.internal.measurement.zzdh, java.util.List<java.lang.Throwable>> zza = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzb = new java.lang.ref.ReferenceQueue<>();

    zzdi() {
    }

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th, boolean z) {
        java.lang.ref.Reference<? extends java.lang.Throwable> referencePoll = this.zzb.poll();
        while (referencePoll != null) {
            this.zza.remove(referencePoll);
            referencePoll = this.zzb.poll();
        }
        java.util.List<java.lang.Throwable> list = this.zza.get(new com.google.android.gms.internal.measurement.zzdh(th, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> listPutIfAbsent = this.zza.putIfAbsent(new com.google.android.gms.internal.measurement.zzdh(th, this.zzb), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
