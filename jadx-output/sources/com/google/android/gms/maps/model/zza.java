package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator<com.google.android.gms.maps.model.CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.CameraPosition[] newArray(int i) {
        return new com.google.android.gms.maps.model.CameraPosition[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.CameraPosition createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        float f = 0.0f;
        com.google.android.gms.maps.model.LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.maps.model.LatLng.CREATOR);
            } else if (fieldId == 3) {
                f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 4) {
                f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 5) {
                f3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.model.CameraPosition(latLng, f, f2, f3);
    }
}
