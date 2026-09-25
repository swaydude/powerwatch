package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> CREATOR = new com.google.android.gms.common.internal.zzd();
    private final int version;
    private final int zzdg;
    private int zzdh;
    android.os.IBinder zzdi;
    com.google.android.gms.common.api.Scope[] zzdj;
    android.os.Bundle zzdk;
    android.accounts.Account zzdl;
    com.google.android.gms.common.Feature[] zzdm;
    com.google.android.gms.common.Feature[] zzdn;
    private boolean zzdo;
    java.lang.String zzy;

    public GetServiceRequest(int i) {
        this.version = 4;
        this.zzdh = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzdg = i;
        this.zzdo = true;
    }

    GetServiceRequest(int i, int i2, int i3, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, com.google.android.gms.common.Feature[] featureArr, com.google.android.gms.common.Feature[] featureArr2, boolean z) {
        this.version = i;
        this.zzdg = i2;
        this.zzdh = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzy = "com.google.android.gms";
        } else {
            this.zzy = str;
        }
        if (i < 2) {
            this.zzdl = iBinder != null ? com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzdi = iBinder;
            this.zzdl = account;
        }
        this.zzdj = scopeArr;
        this.zzdk = bundle;
        this.zzdm = featureArr;
        this.zzdn = featureArr2;
        this.zzdo = z;
    }

    public android.os.Bundle getExtraArgs() {
        return this.zzdk;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.version);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzdg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzdh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzy, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, this.zzdi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 6, this.zzdj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 7, this.zzdk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzdl, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 10, this.zzdm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 11, this.zzdn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzdo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
