package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaj implements android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zak> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.signin.internal.zak[] newArray(int i) {
        return new com.google.android.gms.signin.internal.zak[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.signin.internal.zak createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.common.ConnectionResult connectionResult = null;
        com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                connectionResult = (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.common.ConnectionResult.CREATOR);
            } else if (fieldId == 3) {
                resolveAccountResponse = (com.google.android.gms.common.internal.ResolveAccountResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.common.internal.ResolveAccountResponse.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.signin.internal.zak(i, connectionResult, resolveAccountResponse);
    }
}
