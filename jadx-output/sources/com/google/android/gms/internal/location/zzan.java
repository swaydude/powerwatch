package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzan extends com.google.android.gms.internal.location.zzb implements com.google.android.gms.internal.location.zzam {
    public zzan() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            zza(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i != 3) {
                return false;
            }
            zza(parcel.readInt(), (android.app.PendingIntent) com.google.android.gms.internal.location.zzc.zza(parcel, android.app.PendingIntent.CREATOR));
        }
        return true;
    }
}
