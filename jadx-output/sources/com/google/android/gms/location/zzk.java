package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzk implements android.os.Parcelable.Creator<com.google.android.gms.location.zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.zzj createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 3) {
                f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 4) {
                j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.location.zzj(z, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.zzj[] newArray(int i) {
        return new com.google.android.gms.location.zzj[i];
    }
}
