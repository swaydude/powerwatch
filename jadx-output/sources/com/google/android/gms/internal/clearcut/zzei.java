package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
class zzei<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean zzgu;
    private final int zzol;
    private java.util.List<com.google.android.gms.internal.clearcut.zzep> zzom;
    private java.util.Map<K, V> zzon;
    private volatile com.google.android.gms.internal.clearcut.zzer zzoo;
    private java.util.Map<K, V> zzop;
    private volatile com.google.android.gms.internal.clearcut.zzel zzoq;

    private zzei(int i) {
        this.zzol = i;
        this.zzom = java.util.Collections.emptyList();
        this.zzon = java.util.Collections.emptyMap();
        this.zzop = java.util.Collections.emptyMap();
    }

    /* synthetic */ zzei(int i, com.google.android.gms.internal.clearcut.zzej zzejVar) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzom.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((java.lang.Comparable) this.zzom.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo((java.lang.Comparable) this.zzom.get(i2).getKey());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    static <FieldDescriptorType extends com.google.android.gms.internal.clearcut.zzca<FieldDescriptorType>> com.google.android.gms.internal.clearcut.zzei<FieldDescriptorType, java.lang.Object> zzaj(int i) {
        return new com.google.android.gms.internal.clearcut.zzej(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzal(int i) {
        zzdu();
        V v = (V) this.zzom.remove(i).getValue();
        if (!this.zzon.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzdv().entrySet().iterator();
            this.zzom.add(new com.google.android.gms.internal.clearcut.zzep(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdu() {
        if (this.zzgu) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzdv() {
        zzdu();
        if (this.zzon.isEmpty() && !(this.zzon instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzon = treeMap;
            this.zzop = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzon;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzdu();
        if (!this.zzom.isEmpty()) {
            this.zzom.clear();
        }
        if (this.zzon.isEmpty()) {
            return;
        }
        this.zzon.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza(comparable) >= 0 || this.zzon.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.zzoo == null) {
            this.zzoo = new com.google.android.gms.internal.clearcut.zzer(this, null);
        }
        return this.zzoo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.clearcut.zzei)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.clearcut.zzei zzeiVar = (com.google.android.gms.internal.clearcut.zzei) obj;
        int size = size();
        if (size != zzeiVar.size()) {
            return false;
        }
        int iZzdr = zzdr();
        if (iZzdr != zzeiVar.zzdr()) {
            return entrySet().equals(zzeiVar.entrySet());
        }
        for (int i = 0; i < iZzdr; i++) {
            if (!zzak(i).equals(zzeiVar.zzak(i))) {
                return false;
            }
        }
        if (iZzdr != size) {
            return this.zzon.equals(zzeiVar.zzon);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) this.zzom.get(iZza).getValue() : this.zzon.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzdr = zzdr();
        int iHashCode = 0;
        for (int i = 0; i < iZzdr; i++) {
            iHashCode += this.zzom.get(i).hashCode();
        }
        return this.zzon.size() > 0 ? iHashCode + this.zzon.hashCode() : iHashCode;
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzdu();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzal(iZza);
        }
        if (this.zzon.isEmpty()) {
            return null;
        }
        return this.zzon.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzom.size() + this.zzon.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        zzdu();
        int iZza = zza(k);
        if (iZza >= 0) {
            return (V) this.zzom.get(iZza).setValue(v);
        }
        zzdu();
        if (this.zzom.isEmpty() && !(this.zzom instanceof java.util.ArrayList)) {
            this.zzom = new java.util.ArrayList(this.zzol);
        }
        int i = -(iZza + 1);
        if (i >= this.zzol) {
            return zzdv().put(k, v);
        }
        int size = this.zzom.size();
        int i2 = this.zzol;
        if (size == i2) {
            com.google.android.gms.internal.clearcut.zzep zzepVarRemove = this.zzom.remove(i2 - 1);
            zzdv().put((java.lang.Comparable) zzepVarRemove.getKey(), zzepVarRemove.getValue());
        }
        this.zzom.add(i, new com.google.android.gms.internal.clearcut.zzep(this, k, v));
        return null;
    }

    public final java.util.Map.Entry<K, V> zzak(int i) {
        return this.zzom.get(i);
    }

    public final int zzdr() {
        return this.zzom.size();
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzds() {
        return this.zzon.isEmpty() ? com.google.android.gms.internal.clearcut.zzem.zzdx() : this.zzon.entrySet();
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zzdt() {
        if (this.zzoq == null) {
            this.zzoq = new com.google.android.gms.internal.clearcut.zzel(this, null);
        }
        return this.zzoq;
    }

    public void zzv() {
        if (this.zzgu) {
            return;
        }
        this.zzon = this.zzon.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzon);
        this.zzop = this.zzop.isEmpty() ? java.util.Collections.emptyMap() : java.util.Collections.unmodifiableMap(this.zzop);
        this.zzgu = true;
    }
}
