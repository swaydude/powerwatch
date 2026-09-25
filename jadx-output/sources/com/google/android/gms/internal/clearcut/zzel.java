package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzel extends com.google.android.gms.internal.clearcut.zzer {
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzei zzos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzel(com.google.android.gms.internal.clearcut.zzei zzeiVar) {
        super(zzeiVar, null);
        this.zzos = zzeiVar;
    }

    /* synthetic */ zzel(com.google.android.gms.internal.clearcut.zzei zzeiVar, com.google.android.gms.internal.clearcut.zzej zzejVar) {
        this(zzeiVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzer, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.clearcut.zzek(this.zzos, null);
    }
}
