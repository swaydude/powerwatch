package com.google.android.gms.vision.barcode;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzj implements android.os.Parcelable.Creator<com.google.android.gms.vision.barcode.Barcode.GeoPoint> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode.GeoPoint[] newArray(int i) {
        return new com.google.android.gms.vision.barcode.Barcode.GeoPoint[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.vision.barcode.Barcode.GeoPoint createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header);
            } else if (fieldId == 3) {
                d2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.vision.barcode.Barcode.GeoPoint(d, d2);
    }
}
