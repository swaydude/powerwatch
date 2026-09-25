package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzj extends com.google.android.gms.maps.internal.zzba {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener zzr;

    zzj(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zzr = onMyLocationClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final void onMyLocationClick(android.location.Location location) throws android.os.RemoteException {
        this.zzr.onMyLocationClick(location);
    }
}
