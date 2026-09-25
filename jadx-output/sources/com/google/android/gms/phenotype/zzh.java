package com.google.android.gms.phenotype;

/* JADX INFO: loaded from: classes.dex */
public final class zzh implements android.os.Parcelable.Creator<com.google.android.gms.phenotype.ExperimentTokens> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.phenotype.ExperimentTokens createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        byte[] bArrCreateByteArray = null;
        byte[][] bArrCreateByteArrayArray = null;
        byte[][] bArrCreateByteArrayArray2 = null;
        byte[][] bArrCreateByteArrayArray3 = null;
        byte[][] bArrCreateByteArrayArray4 = null;
        int[] iArrCreateIntArray = null;
        byte[][] bArrCreateByteArrayArray5 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 3:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    bArrCreateByteArrayArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 5:
                    bArrCreateByteArrayArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 6:
                    bArrCreateByteArrayArray3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 7:
                    bArrCreateByteArrayArray4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 8:
                    iArrCreateIntArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 9:
                    bArrCreateByteArrayArray5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.phenotype.ExperimentTokens(strCreateString, bArrCreateByteArray, bArrCreateByteArrayArray, bArrCreateByteArrayArray2, bArrCreateByteArrayArray3, bArrCreateByteArrayArray4, iArrCreateIntArray, bArrCreateByteArrayArray5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.phenotype.ExperimentTokens[] newArray(int i) {
        return new com.google.android.gms.phenotype.ExperimentTokens[i];
    }
}
