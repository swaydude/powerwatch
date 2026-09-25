package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzix extends com.google.android.gms.internal.vision.zzjd {
    private final /* synthetic */ com.google.android.gms.internal.vision.zziw zzaab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzix(com.google.android.gms.internal.vision.zziw zziwVar) {
        super(zziwVar, null);
        this.zzaab = zziwVar;
    }

    @Override // com.google.android.gms.internal.vision.zzjd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.vision.zziy(this.zzaab, null);
    }

    /* synthetic */ zzix(com.google.android.gms.internal.vision.zziw zziwVar, com.google.android.gms.internal.vision.zziv zzivVar) {
        this(zziwVar);
    }
}
