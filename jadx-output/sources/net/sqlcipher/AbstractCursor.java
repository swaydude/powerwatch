package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCursor implements android.database.CrossProcessCursor, net.sqlcipher.Cursor {
    private static final java.lang.String TAG = "Cursor";
    protected android.content.ContentResolver mContentResolver;
    private android.net.Uri mNotifyUri;
    private android.database.ContentObserver mSelfObserver;
    private boolean mSelfObserverRegistered;
    android.database.DataSetObservable mDataSetObservable = new android.database.DataSetObservable();
    android.database.ContentObservable mContentObservable = new android.database.ContentObservable();
    private android.os.Bundle mExtras = android.os.Bundle.EMPTY;
    protected boolean mClosed = false;
    private final java.lang.Object mSelfObserverLock = new java.lang.Object();
    protected int mPos = -1;
    protected int mRowIdColumnIndex = -1;
    protected java.lang.Long mCurrentRowID = null;
    protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> mUpdatedRows = new java.util.HashMap<>();

    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> map) {
        return false;
    }

    public boolean deleteRow() {
        return false;
    }

    @Override // android.database.Cursor
    public abstract java.lang.String[] getColumnNames();

    @Override // android.database.Cursor
    public abstract int getCount();

    @Override // android.database.Cursor
    public abstract double getDouble(int i);

    @Override // android.database.Cursor
    public abstract float getFloat(int i);

    @Override // android.database.Cursor
    public abstract int getInt(int i);

    @Override // android.database.Cursor
    public abstract long getLong(int i);

    @Override // android.database.Cursor
    public abstract short getShort(int i);

    @Override // android.database.Cursor
    public abstract java.lang.String getString(int i);

    @Override // android.database.Cursor, net.sqlcipher.Cursor
    public abstract int getType(int i);

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.CrossProcessCursor
    public net.sqlcipher.CursorWindow getWindow() {
        return null;
    }

    @Override // android.database.Cursor
    public abstract boolean isNull(int i);

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return true;
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        throw new java.lang.UnsupportedOperationException("getBlob is not supported");
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        return getColumnNames().length;
    }

    @Override // android.database.Cursor
    public void deactivate() {
        deactivateInternal();
    }

    public void deactivateInternal() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null) {
            this.mContentResolver.unregisterContentObserver(contentObserver);
            this.mSelfObserverRegistered = false;
        }
        this.mDataSetObservable.notifyInvalidated();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver != null && !this.mSelfObserverRegistered) {
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, contentObserver);
            this.mSelfObserverRegistered = true;
        }
        this.mDataSetObservable.notifyChanged();
        return true;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return this.mClosed;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mClosed = true;
        this.mContentObservable.unregisterAll();
        deactivateInternal();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
        java.lang.String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.mPos;
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.mPos = count;
            return false;
        }
        if (i < 0) {
            this.mPos = -1;
            return false;
        }
        int i2 = this.mPos;
        if (i == i2) {
            return true;
        }
        boolean zOnMove = onMove(i2, i);
        if (!zOnMove) {
            this.mPos = -1;
        } else {
            this.mPos = i;
            int i3 = this.mRowIdColumnIndex;
            if (i3 != -1) {
                this.mCurrentRowID = java.lang.Long.valueOf(getLong(i3));
            }
        }
        return zOnMove;
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        net.sqlcipher.DatabaseUtils.cursorFillWindow(this, i, cursorWindow);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.mPos + i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.mPos + 1);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.mPos - 1);
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.mPos == 0 && getCount() != 0;
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        int count = getCount();
        return this.mPos == count + (-1) && count != 0;
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return getCount() == 0 || this.mPos == -1;
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return getCount() == 0 || this.mPos == getCount();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            android.util.Log.e(TAG, "requesting column name with table name -- " + str, new java.lang.Exception());
            str = str.substring(iLastIndexOf + 1);
        }
        java.lang.String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new java.lang.IllegalArgumentException("column '" + str + "' does not exist");
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int i) {
        return getColumnNames()[i];
    }

    public boolean updateBlob(int i, byte[] bArr) {
        return update(i, bArr);
    }

    public boolean updateString(int i, java.lang.String str) {
        return update(i, str);
    }

    public boolean updateShort(int i, short s) {
        return update(i, java.lang.Short.valueOf(s));
    }

    public boolean updateInt(int i, int i2) {
        return update(i, java.lang.Integer.valueOf(i2));
    }

    public boolean updateLong(int i, long j) {
        return update(i, java.lang.Long.valueOf(j));
    }

    public boolean updateFloat(int i, float f) {
        return update(i, java.lang.Float.valueOf(f));
    }

    public boolean updateDouble(int i, double d) {
        return update(i, java.lang.Double.valueOf(d));
    }

    public boolean updateToNull(int i) {
        return update(i, null);
    }

    public boolean update(int i, java.lang.Object obj) {
        if (!supportsUpdates()) {
            return false;
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(getLong(this.mRowIdColumnIndex));
        if (lValueOf == null) {
            throw new java.lang.IllegalStateException("null rowid. mRowIdColumnIndex = " + this.mRowIdColumnIndex);
        }
        synchronized (this.mUpdatedRows) {
            java.util.Map<java.lang.String, java.lang.Object> map = this.mUpdatedRows.get(lValueOf);
            if (map == null) {
                map = new java.util.HashMap<>();
                this.mUpdatedRows.put(lValueOf, map);
            }
            map.put(getColumnNames()[i], obj);
        }
        return true;
    }

    public boolean hasUpdates() {
        boolean z;
        synchronized (this.mUpdatedRows) {
            z = this.mUpdatedRows.size() > 0;
        }
        return z;
    }

    public void abortUpdates() {
        synchronized (this.mUpdatedRows) {
            this.mUpdatedRows.clear();
        }
    }

    public boolean commitUpdates() {
        return commitUpdates(null);
    }

    public boolean supportsUpdates() {
        return this.mRowIdColumnIndex != -1;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver contentObserver) {
        this.mContentObservable.registerObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
        if (this.mClosed) {
            return;
        }
        this.mContentObservable.unregisterObserver(contentObserver);
    }

    protected void notifyDataSetChange() {
        this.mDataSetObservable.notifyChanged();
    }

    protected android.database.DataSetObservable getDataSetObservable() {
        return this.mDataSetObservable;
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mDataSetObservable.registerObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
        this.mDataSetObservable.unregisterObserver(dataSetObserver);
    }

    protected void onChange(boolean z) {
        synchronized (this.mSelfObserverLock) {
            this.mContentObservable.dispatchChange(z);
            android.net.Uri uri = this.mNotifyUri;
            if (uri != null && z) {
                this.mContentResolver.notifyChange(uri, this.mSelfObserver);
            }
        }
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        synchronized (this.mSelfObserverLock) {
            this.mNotifyUri = uri;
            this.mContentResolver = contentResolver;
            android.database.ContentObserver contentObserver = this.mSelfObserver;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            net.sqlcipher.AbstractCursor.SelfContentObserver selfContentObserver = new net.sqlcipher.AbstractCursor.SelfContentObserver(this);
            this.mSelfObserver = selfContentObserver;
            this.mContentResolver.registerContentObserver(this.mNotifyUri, true, selfContentObserver);
            this.mSelfObserverRegistered = true;
        }
    }

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
        return this.mNotifyUri;
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = android.os.Bundle.EMPTY;
        }
        this.mExtras = bundle;
    }

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
        return this.mExtras;
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle bundle) {
        return android.os.Bundle.EMPTY;
    }

    protected boolean isFieldUpdated(int i) {
        java.util.Map<java.lang.String, java.lang.Object> map;
        return this.mRowIdColumnIndex != -1 && this.mUpdatedRows.size() > 0 && (map = this.mUpdatedRows.get(this.mCurrentRowID)) != null && map.containsKey(getColumnNames()[i]);
    }

    protected java.lang.Object getUpdatedField(int i) {
        return this.mUpdatedRows.get(this.mCurrentRowID).get(getColumnNames()[i]);
    }

    protected void checkPosition() {
        if (-1 == this.mPos || getCount() == this.mPos) {
            throw new net.sqlcipher.CursorIndexOutOfBoundsException(this.mPos, getCount());
        }
    }

    protected void finalize() {
        android.database.ContentObserver contentObserver = this.mSelfObserver;
        if (contentObserver == null || !this.mSelfObserverRegistered) {
            return;
        }
        this.mContentResolver.unregisterContentObserver(contentObserver);
    }

    protected static class SelfContentObserver extends android.database.ContentObserver {
        java.lang.ref.WeakReference<net.sqlcipher.AbstractCursor> mCursor;

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return false;
        }

        public SelfContentObserver(net.sqlcipher.AbstractCursor abstractCursor) {
            super(null);
            this.mCursor = new java.lang.ref.WeakReference<>(abstractCursor);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            net.sqlcipher.AbstractCursor abstractCursor = this.mCursor.get();
            if (abstractCursor != null) {
                abstractCursor.onChange(false);
            }
        }
    }
}
