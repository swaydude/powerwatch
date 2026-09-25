package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision-common@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzfj implements java.util.Comparator<com.google.android.gms.internal.vision.zzfh> {
    zzfj() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.internal.vision.zzfh zzfhVar, com.google.android.gms.internal.vision.zzfh zzfhVar2) {
        com.google.android.gms.internal.vision.zzfh zzfhVar3 = zzfhVar;
        com.google.android.gms.internal.vision.zzfh zzfhVar4 = zzfhVar2;
        com.google.android.gms.internal.vision.zzfq zzfqVar = (com.google.android.gms.internal.vision.zzfq) zzfhVar3.iterator();
        com.google.android.gms.internal.vision.zzfq zzfqVar2 = (com.google.android.gms.internal.vision.zzfq) zzfhVar4.iterator();
        while (zzfqVar.hasNext() && zzfqVar2.hasNext()) {
            int iCompare = java.lang.Integer.compare(com.google.android.gms.internal.vision.zzfh.zza(zzfqVar.nextByte()), com.google.android.gms.internal.vision.zzfh.zza(zzfqVar2.nextByte()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return java.lang.Integer.compare(zzfhVar3.size(), zzfhVar4.size());
    }
}
