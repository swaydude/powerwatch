package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe implements android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.location.zzbd createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.List<com.google.android.gms.common.internal.ClientIdentity> listCreateTypedList = com.google.android.gms.internal.location.zzbd.zzcd;
        com.google.android.gms.location.LocationRequest locationRequest = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        listCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                        break;
                    case 6:
                        strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    case 7:
                        z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 8:
                        z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 9:
                        z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 10:
                        strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                locationRequest = (com.google.android.gms.location.LocationRequest) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.location.LocationRequest.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.location.zzbd(locationRequest, listCreateTypedList, strCreateString, z, z2, z3, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.location.zzbd[] newArray(int i) {
        return new com.google.android.gms.internal.location.zzbd[i];
    }
}
