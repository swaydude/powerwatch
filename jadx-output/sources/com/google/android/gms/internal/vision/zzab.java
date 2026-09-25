package com.google.android.gms.internal.vision;

/* JADX INFO: compiled from: com.google.android.gms:play-services-vision@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzab implements android.os.Parcelable.Creator<com.google.android.gms.internal.vision.zzac> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.vision.zzac[] newArray(int i) {
        return new com.google.android.gms.internal.vision.zzac[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.vision.zzac createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.vision.zzaj[] zzajVarArr = null;
        com.google.android.gms.internal.vision.zzw zzwVar = null;
        com.google.android.gms.internal.vision.zzw zzwVar2 = null;
        com.google.android.gms.internal.vision.zzw zzwVar3 = null;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        float f = 0.0f;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 2:
                    zzajVarArr = (com.google.android.gms.internal.vision.zzaj[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.internal.vision.zzaj.CREATOR);
                    break;
                case 3:
                    zzwVar = (com.google.android.gms.internal.vision.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.vision.zzw.CREATOR);
                    break;
                case 4:
                    zzwVar2 = (com.google.android.gms.internal.vision.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.vision.zzw.CREATOR);
                    break;
                case 5:
                    zzwVar3 = (com.google.android.gms.internal.vision.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.vision.zzw.CREATOR);
                    break;
                case 6:
                    strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 7:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    strCreateString2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 9:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 10:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.vision.zzac(zzajVarArr, zzwVar, zzwVar2, zzwVar3, strCreateString, f, strCreateString2, i, z, i2, i3);
    }
}
