package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransition> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.ActivityTransition createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.location.ActivityTransition(i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.ActivityTransition[] newArray(int i) {
        return new com.google.android.gms.location.ActivityTransition[i];
    }
}
