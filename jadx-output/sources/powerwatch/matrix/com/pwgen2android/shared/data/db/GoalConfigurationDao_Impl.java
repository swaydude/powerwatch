package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: loaded from: classes3.dex */
public final class GoalConfigurationDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> __insertionAdapterOfGoalConfiguration;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public GoalConfigurationDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfGoalConfiguration = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `GoalConfiguration` (`id`,`calories`,`distance`,`power`,`sleep`,`steps`,`createdAt`,`shouldSync`) VALUES (?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration) {
                supportSQLiteStatement.bindLong(1, goalConfiguration.getId());
                supportSQLiteStatement.bindLong(2, goalConfiguration.getCalories());
                supportSQLiteStatement.bindDouble(3, goalConfiguration.getDistance());
                supportSQLiteStatement.bindLong(4, goalConfiguration.getPower());
                supportSQLiteStatement.bindLong(5, goalConfiguration.getSleep());
                supportSQLiteStatement.bindLong(6, goalConfiguration.getSteps());
                supportSQLiteStatement.bindLong(7, goalConfiguration.getCreatedAt());
                supportSQLiteStatement.bindLong(8, goalConfiguration.getShouldSync() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfDelete = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM GoalConfiguration WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM GoalConfiguration";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public void add(final powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration item) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGoalConfiguration.insert(item);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public void add(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> item) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfGoalConfiguration.insert(item);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public void delete(final long id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDelete.acquire();
        supportSQLiteStatementAcquire.bindLong(1, id);
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteAll.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> get(final long id) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM GoalConfiguration WHERE id = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, id);
        return io.reactivex.Maybe.fromCallable(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.4
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "power");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.fitness.FitnessActivities.SLEEP);
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    if (cursorQuery.moveToFirst()) {
                        goalConfiguration = new powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8) != 0);
                    }
                    return goalConfiguration;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>> all() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM GoalConfiguration ORDER BY createdAt", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.5
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "power");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.fitness.FitnessActivities.SLEEP);
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8) != 0));
                    }
                    cursorQuery.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration> lastByCreated() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM GoalConfiguration ORDER BY createdAt DESC LIMIT 1", 0);
        return androidx.room.RxRoom.createObservable(this.__db, false, new java.lang.String[]{"GoalConfiguration"}, new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.6
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration goalConfiguration = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.fitness.data.Field.NUTRIENT_CALORIES);
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "power");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.fitness.FitnessActivities.SLEEP);
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "createdAt");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    if (cursorQuery.moveToFirst()) {
                        goalConfiguration = new powerwatch.matrix.com.pwgen2android.shared.data.models.GoalConfiguration(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getInt(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8) != 0);
                    }
                    return goalConfiguration;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.GoalConfigurationDao
    public long count() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(id) FROM GoalConfiguration", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
