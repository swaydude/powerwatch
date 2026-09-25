package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.datatransport.cct.a.zzx {
    private final long zza;

    zzl(long j) {
        this.zza = j;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof com.google.android.datatransport.cct.a.zzx) && this.zza == ((com.google.android.datatransport.cct.a.zzx) obj).zza();
    }

    public int hashCode() {
        long j = this.zza;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public java.lang.String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.zza + "}";
    }

    @Override // com.google.android.datatransport.cct.a.zzx
    public long zza() {
        return this.zza;
    }
}
