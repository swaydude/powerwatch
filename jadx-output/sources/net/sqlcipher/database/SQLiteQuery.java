package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteQuery extends net.sqlcipher.database.SQLiteProgram {
    private static final java.lang.String TAG = "Cursor";
    private java.lang.String[] mBindArgs;
    private java.lang.Object[] mObjectBindArgs;
    private int mOffsetIndex;

    private final native int native_column_count();

    private final native java.lang.String native_column_name(int i);

    private final native int native_fill_window(net.sqlcipher.CursorWindow cursorWindow, int i, int i2, int i3, int i4);

    SQLiteQuery(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i, java.lang.String[] strArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mBindArgs = strArr;
    }

    SQLiteQuery(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i, java.lang.Object[] objArr) {
        super(sQLiteDatabase, str);
        this.mOffsetIndex = i;
        this.mObjectBindArgs = objArr;
        this.mBindArgs = new java.lang.String[objArr != null ? objArr.length : 0];
    }

    int fillWindow(net.sqlcipher.CursorWindow cursorWindow, int i, int i2) {
        int iNative_fill_window;
        android.os.SystemClock.uptimeMillis();
        this.mDatabase.lock();
        try {
            acquireReference();
            try {
                try {
                    cursorWindow.acquireReference();
                    iNative_fill_window = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), this.mOffsetIndex, i, i2);
                    if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS) {
                        android.util.Log.d(TAG, "fillWindow(): " + this.mSql);
                    }
                } catch (java.lang.IllegalStateException unused) {
                    iNative_fill_window = 0;
                } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                    this.mDatabase.onCorruption();
                    throw e;
                }
                cursorWindow.releaseReference();
                releaseReference();
                this.mDatabase.unlock();
                return iNative_fill_window;
            } catch (java.lang.Throwable th) {
                cursorWindow.releaseReference();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            releaseReference();
            this.mDatabase.unlock();
            throw th2;
        }
    }

    int columnCountLocked() {
        acquireReference();
        try {
            return native_column_count();
        } finally {
            releaseReference();
        }
    }

    java.lang.String columnNameLocked(int i) {
        acquireReference();
        try {
            return native_column_name(i);
        } finally {
            releaseReference();
        }
    }

    public java.lang.String toString() {
        return "SQLiteQuery: " + this.mSql;
    }

    void requery() {
        java.lang.String[] strArr = this.mBindArgs;
        if (strArr != null) {
            int length = strArr.length;
            try {
                java.lang.Object[] objArr = this.mObjectBindArgs;
                if (objArr != null) {
                    bindArguments(objArr);
                    return;
                }
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    super.bindString(i2, this.mBindArgs[i]);
                    i = i2;
                }
            } catch (net.sqlcipher.database.SQLiteMisuseException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("mSql " + this.mSql);
                for (int i3 = 0; i3 < length; i3++) {
                    sb.append(" ");
                    sb.append(this.mBindArgs[i3]);
                }
                sb.append(" ");
                throw new java.lang.IllegalStateException(sb.toString(), e);
            }
        }
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindNull(int i) {
        this.mBindArgs[i - 1] = null;
        if (this.mClosed) {
            return;
        }
        super.bindNull(i);
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindLong(int i, long j) {
        this.mBindArgs[i - 1] = java.lang.Long.toString(j);
        if (this.mClosed) {
            return;
        }
        super.bindLong(i, j);
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindDouble(int i, double d) {
        this.mBindArgs[i - 1] = java.lang.Double.toString(d);
        if (this.mClosed) {
            return;
        }
        super.bindDouble(i, d);
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindString(int i, java.lang.String str) {
        this.mBindArgs[i - 1] = str;
        if (this.mClosed) {
            return;
        }
        super.bindString(i, str);
    }

    public void bindArguments(java.lang.Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            java.lang.Object obj = objArr[i];
            if (obj == null) {
                bindNull(i + 1);
            } else if (obj instanceof java.lang.Double) {
                bindDouble(i + 1, ((java.lang.Double) obj).doubleValue());
            } else if (obj instanceof java.lang.Float) {
                bindDouble(i + 1, java.lang.Double.valueOf(((java.lang.Number) obj).floatValue()).doubleValue());
            } else if (obj instanceof java.lang.Long) {
                bindLong(i + 1, ((java.lang.Long) obj).longValue());
            } else if (obj instanceof java.lang.Integer) {
                bindLong(i + 1, java.lang.Long.valueOf(((java.lang.Number) obj).intValue()).longValue());
            } else if (obj instanceof java.lang.Boolean) {
                bindLong(i + 1, ((java.lang.Boolean) obj).booleanValue() ? 1L : 0L);
            } else if (obj instanceof byte[]) {
                bindBlob(i + 1, (byte[]) obj);
            } else {
                bindString(i + 1, obj.toString());
            }
        }
    }
}
