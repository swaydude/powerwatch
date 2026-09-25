package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ResolveAccountResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ResolveAccountResponse> CREATOR = new com.google.android.gms.common.internal.zan();
    private final int versionCode;
    private android.os.IBinder zapn;
    private com.google.android.gms.common.ConnectionResult zapo;
    private boolean zapp;
    private boolean zapq;

    ResolveAccountResponse(int i, android.os.IBinder iBinder, com.google.android.gms.common.ConnectionResult connectionResult, boolean z, boolean z2) {
        this.versionCode = i;
        this.zapn = iBinder;
        this.zapo = connectionResult;
        this.zapp = z;
        this.zapq = z2;
    }

    public ResolveAccountResponse(com.google.android.gms.common.ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    public ResolveAccountResponse(int i) {
        this(new com.google.android.gms.common.ConnectionResult(i, null));
    }

    public com.google.android.gms.common.internal.IAccountAccessor getAccountAccessor() {
        return com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(this.zapn);
    }

    public com.google.android.gms.common.internal.ResolveAccountResponse setAccountAccessor(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor) {
        this.zapn = iAccountAccessor == null ? null : iAccountAccessor.asBinder();
        return this;
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult() {
        return this.zapo;
    }

    public boolean getSaveDefaultAccount() {
        return this.zapp;
    }

    public com.google.android.gms.common.internal.ResolveAccountResponse setSaveDefaultAccount(boolean z) {
        this.zapp = z;
        return this;
    }

    public boolean isFromCrossClientAuth() {
        return this.zapq;
    }

    public com.google.android.gms.common.internal.ResolveAccountResponse setIsFromCrossClientAuth(boolean z) {
        this.zapq = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zapn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getConnectionResult(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, getSaveDefaultAccount());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isFromCrossClientAuth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.ResolveAccountResponse)) {
            return false;
        }
        com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse = (com.google.android.gms.common.internal.ResolveAccountResponse) obj;
        return this.zapo.equals(resolveAccountResponse.zapo) && getAccountAccessor().equals(resolveAccountResponse.getAccountAccessor());
    }
}
