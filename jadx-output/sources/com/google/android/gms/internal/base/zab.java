package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class zab implements android.os.IInterface {
    private final android.os.IBinder zab;
    private final java.lang.String zac;

    protected zab(android.os.IBinder iBinder, java.lang.String str) {
        this.zab = iBinder;
        this.zac = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zab;
    }

    protected final android.os.Parcel zaa() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zac);
        return parcelObtain;
    }

    protected final android.os.Parcel zaa(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            try {
                this.zab.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (java.lang.RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    protected final void zab(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            this.zab.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void zac(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.zab.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
