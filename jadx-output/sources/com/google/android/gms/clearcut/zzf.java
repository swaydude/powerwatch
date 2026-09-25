package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements android.os.Parcelable.Creator<com.google.android.gms.clearcut.zze> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.clearcut.zze createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.clearcut.zzr zzrVar = null;
        byte[] bArrCreateByteArray = null;
        int[] iArrCreateIntArray = null;
        java.lang.String[] strArrCreateStringArray = null;
        int[] iArrCreateIntArray2 = null;
        byte[][] bArrCreateByteArrayArray = null;
        com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr = null;
        boolean z = true;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzrVar = (com.google.android.gms.internal.clearcut.zzr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.clearcut.zzr.CREATOR);
                    break;
                case 3:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                case 4:
                    iArrCreateIntArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 5:
                    strArrCreateStringArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 7:
                    bArrCreateByteArrayArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArrayArray(parcel, header);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    experimentTokensArr = (com.google.android.gms.phenotype.ExperimentTokens[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.phenotype.ExperimentTokens.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.clearcut.zze(zzrVar, bArrCreateByteArray, iArrCreateIntArray, strArrCreateStringArray, iArrCreateIntArray2, bArrCreateByteArrayArray, z, experimentTokensArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.clearcut.zze[] newArray(int i) {
        return new com.google.android.gms.clearcut.zze[i];
    }
}
