package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzk extends com.google.android.gms.maps.internal.zzam {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback zzs;

    zzk(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zzs = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void onMapLoaded() throws android.os.RemoteException {
        this.zzs.onMapLoaded();
    }
}
