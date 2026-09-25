package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzc extends com.google.android.gms.maps.internal.zzau {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMarkerDragListener zzk;

    zzc(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.zzk = onMarkerDragListener;
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(com.google.android.gms.internal.maps.zzt zztVar) {
        this.zzk.onMarkerDragStart(new com.google.android.gms.maps.model.Marker(zztVar));
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzc(com.google.android.gms.internal.maps.zzt zztVar) {
        this.zzk.onMarkerDragEnd(new com.google.android.gms.maps.model.Marker(zztVar));
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzd(com.google.android.gms.internal.maps.zzt zztVar) {
        this.zzk.onMarkerDrag(new com.google.android.gms.maps.model.Marker(zztVar));
    }
}
