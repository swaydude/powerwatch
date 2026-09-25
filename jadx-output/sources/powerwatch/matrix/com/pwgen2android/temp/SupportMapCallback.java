package powerwatch.matrix.com.pwgen2android.temp;

/* JADX INFO: loaded from: classes3.dex */
final class SupportMapCallback extends com.google.android.gms.maps.internal.zzaq {
    private com.google.android.gms.maps.OnMapReadyCallback mMapCallback;

    SupportMapCallback(powerwatch.matrix.com.pwgen2android.temp.SupportMapFragment.zza var1, com.google.android.gms.maps.OnMapReadyCallback var2) {
        this.mMapCallback = var2;
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zza(com.google.android.gms.maps.internal.IGoogleMapDelegate var1) throws android.os.RemoteException {
        this.mMapCallback.onMapReady(new com.google.android.gms.maps.GoogleMap(var1));
    }
}
