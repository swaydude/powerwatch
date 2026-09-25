package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzic implements java.util.Iterator<java.lang.String> {
    private java.util.Iterator<java.lang.String> zza;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzia zzb;

    zzic(com.google.android.gms.internal.measurement.zzia zziaVar) {
        this.zzb = zziaVar;
        this.zza = zziaVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zza.next();
    }
}
