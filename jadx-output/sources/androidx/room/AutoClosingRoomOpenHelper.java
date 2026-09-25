package androidx.room;

/* JADX INFO: loaded from: classes.dex */
final class AutoClosingRoomOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {
    private final androidx.room.AutoCloser mAutoCloser;
    private final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase mAutoClosingDb;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper mDelegateOpenHelper;

    AutoClosingRoomOpenHelper(androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper, androidx.room.AutoCloser autoCloser) {
        this.mDelegateOpenHelper = supportSQLiteOpenHelper;
        this.mAutoCloser = autoCloser;
        autoCloser.init(supportSQLiteOpenHelper);
        this.mAutoClosingDb = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
        return this.mDelegateOpenHelper.getDatabaseName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.mDelegateOpenHelper.setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        this.mAutoClosingDb.pokeOpen();
        return this.mAutoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        this.mAutoClosingDb.pokeOpen();
        return this.mAutoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        try {
            this.mAutoClosingDb.close();
        } catch (java.io.IOException e) {
            androidx.room.util.SneakyThrow.reThrow(e);
        }
    }

    androidx.room.AutoCloser getAutoCloser() {
        return this.mAutoCloser;
    }

    androidx.sqlite.db.SupportSQLiteDatabase getAutoClosingDb() {
        return this.mAutoClosingDb;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public androidx.sqlite.db.SupportSQLiteOpenHelper getDelegate() {
        return this.mDelegateOpenHelper;
    }

    static final class AutoClosingSupportSQLiteDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {
        private final androidx.room.AutoCloser mAutoCloser;

        static /* synthetic */ java.lang.Object lambda$pokeOpen$0(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void execPerConnectionSQL(java.lang.String str, java.lang.Object[] objArr) {
            androidx.sqlite.db.SupportSQLiteDatabase.CC.$default$execPerConnectionSQL(this, str, objArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return androidx.sqlite.db.SupportSQLiteDatabase.CC.$default$isExecPerConnectionSQLSupported(this);
        }

        AutoClosingSupportSQLiteDatabase(androidx.room.AutoCloser autoCloser) {
            this.mAutoCloser = autoCloser;
        }

        void pokeOpen() {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$hug7CM9bxDvNgNDT4597Gsa-NPA
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$pokeOpen$0((androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String str) {
            return new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement(str, this.mAutoCloser);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(sQLiteTransactionListener);
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.mAutoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                throw new java.lang.IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.mAutoCloser.getDelegateDatabase().endTransaction();
            } finally {
                this.mAutoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            androidx.sqlite.db.SupportSQLiteDatabase delegateDatabase = this.mAutoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                throw new java.lang.IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            delegateDatabase.setTransactionSuccessful();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$OXfnp_C5bscCOg9K3v5hKMB-lik
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).inTransaction());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.mAutoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$1TyKvEVVpucjpuF04JbW5oOPuoA
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(androidx.room.$$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long j) {
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(androidx.room.$$Lambda$l0jdGWVgR3o4ffMWMuoLxrLwoQ4.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((java.lang.Integer) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$fmrnqAnJ8Zhws67nX_ahSzS2-Eg
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).getVersion());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(final int i) {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$nxTh-dd7Fq8SYc_P9xauAw60ygY
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$setVersion$1(i, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$setVersion$1(int i, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setVersion(i);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((java.lang.Long) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$8VS5CEbTdC9gIfemRbtNZOudwic
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(final long j) {
            return ((java.lang.Long) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$Lk96dqWDYODi0Rc80l0iikjaCYw
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).setMaximumSize(j));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((java.lang.Long) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$cSHxY42jAQpBeom4xN8Q5sownLI
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).getPageSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(final long j) {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$9vkXE4Eyur58c_KLUjWjiZ95T6o
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$setPageSize$3(j, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$setPageSize$3(long j, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setPageSize(j);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(java.lang.String str) {
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(str), this.mAutoCloser);
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(java.lang.String str, java.lang.Object[] objArr) {
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(str, objArr), this.mAutoCloser);
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery) {
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery), this.mAutoCloser);
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery supportSQLiteQuery, android.os.CancellationSignal cancellationSignal) {
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.mAutoCloser.incrementCountAndEnsureDbIsOpen().query(supportSQLiteQuery, cancellationSignal), this.mAutoCloser);
            } catch (java.lang.Throwable th) {
                this.mAutoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(final java.lang.String str, final int i, final android.content.ContentValues contentValues) throws android.database.SQLException {
            return ((java.lang.Long) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$U3I0tzOpwrjOZFKDLnqJpEMYptQ
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).insert(str, i, contentValues));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(final java.lang.String str, final java.lang.String str2, final java.lang.Object[] objArr) {
            return ((java.lang.Integer) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$92zpt4fT-3HLHaWElMwFV4ZH5DM
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).delete(str, str2, objArr));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(final java.lang.String str, final int i, final android.content.ContentValues contentValues, final java.lang.String str2, final java.lang.Object[] objArr) {
            return ((java.lang.Integer) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$5ow8APT6Xv106tuERnMaDuaR9i4
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).update(str, i, contentValues, str2, objArr));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final java.lang.String str) throws android.database.SQLException {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$JmCZFgYqN8IAleNUA8VAUt1bG9c
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$execSQL$7(str, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$execSQL$7(java.lang.String str, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL(str);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final java.lang.String str, final java.lang.Object[] objArr) throws android.database.SQLException {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$1rVAjIl-UMGj5Yn-_VB8qqaoX5o
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$execSQL$8(str, objArr, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$execSQL$8(java.lang.String str, java.lang.Object[] objArr, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL(str, objArr);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$26g4BEAofEmrWnK48gEjC1cGUv4
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            androidx.sqlite.db.SupportSQLiteDatabase delegateDatabase = this.mAutoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(final int i) {
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$PLHR_6pnM1HOuV-_nP1kgSOaMa8
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).needUpgrade(i));
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public java.lang.String getPath() {
            return (java.lang.String) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$9psQePVjRowsgzqM7zav0SnxIuM
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((androidx.sqlite.db.SupportSQLiteDatabase) obj).getPath();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(final java.util.Locale locale) {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$5VeQK6YZ9AboHp0toeHTm5uTxdc
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$setLocale$10(locale, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$setLocale$10(java.util.Locale locale, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setLocale(locale);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int i) {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$hKuaG-NKsEG-PPEW2UkqcCMPI1s
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$setMaxSqlCacheSize$11(i, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$setMaxSqlCacheSize$11(int i, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.setMaxSqlCacheSize(i);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(final boolean z) {
            this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$4hswM9BdeFhELY9NVLmh5Hkk9cY
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$setForeignKeyConstraintsEnabled$12(z, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$setForeignKeyConstraintsEnabled$12(boolean z, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            if (android.os.Build.VERSION.SDK_INT < 16) {
                return null;
            }
            supportSQLiteDatabase.setForeignKeyConstraintsEnabled(z);
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$b-KdzNDeRaI1t9yiwJWyXV5j2Yw
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.lambda$isWriteAheadLoggingEnabled$13((androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            })).booleanValue();
        }

        static /* synthetic */ java.lang.Boolean lambda$isWriteAheadLoggingEnabled$13(androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            if (android.os.Build.VERSION.SDK_INT >= 16) {
                return java.lang.Boolean.valueOf(supportSQLiteDatabase.isWriteAheadLoggingEnabled());
            }
            return false;
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            return (java.util.List) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$s5txClRPQBekob9pkePxBQ8StEc
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((androidx.sqlite.db.SupportSQLiteDatabase) obj).getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((java.lang.Boolean) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$3kg6KDMQg4jBwdICx1Y0rJtb2hI
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.mAutoCloser.closeDatabaseIfOpen();
        }
    }

    private static final class KeepAliveCursor implements android.database.Cursor {
        private final androidx.room.AutoCloser mAutoCloser;
        private final android.database.Cursor mDelegate;

        KeepAliveCursor(android.database.Cursor cursor, androidx.room.AutoCloser autoCloser) {
            this.mDelegate = cursor;
            this.mAutoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mDelegate.close();
            this.mAutoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.mDelegate.isClosed();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.mDelegate.getCount();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.mDelegate.getPosition();
        }

        @Override // android.database.Cursor
        public boolean move(int i) {
            return this.mDelegate.move(i);
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i) {
            return this.mDelegate.moveToPosition(i);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.mDelegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.mDelegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.mDelegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.mDelegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.mDelegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.mDelegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.mDelegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.mDelegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(java.lang.String str) {
            return this.mDelegate.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(java.lang.String str) throws java.lang.IllegalArgumentException {
            return this.mDelegate.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public java.lang.String getColumnName(int i) {
            return this.mDelegate.getColumnName(i);
        }

        @Override // android.database.Cursor
        public java.lang.String[] getColumnNames() {
            return this.mDelegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.mDelegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i) {
            return this.mDelegate.getBlob(i);
        }

        @Override // android.database.Cursor
        public java.lang.String getString(int i) {
            return this.mDelegate.getString(i);
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i, android.database.CharArrayBuffer charArrayBuffer) {
            this.mDelegate.copyStringToBuffer(i, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public short getShort(int i) {
            return this.mDelegate.getShort(i);
        }

        @Override // android.database.Cursor
        public int getInt(int i) {
            return this.mDelegate.getInt(i);
        }

        @Override // android.database.Cursor
        public long getLong(int i) {
            return this.mDelegate.getLong(i);
        }

        @Override // android.database.Cursor
        public float getFloat(int i) {
            return this.mDelegate.getFloat(i);
        }

        @Override // android.database.Cursor
        public double getDouble(int i) {
            return this.mDelegate.getDouble(i);
        }

        @Override // android.database.Cursor
        public int getType(int i) {
            return this.mDelegate.getType(i);
        }

        @Override // android.database.Cursor
        public boolean isNull(int i) {
            return this.mDelegate.isNull(i);
        }

        @Override // android.database.Cursor
        @java.lang.Deprecated
        public void deactivate() {
            this.mDelegate.deactivate();
        }

        @Override // android.database.Cursor
        @java.lang.Deprecated
        public boolean requery() {
            return this.mDelegate.requery();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(android.database.ContentObserver contentObserver) {
            this.mDelegate.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(android.database.ContentObserver contentObserver) {
            this.mDelegate.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            this.mDelegate.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(android.database.DataSetObserver dataSetObserver) {
            this.mDelegate.unregisterDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(android.content.ContentResolver contentResolver, android.net.Uri uri) {
            this.mDelegate.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(android.content.ContentResolver contentResolver, java.util.List<android.net.Uri> list) {
            androidx.sqlite.db.SupportSQLiteCompat.Api29Impl.setNotificationUris(this.mDelegate, contentResolver, list);
        }

        @Override // android.database.Cursor
        public android.net.Uri getNotificationUri() {
            return androidx.sqlite.db.SupportSQLiteCompat.Api19Impl.getNotificationUri(this.mDelegate);
        }

        @Override // android.database.Cursor
        public java.util.List<android.net.Uri> getNotificationUris() {
            return androidx.sqlite.db.SupportSQLiteCompat.Api29Impl.getNotificationUris(this.mDelegate);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.mDelegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public void setExtras(android.os.Bundle bundle) {
            androidx.sqlite.db.SupportSQLiteCompat.Api23Impl.setExtras(this.mDelegate, bundle);
        }

        @Override // android.database.Cursor
        public android.os.Bundle getExtras() {
            return this.mDelegate.getExtras();
        }

        @Override // android.database.Cursor
        public android.os.Bundle respond(android.os.Bundle bundle) {
            return this.mDelegate.respond(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class AutoClosingSupportSqliteStatement implements androidx.sqlite.db.SupportSQLiteStatement {
        private final androidx.room.AutoCloser mAutoCloser;
        private final java.util.ArrayList<java.lang.Object> mBinds = new java.util.ArrayList<>();
        private final java.lang.String mSql;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
        }

        AutoClosingSupportSqliteStatement(java.lang.String str, androidx.room.AutoCloser autoCloser) {
            this.mSql = str;
            this.mAutoCloser = autoCloser;
        }

        private <T> T executeSqliteStatementWithRefCount(final androidx.arch.core.util.Function<androidx.sqlite.db.SupportSQLiteStatement, T> function) {
            return (T) this.mAutoCloser.executeRefCountingFunction(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$BOH_ZFMRPQcgvS_zTZRrOdsODxg
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return this.f$0.lambda$executeSqliteStatementWithRefCount$0$AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement(function, (androidx.sqlite.db.SupportSQLiteDatabase) obj);
                }
            });
        }

        public /* synthetic */ java.lang.Object lambda$executeSqliteStatementWithRefCount$0$AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement(androidx.arch.core.util.Function function, androidx.sqlite.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementCompileStatement = supportSQLiteDatabase.compileStatement(this.mSql);
            doBinds(supportSQLiteStatementCompileStatement);
            return function.apply(supportSQLiteStatementCompileStatement);
        }

        private void doBinds(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement) {
            int i = 0;
            while (i < this.mBinds.size()) {
                int i2 = i + 1;
                java.lang.Object obj = this.mBinds.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof java.lang.Long) {
                    supportSQLiteStatement.bindLong(i2, ((java.lang.Long) obj).longValue());
                } else if (obj instanceof java.lang.Double) {
                    supportSQLiteStatement.bindDouble(i2, ((java.lang.Double) obj).doubleValue());
                } else if (obj instanceof java.lang.String) {
                    supportSQLiteStatement.bindString(i2, (java.lang.String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private void saveBinds(int i, java.lang.Object obj) {
            int i2 = i - 1;
            if (i2 >= this.mBinds.size()) {
                for (int size = this.mBinds.size(); size <= i2; size++) {
                    this.mBinds.add(null);
                }
            }
            this.mBinds.set(i2, obj);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            executeSqliteStatementWithRefCount(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$0MbLoqgetl42h-J4qKsq7FB8ND0
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.lambda$execute$1((androidx.sqlite.db.SupportSQLiteStatement) obj);
                }
            });
        }

        static /* synthetic */ java.lang.Object lambda$execute$1(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement) {
            supportSQLiteStatement.execute();
            return null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((java.lang.Integer) executeSqliteStatementWithRefCount(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$yCt91-p62_J5dp-_omdbDa867iU
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.sqlite.db.SupportSQLiteStatement) obj).executeUpdateDelete());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((java.lang.Long) executeSqliteStatementWithRefCount(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$i4cXFreMvUyhhGstASkBGKwh21o
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteStatement) obj).executeInsert());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((java.lang.Long) executeSqliteStatementWithRefCount(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$RZb5tQiSTSXJhM4YhEHOhpCeCSs
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteStatement) obj).simpleQueryForLong());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public java.lang.String simpleQueryForString() {
            return (java.lang.String) executeSqliteStatementWithRefCount(new androidx.arch.core.util.Function() { // from class: androidx.room.-$$Lambda$PJjVOuhbjuWwgw4K7feO9dKVtFQ
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ((androidx.sqlite.db.SupportSQLiteStatement) obj).simpleQueryForString();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int i) {
            saveBinds(i, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int i, long j) {
            saveBinds(i, java.lang.Long.valueOf(j));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int i, double d) {
            saveBinds(i, java.lang.Double.valueOf(d));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int i, java.lang.String str) {
            saveBinds(i, str);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int i, byte[] bArr) {
            saveBinds(i, bArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void clearBindings() {
            this.mBinds.clear();
        }
    }
}
