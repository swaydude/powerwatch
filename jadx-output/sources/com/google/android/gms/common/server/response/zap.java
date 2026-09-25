package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zap implements android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.server.response.SafeParcelResponse[] newArray(int i) {
        return new com.google.android.gms.common.server.response.SafeParcelResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.server.response.SafeParcelResponse createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Parcel parcelCreateParcel = null;
        com.google.android.gms.common.server.response.zaj zajVar = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                parcelCreateParcel = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(parcel, header);
            } else if (fieldId == 3) {
                zajVar = (com.google.android.gms.common.server.response.zaj) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.common.server.response.zaj.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.common.server.response.SafeParcelResponse(i, parcelCreateParcel, zajVar);
    }
}
