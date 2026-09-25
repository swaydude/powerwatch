package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzdp extends com.google.android.gms.internal.vision.zzdf<java.lang.Object> {
    private final transient int offset;
    private final transient int size;
    private final transient java.lang.Object[] zzlx;

    zzdp(java.lang.Object[] objArr, int i, int i2) {
        this.zzlx = objArr;
        this.offset = i;
        this.size = i2;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        com.google.android.gms.internal.vision.zzct.zzc(i, this.size);
        return this.zzlx[(i * 2) + this.offset];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }
}
