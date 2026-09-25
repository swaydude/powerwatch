package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends com.google.android.gms.measurement.internal.zzkp {
    private java.lang.String zzb;
    private java.util.Set<java.lang.Integer> zzc;
    private java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzp> zzd;
    private java.lang.Long zze;
    private java.lang.Long zzf;

    zzn(com.google.android.gms.measurement.internal.zzks zzksVar) {
        super(zzksVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0324  */
    /* JADX WARN: Code duplicated, block: B:299:0x032b A[SYNTHETIC] */
    final java.util.List<com.google.android.gms.internal.measurement.zzbr.zza> zza(java.lang.String str, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzc> list, java.util.List<com.google.android.gms.internal.measurement.zzbr.zzk> list2, java.lang.Long l, java.lang.Long l2) throws java.lang.Throwable {
        boolean z;
        com.google.android.gms.measurement.internal.zzaj zzajVar;
        com.google.android.gms.measurement.internal.zzaj zzajVar2;
        com.google.android.gms.measurement.internal.zzs zzsVar;
        androidx.collection.ArrayMap arrayMap;
        java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> map;
        androidx.collection.ArrayMap arrayMap2;
        java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb> list3;
        java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> map2;
        java.util.Iterator it;
        boolean z2;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list2);
        this.zzb = str;
        this.zzc = new java.util.HashSet();
        this.zzd = new androidx.collection.ArrayMap();
        this.zze = l;
        this.zzf = l2;
        if (!zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbm) && !zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbn)) {
            z = false;
            break;
        }
        java.util.Iterator<com.google.android.gms.internal.measurement.zzbr.zzc> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(it2.next().zzc())) {
                z = true;
                break;
            }
        }
        boolean zZzd = zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbm);
        boolean zZzd2 = zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbn);
        boolean z3 = com.google.android.gms.internal.measurement.zzkb.zzb() && zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbx);
        boolean z4 = com.google.android.gms.internal.measurement.zzkb.zzb() && zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbw);
        if (z && zZzd2) {
            com.google.android.gms.measurement.internal.zzac zzacVarZzi = zzi();
            java.lang.String str2 = this.zzb;
            zzacVarZzi.zzak();
            zzacVarZzi.zzd();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("current_session_count", (java.lang.Integer) 0);
            try {
                zzacVarZzi.c_().update("events", contentValues, "app_id = ?", new java.lang.String[]{str2});
            } catch (android.database.sqlite.SQLiteException e) {
                zzacVarZzi.zzr().zzf().zza("Error resetting session-scoped event counts. appId", com.google.android.gms.measurement.internal.zzfk.zza(str2), e);
            }
        }
        java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> mapEmptyMap = java.util.Collections.emptyMap();
        if (z4 && z3) {
            mapEmptyMap = zzi().zze(this.zzb);
        }
        java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> mapZzg = zzi().zzg(this.zzb);
        if (mapZzg != null && !mapZzg.isEmpty()) {
            java.util.HashSet hashSet = new java.util.HashSet(mapZzg.keySet());
            if (zZzd && z) {
                java.lang.String str3 = this.zzb;
                com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str3);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(mapZzg);
                androidx.collection.ArrayMap arrayMap3 = new androidx.collection.ArrayMap();
                if (!mapZzg.isEmpty()) {
                    java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> mapZzf = zzi().zzf(str3);
                    java.util.Iterator<java.lang.Integer> it3 = mapZzg.keySet().iterator();
                    while (it3.hasNext()) {
                        int iIntValue = it3.next().intValue();
                        com.google.android.gms.internal.measurement.zzbr.zzi zziVar = mapZzg.get(java.lang.Integer.valueOf(iIntValue));
                        java.util.List<java.lang.Integer> list4 = mapZzf.get(java.lang.Integer.valueOf(iIntValue));
                        if (list4 == null || list4.isEmpty()) {
                            arrayMap3.put(java.lang.Integer.valueOf(iIntValue), zziVar);
                        } else {
                            java.util.List<java.lang.Long> listZza = zzg().zza(zziVar.zzc(), list4);
                            if (!listZza.isEmpty()) {
                                com.google.android.gms.internal.measurement.zzbr.zzi.zza zzaVarZzb = zziVar.zzbm().zzb().zzb(listZza);
                                zzaVarZzb.zza().zza(zzg().zza(zziVar.zza(), list4));
                                for (int i = 0; i < zziVar.zzf(); i++) {
                                    if (list4.contains(java.lang.Integer.valueOf(zziVar.zza(i).zzb()))) {
                                        zzaVarZzb.zza(i);
                                    }
                                }
                                for (int i2 = 0; i2 < zziVar.zzh(); i2++) {
                                    if (list4.contains(java.lang.Integer.valueOf(zziVar.zzb(i2).zzb()))) {
                                        zzaVarZzb.zzb(i2);
                                    }
                                }
                                arrayMap3.put(java.lang.Integer.valueOf(iIntValue), (com.google.android.gms.internal.measurement.zzbr.zzi) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZzb.zzu()));
                            }
                        }
                    }
                }
                map = arrayMap3;
            } else {
                map = mapZzg;
            }
            java.util.Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                int iIntValue2 = ((java.lang.Integer) it4.next()).intValue();
                com.google.android.gms.internal.measurement.zzbr.zzi zziVar2 = map.get(java.lang.Integer.valueOf(iIntValue2));
                java.util.BitSet bitSet = new java.util.BitSet();
                java.util.BitSet bitSet2 = new java.util.BitSet();
                androidx.collection.ArrayMap arrayMap4 = new androidx.collection.ArrayMap();
                if (zziVar2 != null && zziVar2.zzf() != 0) {
                    for (com.google.android.gms.internal.measurement.zzbr.zzb zzbVar : zziVar2.zze()) {
                        if (zzbVar.zza()) {
                            arrayMap4.put(java.lang.Integer.valueOf(zzbVar.zzb()), zzbVar.zzc() ? java.lang.Long.valueOf(zzbVar.zzd()) : null);
                        }
                    }
                }
                if (com.google.android.gms.internal.measurement.zzmv.zzb() && zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbt)) {
                    androidx.collection.ArrayMap arrayMap5 = new androidx.collection.ArrayMap();
                    if (zziVar2 != null && zziVar2.zzh() != 0) {
                        for (java.util.Iterator<com.google.android.gms.internal.measurement.zzbr.zzj> it5 = zziVar2.zzg().iterator(); it5.hasNext(); it5 = it5) {
                            com.google.android.gms.internal.measurement.zzbr.zzj next = it5.next();
                            if (next.zza() && next.zzd() > 0) {
                                arrayMap5.put(java.lang.Integer.valueOf(next.zzb()), java.lang.Long.valueOf(next.zza(next.zzd() - 1)));
                            }
                        }
                    }
                    arrayMap2 = arrayMap5;
                } else {
                    arrayMap2 = null;
                }
                if (zziVar2 != null) {
                    int i3 = 0;
                    while (i3 < (zziVar2.zzb() << 6)) {
                        if (com.google.android.gms.measurement.internal.zzkw.zza(zziVar2.zza(), i3)) {
                            map2 = map;
                            it = it4;
                            zzr().zzx().zza("Filter already evaluated. audience ID, filter ID", java.lang.Integer.valueOf(iIntValue2), java.lang.Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (com.google.android.gms.measurement.internal.zzkw.zza(zziVar2.zzc(), i3)) {
                                bitSet.set(i3);
                                z2 = true;
                            }
                            if (!z2) {
                                arrayMap4.remove(java.lang.Integer.valueOf(i3));
                            }
                            i3++;
                            it4 = it;
                            map = map2;
                        } else {
                            map2 = map;
                            it = it4;
                        }
                        z2 = false;
                        if (!z2) {
                            arrayMap4.remove(java.lang.Integer.valueOf(i3));
                        }
                        i3++;
                        it4 = it;
                        map = map2;
                    }
                }
                java.util.Map<java.lang.Integer, com.google.android.gms.internal.measurement.zzbr.zzi> map3 = map;
                java.util.Iterator it6 = it4;
                if (zZzd) {
                    zziVar2 = mapZzg.get(java.lang.Integer.valueOf(iIntValue2));
                }
                com.google.android.gms.internal.measurement.zzbr.zzi zziVar3 = zziVar2;
                if (z4 && z3 && (list3 = mapEmptyMap.get(java.lang.Integer.valueOf(iIntValue2))) != null && this.zzf != null && this.zze != null) {
                    for (com.google.android.gms.internal.measurement.zzbj.zzb zzbVar2 : list3) {
                        int iZzb = zzbVar2.zzb();
                        long jLongValue = this.zzf.longValue() / 1000;
                        if (zzbVar2.zzi()) {
                            jLongValue = this.zze.longValue() / 1000;
                        }
                        if (arrayMap4.containsKey(java.lang.Integer.valueOf(iZzb))) {
                            arrayMap4.put(java.lang.Integer.valueOf(iZzb), java.lang.Long.valueOf(jLongValue));
                        }
                        if (arrayMap2.containsKey(java.lang.Integer.valueOf(iZzb))) {
                            arrayMap2.put(java.lang.Integer.valueOf(iZzb), java.lang.Long.valueOf(jLongValue));
                        }
                        mapEmptyMap = mapEmptyMap;
                    }
                }
                this.zzd.put(java.lang.Integer.valueOf(iIntValue2), new com.google.android.gms.measurement.internal.zzp(this, this.zzb, zziVar3, bitSet, bitSet2, arrayMap4, arrayMap2, null));
                it4 = it6;
                map = map3;
                mapEmptyMap = mapEmptyMap;
                mapZzg = mapZzg;
            }
        }
        com.google.android.gms.measurement.internal.zzq zzqVar = null;
        if (!list.isEmpty()) {
            com.google.android.gms.measurement.internal.zzs zzsVar2 = new com.google.android.gms.measurement.internal.zzs(this, zzqVar);
            androidx.collection.ArrayMap arrayMap6 = new androidx.collection.ArrayMap();
            for (com.google.android.gms.internal.measurement.zzbr.zzc zzcVar : list) {
                com.google.android.gms.internal.measurement.zzbr.zzc zzcVarZza = zzsVar2.zza(this.zzb, zzcVar);
                if (zzcVarZza != null) {
                    com.google.android.gms.measurement.internal.zzac zzacVarZzi2 = zzi();
                    java.lang.String str4 = this.zzb;
                    java.lang.String strZzc = zzcVarZza.zzc();
                    boolean zZzd3 = zzacVarZzi2.zzt().zzd(str4, com.google.android.gms.measurement.internal.zzap.zzbn);
                    com.google.android.gms.measurement.internal.zzaj zzajVarZza = zzacVarZzi2.zza(str4, zzcVar.zzc());
                    if (zzajVarZza == null) {
                        zzacVarZzi2.zzr().zzi().zza("Event aggregate wasn't created during raw event logging. appId, event", com.google.android.gms.measurement.internal.zzfk.zza(str4), zzacVarZzi2.zzo().zza(strZzc));
                        if (zZzd3) {
                            zzajVar2 = new com.google.android.gms.measurement.internal.zzaj(str4, zzcVar.zzc(), 1L, 1L, 1L, zzcVar.zze(), 0L, null, null, null, null);
                        } else {
                            zzajVar2 = new com.google.android.gms.measurement.internal.zzaj(str4, zzcVar.zzc(), 1L, 1L, zzcVar.zze(), 0L, null, null, null, null);
                        }
                    } else {
                        if (zZzd3) {
                            zzajVar = new com.google.android.gms.measurement.internal.zzaj(zzajVarZza.zza, zzajVarZza.zzb, zzajVarZza.zzc + 1, zzajVarZza.zzd + 1, zzajVarZza.zze + 1, zzajVarZza.zzf, zzajVarZza.zzg, zzajVarZza.zzh, zzajVarZza.zzi, zzajVarZza.zzj, zzajVarZza.zzk);
                        } else {
                            zzajVar = new com.google.android.gms.measurement.internal.zzaj(zzajVarZza.zza, zzajVarZza.zzb, zzajVarZza.zzc + 1, zzajVarZza.zzd + 1, zzajVarZza.zze, zzajVarZza.zzf, zzajVarZza.zzg, zzajVarZza.zzh, zzajVarZza.zzi, zzajVarZza.zzj, zzajVarZza.zzk);
                        }
                        zzajVar2 = zzajVar;
                    }
                    zzi().zza(zzajVar2);
                    long j = zzajVar2.zzc;
                    java.lang.String strZzc2 = zzcVarZza.zzc();
                    java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zzb>> mapZzf2 = (java.util.Map) arrayMap6.get(strZzc2);
                    if (mapZzf2 == null) {
                        mapZzf2 = zzi().zzf(this.zzb, strZzc2);
                        if (mapZzf2 == null) {
                            mapZzf2 = new androidx.collection.ArrayMap<>();
                        }
                        arrayMap6.put(strZzc2, mapZzf2);
                    }
                    java.util.Iterator<java.lang.Integer> it7 = mapZzf2.keySet().iterator();
                    while (it7.hasNext()) {
                        int iIntValue3 = it7.next().intValue();
                        if (this.zzc.contains(java.lang.Integer.valueOf(iIntValue3))) {
                            zzr().zzx().zza("Skipping failed audience ID", java.lang.Integer.valueOf(iIntValue3));
                        } else {
                            java.util.Iterator<com.google.android.gms.internal.measurement.zzbj.zzb> it8 = mapZzf2.get(java.lang.Integer.valueOf(iIntValue3)).iterator();
                            boolean zZza = true;
                            while (true) {
                                if (!it8.hasNext()) {
                                    zzsVar = zzsVar2;
                                    arrayMap = arrayMap6;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zzbj.zzb next2 = it8.next();
                                com.google.android.gms.measurement.internal.zzr zzrVar = new com.google.android.gms.measurement.internal.zzr(this, this.zzb, iIntValue3, next2);
                                zzsVar = zzsVar2;
                                zZza = zzrVar.zza(this.zze, this.zzf, zzcVarZza, j, zzajVar2, zza(iIntValue3, next2.zzb()));
                                arrayMap = arrayMap6;
                                if (zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbu) && !zZza) {
                                    this.zzc.add(java.lang.Integer.valueOf(iIntValue3));
                                    break;
                                }
                                zza(iIntValue3).zza(zzrVar);
                                zzsVar2 = zzsVar;
                                arrayMap6 = arrayMap;
                            }
                            if (!zZza) {
                                this.zzc.add(java.lang.Integer.valueOf(iIntValue3));
                            }
                            zzsVar2 = zzsVar;
                            arrayMap6 = arrayMap;
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!list2.isEmpty()) {
            androidx.collection.ArrayMap arrayMap7 = new androidx.collection.ArrayMap();
            for (com.google.android.gms.internal.measurement.zzbr.zzk zzkVar : list2) {
                arrayList.add(zzkVar.zzc());
                java.lang.String strZzc3 = zzkVar.zzc();
                java.util.Map<java.lang.Integer, java.util.List<com.google.android.gms.internal.measurement.zzbj.zze>> mapZzg2 = (java.util.Map) arrayMap7.get(strZzc3);
                if (mapZzg2 == null) {
                    mapZzg2 = zzi().zzg(this.zzb, strZzc3);
                    if (mapZzg2 == null) {
                        mapZzg2 = new androidx.collection.ArrayMap<>();
                    }
                    arrayMap7.put(strZzc3, mapZzg2);
                }
                java.util.Iterator<java.lang.Integer> it9 = mapZzg2.keySet().iterator();
                while (it9.hasNext()) {
                    int iIntValue4 = it9.next().intValue();
                    if (this.zzc.contains(java.lang.Integer.valueOf(iIntValue4))) {
                        zzr().zzx().zza("Skipping failed audience ID", java.lang.Integer.valueOf(iIntValue4));
                        break;
                    }
                    boolean zZza2 = true;
                    for (com.google.android.gms.internal.measurement.zzbj.zze zzeVar : mapZzg2.get(java.lang.Integer.valueOf(iIntValue4))) {
                        if (zzr().zza(2)) {
                            zzr().zzx().zza("Evaluating filter. audience, filter, property", java.lang.Integer.valueOf(iIntValue4), zzeVar.zza() ? java.lang.Integer.valueOf(zzeVar.zzb()) : null, zzo().zzc(zzeVar.zzc()));
                            zzr().zzx().zza("Filter definition", zzg().zza(zzeVar));
                        }
                        if (!zzeVar.zza() || zzeVar.zzb() > 256) {
                            zzr().zzi().zza("Invalid property filter ID. appId, id", com.google.android.gms.measurement.internal.zzfk.zza(this.zzb), java.lang.String.valueOf(zzeVar.zza() ? java.lang.Integer.valueOf(zzeVar.zzb()) : null));
                            zZza2 = false;
                            break;
                        }
                        com.google.android.gms.measurement.internal.zzt zztVar = new com.google.android.gms.measurement.internal.zzt(this, this.zzb, iIntValue4, zzeVar);
                        zZza2 = zztVar.zza(this.zze, this.zzf, zzkVar, zza(iIntValue4, zzeVar.zzb()));
                        if (zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbu) && !zZza2) {
                            this.zzc.add(java.lang.Integer.valueOf(iIntValue4));
                            break;
                        }
                        zza(iIntValue4).zza(zztVar);
                    }
                    if (!zZza2) {
                        this.zzc.add(java.lang.Integer.valueOf(iIntValue4));
                    }
                }
            }
        }
        boolean zZzd4 = zzt().zzd(this.zzb, com.google.android.gms.measurement.internal.zzap.zzbs);
        java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> arrayMap8 = new androidx.collection.ArrayMap<>();
        if (zZzd4) {
            arrayMap8 = zzi().zza(this.zzb, arrayList);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Set<java.lang.Integer> setKeySet = this.zzd.keySet();
        setKeySet.removeAll(this.zzc);
        java.util.Iterator<java.lang.Integer> it10 = setKeySet.iterator();
        while (it10.hasNext()) {
            int iIntValue5 = it10.next().intValue();
            com.google.android.gms.internal.measurement.zzbr.zza zzaVarZza = this.zzd.get(java.lang.Integer.valueOf(iIntValue5)).zza(iIntValue5, arrayMap8.get(java.lang.Integer.valueOf(iIntValue5)));
            arrayList2.add(zzaVarZza);
            com.google.android.gms.measurement.internal.zzac zzacVarZzi3 = zzi();
            java.lang.String str5 = this.zzb;
            com.google.android.gms.internal.measurement.zzbr.zzi zziVarZzc = zzaVarZza.zzc();
            zzacVarZzi3.zzak();
            zzacVarZzi3.zzd();
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str5);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zziVarZzc);
            byte[] bArrZzbi = zziVarZzc.zzbi();
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("app_id", str5);
            contentValues2.put("audience_id", java.lang.Integer.valueOf(iIntValue5));
            contentValues2.put("current_results", bArrZzbi);
            try {
                try {
                    if (zzacVarZzi3.c_().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                        zzacVarZzi3.zzr().zzf().zza("Failed to insert filter results (got -1). appId", com.google.android.gms.measurement.internal.zzfk.zza(str5));
                    }
                } catch (android.database.sqlite.SQLiteException e2) {
                    e = e2;
                    zzacVarZzi3.zzr().zzf().zza("Error storing filter results. appId", com.google.android.gms.measurement.internal.zzfk.zza(str5), e);
                }
            } catch (android.database.sqlite.SQLiteException e3) {
                e = e3;
            }
        }
        return arrayList2;
    }

    private final com.google.android.gms.measurement.internal.zzp zza(int i) {
        if (this.zzd.containsKey(java.lang.Integer.valueOf(i))) {
            return this.zzd.get(java.lang.Integer.valueOf(i));
        }
        com.google.android.gms.measurement.internal.zzp zzpVar = new com.google.android.gms.measurement.internal.zzp(this, this.zzb, null);
        this.zzd.put(java.lang.Integer.valueOf(i), zzpVar);
        return zzpVar;
    }

    private final boolean zza(int i, int i2) {
        if (this.zzd.get(java.lang.Integer.valueOf(i)) == null) {
            return false;
        }
        return this.zzd.get(java.lang.Integer.valueOf(i)).zzd.get(i2);
    }
}
