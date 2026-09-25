package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements android.os.Parcelable.Creator<com.google.android.gms.maps.model.PatternItem> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.PatternItem[] newArray(int i) {
        return new com.google.android.gms.maps.model.PatternItem[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.maps.model.PatternItem createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.lang.Float floatObject = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                floatObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.maps.model.PatternItem(i, floatObject);
    }
}
