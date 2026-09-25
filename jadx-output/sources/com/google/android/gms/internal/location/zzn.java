package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzm> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.location.zzm createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.location.zzj zzjVar = com.google.android.gms.internal.location.zzm.zzce;
        java.util.List<com.google.android.gms.common.internal.ClientIdentity> listCreateTypedList = com.google.android.gms.internal.location.zzm.zzcd;
        java.lang.String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                zzjVar = (com.google.android.gms.location.zzj) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.location.zzj.CREATOR);
            } else if (fieldId == 2) {
                listCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.internal.location.zzm(zzjVar, listCreateTypedList, strCreateString);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.location.zzm[] newArray(int i) {
        return new com.google.android.gms.internal.location.zzm[i];
    }
}
