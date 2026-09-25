package com.google.android.gms.internal.clearcut;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes.dex */
final class zzep<K, V> implements java.lang.Comparable<com.google.android.gms.internal.clearcut.zzep>, java.util.Map.Entry<K, V> {
    private V value;
    private final /* synthetic */ com.google.android.gms.internal.clearcut.zzei zzos;

    /* JADX INFO: Incorrect field signature: TK; */
    private final java.lang.Comparable zzov;

    /* JADX WARN: Multi-variable type inference failed */
    zzep(com.google.android.gms.internal.clearcut.zzei zzeiVar, K k, V v) {
        this.zzos = zzeiVar;
        this.zzov = k;
        this.value = v;
    }

    zzep(com.google.android.gms.internal.clearcut.zzei zzeiVar, java.util.Map.Entry<K, V> entry) {
        this(zzeiVar, (java.lang.Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(com.google.android.gms.internal.clearcut.zzep zzepVar) {
        return ((java.lang.Comparable) getKey()).compareTo((java.lang.Comparable) zzepVar.getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return equals(this.zzov, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
        return this.zzov;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        java.lang.Comparable comparable = this.zzov;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.value;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzos.zzdu();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzov);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.value);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 1 + java.lang.String.valueOf(strValueOf2).length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
