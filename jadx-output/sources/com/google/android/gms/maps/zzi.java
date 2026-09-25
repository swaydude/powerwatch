package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzi extends com.google.android.gms.maps.internal.zzaw {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener zzq;

    zzi(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zzq = onMyLocationButtonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final boolean onMyLocationButtonClick() throws android.os.RemoteException {
        return this.zzq.onMyLocationButtonClick();
    }
}
