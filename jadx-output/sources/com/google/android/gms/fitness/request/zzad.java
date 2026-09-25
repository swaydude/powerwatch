package com.google.android.gms.fitness.request;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzad implements android.os.Parcelable.Creator<com.google.android.gms.fitness.request.GoalsReadRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.request.GoalsReadRequest[] newArray(int i) {
        return new com.google.android.gms.fitness.request.GoalsReadRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.fitness.request.GoalsReadRequest createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        android.os.IBinder iBinder = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
            } else if (fieldId == 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readList(parcel, header, arrayList, getClass().getClassLoader());
            } else if (fieldId == 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readList(parcel, header, arrayList2, getClass().getClassLoader());
            } else if (fieldId == 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readList(parcel, header, arrayList3, getClass().getClassLoader());
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.fitness.request.GoalsReadRequest(iBinder, arrayList, arrayList2, arrayList3);
    }
}
