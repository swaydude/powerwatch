package net.sqlcipher;

/* JADX INFO: compiled from: BulkCursorNative.java */
/* JADX INFO: loaded from: classes2.dex */
final class BulkCursorProxy implements net.sqlcipher.IBulkCursor {
    private android.os.Bundle mExtras = null;
    private android.os.IBinder mRemote;

    public BulkCursorProxy(android.os.IBinder iBinder) {
        this.mRemote = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.mRemote;
    }

    @Override // net.sqlcipher.IBulkCursor
    public net.sqlcipher.CursorWindow getWindow(int i) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        parcelObtain.writeInt(i);
        this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        net.sqlcipher.CursorWindow cursorWindowNewFromParcel = parcelObtain2.readInt() == 1 ? net.sqlcipher.CursorWindow.newFromParcel(parcelObtain2) : null;
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return cursorWindowNewFromParcel;
    }

    @Override // net.sqlcipher.IBulkCursor
    public void onMove(int i) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        parcelObtain.writeInt(i);
        this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        parcelObtain.recycle();
        parcelObtain2.recycle();
    }

    @Override // net.sqlcipher.IBulkCursor
    public int count() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        boolean zTransact = this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        int i = !zTransact ? -1 : parcelObtain2.readInt();
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return i;
    }

    @Override // net.sqlcipher.IBulkCursor
    public java.lang.String[] getColumnNames() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        int i = parcelObtain2.readInt();
        java.lang.String[] strArr = new java.lang.String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = parcelObtain2.readString();
        }
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return strArr;
    }

    @Override // net.sqlcipher.IBulkCursor
    public void deactivate() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        parcelObtain.recycle();
        parcelObtain2.recycle();
    }

    @Override // net.sqlcipher.IBulkCursor
    public void close() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        parcelObtain.recycle();
        parcelObtain2.recycle();
    }

    @Override // net.sqlcipher.IBulkCursor
    public int requery(net.sqlcipher.IContentObserver iContentObserver, net.sqlcipher.CursorWindow cursorWindow) throws android.os.RemoteException {
        int i;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        parcelObtain.writeStrongInterface(iContentObserver);
        cursorWindow.writeToParcel(parcelObtain, 0);
        boolean zTransact = this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        if (zTransact) {
            i = parcelObtain2.readInt();
            this.mExtras = parcelObtain2.readBundle(getClass().getClassLoader());
        } else {
            i = -1;
        }
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return i;
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean updateRows(java.util.Map map) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        parcelObtain.writeMap(map);
        this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        boolean z = parcelObtain2.readInt() == 1;
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return z;
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean deleteRow(int i) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        parcelObtain.writeInt(i);
        this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        boolean z = parcelObtain2.readInt() == 1;
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return z;
    }

    @Override // net.sqlcipher.IBulkCursor
    public boolean getWantsAllOnMoveCalls() throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        int i = parcelObtain2.readInt();
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return i != 0;
    }

    @Override // net.sqlcipher.IBulkCursor
    public android.os.Bundle getExtras() throws android.os.RemoteException {
        if (this.mExtras == null) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
            parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
            this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
            net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
            this.mExtras = parcelObtain2.readBundle(getClass().getClassLoader());
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
        return this.mExtras;
    }

    @Override // net.sqlcipher.IBulkCursor
    public android.os.Bundle respond(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
        parcelObtain.writeInterfaceToken(net.sqlcipher.IBulkCursor.descriptor);
        parcelObtain.writeBundle(bundle);
        this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
        net.sqlcipher.DatabaseUtils.readExceptionFromParcel(parcelObtain2);
        android.os.Bundle bundle2 = parcelObtain2.readBundle(getClass().getClassLoader());
        parcelObtain.recycle();
        parcelObtain2.recycle();
        return bundle2;
    }
}
