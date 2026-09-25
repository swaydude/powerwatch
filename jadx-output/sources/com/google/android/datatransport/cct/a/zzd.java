package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzd extends com.google.android.datatransport.cct.a.zza {
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza extends com.google.android.datatransport.cct.a.zza.AbstractC0018zza {
        private java.lang.Integer zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private java.lang.String zzd;
        private java.lang.String zze;
        private java.lang.String zzf;
        private java.lang.String zzg;
        private java.lang.String zzh;

        zza() {
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zza(int i) {
            this.zza = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zzb(java.lang.String str) {
            this.zzh = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zzc(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zzd(java.lang.String str) {
            this.zzg = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zze(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zzf(java.lang.String str) {
            this.zzf = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zzg(java.lang.String str) {
            this.zze = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza.AbstractC0018zza zza(java.lang.String str) {
            this.zzd = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zza.AbstractC0018zza
        public com.google.android.datatransport.cct.a.zza zza() {
            java.lang.String str = "";
            if (this.zza == null) {
                str = " sdkVersion";
            }
            if (str.isEmpty()) {
                return new com.google.android.datatransport.cct.a.zzd(this.zza.intValue(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }
    }

    /* synthetic */ zzd(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.google.android.datatransport.cct.a.zzc zzcVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
        this.zzg = str6;
        this.zzh = str7;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.a.zza)) {
            return false;
        }
        com.google.android.datatransport.cct.a.zzd zzdVar = (com.google.android.datatransport.cct.a.zzd) ((com.google.android.datatransport.cct.a.zza) obj);
        if (this.zza == zzdVar.zza && ((str = this.zzb) != null ? str.equals(zzdVar.zzb) : zzdVar.zzb == null) && ((str2 = this.zzc) != null ? str2.equals(zzdVar.zzc) : zzdVar.zzc == null) && ((str3 = this.zzd) != null ? str3.equals(zzdVar.zzd) : zzdVar.zzd == null) && ((str4 = this.zze) != null ? str4.equals(zzdVar.zze) : zzdVar.zze == null) && ((str5 = this.zzf) != null ? str5.equals(zzdVar.zzf) : zzdVar.zzf == null) && ((str6 = this.zzg) != null ? str6.equals(zzdVar.zzg) : zzdVar.zzg == null)) {
            java.lang.String str7 = this.zzh;
            if (str7 == null) {
                if (zzdVar.zzh == null) {
                    return true;
                }
            } else if (str7.equals(zzdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.zza ^ 1000003) * 1000003;
        java.lang.String str = this.zzb;
        int iHashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        java.lang.String str2 = this.zzc;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.zzd;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        java.lang.String str4 = this.zze;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        java.lang.String str5 = this.zzf;
        int iHashCode5 = (iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        java.lang.String str6 = this.zzg;
        int iHashCode6 = (iHashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        java.lang.String str7 = this.zzh;
        return iHashCode6 ^ (str7 != null ? str7.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.zza + ", model=" + this.zzb + ", hardware=" + this.zzc + ", device=" + this.zzd + ", product=" + this.zze + ", osBuild=" + this.zzf + ", manufacturer=" + this.zzg + ", fingerprint=" + this.zzh + "}";
    }

    public java.lang.String zzb() {
        return this.zzd;
    }

    public java.lang.String zzc() {
        return this.zzh;
    }

    public java.lang.String zzd() {
        return this.zzc;
    }

    public java.lang.String zze() {
        return this.zzg;
    }

    public java.lang.String zzf() {
        return this.zzb;
    }

    public java.lang.String zzg() {
        return this.zzf;
    }

    public java.lang.String zzh() {
        return this.zze;
    }

    public int zzi() {
        return this.zza;
    }
}
