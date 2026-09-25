package com.baidu.mapframework.open.aidl;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.os.IInterface {

    /* JADX INFO: renamed from: com.baidu.mapframework.open.aidl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0007a extends android.os.Binder implements com.baidu.mapframework.open.aidl.a {

        /* JADX INFO: renamed from: com.baidu.mapframework.open.aidl.a$a$a, reason: collision with other inner class name */
        private static class C0008a implements com.baidu.mapframework.open.aidl.a {
            private android.os.IBinder a;

            C0008a(android.os.IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.baidu.mapframework.open.aidl.a
            public void a(com.baidu.mapframework.open.aidl.b bVar) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IMapOpenService");
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
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

        public static com.baidu.mapframework.open.aidl.a a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IMapOpenService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.baidu.mapframework.open.aidl.a)) ? new com.baidu.mapframework.open.aidl.a.AbstractBinderC0007a.C0008a(iBinder) : (com.baidu.mapframework.open.aidl.a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.baidu.mapframework.open.aidl.IMapOpenService");
                return true;
            }
            parcel.enforceInterface("com.baidu.mapframework.open.aidl.IMapOpenService");
            a(com.baidu.mapframework.open.aidl.b.a.b(parcel.readStrongBinder()));
            parcel2.writeNoException();
            return true;
        }
    }

    void a(com.baidu.mapframework.open.aidl.b bVar) throws android.os.RemoteException;
}
