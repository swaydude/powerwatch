package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzp implements com.google.android.gms.clearcut.ClearcutLogger.zza {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private static final com.google.android.gms.internal.clearcut.zzao zzaq;
    private static final com.google.android.gms.internal.clearcut.zzao zzar;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<com.google.android.gms.internal.clearcut.zzgw.zza>> zzas;
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<java.lang.String>> zzat;
    private static java.lang.Boolean zzau;
    private static java.lang.Long zzav;
    private static final com.google.android.gms.internal.clearcut.zzae<java.lang.Boolean> zzaw;
    private final android.content.Context zzh;

    static {
        com.google.android.gms.internal.clearcut.zzao zzaoVarZzd = new com.google.android.gms.internal.clearcut.zzao(com.google.android.gms.phenotype.Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
        zzaq = zzaoVarZzd;
        zzar = new com.google.android.gms.internal.clearcut.zzao(com.google.android.gms.phenotype.Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
        zzas = new java.util.concurrent.ConcurrentHashMap<>();
        zzat = new java.util.HashMap<>();
        zzau = null;
        zzav = null;
        zzaw = zzaoVarZzd.zzc("enable_log_sampling_rules", false);
    }

    public zzp(android.content.Context context) {
        this.zzh = context;
        if (context != null) {
            com.google.android.gms.internal.clearcut.zzae.maybeInit(context);
        }
    }

    private static long zza(java.lang.String str, long j) {
        if (str == null || str.isEmpty()) {
            return com.google.android.gms.internal.clearcut.zzk.zza(java.nio.ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(UTF_8);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(bytes.length + 8);
        byteBufferAllocate.put(bytes);
        byteBufferAllocate.putLong(j);
        return com.google.android.gms.internal.clearcut.zzk.zza(byteBufferAllocate.array());
    }

    private static com.google.android.gms.internal.clearcut.zzgw.zza.zzb zza(java.lang.String str) {
        java.lang.String strSubstring;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(44);
        int i = 0;
        if (iIndexOf >= 0) {
            i = iIndexOf + 1;
            strSubstring = str.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        int iIndexOf2 = str.indexOf(47, i);
        if (iIndexOf2 <= 0) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            android.util.Log.e("LogSamplerImpl", strValueOf.length() != 0 ? "Failed to parse the rule: ".concat(strValueOf) : new java.lang.String("Failed to parse the rule: "));
            return null;
        }
        try {
            long j = java.lang.Long.parseLong(str.substring(i, iIndexOf2));
            long j2 = java.lang.Long.parseLong(str.substring(iIndexOf2 + 1));
            if (j >= 0 && j2 >= 0) {
                return com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zzfz().zzn(strSubstring).zzr(j).zzs(j2).zzbh();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(72);
            sb.append("negative values not supported: ");
            sb.append(j);
            sb.append("/");
            sb.append(j2);
            android.util.Log.e("LogSamplerImpl", sb.toString());
            return null;
        } catch (java.lang.NumberFormatException e) {
            java.lang.String strValueOf2 = java.lang.String.valueOf(str);
            android.util.Log.e("LogSamplerImpl", strValueOf2.length() != 0 ? "parseLong() failed while parsing: ".concat(strValueOf2) : new java.lang.String("parseLong() failed while parsing: "), e);
            return null;
        }
    }

    private static boolean zzb(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0L ? 1 : (j == 0L ? 0 : -1)) >= 0 ? j % j3 : (((kotlin.jvm.internal.LongCompanionObject.MAX_VALUE % j3) + 1) + ((j & kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) % j3)) % j3) < j2;
    }

    private static boolean zzc(android.content.Context context) {
        if (zzau == null) {
            zzau = java.lang.Boolean.valueOf(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return zzau.booleanValue();
    }

    private static long zzd(android.content.Context context) {
        if (zzav == null) {
            if (context == null) {
                return 0L;
            }
            zzav = java.lang.Long.valueOf(zzc(context) ? com.google.android.gms.internal.clearcut.zzy.getLong(context.getContentResolver(), "android_id", 0L) : 0L);
        }
        return zzav.longValue();
    }

    @Override // com.google.android.gms.clearcut.ClearcutLogger.zza
    public final boolean zza(com.google.android.gms.clearcut.zze zzeVar) {
        java.util.List<com.google.android.gms.internal.clearcut.zzgw.zza.zzb> listZzfs;
        com.google.android.gms.internal.clearcut.zzae<com.google.android.gms.internal.clearcut.zzgw.zza> zzaeVarPutIfAbsent;
        java.lang.String strValueOf = zzeVar.zzag.zzj;
        int i = zzeVar.zzag.zzk;
        int i2 = zzeVar.zzaa != null ? zzeVar.zzaa.zzbji : 0;
        java.lang.String str = null;
        if (!zzaw.get().booleanValue()) {
            if (strValueOf == null || strValueOf.isEmpty()) {
                strValueOf = i >= 0 ? java.lang.String.valueOf(i) : null;
            }
            if (strValueOf == null) {
                return true;
            }
            android.content.Context context = this.zzh;
            if (context != null && zzc(context)) {
                java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<java.lang.String>> map = zzat;
                com.google.android.gms.internal.clearcut.zzae<java.lang.String> zzaeVarZza = map.get(strValueOf);
                if (zzaeVarZza == null) {
                    zzaeVarZza = zzar.zza(strValueOf, null);
                    map.put(strValueOf, zzaeVarZza);
                }
                str = zzaeVarZza.get();
            }
            com.google.android.gms.internal.clearcut.zzgw.zza.zzb zzbVarZza = zza(str);
            if (zzbVarZza != null) {
                return zzb(zza(zzbVarZza.zzfw(), zzd(this.zzh)), zzbVarZza.zzfx(), zzbVarZza.zzfy());
            }
            return true;
        }
        if (strValueOf == null || strValueOf.isEmpty()) {
            strValueOf = i >= 0 ? java.lang.String.valueOf(i) : null;
        }
        if (strValueOf == null) {
            return true;
        }
        if (this.zzh == null) {
            listZzfs = java.util.Collections.emptyList();
        } else {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<com.google.android.gms.internal.clearcut.zzgw.zza>> concurrentHashMap = zzas;
            com.google.android.gms.internal.clearcut.zzae<com.google.android.gms.internal.clearcut.zzgw.zza> zzaeVarZza2 = concurrentHashMap.get(strValueOf);
            if (zzaeVarZza2 == null && (zzaeVarPutIfAbsent = concurrentHashMap.putIfAbsent(strValueOf, (zzaeVarZza2 = zzaq.zza(strValueOf, com.google.android.gms.internal.clearcut.zzgw.zza.zzft(), com.google.android.gms.internal.clearcut.zzq.zzax)))) != null) {
                zzaeVarZza2 = zzaeVarPutIfAbsent;
            }
            listZzfs = zzaeVarZza2.get().zzfs();
        }
        for (com.google.android.gms.internal.clearcut.zzgw.zza.zzb zzbVar : listZzfs) {
            if (!zzbVar.zzfv() || zzbVar.getEventCode() == 0 || zzbVar.getEventCode() == i2) {
                if (!zzb(zza(zzbVar.zzfw(), zzd(this.zzh)), zzbVar.zzfx(), zzbVar.zzfy())) {
                    return false;
                }
            }
        }
        return true;
    }
}
