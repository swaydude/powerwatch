package com.google.android.gms.vision.barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zze implements android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.ContactInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode.ContactInfo[] newArray(int i) {
        return new com.google.android.gms.vision.barcode.Barcode.ContactInfo[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode.ContactInfo createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.vision.barcode.Barcode.PersonName personName = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        com.google.android.gms.vision.barcode.Barcode.Phone[] phoneArr = null;
        com.google.android.gms.vision.barcode.Barcode.Email[] emailArr = null;
        java.lang.String[] strArrCreateStringArray = null;
        com.google.android.gms.vision.barcode.Barcode.Address[] addressArr = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    personName = (com.google.android.gms.vision.barcode.Barcode.PersonName) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.PersonName.CREATOR);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    phoneArr = (com.google.android.gms.vision.barcode.Barcode.Phone[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.vision.barcode.Barcode.Phone.CREATOR);
                    break;
                case 6:
                    emailArr = (com.google.android.gms.vision.barcode.Barcode.Email[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.vision.barcode.Barcode.Email.CREATOR);
                    break;
                case 7:
                    strArrCreateStringArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header);
                    break;
                case 8:
                    addressArr = (com.google.android.gms.vision.barcode.Barcode.Address[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.vision.barcode.Barcode.Address.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.vision.barcode.Barcode.ContactInfo(personName, strCreateString, strCreateString2, phoneArr, emailArr, strArrCreateStringArray, addressArr);
    }
}
