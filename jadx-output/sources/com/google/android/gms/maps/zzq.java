package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzq extends com.google.android.gms.maps.internal.zzbg {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPolylineClickListener zzy;

    zzq(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zzy = onPolylineClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zza(com.google.android.gms.internal.maps.zzz zzzVar) {
        this.zzy.onPolylineClick(new com.google.android.gms.maps.model.Polyline(zzzVar));
    }
}
