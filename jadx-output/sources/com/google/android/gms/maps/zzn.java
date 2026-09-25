package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzn extends com.google.android.gms.maps.internal.zzy {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener zzv;

    zzn(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.zzv = onGroundOverlayClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zza(com.google.android.gms.internal.maps.zzk zzkVar) {
        this.zzv.onGroundOverlayClick(new com.google.android.gms.maps.model.GroundOverlay(zzkVar));
    }
}
