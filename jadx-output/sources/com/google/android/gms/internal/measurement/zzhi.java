package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
class zzhi<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private final int zza;
    private java.util.List<com.google.android.gms.internal.measurement.zzhn> zzb;
    private java.util.Map<K, V> zzc;
    private boolean zzd;
    private volatile com.google.android.gms.internal.measurement.zzhp zze;
    private java.util.Map<K, V> zzf;
    private volatile com.google.android.gms.internal.measurement.zzhj zzg;

    static <FieldDescriptorType extends com.google.android.gms.internal.measurement.zzey<FieldDescriptorType>> com.google.android.gms.internal.measurement.zzhi<FieldDescriptorType, java.lang.Object> zza(int i) {
        return new com.google.android.gms.internal.measurement.zzhh(i);
    }

    private zzhi(int i) {
        this.zza = i;
        this.zzb = java.util.Collections.emptyList();
        this.zzc = java.util.Collections.emptyMap();
        this.zzf = java.util.Collections.emptyMap();
    }

    public void zza() {
        java.util.Map<K, V> mapUnmodifiableMap;
        java.util.Map<K, V> mapUnmodifiableMap2;
        if (this.zzd) {
            return;
        }
        if (this.zzc.isEmpty()) {
            mapUnmodifiableMap = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap = java.util.Collections.unmodifiableMap(this.zzc);
        }
        this.zzc = mapUnmodifiableMap;
        if (this.zzf.isEmpty()) {
            mapUnmodifiableMap2 = java.util.Collections.emptyMap();
        } else {
            mapUnmodifiableMap2 = java.util.Collections.unmodifiableMap(this.zzf);
        }
        this.zzf = mapUnmodifiableMap2;
        this.zzd = true;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final java.util.Map.Entry<K, V> zzb(int i) {
        return this.zzb.get(i);
    }

    public final java.lang.Iterable<java.util.Map.Entry<K, V>> zzd() {
        if (this.zzc.isEmpty()) {
            return com.google.android.gms.internal.measurement.zzhm.zza();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).getValue();
        }
        return this.zzc.get(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        zzf();
        int iZza = zza(k);
        if (iZza >= 0) {
            return (V) this.zzb.get(iZza).setValue(v);
        }
        zzf();
        if (this.zzb.isEmpty() && !(this.zzb instanceof java.util.ArrayList)) {
            this.zzb = new java.util.ArrayList(this.zza);
        }
        int i = -(iZza + 1);
        if (i >= this.zza) {
            return zzg().put(k, v);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            com.google.android.gms.internal.measurement.zzhn zzhnVarRemove = this.zzb.remove(i2 - 1);
            zzg().put((java.lang.Comparable) zzhnVarRemove.getKey(), zzhnVarRemove.getValue());
        }
        this.zzb.add(i, new com.google.android.gms.internal.measurement.zzhn(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzf();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        zzf();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzc(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzc(int i) {
        zzf();
        V v = (V) this.zzb.remove(i).getValue();
        if (!this.zzc.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<K, V>> it = zzg().entrySet().iterator();
            this.zzb.add(new com.google.android.gms.internal.measurement.zzhn(this, it.next()));
            it.remove();
        }
        return v;
    }

    private final int zza(K k) {
        int size = this.zzb.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo((java.lang.Comparable) this.zzb.get(size).getKey());
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
            int iCompareTo2 = k.compareTo((java.lang.Comparable) this.zzb.get(i2).getKey());
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
        if (this.zze == null) {
            this.zze = new com.google.android.gms.internal.measurement.zzhp(this, null);
        }
        return this.zze;
    }

    final java.util.Set<java.util.Map.Entry<K, V>> zze() {
        if (this.zzg == null) {
            this.zzg = new com.google.android.gms.internal.measurement.zzhj(this, null);
        }
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzf() {
        if (this.zzd) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final java.util.SortedMap<K, V> zzg() {
        zzf();
        if (this.zzc.isEmpty() && !(this.zzc instanceof java.util.TreeMap)) {
            java.util.TreeMap treeMap = new java.util.TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (java.util.SortedMap) this.zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzhi)) {
            return super.equals(obj);
        }
        com.google.android.gms.internal.measurement.zzhi zzhiVar = (com.google.android.gms.internal.measurement.zzhi) obj;
        int size = size();
        if (size != zzhiVar.size()) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc != zzhiVar.zzc()) {
            return entrySet().equals(zzhiVar.entrySet());
        }
        for (int i = 0; i < iZzc; i++) {
            if (!zzb(i).equals(zzhiVar.zzb(i))) {
                return false;
            }
        }
        if (iZzc != size) {
            return this.zzc.equals(zzhiVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iZzc = zzc();
        int iHashCode = 0;
        for (int i = 0; i < iZzc; i++) {
            iHashCode += this.zzb.get(i).hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    /* synthetic */ zzhi(int i, com.google.android.gms.internal.measurement.zzhh zzhhVar) {
        this(i);
    }
}
