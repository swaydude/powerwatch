package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfk extends com.google.android.gms.measurement.internal.zzhi {
    private char zza;
    private long zzb;
    private java.lang.String zzc;
    private final com.google.android.gms.measurement.internal.zzfm zzd;
    private final com.google.android.gms.measurement.internal.zzfm zze;
    private final com.google.android.gms.measurement.internal.zzfm zzf;
    private final com.google.android.gms.measurement.internal.zzfm zzg;
    private final com.google.android.gms.measurement.internal.zzfm zzh;
    private final com.google.android.gms.measurement.internal.zzfm zzi;
    private final com.google.android.gms.measurement.internal.zzfm zzj;
    private final com.google.android.gms.measurement.internal.zzfm zzk;
    private final com.google.android.gms.measurement.internal.zzfm zzl;

    zzfk(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new com.google.android.gms.measurement.internal.zzfm(this, 6, false, false);
        this.zze = new com.google.android.gms.measurement.internal.zzfm(this, 6, true, false);
        this.zzf = new com.google.android.gms.measurement.internal.zzfm(this, 6, false, true);
        this.zzg = new com.google.android.gms.measurement.internal.zzfm(this, 5, false, false);
        this.zzh = new com.google.android.gms.measurement.internal.zzfm(this, 5, true, false);
        this.zzi = new com.google.android.gms.measurement.internal.zzfm(this, 5, false, true);
        this.zzj = new com.google.android.gms.measurement.internal.zzfm(this, 4, false, false);
        this.zzk = new com.google.android.gms.measurement.internal.zzfm(this, 3, false, false);
        this.zzl = new com.google.android.gms.measurement.internal.zzfm(this, 2, false, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final boolean zze() {
        return false;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzf() {
        return this.zzd;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzg() {
        return this.zze;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzh() {
        return this.zzf;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzi() {
        return this.zzg;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzj() {
        return this.zzh;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzk() {
        return this.zzi;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzv() {
        return this.zzj;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzw() {
        return this.zzk;
    }

    public final com.google.android.gms.measurement.internal.zzfm zzx() {
        return this.zzl;
    }

    protected static java.lang.Object zza(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.google.android.gms.measurement.internal.zzfl(str);
    }

    protected final void zza(int i, boolean z, boolean z2, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!z && zza(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.measurement.internal.zzgh zzghVarZzg = this.zzx.zzg();
        if (zzghVarZzg == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzghVarZzg.zzz()) {
                zza(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i < 0) {
                i = 0;
            }
            zzghVarZzg.zza(new com.google.android.gms.measurement.internal.zzfj(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    protected final boolean zza(int i) {
        return android.util.Log.isLoggable(zzad(), i);
    }

    protected final void zza(int i, java.lang.String str) {
        android.util.Log.println(i, zzad(), str);
    }

    private final java.lang.String zzad() {
        java.lang.String str;
        java.lang.String strZzs;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzx.zzs() != null) {
                    strZzs = this.zzx.zzs();
                } else {
                    zzt().zzu();
                    strZzs = "FA";
                }
                this.zzc = strZzs;
            }
            str = this.zzc;
        }
        return str;
    }

    static java.lang.String zza(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        java.lang.String strZza = zza(z, obj);
        java.lang.String strZza2 = zza(z, obj2);
        java.lang.String strZza3 = zza(z, obj3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        java.lang.String str3 = ", ";
        if (!android.text.TextUtils.isEmpty(strZza)) {
            sb.append(str2);
            sb.append(strZza);
            str2 = ", ";
        }
        if (android.text.TextUtils.isEmpty(strZza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZza2);
        }
        if (!android.text.TextUtils.isEmpty(strZza3)) {
            sb.append(str3);
            sb.append(strZza3);
        }
        return sb.toString();
    }

    private static java.lang.String zza(boolean z, java.lang.Object obj) {
        java.lang.String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof java.lang.Integer) {
            obj = java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        if (obj instanceof java.lang.Long) {
            if (!z) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.Long l = (java.lang.Long) obj;
            if (java.lang.Math.abs(l.longValue()) < 100) {
                return java.lang.String.valueOf(obj);
            }
            java.lang.String str = java.lang.String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            java.lang.String strValueOf = java.lang.String.valueOf(java.lang.Math.abs(l.longValue()));
            long jRound = java.lang.Math.round(java.lang.Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = java.lang.Math.round(java.lang.Math.pow(10.0d, strValueOf.length()) - 1.0d);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 43 + java.lang.String.valueOf(str).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof java.lang.Boolean) {
            return java.lang.String.valueOf(obj);
        }
        if (obj instanceof java.lang.Throwable) {
            java.lang.Throwable th = (java.lang.Throwable) obj;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(z ? th.getClass().getName() : th.toString());
            java.lang.String strZzb = zzb(com.google.android.gms.measurement.internal.zzgo.class.getCanonicalName());
            for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzb(className).equals(strZzb)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            return sb2.toString();
        }
        if (obj instanceof com.google.android.gms.measurement.internal.zzfl) {
            return ((com.google.android.gms.measurement.internal.zzfl) obj).zza;
        }
        return z ? "-" : java.lang.String.valueOf(obj);
    }

    private static java.lang.String zzb(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public final java.lang.String zzy() {
        android.util.Pair<java.lang.String, java.lang.Long> pairZza = zzs().zzb.zza();
        if (pairZza == null || pairZza == com.google.android.gms.measurement.internal.zzft.zza) {
            return null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(pairZza.second);
        java.lang.String str = (java.lang.String) pairZza.first;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 1 + java.lang.String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ android.content.Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfi zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzft zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzw zzu() {
        return super.zzu();
    }
}
