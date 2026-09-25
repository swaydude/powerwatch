package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdi<E> extends com.google.android.gms.internal.vision.zzdf<E> {
    static final com.google.android.gms.internal.vision.zzdf<java.lang.Object> zzlt = new com.google.android.gms.internal.vision.zzdi(new java.lang.Object[0], 0);
    private final transient int size;
    private final transient java.lang.Object[] zzlu;

    zzdi(java.lang.Object[] objArr, int i) {
        this.zzlu = objArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final int zzca() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final java.lang.Object[] zzbz() {
        return this.zzlu;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final int zzcb() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzdf, com.google.android.gms.internal.vision.zzdc
    final int zza(java.lang.Object[] objArr, int i) {
        java.lang.System.arraycopy(this.zzlu, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.google.android.gms.internal.vision.zzct.zzc(i, this.size);
        return (E) this.zzlu[i];
    }
}
