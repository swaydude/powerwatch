package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzak extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzaj {
    public zzak() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        zza((com.google.android.gms.internal.location.zzad) com.google.android.gms.internal.location.zzc.zza(parcel, com.google.android.gms.internal.location.zzad.CREATOR));
        return true;
    }
}
