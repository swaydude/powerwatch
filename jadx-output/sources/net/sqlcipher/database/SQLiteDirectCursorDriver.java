package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteDirectCursorDriver implements net.sqlcipher.database.SQLiteCursorDriver {
    private net.sqlcipher.Cursor mCursor;
    private net.sqlcipher.database.SQLiteDatabase mDatabase;
    private java.lang.String mEditTable;
    private net.sqlcipher.database.SQLiteQuery mQuery;
    private java.lang.String mSql;

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void cursorDeactivated() {
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void cursorRequeried(android.database.Cursor cursor) {
    }

    public SQLiteDirectCursorDriver(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String str2) {
        this.mDatabase = sQLiteDatabase;
        this.mEditTable = str2;
        this.mSql = str;
    }

    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.Object[] objArr) {
        net.sqlcipher.database.SQLiteQuery sQLiteQuery = new net.sqlcipher.database.SQLiteQuery(this.mDatabase, this.mSql, 0, objArr);
        try {
            sQLiteQuery.bindArguments(objArr);
            if (cursorFactory == null) {
                this.mCursor = new net.sqlcipher.database.SQLiteCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            } else {
                this.mCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
            }
            this.mQuery = sQLiteQuery;
            sQLiteQuery = null;
            return this.mCursor;
        } catch (java.lang.Throwable th) {
            if (sQLiteQuery != null) {
                sQLiteQuery.close();
            }
            throw th;
        }
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String[] strArr) {
        int length;
        int i = 0;
        net.sqlcipher.database.SQLiteQuery sQLiteQuery = new net.sqlcipher.database.SQLiteQuery(this.mDatabase, this.mSql, 0, strArr);
        if (strArr == null) {
            length = 0;
        } else {
            try {
                length = strArr.length;
            } catch (java.lang.Throwable th) {
                if (sQLiteQuery != null) {
                    sQLiteQuery.close();
                }
                throw th;
            }
        }
        while (i < length) {
            int i2 = i + 1;
            sQLiteQuery.bindString(i2, strArr[i]);
            i = i2;
        }
        if (cursorFactory == null) {
            this.mCursor = new net.sqlcipher.database.SQLiteCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
        } else {
            this.mCursor = cursorFactory.newCursor(this.mDatabase, this, this.mEditTable, sQLiteQuery);
        }
        this.mQuery = sQLiteQuery;
        sQLiteQuery = null;
        return this.mCursor;
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void cursorClosed() {
        this.mCursor = null;
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void setBindArguments(java.lang.String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            this.mQuery.bindString(i2, strArr[i]);
            i = i2;
        }
    }

    public java.lang.String toString() {
        return "SQLiteDirectCursorDriver: " + this.mSql;
    }
}
