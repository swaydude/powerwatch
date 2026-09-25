package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zak> CREATOR = new com.google.android.gms.signin.internal.zaj();
    private final int versionCode;
    private final com.google.android.gms.common.ConnectionResult zapo;
    private final com.google.android.gms.common.internal.ResolveAccountResponse zata;

    zak(int i, com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse) {
        this.versionCode = i;
        this.zapo = connectionResult;
        this.zata = resolveAccountResponse;
    }

    public zak(int i) {
        this(new com.google.android.gms.common.ConnectionResult(8, null), null);
    }

    private zak(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.internal.ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    public final com.google.android.gms.common.ConnectionResult getConnectionResult() {
        return this.zapo;
    }

    public final com.google.android.gms.common.internal.ResolveAccountResponse zacv() {
        return this.zata;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zapo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zata, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
