package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ResolveAccountRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ResolveAccountRequest> CREATOR = new com.google.android.gms.common.internal.zam();
    private final int zali;
    private final int zapl;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zapm;
    private final android.accounts.Account zax;

    ResolveAccountRequest(int i, android.accounts.Account account, int i2, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this.zali = i;
        this.zax = account;
        this.zapl = i2;
        this.zapm = googleSignInAccount;
    }

    public ResolveAccountRequest(android.accounts.Account account, int i, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public android.accounts.Account getAccount() {
        return this.zax;
    }

    public int getSessionId() {
        return this.zapl;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSignInAccountHint() {
        return this.zapm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getSessionId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getSignInAccountHint(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
