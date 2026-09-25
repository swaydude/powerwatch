package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
class zzid<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private boolean zzsk;
    private final int zzyk;
    private java.util.List<com.google.android.gms.internal.fitness.zzim> zzyl;
    private java.util.Map<K, V> zzym;
    private volatile com.google.android.gms.internal.fitness.zzio zzyn;
    private java.util.Map<K, V> zzyo;
    private volatile com.google.android.gms.internal.fitness.zzii zzyp;

    static <FieldDescriptorType extends com.google.android.gms.internal.fitness.zzgd<FieldDescriptorType>> com.google.android.gms.internal.fitness.zzid<FieldDescriptorType, java.lang.Object> zzai(int i) {
        return new com.google.android.gms.internal.fitness.zzig(i);
    }

    private zzid(int i) {
        this.zzyk = i;
        this.zzyl = java.util.Collections.emptyList();
        this.zzym = java.util.Collections.emptyMap();
        this.zzyo = java.util.Collections.emptyMap();
    }

    public void zzal() {
        java.util.Map<K, V> mapUnmodifiableMap;
        java.util.Map<K, V> mapUnmodifiableMap2;
        if (this.zzsk) {
            return;
        }
        if (this.zzym.isEmpty()) {
            mapUnmodifiableMap = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(this.zzym);
        }
        this.zzym = mapUnmodifiableMap;
        if (this.zzyo.isEmpty()) {
            mapUnmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = java.util.Collections.unmodifiableMap(this.zzyo);
        }
        this.zzyo = mapUnmodifiableMap2;
        this.zzsk = true;
    }

    public final boolean isImmutable() {
        return this.zzsk;
    }

    public final int zzcq() {
        return this.zzyl.size();
    }

    public final java.util.Map.Entry<K, V> zzaj(int i) {
        return this.zzyl.get(i);
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzcr() {
        if (this.zzym.isEmpty()) {
            return com.google.android.gms.internal.fitness.zzih.zzdb();
        }
        return this.zzym.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzyl.size() + this.zzym.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza(comparable) >= 0 || this.zzym.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return (V) this.zzyl.get(iZza).getValue();
        }
        return this.zzym.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        zzct();
        int iZza = zza(k);
        if (iZza >= 0) {
            return (V) this.zzyl.get(iZza).setValue(v);
        }
        zzct();
        if (this.zzyl.isEmpty() && !(this.zzyl instanceof java.util.ArrayList)) {
            this.zzyl = new java.util.ArrayList(this.zzyk);
        }
        int i = -(iZza + 1);
        if (i >= this.zzyk) {
            return zzcu().put(k, v);
        }
        int size = this.zzyl.size();
        int i2 = this.zzyk;
        if (size == i2) {
            com.google.android.gms.internal.fitness.zzim zzimVarRemove = this.zzyl.remove(i2 - 1);
            zzcu().put((java.lang.Comparable) zzimVarRemove.getKey(), zzimVarRemove.getValue());
        }
        this.zzyl.add(i, new com.google.android.gms.internal.fitness.zzim(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzct();
        if (!this.zzyl.isEmpty()) {
            this.zzyl.clear();
        }
        if (this.zzym.isEmpty()) {
            return;
        }
        this.zzym.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzct();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzak(iZza);
        }
        if (this.zzym.isEmpty()) {
            return null;
        }
        return this.zzym.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzak(int i) {
        zzct();
        V v = (V) this.zzyl.remove(i).getValue();
        if (!this.zzym.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzcu().entrySet().iterator();
            this.zzyl.add(new com.google.android.gms.internal.fitness.zzim(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzyl.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((java.lang.Comparable) this.zzyl.get(size).getKey());
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
            int iCompareTo2 = k.compareTo((java.lang.Comparable) this.zzyl.get(i2).getKey());
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

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        if (this.zzyn == null) {
            this.zzyn = new com.google.android.gms.internal.fitness.zzio(this, null);
        }
        return this.zzyn;
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zzcs() {
        if (this.zzyp == null) {
            this.zzyp = new com.google.android.gms.internal.fitness.zzii(this, null);
        }
        return this.zzyp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzct() {
        if (this.zzsk) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzcu() {
        zzct();
        if (this.zzym.isEmpty() && !(this.zzym instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzym = treeMap;
            this.zzyo = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzym;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.fitness.zzid)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.fitness.zzid zzidVar = (com.google.android.gms.internal.fitness.zzid) obj;
        int size = size();
        if (size != zzidVar.size()) {
            return false;
        }
        int iZzcq = zzcq();
        if (iZzcq != zzidVar.zzcq()) {
            return entrySet().equals(zzidVar.entrySet());
        }
        for (int i = 0; i < iZzcq; i++) {
            if (!zzaj(i).equals(zzidVar.zzaj(i))) {
                return false;
            }
        }
        if (iZzcq != size) {
            return this.zzym.equals(zzidVar.zzym);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzcq = zzcq();
        int iHashCode = 0;
        for (int i = 0; i < iZzcq; i++) {
            iHashCode += this.zzyl.get(i).hashCode();
        }
        return this.zzym.size() > 0 ? iHashCode + this.zzym.hashCode() : iHashCode;
    }

    /* synthetic */ zzid(int i, com.google.android.gms.internal.fitness.zzig zzigVar) {
        this(i);
    }
}
