package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.phenotype.Configuration> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.phenotype.Configuration createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.phenotype.zzi[] zziVarArr = null;
        java.lang.String[] strArrCreateStringArray = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                zziVarArr = (com.google.android.gms.phenotype.zzi[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.phenotype.zzi.CREATOR);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strArrCreateStringArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.phenotype.Configuration(i, zziVarArr, strArrCreateStringArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.phenotype.Configuration[] newArray(int i) {
        return new com.google.android.gms.phenotype.Configuration[i];
    }
}
