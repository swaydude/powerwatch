package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class SQLiteDatabase extends net.sqlcipher.database.SQLiteClosable {
    private static final java.lang.String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final java.lang.String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final java.lang.String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final java.lang.String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final java.lang.String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final java.lang.String SQLCIPHER_ANDROID_VERSION = "3.5.9";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final java.lang.String TAG = "Database";
    private int mCacheFullWarnings;
    java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> mCompiledQueries;
    private final net.sqlcipher.DatabaseErrorHandler mErrorHandler;
    private net.sqlcipher.database.SQLiteDatabase.CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private java.lang.String mLastSqlStatement;
    private final java.util.concurrent.locks.ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private java.lang.String mPath;
    private java.lang.String mPathForLogs;
    private java.util.WeakHashMap<net.sqlcipher.database.SQLiteClosable, java.lang.Object> mPrograms;
    private final int mSlowQueryThreshold;
    private java.lang.Throwable mStackTrace;
    private final java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private java.lang.String mTimeClosed;
    private java.lang.String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private net.sqlcipher.database.SQLiteTransactionListener mTransactionListener;
    private static java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> sActiveDatabases = new java.util.WeakHashMap<>();
    private static final java.lang.String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final java.util.regex.Pattern EMAIL_IN_DB_PATTERN = java.util.regex.Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static int sQueryLogTimeInMillis = 0;

    public interface CursorFactory {
        net.sqlcipher.Cursor newCursor(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, net.sqlcipher.database.SQLiteCursorDriver sQLiteCursorDriver, java.lang.String str, net.sqlcipher.database.SQLiteQuery sQLiteQuery);
    }

    public interface LibraryLoader {
        void loadLibraries(java.lang.String... strArr);
    }

    private native void dbclose();

    private native void dbopen(java.lang.String str, int i);

    private native void enableSqlProfiling(java.lang.String str);

    private native void enableSqlTracing(java.lang.String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void key(byte[] bArr) throws net.sqlcipher.SQLException;

    /* JADX INFO: Access modifiers changed from: private */
    public native void key_mutf8(char[] cArr) throws net.sqlcipher.SQLException;

    private native int native_getDbLookaside();

    private native void native_key(char[] cArr) throws net.sqlcipher.SQLException;

    private native void native_rawExecSQL(java.lang.String str);

    private native void native_rekey(java.lang.String str) throws net.sqlcipher.SQLException;

    private native int native_status(int i, boolean z);

    private native void rekey(byte[] bArr) throws net.sqlcipher.SQLException;

    public static native int releaseMemory();

    public static native void setICURoot(java.lang.String str);

    native int lastChangeCount();

    native long lastInsertRow();

    native void native_execSQL(java.lang.String str) throws net.sqlcipher.SQLException;

    native void native_setLocale(java.lang.String str, int i);

    public int status(int i, boolean z) {
        return native_status(i, z);
    }

    public void changePassword(java.lang.String str) throws net.sqlcipher.database.SQLiteException {
        if (!isOpen()) {
            throw new net.sqlcipher.database.SQLiteException("database not open");
        }
        if (str != null) {
            byte[] bytes = getBytes(str.toCharArray());
            rekey(bytes);
            for (byte b : bytes) {
            }
        }
    }

    public void changePassword(char[] cArr) throws net.sqlcipher.database.SQLiteException {
        if (!isOpen()) {
            throw new net.sqlcipher.database.SQLiteException("database not open");
        }
        if (cArr != null) {
            byte[] bytes = getBytes(cArr);
            rekey(bytes);
            for (byte b : bytes) {
            }
        }
    }

    private static void loadICUData(android.content.Context context, java.io.File file) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.util.zip.ZipInputStream zipInputStream;
        java.io.FileOutputStream fileOutputStream2;
        java.io.File file2 = new java.io.File(file, androidx.room.FtsOptions.TOKENIZER_ICU);
        java.io.File file3 = new java.io.File(file2, "icudt46l.dat");
        java.util.zip.ZipInputStream zipInputStream2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        java.util.zip.ZipInputStream zipInputStream3 = null;
        java.io.FileOutputStream fileOutputStream3 = null;
        try {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file3.exists()) {
                fileOutputStream2 = null;
            } else {
                zipInputStream = new java.util.zip.ZipInputStream(context.getAssets().open("icudt46l.zip"));
                try {
                    try {
                        zipInputStream.getNextEntry();
                        fileOutputStream2 = new java.io.FileOutputStream(file3);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i <= 0) {
                                    break;
                                } else {
                                    fileOutputStream2.write(bArr, 0, i);
                                }
                            }
                            zipInputStream3 = zipInputStream;
                        } catch (java.lang.Exception e) {
                            fileOutputStream3 = fileOutputStream2;
                            e = e;
                            android.util.Log.e(TAG, "Error copying icu dat file", e);
                            if (file3.exists()) {
                                file3.delete();
                            }
                            throw new java.lang.RuntimeException(e);
                        } catch (java.lang.Throwable th) {
                            zipInputStream2 = zipInputStream;
                            fileOutputStream = fileOutputStream2;
                            th = th;
                            if (zipInputStream2 != null) {
                                try {
                                    zipInputStream2.close();
                                } catch (java.io.IOException e2) {
                                    android.util.Log.e(TAG, "Error in closing streams IO streams after expanding ICU dat file", e2);
                                    throw new java.lang.RuntimeException(e2);
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream3;
                    zipInputStream2 = zipInputStream;
                }
            }
            if (zipInputStream3 != null) {
                try {
                    zipInputStream3.close();
                } catch (java.io.IOException e4) {
                    android.util.Log.e(TAG, "Error in closing streams IO streams after expanding ICU dat file", e4);
                    throw new java.lang.RuntimeException(e4);
                }
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            zipInputStream = null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static synchronized void loadLibs(android.content.Context context) {
        loadLibs(context, context.getFilesDir());
    }

    public static synchronized void loadLibs(android.content.Context context, java.io.File file) {
        loadLibs(context, file, new net.sqlcipher.database.SQLiteDatabase.LibraryLoader() { // from class: net.sqlcipher.database.SQLiteDatabase.1
            @Override // net.sqlcipher.database.SQLiteDatabase.LibraryLoader
            public void loadLibraries(java.lang.String... strArr) {
                for (java.lang.String str : strArr) {
                    java.lang.System.loadLibrary(str);
                }
            }
        });
    }

    public static synchronized void loadLibs(android.content.Context context, net.sqlcipher.database.SQLiteDatabase.LibraryLoader libraryLoader) {
        loadLibs(context, context.getFilesDir(), libraryLoader);
    }

    public static synchronized void loadLibs(android.content.Context context, java.io.File file, net.sqlcipher.database.SQLiteDatabase.LibraryLoader libraryLoader) {
        libraryLoader.loadLibraries("sqlcipher");
    }

    void addSQLiteClosable(net.sqlcipher.database.SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.put(sQLiteClosable, null);
        } finally {
            unlock();
        }
    }

    void removeSQLiteClosable(net.sqlcipher.database.SQLiteClosable sQLiteClosable) {
        lock();
        try {
            this.mPrograms.remove(sQLiteClosable);
        } finally {
            unlock();
        }
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleased() {
        if (isOpen()) {
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    public void setLockingEnabled(boolean z) {
        this.mLockingEnabled = z;
    }

    void onCorruption() {
        android.util.Log.e(TAG, "Calling error handler for corrupt database (detected) " + this.mPath);
        this.mErrorHandler.onCorruption(this);
    }

    void lock() {
        if (this.mLockingEnabled) {
            this.mLock.lock();
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                this.mLockAcquiredWallTime = android.os.SystemClock.elapsedRealtime();
                this.mLockAcquiredThreadTime = android.os.Debug.threadCpuTimeNanos();
            }
        }
    }

    private void lockForced() {
        this.mLock.lock();
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            this.mLockAcquiredWallTime = android.os.SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = android.os.Debug.threadCpuTimeNanos();
        }
    }

    void unlock() {
        if (this.mLockingEnabled) {
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
                checkLockHoldTime();
            }
            this.mLock.unlock();
        }
    }

    private void unlockForced() {
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING && this.mLock.getHoldCount() == 1) {
            checkLockHoldTime();
        }
        this.mLock.unlock();
    }

    private void checkLockHoldTime() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.mLockAcquiredWallTime;
        if ((j >= 2000 || android.util.Log.isLoggable(TAG, 2) || jElapsedRealtime - this.mLastLockMessageTime >= 20000) && j > 300) {
            int iThreadCpuTimeNanos = (int) ((android.os.Debug.threadCpuTimeNanos() - this.mLockAcquiredThreadTime) / 1000000);
            if (iThreadCpuTimeNanos > 100 || j > 2000) {
                this.mLastLockMessageTime = jElapsedRealtime;
                java.lang.String str = "lock held on " + this.mPath + " for " + j + "ms. Thread time was " + iThreadCpuTimeNanos + "ms";
                if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE) {
                    android.util.Log.d(TAG, str, new java.lang.Exception());
                } else {
                    android.util.Log.d(TAG, str);
                }
            }
        }
    }

    public void beginTransaction() {
        beginTransactionWithListener(null);
    }

    public void beginTransactionWithListener(net.sqlcipher.database.SQLiteTransactionListener sQLiteTransactionListener) {
        lockForced();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        try {
            if (this.mLock.getHoldCount() > 1) {
                if (this.mInnerTransactionIsSuccessful) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                    android.util.Log.e(TAG, "beginTransaction() failed", illegalStateException);
                    throw illegalStateException;
                }
                return;
            }
            execSQL("BEGIN EXCLUSIVE;");
            this.mTransactionListener = sQLiteTransactionListener;
            this.mTransactionIsSuccessful = true;
            this.mInnerTransactionIsSuccessful = false;
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (java.lang.RuntimeException e) {
                    execSQL("ROLLBACK;");
                    throw e;
                }
            }
        } catch (java.lang.Throwable th) {
            unlockForced();
            throw th;
        }
    }

    public void endTransaction() {
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        if (!this.mLock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalStateException("no transaction pending");
        }
        try {
            if (this.mInnerTransactionIsSuccessful) {
                this.mInnerTransactionIsSuccessful = false;
            } else {
                this.mTransactionIsSuccessful = false;
            }
            if (this.mLock.getHoldCount() == 1) {
                net.sqlcipher.database.SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
                if (sQLiteTransactionListener != null) {
                    try {
                        if (this.mTransactionIsSuccessful) {
                            sQLiteTransactionListener.onCommit();
                        } else {
                            sQLiteTransactionListener.onRollback();
                        }
                        e = null;
                    } catch (java.lang.RuntimeException e) {
                        e = e;
                        this.mTransactionIsSuccessful = false;
                    }
                } else {
                    e = null;
                }
                if (this.mTransactionIsSuccessful) {
                    execSQL(COMMIT_SQL);
                } else {
                    try {
                        execSQL("ROLLBACK;");
                        if (e != null) {
                            throw e;
                        }
                    } catch (net.sqlcipher.SQLException unused) {
                        android.util.Log.d(TAG, "exception during rollback, maybe the DB previously performed an auto-rollback");
                    }
                }
                this.mTransactionListener = null;
                unlockForced();
                return;
            }
            this.mTransactionListener = null;
            unlockForced();
        } catch (java.lang.Throwable th) {
            this.mTransactionListener = null;
            unlockForced();
            throw th;
        }
    }

    public void setTransactionSuccessful() {
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        if (!this.mLock.isHeldByCurrentThread()) {
            throw new java.lang.IllegalStateException("no transaction pending");
        }
        if (this.mInnerTransactionIsSuccessful) {
            throw new java.lang.IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
        this.mInnerTransactionIsSuccessful = true;
    }

    public boolean inTransaction() {
        return this.mLock.getHoldCount() > 0;
    }

    public boolean isDbLockedByCurrentThread() {
        return this.mLock.isHeldByCurrentThread();
    }

    public boolean isDbLockedByOtherThreads() {
        return !this.mLock.isHeldByCurrentThread() && this.mLock.isLocked();
    }

    @java.lang.Deprecated
    public boolean yieldIfContended() {
        if (isOpen()) {
            return yieldIfContendedHelper(false, -1L);
        }
        return false;
    }

    public boolean yieldIfContendedSafely() {
        if (isOpen()) {
            return yieldIfContendedHelper(true, -1L);
        }
        return false;
    }

    public boolean yieldIfContendedSafely(long j) {
        if (isOpen()) {
            return yieldIfContendedHelper(true, j);
        }
        return false;
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        if (this.mLock.getQueueLength() == 0) {
            this.mLockAcquiredWallTime = android.os.SystemClock.elapsedRealtime();
            this.mLockAcquiredThreadTime = android.os.Debug.threadCpuTimeNanos();
            return false;
        }
        setTransactionSuccessful();
        net.sqlcipher.database.SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
        endTransaction();
        if (z && isDbLockedByCurrentThread()) {
            throw new java.lang.IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
        }
        if (j > 0) {
            while (j > 0) {
                try {
                    java.lang.Thread.sleep(j < 1000 ? j : 1000L);
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.interrupted();
                }
                j -= 1000;
                if (this.mLock.getQueueLength() == 0) {
                    break;
                }
            }
        }
        beginTransactionWithListener(sQLiteTransactionListener);
        return true;
    }

    public java.util.Map<java.lang.String, java.lang.String> getSyncedTables() {
        java.util.HashMap map;
        synchronized (this.mSyncUpdateInfo) {
            map = new java.util.HashMap();
            for (java.lang.String str : this.mSyncUpdateInfo.keySet()) {
                net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo syncUpdateInfo = this.mSyncUpdateInfo.get(str);
                if (syncUpdateInfo.deletedTable != null) {
                    map.put(str, syncUpdateInfo.deletedTable);
                }
            }
        }
        return map;
    }

    private static class SyncUpdateInfo {
        java.lang.String deletedTable;
        java.lang.String foreignKey;
        java.lang.String masterTable;

        SyncUpdateInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String str, java.lang.String str2, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        return openDatabase(str, str2, cursorFactory, i, (net.sqlcipher.database.SQLiteDatabaseHook) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        return openDatabase(str, cArr, cursorFactory, i, (net.sqlcipher.database.SQLiteDatabaseHook) null, (net.sqlcipher.DatabaseErrorHandler) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String str, java.lang.String str2, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, (net.sqlcipher.DatabaseErrorHandler) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, (net.sqlcipher.DatabaseErrorHandler) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String str, java.lang.String str2, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        net.sqlcipher.database.SQLiteDatabase sQLiteDatabase;
        if (databaseErrorHandler == null) {
            databaseErrorHandler = new net.sqlcipher.DefaultDatabaseErrorHandler();
        }
        try {
            sQLiteDatabase = new net.sqlcipher.database.SQLiteDatabase(str, cursorFactory, i, databaseErrorHandler);
            try {
                sQLiteDatabase.openDatabaseInternal(cArr, sQLiteDatabaseHook);
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                e = e;
                android.util.Log.e(TAG, "Calling error handler for corrupt database " + str, e);
                databaseErrorHandler.onCorruption(sQLiteDatabase);
                sQLiteDatabase = new net.sqlcipher.database.SQLiteDatabase(str, cursorFactory, i, databaseErrorHandler);
                sQLiteDatabase.openDatabaseInternal(cArr, sQLiteDatabaseHook);
            }
        } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e2) {
            e = e2;
            sQLiteDatabase = null;
        }
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS) {
            sQLiteDatabase.enableSqlTracing(str);
        }
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME) {
            sQLiteDatabase.enableSqlProfiling(str);
        }
        synchronized (sActiveDatabases) {
            sActiveDatabases.put(sQLiteDatabase, null);
        }
        return sQLiteDatabase;
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, (net.sqlcipher.DatabaseErrorHandler) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, java.lang.String str2, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, str2, cursorFactory, CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        return openOrCreateDatabase(file == null ? null : file.getPath(), str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, java.lang.String str2, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, str2 == null ? null : str2.toCharArray(), cursorFactory, CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        return openDatabase(str, cArr, cursorFactory, CREATE_IF_NECESSARY, sQLiteDatabaseHook);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        return openDatabase(str, cArr, cursorFactory, CREATE_IF_NECESSARY, sQLiteDatabaseHook, databaseErrorHandler);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.io.File file, java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openOrCreateDatabase(file, str, cursorFactory, (net.sqlcipher.database.SQLiteDatabaseHook) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, java.lang.String str2, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(str, str2, cursorFactory, CREATE_IF_NECESSARY, (net.sqlcipher.database.SQLiteDatabaseHook) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory) {
        return openDatabase(str, cArr, cursorFactory, CREATE_IF_NECESSARY, (net.sqlcipher.database.SQLiteDatabaseHook) null);
    }

    public static net.sqlcipher.database.SQLiteDatabase create(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str) {
        return openDatabase(MEMORY, str == null ? null : str.toCharArray(), cursorFactory, CREATE_IF_NECESSARY);
    }

    public static net.sqlcipher.database.SQLiteDatabase create(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, char[] cArr) {
        return openDatabase(MEMORY, cArr, cursorFactory, CREATE_IF_NECESSARY);
    }

    public void close() {
        if (isOpen()) {
            lock();
            try {
                closeClosable();
                onAllReferencesReleased();
            } finally {
                unlock();
            }
        }
    }

    private void closeClosable() {
        deallocCachedSqlStatements();
        java.util.Iterator<java.util.Map.Entry<net.sqlcipher.database.SQLiteClosable, java.lang.Object>> it = this.mPrograms.entrySet().iterator();
        while (it.hasNext()) {
            net.sqlcipher.database.SQLiteClosable key = it.next().getKey();
            if (key != null) {
                key.onAllReferencesReleasedFromContainer();
            }
        }
    }

    public int getVersion() throws java.lang.Throwable {
        net.sqlcipher.database.SQLiteStatement sQLiteStatement;
        java.lang.Throwable th;
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        try {
            sQLiteStatement = new net.sqlcipher.database.SQLiteStatement(this, "PRAGMA user_version;");
            try {
                int iSimpleQueryForLong = (int) sQLiteStatement.simpleQueryForLong();
                sQLiteStatement.close();
                unlock();
                return iSimpleQueryForLong;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }

    public void setVersion(int i) {
        execSQL("PRAGMA user_version = " + i);
    }

    public long getMaximumSize() throws java.lang.Throwable {
        net.sqlcipher.database.SQLiteStatement sQLiteStatement;
        java.lang.Throwable th;
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        try {
            sQLiteStatement = new net.sqlcipher.database.SQLiteStatement(this, "PRAGMA max_page_count;");
            try {
                long jSimpleQueryForLong = sQLiteStatement.simpleQueryForLong() * getPageSize();
                sQLiteStatement.close();
                unlock();
                return jSimpleQueryForLong;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }

    public long setMaximumSize(long j) throws java.lang.Throwable {
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        net.sqlcipher.database.SQLiteStatement sQLiteStatement = null;
        try {
            long pageSize = getPageSize();
            long j2 = j / pageSize;
            if (j % pageSize != 0) {
                j2++;
            }
            net.sqlcipher.database.SQLiteStatement sQLiteStatement2 = new net.sqlcipher.database.SQLiteStatement(this, "PRAGMA max_page_count = " + j2);
            try {
                long jSimpleQueryForLong = sQLiteStatement2.simpleQueryForLong() * pageSize;
                sQLiteStatement2.close();
                unlock();
                return jSimpleQueryForLong;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteStatement = sQLiteStatement2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public long getPageSize() throws java.lang.Throwable {
        net.sqlcipher.database.SQLiteStatement sQLiteStatement;
        java.lang.Throwable th;
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        try {
            sQLiteStatement = new net.sqlcipher.database.SQLiteStatement(this, "PRAGMA page_size;");
            try {
                long jSimpleQueryForLong = sQLiteStatement.simpleQueryForLong();
                sQLiteStatement.close();
                unlock();
                return jSimpleQueryForLong;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                unlock();
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            sQLiteStatement = null;
            th = th3;
        }
    }

    public void setPageSize(long j) {
        execSQL("PRAGMA page_size = " + j);
    }

    public void markTableSyncable(java.lang.String str, java.lang.String str2) {
        if (!isOpen()) {
            throw new net.sqlcipher.database.SQLiteException("database not open");
        }
        markTableSyncable(str, "_id", str, str2);
    }

    public void markTableSyncable(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!isOpen()) {
            throw new net.sqlcipher.database.SQLiteException("database not open");
        }
        markTableSyncable(str, str2, str3, null);
    }

    private void markTableSyncable(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        lock();
        try {
            native_execSQL("SELECT _sync_dirty FROM " + str3 + " LIMIT 0");
            native_execSQL("SELECT " + str2 + " FROM " + str + " LIMIT 0");
            unlock();
            net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo syncUpdateInfo = new net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } catch (java.lang.Throwable th) {
            unlock();
            throw th;
        }
    }

    void rowUpdated(java.lang.String str, long j) {
        net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            execSQL("UPDATE " + syncUpdateInfo.masterTable + " SET _sync_dirty=1 WHERE _id=(SELECT " + syncUpdateInfo.foreignKey + " FROM " + str + " WHERE _id=" + j + ")");
        }
    }

    public static java.lang.String findEditTable(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            int iIndexOf = str.indexOf(32);
            int iIndexOf2 = str.indexOf(44);
            if (iIndexOf > 0 && (iIndexOf < iIndexOf2 || iIndexOf2 < 0)) {
                return str.substring(0, iIndexOf);
            }
            if (iIndexOf2 > 0) {
                return (iIndexOf2 < iIndexOf || iIndexOf < 0) ? str.substring(0, iIndexOf2) : str;
            }
            return str;
        }
        throw new java.lang.IllegalStateException("Invalid tables");
    }

    public net.sqlcipher.database.SQLiteStatement compileStatement(java.lang.String str) throws net.sqlcipher.SQLException {
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        try {
            return new net.sqlcipher.database.SQLiteStatement(this, str);
        } finally {
            unlock();
        }
    }

    public net.sqlcipher.Cursor query(boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return queryWithFactory(null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public net.sqlcipher.Cursor queryWithFactory(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, boolean z, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        return rawQueryWithFactory(cursorFactory, net.sqlcipher.database.SQLiteQueryBuilder.buildQueryString(z, str, strArr, str2, str3, str4, str5, str6), strArr2, findEditTable(str));
    }

    public net.sqlcipher.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, null);
    }

    public net.sqlcipher.Cursor query(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    public net.sqlcipher.Cursor rawQuery(java.lang.String str, java.lang.String[] strArr) {
        return rawQueryWithFactory(null, str, strArr, null);
    }

    public net.sqlcipher.Cursor rawQuery(java.lang.String str, java.lang.Object[] objArr) {
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        long jCurrentTimeMillis = this.mSlowQueryThreshold != -1 ? java.lang.System.currentTimeMillis() : 0L;
        net.sqlcipher.database.SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new net.sqlcipher.database.SQLiteDirectCursorDriver(this, str, null);
        try {
            net.sqlcipher.Cursor cursorQuery = sQLiteDirectCursorDriver.query(this.mFactory, objArr);
            if (this.mSlowQueryThreshold != -1) {
                int count = cursorQuery != null ? cursorQuery.getCount() : -1;
            }
            return new net.sqlcipher.CrossProcessCursorWrapper(cursorQuery);
        } finally {
            if (this.mSlowQueryThreshold != -1) {
                long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 >= this.mSlowQueryThreshold) {
                    android.util.Log.v(TAG, "query (" + jCurrentTimeMillis2 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is -1");
                }
            }
        }
    }

    public net.sqlcipher.Cursor rawQueryWithFactory(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String str, java.lang.String[] strArr, java.lang.String str2) {
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        long jCurrentTimeMillis = this.mSlowQueryThreshold != -1 ? java.lang.System.currentTimeMillis() : 0L;
        net.sqlcipher.database.SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new net.sqlcipher.database.SQLiteDirectCursorDriver(this, str, str2);
        if (cursorFactory == null) {
            try {
                cursorFactory = this.mFactory;
            } finally {
                if (this.mSlowQueryThreshold != -1) {
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis2 >= this.mSlowQueryThreshold) {
                        android.util.Log.v(TAG, "query (" + jCurrentTimeMillis2 + " ms): " + sQLiteDirectCursorDriver.toString() + ", args are <redacted>, count is -1");
                    }
                }
            }
        }
        net.sqlcipher.Cursor cursorQuery = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
        if (this.mSlowQueryThreshold != -1) {
            int count = cursorQuery != null ? cursorQuery.getCount() : -1;
        }
        return new net.sqlcipher.CrossProcessCursorWrapper(cursorQuery);
    }

    public net.sqlcipher.Cursor rawQuery(java.lang.String str, java.lang.String[] strArr, int i, int i2) {
        net.sqlcipher.CursorWrapper cursorWrapper = (net.sqlcipher.CursorWrapper) rawQueryWithFactory(null, str, strArr, null);
        ((net.sqlcipher.database.SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        return cursorWrapper;
    }

    public long insert(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 0);
        } catch (net.sqlcipher.SQLException e) {
            android.util.Log.e(TAG, "Error inserting <redacted values> into " + str, e);
            return -1L;
        }
    }

    public long insertOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) throws net.sqlcipher.SQLException {
        return insertWithOnConflict(str, str2, contentValues, 0);
    }

    public long replace(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) {
        try {
            return insertWithOnConflict(str, str2, contentValues, 5);
        } catch (net.sqlcipher.SQLException e) {
            android.util.Log.e(TAG, "Error inserting <redacted values> into " + str, e);
            return -1L;
        }
    }

    public long replaceOrThrow(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues) throws net.sqlcipher.SQLException {
        return insertWithOnConflict(str, str2, contentValues, 5);
    }

    public long insertWithOnConflict(java.lang.String str, java.lang.String str2, android.content.ContentValues contentValues, int i) {
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> setValueSet;
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(152);
        sb.append("INSERT");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(" INTO ");
        sb.append(str);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(40);
        int i2 = 0;
        net.sqlcipher.database.SQLiteProgram sQLiteProgram = null;
        if (contentValues != null && contentValues.size() > 0) {
            setValueSet = contentValues.valueSet();
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> it = setValueSet.iterator();
            sb.append('(');
            boolean z = false;
            while (it.hasNext()) {
                if (z) {
                    sb.append(", ");
                    sb2.append(", ");
                }
                sb.append(it.next().getKey());
                sb2.append('?');
                z = true;
            }
            sb.append(')');
        } else {
            sb.append("(" + str2 + ") ");
            sb2.append("NULL");
            setValueSet = null;
        }
        sb.append(" VALUES(");
        sb.append((java.lang.CharSequence) sb2);
        sb.append(");");
        lock();
        try {
            try {
                net.sqlcipher.database.SQLiteStatement sQLiteStatementCompileStatement = compileStatement(sb.toString());
                if (setValueSet != null) {
                    int size = setValueSet.size();
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> it2 = setValueSet.iterator();
                    while (i2 < size) {
                        i2++;
                        net.sqlcipher.DatabaseUtils.bindObjectToProgram(sQLiteStatementCompileStatement, i2, it2.next().getValue());
                    }
                }
                sQLiteStatementCompileStatement.execute();
                long jLastInsertRow = lastChangeCount() > 0 ? lastInsertRow() : -1L;
                if (jLastInsertRow == -1) {
                    android.util.Log.e(TAG, "Error inserting <redacted values> using <redacted sql> into " + str);
                } else if (android.util.Log.isLoggable(TAG, 2)) {
                    android.util.Log.v(TAG, "Inserting row " + jLastInsertRow + " from <redacted values> using <redacted sql> into " + str);
                }
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                unlock();
                return jLastInsertRow;
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                sQLiteProgram.close();
            }
            unlock();
            throw th;
        }
    }

    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        java.lang.String str3;
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        net.sqlcipher.database.SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("DELETE FROM ");
                sb.append(str);
                if (android.text.TextUtils.isEmpty(str2)) {
                    str3 = "";
                } else {
                    str3 = " WHERE " + str2;
                }
                sb.append(str3);
                sQLiteStatementCompileStatement = compileStatement(sb.toString());
                if (strArr != null) {
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        net.sqlcipher.DatabaseUtils.bindObjectToProgram(sQLiteStatementCompileStatement, i2, strArr[i]);
                        i = i2;
                    }
                }
                sQLiteStatementCompileStatement.execute();
                int iLastChangeCount = lastChangeCount();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                unlock();
                return iLastChangeCount;
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (sQLiteStatementCompileStatement != null) {
                sQLiteStatementCompileStatement.close();
            }
            unlock();
            throw th;
        }
    }

    public int update(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return updateWithOnConflict(str, contentValues, str2, strArr, 0);
    }

    public int updateWithOnConflict(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr, int i) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new java.lang.IllegalArgumentException("Empty values");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(CONFLICT_VALUES[i]);
        sb.append(str);
        sb.append(" SET ");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> setValueSet = contentValues.valueSet();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> it = setValueSet.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getKey());
            sb.append("=?");
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        net.sqlcipher.database.SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                sQLiteStatementCompileStatement = compileStatement(sb.toString());
                int size = setValueSet.size();
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Object>> it2 = setValueSet.iterator();
                int i2 = 1;
                for (int i3 = 0; i3 < size; i3++) {
                    net.sqlcipher.DatabaseUtils.bindObjectToProgram(sQLiteStatementCompileStatement, i2, it2.next().getValue());
                    i2++;
                }
                if (strArr != null) {
                    for (java.lang.String str3 : strArr) {
                        sQLiteStatementCompileStatement.bindString(i2, str3);
                        i2++;
                    }
                }
                sQLiteStatementCompileStatement.execute();
                int iLastChangeCount = lastChangeCount();
                if (android.util.Log.isLoggable(TAG, 2)) {
                    android.util.Log.v(TAG, "Updated " + iLastChangeCount + " rows using <redacted values> and <redacted sql> for " + str);
                }
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                unlock();
                return iLastChangeCount;
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            } catch (net.sqlcipher.SQLException e2) {
                android.util.Log.e(TAG, "Error updating <redacted values> using <redacted sql> for " + str);
                throw e2;
            }
        } catch (java.lang.Throwable th) {
            if (sQLiteStatementCompileStatement != null) {
                sQLiteStatementCompileStatement.close();
            }
            unlock();
            throw th;
        }
    }

    public void execSQL(java.lang.String str) throws net.sqlcipher.SQLException {
        android.os.SystemClock.uptimeMillis();
        lock();
        try {
            if (!isOpen()) {
                throw new java.lang.IllegalStateException("database not open");
            }
            try {
                native_execSQL(str);
                unlock();
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            unlock();
            throw th;
        }
    }

    public void rawExecSQL(java.lang.String str) {
        android.os.SystemClock.uptimeMillis();
        lock();
        try {
            if (!isOpen()) {
                throw new java.lang.IllegalStateException("database not open");
            }
            try {
                native_rawExecSQL(str);
                unlock();
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            unlock();
            throw th;
        }
    }

    public void execSQL(java.lang.String str, java.lang.Object[] objArr) throws net.sqlcipher.SQLException {
        if (objArr == null) {
            throw new java.lang.IllegalArgumentException("Empty bindArgs");
        }
        android.os.SystemClock.uptimeMillis();
        lock();
        if (!isOpen()) {
            throw new java.lang.IllegalStateException("database not open");
        }
        net.sqlcipher.database.SQLiteStatement sQLiteStatementCompileStatement = null;
        try {
            try {
                sQLiteStatementCompileStatement = compileStatement(str);
                if (objArr != null) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        net.sqlcipher.DatabaseUtils.bindObjectToProgram(sQLiteStatementCompileStatement, i2, objArr[i]);
                        i = i2;
                    }
                }
                sQLiteStatementCompileStatement.execute();
                if (sQLiteStatementCompileStatement != null) {
                    sQLiteStatementCompileStatement.close();
                }
                unlock();
            } catch (net.sqlcipher.database.SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } catch (java.lang.Throwable th) {
            if (sQLiteStatementCompileStatement != null) {
                sQLiteStatementCompileStatement.close();
            }
            unlock();
            throw th;
        }
    }

    protected void finalize() {
        if (isOpen()) {
            android.util.Log.e(TAG, "close() was never explicitly called on database '" + this.mPath + "' ", this.mStackTrace);
            closeClosable();
            onAllReferencesReleased();
        }
    }

    public SQLiteDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, (net.sqlcipher.DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, null);
    }

    public SQLiteDatabase(java.lang.String str, char[] cArr, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (net.sqlcipher.DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    private SQLiteDatabase(java.lang.String str, net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, int i, net.sqlcipher.DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new java.util.concurrent.locks.ReentrantLock(true);
        this.mLockAcquiredWallTime = 0L;
        this.mLockAcquiredThreadTime = 0L;
        this.mLastLockMessageTime = 0L;
        this.mLastSqlStatement = null;
        this.mNativeHandle = 0L;
        this.mTempTableSequence = 0;
        this.mPathForLogs = null;
        this.mCompiledQueries = new java.util.HashMap();
        this.mMaxSqlCacheSize = 250;
        this.mTimeOpened = null;
        this.mTimeClosed = null;
        this.mStackTrace = null;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new java.util.HashMap();
        if (str == null) {
            throw new java.lang.IllegalArgumentException("path should not be null");
        }
        this.mFlags = i;
        this.mPath = str;
        this.mSlowQueryThreshold = -1;
        this.mStackTrace = new net.sqlcipher.database.DatabaseObjectNotClosedException().fillInStackTrace();
        this.mFactory = cursorFactory;
        this.mPrograms = new java.util.WeakHashMap<>();
        this.mErrorHandler = databaseErrorHandler;
    }

    private void openDatabaseInternal(final char[] cArr, net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook) {
        final byte[] bytes = getBytes(cArr);
        dbopen(this.mPath, this.mFlags);
        int i = 0;
        try {
            try {
                keyDatabase(sQLiteDatabaseHook, new java.lang.Runnable() { // from class: net.sqlcipher.database.SQLiteDatabase.2
                    @Override // java.lang.Runnable
                    public void run() {
                        byte[] bArr = bytes;
                        if (bArr == null || bArr.length <= 0) {
                            return;
                        }
                        net.sqlcipher.database.SQLiteDatabase.this.key(bArr);
                    }
                });
                if (bytes == null || bytes.length <= 0) {
                    return;
                }
                int length = bytes.length;
                while (i < length) {
                    byte b = bytes[i];
                    i++;
                }
            } catch (java.lang.RuntimeException e) {
                if (containsNull(cArr)) {
                    keyDatabase(sQLiteDatabaseHook, new java.lang.Runnable() { // from class: net.sqlcipher.database.SQLiteDatabase.3
                        @Override // java.lang.Runnable
                        public void run() {
                            char[] cArr2 = cArr;
                            if (cArr2 != null) {
                                net.sqlcipher.database.SQLiteDatabase.this.key_mutf8(cArr2);
                            }
                        }
                    });
                    if (bytes != null && bytes.length > 0) {
                        rekey(bytes);
                    }
                    if (bytes == null || bytes.length <= 0) {
                        return;
                    }
                    int length2 = bytes.length;
                    while (i < length2) {
                        byte b2 = bytes[i];
                        i++;
                    }
                    return;
                }
                throw e;
            }
        } catch (java.lang.Throwable th) {
            dbclose();
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            if (bytes != null && bytes.length > 0) {
                int length3 = bytes.length;
                while (i < length3) {
                    byte b3 = bytes[i];
                    i++;
                }
            }
            throw th;
        }
    }

    private boolean containsNull(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return false;
        }
        for (char c : cArr) {
            if (c == 0) {
                return true;
            }
        }
        return false;
    }

    private void keyDatabase(net.sqlcipher.database.SQLiteDatabaseHook sQLiteDatabaseHook, java.lang.Runnable runnable) {
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.preKey(this);
        }
        if (runnable != null) {
            runnable.run();
        }
        if (sQLiteDatabaseHook != null) {
            sQLiteDatabaseHook.postKey(this);
        }
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
            this.mTimeOpened = getTime();
        }
        try {
            net.sqlcipher.Cursor cursorRawQuery = rawQuery("select count(*) from sqlite_master;", new java.lang.String[0]);
            if (cursorRawQuery != null) {
                cursorRawQuery.moveToFirst();
                cursorRawQuery.getInt(0);
                cursorRawQuery.close();
            }
        } catch (java.lang.RuntimeException e) {
            android.util.Log.e(TAG, e.getMessage(), e);
            throw e;
        }
    }

    private java.lang.String getTime() {
        return new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", java.util.Locale.US).format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public boolean isReadOnly() {
        return (this.mFlags & 1) == 1;
    }

    public boolean isOpen() {
        return this.mNativeHandle != 0;
    }

    public boolean needUpgrade(int i) {
        return i > getVersion();
    }

    public final java.lang.String getPath() {
        return this.mPath;
    }

    private java.lang.String getPathForLogs() {
        java.lang.String str = this.mPathForLogs;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.mPath;
        if (str2 == null) {
            return null;
        }
        if (str2.indexOf(64) == -1) {
            this.mPathForLogs = this.mPath;
        } else {
            this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
        }
        return this.mPathForLogs;
    }

    public void setLocale(java.util.Locale locale) {
        lock();
        try {
            native_setLocale(locale.toString(), this.mFlags);
        } finally {
            unlock();
        }
    }

    void addToCompiledQueries(java.lang.String str, net.sqlcipher.database.SQLiteCompiledSql sQLiteCompiledSql) {
        if (this.mMaxSqlCacheSize == 0) {
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
                android.util.Log.v(TAG, "|NOT adding_sql_to_cache|" + getPath() + "|" + str);
                return;
            }
            return;
        }
        synchronized (this.mCompiledQueries) {
            if (this.mCompiledQueries.get(str) != null) {
                return;
            }
            if (this.mCompiledQueries.size() == this.mMaxSqlCacheSize) {
                int i = this.mCacheFullWarnings + 1;
                this.mCacheFullWarnings = i;
                if (i == 1) {
                    android.util.Log.w(TAG, "Reached MAX size for compiled-sql statement cache for database " + getPath() + "; i.e., NO space for this sql statement in cache: " + str + ". Please change your sql statements to use '?' for bindargs, instead of using actual values");
                }
            } else {
                this.mCompiledQueries.put(str, sQLiteCompiledSql);
                if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
                    android.util.Log.v(TAG, "|adding_sql_to_cache|" + getPath() + "|" + this.mCompiledQueries.size() + "|" + str);
                }
            }
        }
    }

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            java.util.Iterator<net.sqlcipher.database.SQLiteCompiledSql> it = this.mCompiledQueries.values().iterator();
            while (it.hasNext()) {
                it.next().releaseSqlStatement();
            }
            this.mCompiledQueries.clear();
        }
    }

    net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String str) {
        synchronized (this.mCompiledQueries) {
            if (this.mMaxSqlCacheSize == 0) {
                if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
                    android.util.Log.v(TAG, "|cache NOT found|" + getPath());
                }
                return null;
            }
            net.sqlcipher.database.SQLiteCompiledSql sQLiteCompiledSql = this.mCompiledQueries.get(str);
            boolean z = sQLiteCompiledSql != null;
            if (z) {
                this.mNumCacheHits++;
            } else {
                this.mNumCacheMisses++;
            }
            if (net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE) {
                android.util.Log.v(TAG, "|cache_stats|" + getPath() + "|" + this.mCompiledQueries.size() + "|" + this.mNumCacheHits + "|" + this.mNumCacheMisses + "|" + z + "|" + this.mTimeOpened + "|" + this.mTimeClosed + "|" + str);
            }
            return sQLiteCompiledSql;
        }
    }

    public boolean isInCompiledSqlCache(java.lang.String str) {
        boolean zContainsKey;
        synchronized (this.mCompiledQueries) {
            zContainsKey = this.mCompiledQueries.containsKey(str);
        }
        return zContainsKey;
    }

    public void purgeFromCompiledSqlCache(java.lang.String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    public synchronized int getMaxSqlCacheSize() {
        return this.mMaxSqlCacheSize;
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        try {
            if (i > 250 || i < 0) {
                throw new java.lang.IllegalStateException("expected value between 0 and 250");
            }
            if (i < this.mMaxSqlCacheSize) {
                throw new java.lang.IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
            }
            this.mMaxSqlCacheSize = i;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    static java.util.ArrayList<net.sqlcipher.database.SQLiteDebug.DbStats> getDbStats() throws java.lang.Throwable {
        java.lang.String str;
        java.util.ArrayList<net.sqlcipher.database.SQLiteDebug.DbStats> arrayList = new java.util.ArrayList<>();
        for (net.sqlcipher.database.SQLiteDatabase sQLiteDatabase : getActiveDatabases()) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                int iNative_getDbLookaside = sQLiteDatabase.native_getDbLookaside();
                java.lang.String path = sQLiteDatabase.getPath();
                int iLastIndexOf = path.lastIndexOf("/");
                java.lang.String strSubstring = path.substring(iLastIndexOf != -1 ? iLastIndexOf + 1 : 0);
                java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> attachedDbs = getAttachedDbs(sQLiteDatabase);
                if (attachedDbs != null) {
                    for (int i = 0; i < attachedDbs.size(); i++) {
                        android.util.Pair<java.lang.String, java.lang.String> pair = attachedDbs.get(i);
                        long pragmaVal = getPragmaVal(sQLiteDatabase, ((java.lang.String) pair.first) + ".page_count;");
                        if (i == 0) {
                            str = strSubstring;
                        } else {
                            java.lang.String string = "  (attached) " + ((java.lang.String) pair.first);
                            if (((java.lang.String) pair.second).trim().length() > 0) {
                                int iLastIndexOf2 = ((java.lang.String) pair.second).lastIndexOf("/");
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(string);
                                sb.append(" : ");
                                sb.append(((java.lang.String) pair.second).substring(iLastIndexOf2 != -1 ? iLastIndexOf2 + 1 : 0));
                                string = sb.toString();
                            }
                            str = string;
                            iNative_getDbLookaside = 0;
                        }
                        if (pragmaVal > 0) {
                            arrayList.add(new net.sqlcipher.database.SQLiteDebug.DbStats(str, pragmaVal, sQLiteDatabase.getPageSize(), iNative_getDbLookaside));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static java.util.ArrayList<net.sqlcipher.database.SQLiteDatabase> getActiveDatabases() {
        java.util.ArrayList<net.sqlcipher.database.SQLiteDatabase> arrayList = new java.util.ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase, java.lang.String str) throws java.lang.Throwable {
        if (!sQLiteDatabase.isOpen()) {
            return 0L;
        }
        net.sqlcipher.database.SQLiteStatement sQLiteStatement = null;
        try {
            net.sqlcipher.database.SQLiteStatement sQLiteStatement2 = new net.sqlcipher.database.SQLiteStatement(sQLiteDatabase, "PRAGMA " + str);
            try {
                long jSimpleQueryForLong = sQLiteStatement2.simpleQueryForLong();
                sQLiteStatement2.close();
                return jSimpleQueryForLong;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteStatement = sQLiteStatement2;
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isOpen()) {
            return null;
        }
        java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>();
        net.sqlcipher.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("pragma database_list;", (java.lang.String[]) null);
        while (cursorRawQuery.moveToNext()) {
            arrayList.add(new android.util.Pair<>(cursorRawQuery.getString(1), cursorRawQuery.getString(2)));
        }
        cursorRawQuery.close();
        return arrayList;
    }

    private byte[] getBytes(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return null;
        }
        java.nio.ByteBuffer byteBufferEncode = java.nio.charset.Charset.forName("UTF-8").encode(java.nio.CharBuffer.wrap(cArr));
        byte[] bArr = new byte[byteBufferEncode.limit()];
        byteBufferEncode.get(bArr);
        return bArr;
    }
}
