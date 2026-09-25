package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
final class zzj implements java.util.Comparator<com.google.android.gms.phenotype.zzi> {
    zzj() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.phenotype.zzi zziVar, com.google.android.gms.phenotype.zzi zziVar2) {
        com.google.android.gms.phenotype.zzi zziVar3 = zziVar;
        com.google.android.gms.phenotype.zzi zziVar4 = zziVar2;
        return zziVar3.zzah == zziVar4.zzah ? zziVar3.name.compareTo(zziVar4.name) : zziVar3.zzah - zziVar4.zzah;
    }
}
