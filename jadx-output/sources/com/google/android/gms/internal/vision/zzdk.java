package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdk<K, V> extends com.google.android.gms.internal.vision.zzdj<java.util.Map.Entry<K, V>> {
    private final transient int size;
    private final transient com.google.android.gms.internal.vision.zzdg<K, V> zzlw;
    private final transient java.lang.Object[] zzlx;
    private final transient int zzly = 0;

    zzdk(com.google.android.gms.internal.vision.zzdg<K, V> zzdgVar, java.lang.Object[] objArr, int i, int i2) {
        this.zzlw = zzdgVar;
        this.zzlx = objArr;
        this.size = i2;
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    /* JADX INFO: renamed from: zzby */
    public final com.google.android.gms.internal.vision.zzdr<java.util.Map.Entry<K, V>> iterator() {
        return (com.google.android.gms.internal.vision.zzdr) zzcc().iterator();
    }

    @Override // com.google.android.gms.internal.vision.zzdc
    final int zza(java.lang.Object[] objArr, int i) {
        return zzcc().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.vision.zzdj
    final com.google.android.gms.internal.vision.zzdf<java.util.Map.Entry<K, V>> zzch() {
        return new com.google.android.gms.internal.vision.zzdn(this);
    }

    @Override // com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            java.lang.Object key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value != null && value.equals(this.zzlw.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.vision.zzdj, com.google.android.gms.internal.vision.zzdc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return iterator();
    }
}
