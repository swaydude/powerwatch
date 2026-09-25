package powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions;

/* JADX INFO: loaded from: classes3.dex */
public final class UserActivitySessionDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> __deletionAdapterOfUserActivitySession;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> __insertionAdapterOfUserActivityDate;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> __insertionAdapterOfUserActivitySession;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAllActivityDates;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteSyngleActivityDate;
    private final androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> __updateAdapterOfUserActivitySession;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter __userActivitySessionConverter = new powerwatch.matrix.com.pwgen2android.shared.data.db.UserActivitySessionConverter();

    public UserActivitySessionDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfUserActivitySession = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `UserActivitySession` (`id`,`name`,`activityType`,`locationName`,`distance`,`steps`,`startTime`,`endTime`,`pace`,`activeCalories`,`bmrCalories`,`splits`,`gpsPositions`,`heartRates`,`notes`,`shouldSend`,`email`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
                if (userActivitySession.getId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, userActivitySession.getId());
                }
                if (userActivitySession.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, userActivitySession.getName());
                }
                java.lang.String strFromActivityType = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromActivityType(userActivitySession.getActivityType());
                if (strFromActivityType == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, strFromActivityType);
                }
                if (userActivitySession.getLocationName() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, userActivitySession.getLocationName());
                }
                supportSQLiteStatement.bindDouble(5, userActivitySession.getDistance());
                supportSQLiteStatement.bindLong(6, userActivitySession.getSteps());
                supportSQLiteStatement.bindLong(7, userActivitySession.getStartTime());
                supportSQLiteStatement.bindLong(8, userActivitySession.getEndTime());
                supportSQLiteStatement.bindDouble(9, userActivitySession.getPace());
                supportSQLiteStatement.bindLong(10, userActivitySession.getActiveCalories());
                supportSQLiteStatement.bindLong(11, userActivitySession.getBmrCalories());
                java.lang.String strFromRunningSplits = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromRunningSplits(userActivitySession.getSplits());
                if (strFromRunningSplits == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, strFromRunningSplits);
                }
                java.lang.String strFromGPSPositions = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromGPSPositions(userActivitySession.getGpsPositions());
                if (strFromGPSPositions == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, strFromGPSPositions);
                }
                java.lang.String strFromHeartRates = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromHeartRates(userActivitySession.getHeartRates());
                if (strFromHeartRates == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, strFromHeartRates);
                }
                if (userActivitySession.getNotes() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, userActivitySession.getNotes());
                }
                supportSQLiteStatement.bindLong(16, userActivitySession.getShouldSend() ? 1L : 0L);
                if (userActivitySession.getEmail() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, userActivitySession.getEmail());
                }
            }
        };
        this.__insertionAdapterOfUserActivityDate = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `UserActivityDate` (`startTime`) VALUES (?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate value) {
                stmt.bindLong(1, value.getStartTime());
            }
        };
        this.__deletionAdapterOfUserActivitySession = new androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM `UserActivitySession` WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession value) {
                if (value.getId() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getId());
                }
            }
        };
        this.__updateAdapterOfUserActivitySession = new androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.4
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `UserActivitySession` SET `id` = ?,`name` = ?,`activityType` = ?,`locationName` = ?,`distance` = ?,`steps` = ?,`startTime` = ?,`endTime` = ?,`pace` = ?,`activeCalories` = ?,`bmrCalories` = ?,`splits` = ?,`gpsPositions` = ?,`heartRates` = ?,`notes` = ?,`shouldSend` = ?,`email` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession) {
                if (userActivitySession.getId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, userActivitySession.getId());
                }
                if (userActivitySession.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, userActivitySession.getName());
                }
                java.lang.String strFromActivityType = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromActivityType(userActivitySession.getActivityType());
                if (strFromActivityType == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, strFromActivityType);
                }
                if (userActivitySession.getLocationName() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, userActivitySession.getLocationName());
                }
                supportSQLiteStatement.bindDouble(5, userActivitySession.getDistance());
                supportSQLiteStatement.bindLong(6, userActivitySession.getSteps());
                supportSQLiteStatement.bindLong(7, userActivitySession.getStartTime());
                supportSQLiteStatement.bindLong(8, userActivitySession.getEndTime());
                supportSQLiteStatement.bindDouble(9, userActivitySession.getPace());
                supportSQLiteStatement.bindLong(10, userActivitySession.getActiveCalories());
                supportSQLiteStatement.bindLong(11, userActivitySession.getBmrCalories());
                java.lang.String strFromRunningSplits = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromRunningSplits(userActivitySession.getSplits());
                if (strFromRunningSplits == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, strFromRunningSplits);
                }
                java.lang.String strFromGPSPositions = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromGPSPositions(userActivitySession.getGpsPositions());
                if (strFromGPSPositions == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, strFromGPSPositions);
                }
                java.lang.String strFromHeartRates = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.fromHeartRates(userActivitySession.getHeartRates());
                if (strFromHeartRates == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, strFromHeartRates);
                }
                if (userActivitySession.getNotes() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, userActivitySession.getNotes());
                }
                supportSQLiteStatement.bindLong(16, userActivitySession.getShouldSend() ? 1L : 0L);
                if (userActivitySession.getEmail() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, userActivitySession.getEmail());
                }
                if (userActivitySession.getId() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, userActivitySession.getId());
                }
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM UserActivitySession";
            }
        };
        this.__preparedStmtOfDeleteAllActivityDates = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM UserActivityDate";
            }
        };
        this.__preparedStmtOfDeleteSyngleActivityDate = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM UserActivityDate WHERE startTime = ?";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public void save(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> items) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserActivitySession.insert(items);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public void saveActivityDates(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> dates) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUserActivityDate.insert(dates);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public void delete(final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession session) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfUserActivitySession.handle(session);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public void update(final powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession item) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfUserActivitySession.handle(item);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public void deleteAllActivityDates() {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteAllActivityDates.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllActivityDates.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public void deleteSyngleActivityDate(final long startTime) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteSyngleActivityDate.acquire();
        supportSQLiteStatementAcquire.bindLong(1, startTime);
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteSyngleActivityDate.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> getOne(final java.lang.String id) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM UserActivitySession WHERE id = ?", 1);
        if (id == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, id);
        }
        return io.reactivex.Maybe.fromCallable(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.8
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession userActivitySession;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityType");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "locationName");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pace");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "splits");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "gpsPositions");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRates");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "notes");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    if (cursorQuery.moveToFirst()) {
                        userActivitySession = new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toActivityType(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3)), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getFloat(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.getLong(columnIndexOrThrow8), cursorQuery.getFloat(columnIndexOrThrow9), cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11), powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toRunningSplits(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12)), powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toGPSPositions(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)), powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toHeartRates(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14)), cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0, cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17));
                    } else {
                        userActivitySession = null;
                    }
                    return userActivitySession;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> getAll(final long startTime, final long endTime) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM UserActivitySession WHERE startTime >= ? AND startTime < ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, startTime);
        roomSQLiteQueryAcquire.bindLong(2, endTime);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.9
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityType");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "locationName");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pace");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "splits");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "gpsPositions");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRates");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "notes");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int i = columnIndexOrThrow13;
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType activityType = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toActivityType(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        float f = cursorQuery.getFloat(columnIndexOrThrow5);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow6);
                        long j = cursorQuery.getLong(columnIndexOrThrow7);
                        long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow9);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow10);
                        int i4 = cursorQuery.getInt(columnIndexOrThrow11);
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> runningSplits = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toRunningSplits(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                        i = i;
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gPSPositions = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toGPSPositions(cursorQuery.isNull(i) ? null : cursorQuery.getString(i));
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toHeartRates(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14));
                        columnIndexOrThrow15 = columnIndexOrThrow15;
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession(string, string2, activityType, string3, f, i2, j, j2, f2, i3, i4, runningSplits, gPSPositions, heartRates, cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0, cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow = columnIndexOrThrow;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public long notSyncedCount() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(id) FROM UserActivitySession WHERE shouldSend = 1", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getLong(0) : 0L;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>> notSyncedSessions() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM UserActivitySession WHERE shouldSend = 1", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.10
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityType");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "locationName");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pace");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "splits");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "gpsPositions");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRates");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "notes");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int i = columnIndexOrThrow13;
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityType activityType = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toActivityType(cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3));
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        float f = cursorQuery.getFloat(columnIndexOrThrow5);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow6);
                        long j = cursorQuery.getLong(columnIndexOrThrow7);
                        long j2 = cursorQuery.getLong(columnIndexOrThrow8);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow9);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow10);
                        int i4 = cursorQuery.getInt(columnIndexOrThrow11);
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.RunningSplit> runningSplits = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toRunningSplits(cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12));
                        i = i;
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.GPSPosition> gPSPositions = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toGPSPositions(cursorQuery.isNull(i) ? null : cursorQuery.getString(i));
                        columnIndexOrThrow14 = columnIndexOrThrow14;
                        java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.HeartRate> heartRates = powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__userActivitySessionConverter.toHeartRates(cursorQuery.isNull(columnIndexOrThrow14) ? null : cursorQuery.getString(columnIndexOrThrow14));
                        columnIndexOrThrow15 = columnIndexOrThrow15;
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivitySession(string, string2, activityType, string3, f, i2, j, j2, f2, i3, i4, runningSplits, gPSPositions, heartRates, cursorQuery.isNull(columnIndexOrThrow15) ? null : cursorQuery.getString(columnIndexOrThrow15), cursorQuery.getInt(columnIndexOrThrow16) != 0, cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        columnIndexOrThrow = columnIndexOrThrow;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao
    public io.reactivex.Observable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>> allActivityDates() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM UserActivityDate", 0);
        return androidx.room.RxRoom.createObservable(this.__db, false, new java.lang.String[]{"UserActivityDate"}, new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.11
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activitySessions.UserActivitySessionDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.UserActivityDate(cursorQuery.getLong(columnIndexOrThrow)));
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

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
