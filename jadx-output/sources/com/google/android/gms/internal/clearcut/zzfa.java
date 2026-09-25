package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzfa extends java.util.AbstractList<java.lang.String> implements com.google.android.gms.internal.clearcut.zzcx, java.util.RandomAccess {
    private final com.google.android.gms.internal.clearcut.zzcx zzpb;

    public zzfa(com.google.android.gms.internal.clearcut.zzcx zzcxVar) {
        this.zzpb = zzcxVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        return (java.lang.String) this.zzpb.get(i);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final java.lang.Object getRaw(int i) {
        return this.zzpb.getRaw(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.internal.clearcut.zzfc(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new com.google.android.gms.internal.clearcut.zzfb(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzpb.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final java.util.List<?> zzbt() {
        return this.zzpb.zzbt();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final com.google.android.gms.internal.clearcut.zzcx zzbu() {
        return this;
    }
}
