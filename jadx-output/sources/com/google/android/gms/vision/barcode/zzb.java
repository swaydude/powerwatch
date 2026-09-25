package com.google.android.gms.vision.barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode[] newArray(int i) {
        return new com.google.android.gms.vision.barcode.Barcode[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        android.graphics.Point[] pointArr = null;
        com.google.android.gms.vision.barcode.Barcode.Email email = null;
        com.google.android.gms.vision.barcode.Barcode.Phone phone = null;
        com.google.android.gms.vision.barcode.Barcode.Sms sms = null;
        com.google.android.gms.vision.barcode.Barcode.WiFi wiFi = null;
        com.google.android.gms.vision.barcode.Barcode.UrlBookmark urlBookmark = null;
        com.google.android.gms.vision.barcode.Barcode.GeoPoint geoPoint = null;
        com.google.android.gms.vision.barcode.Barcode.CalendarEvent calendarEvent = null;
        com.google.android.gms.vision.barcode.Barcode.ContactInfo contactInfo = null;
        com.google.android.gms.vision.barcode.Barcode.DriverLicense driverLicense = null;
        byte[] bArrCreateByteArray = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    pointArr = (android.graphics.Point[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, android.graphics.Point.CREATOR);
                    break;
                case 7:
                    email = (com.google.android.gms.vision.barcode.Barcode.Email) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.Email.CREATOR);
                    break;
                case 8:
                    phone = (com.google.android.gms.vision.barcode.Barcode.Phone) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.Phone.CREATOR);
                    break;
                case 9:
                    sms = (com.google.android.gms.vision.barcode.Barcode.Sms) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.Sms.CREATOR);
                    break;
                case 10:
                    wiFi = (com.google.android.gms.vision.barcode.Barcode.WiFi) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.WiFi.CREATOR);
                    break;
                case 11:
                    urlBookmark = (com.google.android.gms.vision.barcode.Barcode.UrlBookmark) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.UrlBookmark.CREATOR);
                    break;
                case 12:
                    geoPoint = (com.google.android.gms.vision.barcode.Barcode.GeoPoint) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.GeoPoint.CREATOR);
                    break;
                case 13:
                    calendarEvent = (com.google.android.gms.vision.barcode.Barcode.CalendarEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.CalendarEvent.CREATOR);
                    break;
                case 14:
                    contactInfo = (com.google.android.gms.vision.barcode.Barcode.ContactInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.ContactInfo.CREATOR);
                    break;
                case 15:
                    driverLicense = (com.google.android.gms.vision.barcode.Barcode.DriverLicense) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.DriverLicense.CREATOR);
                    break;
                case 16:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.vision.barcode.Barcode(i, strCreateString, strCreateString2, i2, pointArr, email, phone, sms, wiFi, urlBookmark, geoPoint, calendarEvent, contactInfo, driverLicense, bArrCreateByteArray);
    }
}
