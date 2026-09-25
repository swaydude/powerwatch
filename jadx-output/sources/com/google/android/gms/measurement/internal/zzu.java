package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzu {
    java.lang.String zza;
    int zzb;
    java.lang.Boolean zzc;
    java.lang.Boolean zzd;
    java.lang.Long zze;
    java.lang.Long zzf;

    zzu(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();

    static java.lang.Boolean zza(java.lang.Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(bool.booleanValue() != z);
    }

    static java.lang.Boolean zza(java.lang.String str, com.google.android.gms.internal.measurement.zzbj.zzf zzfVar, com.google.android.gms.measurement.internal.zzfk zzfkVar) {
        java.lang.String strZzd;
        java.util.List<java.lang.String> list;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzfVar);
        if (str == null || !zzfVar.zza() || zzfVar.zzb() == com.google.android.gms.internal.measurement.zzbj.zzf.zzb.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (zzfVar.zzb() == com.google.android.gms.internal.measurement.zzbj.zzf.zzb.IN_LIST) {
            if (zzfVar.zzh() == 0) {
                return null;
            }
        } else if (!zzfVar.zzc()) {
            return null;
        }
        com.google.android.gms.internal.measurement.zzbj.zzf.zzb zzbVarZzb = zzfVar.zzb();
        boolean zZzf = zzfVar.zzf();
        if (zZzf || zzbVarZzb == com.google.android.gms.internal.measurement.zzbj.zzf.zzb.REGEXP || zzbVarZzb == com.google.android.gms.internal.measurement.zzbj.zzf.zzb.IN_LIST) {
            strZzd = zzfVar.zzd();
        } else {
            strZzd = zzfVar.zzd().toUpperCase(java.util.Locale.ENGLISH);
        }
        java.lang.String str2 = strZzd;
        if (zzfVar.zzh() == 0) {
            list = null;
        } else {
            java.util.List<java.lang.String> listZzg = zzfVar.zzg();
            if (!zZzf) {
                java.util.ArrayList arrayList = new java.util.ArrayList(listZzg.size());
                java.util.Iterator<java.lang.String> it = listZzg.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().toUpperCase(java.util.Locale.ENGLISH));
                }
                listZzg = java.util.Collections.unmodifiableList(arrayList);
            }
            list = listZzg;
        }
        return zza(str, zzbVarZzb, zZzf, str2, list, zzbVarZzb == com.google.android.gms.internal.measurement.zzbj.zzf.zzb.REGEXP ? str2 : null, zzfkVar);
    }

    private static java.lang.Boolean zza(java.lang.String str, com.google.android.gms.internal.measurement.zzbj.zzf.zzb zzbVar, boolean z, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3, com.google.android.gms.measurement.internal.zzfk zzfkVar) {
        if (str == null) {
            return null;
        }
        if (zzbVar == com.google.android.gms.internal.measurement.zzbj.zzf.zzb.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzbVar != com.google.android.gms.internal.measurement.zzbj.zzf.zzb.REGEXP) {
            str = str.toUpperCase(java.util.Locale.ENGLISH);
        }
        switch (com.google.android.gms.measurement.internal.zzq.zza[zzbVar.ordinal()]) {
            case 1:
                try {
                    return java.lang.Boolean.valueOf(java.util.regex.Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (java.util.regex.PatternSyntaxException unused) {
                    if (zzfkVar != null) {
                        zzfkVar.zzi().zza("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return java.lang.Boolean.valueOf(str.startsWith(str2));
            case 3:
                return java.lang.Boolean.valueOf(str.endsWith(str2));
            case 4:
                return java.lang.Boolean.valueOf(str.contains(str2));
            case 5:
                return java.lang.Boolean.valueOf(str.equals(str2));
            case 6:
                return java.lang.Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static java.lang.Boolean zza(long j, com.google.android.gms.internal.measurement.zzbj.zzd zzdVar) {
        try {
            return zza(new java.math.BigDecimal(j), zzdVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zza(double d, com.google.android.gms.internal.measurement.zzbj.zzd zzdVar) {
        try {
            return zza(new java.math.BigDecimal(d), zzdVar, java.lang.Math.ulp(d));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    static java.lang.Boolean zza(java.lang.String str, com.google.android.gms.internal.measurement.zzbj.zzd zzdVar) {
        if (!com.google.android.gms.measurement.internal.zzkw.zza(str)) {
            return null;
        }
        try {
            return zza(new java.math.BigDecimal(str), zzdVar, 0.0d);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    private static java.lang.Boolean zza(java.math.BigDecimal bigDecimal, com.google.android.gms.internal.measurement.zzbj.zzd zzdVar, double d) {
        java.math.BigDecimal bigDecimal2;
        java.math.BigDecimal bigDecimal3;
        java.math.BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzdVar);
        if (zzdVar.zza() && zzdVar.zzb() != com.google.android.gms.internal.measurement.zzbj.zzd.zza.UNKNOWN_COMPARISON_TYPE) {
            if (zzdVar.zzb() == com.google.android.gms.internal.measurement.zzbj.zzd.zza.BETWEEN) {
                if (!zzdVar.zzg() || !zzdVar.zzi()) {
                    return null;
                }
            } else if (!zzdVar.zze()) {
                return null;
            }
            com.google.android.gms.internal.measurement.zzbj.zzd.zza zzaVarZzb = zzdVar.zzb();
            if (zzdVar.zzb() == com.google.android.gms.internal.measurement.zzbj.zzd.zza.BETWEEN) {
                if (com.google.android.gms.measurement.internal.zzkw.zza(zzdVar.zzh()) && com.google.android.gms.measurement.internal.zzkw.zza(zzdVar.zzj())) {
                    try {
                        java.math.BigDecimal bigDecimal5 = new java.math.BigDecimal(zzdVar.zzh());
                        bigDecimal4 = new java.math.BigDecimal(zzdVar.zzj());
                        bigDecimal3 = bigDecimal5;
                        bigDecimal2 = null;
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                return null;
            }
            if (!com.google.android.gms.measurement.internal.zzkw.zza(zzdVar.zzf())) {
                return null;
            }
            try {
                bigDecimal2 = new java.math.BigDecimal(zzdVar.zzf());
                bigDecimal3 = null;
                bigDecimal4 = null;
            } catch (java.lang.NumberFormatException unused2) {
            }
            if (zzaVarZzb == com.google.android.gms.internal.measurement.zzbj.zzd.zza.BETWEEN) {
                if (bigDecimal3 == null) {
                    return null;
                }
            } else if (bigDecimal2 != null) {
            }
            int i = com.google.android.gms.measurement.internal.zzq.zzb[zzaVarZzb.ordinal()];
            boolean z = false;
            if (i == 1) {
                return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == -1);
            }
            if (i == 2) {
                return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 1);
            }
            if (i == 3) {
                if (d == 0.0d) {
                    return java.lang.Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                }
                if (bigDecimal.compareTo(bigDecimal2.subtract(new java.math.BigDecimal(d).multiply(new java.math.BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new java.math.BigDecimal(d).multiply(new java.math.BigDecimal(2)))) == -1) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
            if (i == 4) {
                if (bigDecimal.compareTo(bigDecimal3) != -1 && bigDecimal.compareTo(bigDecimal4) != 1) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        return null;
    }
}
