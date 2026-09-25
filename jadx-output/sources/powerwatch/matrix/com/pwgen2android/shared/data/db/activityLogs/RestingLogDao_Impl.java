package powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs;

/* JADX INFO: loaded from: classes3.dex */
public final class RestingLogDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> __deletionAdapterOfRestingLog;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> __insertionAdapterOfRestingLog;

    public RestingLogDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfRestingLog = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `RestingLog` (`startTime`,`endTime`,`heartRate`,`bodyPower`,`solarPower`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`caseTemp`,`maxCaseTemp`,`minCaseTemp`,`activeCalories`,`hrv`,`shouldSend`,`bmrCalories`,`minHeartRate`,`maxHeartRate`,`email`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog restingLog) {
                supportSQLiteStatement.bindLong(1, restingLog.getStartTime());
                supportSQLiteStatement.bindLong(2, restingLog.getEndTime());
                supportSQLiteStatement.bindDouble(3, restingLog.getHeartRate());
                supportSQLiteStatement.bindDouble(4, restingLog.getBodyPower());
                supportSQLiteStatement.bindDouble(5, restingLog.getSolarPower());
                supportSQLiteStatement.bindDouble(6, restingLog.getSkinTemp());
                supportSQLiteStatement.bindDouble(7, restingLog.getMaxSkinTemp());
                supportSQLiteStatement.bindDouble(8, restingLog.getMinSkinTemp());
                supportSQLiteStatement.bindDouble(9, restingLog.getCaseTemp());
                supportSQLiteStatement.bindDouble(10, restingLog.getMaxCaseTemp());
                supportSQLiteStatement.bindDouble(11, restingLog.getMinCaseTemp());
                supportSQLiteStatement.bindLong(12, restingLog.getActiveCalories());
                supportSQLiteStatement.bindDouble(13, restingLog.getHrv());
                supportSQLiteStatement.bindLong(14, restingLog.getShouldSend() ? 1L : 0L);
                supportSQLiteStatement.bindLong(15, restingLog.getBmrCalories());
                supportSQLiteStatement.bindLong(16, restingLog.getMinHeartRate());
                supportSQLiteStatement.bindLong(17, restingLog.getMaxHeartRate());
                if (restingLog.getEmail() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, restingLog.getEmail());
                }
            }
        };
        this.__deletionAdapterOfRestingLog = new androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM `RestingLog` WHERE `startTime` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog value) {
                stmt.bindLong(1, value.getStartTime());
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao
    public void save(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRestingLog.insert(restingLogs);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao
    public void delete(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> restingLogs) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRestingLog.handleMultiple(restingLogs);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> all() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM RestingLog", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.3
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog restingLog;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    try {
                        int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                        int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                        int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                        int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                        if (cursorQuery.moveToFirst()) {
                            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog restingLog2 = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog();
                            restingLog2.setStartTime(cursorQuery.getLong(columnIndexOrThrow));
                            restingLog2.setEndTime(cursorQuery.getLong(columnIndexOrThrow2));
                            restingLog2.setHeartRate(cursorQuery.getFloat(columnIndexOrThrow3));
                            restingLog2.setBodyPower(cursorQuery.getFloat(columnIndexOrThrow4));
                            restingLog2.setSolarPower(cursorQuery.getFloat(columnIndexOrThrow5));
                            restingLog2.setSkinTemp(cursorQuery.getFloat(columnIndexOrThrow6));
                            restingLog2.setMaxSkinTemp(cursorQuery.getFloat(columnIndexOrThrow7));
                            restingLog2.setMinSkinTemp(cursorQuery.getFloat(columnIndexOrThrow8));
                            restingLog2.setCaseTemp(cursorQuery.getFloat(columnIndexOrThrow9));
                            restingLog2.setMaxCaseTemp(cursorQuery.getFloat(columnIndexOrThrow10));
                            restingLog2.setMinCaseTemp(cursorQuery.getFloat(columnIndexOrThrow11));
                            restingLog2.setActiveCalories(cursorQuery.getInt(columnIndexOrThrow12));
                            restingLog2.setHrv(cursorQuery.getFloat(columnIndexOrThrow13));
                            restingLog2.setShouldSend(cursorQuery.getInt(columnIndexOrThrow14) != 0);
                            restingLog2.setBmrCalories(cursorQuery.getInt(columnIndexOrThrow15));
                            restingLog2.setMinHeartRate(cursorQuery.getInt(columnIndexOrThrow16));
                            restingLog2.setMaxHeartRate(cursorQuery.getInt(columnIndexOrThrow17));
                            restingLog2.setEmail(cursorQuery.isNull(columnIndexOrThrow18) ? null : cursorQuery.getString(columnIndexOrThrow18));
                            restingLog = restingLog2;
                        } else {
                            restingLog = null;
                        }
                        if (restingLog == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Query returned empty result set: ");
                            try {
                                sb.append(roomSQLiteQueryAcquire.getSql());
                                throw new androidx.room.EmptyResultSetException(sb.toString());
                            } catch (java.lang.Throwable th) {
                                th = th;
                            }
                        } else {
                            cursorQuery.close();
                            return restingLog;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
                cursorQuery.close();
                throw th;
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>> notSyncedLogs() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM RestingLog WHERE shouldSend = 1", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.4
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int i = columnIndexOrThrow14;
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog restingLog = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.RestingLog();
                        restingLog.setStartTime(cursorQuery.getLong(columnIndexOrThrow));
                        restingLog.setEndTime(cursorQuery.getLong(columnIndexOrThrow2));
                        restingLog.setHeartRate(cursorQuery.getFloat(columnIndexOrThrow3));
                        restingLog.setBodyPower(cursorQuery.getFloat(columnIndexOrThrow4));
                        restingLog.setSolarPower(cursorQuery.getFloat(columnIndexOrThrow5));
                        restingLog.setSkinTemp(cursorQuery.getFloat(columnIndexOrThrow6));
                        restingLog.setMaxSkinTemp(cursorQuery.getFloat(columnIndexOrThrow7));
                        restingLog.setMinSkinTemp(cursorQuery.getFloat(columnIndexOrThrow8));
                        restingLog.setCaseTemp(cursorQuery.getFloat(columnIndexOrThrow9));
                        restingLog.setMaxCaseTemp(cursorQuery.getFloat(columnIndexOrThrow10));
                        columnIndexOrThrow11 = columnIndexOrThrow11;
                        restingLog.setMinCaseTemp(cursorQuery.getFloat(columnIndexOrThrow11));
                        int i2 = columnIndexOrThrow;
                        columnIndexOrThrow12 = columnIndexOrThrow12;
                        restingLog.setActiveCalories(cursorQuery.getInt(columnIndexOrThrow12));
                        restingLog.setHrv(cursorQuery.getFloat(columnIndexOrThrow13));
                        i = i;
                        restingLog.setShouldSend(cursorQuery.getInt(i) != 0);
                        int i3 = columnIndexOrThrow15;
                        int i4 = columnIndexOrThrow13;
                        restingLog.setBmrCalories(cursorQuery.getInt(i3));
                        int i5 = columnIndexOrThrow16;
                        restingLog.setMinHeartRate(cursorQuery.getInt(i5));
                        int i6 = columnIndexOrThrow17;
                        restingLog.setMaxHeartRate(cursorQuery.getInt(i6));
                        int i7 = columnIndexOrThrow18;
                        restingLog.setEmail(cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7));
                        arrayList.add(restingLog);
                        columnIndexOrThrow18 = i7;
                        columnIndexOrThrow13 = i4;
                        columnIndexOrThrow15 = i3;
                        columnIndexOrThrow16 = i5;
                        columnIndexOrThrow = i2;
                        columnIndexOrThrow17 = i6;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.RestingLogDao
    public long notSyncedLogsCount() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(startTime) FROM RestingLog WHERE shouldSend = 1", 0);
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
