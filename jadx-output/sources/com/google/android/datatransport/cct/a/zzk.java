package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzk extends com.google.android.datatransport.cct.a.zzv {
    private final long zza;
    private final long zzb;
    private final com.google.android.datatransport.cct.a.zzq zzc;
    private final int zzd;
    private final java.lang.String zze;
    private final java.util.List<com.google.android.datatransport.cct.a.zzt> zzf;
    private final com.google.android.datatransport.cct.a.zzaa zzg;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza extends com.google.android.datatransport.cct.a.zzv.zza {
        private java.lang.Long zza;
        private java.lang.Long zzb;
        private com.google.android.datatransport.cct.a.zzq zzc;
        private java.lang.Integer zzd;
        private java.lang.String zze;
        private java.util.List<com.google.android.datatransport.cct.a.zzt> zzf;
        private com.google.android.datatransport.cct.a.zzaa zzg;

        zza() {
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        public com.google.android.datatransport.cct.a.zzv.zza zza(long j) {
            this.zza = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        public com.google.android.datatransport.cct.a.zzv.zza zzb(long j) {
            this.zzb = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        public com.google.android.datatransport.cct.a.zzv.zza zza(com.google.android.datatransport.cct.a.zzq zzqVar) {
            this.zzc = zzqVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        com.google.android.datatransport.cct.a.zzv.zza zza(int i) {
            this.zzd = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        com.google.android.datatransport.cct.a.zzv.zza zza(java.lang.String str) {
            this.zze = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        public com.google.android.datatransport.cct.a.zzv.zza zza(java.util.List<com.google.android.datatransport.cct.a.zzt> list) {
            this.zzf = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        public com.google.android.datatransport.cct.a.zzv.zza zza(com.google.android.datatransport.cct.a.zzaa zzaaVar) {
            this.zzg = zzaaVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzv.zza
        public com.google.android.datatransport.cct.a.zzv zza() {
            java.lang.String str = "";
            if (this.zza == null) {
                str = " requestTimeMs";
            }
            if (this.zzb == null) {
                str = str + " requestUptimeMs";
            }
            if (this.zzd == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new com.google.android.datatransport.cct.a.zzk(this.zza.longValue(), this.zzb.longValue(), this.zzc, this.zzd.intValue(), this.zze, this.zzf, this.zzg, null);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }
    }

    /* synthetic */ zzk(long j, long j2, com.google.android.datatransport.cct.a.zzq zzqVar, int i, java.lang.String str, java.util.List list, com.google.android.datatransport.cct.a.zzaa zzaaVar, com.google.android.datatransport.cct.a.zzj zzjVar) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = zzqVar;
        this.zzd = i;
        this.zze = str;
        this.zzf = list;
        this.zzg = zzaaVar;
    }

    public boolean equals(java.lang.Object obj) {
        com.google.android.datatransport.cct.a.zzq zzqVar;
        java.lang.String str;
        java.util.List<com.google.android.datatransport.cct.a.zzt> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.a.zzv)) {
            return false;
        }
        com.google.android.datatransport.cct.a.zzk zzkVar = (com.google.android.datatransport.cct.a.zzk) ((com.google.android.datatransport.cct.a.zzv) obj);
        if (this.zza == zzkVar.zza && this.zzb == zzkVar.zzb && ((zzqVar = this.zzc) != null ? zzqVar.equals(zzkVar.zzc) : zzkVar.zzc == null) && this.zzd == zzkVar.zzd && ((str = this.zze) != null ? str.equals(zzkVar.zze) : zzkVar.zze == null) && ((list = this.zzf) != null ? list.equals(zzkVar.zzf) : zzkVar.zzf == null)) {
            com.google.android.datatransport.cct.a.zzaa zzaaVar = this.zzg;
            if (zzaaVar == null) {
                if (zzkVar.zzg == null) {
                    return true;
                }
            } else if (zzaaVar.equals(zzkVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.zza;
        long j2 = this.zzb;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        com.google.android.datatransport.cct.a.zzq zzqVar = this.zzc;
        int iHashCode = (((i ^ (zzqVar == null ? 0 : zzqVar.hashCode())) * 1000003) ^ this.zzd) * 1000003;
        java.lang.String str = this.zze;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.util.List<com.google.android.datatransport.cct.a.zzt> list = this.zzf;
        int iHashCode3 = (iHashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        com.google.android.datatransport.cct.a.zzaa zzaaVar = this.zzg;
        return iHashCode3 ^ (zzaaVar != null ? zzaaVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LogRequest{requestTimeMs=" + this.zza + ", requestUptimeMs=" + this.zzb + ", clientInfo=" + this.zzc + ", logSource=" + this.zzd + ", logSourceName=" + this.zze + ", logEvents=" + this.zzf + ", qosTier=" + this.zzg + "}";
    }

    public com.google.android.datatransport.cct.a.zzq zzb() {
        return this.zzc;
    }

    public java.util.List<com.google.android.datatransport.cct.a.zzt> zzc() {
        return this.zzf;
    }

    public int zzd() {
        return this.zzd;
    }

    public java.lang.String zze() {
        return this.zze;
    }

    public long zzf() {
        return this.zza;
    }

    public long zzg() {
        return this.zzb;
    }
}
