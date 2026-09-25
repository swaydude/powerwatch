package com.google.android.gms.fitness.data;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzal implements android.os.Parcelable.Creator<com.google.android.gms.fitness.data.Value> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.data.Value[] newArray(int i) {
        return new com.google.android.gms.fitness.data.Value[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.data.Value createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String strCreateString = null;
        android.os.Bundle bundleCreateBundle = null;
        int[] iArrCreateIntArray = null;
        float[] fArrCreateFloatArray = null;
        byte[] bArrCreateByteArray = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 3:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 4:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                    break;
                case 6:
                    iArrCreateIntArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header);
                    break;
                case 7:
                    fArrCreateFloatArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(parcel, header);
                    break;
                case 8:
                    bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.fitness.data.Value(i, z, f, strCreateString, bundleCreateBundle, iArrCreateIntArray, fArrCreateFloatArray, bArrCreateByteArray);
    }
}
