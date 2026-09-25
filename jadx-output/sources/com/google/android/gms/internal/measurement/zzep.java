package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzep implements com.google.android.gms.internal.measurement.zzis {
    private final com.google.android.gms.internal.measurement.zzen zza;

    public static com.google.android.gms.internal.measurement.zzep zza(com.google.android.gms.internal.measurement.zzen zzenVar) {
        return zzenVar.zza != null ? zzenVar.zza : new com.google.android.gms.internal.measurement.zzep(zzenVar);
    }

    private zzep(com.google.android.gms.internal.measurement.zzen zzenVar) {
        com.google.android.gms.internal.measurement.zzen zzenVar2 = (com.google.android.gms.internal.measurement.zzen) com.google.android.gms.internal.measurement.zzff.zza(zzenVar, "output");
        this.zza = zzenVar2;
        zzenVar2.zza = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final int zza() {
        return com.google.android.gms.internal.measurement.zzfd.zze.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, int i2) throws java.io.IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, long j) throws java.io.IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i, long j) throws java.io.IOException {
        this.zza.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, float f) throws java.io.IOException {
        this.zza.zza(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, double d) throws java.io.IOException {
        this.zza.zza(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i, int i2) throws java.io.IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzc(int i, int i2) throws java.io.IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzd(int i, long j) throws java.io.IOException {
        this.zza.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzd(int i, int i2) throws java.io.IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, boolean z) throws java.io.IOException {
        this.zza.zza(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, java.lang.String str) throws java.io.IOException {
        this.zza.zza(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, com.google.android.gms.internal.measurement.zzdu zzduVar) throws java.io.IOException {
        this.zza.zza(i, zzduVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zze(int i, int i2) throws java.io.IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzf(int i, int i2) throws java.io.IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zze(int i, long j) throws java.io.IOException {
        this.zza.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
        this.zza.zza(i, (com.google.android.gms.internal.measurement.zzgo) obj, zzhdVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzen zzenVar = this.zza;
        zzenVar.zza(i, 3);
        zzhdVar.zza((com.google.android.gms.internal.measurement.zzgo) obj, zzenVar.zza);
        zzenVar.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i) throws java.io.IOException {
        this.zza.zza(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i) throws java.io.IOException {
        this.zza.zza(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.measurement.zzdu) {
            this.zza.zzb(i, (com.google.android.gms.internal.measurement.zzdu) obj);
        } else {
            this.zza.zza(i, (com.google.android.gms.internal.measurement.zzgo) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzf = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzf += com.google.android.gms.internal.measurement.zzen.zzf(list.get(i3).intValue());
            }
            this.zza.zzb(iZzf);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzi = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzi += com.google.android.gms.internal.measurement.zzen.zzi(list.get(i3).intValue());
            }
            this.zza.zzb(iZzi);
            while (i2 < list.size()) {
                this.zza.zzd(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzc(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzd += com.google.android.gms.internal.measurement.zzen.zzd(list.get(i3).longValue());
            }
            this.zza.zzb(iZzd);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzd(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZze = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZze += com.google.android.gms.internal.measurement.zzen.zze(list.get(i3).longValue());
            }
            this.zza.zzb(iZze);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zze(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzg = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzg += com.google.android.gms.internal.measurement.zzen.zzg(list.get(i3).longValue());
            }
            this.zza.zzb(iZzg);
            while (i2 < list.size()) {
                this.zza.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzf(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.measurement.zzen.zzb(list.get(i3).floatValue());
            }
            this.zza.zzb(iZzb);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzg(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.measurement.zzen.zzb(list.get(i3).doubleValue());
            }
            this.zza.zzb(iZzb);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzh(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzk = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzk += com.google.android.gms.internal.measurement.zzen.zzk(list.get(i3).intValue());
            }
            this.zza.zzb(iZzk);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzi(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.measurement.zzen.zzb(list.get(i3).booleanValue());
            }
            this.zza.zzb(iZzb);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof com.google.android.gms.internal.measurement.zzfv) {
            com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) list;
            while (i2 < list.size()) {
                java.lang.Object objZzb = zzfvVar.zzb(i2);
                if (objZzb instanceof java.lang.String) {
                    this.zza.zza(i, (java.lang.String) objZzb);
                } else {
                    this.zza.zza(i, (com.google.android.gms.internal.measurement.zzdu) objZzb);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i, java.util.List<com.google.android.gms.internal.measurement.zzdu> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzj(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzg = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzg += com.google.android.gms.internal.measurement.zzen.zzg(list.get(i3).intValue());
            }
            this.zza.zzb(iZzg);
            while (i2 < list.size()) {
                this.zza.zzb(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzk(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzj = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzj += com.google.android.gms.internal.measurement.zzen.zzj(list.get(i3).intValue());
            }
            this.zza.zzb(iZzj);
            while (i2 < list.size()) {
                this.zza.zzd(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzl(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzh = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzh += com.google.android.gms.internal.measurement.zzen.zzh(list.get(i3).longValue());
            }
            this.zza.zzb(iZzh);
            while (i2 < list.size()) {
                this.zza.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzm(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzh = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzh += com.google.android.gms.internal.measurement.zzen.zzh(list.get(i3).intValue());
            }
            this.zza.zzb(iZzh);
            while (i2 < list.size()) {
                this.zza.zzc(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzn(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int iZzf = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzf += com.google.android.gms.internal.measurement.zzen.zzf(list.get(i3).longValue());
            }
            this.zza.zzb(iZzf);
            while (i2 < list.size()) {
                this.zza.zzb(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zza(int i, java.util.List<?> list, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzhdVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.measurement.zzhd zzhdVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzhdVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzis
    public final <K, V> void zza(int i, com.google.android.gms.internal.measurement.zzgf<K, V> zzgfVar, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zza(i, 2);
            this.zza.zzb(com.google.android.gms.internal.measurement.zzgg.zza(zzgfVar, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.measurement.zzgg.zza(this.zza, zzgfVar, entry.getKey(), entry.getValue());
        }
    }
}
