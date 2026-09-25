package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzac implements android.os.Parcelable.Creator<com.google.android.gms.location.LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.LocationResult createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.List<android.location.Location> listCreateTypedList = com.google.android.gms.location.LocationResult.zzbb;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header) != 1) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                listCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, android.location.Location.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.location.LocationResult(listCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.LocationResult[] newArray(int i) {
        return new com.google.android.gms.location.LocationResult[i];
    }
}
