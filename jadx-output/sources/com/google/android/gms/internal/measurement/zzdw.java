package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzdw implements java.util.Comparator<com.google.android.gms.internal.measurement.zzdu> {
    zzdw() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.internal.measurement.zzdu zzduVar, com.google.android.gms.internal.measurement.zzdu zzduVar2) {
        com.google.android.gms.internal.measurement.zzdu zzduVar3 = zzduVar;
        com.google.android.gms.internal.measurement.zzdu zzduVar4 = zzduVar2;
        com.google.android.gms.internal.measurement.zzed zzedVar = (com.google.android.gms.internal.measurement.zzed) zzduVar3.iterator();
        com.google.android.gms.internal.measurement.zzed zzedVar2 = (com.google.android.gms.internal.measurement.zzed) zzduVar4.iterator();
        while (zzedVar.hasNext() && zzedVar2.hasNext()) {
            int iCompare = java.lang.Integer.compare(com.google.android.gms.internal.measurement.zzdu.zzb(zzedVar.zza()), com.google.android.gms.internal.measurement.zzdu.zzb(zzedVar2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return java.lang.Integer.compare(zzduVar3.zza(), zzduVar4.zza());
    }
}
