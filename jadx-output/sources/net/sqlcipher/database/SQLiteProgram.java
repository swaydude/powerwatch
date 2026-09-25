package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteProgram extends net.sqlcipher.database.SQLiteClosable {
    private static final java.lang.String TAG = "SQLiteProgram";
    boolean mClosed = false;
    private net.sqlcipher.database.SQLiteCompiledSql mCompiledSql;

    @java.lang.Deprecated
    protected net.sqlcipher.database.SQLiteDatabase mDatabase;
    final java.lang.String mSql;

    @java.lang.Deprecated
    protected long nHandle;

    @java.lang.Deprecated
    protected long nStatement;

    private final native void native_clear_bindings();

    @java.lang.Deprecated
    protected void compile(java.lang.String str, boolean z) {
    }

    protected final native void native_bind_blob(int i, byte[] bArr);

    protected final native void native_bind_double(int i, double d);

    protected final native void native_bind_long(int i, long j);

    protected final native void native_bind_null(int i);

    protected final native void native_bind_string(int i, java.lang.String str);

    @java.lang.Deprecated
    protected final native void native_compile(java.lang.String str);

    @java.lang.Deprecated
    protected final native void native_finalize();

    SQLiteProgram(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        this.nHandle = 0L;
        this.nStatement = 0L;
        this.mDatabase = sQLiteDatabase;
        java.lang.String strTrim = str.trim();
        this.mSql = strTrim;
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        strTrim = strTrim.length() >= 6 ? strTrim.substring(0, 6) : strTrim;
        if (!strTrim.equalsIgnoreCase("INSERT") && !strTrim.equalsIgnoreCase("UPDATE") && !strTrim.equalsIgnoreCase("REPLAC") && !strTrim.equalsIgnoreCase(io.fabric.sdk.android.services.network.HttpRequest.METHOD_DELETE) && !strTrim.equalsIgnoreCase("SELECT")) {
            net.sqlcipher.database.SQLiteCompiledSql sQLiteCompiledSql = new net.sqlcipher.database.SQLiteCompiledSql(sQLiteDatabase, str);
            this.mCompiledSql = sQLiteCompiledSql;
            this.nStatement = sQLiteCompiledSql.nStatement;
            return;
        }
        net.sqlcipher.database.SQLiteCompiledSql compiledStatementForSql = sQLiteDatabase.getCompiledStatementForSql(str);
        this.mCompiledSql = compiledStatementForSql;
        if (compiledStatementForSql == null) {
            net.sqlcipher.database.SQLiteCompiledSql sQLiteCompiledSql2 = new net.sqlcipher.database.SQLiteCompiledSql(sQLiteDatabase, str);
            this.mCompiledSql = sQLiteCompiledSql2;
            sQLiteCompiledSql2.acquire();
            sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                android.util.Log.v(TAG, "Created DbObj (id#" + this.mCompiledSql.nStatement + ") for sql: " + str);
            }
        } else if (!compiledStatementForSql.acquire()) {
            long j = this.mCompiledSql.nStatement;
            this.mCompiledSql = new net.sqlcipher.database.SQLiteCompiledSql(sQLiteDatabase, str);
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                android.util.Log.v(TAG, "** possible bug ** Created NEW DbObj (id#" + this.mCompiledSql.nStatement + ") because the previously created DbObj (id#" + j + ") was not released for sql:" + str);
            }
        }
        this.nStatement = this.mCompiledSql.nStatement;
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql == null) {
            return;
        }
        synchronized (this.mDatabase.mCompiledQueries) {
            if (!this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                this.mCompiledSql.releaseSqlStatement();
                this.mCompiledSql = null;
                this.nStatement = 0L;
            } else {
                this.mCompiledSql.release();
            }
        }
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    java.lang.String getSqlString() {
        return this.mSql;
    }

    public void bindNull(int i) {
        if (this.mClosed) {
            throw new java.lang.IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        acquireReference();
        try {
            native_bind_null(i);
        } finally {
            releaseReference();
        }
    }

    public void bindLong(int i, long j) {
        if (this.mClosed) {
            throw new java.lang.IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        acquireReference();
        try {
            native_bind_long(i, j);
        } finally {
            releaseReference();
        }
    }

    public void bindDouble(int i, double d) {
        if (this.mClosed) {
            throw new java.lang.IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        acquireReference();
        try {
            native_bind_double(i, d);
        } finally {
            releaseReference();
        }
    }

    public void bindString(int i, java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("the bind value at index " + i + " is null");
        }
        if (this.mClosed) {
            throw new java.lang.IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        acquireReference();
        try {
            native_bind_string(i, str);
        } finally {
            releaseReference();
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("the bind value at index " + i + " is null");
        }
        if (this.mClosed) {
            throw new java.lang.IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        acquireReference();
        try {
            native_bind_blob(i, bArr);
        } finally {
            releaseReference();
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new java.lang.IllegalStateException("program already closed");
        }
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        acquireReference();
        try {
            native_clear_bindings();
        } finally {
            releaseReference();
        }
    }

    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mDatabase.unlock();
                this.mClosed = true;
            } catch (java.lang.Throwable th) {
                this.mDatabase.unlock();
                throw th;
            }
        }
    }
}
