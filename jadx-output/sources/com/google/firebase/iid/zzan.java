package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzan<T> {
    final int zza;
    final com.google.android.gms.tasks.TaskCompletionSource<T> zzb = new com.google.android.gms.tasks.TaskCompletionSource<>();
    final int zzc;
    final android.os.Bundle zzd;

    zzan(int i, int i2, android.os.Bundle bundle) {
        this.zza = i;
        this.zzc = i2;
        this.zzd = bundle;
    }

    abstract void zza(android.os.Bundle bundle);

    abstract boolean zza();

    final void zza(T t) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(this);
            java.lang.String strValueOf2 = java.lang.String.valueOf(t);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 16 + java.lang.String.valueOf(strValueOf2).length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            android.util.Log.d("MessengerIpcClient", sb.toString());
        }
        this.zzb.setResult(t);
    }

    final void zza(com.google.firebase.iid.zzam zzamVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(this);
            java.lang.String strValueOf2 = java.lang.String.valueOf(zzamVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 14 + java.lang.String.valueOf(strValueOf2).length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            android.util.Log.d("MessengerIpcClient", sb.toString());
        }
        this.zzb.setException(zzamVar);
    }

    public java.lang.String toString() {
        int i = this.zzc;
        int i2 = this.zza;
        boolean zZza = zza();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zZza);
        sb.append("}");
        return sb.toString();
    }
}
