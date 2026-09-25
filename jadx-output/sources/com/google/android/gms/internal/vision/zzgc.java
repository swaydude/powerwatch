package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzgc implements com.google.android.gms.internal.vision.zzkg {
    private final com.google.android.gms.internal.vision.zzga zzsd;

    public static com.google.android.gms.internal.vision.zzgc zza(com.google.android.gms.internal.vision.zzga zzgaVar) {
        return zzgaVar.zzss != null ? zzgaVar.zzss : new com.google.android.gms.internal.vision.zzgc(zzgaVar);
    }

    private zzgc(com.google.android.gms.internal.vision.zzga zzgaVar) {
        com.google.android.gms.internal.vision.zzga zzgaVar2 = (com.google.android.gms.internal.vision.zzga) com.google.android.gms.internal.vision.zzgt.zza(zzgaVar, "output");
        this.zzsd = zzgaVar2;
        zzgaVar2.zzss = this;
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final int zzfj() {
        return com.google.android.gms.internal.vision.zzgs.zzf.zzww;
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzr(int i, int i2) throws java.io.IOException {
        this.zzsd.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzi(int i, long j) throws java.io.IOException {
        this.zzsd.zza(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zzsd.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, float f) throws java.io.IOException {
        this.zzsd.zza(i, f);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, double d) throws java.io.IOException {
        this.zzsd.zza(i, d);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzs(int i, int i2) throws java.io.IOException {
        this.zzsd.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, long j) throws java.io.IOException {
        this.zzsd.zza(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzh(int i, int i2) throws java.io.IOException {
        this.zzsd.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zzsd.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzk(int i, int i2) throws java.io.IOException {
        this.zzsd.zzk(i, i2);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, boolean z) throws java.io.IOException {
        this.zzsd.zza(i, z);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, java.lang.String str) throws java.io.IOException {
        this.zzsd.zza(i, str);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, com.google.android.gms.internal.vision.zzfh zzfhVar) throws java.io.IOException {
        this.zzsd.zza(i, zzfhVar);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzi(int i, int i2) throws java.io.IOException {
        this.zzsd.zzi(i, i2);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzj(int i, int i2) throws java.io.IOException {
        this.zzsd.zzj(i, i2);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzb(int i, long j) throws java.io.IOException {
        this.zzsd.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, java.lang.Object obj, com.google.android.gms.internal.vision.zzir zzirVar) throws java.io.IOException {
        this.zzsd.zza(i, (com.google.android.gms.internal.vision.zzic) obj, zzirVar);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.vision.zzir zzirVar) throws java.io.IOException {
        com.google.android.gms.internal.vision.zzga zzgaVar = this.zzsd;
        zzgaVar.zzg(i, 3);
        zzirVar.zza((com.google.android.gms.internal.vision.zzic) obj, zzgaVar.zzss);
        zzgaVar.zzg(i, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzbj(int i) throws java.io.IOException {
        this.zzsd.zzg(i, 3);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzbk(int i) throws java.io.IOException {
        this.zzsd.zzg(i, 4);
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.vision.zzfh) {
            this.zzsd.zzb(i, (com.google.android.gms.internal.vision.zzfh) obj);
        } else {
            this.zzsd.zza(i, (com.google.android.gms.internal.vision.zzic) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzbb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzbb += com.google.android.gms.internal.vision.zzga.zzbb(list.get(i3).intValue());
            }
            this.zzsd.zzax(iZzbb);
            while (i2 < list.size()) {
                this.zzsd.zzaw(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzh(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzb(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzbe = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzbe += com.google.android.gms.internal.vision.zzga.zzbe(list.get(i3).intValue());
            }
            this.zzsd.zzax(iZzbe);
            while (i2 < list.size()) {
                this.zzsd.zzaz(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzk(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzc(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzv = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzv += com.google.android.gms.internal.vision.zzga.zzv(list.get(i3).longValue());
            }
            this.zzsd.zzax(iZzv);
            while (i2 < list.size()) {
                this.zzsd.zzs(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzd(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzw = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzw += com.google.android.gms.internal.vision.zzga.zzw(list.get(i3).longValue());
            }
            this.zzsd.zzax(iZzw);
            while (i2 < list.size()) {
                this.zzsd.zzs(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zze(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzy = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzy += com.google.android.gms.internal.vision.zzga.zzy(list.get(i3).longValue());
            }
            this.zzsd.zzax(iZzy);
            while (i2 < list.size()) {
                this.zzsd.zzu(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzf(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzt = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzt += com.google.android.gms.internal.vision.zzga.zzt(list.get(i3).floatValue());
            }
            this.zzsd.zzax(iZzt);
            while (i2 < list.size()) {
                this.zzsd.zzs(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzg(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzb += com.google.android.gms.internal.vision.zzga.zzb(list.get(i3).doubleValue());
            }
            this.zzsd.zzax(iZzb);
            while (i2 < list.size()) {
                this.zzsd.zza(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzh(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzbg = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzbg += com.google.android.gms.internal.vision.zzga.zzbg(list.get(i3).intValue());
            }
            this.zzsd.zzax(iZzbg);
            while (i2 < list.size()) {
                this.zzsd.zzaw(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzh(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzi(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzl = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzl += com.google.android.gms.internal.vision.zzga.zzl(list.get(i3).booleanValue());
            }
            this.zzsd.zzax(iZzl);
            while (i2 < list.size()) {
                this.zzsd.zzk(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zza(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (list instanceof com.google.android.gms.internal.vision.zzhj) {
            com.google.android.gms.internal.vision.zzhj zzhjVar = (com.google.android.gms.internal.vision.zzhj) list;
            while (i2 < list.size()) {
                java.lang.Object raw = zzhjVar.getRaw(i2);
                if (raw instanceof java.lang.String) {
                    this.zzsd.zza(i, (java.lang.String) raw);
                } else {
                    this.zzsd.zza(i, (com.google.android.gms.internal.vision.zzfh) raw);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzb(int i, java.util.List<com.google.android.gms.internal.vision.zzfh> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzsd.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzj(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzbc = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzbc += com.google.android.gms.internal.vision.zzga.zzbc(list.get(i3).intValue());
            }
            this.zzsd.zzax(iZzbc);
            while (i2 < list.size()) {
                this.zzsd.zzax(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzi(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzk(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzbf = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzbf += com.google.android.gms.internal.vision.zzga.zzbf(list.get(i3).intValue());
            }
            this.zzsd.zzax(iZzbf);
            while (i2 < list.size()) {
                this.zzsd.zzaz(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzk(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzl(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzz = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzz += com.google.android.gms.internal.vision.zzga.zzz(list.get(i3).longValue());
            }
            this.zzsd.zzax(iZzz);
            while (i2 < list.size()) {
                this.zzsd.zzu(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzm(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzbd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzbd += com.google.android.gms.internal.vision.zzga.zzbd(list.get(i3).intValue());
            }
            this.zzsd.zzax(iZzbd);
            while (i2 < list.size()) {
                this.zzsd.zzay(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzj(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzn(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (z) {
            this.zzsd.zzg(i, 2);
            int iZzx = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzx += com.google.android.gms.internal.vision.zzga.zzx(list.get(i3).longValue());
            }
            this.zzsd.zzax(iZzx);
            while (i2 < list.size()) {
                this.zzsd.zzt(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zzsd.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zza(int i, java.util.List<?> list, com.google.android.gms.internal.vision.zzir zzirVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.vision.zzir zzirVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzkg
    public final <K, V> void zza(int i, com.google.android.gms.internal.vision.zzht<K, V> zzhtVar, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.zzsd.zzg(i, 2);
            this.zzsd.zzax(com.google.android.gms.internal.vision.zzhu.zza(zzhtVar, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.vision.zzhu.zza(this.zzsd, zzhtVar, entry.getKey(), entry.getValue());
        }
    }
}
