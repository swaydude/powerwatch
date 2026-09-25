package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends com.google.android.datatransport.cct.a.zzy {
    private final com.google.android.datatransport.cct.a.zzy.zzc zza;
    private final com.google.android.datatransport.cct.a.zzy.zzb zzb;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza extends com.google.android.datatransport.cct.a.zzy.zza {
        private com.google.android.datatransport.cct.a.zzy.zzc zza;
        private com.google.android.datatransport.cct.a.zzy.zzb zzb;

        zza() {
        }

        @Override // com.google.android.datatransport.cct.a.zzy.zza
        public com.google.android.datatransport.cct.a.zzy.zza zza(com.google.android.datatransport.cct.a.zzy.zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzy.zza
        public com.google.android.datatransport.cct.a.zzy.zza zza(com.google.android.datatransport.cct.a.zzy.zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzy.zza
        public com.google.android.datatransport.cct.a.zzy zza() {
            return new com.google.android.datatransport.cct.a.zzn(this.zza, this.zzb, null);
        }
    }

    /* synthetic */ zzn(com.google.android.datatransport.cct.a.zzy.zzc zzcVar, com.google.android.datatransport.cct.a.zzy.zzb zzbVar, com.google.android.datatransport.cct.a.zzm zzmVar) {
        this.zza = zzcVar;
        this.zzb = zzbVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.a.zzy)) {
            return false;
        }
        com.google.android.datatransport.cct.a.zzy.zzc zzcVar = this.zza;
        if (zzcVar != null ? zzcVar.equals(((com.google.android.datatransport.cct.a.zzn) obj).zza) : ((com.google.android.datatransport.cct.a.zzn) obj).zza == null) {
            com.google.android.datatransport.cct.a.zzy.zzb zzbVar = this.zzb;
            if (zzbVar == null) {
                if (((com.google.android.datatransport.cct.a.zzn) obj).zzb == null) {
                    return true;
                }
            } else if (zzbVar.equals(((com.google.android.datatransport.cct.a.zzn) obj).zzb)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.google.android.datatransport.cct.a.zzy.zzc zzcVar = this.zza;
        int iHashCode = ((zzcVar == null ? 0 : zzcVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.a.zzy.zzb zzbVar = this.zzb;
        return iHashCode ^ (zzbVar != null ? zzbVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "NetworkConnectionInfo{networkType=" + this.zza + ", mobileSubtype=" + this.zzb + "}";
    }

    public com.google.android.datatransport.cct.a.zzy.zzb zzb() {
        return this.zzb;
    }

    public com.google.android.datatransport.cct.a.zzy.zzc zzc() {
        return this.zza;
    }
}
