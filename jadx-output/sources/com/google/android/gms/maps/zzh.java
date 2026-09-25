package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzh extends com.google.android.gms.maps.internal.zzay {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener zzp;

    zzh(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.zzp = onMyLocationChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zzp.onMyLocationChange((android.location.Location) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
