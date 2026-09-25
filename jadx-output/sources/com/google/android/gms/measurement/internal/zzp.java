package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzp {
    private java.lang.String zza;
    private boolean zzb;
    private com.google.android.gms.internal.measurement.zzbr.zzi zzc;
    private java.util.BitSet zzd;
    private java.util.BitSet zze;
    private java.util.Map<java.lang.Integer, java.lang.Long> zzf;
    private java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> zzg;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzn zzh;

    private zzp(com.google.android.gms.measurement.internal.zzn zznVar, java.lang.String str) {
        this.zzh = zznVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new java.util.BitSet();
        this.zze = new java.util.BitSet();
        this.zzf = new androidx.collection.ArrayMap();
        this.zzg = new androidx.collection.ArrayMap();
    }

    private zzp(com.google.android.gms.measurement.internal.zzn zznVar, java.lang.String str, com.google.android.gms.internal.measurement.zzbr.zzi zziVar, java.util.BitSet bitSet, java.util.BitSet bitSet2, java.util.Map<java.lang.Integer, java.lang.Long> map, java.util.Map<java.lang.Integer, java.lang.Long> map2) {
        this.zzh = zznVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new androidx.collection.ArrayMap();
        if (map2 != null) {
            for (java.lang.Integer num : map2.keySet()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zziVar;
    }

    final void zza(com.google.android.gms.measurement.internal.zzu zzuVar) {
        int iZza = zzuVar.zza();
        if (zzuVar.zzc != null) {
            this.zze.set(iZza, zzuVar.zzc.booleanValue());
        }
        if (zzuVar.zzd != null) {
            this.zzd.set(iZza, zzuVar.zzd.booleanValue());
        }
        if (zzuVar.zze != null) {
            java.lang.Long l = this.zzf.get(java.lang.Integer.valueOf(iZza));
            long jLongValue = zzuVar.zze.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.zzf.put(java.lang.Integer.valueOf(iZza), java.lang.Long.valueOf(jLongValue));
            }
        }
        if (zzuVar.zzf != null) {
            java.util.List<java.lang.Long> arrayList = this.zzg.get(java.lang.Integer.valueOf(iZza));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                this.zzg.put(java.lang.Integer.valueOf(iZza), arrayList);
            }
            if (com.google.android.gms.internal.measurement.zzmv.zzb() && this.zzh.zzt().zzd(this.zza, com.google.android.gms.measurement.internal.zzap.zzbt) && zzuVar.zzb()) {
                arrayList.clear();
            }
            if (com.google.android.gms.internal.measurement.zzkb.zzb() && this.zzh.zzt().zzd(this.zza, com.google.android.gms.measurement.internal.zzap.zzbx) && zzuVar.zzc()) {
                arrayList.clear();
            }
            if (com.google.android.gms.internal.measurement.zzkb.zzb() && this.zzh.zzt().zzd(this.zza, com.google.android.gms.measurement.internal.zzap.zzbx)) {
                long jLongValue2 = zzuVar.zzf.longValue() / 1000;
                if (arrayList.contains(java.lang.Long.valueOf(jLongValue2))) {
                    return;
                }
                arrayList.add(java.lang.Long.valueOf(jLongValue2));
                return;
            }
            arrayList.add(java.lang.Long.valueOf(zzuVar.zzf.longValue() / 1000));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.measurement.zzbr$zza$zza, com.google.android.gms.internal.measurement.zzfd$zzb] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.gms.internal.measurement.zzbr$zzi$zza] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
    final com.google.android.gms.internal.measurement.zzbr.zza zza(int i, java.util.List<java.lang.Integer> list) {
        java.util.ArrayList arrayList;
        ?? arrayList2;
        ?? r4;
        ?? Zzh = com.google.android.gms.internal.measurement.zzbr.zza.zzh();
        Zzh.zza(i);
        Zzh.zza(this.zzb);
        com.google.android.gms.internal.measurement.zzbr.zzi zziVar = this.zzc;
        if (zziVar != null) {
            Zzh.zza(zziVar);
        }
        ?? Zza = com.google.android.gms.internal.measurement.zzbr.zzi.zzi().zzb(com.google.android.gms.measurement.internal.zzkw.zza(this.zzd)).zza(com.google.android.gms.measurement.internal.zzkw.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(this.zzf.size());
            java.util.Iterator<java.lang.Integer> it = this.zzf.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                arrayList.add((com.google.android.gms.internal.measurement.zzbr.zzb) ((com.google.android.gms.internal.measurement.zzfd) com.google.android.gms.internal.measurement.zzbr.zzb.zze().zza(iIntValue).zza(this.zzf.get(java.lang.Integer.valueOf(iIntValue)).longValue()).zzu()));
            }
        }
        Zza.zzc(arrayList);
        if (this.zzg == null) {
            arrayList2 = java.util.Collections.emptyList();
        } else {
            arrayList2 = new java.util.ArrayList(this.zzg.size());
            for (java.lang.Integer num : this.zzg.keySet()) {
                com.google.android.gms.internal.measurement.zzbr.zzj.zza zzaVarZza = com.google.android.gms.internal.measurement.zzbr.zzj.zze().zza(num.intValue());
                java.util.List<java.lang.Long> list2 = this.zzg.get(num);
                if (list2 != null) {
                    java.util.Collections.sort(list2);
                    zzaVarZza.zza(list2);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.zzbr.zzj) ((com.google.android.gms.internal.measurement.zzfd) zzaVarZza.zzu()));
            }
        }
        if (!com.google.android.gms.internal.measurement.zzmv.zzb() || !this.zzh.zzt().zzd(this.zza, com.google.android.gms.measurement.internal.zzap.zzbt)) {
            r4 = arrayList2;
            r4 = arrayList2;
            if (Zzh.zza()) {
                java.util.List<com.google.android.gms.internal.measurement.zzbr.zzj> listZzg = Zzh.zzb().zzg();
                if (!listZzg.isEmpty()) {
                    r4 = arrayList2;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList((java.util.Collection) arrayList2);
                    androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                    for (com.google.android.gms.internal.measurement.zzbr.zzj zzjVar : listZzg) {
                        if (zzjVar.zza() && zzjVar.zzd() > 0) {
                            arrayMap.put(java.lang.Integer.valueOf(zzjVar.zzb()), java.lang.Long.valueOf(zzjVar.zza(zzjVar.zzd() - 1)));
                        }
                    }
                    for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                        com.google.android.gms.internal.measurement.zzbr.zzj zzjVar2 = (com.google.android.gms.internal.measurement.zzbr.zzj) arrayList3.get(i2);
                        java.lang.Long l = (java.lang.Long) arrayMap.remove(zzjVar2.zza() ? java.lang.Integer.valueOf(zzjVar2.zzb()) : null);
                        if (l != null && (list == null || !list.contains(java.lang.Integer.valueOf(zzjVar2.zzb())))) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            if (l.longValue() < zzjVar2.zza(0)) {
                                arrayList4.add(l);
                            }
                            arrayList4.addAll(zzjVar2.zzc());
                            arrayList3.set(i2, (com.google.android.gms.internal.measurement.zzbr.zzj) ((com.google.android.gms.internal.measurement.zzfd) zzjVar2.zzbm().zza().zza(arrayList4).zzu()));
                        }
                    }
                    for (java.lang.Integer num2 : arrayMap.keySet()) {
                        arrayList3.add((com.google.android.gms.internal.measurement.zzbr.zzj) ((com.google.android.gms.internal.measurement.zzfd) com.google.android.gms.internal.measurement.zzbr.zzj.zze().zza(num2.intValue()).zza(((java.lang.Long) arrayMap.get(num2)).longValue()).zzu()));
                    }
                    r4 = arrayList3;
                }
            }
        }
        r4 = arrayList2;
        r4 = arrayList2;
        Zza.zzd(r4);
        Zzh.zza(Zza);
        return (com.google.android.gms.internal.measurement.zzbr.zza) ((com.google.android.gms.internal.measurement.zzfd) Zzh.zzu());
    }

    /* synthetic */ zzp(com.google.android.gms.measurement.internal.zzn zznVar, java.lang.String str, com.google.android.gms.internal.measurement.zzbr.zzi zziVar, java.util.BitSet bitSet, java.util.BitSet bitSet2, java.util.Map map, java.util.Map map2, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this(zznVar, str, zziVar, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ zzp(com.google.android.gms.measurement.internal.zzn zznVar, java.lang.String str, com.google.android.gms.measurement.internal.zzq zzqVar) {
        this(zznVar, str);
    }
}
