package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class PointOfInterest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PointOfInterest> CREATOR = new com.google.android.gms.maps.model.zzj();
    public final com.google.android.gms.maps.model.LatLng latLng;
    public final java.lang.String name;
    public final java.lang.String placeId;

    public PointOfInterest(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.latLng, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.placeId, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.name, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
