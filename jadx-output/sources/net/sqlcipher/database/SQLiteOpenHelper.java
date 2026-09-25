package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SQLiteOpenHelper {
    private static final java.lang.String TAG = "SQLiteOpenHelper";
    private final android.content.Context mContext;
    private net.sqlcipher.database.SQLiteDatabase mDatabase;
    private final net.sqlcipher.DatabaseErrorHandler mErrorHandler;
    private final net.sqlcipher.database.SQLiteDatabase.CursorFactory mFactory;
    private final net.sqlcipher.database.SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final java.lang.String mName;
    private final int mNewVersion;

    public abstract void onCreate(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase);

    public void onOpen(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, int i, int i2);

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null, new net.sqlcipher.DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(context, str, cursorFactory, i, sQLiteDatabaseHook, new net.sqlcipher.DefaultDatabaseErrorHandler());
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        this.mDatabase = null;
        this.mIsInitializing = false;
        if (i < 1) {
            throw new java.lang.IllegalArgumentException("Version must be >= 1, was " + i);
        }
        if (databaseErrorHandler == null) {
            throw new java.lang.IllegalArgumentException("DatabaseErrorHandler param value can't be null.");
        }
        this.mContext = context;
        this.mName = str;
        this.mFactory = cursorFactory;
        this.mNewVersion = i;
        this.mHook = sQLiteDatabaseHook;
        this.mErrorHandler = databaseErrorHandler;
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getWritableDatabase(java.lang.String str) {
        return getWritableDatabase(str == null ? null : str.toCharArray());
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getWritableDatabase(char[] cArr) {
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase;
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
            return this.mDatabase;
        }
        if (this.mIsInitializing) {
            throw new java.lang.IllegalStateException("getWritableDatabase called recursively");
        }
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
        if (sQLiteDatabase2 != null) {
            sQLiteDatabase2.lock();
        }
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabase3 = null;
        try {
            this.mIsInitializing = true;
            java.lang.String str = this.mName;
            if (str == null) {
                sQLiteDatabaseOpenOrCreateDatabase = net.sqlcipher.database.SQLiteDatabase.create((net.sqlcipher.database.SQLiteDatabase.CursorFactory) null, cArr);
            } else {
                java.lang.String path = this.mContext.getDatabasePath(str).getPath();
                java.io.File file = new java.io.File(path);
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                }
                sQLiteDatabaseOpenOrCreateDatabase = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(path, cArr, this.mFactory, this.mHook, this.mErrorHandler);
            }
            sQLiteDatabase3 = sQLiteDatabaseOpenOrCreateDatabase;
            int version = sQLiteDatabase3.getVersion();
            if (version != this.mNewVersion) {
                sQLiteDatabase3.beginTransaction();
                try {
                    if (version == 0) {
                        onCreate(sQLiteDatabase3);
                    } else {
                        onUpgrade(sQLiteDatabase3, version, this.mNewVersion);
                    }
                    sQLiteDatabase3.setVersion(this.mNewVersion);
                    sQLiteDatabase3.setTransactionSuccessful();
                    sQLiteDatabase3.endTransaction();
                } catch (java.lang.Throwable th) {
                    sQLiteDatabase3.endTransaction();
                    throw th;
                }
            }
            onOpen(sQLiteDatabase3);
            this.mIsInitializing = false;
            net.sqlcipher.database.SQLiteDatabase sQLiteDatabase4 = this.mDatabase;
            if (sQLiteDatabase4 != null) {
                try {
                    sQLiteDatabase4.close();
                } catch (java.lang.Exception unused) {
                }
                this.mDatabase.unlock();
            }
            this.mDatabase = sQLiteDatabase3;
            return sQLiteDatabase3;
        } catch (java.lang.Throwable th2) {
            this.mIsInitializing = false;
            net.sqlcipher.database.SQLiteDatabase sQLiteDatabase5 = this.mDatabase;
            if (sQLiteDatabase5 != null) {
                sQLiteDatabase5.unlock();
            }
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.close();
            }
            throw th2;
        }
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getReadableDatabase(java.lang.String str) {
        return getReadableDatabase(str == null ? null : str.toCharArray());
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getReadableDatabase(char[] cArr) {
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return this.mDatabase;
        }
        if (this.mIsInitializing) {
            throw new java.lang.IllegalStateException("getReadableDatabase called recursively");
        }
        try {
            return getWritableDatabase(cArr);
        } catch (net.sqlcipher.database.SQLiteException e) {
            if (this.mName == null) {
                throw e;
            }
            java.lang.String str = TAG;
            android.util.Log.e(str, "Couldn't open " + this.mName + " for writing (will try read-only):", e);
            net.sqlcipher.database.SQLiteDatabase sQLiteDatabase2 = null;
            try {
                this.mIsInitializing = true;
                java.lang.String path = this.mContext.getDatabasePath(this.mName).getPath();
                java.io.File file = new java.io.File(path);
                java.io.File file2 = new java.io.File(this.mContext.getDatabasePath(this.mName).getParent());
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                if (!file.exists()) {
                    this.mIsInitializing = false;
                    net.sqlcipher.database.SQLiteDatabase writableDatabase = getWritableDatabase(cArr);
                    this.mIsInitializing = true;
                    writableDatabase.close();
                }
                net.sqlcipher.database.SQLiteDatabase sQLiteDatabaseOpenDatabase = net.sqlcipher.database.SQLiteDatabase.openDatabase(path, cArr, this.mFactory, 1);
                if (sQLiteDatabaseOpenDatabase.getVersion() != this.mNewVersion) {
                    throw new net.sqlcipher.database.SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseOpenDatabase.getVersion() + " to " + this.mNewVersion + ": " + path);
                }
                onOpen(sQLiteDatabaseOpenDatabase);
                android.util.Log.w(str, "Opened " + this.mName + " in read-only mode");
                this.mDatabase = sQLiteDatabaseOpenDatabase;
                this.mIsInitializing = false;
                if (sQLiteDatabaseOpenDatabase != null && sQLiteDatabaseOpenDatabase != sQLiteDatabaseOpenDatabase) {
                    sQLiteDatabaseOpenDatabase.close();
                }
                return sQLiteDatabaseOpenDatabase;
            } catch (java.lang.Throwable th) {
                this.mIsInitializing = false;
                if (0 != 0 && null != this.mDatabase) {
                    sQLiteDatabase2.close();
                }
                throw th;
            }
        }
    }

    public synchronized void close() {
        if (this.mIsInitializing) {
            throw new java.lang.IllegalStateException("Closed during initialization");
        }
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.mDatabase.close();
            this.mDatabase = null;
        }
    }
}
