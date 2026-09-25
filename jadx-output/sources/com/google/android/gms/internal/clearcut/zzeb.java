package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzeb<E> extends com.google.android.gms.internal.clearcut.zzav<E> {
    private static final com.google.android.gms.internal.clearcut.zzeb<java.lang.Object> zznf;
    private final java.util.List<E> zzls;

    static {
        com.google.android.gms.internal.clearcut.zzeb<java.lang.Object> zzebVar = new com.google.android.gms.internal.clearcut.zzeb<>();
        zznf = zzebVar;
        zzebVar.zzv();
    }

    zzeb() {
        this(new java.util.ArrayList(10));
    }

    private zzeb(java.util.List<E> list) {
        this.zzls = list;
    }

    public static <E> com.google.android.gms.internal.clearcut.zzeb<E> zzcn() {
        return (com.google.android.gms.internal.clearcut.zzeb<E>) zznf;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        zzw();
        this.zzls.add(i, e);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.zzls.get(i);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        zzw();
        E eRemove = this.zzls.remove(i);
        this.modCount++;
        return eRemove;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzw();
        E e2 = this.zzls.set(i, e);
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzls.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ com.google.android.gms.internal.clearcut.zzcn zzi(int i) {
        if (i < size()) {
            throw new java.lang.IllegalArgumentException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        arrayList.addAll(this.zzls);
        return new com.google.android.gms.internal.clearcut.zzeb(arrayList);
    }
}
