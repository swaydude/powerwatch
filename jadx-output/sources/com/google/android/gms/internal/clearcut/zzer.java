package com.google.android.gms.internal.clearcut;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
class zzer<K, V> extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzei zzos;

    private zzer(com.google.android.gms.internal.clearcut.zzei zzeiVar) {
        this.zzos = zzeiVar;
    }

    /* synthetic */ zzer(com.google.android.gms.internal.clearcut.zzei zzeiVar, com.google.android.gms.internal.clearcut.zzej zzejVar) {
        this(zzeiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzos.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.zzos.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.zzos.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.android.gms.internal.clearcut.zzeq(this.zzos, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzos.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.zzos.size();
    }
}
