package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationSettingsStates extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationSettingsStates> CREATOR = new com.google.android.gms.location.zzai();
    private final boolean zzbn;
    private final boolean zzbo;
    private final boolean zzbp;
    private final boolean zzbq;
    private final boolean zzbr;
    private final boolean zzbs;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.zzbn = z;
        this.zzbo = z2;
        this.zzbp = z3;
        this.zzbq = z4;
        this.zzbr = z5;
        this.zzbs = z6;
    }

    public static com.google.android.gms.location.LocationSettingsStates fromIntent(android.content.Intent intent) {
        return (com.google.android.gms.location.LocationSettingsStates) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    public final boolean isBlePresent() {
        return this.zzbs;
    }

    public final boolean isBleUsable() {
        return this.zzbp;
    }

    public final boolean isGpsPresent() {
        return this.zzbq;
    }

    public final boolean isGpsUsable() {
        return this.zzbn;
    }

    public final boolean isLocationPresent() {
        return this.zzbq || this.zzbr;
    }

    public final boolean isLocationUsable() {
        return this.zzbn || this.zzbo;
    }

    public final boolean isNetworkLocationPresent() {
        return this.zzbr;
    }

    public final boolean isNetworkLocationUsable() {
        return this.zzbo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, isGpsUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, isNetworkLocationUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isBleUsable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isGpsPresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isNetworkLocationPresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isBlePresent());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
