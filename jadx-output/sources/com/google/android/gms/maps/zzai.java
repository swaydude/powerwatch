package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzai implements android.os.Parcelable.Creator<com.google.android.gms.maps.StreetViewPanoramaOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.StreetViewPanoramaOptions[] newArray(int i) {
        return new com.google.android.gms.maps.StreetViewPanoramaOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.StreetViewPanoramaOptions createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        java.lang.String strCreateString = null;
        com.google.android.gms.maps.model.LatLng latLng = null;
        java.lang.Integer integerObject = null;
        com.google.android.gms.maps.model.StreetViewSource streetViewSource = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    streetViewPanoramaCamera = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
                    break;
                case 5:
                    integerObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 6:
                    b = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 7:
                    b2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 8:
                    b3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 9:
                    b4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    streetViewSource = (com.google.android.gms.maps.model.StreetViewSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.StreetViewSource.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.StreetViewPanoramaOptions(streetViewPanoramaCamera, strCreateString, latLng, integerObject, b, b2, b3, b4, b5, streetViewSource);
    }
}
