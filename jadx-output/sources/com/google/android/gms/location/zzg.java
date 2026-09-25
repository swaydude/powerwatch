package com.google.android.gms.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzg implements android.os.Parcelable.Creator<com.google.android.gms.location.ActivityTransitionResult> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.ActivityTransitionResult createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayListCreateTypedList = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header) != 1) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                arrayListCreateTypedList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, header, com.google.android.gms.location.ActivityTransitionEvent.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.location.ActivityTransitionResult(arrayListCreateTypedList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.location.ActivityTransitionResult[] newArray(int i) {
        return new com.google.android.gms.location.ActivityTransitionResult[i];
    }
}
