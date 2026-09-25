package com.google.android.gms.internal.firebase_messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzo {
    private final java.util.concurrent.ConcurrentHashMap<com.google.android.gms.internal.firebase_messaging.zzr, java.util.List<java.lang.Throwable>> zza = new java.util.concurrent.ConcurrentHashMap<>(16, 0.75f, 10);
    private final java.lang.ref.ReferenceQueue<java.lang.Throwable> zzb = new java.lang.ref.ReferenceQueue<>();

    zzo() {
    }

    public final java.util.List<java.lang.Throwable> zza(java.lang.Throwable th, boolean z) {
        java.lang.ref.Reference<? extends java.lang.Throwable> referencePoll = this.zzb.poll();
        while (referencePoll != null) {
            this.zza.remove(referencePoll);
            referencePoll = this.zzb.poll();
        }
        java.util.List<java.lang.Throwable> list = this.zza.get(new com.google.android.gms.internal.firebase_messaging.zzr(th, null));
        if (list != null) {
            return list;
        }
        java.util.Vector vector = new java.util.Vector(2);
        java.util.List<java.lang.Throwable> listPutIfAbsent = this.zza.putIfAbsent(new com.google.android.gms.internal.firebase_messaging.zzr(th, this.zzb), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
