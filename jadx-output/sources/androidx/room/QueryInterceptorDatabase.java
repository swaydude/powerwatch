package androidx.room;

/* JADX INFO: loaded from: classes.dex */
final class QueryInterceptorDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {
    private final androidx.sqlite.db.SupportSQLiteDatabase mDelegate;
    private final androidx.room.RoomDatabase.QueryCallback mQueryCallback;
    private final java.util.concurrent.Executor mQueryCallbackExecutor;

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public /* synthetic */ void execPerConnectionSQL(java.lang.String str, java.lang.Object[] objArr) {
        androidx.sqlite.db.SupportSQLiteDatabase.CC.$default$execPerConnectionSQL(this, str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
        return androidx.sqlite.db.SupportSQLiteDatabase.CC.$default$isExecPerConnectionSQLSupported(this);
    }

    QueryInterceptorDatabase(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase, androidx.room.RoomDatabase.QueryCallback queryCallback, java.util.concurrent.Executor executor) {
        this.mDelegate = supportSQLiteDatabase;
        this.mQueryCallback = queryCallback;
        this.mQueryCallbackExecutor = executor;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String str) {
        return new androidx.room.QueryInterceptorStatement(this.mDelegate.compileStatement(str), this.mQueryCallback, str, this.mQueryCallbackExecutor);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransaction() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$mdMz2KzBtUSdwrthK9_RXFoyu08
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$beginTransaction$0$QueryInterceptorDatabase();
            }
        });
        this.mDelegate.beginTransaction();
    }

    public /* synthetic */ void lambda$beginTransaction$0$QueryInterceptorDatabase() {
        this.mQueryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", java.util.Collections.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionNonExclusive() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$2Bw1_mcYTrjaNcvAFu88RWoC1zc
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$beginTransactionNonExclusive$1$QueryInterceptorDatabase();
            }
        });
        this.mDelegate.beginTransactionNonExclusive();
    }

    public /* synthetic */ void lambda$beginTransactionNonExclusive$1$QueryInterceptorDatabase() {
        this.mQueryCallback.onQuery("BEGIN DEFERRED TRANSACTION", java.util.Collections.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$xKFt0--uJ0eEAFQQN9MYAlqXMro
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$beginTransactionWithListener$2$QueryInterceptorDatabase();
            }
        });
        this.mDelegate.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public /* synthetic */ void lambda$beginTransactionWithListener$2$QueryInterceptorDatabase() {
        this.mQueryCallback.onQuery("BEGIN EXCLUSIVE TRANSACTION", java.util.Collections.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$K7eVKVV_4UMPgAi20iUr6OLzlC0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$beginTransactionWithListenerNonExclusive$3$QueryInterceptorDatabase();
            }
        });
        this.mDelegate.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    public /* synthetic */ void lambda$beginTransactionWithListenerNonExclusive$3$QueryInterceptorDatabase() {
        this.mQueryCallback.onQuery("BEGIN DEFERRED TRANSACTION", java.util.Collections.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void endTransaction() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$-r0VJIb-SXaJpWgpFKDtPpC-YbQ
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$endTransaction$4$QueryInterceptorDatabase();
            }
        });
        this.mDelegate.endTransaction();
    }

    public /* synthetic */ void lambda$endTransaction$4$QueryInterceptorDatabase() {
        this.mQueryCallback.onQuery("END TRANSACTION", java.util.Collections.emptyList());
    }

    public /* synthetic */ void lambda$setTransactionSuccessful$5$QueryInterceptorDatabase() {
        this.mQueryCallback.onQuery("TRANSACTION SUCCESSFUL", java.util.Collections.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setTransactionSuccessful() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$G2uMRw08CD8CZIEmWPamLQZm-YY
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$setTransactionSuccessful$5$QueryInterceptorDatabase();
            }
        });
        this.mDelegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean inTransaction() {
        return this.mDelegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDbLockedByCurrentThread() {
        return this.mDelegate.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely() {
        return this.mDelegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean yieldIfContendedSafely(long j) {
        return this.mDelegate.yieldIfContendedSafely(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int getVersion() {
        return this.mDelegate.getVersion();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setVersion(int i) {
        this.mDelegate.setVersion(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getMaximumSize() {
        return this.mDelegate.getMaximumSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long setMaximumSize(long j) {
        return this.mDelegate.setMaximumSize(j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long getPageSize() {
        return this.mDelegate.getPageSize();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setPageSize(long j) {
        this.mDelegate.setPageSize(j);
    }

    public /* synthetic */ void lambda$query$6$QueryInterceptorDatabase(java.lang.String str) {
        this.mQueryCallback.onQuery(str, java.util.Collections.emptyList());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(final java.lang.String str) {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$e_yUx2RhE4gIbG0uPZ5dgwePTvg
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$query$6$QueryInterceptorDatabase(str);
            }
        });
        return this.mDelegate.query(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(final java.lang.String str, java.lang.Object[] objArr) {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(objArr));
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$ef-NYyVgHMhu214LrdLzh16gGOU
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$query$7$QueryInterceptorDatabase(str, arrayList);
            }
        });
        return this.mDelegate.query(str, objArr);
    }

    public /* synthetic */ void lambda$query$7$QueryInterceptorDatabase(java.lang.String str, java.util.List list) {
        this.mQueryCallback.onQuery(str, list);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(final androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
        final androidx.room.QueryInterceptorProgram queryInterceptorProgram = new androidx.room.QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$QtTq_CaWbFOQiMXA3IbTenmcZT4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$query$8$QueryInterceptorDatabase(supportSQLiteQuery, queryInterceptorProgram);
            }
        });
        return this.mDelegate.query(supportSQLiteQuery);
    }

    public /* synthetic */ void lambda$query$8$QueryInterceptorDatabase(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, androidx.room.QueryInterceptorProgram queryInterceptorProgram) {
        this.mQueryCallback.onQuery(supportSQLiteQuery.getSql(), queryInterceptorProgram.getBindArgs());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public android.database.Cursor query(final androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal) {
        final androidx.room.QueryInterceptorProgram queryInterceptorProgram = new androidx.room.QueryInterceptorProgram();
        supportSQLiteQuery.bindTo(queryInterceptorProgram);
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$j065LbIvTXep5D6SsMORdy7nCZ0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$query$9$QueryInterceptorDatabase(supportSQLiteQuery, queryInterceptorProgram);
            }
        });
        return this.mDelegate.query(supportSQLiteQuery);
    }

    public /* synthetic */ void lambda$query$9$QueryInterceptorDatabase(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, androidx.room.QueryInterceptorProgram queryInterceptorProgram) {
        this.mQueryCallback.onQuery(supportSQLiteQuery.getSql(), queryInterceptorProgram.getBindArgs());
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public long insert(java.lang.String str, int i, android.content.ContentValues contentValues) throws android.database.SQLException {
        return this.mDelegate.insert(str, i, contentValues);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int delete(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        return this.mDelegate.delete(str, str2, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public int update(java.lang.String str, int i, android.content.ContentValues contentValues, java.lang.String str2, java.lang.Object[] objArr) {
        return this.mDelegate.update(str, i, contentValues, str2, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final java.lang.String str) throws android.database.SQLException {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$NA95bwzl6ypPQuOg6ufJ2Y9ai7Y
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$execSQL$10$QueryInterceptorDatabase(str);
            }
        });
        this.mDelegate.execSQL(str);
    }

    public /* synthetic */ void lambda$execSQL$10$QueryInterceptorDatabase(java.lang.String str) {
        this.mQueryCallback.onQuery(str, new java.util.ArrayList(0));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void execSQL(final java.lang.String str, java.lang.Object[] objArr) throws android.database.SQLException {
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(java.util.Arrays.asList(objArr));
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorDatabase$GzOyG0dejP0qdpp0SF8gnMV9uEw
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$execSQL$11$QueryInterceptorDatabase(str, arrayList);
            }
        });
        this.mDelegate.execSQL(str, arrayList.toArray());
    }

    public /* synthetic */ void lambda$execSQL$11$QueryInterceptorDatabase(java.lang.String str, java.util.List list) {
        this.mQueryCallback.onQuery(str, list);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isReadOnly() {
        return this.mDelegate.isReadOnly();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.mDelegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean needUpgrade(int i) {
        return this.mDelegate.needUpgrade(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public java.lang.String getPath() {
        return this.mDelegate.getPath();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setLocale(java.util.Locale locale) {
        this.mDelegate.setLocale(locale);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setMaxSqlCacheSize(int i) {
        this.mDelegate.setMaxSqlCacheSize(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void setForeignKeyConstraintsEnabled(boolean z) {
        this.mDelegate.setForeignKeyConstraintsEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean enableWriteAheadLogging() {
        return this.mDelegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public void disableWriteAheadLogging() {
        this.mDelegate.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isWriteAheadLoggingEnabled() {
        return this.mDelegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
        return this.mDelegate.getAttachedDbs();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public boolean isDatabaseIntegrityOk() {
        return this.mDelegate.isDatabaseIntegrityOk();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.mDelegate.close();
    }
}
