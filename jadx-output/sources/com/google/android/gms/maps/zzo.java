package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzo extends com.google.android.gms.maps.internal.zzw {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCircleClickListener zzw;

    zzo(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.zzw = onCircleClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zza(com.google.android.gms.internal.maps.zzh zzhVar) {
        this.zzw.onCircleClick(new com.google.android.gms.maps.model.Circle(zzhVar));
    }
}
