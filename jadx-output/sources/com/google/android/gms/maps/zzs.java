package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzs extends com.google.android.gms.maps.internal.zzbc {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPoiClickListener zzaa;

    zzs(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.zzaa = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public final void zza(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) throws android.os.RemoteException {
        this.zzaa.onPoiClick(pointOfInterest);
    }
}
