package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public interface IContentObserver extends android.os.IInterface {
    void onChange(boolean z) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements net.sqlcipher.IContentObserver {
        private static final java.lang.String DESCRIPTOR = "net.sqlcipher.IContentObserver";
        static final int TRANSACTION_onChange = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static net.sqlcipher.IContentObserver asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof net.sqlcipher.IContentObserver)) {
                return (net.sqlcipher.IContentObserver) iInterfaceQueryLocalInterface;
            }
            return new net.sqlcipher.IContentObserver.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onChange(parcel.readInt() != 0);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        private static class Proxy implements net.sqlcipher.IContentObserver {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return net.sqlcipher.IContentObserver.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // net.sqlcipher.IContentObserver
            public void onChange(boolean z) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(net.sqlcipher.IContentObserver.Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
