package com.google.android.datatransport.cct.a;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzi extends com.google.android.datatransport.cct.a.zzt {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final byte[] zzd;
    private final java.lang.String zze;
    private final long zzf;
    private final com.google.android.datatransport.cct.a.zzy zzg;

    /* JADX INFO: compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    static final class zza extends com.google.android.datatransport.cct.a.zzt.zza {
        private java.lang.Long zza;
        private java.lang.Integer zzb;
        private java.lang.Long zzc;
        private byte[] zzd;
        private java.lang.String zze;
        private java.lang.Long zzf;
        private com.google.android.datatransport.cct.a.zzy zzg;

        zza() {
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        public com.google.android.datatransport.cct.a.zzt.zza zza(long j) {
            this.zza = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        public com.google.android.datatransport.cct.a.zzt.zza zzb(long j) {
            this.zzc = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        public com.google.android.datatransport.cct.a.zzt.zza zzc(long j) {
            this.zzf = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        public com.google.android.datatransport.cct.a.zzt.zza zza(int i) {
            this.zzb = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        com.google.android.datatransport.cct.a.zzt.zza zza(byte[] bArr) {
            this.zzd = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        com.google.android.datatransport.cct.a.zzt.zza zza(java.lang.String str) {
            this.zze = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        public com.google.android.datatransport.cct.a.zzt.zza zza(com.google.android.datatransport.cct.a.zzy zzyVar) {
            this.zzg = zzyVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.zzt.zza
        public com.google.android.datatransport.cct.a.zzt zza() {
            java.lang.String str = "";
            if (this.zza == null) {
                str = " eventTimeMs";
            }
            if (this.zzb == null) {
                str = str + " eventCode";
            }
            if (this.zzc == null) {
                str = str + " eventUptimeMs";
            }
            if (this.zzf == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new com.google.android.datatransport.cct.a.zzi(this.zza.longValue(), this.zzb.intValue(), this.zzc.longValue(), this.zzd, this.zze, this.zzf.longValue(), this.zzg, null);
            }
            throw new java.lang.IllegalStateException("Missing required properties:" + str);
        }
    }

    /* synthetic */ zzi(long j, int i, long j2, byte[] bArr, java.lang.String str, long j3, com.google.android.datatransport.cct.a.zzy zzyVar, com.google.android.datatransport.cct.a.zzh zzhVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = j3;
        this.zzg = zzyVar;
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.a.zzt)) {
            return false;
        }
        com.google.android.datatransport.cct.a.zzt zztVar = (com.google.android.datatransport.cct.a.zzt) obj;
        if (this.zza == zztVar.zza()) {
            com.google.android.datatransport.cct.a.zzi zziVar = (com.google.android.datatransport.cct.a.zzi) zztVar;
            if (this.zzb == zziVar.zzb && this.zzc == zztVar.zzb()) {
                if (java.util.Arrays.equals(this.zzd, zztVar instanceof com.google.android.datatransport.cct.a.zzi ? zziVar.zzd : zziVar.zzd) && ((str = this.zze) != null ? str.equals(zziVar.zze) : zziVar.zze == null) && this.zzf == zztVar.zzc()) {
                    com.google.android.datatransport.cct.a.zzy zzyVar = this.zzg;
                    if (zzyVar == null) {
                        if (zziVar.zzg == null) {
                            return true;
                        }
                    } else if (zzyVar.equals(zziVar.zzg)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.zza;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.zzb) * 1000003;
        long j2 = this.zzc;
        int iHashCode = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ java.util.Arrays.hashCode(this.zzd)) * 1000003;
        java.lang.String str = this.zze;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j3 = this.zzf;
        int i2 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        com.google.android.datatransport.cct.a.zzy zzyVar = this.zzg;
        return i2 ^ (zzyVar != null ? zzyVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LogEvent{eventTimeMs=" + this.zza + ", eventCode=" + this.zzb + ", eventUptimeMs=" + this.zzc + ", sourceExtension=" + java.util.Arrays.toString(this.zzd) + ", sourceExtensionJsonProto3=" + this.zze + ", timezoneOffsetSeconds=" + this.zzf + ", networkConnectionInfo=" + this.zzg + "}";
    }

    @Override // com.google.android.datatransport.cct.a.zzt
    public long zza() {
        return this.zza;
    }

    @Override // com.google.android.datatransport.cct.a.zzt
    public long zzb() {
        return this.zzc;
    }

    @Override // com.google.android.datatransport.cct.a.zzt
    public long zzc() {
        return this.zzf;
    }

    public int zzd() {
        return this.zzb;
    }

    public com.google.android.datatransport.cct.a.zzy zze() {
        return this.zzg;
    }

    public byte[] zzf() {
        return this.zzd;
    }

    public java.lang.String zzg() {
        return this.zze;
    }
}
