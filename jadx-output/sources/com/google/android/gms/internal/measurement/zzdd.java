package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdd<T> implements com.google.android.gms.internal.measurement.zzcz<T>, java.io.Serializable {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final T zza;

    zzdd(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        this.zza = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final T zza() {
        return this.zza;
    }

    public final boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzdd)) {
            return false;
        }
        T t = this.zza;
        T t2 = ((com.google.android.gms.internal.measurement.zzdd) obj).zza;
        if (t != t2) {
            return t != null && t.equals(t2);
        }
        return true;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.zza});
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
