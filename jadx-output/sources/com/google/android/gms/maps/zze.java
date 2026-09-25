package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zze extends com.google.android.gms.maps.internal.zzag {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener zzm;

    zze(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zzm = onInfoWindowLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaf
    public final void zzf(com.google.android.gms.internal.maps.zzt zztVar) {
        this.zzm.onInfoWindowLongClick(new com.google.android.gms.maps.model.Marker(zztVar));
    }
}
