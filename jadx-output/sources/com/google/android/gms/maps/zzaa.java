package com.google.android.gms.maps;

/* JADX INFO: loaded from: classes.dex */
public final class zzaa implements android.os.Parcelable.Creator<com.google.android.gms.maps.GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.GoogleMapOptions[] newArray(int i) {
        return new com.google.android.gms.maps.GoogleMapOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.GoogleMapOptions createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.CameraPosition cameraPosition = null;
        java.lang.Float floatObject = null;
        java.lang.Float floatObject2 = null;
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    b = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 3:
                    b2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 4:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    cameraPosition = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 7:
                    b4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 8:
                    b5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 9:
                    b6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 10:
                    b7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 11:
                    b8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 12:
                    b9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 13:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 14:
                    b10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 15:
                    b11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
                case 16:
                    floatObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 17:
                    floatObject2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, header);
                    break;
                case 18:
                    latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readByte(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, floatObject, floatObject2, latLngBounds, b12);
    }
}
