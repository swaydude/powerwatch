package com.google.android.gms.vision.barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf implements android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.CalendarEvent> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode.CalendarEvent[] newArray(int i) {
        return new com.google.android.gms.vision.barcode.Barcode.CalendarEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode.CalendarEvent createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        java.lang.String strCreateString3 = null;
        java.lang.String strCreateString4 = null;
        java.lang.String strCreateString5 = null;
        com.google.android.gms.vision.barcode.Barcode.CalendarDateTime calendarDateTime = null;
        com.google.android.gms.vision.barcode.Barcode.CalendarDateTime calendarDateTime2 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    strCreateString4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    strCreateString5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    calendarDateTime = (com.google.android.gms.vision.barcode.Barcode.CalendarDateTime) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.CalendarDateTime.CREATOR);
                    break;
                case 8:
                    calendarDateTime2 = (com.google.android.gms.vision.barcode.Barcode.CalendarDateTime) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.vision.barcode.Barcode.CalendarDateTime.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.vision.barcode.Barcode.CalendarEvent(strCreateString, strCreateString2, strCreateString3, strCreateString4, strCreateString5, calendarDateTime, calendarDateTime2);
    }
}
