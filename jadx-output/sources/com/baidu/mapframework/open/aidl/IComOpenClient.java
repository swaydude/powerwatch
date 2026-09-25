package com.baidu.mapframework.open.aidl;

/* JADX INFO: loaded from: classes.dex */
public interface IComOpenClient extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements com.baidu.mapframework.open.aidl.IComOpenClient {

        /* JADX INFO: renamed from: com.baidu.mapframework.open.aidl.IComOpenClient$a$a, reason: collision with other inner class name */
        private static class C0006a implements com.baidu.mapframework.open.aidl.IComOpenClient {
            private android.os.IBinder a;

            C0006a(android.os.IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.baidu.mapframework.open.aidl.IComOpenClient
            public java.lang.String a(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IComOpenClient");
                    parcelObtain.writeString(str);
                    this.a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.baidu.mapframework.open.aidl.IComOpenClient
            public boolean a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IComOpenClient");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
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

        public static com.baidu.mapframework.open.aidl.IComOpenClient a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.baidu.mapframework.open.aidl.IComOpenClient)) ? new com.baidu.mapframework.open.aidl.IComOpenClient.a.C0006a(iBinder) : (com.baidu.mapframework.open.aidl.IComOpenClient) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
                java.lang.String strA = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            }
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.baidu.mapframework.open.aidl.IComOpenClient");
                return true;
            }
            parcel.enforceInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
            boolean zA = a(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            parcel2.writeInt(zA ? 1 : 0);
            return true;
        }
    }

    java.lang.String a(java.lang.String str) throws android.os.RemoteException;

    boolean a(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException;
}
