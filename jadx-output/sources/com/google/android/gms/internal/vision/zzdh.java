package com.google.android.gms.internal.vision;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdh<E> extends com.google.android.gms.internal.vision.zzdf<E> {
    private final transient int length;
    private final transient int offset;
    private final /* synthetic */ com.google.android.gms.internal.vision.zzdf zzls;

    zzdh(com.google.android.gms.internal.vision.zzdf zzdfVar, int i, int i2) {
        this.zzls = zzdfVar;
        this.offset = i;
        this.length = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.length;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final java.lang.Object[] zzbz() {
        return this.zzls.zzbz();
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final int zzca() {
        return this.zzls.zzca() + this.offset;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final int zzcb() {
        return this.zzls.zzca() + this.offset + this.length;
    }

    @Override // java.util.List
    public final E get(int i) {
        com.google.android.gms.internal.vision.zzct.zzc(i, this.length);
        return this.zzls.get(i + this.offset);
    }

    @Override // com.google.android.gms.internal.vision.zzdf
    /* JADX INFO: renamed from: zze */
    public final com.google.android.gms.internal.vision.zzdf<E> subList(int i, int i2) {
        com.google.android.gms.internal.vision.zzct.zza(i, i2, this.length);
        com.google.android.gms.internal.vision.zzdf zzdfVar = this.zzls;
        int i3 = this.offset;
        return (com.google.android.gms.internal.vision.zzdf) zzdfVar.subList(i + i3, i2 + i3);
    }

    @Override // com.google.android.gms.internal.vision.zzdf, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }
}
