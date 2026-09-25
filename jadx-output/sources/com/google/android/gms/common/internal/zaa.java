package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaa implements android.os.Parcelable.Creator<com.google.android.gms.common.internal.AuthAccountRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.AuthAccountRequest[] newArray(int i) {
        return new com.google.android.gms.common.internal.AuthAccountRequest[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.common.internal.AuthAccountRequest createFromParcel(android.os.Parcel parcel) {
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.IBinder iBinder = null;
        com.google.android.gms.common.api.Scope[] scopeArr = null;
        java.lang.Integer integerObject = null;
        java.lang.Integer integerObject2 = null;
        android.accounts.Account account = null;
        int i = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 3:
                    scopeArr = (com.google.android.gms.common.api.Scope[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, header, com.google.android.gms.common.api.Scope.CREATOR);
                    break;
                case 4:
                    integerObject = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 5:
                    integerObject2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, header);
                    break;
                case 6:
                    account = (android.accounts.Account) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, header, android.accounts.Account.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new com.google.android.gms.common.internal.AuthAccountRequest(i, iBinder, scopeArr, integerObject, integerObject2, account);
    }
}
