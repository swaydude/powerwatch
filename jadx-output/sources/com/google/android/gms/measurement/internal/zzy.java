package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzy implements android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzv[] newArray(int i) {
        return new com.google.android.gms.measurement.internal.zzv[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.measurement.internal.zzv createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        java.lang.String strCreateString = null;
        java.lang.String strCreateString2 = null;
        com.google.android.gms.measurement.internal.zzkz zzkzVar = null;
        java.lang.String strCreateString3 = null;
        com.google.android.gms.measurement.internal.zzan zzanVar = null;
        com.google.android.gms.measurement.internal.zzan zzanVar2 = null;
        com.google.android.gms.measurement.internal.zzan zzanVar3 = null;
        boolean z = false;
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
                    zzkzVar = (com.google.android.gms.measurement.internal.zzkz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.measurement.internal.zzkz.CREATOR);
                    break;
                case 5:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    strCreateString3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                    break;
                case 8:
                    zzanVar = (com.google.android.gms.measurement.internal.zzan) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.measurement.internal.zzan.CREATOR);
                    break;
                case 9:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    zzanVar2 = (com.google.android.gms.measurement.internal.zzan) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.measurement.internal.zzan.CREATOR);
                    break;
                case 11:
                    j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    zzanVar3 = (com.google.android.gms.measurement.internal.zzan) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.measurement.internal.zzan.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.measurement.internal.zzv(strCreateString, strCreateString2, zzkzVar, j, z, strCreateString3, zzanVar, j2, zzanVar2, j3, zzanVar3);
    }
}
