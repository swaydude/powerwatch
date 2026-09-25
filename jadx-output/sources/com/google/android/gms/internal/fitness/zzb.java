package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzb implements android.os.IInterface {
    private final android.os.IBinder zzb;
    private final java.lang.String zzc;

    protected zzb(android.os.IBinder iBinder, java.lang.String str) {
        this.zzb = iBinder;
        this.zzc = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zzb;
    }

    protected final android.os.Parcel zza() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzc);
        return parcelObtain;
    }

    protected final void zza(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zzb.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void zzb(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.zzb.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
