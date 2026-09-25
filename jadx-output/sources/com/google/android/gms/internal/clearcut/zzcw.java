package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzcw extends com.google.android.gms.internal.clearcut.zzav<java.lang.String> implements com.google.android.gms.internal.clearcut.zzcx, java.util.RandomAccess {
    private static final com.google.android.gms.internal.clearcut.zzcw zzlq;
    private static final com.google.android.gms.internal.clearcut.zzcx zzlr;
    private final java.util.List<java.lang.Object> zzls;

    static {
        com.google.android.gms.internal.clearcut.zzcw zzcwVar = new com.google.android.gms.internal.clearcut.zzcw();
        zzlq = zzcwVar;
        zzcwVar.zzv();
        zzlr = zzcwVar;
    }

    public zzcw() {
        this(10);
    }

    public zzcw(int i) {
        this((java.util.ArrayList<java.lang.Object>) new java.util.ArrayList(i));
    }

    private zzcw(java.util.ArrayList<java.lang.Object> arrayList) {
        this.zzls = arrayList;
    }

    private static java.lang.String zze(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return obj instanceof com.google.android.gms.internal.clearcut.zzbb ? ((com.google.android.gms.internal.clearcut.zzbb) obj).zzz() : com.google.android.gms.internal.clearcut.zzci.zzf((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        zzw();
        this.zzls.add(i, (java.lang.String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        zzw();
        if (collection instanceof com.google.android.gms.internal.clearcut.zzcx) {
            collection = ((com.google.android.gms.internal.clearcut.zzcx) collection).zzbt();
        }
        boolean zAddAll = this.zzls.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzw();
        this.zzls.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object get(int i) {
        java.lang.Object obj = this.zzls.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof com.google.android.gms.internal.clearcut.zzbb) {
            com.google.android.gms.internal.clearcut.zzbb zzbbVar = (com.google.android.gms.internal.clearcut.zzbb) obj;
            java.lang.String strZzz = zzbbVar.zzz();
            if (zzbbVar.zzaa()) {
                this.zzls.set(i, strZzz);
            }
            return strZzz;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strZzf = com.google.android.gms.internal.clearcut.zzci.zzf(bArr);
        if (com.google.android.gms.internal.clearcut.zzci.zze(bArr)) {
            this.zzls.set(i, strZzf);
        }
        return strZzf;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final java.lang.Object getRaw(int i) {
        return this.zzls.get(i);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        zzw();
        java.lang.Object objRemove = this.zzls.remove(i);
        this.modCount++;
        return zze(objRemove);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(java.lang.Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(java.util.Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        zzw();
        return zze(this.zzls.set(i, (java.lang.String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzls.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final java.util.List<?> zzbt() {
        return java.util.Collections.unmodifiableList(this.zzls);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final com.google.android.gms.internal.clearcut.zzcx zzbu() {
        return zzu() ? new com.google.android.gms.internal.clearcut.zzfa(this) : this;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn zzi(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzls);
        return new com.google.android.gms.internal.clearcut.zzcw((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, com.google.android.gms.internal.clearcut.zzcn
    public final /* bridge */ /* synthetic */ boolean zzu() {
        return super.zzu();
    }
}
