package powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs;

/* JADX INFO: loaded from: classes3.dex */
public final class WalkingLogDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> __deletionAdapterOfWalkingLog;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> __insertionAdapterOfWalkingLog;

    public WalkingLogDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfWalkingLog = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `WalkingLog` (`startTime`,`steps`,`distance`,`endTime`,`heartRate`,`bodyPower`,`solarPower`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`caseTemp`,`maxCaseTemp`,`minCaseTemp`,`activeCalories`,`hrv`,`shouldSend`,`bmrCalories`,`minHeartRate`,`maxHeartRate`,`email`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog) {
                supportSQLiteStatement.bindLong(1, walkingLog.getStartTime());
                supportSQLiteStatement.bindLong(2, walkingLog.getSteps());
                supportSQLiteStatement.bindDouble(3, walkingLog.getDistance());
                supportSQLiteStatement.bindLong(4, walkingLog.getEndTime());
                supportSQLiteStatement.bindDouble(5, walkingLog.getHeartRate());
                supportSQLiteStatement.bindDouble(6, walkingLog.getBodyPower());
                supportSQLiteStatement.bindDouble(7, walkingLog.getSolarPower());
                supportSQLiteStatement.bindDouble(8, walkingLog.getSkinTemp());
                supportSQLiteStatement.bindDouble(9, walkingLog.getMaxSkinTemp());
                supportSQLiteStatement.bindDouble(10, walkingLog.getMinSkinTemp());
                supportSQLiteStatement.bindDouble(11, walkingLog.getCaseTemp());
                supportSQLiteStatement.bindDouble(12, walkingLog.getMaxCaseTemp());
                supportSQLiteStatement.bindDouble(13, walkingLog.getMinCaseTemp());
                supportSQLiteStatement.bindLong(14, walkingLog.getActiveCalories());
                supportSQLiteStatement.bindDouble(15, walkingLog.getHrv());
                supportSQLiteStatement.bindLong(16, walkingLog.getShouldSend() ? 1L : 0L);
                supportSQLiteStatement.bindLong(17, walkingLog.getBmrCalories());
                supportSQLiteStatement.bindLong(18, walkingLog.getMinHeartRate());
                supportSQLiteStatement.bindLong(19, walkingLog.getMaxHeartRate());
                if (walkingLog.getEmail() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, walkingLog.getEmail());
                }
            }
        };
        this.__deletionAdapterOfWalkingLog = new androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM `WalkingLog` WHERE `startTime` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog value) {
                stmt.bindLong(1, value.getStartTime());
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao
    public void save(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWalkingLog.insert(walkingLogs);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao
    public void delete(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> walkingLogs) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfWalkingLog.handleMultiple(walkingLogs);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> all() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM WalkingLog", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.3
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    try {
                        int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                        int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                        int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                        int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                        int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                        int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                        if (cursorQuery.moveToFirst()) {
                            powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog2 = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog();
                            walkingLog2.setStartTime(cursorQuery.getLong(columnIndexOrThrow));
                            walkingLog2.setSteps(cursorQuery.getInt(columnIndexOrThrow2));
                            walkingLog2.setDistance(cursorQuery.getDouble(columnIndexOrThrow3));
                            walkingLog2.setEndTime(cursorQuery.getLong(columnIndexOrThrow4));
                            walkingLog2.setHeartRate(cursorQuery.getFloat(columnIndexOrThrow5));
                            walkingLog2.setBodyPower(cursorQuery.getFloat(columnIndexOrThrow6));
                            walkingLog2.setSolarPower(cursorQuery.getFloat(columnIndexOrThrow7));
                            walkingLog2.setSkinTemp(cursorQuery.getFloat(columnIndexOrThrow8));
                            walkingLog2.setMaxSkinTemp(cursorQuery.getFloat(columnIndexOrThrow9));
                            walkingLog2.setMinSkinTemp(cursorQuery.getFloat(columnIndexOrThrow10));
                            walkingLog2.setCaseTemp(cursorQuery.getFloat(columnIndexOrThrow11));
                            walkingLog2.setMaxCaseTemp(cursorQuery.getFloat(columnIndexOrThrow12));
                            walkingLog2.setMinCaseTemp(cursorQuery.getFloat(columnIndexOrThrow13));
                            walkingLog2.setActiveCalories(cursorQuery.getInt(columnIndexOrThrow14));
                            walkingLog2.setHrv(cursorQuery.getFloat(columnIndexOrThrow15));
                            walkingLog2.setShouldSend(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                            walkingLog2.setBmrCalories(cursorQuery.getInt(columnIndexOrThrow17));
                            walkingLog2.setMinHeartRate(cursorQuery.getInt(columnIndexOrThrow18));
                            walkingLog2.setMaxHeartRate(cursorQuery.getInt(columnIndexOrThrow19));
                            walkingLog2.setEmail(cursorQuery.isNull(columnIndexOrThrow20) ? null : cursorQuery.getString(columnIndexOrThrow20));
                            walkingLog = walkingLog2;
                        } else {
                            walkingLog = null;
                        }
                        if (walkingLog == null) {
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
                            return walkingLog;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>> notSyncedLogs() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM WalkingLog WHERE shouldSend = 1", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.4
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int i = columnIndexOrThrow14;
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog walkingLog = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.WalkingLog();
                        walkingLog.setStartTime(cursorQuery.getLong(columnIndexOrThrow));
                        walkingLog.setSteps(cursorQuery.getInt(columnIndexOrThrow2));
                        walkingLog.setDistance(cursorQuery.getDouble(columnIndexOrThrow3));
                        walkingLog.setEndTime(cursorQuery.getLong(columnIndexOrThrow4));
                        walkingLog.setHeartRate(cursorQuery.getFloat(columnIndexOrThrow5));
                        walkingLog.setBodyPower(cursorQuery.getFloat(columnIndexOrThrow6));
                        walkingLog.setSolarPower(cursorQuery.getFloat(columnIndexOrThrow7));
                        walkingLog.setSkinTemp(cursorQuery.getFloat(columnIndexOrThrow8));
                        walkingLog.setMaxSkinTemp(cursorQuery.getFloat(columnIndexOrThrow9));
                        walkingLog.setMinSkinTemp(cursorQuery.getFloat(columnIndexOrThrow10));
                        columnIndexOrThrow11 = columnIndexOrThrow11;
                        walkingLog.setCaseTemp(cursorQuery.getFloat(columnIndexOrThrow11));
                        int i2 = columnIndexOrThrow;
                        columnIndexOrThrow12 = columnIndexOrThrow12;
                        walkingLog.setMaxCaseTemp(cursorQuery.getFloat(columnIndexOrThrow12));
                        walkingLog.setMinCaseTemp(cursorQuery.getFloat(columnIndexOrThrow13));
                        int i3 = i;
                        int i4 = columnIndexOrThrow13;
                        walkingLog.setActiveCalories(cursorQuery.getInt(i3));
                        int i5 = columnIndexOrThrow15;
                        walkingLog.setHrv(cursorQuery.getFloat(i5));
                        columnIndexOrThrow16 = columnIndexOrThrow16;
                        walkingLog.setShouldSend(cursorQuery.getInt(columnIndexOrThrow16) != 0);
                        int i6 = columnIndexOrThrow17;
                        walkingLog.setBmrCalories(cursorQuery.getInt(i6));
                        int i7 = columnIndexOrThrow18;
                        walkingLog.setMinHeartRate(cursorQuery.getInt(i7));
                        int i8 = columnIndexOrThrow19;
                        walkingLog.setMaxHeartRate(cursorQuery.getInt(i8));
                        int i9 = columnIndexOrThrow20;
                        walkingLog.setEmail(cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9));
                        arrayList.add(walkingLog);
                        columnIndexOrThrow20 = i9;
                        columnIndexOrThrow13 = i4;
                        columnIndexOrThrow = i2;
                        i = i3;
                        columnIndexOrThrow15 = i5;
                        columnIndexOrThrow17 = i6;
                        columnIndexOrThrow18 = i7;
                        columnIndexOrThrow19 = i8;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.WalkingLogDao
    public long notSyncedLogsCount() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(startTime) FROM WalkingLog WHERE shouldSend = 1", 0);
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
