package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class zzp implements android.os.Parcelable.Creator<com.google.android.gms.maps.model.StreetViewPanoramaOrientation> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.StreetViewPanoramaOrientation[] newArray(int i) {
        return new com.google.android.gms.maps.model.StreetViewPanoramaOrientation[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.StreetViewPanoramaOrientation createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 3) {
                f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.model.StreetViewPanoramaOrientation(f, f2);
    }
}
