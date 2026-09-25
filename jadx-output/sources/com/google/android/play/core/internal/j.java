package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public class j extends android.os.Binder implements android.os.IInterface {
    private static com.google.android.play.core.internal.k a;

    protected j(java.lang.String str) {
        attachInterface(this, str);
    }

    protected boolean a(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        return false;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        boolean zOnTransact;
        if (i > 16777215) {
            zOnTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return a(i, parcel);
    }
}
