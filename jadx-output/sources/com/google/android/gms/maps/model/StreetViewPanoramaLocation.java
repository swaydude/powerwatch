package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public class StreetViewPanoramaLocation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewPanoramaLocation> CREATOR = new com.google.android.gms.maps.model.zzo();
    public final com.google.android.gms.maps.model.StreetViewPanoramaLink[] links;
    public final java.lang.String panoId;
    public final com.google.android.gms.maps.model.LatLng position;

    public StreetViewPanoramaLocation(com.google.android.gms.maps.model.StreetViewPanoramaLink[] streetViewPanoramaLinkArr, com.google.android.gms.maps.model.LatLng latLng, java.lang.String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.links, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.position, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.panoId, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.position, this.panoId);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.StreetViewPanoramaLocation)) {
            return false;
        }
        com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.gms.maps.model.StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("panoId", this.panoId).add("position", this.position.toString()).toString();
    }
}
