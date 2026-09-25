package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzl extends com.google.android.gms.maps.internal.ILocationSourceDelegate.zza {
    private final /* synthetic */ com.google.android.gms.maps.LocationSource zzt;

    zzl(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.LocationSource locationSource) {
        this.zzt = locationSource;
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(com.google.android.gms.maps.internal.zzah zzahVar) {
        this.zzt.activate(new com.google.android.gms.maps.zzm(this, zzahVar));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.zzt.deactivate();
    }
}
