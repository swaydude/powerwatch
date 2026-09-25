package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
final class zza extends com.google.android.gms.maps.internal.zzaa {
    private final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener zzi;

    zza(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.zzi = onIndoorStateChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void onIndoorBuildingFocused() {
        this.zzi.onIndoorBuildingFocused();
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void zza(com.google.android.gms.internal.maps.zzn zznVar) {
        this.zzi.onIndoorLevelActivated(new com.google.android.gms.maps.model.IndoorBuilding(zznVar));
    }
}
