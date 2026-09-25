package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfv implements com.google.android.gms.internal.fitness.zzjo {
    private final com.google.android.gms.internal.fitness.zzfs zzro;

    public static com.google.android.gms.internal.fitness.zzfv zza(com.google.android.gms.internal.fitness.zzfs zzfsVar) {
        return zzfsVar.zzru != null ? zzfsVar.zzru : new com.google.android.gms.internal.fitness.zzfv(zzfsVar);
    }

    private zzfv(com.google.android.gms.internal.fitness.zzfs zzfsVar) {
        com.google.android.gms.internal.fitness.zzfs zzfsVar2 = (com.google.android.gms.internal.fitness.zzfs) com.google.android.gms.internal.fitness.zzgk.zza(zzfsVar, "output");
        this.zzro = zzfsVar2;
        zzfsVar2.zzru = this;
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final int zzay() {
        return com.google.android.gms.internal.fitness.zzgg.zze.zzvw;
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzm(int i, int i2) throws java.io.IOException {
        this.zzro.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzi(int i, long j) throws java.io.IOException {
        this.zzro.zza(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zzro.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, float f) throws java.io.IOException {
        this.zzro.zza(i, f);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, double d) throws java.io.IOException {
        this.zzro.zza(i, d);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzn(int i, int i2) throws java.io.IOException {
        this.zzro.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, long j) throws java.io.IOException {
        this.zzro.zza(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzc(int i, int i2) throws java.io.IOException {
        this.zzro.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zzro.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzf(int i, int i2) throws java.io.IOException {
        this.zzro.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, boolean z) throws java.io.IOException {
        this.zzro.zza(i, z);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, java.lang.String str) throws java.io.IOException {
        this.zzro.zza(i, str);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, com.google.android.gms.internal.fitness.zzff zzffVar) throws java.io.IOException {
        this.zzro.zza(i, zzffVar);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzd(int i, int i2) throws java.io.IOException {
        this.zzro.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zze(int i, int i2) throws java.io.IOException {
        this.zzro.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzb(int i, long j) throws java.io.IOException {
        this.zzro.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, java.lang.Object obj, com.google.android.gms.internal.fitness.zzic zzicVar) throws java.io.IOException {
        this.zzro.zza(i, (com.google.android.gms.internal.fitness.zzho) obj, zzicVar);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.fitness.zzic zzicVar) throws java.io.IOException {
        com.google.android.gms.internal.fitness.zzfs zzfsVar = this.zzro;
        zzfsVar.zzb(i, 3);
        zzicVar.zza((com.google.android.gms.internal.fitness.zzho) obj, zzfsVar.zzru);
        zzfsVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzy(int i) throws java.io.IOException {
        this.zzro.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzz(int i) throws java.io.IOException {
        this.zzro.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.fitness.zzff) {
            this.zzro.zzb(i, (com.google.android.gms.internal.fitness.zzff) obj);
        } else {
            this.zzro.zza(i, (com.google.android.gms.internal.fitness.zzho) obj);
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzq = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzq += com.google.android.gms.internal.fitness.zzfs.zzq(list.get(i3).intValue());
            }
            this.zzro.zzm(iZzq);
            while (i2 < list.size()) {
                this.zzro.zzl(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzb(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzt = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzt += com.google.android.gms.internal.fitness.zzfs.zzt(list.get(i3).intValue());
            }
            this.zzro.zzm(iZzt);
            while (i2 < list.size()) {
                this.zzro.zzo(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzc(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzd += com.google.android.gms.internal.fitness.zzfs.zzd(list.get(i3).longValue());
            }
            this.zzro.zzm(iZzd);
            while (i2 < list.size()) {
                this.zzro.zza(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzd(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZze = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZze += com.google.android.gms.internal.fitness.zzfs.zze(list.get(i3).longValue());
            }
            this.zzro.zzm(iZze);
            while (i2 < list.size()) {
                this.zzro.zza(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zze(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzg = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzg += com.google.android.gms.internal.fitness.zzfs.zzg(list.get(i3).longValue());
            }
            this.zzro.zzm(iZzg);
            while (i2 < list.size()) {
                this.zzro.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzf(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzc = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzc += com.google.android.gms.internal.fitness.zzfs.zzc(list.get(i3).floatValue());
            }
            this.zzro.zzm(iZzc);
            while (i2 < list.size()) {
                this.zzro.zzb(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzg(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzc = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzc += com.google.android.gms.internal.fitness.zzfs.zzc(list.get(i3).doubleValue());
            }
            this.zzro.zzm(iZzc);
            while (i2 < list.size()) {
                this.zzro.zzb(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzh(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzv = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzv += com.google.android.gms.internal.fitness.zzfs.zzv(list.get(i3).intValue());
            }
            this.zzro.zzm(iZzv);
            while (i2 < list.size()) {
                this.zzro.zzl(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzi(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.fitness.zzfs.zzb(list.get(i3).booleanValue());
            }
            this.zzro.zzm(iZzb);
            while (i2 < list.size()) {
                this.zzro.zza(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zza(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof com.google.android.gms.internal.fitness.zzgv) {
            com.google.android.gms.internal.fitness.zzgv zzgvVar = (com.google.android.gms.internal.fitness.zzgv) list;
            while (i2 < list.size()) {
                java.lang.Object objZzad = zzgvVar.zzad(i2);
                if (objZzad instanceof java.lang.String) {
                    this.zzro.zza(i, (java.lang.String) objZzad);
                } else {
                    this.zzro.zza(i, (com.google.android.gms.internal.fitness.zzff) objZzad);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzb(int i, java.util.List<com.google.android.gms.internal.fitness.zzff> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzro.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzj(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzr = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzr += com.google.android.gms.internal.fitness.zzfs.zzr(list.get(i3).intValue());
            }
            this.zzro.zzm(iZzr);
            while (i2 < list.size()) {
                this.zzro.zzm(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzd(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzk(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzu = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzu += com.google.android.gms.internal.fitness.zzfs.zzu(list.get(i3).intValue());
            }
            this.zzro.zzm(iZzu);
            while (i2 < list.size()) {
                this.zzro.zzo(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzl(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzh = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzh += com.google.android.gms.internal.fitness.zzfs.zzh(list.get(i3).longValue());
            }
            this.zzro.zzm(iZzh);
            while (i2 < list.size()) {
                this.zzro.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzm(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzs = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzs += com.google.android.gms.internal.fitness.zzfs.zzs(list.get(i3).intValue());
            }
            this.zzro.zzm(iZzs);
            while (i2 < list.size()) {
                this.zzro.zzn(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzn(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzro.zzb(i, 2);
            int iZzf = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzf += com.google.android.gms.internal.fitness.zzfs.zzf(list.get(i3).longValue());
            }
            this.zzro.zzm(iZzf);
            while (i2 < list.size()) {
                this.zzro.zzb(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzro.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zza(int i, java.util.List<?> list, com.google.android.gms.internal.fitness.zzic zzicVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzicVar);
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.fitness.zzic zzicVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzicVar);
        }
    }

    @Override // com.google.android.gms.internal.fitness.zzjo
    public final <K, V> void zza(int i, com.google.android.gms.internal.fitness.zzhf<K, V> zzhfVar, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.zzro.zzb(i, 2);
            this.zzro.zzm(com.google.android.gms.internal.fitness.zzgb.zza(zzhfVar.zzxh, 1, entry.getKey()) + com.google.android.gms.internal.fitness.zzgb.zza(zzhfVar.zzxi, 2, entry.getValue()));
            com.google.android.gms.internal.fitness.zzfs zzfsVar = this.zzro;
            K key = entry.getKey();
            V value = entry.getValue();
            com.google.android.gms.internal.fitness.zzgb.zza(zzfsVar, zzhfVar.zzxh, 1, key);
            com.google.android.gms.internal.fitness.zzgb.zza(zzfsVar, zzhfVar.zzxi, 2, value);
        }
    }
}
