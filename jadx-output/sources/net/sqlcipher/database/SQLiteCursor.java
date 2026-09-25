package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteCursor extends net.sqlcipher.AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final java.lang.String TAG = "Cursor";
    private java.lang.String[] mColumns;
    private net.sqlcipher.database.SQLiteDatabase mDatabase;
    private net.sqlcipher.database.SQLiteCursorDriver mDriver;
    private java.lang.String mEditTable;
    protected net.sqlcipher.database.SQLiteCursor.MainThreadNotificationHandler mNotificationHandler;
    private net.sqlcipher.database.SQLiteQuery mQuery;
    private int mCount = -1;
    private int mMaxRead = Integer.MAX_VALUE;
    private int mInitialRead = Integer.MAX_VALUE;
    private int mCursorState = 0;
    private java.util.concurrent.locks.ReentrantLock mLock = null;
    private boolean mPendingData = false;
    private java.lang.Throwable mStackTrace = new net.sqlcipher.database.DatabaseObjectNotClosedException().fillInStackTrace();
    private java.util.Map<java.lang.String, java.lang.Integer> mColumnNameMap = null;

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new java.util.concurrent.locks.ReentrantLock(true);
    }

    private void queryThreadLock() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    private final class QueryThread implements java.lang.Runnable {
        private final int mThreadState;

        QueryThread(int i) {
            this.mThreadState = i;
        }

        private void sendMessage() {
            if (net.sqlcipher.database.SQLiteCursor.this.mNotificationHandler == null) {
                net.sqlcipher.database.SQLiteCursor.this.mPendingData = true;
            } else {
                net.sqlcipher.database.SQLiteCursor.this.mNotificationHandler.sendEmptyMessage(1);
                net.sqlcipher.database.SQLiteCursor.this.mPendingData = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            net.sqlcipher.CursorWindow cursorWindow = net.sqlcipher.database.SQLiteCursor.this.mWindow;
            android.os.Process.setThreadPriority(android.os.Process.myTid(), 10);
            while (true) {
                net.sqlcipher.database.SQLiteCursor.this.mLock.lock();
                if (net.sqlcipher.database.SQLiteCursor.this.mCursorState != this.mThreadState) {
                    net.sqlcipher.database.SQLiteCursor.this.mLock.unlock();
                    return;
                }
                try {
                    int iFillWindow = net.sqlcipher.database.SQLiteCursor.this.mQuery.fillWindow(cursorWindow, net.sqlcipher.database.SQLiteCursor.this.mMaxRead, net.sqlcipher.database.SQLiteCursor.this.mCount);
                    if (iFillWindow != 0) {
                        if (iFillWindow != -1) {
                            net.sqlcipher.database.SQLiteCursor.this.mCount = iFillWindow;
                            sendMessage();
                        } else {
                            net.sqlcipher.database.SQLiteCursor.this.mCount += net.sqlcipher.database.SQLiteCursor.this.mMaxRead;
                            sendMessage();
                            net.sqlcipher.database.SQLiteCursor.this.mLock.unlock();
                        }
                    }
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th) {
                    net.sqlcipher.database.SQLiteCursor.this.mLock.unlock();
                    throw th;
                }
                net.sqlcipher.database.SQLiteCursor.this.mLock.unlock();
                return;
            }
        }
    }

    protected static class MainThreadNotificationHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<net.sqlcipher.database.SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(net.sqlcipher.database.SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new java.lang.ref.WeakReference<>(sQLiteCursor);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            net.sqlcipher.database.SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new net.sqlcipher.database.SQLiteCursor.MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    public SQLiteCursor(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, net.sqlcipher.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, net.sqlcipher.database.SQLiteQuery sQLiteQuery) {
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int iColumnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new java.lang.String[iColumnCountLocked];
            for (int i = 0; i < iColumnCountLocked; i++) {
                java.lang.String strColumnNameLocked = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = strColumnNameLocked;
                if ("_id".equals(strColumnNameLocked)) {
                    this.mRowIdColumnIndex = i;
                }
            }
            sQLiteDatabase.unlock();
        } catch (java.lang.Throwable th) {
            sQLiteDatabase.unlock();
            throw th;
        }
    }

    public net.sqlcipher.database.SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        if (this.mWindow != null && i2 >= this.mWindow.getStartPosition() && i2 < this.mWindow.getStartPosition() + this.mWindow.getNumRows()) {
            return true;
        }
        fillWindow(i2);
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    private void fillWindow(int i) {
        if (this.mWindow == null) {
            this.mWindow = new net.sqlcipher.CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
                queryThreadUnlock();
            } catch (java.lang.Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow.setStartPosition(i);
        int iFillWindow = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        this.mCount = iFillWindow;
        if (iFillWindow == -1) {
            this.mCount = i + this.mInitialRead;
            new java.lang.Thread(new net.sqlcipher.database.SQLiteCursor.QueryThread(this.mCursorState), "query thread").start();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        if (this.mColumnNameMap == null) {
            java.lang.String[] strArr = this.mColumns;
            int length = strArr.length;
            java.util.HashMap map = new java.util.HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], java.lang.Integer.valueOf(i));
            }
            this.mColumnNameMap = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            android.util.Log.e(TAG, "requesting column name with table name -- " + str, new java.lang.Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        java.lang.Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        boolean z;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            android.util.Log.e(TAG, "Could not delete row because either the row ID column is not available or ithas not been read.");
            return false;
        }
        this.mDatabase.lock();
        try {
            try {
                this.mDatabase.delete(this.mEditTable, this.mColumns[this.mRowIdColumnIndex] + "=?", new java.lang.String[]{this.mCurrentRowID.toString()});
                z = true;
            } catch (net.sqlcipher.SQLException unused) {
                z = false;
            }
            int i = this.mPos;
            requery();
            moveToPosition(i);
            this.mDatabase.unlock();
            if (!z) {
                return false;
            }
            onChange(true);
            return true;
        } catch (java.lang.Throwable th) {
            this.mDatabase.unlock();
            throw th;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
        return !android.text.TextUtils.isEmpty(this.mEditTable);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[Catch: all -> 0x012f, DONT_GENERATE, TryCatch #1 {, blocks: (B:9:0x0014, B:10:0x0019, B:12:0x0022, B:14:0x0024, B:35:0x0119, B:36:0x0123, B:40:0x0129, B:41:0x012e, B:15:0x0029, B:16:0x003a, B:18:0x0040, B:21:0x0056, B:24:0x005d, B:25:0x008e, B:27:0x0094, B:29:0x00b4, B:30:0x00b9, B:31:0x00bc, B:32:0x00f5, B:33:0x0113, B:34:0x0114), top: B:46:0x0014, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024 A[Catch: all -> 0x012f, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x0014, B:10:0x0019, B:12:0x0022, B:14:0x0024, B:35:0x0119, B:36:0x0123, B:40:0x0129, B:41:0x012e, B:15:0x0029, B:16:0x003a, B:18:0x0040, B:21:0x0056, B:24:0x005d, B:25:0x008e, B:27:0x0094, B:29:0x00b4, B:30:0x00b9, B:31:0x00bc, B:32:0x00f5, B:33:0x0113, B:34:0x0114), top: B:46:0x0014, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[Catch: all -> 0x0128, TryCatch #0 {all -> 0x0128, blocks: (B:15:0x0029, B:16:0x003a, B:18:0x0040, B:21:0x0056, B:24:0x005d, B:25:0x008e, B:27:0x0094, B:29:0x00b4, B:30:0x00b9, B:31:0x00bc, B:32:0x00f5, B:33:0x0113, B:34:0x0114), top: B:45:0x0029, outer: #1 }] */
    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> map) {
        java.util.Map<java.lang.String, java.lang.Object> value;
        java.lang.Long key;
        if (!supportsUpdates()) {
            android.util.Log.e(TAG, "commitUpdates not supported on this cursor, did you include the _id column?");
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map != null) {
                this.mUpdatedRows.putAll(map);
                if (this.mUpdatedRows.size() == 0) {
                    return true;
                }
                this.mDatabase.beginTransaction();
                try {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
                    for (java.util.Map.Entry<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> entry : this.mUpdatedRows.entrySet()) {
                        value = entry.getValue();
                        key = entry.getKey();
                        if (key != null || value == null) {
                            throw new java.lang.IllegalStateException("null rowId or values found! rowId = " + key + ", values = " + value);
                        }
                        if (value.size() != 0) {
                            long jLongValue = key.longValue();
                            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> it = value.entrySet().iterator();
                            sb.setLength(0);
                            sb.append("UPDATE " + this.mEditTable + " SET ");
                            java.lang.Object[] objArr = new java.lang.Object[value.size()];
                            int i = 0;
                            while (it.hasNext()) {
                                java.util.Map.Entry<java.lang.String, java.lang.Object> next = it.next();
                                sb.append(next.getKey());
                                sb.append("=?");
                                objArr[i] = next.getValue();
                                if (it.hasNext()) {
                                    sb.append(", ");
                                }
                                i++;
                            }
                            sb.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + jLongValue);
                            sb.append(';');
                            this.mDatabase.execSQL(sb.toString(), objArr);
                            this.mDatabase.rowUpdated(this.mEditTable, jLongValue);
                        }
                    }
                    this.mDatabase.setTransactionSuccessful();
                    this.mDatabase.endTransaction();
                    this.mUpdatedRows.clear();
                    onChange(true);
                    return true;
                } catch (java.lang.Throwable th) {
                    this.mDatabase.endTransaction();
                    throw th;
                }
            }
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(128);
            while (r3.hasNext()) {
                value = entry.getValue();
                key = entry.getKey();
                if (key != null) {
                }
                throw new java.lang.IllegalStateException("null rowId or values found! rowId = " + key + ", values = " + value);
            }
            this.mDatabase.setTransactionSuccessful();
            this.mDatabase.endTransaction();
            this.mUpdatedRows.clear();
            onChange(true);
            return true;
            throw th;
        }
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        if (this.mWindow != null) {
            this.mWindow.close();
            this.mWindow = null;
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            if (this.mWindow != null) {
                this.mWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mQuery.requery();
                queryThreadUnlock();
                this.mDatabase.unlock();
                return super.requery();
            } catch (java.lang.Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.mDatabase.unlock();
            throw th2;
        }
    }

    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(net.sqlcipher.CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (java.lang.Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    public void setSelectionArguments(java.lang.String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // net.sqlcipher.AbstractCursor
    protected void finalize() {
        try {
            if (this.mWindow != null) {
                int length = this.mQuery.mSql.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Finalizing a Cursor that has not been deactivated or closed. database = ");
                sb.append(this.mDatabase.getPath());
                sb.append(", table = ");
                sb.append(this.mEditTable);
                sb.append(", query = ");
                java.lang.String str = this.mQuery.mSql;
                if (length > 100) {
                    length = 100;
                }
                sb.append(str.substring(0, length));
                android.util.Log.e(TAG, sb.toString(), this.mStackTrace);
                close();
                net.sqlcipher.database.SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        if (this.mWindow == null) {
            this.mWindow = new net.sqlcipher.CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
                queryThreadUnlock();
            } catch (java.lang.Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow.setStartPosition(i);
        int iFillWindow = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        this.mCount = iFillWindow;
        if (iFillWindow == -1) {
            this.mCount = i + this.mInitialRead;
            new java.lang.Thread(new net.sqlcipher.database.SQLiteCursor.QueryThread(this.mCursorState), "query thread").start();
        }
    }
}
