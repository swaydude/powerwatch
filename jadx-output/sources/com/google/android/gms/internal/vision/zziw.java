package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
class zziw<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private volatile com.google.android.gms.internal.vision.zzix zzaaa;
    private boolean zztc;
    private final int zzzv;
    private java.util.List<com.google.android.gms.internal.vision.zzjb> zzzw;
    private java.util.Map<K, V> zzzx;
    private volatile com.google.android.gms.internal.vision.zzjd zzzy;
    private java.util.Map<K, V> zzzz;

    static <FieldDescriptorType extends com.google.android.gms.internal.vision.zzgk<FieldDescriptorType>> com.google.android.gms.internal.vision.zziw<FieldDescriptorType, java.lang.Object> zzbt(int i) {
        return new com.google.android.gms.internal.vision.zziv(i);
    }

    private zziw(int i) {
        this.zzzv = i;
        this.zzzw = java.util.Collections.emptyList();
        this.zzzx = java.util.Collections.emptyMap();
        this.zzzz = java.util.Collections.emptyMap();
    }

    public void zzdp() {
        java.util.Map<K, V> mapUnmodifiableMap;
        java.util.Map<K, V> mapUnmodifiableMap2;
        if (this.zztc) {
            return;
        }
        if (this.zzzx.isEmpty()) {
            mapUnmodifiableMap = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(this.zzzx);
        }
        this.zzzx = mapUnmodifiableMap;
        if (this.zzzz.isEmpty()) {
            mapUnmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = java.util.Collections.unmodifiableMap(this.zzzz);
        }
        this.zzzz = mapUnmodifiableMap2;
        this.zztc = true;
    }

    public final boolean isImmutable() {
        return this.zztc;
    }

    public final int zzhx() {
        return this.zzzw.size();
    }

    public final java.util.Map.Entry<K, V> zzbu(int i) {
        return this.zzzw.get(i);
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzhy() {
        if (this.zzzx.isEmpty()) {
            return com.google.android.gms.internal.vision.zzja.zzid();
        }
        return this.zzzx.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzzw.size() + this.zzzx.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza(comparable) >= 0 || this.zzzx.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return (V) this.zzzw.get(iZza).getValue();
        }
        return this.zzzx.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        zzia();
        int iZza = zza(k);
        if (iZza >= 0) {
            return (V) this.zzzw.get(iZza).setValue(v);
        }
        zzia();
        if (this.zzzw.isEmpty() && !(this.zzzw instanceof java.util.ArrayList)) {
            this.zzzw = new java.util.ArrayList(this.zzzv);
        }
        int i = -(iZza + 1);
        if (i >= this.zzzv) {
            return zzib().put(k, v);
        }
        int size = this.zzzw.size();
        int i2 = this.zzzv;
        if (size == i2) {
            com.google.android.gms.internal.vision.zzjb zzjbVarRemove = this.zzzw.remove(i2 - 1);
            zzib().put((java.lang.Comparable) zzjbVarRemove.getKey(), zzjbVarRemove.getValue());
        }
        this.zzzw.add(i, new com.google.android.gms.internal.vision.zzjb(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzia();
        if (!this.zzzw.isEmpty()) {
            this.zzzw.clear();
        }
        if (this.zzzx.isEmpty()) {
            return;
        }
        this.zzzx.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzia();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzbv(iZza);
        }
        if (this.zzzx.isEmpty()) {
            return null;
        }
        return this.zzzx.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzbv(int i) {
        zzia();
        V v = (V) this.zzzw.remove(i).getValue();
        if (!this.zzzx.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzib().entrySet().iterator();
            this.zzzw.add(new com.google.android.gms.internal.vision.zzjb(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzzw.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((java.lang.Comparable) this.zzzw.get(size).getKey());
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
            int iCompareTo2 = k.compareTo((java.lang.Comparable) this.zzzw.get(i2).getKey());
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
        if (this.zzzy == null) {
            this.zzzy = new com.google.android.gms.internal.vision.zzjd(this, null);
        }
        return this.zzzy;
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zzhz() {
        if (this.zzaaa == null) {
            this.zzaaa = new com.google.android.gms.internal.vision.zzix(this, null);
        }
        return this.zzaaa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzia() {
        if (this.zztc) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzib() {
        zzia();
        if (this.zzzx.isEmpty() && !(this.zzzx instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzzx = treeMap;
            this.zzzz = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.vision.zziw)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.vision.zziw zziwVar = (com.google.android.gms.internal.vision.zziw) obj;
        int size = size();
        if (size != zziwVar.size()) {
            return false;
        }
        int iZzhx = zzhx();
        if (iZzhx != zziwVar.zzhx()) {
            return entrySet().equals(zziwVar.entrySet());
        }
        for (int i = 0; i < iZzhx; i++) {
            if (!zzbu(i).equals(zziwVar.zzbu(i))) {
                return false;
            }
        }
        if (iZzhx != size) {
            return this.zzzx.equals(zziwVar.zzzx);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzhx = zzhx();
        int iHashCode = 0;
        for (int i = 0; i < iZzhx; i++) {
            iHashCode += this.zzzw.get(i).hashCode();
        }
        return this.zzzx.size() > 0 ? iHashCode + this.zzzx.hashCode() : iHashCode;
    }

    /* synthetic */ zziw(int i, com.google.android.gms.internal.vision.zziv zzivVar) {
        this(i);
    }
}
