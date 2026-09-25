package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public class g implements android.os.IInterface {
    private final android.os.IBinder a;
    private final java.lang.String b;

    protected g(android.os.IBinder iBinder, java.lang.String str) {
        this.a = iBinder;
        this.b = str;
    }

    protected final android.os.Parcel a() {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    protected final void a(int i, android.os.Parcel parcel) throws android.os.RemoteException {
        try {
            this.a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.a;
    }
}
