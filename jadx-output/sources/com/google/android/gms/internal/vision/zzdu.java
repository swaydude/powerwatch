package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdu {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.gms.internal.vision.zzdx, java.util.List<java.lang.Throwable>> zzme = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzmf = new java.lang.ref.ReferenceQueue<>();

    zzdu() {
    }

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th, boolean z) {
        java.lang.ref.Reference<? extends java.lang.Throwable> referencePoll = this.zzmf.poll();
        while (referencePoll != null) {
            this.zzme.remove(referencePoll);
            referencePoll = this.zzmf.poll();
        }
        java.util.List<java.lang.Throwable> list = this.zzme.get(new com.google.android.gms.internal.vision.zzdx(th, null));
        if (!z || list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> listPutIfAbsent = this.zzme.putIfAbsent(new com.google.android.gms.internal.vision.zzdx(th, this.zzmf), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
