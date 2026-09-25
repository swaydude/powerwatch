package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zze extends com.google.android.datatransport.cct.a.zzo {
    private final java.util.List<com.google.android.datatransport.cct.a.zzv> zza;

    zze(java.util.List<com.google.android.datatransport.cct.a.zzv> list) {
        java.util.Objects.requireNonNull(list, "Null logRequests");
        this.zza = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.datatransport.cct.a.zzo) {
            return this.zza.equals(((com.google.android.datatransport.cct.a.zzo) obj).zza());
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public java.lang.String toString() {
        return "BatchedLogRequest{logRequests=" + this.zza + "}";
    }

    @Override // com.google.android.datatransport.cct.a.zzo
    public java.util.List<com.google.android.datatransport.cct.a.zzv> zza() {
        return this.zza;
    }
}
