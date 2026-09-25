package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfi extends com.google.android.gms.measurement.internal.zzhi {
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> zza = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> zzb = new java.util.concurrent.atomic.AtomicReference<>();
    private static final java.util.concurrent.atomic.AtomicReference<java.lang.String[]> zzc = new java.util.concurrent.atomic.AtomicReference<>();

    zzfi(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final boolean zze() {
        return false;
    }

    private final boolean zzg() {
        zzu();
        return this.zzx.zzl() && this.zzx.zzr().zza(3);
    }

    protected final java.lang.String zza(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !zzg() ? str : zza(str, com.google.android.gms.measurement.internal.zzhj.zzb, com.google.android.gms.measurement.internal.zzhj.zza, zza);
    }

    protected final java.lang.String zzb(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return !zzg() ? str : zza(str, com.google.android.gms.measurement.internal.zzhm.zzb, com.google.android.gms.measurement.internal.zzhm.zza, zzb);
    }

    protected final java.lang.String zzc(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (!zzg()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return zza(str, com.google.android.gms.measurement.internal.zzhl.zzb, com.google.android.gms.measurement.internal.zzhl.zza, zzc);
    }

    private static java.lang.String zza(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2, java.util.concurrent.atomic.AtomicReference<java.lang.String[]> atomicReference) {
        java.lang.String str2;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(atomicReference);
        com.google.android.gms.common.internal.Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (com.google.android.gms.measurement.internal.zzla.zzc(str, strArr[i])) {
                synchronized (atomicReference) {
                    java.lang.String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new java.lang.String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    protected final java.lang.String zza(com.google.android.gms.measurement.internal.zzan zzanVar) {
        if (zzanVar == null) {
            return null;
        }
        if (!zzg()) {
            return zzanVar.toString();
        }
        return "origin=" + zzanVar.zzc + ",name=" + zza(zzanVar.zza) + ",params=" + zza(zzanVar.zzb);
    }

    protected final java.lang.String zza(com.google.android.gms.measurement.internal.zzak zzakVar) {
        if (zzakVar == null) {
            return null;
        }
        if (!zzg()) {
            return zzakVar.toString();
        }
        return "Event{appId='" + zzakVar.zza + "', name='" + zza(zzakVar.zzb) + "', params=" + zza(zzakVar.zze) + "}";
    }

    private final java.lang.String zza(com.google.android.gms.measurement.internal.zzam zzamVar) {
        if (zzamVar == null) {
            return null;
        }
        if (!zzg()) {
            return zzamVar.toString();
        }
        return zza(zzamVar.zzb());
    }

    protected final java.lang.String zza(android.os.Bundle bundle) {
        java.lang.String strValueOf;
        if (bundle == null) {
            return null;
        }
        if (!zzg()) {
            return bundle.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Bundle[{");
        for (java.lang.String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzb(str));
            sb.append("=");
            if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzda)) {
                java.lang.Object obj = bundle.get(str);
                if (obj instanceof android.os.Bundle) {
                    strValueOf = zza(new java.lang.Object[]{obj});
                } else if (obj instanceof java.lang.Object[]) {
                    strValueOf = zza((java.lang.Object[]) obj);
                } else if (obj instanceof java.util.ArrayList) {
                    strValueOf = zza(((java.util.ArrayList) obj).toArray());
                } else {
                    strValueOf = java.lang.String.valueOf(obj);
                }
                sb.append(strValueOf);
            } else {
                sb.append(bundle.get(str));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    private final java.lang.String zza(java.lang.Object[] objArr) {
        java.lang.String strValueOf;
        if (objArr == null) {
            return "[]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        for (java.lang.Object obj : objArr) {
            if (obj instanceof android.os.Bundle) {
                strValueOf = zza((android.os.Bundle) obj);
            } else {
                strValueOf = java.lang.String.valueOf(obj);
            }
            if (strValueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strValueOf);
            }
        }
        sb.append("]");
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
