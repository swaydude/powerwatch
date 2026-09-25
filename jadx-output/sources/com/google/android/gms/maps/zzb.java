package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.maps.internal.zzas {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMarkerClickListener zzj;

    zzb(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zzj = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final boolean zza(com.google.android.gms.internal.maps.zzt zztVar) {
        return this.zzj.onMarkerClick(new com.google.android.gms.maps.model.Marker(zztVar));
    }
}
