package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzkw extends com.google.android.gms.measurement.internal.zzkp {
    zzkw(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    final void zza(com.google.android.gms.internal.measurement.zzbr.zzk.zza zzaVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzaVar.zza().zzb().zzc();
        if (obj instanceof java.lang.String) {
            zzaVar.zzb((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzaVar.zzb(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.Double) {
            zzaVar.zza(((java.lang.Double) obj).doubleValue());
        } else {
            zzr().zzf().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    final void zza(com.google.android.gms.internal.measurement.zzbr.zze.zza zzaVar, java.lang.Object obj) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
        zzaVar.zza().zzb().zzc().zze();
        if (obj instanceof java.lang.String) {
            zzaVar.zzb((java.lang.String) obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            zzaVar.zza(((java.lang.Long) obj).longValue());
            return;
        }
        if (obj instanceof java.lang.Double) {
            zzaVar.zza(((java.lang.Double) obj).doubleValue());
            return;
        }
        if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdc) && (obj instanceof android.os.Bundle[])) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.os.Bundle bundle : (android.os.Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzbr.zze.zza zzaVarZzk = com.google.android.gms.internal.measurement.zzbr.zze.zzk();
                    for (java.lang.String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzbr.zze.zza zzaVarZza = com.google.android.gms.internal.measurement.zzbr.zze.zzk().zza(str);
                        java.lang.Object obj2 = bundle.get(str);
                        if (obj2 instanceof java.lang.Long) {
                            zzaVarZza.zza(((java.lang.Long) obj2).longValue());
                        } else if (obj2 instanceof java.lang.String) {
                            zzaVarZza.zzb((java.lang.String) obj2);
                        } else if (obj2 instanceof java.lang.Double) {
                            zzaVarZza.zza(((java.lang.Double) obj2).doubleValue());
                        }
                        zzaVarZzk.zza(zzaVarZza);
                    }
                    if (zzaVarZzk.zzd() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzbr.zze) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzk.zzu()));
                    }
                }
            }
            zzaVar.zza(arrayList);
            return;
        }
        zzr().zzf().zza("Ignoring invalid (type) event param value", obj);
    }

    static com.google.android.gms.internal.measurement.zzbr.zze zza(com.google.android.gms.internal.measurement.zzbr.zzc zzcVar, java.lang.String str) {
        for (com.google.android.gms.internal.measurement.zzbr.zze zzeVar : zzcVar.zza()) {
            if (zzeVar.zzb().equals(str)) {
                return zzeVar;
            }
        }
        return null;
    }

    final java.lang.Object zzb(com.google.android.gms.internal.measurement.zzbr.zzc zzcVar, java.lang.String str) {
        com.google.android.gms.internal.measurement.zzbr.zze zzeVarZza = zza(zzcVar, str);
        if (zzeVarZza == null) {
            return null;
        }
        if (zzeVarZza.zzc()) {
            return zzeVarZza.zzd();
        }
        if (zzeVarZza.zze()) {
            return java.lang.Long.valueOf(zzeVarZza.zzf());
        }
        if (zzeVarZza.zzg()) {
            return java.lang.Double.valueOf(zzeVarZza.zzh());
        }
        if (!com.google.android.gms.internal.measurement.zzjp.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdc) || zzeVarZza.zzj() <= 0) {
            return null;
        }
        java.util.List<com.google.android.gms.internal.measurement.zzbr.zze> listZzi = zzeVarZza.zzi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.android.gms.internal.measurement.zzbr.zze zzeVar : listZzi) {
            if (zzeVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                for (com.google.android.gms.internal.measurement.zzbr.zze zzeVar2 : zzeVar.zzi()) {
                    if (zzeVar2.zzc()) {
                        bundle.putString(zzeVar2.zzb(), zzeVar2.zzd());
                    } else if (zzeVar2.zze()) {
                        bundle.putLong(zzeVar2.zzb(), zzeVar2.zzf());
                    } else if (zzeVar2.zzg()) {
                        bundle.putDouble(zzeVar2.zzb(), zzeVar2.zzh());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (android.os.Bundle[]) arrayList.toArray(new android.os.Bundle[arrayList.size()]);
    }

    final void zza(com.google.android.gms.internal.measurement.zzbr.zzc.zza zzaVar, java.lang.String str, java.lang.Object obj) {
        java.util.List<com.google.android.gms.internal.measurement.zzbr.zze> listZza = zzaVar.zza();
        int i = 0;
        while (true) {
            if (i >= listZza.size()) {
                i = -1;
                break;
            } else if (str.equals(listZza.get(i).zzb())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzbr.zze.zza zzaVarZza = com.google.android.gms.internal.measurement.zzbr.zze.zzk().zza(str);
        if (obj instanceof java.lang.Long) {
            zzaVarZza.zza(((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.String) {
            zzaVarZza.zzb((java.lang.String) obj);
        } else if (obj instanceof java.lang.Double) {
            zzaVarZza.zza(((java.lang.Double) obj).doubleValue());
        } else if (com.google.android.gms.internal.measurement.zzjp.zzb()) {
            zzt().zza(com.google.android.gms.measurement.internal.zzap.zzdc);
        }
        if (i >= 0) {
            zzaVar.zza(i, zzaVarZza);
        } else {
            zzaVar.zza(zzaVarZza);
        }
    }

    final java.lang.String zza(com.google.android.gms.internal.measurement.zzbr.zzf zzfVar) {
        if (zzfVar == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzbr.zzg zzgVar : zzfVar.zza()) {
            if (zzgVar != null) {
                zza(sb, 1);
                sb.append("bundle {\n");
                if (zzgVar.zza()) {
                    zza(sb, 1, "protocol_version", java.lang.Integer.valueOf(zzgVar.zzb()));
                }
                zza(sb, 1, "platform", zzgVar.zzq());
                if (zzgVar.zzz()) {
                    zza(sb, 1, "gmp_version", java.lang.Long.valueOf(zzgVar.zzaa()));
                }
                if (zzgVar.zzab()) {
                    zza(sb, 1, "uploading_gmp_version", java.lang.Long.valueOf(zzgVar.zzac()));
                }
                if (zzgVar.zzbc()) {
                    zza(sb, 1, "dynamite_version", java.lang.Long.valueOf(zzgVar.zzbd()));
                }
                if (zzgVar.zzau()) {
                    zza(sb, 1, "config_version", java.lang.Long.valueOf(zzgVar.zzav()));
                }
                zza(sb, 1, "gmp_app_id", zzgVar.zzam());
                zza(sb, 1, "admob_app_id", zzgVar.zzbb());
                zza(sb, 1, "app_id", zzgVar.zzx());
                zza(sb, 1, "app_version", zzgVar.zzy());
                if (zzgVar.zzar()) {
                    zza(sb, 1, "app_version_major", java.lang.Integer.valueOf(zzgVar.zzas()));
                }
                zza(sb, 1, "firebase_instance_id", zzgVar.zzaq());
                if (zzgVar.zzah()) {
                    zza(sb, 1, "dev_cert_hash", java.lang.Long.valueOf(zzgVar.zzai()));
                }
                zza(sb, 1, "app_store", zzgVar.zzw());
                if (zzgVar.zzg()) {
                    zza(sb, 1, "upload_timestamp_millis", java.lang.Long.valueOf(zzgVar.zzh()));
                }
                if (zzgVar.zzi()) {
                    zza(sb, 1, "start_timestamp_millis", java.lang.Long.valueOf(zzgVar.zzj()));
                }
                if (zzgVar.zzk()) {
                    zza(sb, 1, "end_timestamp_millis", java.lang.Long.valueOf(zzgVar.zzl()));
                }
                if (zzgVar.zzm()) {
                    zza(sb, 1, "previous_bundle_start_timestamp_millis", java.lang.Long.valueOf(zzgVar.zzn()));
                }
                if (zzgVar.zzo()) {
                    zza(sb, 1, "previous_bundle_end_timestamp_millis", java.lang.Long.valueOf(zzgVar.zzp()));
                }
                zza(sb, 1, "app_instance_id", zzgVar.zzag());
                zza(sb, 1, "resettable_device_id", zzgVar.zzad());
                zza(sb, 1, "device_id", zzgVar.zzat());
                zza(sb, 1, "ds_id", zzgVar.zzay());
                if (zzgVar.zzae()) {
                    zza(sb, 1, "limited_ad_tracking", java.lang.Boolean.valueOf(zzgVar.zzaf()));
                }
                zza(sb, 1, "os_version", zzgVar.zzr());
                zza(sb, 1, "device_model", zzgVar.zzs());
                zza(sb, 1, "user_default_language", zzgVar.zzt());
                if (zzgVar.zzu()) {
                    zza(sb, 1, "time_zone_offset_minutes", java.lang.Integer.valueOf(zzgVar.zzv()));
                }
                if (zzgVar.zzaj()) {
                    zza(sb, 1, "bundle_sequential_index", java.lang.Integer.valueOf(zzgVar.zzak()));
                }
                if (zzgVar.zzan()) {
                    zza(sb, 1, "service_upload", java.lang.Boolean.valueOf(zzgVar.zzao()));
                }
                zza(sb, 1, "health_monitor", zzgVar.zzal());
                if (zzgVar.zzaw() && zzgVar.zzax() != 0) {
                    zza(sb, 1, "android_id", java.lang.Long.valueOf(zzgVar.zzax()));
                }
                if (zzgVar.zzaz()) {
                    zza(sb, 1, "retry_counter", java.lang.Integer.valueOf(zzgVar.zzba()));
                }
                java.util.List<com.google.android.gms.internal.measurement.zzbr.zzk> listZze = zzgVar.zze();
                if (listZze != null) {
                    for (com.google.android.gms.internal.measurement.zzbr.zzk zzkVar : listZze) {
                        if (zzkVar != null) {
                            zza(sb, 2);
                            sb.append("user_property {\n");
                            zza(sb, 2, "set_timestamp_millis", zzkVar.zza() ? java.lang.Long.valueOf(zzkVar.zzb()) : null);
                            zza(sb, 2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzo().zzc(zzkVar.zzc()));
                            zza(sb, 2, "string_value", zzkVar.zze());
                            zza(sb, 2, "int_value", zzkVar.zzf() ? java.lang.Long.valueOf(zzkVar.zzg()) : null);
                            zza(sb, 2, "double_value", zzkVar.zzh() ? java.lang.Double.valueOf(zzkVar.zzi()) : null);
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzbr.zza> listZzap = zzgVar.zzap();
                java.lang.String strZzx = zzgVar.zzx();
                if (listZzap != null) {
                    for (com.google.android.gms.internal.measurement.zzbr.zza zzaVar : listZzap) {
                        if (zzaVar != null) {
                            zza(sb, 2);
                            sb.append("audience_membership {\n");
                            if (zzaVar.zza()) {
                                zza(sb, 2, "audience_id", java.lang.Integer.valueOf(zzaVar.zzb()));
                            }
                            if (zzaVar.zzf()) {
                                zza(sb, 2, "new_audience", java.lang.Boolean.valueOf(zzaVar.zzg()));
                            }
                            zza(sb, 2, "current_data", zzaVar.zzc(), strZzx);
                            if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzaVar.zzd()) {
                                zza(sb, 2, "previous_data", zzaVar.zze(), strZzx);
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                java.util.List<com.google.android.gms.internal.measurement.zzbr.zzc> listZzc = zzgVar.zzc();
                if (listZzc != null) {
                    for (com.google.android.gms.internal.measurement.zzbr.zzc zzcVar : listZzc) {
                        if (zzcVar != null) {
                            zza(sb, 2);
                            sb.append("event {\n");
                            zza(sb, 2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzo().zza(zzcVar.zzc()));
                            if (zzcVar.zzd()) {
                                zza(sb, 2, "timestamp_millis", java.lang.Long.valueOf(zzcVar.zze()));
                            }
                            if (zzcVar.zzf()) {
                                zza(sb, 2, "previous_timestamp_millis", java.lang.Long.valueOf(zzcVar.zzg()));
                            }
                            if (zzcVar.zzh()) {
                                zza(sb, 2, "count", java.lang.Integer.valueOf(zzcVar.zzi()));
                            }
                            if (zzcVar.zzb() != 0) {
                                zza(sb, 2, zzcVar.zza());
                            }
                            zza(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                zza(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    final java.lang.String zza(com.google.android.gms.internal.measurement.zzbj.zzb zzbVar) {
        if (zzbVar == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nevent_filter {\n");
        if (zzbVar.zza()) {
            zza(sb, 0, "filter_id", java.lang.Integer.valueOf(zzbVar.zzb()));
        }
        zza(sb, 0, "event_name", zzo().zza(zzbVar.zzc()));
        java.lang.String strZza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzk());
        if (!strZza.isEmpty()) {
            zza(sb, 0, "filter_type", strZza);
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzbVar.zzf()) {
            zza(sb, 1, "event_count_filter", zzbVar.zzg());
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzbVar.zze() > 0) {
            sb.append("  filters {\n");
            java.util.Iterator<com.google.android.gms.internal.measurement.zzbj.zzc> it = zzbVar.zzd().iterator();
            while (it.hasNext()) {
                zza(sb, 2, it.next());
            }
        }
        zza(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    final java.lang.String zza(com.google.android.gms.internal.measurement.zzbj.zze zzeVar) {
        if (zzeVar == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (zzeVar.zza()) {
            zza(sb, 0, "filter_id", java.lang.Integer.valueOf(zzeVar.zzb()));
        }
        zza(sb, 0, "property_name", zzo().zzc(zzeVar.zzc()));
        java.lang.String strZza = zza(zzeVar.zze(), zzeVar.zzf(), zzeVar.zzh());
        if (!strZza.isEmpty()) {
            zza(sb, 0, "filter_type", strZza);
        }
        zza(sb, 1, zzeVar.zzd());
        sb.append("}\n");
        return sb.toString();
    }

    private static java.lang.String zza(boolean z, boolean z2, boolean z3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private final void zza(java.lang.StringBuilder sb, int i, java.util.List<com.google.android.gms.internal.measurement.zzbr.zze> list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        for (com.google.android.gms.internal.measurement.zzbr.zze zzeVar : list) {
            if (zzeVar != null) {
                zza(sb, i2);
                sb.append("param {\n");
                if (com.google.android.gms.internal.measurement.zzjp.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzda)) {
                    zza(sb, i2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzeVar.zza() ? zzo().zzb(zzeVar.zzb()) : null);
                    zza(sb, i2, "string_value", zzeVar.zzc() ? zzeVar.zzd() : null);
                    zza(sb, i2, "int_value", zzeVar.zze() ? java.lang.Long.valueOf(zzeVar.zzf()) : null);
                    zza(sb, i2, "double_value", zzeVar.zzg() ? java.lang.Double.valueOf(zzeVar.zzh()) : null);
                    if (zzeVar.zzj() > 0) {
                        zza(sb, i2, zzeVar.zzi());
                    }
                } else {
                    zza(sb, i2, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME, zzo().zzb(zzeVar.zzb()));
                    zza(sb, i2, "string_value", zzeVar.zzd());
                    zza(sb, i2, "int_value", zzeVar.zze() ? java.lang.Long.valueOf(zzeVar.zzf()) : null);
                    zza(sb, i2, "double_value", zzeVar.zzg() ? java.lang.Double.valueOf(zzeVar.zzh()) : null);
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private static void zza(java.lang.StringBuilder sb, int i, java.lang.String str, com.google.android.gms.internal.measurement.zzbr.zzi zziVar, java.lang.String str2) {
        if (zziVar == null) {
            return;
        }
        zza(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zziVar.zzd() != 0) {
            zza(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (java.lang.Long l : zziVar.zzc()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zziVar.zzb() != 0) {
            zza(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (java.lang.Long l2 : zziVar.zza()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zziVar.zzf() != 0) {
            zza(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.zzbr.zzb zzbVar : zziVar.zze()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzbVar.zza() ? java.lang.Integer.valueOf(zzbVar.zzb()) : null);
                sb.append(":");
                sb.append(zzbVar.zzc() ? java.lang.Long.valueOf(zzbVar.zzd()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zziVar.zzh() != 0) {
            zza(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.zzbr.zzj zzjVar : zziVar.zzg()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzjVar.zza() ? java.lang.Integer.valueOf(zzjVar.zzb()) : null);
                sb.append(": [");
                java.util.Iterator<java.lang.Long> it = zzjVar.zzc().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zza(sb, 3);
        sb.append("}\n");
    }

    private final void zza(java.lang.StringBuilder sb, int i, java.lang.String str, com.google.android.gms.internal.measurement.zzbj.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzdVar.zza()) {
            zza(sb, i, "comparison_type", zzdVar.zzb().name());
        }
        if (zzdVar.zzc()) {
            zza(sb, i, "match_as_float", java.lang.Boolean.valueOf(zzdVar.zzd()));
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzdVar.zze()) {
            zza(sb, i, "comparison_value", zzdVar.zzf());
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzdVar.zzg()) {
            zza(sb, i, "min_comparison_value", zzdVar.zzh());
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzdVar.zzi()) {
            zza(sb, i, "max_comparison_value", zzdVar.zzj());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private final void zza(java.lang.StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzbj.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb, i);
        sb.append("filter {\n");
        if (zzcVar.zze()) {
            zza(sb, i, "complement", java.lang.Boolean.valueOf(zzcVar.zzf()));
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzcVar.zzg()) {
            zza(sb, i, "param_name", zzo().zzb(zzcVar.zzh()));
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzcVar.zza()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzbj.zzf zzfVarZzb = zzcVar.zzb();
            if (zzfVarZzb != null) {
                zza(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (zzfVarZzb.zza()) {
                    zza(sb, i2, "match_type", zzfVarZzb.zzb().name());
                }
                if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzfVarZzb.zzc()) {
                    zza(sb, i2, "expression", zzfVarZzb.zzd());
                }
                if (zzfVarZzb.zze()) {
                    zza(sb, i2, "case_sensitive", java.lang.Boolean.valueOf(zzfVarZzb.zzf()));
                }
                if (zzfVarZzb.zzh() > 0) {
                    zza(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (java.lang.String str : zzfVarZzb.zzg()) {
                        zza(sb, i2 + 2);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zza(sb, i2);
                sb.append("}\n");
            }
        }
        if (!com.google.android.gms.internal.measurement.zzky.zzb() || !zzt().zza(com.google.android.gms.measurement.internal.zzap.zzcz) || zzcVar.zzc()) {
            zza(sb, i + 1, "number_filter", zzcVar.zzd());
        }
        zza(sb, i);
        sb.append("}\n");
    }

    private static void zza(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private static void zza(java.lang.StringBuilder sb, int i, java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    final <T extends android.os.Parcelable> T zza(byte[] bArr, android.os.Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } catch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException unused) {
            zzr().zzf().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    final boolean zza(com.google.android.gms.measurement.internal.zzan zzanVar, com.google.android.gms.measurement.internal.zzm zzmVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzanVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzmVar);
        if (com.google.android.gms.internal.measurement.zzjj.zzb() && zzt().zza(com.google.android.gms.measurement.internal.zzap.zzco)) {
            return (android.text.TextUtils.isEmpty(zzmVar.zzb) && android.text.TextUtils.isEmpty(zzmVar.zzr)) ? false : true;
        }
        if (!android.text.TextUtils.isEmpty(zzmVar.zzb) || !android.text.TextUtils.isEmpty(zzmVar.zzr)) {
            return true;
        }
        zzu();
        return false;
    }

    static boolean zza(java.lang.String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean zza(java.util.List<java.lang.Long> list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
        }
        return false;
    }

    static java.util.List<java.lang.Long> zza(java.util.BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    final java.util.List<java.lang.Long> zza(java.util.List<java.lang.Long> list, java.util.List<java.lang.Integer> list2) {
        int i;
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        for (java.lang.Integer num : list2) {
            if (num.intValue() < 0) {
                zzr().zzi().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    zzr().zzi().zza("Ignoring bit index greater than bitSet size", num, java.lang.Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, java.lang.Long.valueOf(((java.lang.Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((java.lang.Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    final boolean zza(long j, long j2) {
        return j == 0 || j2 <= 0 || java.lang.Math.abs(zzm().currentTimeMillis() - j) > j2;
    }

    final long zza(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        zzp().zzd();
        java.security.MessageDigest messageDigestZzi = com.google.android.gms.measurement.internal.zzla.zzi();
        if (messageDigestZzi == null) {
            zzr().zzf().zza("Failed to get MD5");
            return 0L;
        }
        return com.google.android.gms.measurement.internal.zzla.zza(messageDigestZzi.digest(bArr));
    }

    final byte[] zzb(byte[] bArr) throws java.io.IOException {
        try {
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
            java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(byteArrayInputStream);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i > 0) {
                    byteArrayOutputStream.write(bArr2, 0, i);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (java.io.IOException e) {
            zzr().zzf().zza("Failed to ungzip content", e);
            throw e;
        }
    }

    final byte[] zzc(byte[] bArr) throws java.io.IOException {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException e) {
            zzr().zzf().zza("Failed to gzip content", e);
            throw e;
        }
    }

    final java.util.List<java.lang.Integer> zzf() {
        java.util.Map<java.lang.String, java.lang.String> mapZza = com.google.android.gms.measurement.internal.zzap.zza(this.zza.zzn());
        if (mapZza == null || mapZza.size() == 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iIntValue = com.google.android.gms.measurement.internal.zzap.zzan.zza(null).intValue();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : mapZza.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int i = java.lang.Integer.parseInt(entry.getValue());
                    if (i != 0) {
                        arrayList.add(java.lang.Integer.valueOf(i));
                        if (arrayList.size() >= iIntValue) {
                            zzr().zzi().zza("Too many experiment IDs. Number of IDs", java.lang.Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (java.lang.NumberFormatException e) {
                    zzr().zzi().zza("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    static <Builder extends com.google.android.gms.internal.measurement.zzgn> Builder zza(Builder builder, byte[] bArr) throws com.google.android.gms.internal.measurement.zzfo {
        com.google.android.gms.internal.measurement.zzeq zzeqVarZzb = com.google.android.gms.internal.measurement.zzeq.zzb();
        if (zzeqVarZzb != null) {
            return (Builder) builder.zza(bArr, zzeqVarZzb);
        }
        return (Builder) builder.zza(bArr);
    }

    static int zza(com.google.android.gms.internal.measurement.zzbr.zzg.zza zzaVar, java.lang.String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i = 0; i < zzaVar.zze(); i++) {
            if (str.equals(zzaVar.zzd(i).zzc())) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzkw zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzn e_() {
        return super.e_();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzac zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgi zzj() {
        return super.zzj();
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
