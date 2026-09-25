package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzv implements android.os.Parcelable.Creator<com.google.firebase.messaging.RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.firebase.messaging.RemoteMessage[] newArray(int i) {
        return new com.google.firebase.messaging.RemoteMessage[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.firebase.messaging.RemoteMessage createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header) == 2) {
                bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.firebase.messaging.RemoteMessage(bundleCreateBundle);
    }
}
