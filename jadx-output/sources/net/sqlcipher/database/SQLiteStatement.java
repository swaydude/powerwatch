package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteStatement extends net.sqlcipher.database.SQLiteProgram {
    private final native long native_1x1_long();

    private final native java.lang.String native_1x1_string();

    private final native void native_execute();

    SQLiteStatement(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        super(sQLiteDatabase, str);
    }

    public void execute() {
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        android.os.SystemClock.uptimeMillis();
        this.mDatabase.lock();
        acquireReference();
        try {
            native_execute();
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    public long executeInsert() {
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        android.os.SystemClock.uptimeMillis();
        this.mDatabase.lock();
        acquireReference();
        try {
            native_execute();
            return this.mDatabase.lastChangeCount() > 0 ? this.mDatabase.lastInsertRow() : -1L;
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    public int executeUpdateDelete() {
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        android.os.SystemClock.uptimeMillis();
        this.mDatabase.lock();
        acquireReference();
        try {
            native_execute();
            return this.mDatabase.lastChangeCount();
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    public long simpleQueryForLong() {
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        android.os.SystemClock.uptimeMillis();
        this.mDatabase.lock();
        acquireReference();
        try {
            return native_1x1_long();
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }

    public java.lang.String simpleQueryForString() {
        if (!this.mDatabase.isOpen()) {
            throw new java.lang.IllegalStateException("database " + this.mDatabase.getPath() + " already closed");
        }
        android.os.SystemClock.uptimeMillis();
        this.mDatabase.lock();
        acquireReference();
        try {
            return native_1x1_string();
        } finally {
            releaseReference();
            this.mDatabase.unlock();
        }
    }
}
