package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public interface LocationSource {

    public interface OnLocationChangedListener {
        void onLocationChanged(android.location.Location location);
    }

    void activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
