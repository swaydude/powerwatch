package com.baidu.mapframework.open.aidl;

/* JADX INFO: loaded from: classes.dex */
public interface b extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements com.baidu.mapframework.open.aidl.b {

        /* JADX INFO: renamed from: com.baidu.mapframework.open.aidl.b$a$a, reason: collision with other inner class name */
        private static class C0009a implements com.baidu.mapframework.open.aidl.b {
            private android.os.IBinder a;

            C0009a(android.os.IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.baidu.mapframework.open.aidl.b
            public void a(android.os.IBinder iBinder) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IOpenClientCallback");
                    parcelObtain.writeStrongBinder(iBinder);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "com.baidu.mapframework.open.aidl.IOpenClientCallback");
        }

        public static com.baidu.mapframework.open.aidl.b b(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IOpenClientCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.baidu.mapframework.open.aidl.b)) ? new com.baidu.mapframework.open.aidl.b.a.C0009a(iBinder) : (com.baidu.mapframework.open.aidl.b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.baidu.mapframework.open.aidl.IOpenClientCallback");
                return true;
            }
            parcel.enforceInterface("com.baidu.mapframework.open.aidl.IOpenClientCallback");
            a(parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
    }

    void a(android.os.IBinder iBinder) throws android.os.RemoteException;
}
