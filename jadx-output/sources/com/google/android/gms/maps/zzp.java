package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zzp extends com.google.android.gms.maps.internal.zzbe {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPolygonClickListener zzx;

    zzp(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.zzx = onPolygonClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zza(com.google.android.gms.internal.maps.zzw zzwVar) {
        this.zzx.onPolygonClick(new com.google.android.gms.maps.model.Polygon(zzwVar));
    }
}
