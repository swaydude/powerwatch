package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzab extends com.google.android.gms.maps.internal.zzaq {
    private final /* synthetic */ com.google.android.gms.maps.OnMapReadyCallback zzbc;

    zzab(com.google.android.gms.maps.MapFragment.zza zzaVar, com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        this.zzbc = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zza(com.google.android.gms.maps.internal.IGoogleMapDelegate iGoogleMapDelegate) throws android.os.RemoteException {
        this.zzbc.onMapReady(new com.google.android.gms.maps.GoogleMap(iGoogleMapDelegate));
    }
}
