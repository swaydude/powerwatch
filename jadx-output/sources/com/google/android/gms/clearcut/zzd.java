package com.google.android.gms.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class zzd implements android.os.Parcelable.Creator<com.google.android.gms.clearcut.zzc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.clearcut.zzc createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.clearcut.zzc(z, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.clearcut.zzc[] newArray(int i) {
        return new com.google.android.gms.clearcut.zzc[i];
    }
}
