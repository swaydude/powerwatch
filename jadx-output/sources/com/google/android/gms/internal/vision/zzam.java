package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzam implements android.os.Parcelable.Creator<com.google.android.gms.internal.vision.zzaj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.vision.zzaj[] newArray(int i) {
        return new com.google.android.gms.internal.vision.zzaj[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.vision.zzaj createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.vision.zzag[] zzagVarArr = null;
        com.google.android.gms.internal.vision.zzw zzwVar = null;
        com.google.android.gms.internal.vision.zzw zzwVar2 = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzagVarArr = (com.google.android.gms.internal.vision.zzag[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.internal.vision.zzag.CREATOR);
                    break;
                case 3:
                    zzwVar = (com.google.android.gms.internal.vision.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.vision.zzw.CREATOR);
                    break;
                case 4:
                    zzwVar2 = (com.google.android.gms.internal.vision.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.vision.zzw.CREATOR);
                    break;
                case 5:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 6:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.vision.zzaj(zzagVarArr, zzwVar, zzwVar2, strCreateString, f, strCreateString2, z);
    }
}
