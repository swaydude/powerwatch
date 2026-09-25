package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationSettingsResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsResult> CREATOR = new com.google.android.gms.location.zzah();
    private final com.google.android.gms.common.api.Status zzbl;
    private final com.google.android.gms.location.LocationSettingsStates zzbm;

    public LocationSettingsResult(com.google.android.gms.common.api.Status status) {
        this(status, null);
    }

    public LocationSettingsResult(com.google.android.gms.common.api.Status status, com.google.android.gms.location.LocationSettingsStates locationSettingsStates) {
        this.zzbl = status;
        this.zzbm = locationSettingsStates;
    }

    public final com.google.android.gms.location.LocationSettingsStates getLocationSettingsStates() {
        return this.zzbm;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzbl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getLocationSettingsStates(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
