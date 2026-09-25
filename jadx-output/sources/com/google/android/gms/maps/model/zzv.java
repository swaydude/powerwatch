package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements android.os.Parcelable.Creator<com.google.android.gms.maps.model.VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.VisibleRegion[] newArray(int i) {
        return new com.google.android.gms.maps.model.VisibleRegion[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.VisibleRegion createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.LatLng latLng = null;
        com.google.android.gms.maps.model.LatLng latLng2 = null;
        com.google.android.gms.maps.model.LatLng latLng3 = null;
        com.google.android.gms.maps.model.LatLng latLng4 = null;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
            } else if (fieldId == 3) {
                latLng2 = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
            } else if (fieldId == 4) {
                latLng3 = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
            } else if (fieldId == 5) {
                latLng4 = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
            } else if (fieldId == 6) {
                latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLngBounds.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.model.VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }
}
