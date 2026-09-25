package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public class LocationSettingsResponse extends com.google.android.gms.common.api.Response<com.google.android.gms.location.LocationSettingsResult> {
    public com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }
}
