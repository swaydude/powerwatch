package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzal implements java.util.Iterator<java.lang.String> {
    private java.util.Iterator<java.lang.String> zza;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzam zzb;

    zzal(com.google.android.gms.measurement.internal.zzam zzamVar) {
        this.zzb = zzamVar;
        this.zza = zzamVar.zza.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zza.next();
    }
}
