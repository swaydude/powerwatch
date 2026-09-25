package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzd extends com.google.android.gms.maps.internal.zzac {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener zzl;

    zzd(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zzl = onInfoWindowClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zze(com.google.android.gms.internal.maps.zzt zztVar) {
        this.zzl.onInfoWindowClick(new com.google.android.gms.maps.model.Marker(zztVar));
    }
}
