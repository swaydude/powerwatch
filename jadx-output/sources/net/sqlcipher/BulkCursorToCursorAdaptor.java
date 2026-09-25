package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public final class BulkCursorToCursorAdaptor extends net.sqlcipher.AbstractWindowedCursor {
    private static final java.lang.String TAG = "BulkCursor";
    private net.sqlcipher.IBulkCursor mBulkCursor;
    private java.lang.String[] mColumns;
    private int mCount;
    private net.sqlcipher.AbstractCursor.SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    @Override // net.sqlcipher.AbstractWindowedCursor, net.sqlcipher.AbstractCursor, android.database.Cursor
    public void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
    }

    public void set(net.sqlcipher.IBulkCursor iBulkCursor) {
        this.mBulkCursor = iBulkCursor;
        try {
            this.mCount = iBulkCursor.count();
            this.mWantsAllOnMoveCalls = this.mBulkCursor.getWantsAllOnMoveCalls();
            java.lang.String[] columnNames = this.mBulkCursor.getColumnNames();
            this.mColumns = columnNames;
            this.mRowIdColumnIndex = findRowIdColumnIndex(columnNames);
        } catch (android.os.RemoteException unused) {
            android.util.Log.e(TAG, "Setup failed because the remote process is dead");
        }
    }

    public void set(net.sqlcipher.IBulkCursor iBulkCursor, int i, int i2) {
        this.mBulkCursor = iBulkCursor;
        this.mColumns = null;
        this.mCount = i;
        this.mRowIdColumnIndex = i2;
    }

    public static int findRowIdColumnIndex(java.lang.String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i].equals("_id")) {
                return i;
            }
        }
        return -1;
    }

    public synchronized net.sqlcipher.IContentObserver getObserver() {
        if (this.mObserverBridge == null) {
            this.mObserverBridge = new net.sqlcipher.AbstractCursor.SelfContentObserver(this);
        }
        return null;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.mCount;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        try {
            if (this.mWindow == null || i2 < this.mWindow.getStartPosition() || i2 >= this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
                this.mWindow = this.mBulkCursor.getWindow(i2);
            } else if (this.mWantsAllOnMoveCalls) {
                this.mBulkCursor.onMove(i2);
            }
            return this.mWindow != null;
        } catch (android.os.RemoteException unused) {
            android.util.Log.e(TAG, "Unable to get window because the remote process is dead");
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        try {
            this.mBulkCursor.deactivate();
        } catch (android.os.RemoteException unused) {
            android.util.Log.w(TAG, "Remote process exception when deactivating");
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            this.mBulkCursor.close();
        } catch (android.os.RemoteException unused) {
            android.util.Log.w(TAG, "Remote process exception when closing");
        }
        this.mWindow = null;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
        try {
            int iRequery = this.mBulkCursor.requery(getObserver(), new net.sqlcipher.CursorWindow(false));
            this.mCount = iRequery;
            if (iRequery != -1) {
                this.mPos = -1;
                this.mWindow = null;
                super.requery();
                return true;
            }
            deactivate();
            return false;
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Unable to requery because the remote process exception " + e.getMessage());
            deactivate();
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        try {
            boolean zDeleteRow = this.mBulkCursor.deleteRow(this.mPos);
            if (zDeleteRow) {
                this.mWindow = null;
                this.mCount = this.mBulkCursor.count();
                int i = this.mPos;
                int i2 = this.mCount;
                if (i < i2) {
                    int i3 = this.mPos;
                    this.mPos = -1;
                    moveToPosition(i3);
                } else {
                    this.mPos = i2;
                }
                onChange(true);
            }
            return zDeleteRow;
        } catch (android.os.RemoteException unused) {
            android.util.Log.e(TAG, "Unable to delete row because the remote process is dead");
            return false;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        if (this.mColumns == null) {
            try {
                this.mColumns = this.mBulkCursor.getColumnNames();
            } catch (android.os.RemoteException unused) {
                android.util.Log.e(TAG, "Unable to fetch column names because the remote process is dead");
                return null;
            }
        }
        return this.mColumns;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021 A[Catch: all -> 0x0041, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {, blocks: (B:9:0x0014, B:10:0x0019, B:12:0x0021, B:14:0x0023, B:16:0x002e, B:17:0x0036, B:19:0x0038, B:20:0x003f), top: B:25:0x0014, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: RemoteException -> 0x0038, all -> 0x0041, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x0038, blocks: (B:14:0x0023, B:16:0x002e), top: B:26:0x0023, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> map) {
        boolean zUpdateRows;
        if (!supportsUpdates()) {
            android.util.Log.e(TAG, "commitUpdates not supported on this cursor, did you include the _id column?");
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
                if (this.mUpdatedRows.size() <= 0) {
                    return false;
                }
                try {
                    zUpdateRows = this.mBulkCursor.updateRows(this.mUpdatedRows);
                    if (zUpdateRows) {
                        this.mUpdatedRows.clear();
                        onChange(true);
                    }
                    return zUpdateRows;
                } catch (android.os.RemoteException unused) {
                    android.util.Log.e(TAG, "Unable to commit updates because the remote process is dead");
                    return false;
                }
            }
            if (this.mUpdatedRows.size() <= 0) {
                return false;
            }
            zUpdateRows = this.mBulkCursor.updateRows(this.mUpdatedRows);
            if (zUpdateRows) {
                this.mUpdatedRows.clear();
                onChange(true);
            }
            return zUpdateRows;
            throw th;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public android.os.Bundle getExtras() {
        try {
            return this.mBulkCursor.getExtras();
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        try {
            return this.mBulkCursor.respond(bundle);
        } catch (android.os.RemoteException e) {
            android.util.Log.w(TAG, "respond() threw RemoteException, returning an empty bundle.", e);
            return android.os.Bundle.EMPTY;
        }
    }
}
