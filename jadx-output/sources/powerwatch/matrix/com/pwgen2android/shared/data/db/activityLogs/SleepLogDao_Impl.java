package powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepLogDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> __deletionAdapterOfSleepLog;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> __insertionAdapterOfSleepLog;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.SleepTypeTypeConverter __sleepTypeTypeConverter = new powerwatch.matrix.com.pwgen2android.shared.data.db.SleepTypeTypeConverter();

    public SleepLogDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSleepLog = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `SleepLog` (`startTime`,`endTime`,`heartRate`,`bodyPower`,`solarPower`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`caseTemp`,`maxCaseTemp`,`minCaseTemp`,`activeCalories`,`sleepType`,`hrv`,`shouldSend`,`bmrCalories`,`minHeartRate`,`maxHeartRate`,`email`,`minsInPeriod`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog) {
                supportSQLiteStatement.bindLong(1, sleepLog.getStartTime());
                supportSQLiteStatement.bindLong(2, sleepLog.getEndTime());
                supportSQLiteStatement.bindDouble(3, sleepLog.getHeartRate());
                supportSQLiteStatement.bindDouble(4, sleepLog.getBodyPower());
                supportSQLiteStatement.bindDouble(5, sleepLog.getSolarPower());
                supportSQLiteStatement.bindDouble(6, sleepLog.getSkinTemp());
                supportSQLiteStatement.bindDouble(7, sleepLog.getMaxSkinTemp());
                supportSQLiteStatement.bindDouble(8, sleepLog.getMinSkinTemp());
                supportSQLiteStatement.bindDouble(9, sleepLog.getCaseTemp());
                supportSQLiteStatement.bindDouble(10, sleepLog.getMaxCaseTemp());
                supportSQLiteStatement.bindDouble(11, sleepLog.getMinCaseTemp());
                supportSQLiteStatement.bindLong(12, sleepLog.getActiveCalories());
                java.lang.String strFromSleepType = powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.this.__sleepTypeTypeConverter.fromSleepType(sleepLog.getSleepType());
                if (strFromSleepType == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, strFromSleepType);
                }
                supportSQLiteStatement.bindDouble(14, sleepLog.getHrv());
                supportSQLiteStatement.bindLong(15, sleepLog.getShouldSend() ? 1L : 0L);
                supportSQLiteStatement.bindLong(16, sleepLog.getBmrCalories());
                supportSQLiteStatement.bindLong(17, sleepLog.getMinHeartRate());
                supportSQLiteStatement.bindLong(18, sleepLog.getMaxHeartRate());
                if (sleepLog.getEmail() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindString(19, sleepLog.getEmail());
                }
                supportSQLiteStatement.bindLong(20, sleepLog.getMinsInPeriod());
            }
        };
        this.__deletionAdapterOfSleepLog = new androidx.room.EntityDeletionOrUpdateAdapter<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM `SleepLog` WHERE `startTime` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog value) {
                stmt.bindLong(1, value.getStartTime());
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao
    public void save(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> walkingLogs) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepLog.insert(walkingLogs);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao
    public void delete(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> sleepLogs) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfSleepLog.handleMultiple(sleepLogs);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> all() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM SleepLog", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.3
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog sleepLog;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
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
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepType");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod");
                    if (cursorQuery.moveToFirst()) {
                        sleepLog = new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getFloat(columnIndexOrThrow4), cursorQuery.getFloat(columnIndexOrThrow5), cursorQuery.getFloat(columnIndexOrThrow6), cursorQuery.getFloat(columnIndexOrThrow7), cursorQuery.getFloat(columnIndexOrThrow8), cursorQuery.getFloat(columnIndexOrThrow9), cursorQuery.getFloat(columnIndexOrThrow10), cursorQuery.getFloat(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.this.__sleepTypeTypeConverter.toSleepType(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)), cursorQuery.getFloat(columnIndexOrThrow14), cursorQuery.getInt(columnIndexOrThrow15) != 0, cursorQuery.getInt(columnIndexOrThrow16), cursorQuery.getInt(columnIndexOrThrow17), cursorQuery.getInt(columnIndexOrThrow18), cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19), cursorQuery.getInt(columnIndexOrThrow20));
                    } else {
                        sleepLog = null;
                    }
                    if (sleepLog == null) {
                        throw new androidx.room.EmptyResultSetException("Query returned empty result set: " + roomSQLiteQueryAcquire.getSql());
                    }
                    cursorQuery.close();
                    return sleepLog;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>> notSyncedLogs() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM SleepLog WHERE shouldSend = 1", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.4
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
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
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepType");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSend");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod");
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            long j = cursorQuery.getLong(columnIndexOrThrow);
                            long j2 = cursorQuery.getLong(columnIndexOrThrow2);
                            float f = cursorQuery.getFloat(columnIndexOrThrow3);
                            float f2 = cursorQuery.getFloat(columnIndexOrThrow4);
                            float f3 = cursorQuery.getFloat(columnIndexOrThrow5);
                            float f4 = cursorQuery.getFloat(columnIndexOrThrow6);
                            float f5 = cursorQuery.getFloat(columnIndexOrThrow7);
                            float f6 = cursorQuery.getFloat(columnIndexOrThrow8);
                            float f7 = cursorQuery.getFloat(columnIndexOrThrow9);
                            float f8 = cursorQuery.getFloat(columnIndexOrThrow10);
                            float f9 = cursorQuery.getFloat(columnIndexOrThrow11);
                            int i = cursorQuery.getInt(columnIndexOrThrow12);
                            try {
                                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType = powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao_Impl.this.__sleepTypeTypeConverter.toSleepType(cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13));
                                columnIndexOrThrow14 = columnIndexOrThrow14;
                                float f10 = cursorQuery.getFloat(columnIndexOrThrow14);
                                int i2 = columnIndexOrThrow15;
                                boolean z = cursorQuery.getInt(i2) != 0;
                                int i3 = cursorQuery.getInt(columnIndexOrThrow16);
                                columnIndexOrThrow16 = columnIndexOrThrow16;
                                int i4 = columnIndexOrThrow17;
                                int i5 = cursorQuery.getInt(i4);
                                columnIndexOrThrow17 = i4;
                                int i6 = columnIndexOrThrow18;
                                int i7 = cursorQuery.getInt(i6);
                                columnIndexOrThrow18 = i6;
                                columnIndexOrThrow19 = columnIndexOrThrow19;
                                java.lang.String string = cursorQuery.isNull(columnIndexOrThrow19) ? null : cursorQuery.getString(columnIndexOrThrow19);
                                int i8 = cursorQuery.getInt(columnIndexOrThrow20);
                                columnIndexOrThrow20 = columnIndexOrThrow20;
                                arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.logPeriodsFormatters.SleepLog(j, j2, f, f2, f3, f4, f5, f6, f7, f8, f9, i, sleepType, f10, z, i3, i5, i7, string, i8));
                                columnIndexOrThrow15 = i2;
                                columnIndexOrThrow13 = columnIndexOrThrow13;
                                columnIndexOrThrow = columnIndexOrThrow;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                cursorQuery.close();
                                throw th;
                            }
                        }
                        cursorQuery.close();
                        return arrayList;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityLogs.SleepLogDao
    public long notSyncedLogsCount() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(startTime) FROM SleepLog WHERE shouldSend = 1", 0);
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
