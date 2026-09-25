package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
class SQLiteCompiledSql {
    private static final java.lang.String TAG = "SQLiteCompiledSql";
    net.sqlcipher.database.SQLiteDatabase mDatabase;
    private java.lang.String mSqlStmt;
    private java.lang.Throwable mStackTrace;
    long nHandle;
    long nStatement = 0;
    private boolean mInUse = false;

    private final native void native_compile(java.lang.String str);

    private final native void native_finalize();

    SQLiteCompiledSql(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        this.nHandle = 0L;
        this.mSqlStmt = null;
        this.mStackTrace = null;
        if (!sQLiteDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + sQLiteDatabase.getPath() + " already closed");
        }
        this.mDatabase = sQLiteDatabase;
        this.mSqlStmt = str;
        this.mStackTrace = new net.sqlcipher.database.DatabaseObjectNotClosedException().fillInStackTrace();
        this.nHandle = sQLiteDatabase.mNativeHandle;
        compile(str, true);
    }

    private void compile(java.lang.String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                android.util.Log.v(TAG, "closed and deallocated DbObj (id#" + this.nStatement + ")");
            }
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0L;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            android.util.Log.v(TAG, "Acquired DbObj (id#" + this.nStatement + ") from DB cache");
        }
        return true;
    }

    synchronized void release() {
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            android.util.Log.v(TAG, "Released DbObj (id#" + this.nStatement + ") back to DB cache");
        }
        this.mInUse = false;
    }

    protected void finalize() throws java.lang.Throwable {
        try {
            if (this.nStatement == 0) {
                return;
            }
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                android.util.Log.v(TAG, "** warning ** Finalized DbObj (id#" + this.nStatement + ")");
            }
            int length = this.mSqlStmt.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("Releasing statement in a finalizer. Please ensure that you explicitly call close() on your cursor: ");
            java.lang.String str = this.mSqlStmt;
            if (length > 100) {
                length = 100;
            }
            sb.append(str.substring(0, length));
            android.util.Log.w(TAG, sb.toString(), this.mStackTrace);
            releaseSqlStatement();
        } finally {
            super.finalize();
        }
    }
}
