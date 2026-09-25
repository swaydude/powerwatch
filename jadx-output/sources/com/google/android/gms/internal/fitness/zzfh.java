package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfh implements java.util.Comparator<com.google.android.gms.internal.fitness.zzff> {
    zzfh() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.internal.fitness.zzff zzffVar, com.google.android.gms.internal.fitness.zzff zzffVar2) {
        com.google.android.gms.internal.fitness.zzff zzffVar3 = zzffVar;
        com.google.android.gms.internal.fitness.zzff zzffVar4 = zzffVar2;
        com.google.android.gms.internal.fitness.zzfk zzfkVar = (com.google.android.gms.internal.fitness.zzfk) zzffVar3.iterator();
        com.google.android.gms.internal.fitness.zzfk zzfkVar2 = (com.google.android.gms.internal.fitness.zzfk) zzffVar4.iterator();
        while (zzfkVar.hasNext() && zzfkVar2.hasNext()) {
            int iCompare = java.lang.Integer.compare(com.google.android.gms.internal.fitness.zzff.zza(zzfkVar.nextByte()), com.google.android.gms.internal.fitness.zzff.zza(zzfkVar2.nextByte()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return java.lang.Integer.compare(zzffVar3.size(), zzffVar4.size());
    }
}
