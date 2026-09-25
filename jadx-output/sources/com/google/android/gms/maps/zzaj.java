package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzaj extends com.google.android.gms.maps.internal.zzbq {
    private final /* synthetic */ com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback zzbv;

    zzaj(com.google.android.gms.maps.StreetViewPanoramaView.zza zzaVar, com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zzbv = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zza(com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws android.os.RemoteException {
        this.zzbv.onStreetViewPanoramaReady(new com.google.android.gms.maps.StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
