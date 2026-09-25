package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BulkCursorNative extends android.os.Binder implements net.sqlcipher.IBulkCursor {
    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    public BulkCursorNative() {
        attachInterface(this, net.sqlcipher.IBulkCursor.descriptor);
    }

    public static net.sqlcipher.IBulkCursor asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        net.sqlcipher.IBulkCursor iBulkCursor = (net.sqlcipher.IBulkCursor) iBinder.queryLocalInterface(net.sqlcipher.IBulkCursor.descriptor);
        return iBulkCursor != null ? iBulkCursor : new net.sqlcipher.BulkCursorProxy(iBinder);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        try {
            switch (i) {
                case 1:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    net.sqlcipher.CursorWindow window = getWindow(parcel.readInt());
                    if (window == null) {
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    window.writeToParcel(parcel2, 0);
                    return true;
                case 2:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    int iCount = count();
                    parcel2.writeNoException();
                    parcel2.writeInt(iCount);
                    return true;
                case 3:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    java.lang.String[] columnNames = getColumnNames();
                    parcel2.writeNoException();
                    parcel2.writeInt(columnNames.length);
                    for (java.lang.String str : columnNames) {
                        parcel2.writeString(str);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    boolean zUpdateRows = updateRows(parcel.readHashMap(null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateRows ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    boolean zDeleteRow = deleteRow(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteRow ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    deactivate();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    int iRequery = requery(net.sqlcipher.IContentObserver.Stub.asInterface(parcel.readStrongBinder()), net.sqlcipher.CursorWindow.CREATOR.createFromParcel(parcel));
                    parcel2.writeNoException();
                    parcel2.writeInt(iRequery);
                    parcel2.writeBundle(getExtras());
                    return true;
                case 8:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    onMove(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    boolean wantsAllOnMoveCalls = getWantsAllOnMoveCalls();
                    parcel2.writeNoException();
                    parcel2.writeInt(wantsAllOnMoveCalls ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    android.os.Bundle extras = getExtras();
                    parcel2.writeNoException();
                    parcel2.writeBundle(extras);
                    return true;
                case 11:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    android.os.Bundle bundleRespond = respond(parcel.readBundle(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeBundle(bundleRespond);
                    return true;
                case 12:
                    parcel.enforceInterface(net.sqlcipher.IBulkCursor.descriptor);
                    close();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        } catch (java.lang.Exception e) {
            net.sqlcipher.DatabaseUtils.writeExceptionToParcel(parcel2, e);
            return true;
        }
    }
}
