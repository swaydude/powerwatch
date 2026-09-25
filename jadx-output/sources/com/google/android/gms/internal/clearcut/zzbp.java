package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
final class zzbp implements com.google.android.gms.internal.clearcut.zzfr {
    private final com.google.android.gms.internal.clearcut.zzbn zzfo;

    private zzbp(com.google.android.gms.internal.clearcut.zzbn zzbnVar) {
        com.google.android.gms.internal.clearcut.zzbn zzbnVar2 = (com.google.android.gms.internal.clearcut.zzbn) com.google.android.gms.internal.clearcut.zzci.zza(zzbnVar, "output");
        this.zzfo = zzbnVar2;
        zzbnVar2.zzfz = this;
    }

    public static com.google.android.gms.internal.clearcut.zzbp zza(com.google.android.gms.internal.clearcut.zzbn zzbnVar) {
        return zzbnVar.zzfz != null ? zzbnVar.zzfz : new com.google.android.gms.internal.clearcut.zzbp(zzbnVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, double d) throws java.io.IOException {
        this.zzfo.zza(i, d);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, float f) throws java.io.IOException {
        this.zzfo.zza(i, f);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, long j) throws java.io.IOException {
        this.zzfo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, com.google.android.gms.internal.clearcut.zzbb zzbbVar) throws java.io.IOException {
        this.zzfo.zza(i, zzbbVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final <K, V> void zza(int i, com.google.android.gms.internal.clearcut.zzdh<K, V> zzdhVar, java.util.Map<K, V> map) throws java.io.IOException {
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            this.zzfo.zzb(i, 2);
            this.zzfo.zzo(com.google.android.gms.internal.clearcut.zzdg.zza(zzdhVar, entry.getKey(), entry.getValue()));
            com.google.android.gms.internal.clearcut.zzdg.zza(this.zzfo, zzdhVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, java.lang.Object obj) throws java.io.IOException {
        if (obj instanceof com.google.android.gms.internal.clearcut.zzbb) {
            this.zzfo.zzb(i, (com.google.android.gms.internal.clearcut.zzbb) obj);
        } else {
            this.zzfo.zzb(i, (com.google.android.gms.internal.clearcut.zzdo) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
        this.zzfo.zza(i, (com.google.android.gms.internal.clearcut.zzdo) obj, zzefVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, java.lang.String str) throws java.io.IOException {
        this.zzfo.zza(i, str);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, java.util.List<java.lang.String> list) throws java.io.IOException {
        int i2 = 0;
        if (!(list instanceof com.google.android.gms.internal.clearcut.zzcx)) {
            while (i2 < list.size()) {
                this.zzfo.zza(i, list.get(i2));
                i2++;
            }
            return;
        }
        com.google.android.gms.internal.clearcut.zzcx zzcxVar = (com.google.android.gms.internal.clearcut.zzcx) list;
        while (i2 < list.size()) {
            java.lang.Object raw = zzcxVar.getRaw(i2);
            if (raw instanceof java.lang.String) {
                this.zzfo.zza(i, (java.lang.String) raw);
            } else {
                this.zzfo.zza(i, (com.google.android.gms.internal.clearcut.zzbb) raw);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, java.util.List<?> list, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzefVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zza(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzc(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzs = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzs += com.google.android.gms.internal.clearcut.zzbn.zzs(list.get(i3).intValue());
        }
        this.zzfo.zzo(iZzs);
        while (i2 < list.size()) {
            this.zzfo.zzn(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzaa(int i) throws java.io.IOException {
        this.zzfo.zzb(i, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzab(int i) throws java.io.IOException {
        this.zzfo.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final int zzaj() {
        return com.google.android.gms.internal.clearcut.zzcg.zzg.zzko;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, long j) throws java.io.IOException {
        this.zzfo.zzb(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
        com.google.android.gms.internal.clearcut.zzbn zzbnVar = this.zzfo;
        zzbnVar.zzb(i, 3);
        zzefVar.zza((com.google.android.gms.internal.clearcut.zzdo) obj, zzbnVar.zzfz);
        zzbnVar.zzb(i, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, java.util.List<com.google.android.gms.internal.clearcut.zzbb> list) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zzfo.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, java.util.List<?> list, com.google.android.gms.internal.clearcut.zzef zzefVar) throws java.io.IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzefVar);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzv = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzv += com.google.android.gms.internal.clearcut.zzbn.zzv(list.get(i3).intValue());
        }
        this.zzfo.zzo(iZzv);
        while (i2 < list.size()) {
            this.zzfo.zzq(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzb(int i, boolean z) throws java.io.IOException {
        this.zzfo.zzb(i, z);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, int i2) throws java.io.IOException {
        this.zzfo.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, long j) throws java.io.IOException {
        this.zzfo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzc(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZze = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZze += com.google.android.gms.internal.clearcut.zzbn.zze(list.get(i3).longValue());
        }
        this.zzfo.zzo(iZze);
        while (i2 < list.size()) {
            this.zzfo.zzb(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i, int i2) throws java.io.IOException {
        this.zzfo.zzd(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzd(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zza(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzf = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzf += com.google.android.gms.internal.clearcut.zzbn.zzf(list.get(i3).longValue());
        }
        this.zzfo.zzo(iZzf);
        while (i2 < list.size()) {
            this.zzfo.zzb(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i, int i2) throws java.io.IOException {
        this.zzfo.zze(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zze(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzc(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzh = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzh += com.google.android.gms.internal.clearcut.zzbn.zzh(list.get(i3).longValue());
        }
        this.zzfo.zzo(iZzh);
        while (i2 < list.size()) {
            this.zzfo.zzd(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i, int i2) throws java.io.IOException {
        this.zzfo.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzf(int i, java.util.List<java.lang.Float> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zza(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzb = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzb += com.google.android.gms.internal.clearcut.zzbn.zzb(list.get(i3).floatValue());
        }
        this.zzfo.zzo(iZzb);
        while (i2 < list.size()) {
            this.zzfo.zza(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzg(int i, java.util.List<java.lang.Double> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zza(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzb = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzb += com.google.android.gms.internal.clearcut.zzbn.zzb(list.get(i3).doubleValue());
        }
        this.zzfo.zzo(iZzb);
        while (i2 < list.size()) {
            this.zzfo.zza(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzh(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzc(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzx = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzx += com.google.android.gms.internal.clearcut.zzbn.zzx(list.get(i3).intValue());
        }
        this.zzfo.zzo(iZzx);
        while (i2 < list.size()) {
            this.zzfo.zzn(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i, long j) throws java.io.IOException {
        this.zzfo.zza(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzi(int i, java.util.List<java.lang.Boolean> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzb(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzb = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzb += com.google.android.gms.internal.clearcut.zzbn.zzb(list.get(i3).booleanValue());
        }
        this.zzfo.zzo(iZzb);
        while (i2 < list.size()) {
            this.zzfo.zza(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i, long j) throws java.io.IOException {
        this.zzfo.zzc(i, j);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzj(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzd(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzt = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzt += com.google.android.gms.internal.clearcut.zzbn.zzt(list.get(i3).intValue());
        }
        this.zzfo.zzo(iZzt);
        while (i2 < list.size()) {
            this.zzfo.zzo(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzk(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzw = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzw += com.google.android.gms.internal.clearcut.zzbn.zzw(list.get(i3).intValue());
        }
        this.zzfo.zzo(iZzw);
        while (i2 < list.size()) {
            this.zzfo.zzq(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzl(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzc(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzi = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzi += com.google.android.gms.internal.clearcut.zzbn.zzi(list.get(i3).longValue());
        }
        this.zzfo.zzo(iZzi);
        while (i2 < list.size()) {
            this.zzfo.zzd(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i, int i2) throws java.io.IOException {
        this.zzfo.zzf(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzm(int i, java.util.List<java.lang.Integer> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zze(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzu = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzu += com.google.android.gms.internal.clearcut.zzbn.zzu(list.get(i3).intValue());
        }
        this.zzfo.zzo(iZzu);
        while (i2 < list.size()) {
            this.zzfo.zzp(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i, int i2) throws java.io.IOException {
        this.zzfo.zzc(i, i2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfr
    public final void zzn(int i, java.util.List<java.lang.Long> list, boolean z) throws java.io.IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zzfo.zzb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.zzfo.zzb(i, 2);
        int iZzg = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzg += com.google.android.gms.internal.clearcut.zzbn.zzg(list.get(i3).longValue());
        }
        this.zzfo.zzo(iZzg);
        while (i2 < list.size()) {
            this.zzfo.zzc(list.get(i2).longValue());
            i2++;
        }
    }
}
