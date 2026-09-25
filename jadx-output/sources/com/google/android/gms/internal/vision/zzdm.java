package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdm<K> extends com.google.android.gms.internal.vision.zzdj<K> {
    private final transient com.google.android.gms.internal.vision.zzdf<K> zzlm;
    private final transient com.google.android.gms.internal.vision.zzdg<K, ?> zzlw;

    zzdm(com.google.android.gms.internal.vision.zzdg<K, ?> zzdgVar, com.google.android.gms.internal.vision.zzdf<K> zzdfVar) {
        this.zzlw = zzdgVar;
        this.zzlm = zzdfVar;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    /* JADX INFO: renamed from: zzby */
    public final com.google.android.gms.internal.vision.zzdr<K> iterator() {
        return (com.google.android.gms.internal.vision.zzdr) zzcc().iterator();
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final int zza(java.lang.Object[] objArr, int i) {
        return zzcc().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.vision.zzdj, com.google.android.gms.internal.vision.zzdc
    public final com.google.android.gms.internal.vision.zzdf<K> zzcc() {
        return this.zzlm;
    }

    @Override // com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return this.zzlw.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzlw.size();
    }

    @Override // com.google.android.gms.internal.vision.zzdj, com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
