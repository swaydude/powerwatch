package androidx.room;

/* JADX INFO: loaded from: classes.dex */
final class QueryInterceptorStatement implements androidx.sqlite.db.SupportSQLiteStatement {
    private final java.util.List<java.lang.Object> mBindArgsCache = new java.util.ArrayList();
    private final androidx.sqlite.db.SupportSQLiteStatement mDelegate;
    private final androidx.room.RoomDatabase.QueryCallback mQueryCallback;
    private final java.util.concurrent.Executor mQueryCallbackExecutor;
    private final java.lang.String mSqlStatement;

    QueryInterceptorStatement(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, androidx.room.RoomDatabase.QueryCallback queryCallback, java.lang.String str, java.util.concurrent.Executor executor) {
        this.mDelegate = supportSQLiteStatement;
        this.mQueryCallback = queryCallback;
        this.mSqlStatement = str;
        this.mQueryCallbackExecutor = executor;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorStatement$ChZEMKNCiclAXEh7lB9pSewlyuc
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$execute$0$QueryInterceptorStatement();
            }
        });
        this.mDelegate.execute();
    }

    public /* synthetic */ void lambda$execute$0$QueryInterceptorStatement() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorStatement$Fav2IvQ8S4czZpFSCDm5mZmIxKE
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$executeUpdateDelete$1$QueryInterceptorStatement();
            }
        });
        return this.mDelegate.executeUpdateDelete();
    }

    public /* synthetic */ void lambda$executeUpdateDelete$1$QueryInterceptorStatement() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorStatement$ELQNFMDGOEjhRlX6Wq4FB-kg4Dc
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$executeInsert$2$QueryInterceptorStatement();
            }
        });
        return this.mDelegate.executeInsert();
    }

    public /* synthetic */ void lambda$executeInsert$2$QueryInterceptorStatement() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    public /* synthetic */ void lambda$simpleQueryForLong$3$QueryInterceptorStatement() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorStatement$dTAPeB-lCuLTyuuCOpE0QQVubXc
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$simpleQueryForLong$3$QueryInterceptorStatement();
            }
        });
        return this.mDelegate.simpleQueryForLong();
    }

    public /* synthetic */ void lambda$simpleQueryForString$4$QueryInterceptorStatement() {
        this.mQueryCallback.onQuery(this.mSqlStatement, this.mBindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public java.lang.String simpleQueryForString() {
        this.mQueryCallbackExecutor.execute(new java.lang.Runnable() { // from class: androidx.room.-$$Lambda$QueryInterceptorStatement$2aLJT5BNUCsxdld7XiH57LgIdz8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$simpleQueryForString$4$QueryInterceptorStatement();
            }
        });
        return this.mDelegate.simpleQueryForString();
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i) {
        saveArgsToCache(i, this.mBindArgsCache.toArray());
        this.mDelegate.bindNull(i);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        saveArgsToCache(i, java.lang.Long.valueOf(j));
        this.mDelegate.bindLong(i, j);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        saveArgsToCache(i, java.lang.Double.valueOf(d));
        this.mDelegate.bindDouble(i, d);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i, java.lang.String str) {
        saveArgsToCache(i, str);
        this.mDelegate.bindString(i, str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i, byte[] bArr) {
        saveArgsToCache(i, bArr);
        this.mDelegate.bindBlob(i, bArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.mBindArgsCache.clear();
        this.mDelegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.mDelegate.close();
    }

    private void saveArgsToCache(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 >= this.mBindArgsCache.size()) {
            for (int size = this.mBindArgsCache.size(); size <= i2; size++) {
                this.mBindArgsCache.add(null);
            }
        }
        this.mBindArgsCache.set(i2, obj);
    }
}
