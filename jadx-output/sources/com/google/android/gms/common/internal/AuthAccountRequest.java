package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class AuthAccountRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.AuthAccountRequest> CREATOR = new com.google.android.gms.common.internal.zaa();
    private final int zali;

    @java.lang.Deprecated
    private final android.os.IBinder zaob;
    private final com.google.android.gms.common.api.Scope[] zaoc;
    private java.lang.Integer zaod;
    private java.lang.Integer zaoe;
    private android.accounts.Account zax;

    AuthAccountRequest(int i, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, java.lang.Integer num, java.lang.Integer num2, android.accounts.Account account) {
        this.zali = i;
        this.zaob = iBinder;
        this.zaoc = scopeArr;
        this.zaod = num;
        this.zaoe = num2;
        this.zax = account;
    }

    @java.lang.Deprecated
    public AuthAccountRequest(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        this(3, iAccountAccessor.asBinder(), (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]), null, null, null);
    }

    public AuthAccountRequest(android.accounts.Account account, java.util.Set<com.google.android.gms.common.api.Scope> set) {
        this(3, null, (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]), null, null, (android.accounts.Account) com.google.android.gms.common.internal.Preconditions.checkNotNull(account));
    }

    public android.accounts.Account getAccount() {
        android.accounts.Account account = this.zax;
        if (account != null) {
            return account;
        }
        android.os.IBinder iBinder = this.zaob;
        if (iBinder != null) {
            return com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(iBinder));
        }
        return null;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getScopes() {
        return new java.util.HashSet(java.util.Arrays.asList(this.zaoc));
    }

    public com.google.android.gms.common.internal.AuthAccountRequest setOauthPolicy(@javax.annotation.Nullable java.lang.Integer num) {
        this.zaod = num;
        return this;
    }

    @javax.annotation.Nullable
    public java.lang.Integer getOauthPolicy() {
        return this.zaod;
    }

    public com.google.android.gms.common.internal.AuthAccountRequest setPolicyAction(@javax.annotation.Nullable java.lang.Integer num) {
        this.zaoe = num;
        return this;
    }

    @javax.annotation.Nullable
    public java.lang.Integer getPolicyAction() {
        return this.zaoe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zali);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zaob, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, this.zaoc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 4, this.zaod, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 5, this.zaoe, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zax, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
