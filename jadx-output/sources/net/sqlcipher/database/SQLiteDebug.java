package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDebug {
    public static final boolean DEBUG_SQL_STATEMENTS = android.util.Log.isLoggable("SQLiteStatements", 2);
    public static final boolean DEBUG_SQL_TIME = android.util.Log.isLoggable("SQLiteTime", 2);
    public static final boolean DEBUG_SQL_CACHE = android.util.Log.isLoggable("SQLiteCompiledSql", 2);
    public static final boolean DEBUG_ACTIVE_CURSOR_FINALIZATION = android.util.Log.isLoggable("SQLiteCursorClosing", 2);
    public static final boolean DEBUG_LOCK_TIME_TRACKING = android.util.Log.isLoggable("SQLiteLockTime", 2);
    public static final boolean DEBUG_LOCK_TIME_TRACKING_STACK_TRACE = android.util.Log.isLoggable("SQLiteLockStackTrace", 2);
    private static int sNumActiveCursorsFinalized = 0;

    public static class PagerStats {

        @java.lang.Deprecated
        public long databaseBytes;
        public java.util.ArrayList<net.sqlcipher.database.SQLiteDebug.DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;

        @java.lang.Deprecated
        public int numPagers;
        public int pageCacheOverflo;

        @java.lang.Deprecated
        public long referencedBytes;

        @java.lang.Deprecated
        public long totalBytes;
    }

    public static native long getHeapAllocatedSize();

    public static native void getHeapDirtyPages(int[] iArr);

    public static native long getHeapFreeSize();

    public static native long getHeapSize();

    public static native void getPagerStats(net.sqlcipher.database.SQLiteDebug.PagerStats pagerStats);

    public static class DbStats {
        public java.lang.String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(java.lang.String str, long j, long j2, int i) {
            this.dbName = str;
            this.pageSize = j2;
            this.dbSize = (j * j2) / android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
            this.lookaside = i;
        }
    }

    public static net.sqlcipher.database.SQLiteDebug.PagerStats getDatabaseInfo() {
        net.sqlcipher.database.SQLiteDebug.PagerStats pagerStats = new net.sqlcipher.database.SQLiteDebug.PagerStats();
        getPagerStats(pagerStats);
        pagerStats.dbStats = net.sqlcipher.database.SQLiteDatabase.getDbStats();
        return pagerStats;
    }

    public static int getNumActiveCursorsFinalized() {
        return sNumActiveCursorsFinalized;
    }

    static synchronized void notifyActiveCursorFinalized() {
        sNumActiveCursorsFinalized++;
    }
}
