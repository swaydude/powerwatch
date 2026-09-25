package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class zzo implements android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewPanoramaLocation> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.StreetViewPanoramaLocation[] newArray(int i) {
        return new com.google.android.gms.maps.model.StreetViewPanoramaLocation[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.StreetViewPanoramaLocation createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        com.google.android.gms.maps.model.LatLng latLng = null;
        java.lang.String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                streetViewPanoramaLinkArr = (com.google.android.gms.maps.model.StreetViewPanoramaLink[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.maps.model.StreetViewPanoramaLink.CREATOR);
            } else if (fieldId == 3) {
                latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
            } else if (fieldId == 4) {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.model.StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, strCreateString);
    }
}
