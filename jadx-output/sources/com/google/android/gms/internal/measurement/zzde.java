package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzde<T> implements com.google.android.gms.internal.measurement.zzcz<T> {
    private volatile com.google.android.gms.internal.measurement.zzcz<T> zza;
    private volatile boolean zzb;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private T zzc;

    zzde(com.google.android.gms.internal.measurement.zzcz<T> zzczVar) {
        this.zza = (com.google.android.gms.internal.measurement.zzcz) com.google.android.gms.internal.measurement.zzcx.zza(zzczVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    T tZza = this.zza.zza();
                    this.zzc = tZza;
                    this.zzb = true;
                    this.zza = null;
                    return tZza;
                }
            }
        }
        return this.zzc;
    }

    public final java.lang.String toString() {
        java.lang.Object string = this.zza;
        if (string == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.zzc);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(string);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
