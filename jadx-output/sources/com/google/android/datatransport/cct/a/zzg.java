package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzg extends com.google.android.datatransport.cct.a.zzq {
    private final com.google.android.datatransport.cct.a.zzq.zzb zza;
    private final com.google.android.datatransport.cct.a.zza zzb;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza extends com.google.android.datatransport.cct.a.zzq.zza {
        private com.google.android.datatransport.cct.a.zzq.zzb zza;
        private com.google.android.datatransport.cct.a.zza zzb;

        zza() {
        }

        @Override // com.google.android.datatransport.cct.a.zzq.zza
        public com.google.android.datatransport.cct.a.zzq.zza zza(com.google.android.datatransport.cct.a.zzq.zzb zzbVar) {
            this.zza = zzbVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzq.zza
        public com.google.android.datatransport.cct.a.zzq.zza zza(com.google.android.datatransport.cct.a.zza zzaVar) {
            this.zzb = zzaVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzq.zza
        public com.google.android.datatransport.cct.a.zzq zza() {
            return new com.google.android.datatransport.cct.a.zzg(this.zza, this.zzb, null);
        }
    }

    /* synthetic */ zzg(com.google.android.datatransport.cct.a.zzq.zzb zzbVar, com.google.android.datatransport.cct.a.zza zzaVar, com.google.android.datatransport.cct.a.zzf zzfVar) {
        this.zza = zzbVar;
        this.zzb = zzaVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.a.zzq)) {
            return false;
        }
        com.google.android.datatransport.cct.a.zzq.zzb zzbVar = this.zza;
        if (zzbVar != null ? zzbVar.equals(((com.google.android.datatransport.cct.a.zzg) obj).zza) : ((com.google.android.datatransport.cct.a.zzg) obj).zza == null) {
            com.google.android.datatransport.cct.a.zza zzaVar = this.zzb;
            if (zzaVar == null) {
                if (((com.google.android.datatransport.cct.a.zzg) obj).zzb == null) {
                    return true;
                }
            } else if (zzaVar.equals(((com.google.android.datatransport.cct.a.zzg) obj).zzb)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        com.google.android.datatransport.cct.a.zzq.zzb zzbVar = this.zza;
        int iHashCode = ((zzbVar == null ? 0 : zzbVar.hashCode()) ^ 1000003) * 1000003;
        com.google.android.datatransport.cct.a.zza zzaVar = this.zzb;
        return iHashCode ^ (zzaVar != null ? zzaVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ClientInfo{clientType=" + this.zza + ", androidClientInfo=" + this.zzb + "}";
    }

    public com.google.android.datatransport.cct.a.zza zzb() {
        return this.zzb;
    }

    public com.google.android.datatransport.cct.a.zzq.zzb zzc() {
        return this.zza;
    }
}
