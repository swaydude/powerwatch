package powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods;

/* JADX INFO: loaded from: classes3.dex */
public final class SleepHourPeriodDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> __insertionAdapterOfSleepHourPeriod;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteSleepHourPeriod;
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter __activityHourDataConverter = new powerwatch.matrix.com.pwgen2android.shared.data.db.ActivityHourDataConverter();
    private final powerwatch.matrix.com.pwgen2android.shared.data.db.SleepTypeTypeConverter __sleepTypeTypeConverter = new powerwatch.matrix.com.pwgen2android.shared.data.db.SleepTypeTypeConverter();

    public SleepHourPeriodDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSleepHourPeriod = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `SleepHourPeriod` (`startTime`,`endTime`,`heartRate`,`maxHeartRate`,`minHeartRate`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`hrv`,`bodyPower`,`solarPower`,`peakTemp`,`activeCalories`,`hourInDay`,`restlessMinutes`,`sleepFiveMins`,`sleepType`,`lastUpdated`,`minsInPeriod`,`bmrCalories`,`caseTemp`,`minCaseTemp`,`maxCaseTemp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod value) {
                stmt.bindLong(1, value.getStartTime());
                stmt.bindLong(2, value.getEndTime());
                stmt.bindDouble(3, value.getHeartRate());
                stmt.bindLong(4, value.getMaxHeartRate());
                stmt.bindLong(5, value.getMinHeartRate());
                stmt.bindDouble(6, value.getSkinTemp());
                stmt.bindDouble(7, value.getMaxSkinTemp());
                stmt.bindDouble(8, value.getMinSkinTemp());
                stmt.bindDouble(9, value.getHrv());
                stmt.bindDouble(10, value.getBodyPower());
                stmt.bindDouble(11, value.getSolarPower());
                stmt.bindDouble(12, value.getPeakTemp());
                stmt.bindLong(13, value.getActiveCalories());
                stmt.bindLong(14, value.getHourInDay());
                stmt.bindLong(15, value.getRestlessMinutes());
                java.lang.String strFromSleepMins = powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__activityHourDataConverter.fromSleepMins(value.getSleepFiveMins());
                if (strFromSleepMins == null) {
                    stmt.bindNull(16);
                } else {
                    stmt.bindString(16, strFromSleepMins);
                }
                java.lang.String strFromSleepType = powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__sleepTypeTypeConverter.fromSleepType(value.getSleepType());
                if (strFromSleepType == null) {
                    stmt.bindNull(17);
                } else {
                    stmt.bindString(17, strFromSleepType);
                }
                stmt.bindLong(18, value.getLastUpdated());
                stmt.bindLong(19, value.getMinsInPeriod());
                stmt.bindLong(20, value.getBmrCalories());
                stmt.bindDouble(21, value.getCaseTemp());
                stmt.bindDouble(22, value.getMinCaseTemp());
                stmt.bindDouble(23, value.getMaxCaseTemp());
            }
        };
        this.__preparedStmtOfDeleteSleepHourPeriod = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM SleepHourPeriod WHERE startTime = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM SleepHourPeriod";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
    public void addSleepHourPeriod(final powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod period) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepHourPeriod.insert(period);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
    public void addSleepHourPeriods(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> periods) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSleepHourPeriod.insert(periods);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
    public void deleteSleepHourPeriod(final long id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteSleepHourPeriod.acquire();
        supportSQLiteStatementAcquire.bindLong(1, id);
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteSleepHourPeriod.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> getSleepHourPeriod(final long id) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM SleepHourPeriod WHERE startTime = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, id);
        return io.reactivex.Maybe.fromCallable(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.4
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "peakTemp");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hourInDay");
                    try {
                        int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "restlessMinutes");
                        int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepFiveMins");
                        int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepType");
                        int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastUpdated");
                        int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod");
                        int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                        int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                        int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                        int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                        if (cursorQuery.moveToFirst()) {
                            try {
                                sleepHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getFloat(columnIndexOrThrow6), cursorQuery.getFloat(columnIndexOrThrow7), cursorQuery.getFloat(columnIndexOrThrow8), cursorQuery.getFloat(columnIndexOrThrow9), cursorQuery.getFloat(columnIndexOrThrow10), cursorQuery.getFloat(columnIndexOrThrow11), cursorQuery.getFloat(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.getInt(columnIndexOrThrow15), powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__activityHourDataConverter.toSleepMins(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16)), powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__sleepTypeTypeConverter.toSleepType(cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)), cursorQuery.getLong(columnIndexOrThrow18), cursorQuery.getInt(columnIndexOrThrow19), cursorQuery.getInt(columnIndexOrThrow20), cursorQuery.getFloat(columnIndexOrThrow21), cursorQuery.getFloat(columnIndexOrThrow22), cursorQuery.getFloat(columnIndexOrThrow23));
                            } catch (java.lang.Throwable th) {
                                th = th;
                                cursorQuery.close();
                                throw th;
                            }
                        } else {
                            sleepHourPeriod = null;
                        }
                        cursorQuery.close();
                        return sleepHourPeriod;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>> getSleepHourPeriods(final long startTime, final long endTime) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM SleepHourPeriod WHERE startTime >= ? AND startTime < ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, startTime);
        roomSQLiteQueryAcquire.bindLong(2, endTime);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.5
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "peakTemp");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hourInDay");
                    try {
                        int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "restlessMinutes");
                        int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepFiveMins");
                        int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepType");
                        int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastUpdated");
                        int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod");
                        int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                        int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                        int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                        int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                        int i = columnIndexOrThrow14;
                        java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            long j = cursorQuery.getLong(columnIndexOrThrow);
                            long j2 = cursorQuery.getLong(columnIndexOrThrow2);
                            float f = cursorQuery.getFloat(columnIndexOrThrow3);
                            int i2 = cursorQuery.getInt(columnIndexOrThrow4);
                            int i3 = cursorQuery.getInt(columnIndexOrThrow5);
                            float f2 = cursorQuery.getFloat(columnIndexOrThrow6);
                            float f3 = cursorQuery.getFloat(columnIndexOrThrow7);
                            float f4 = cursorQuery.getFloat(columnIndexOrThrow8);
                            float f5 = cursorQuery.getFloat(columnIndexOrThrow9);
                            float f6 = cursorQuery.getFloat(columnIndexOrThrow10);
                            float f7 = cursorQuery.getFloat(columnIndexOrThrow11);
                            float f8 = cursorQuery.getFloat(columnIndexOrThrow12);
                            int i4 = cursorQuery.getInt(columnIndexOrThrow13);
                            int i5 = i;
                            int i6 = cursorQuery.getInt(i5);
                            int i7 = columnIndexOrThrow;
                            int i8 = columnIndexOrThrow15;
                            int i9 = cursorQuery.getInt(i8);
                            columnIndexOrThrow15 = i8;
                            int i10 = columnIndexOrThrow16;
                            try {
                                java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.SleepFiveMinPeriod> sleepMins = powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__activityHourDataConverter.toSleepMins(cursorQuery.isNull(i10) ? null : cursorQuery.getString(i10));
                                columnIndexOrThrow17 = columnIndexOrThrow17;
                                powerwatch.matrix.com.pwgen2android.shared.data.models.SleepType sleepType = powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao_Impl.this.__sleepTypeTypeConverter.toSleepType(cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17));
                                int i11 = columnIndexOrThrow18;
                                long j3 = cursorQuery.getLong(i11);
                                int i12 = columnIndexOrThrow19;
                                int i13 = cursorQuery.getInt(i12);
                                columnIndexOrThrow18 = i11;
                                int i14 = columnIndexOrThrow20;
                                int i15 = cursorQuery.getInt(i14);
                                columnIndexOrThrow20 = i14;
                                int i16 = columnIndexOrThrow21;
                                float f9 = cursorQuery.getFloat(i16);
                                columnIndexOrThrow21 = i16;
                                int i17 = columnIndexOrThrow22;
                                float f10 = cursorQuery.getFloat(i17);
                                columnIndexOrThrow22 = i17;
                                int i18 = columnIndexOrThrow23;
                                columnIndexOrThrow23 = i18;
                                arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(j, j2, f, i2, i3, f2, f3, f4, f5, f6, f7, f8, i4, i6, i9, sleepMins, sleepType, j3, i13, i15, f9, f10, cursorQuery.getFloat(i18)));
                                columnIndexOrThrow19 = i12;
                                columnIndexOrThrow2 = columnIndexOrThrow2;
                                columnIndexOrThrow = i7;
                                columnIndexOrThrow16 = i10;
                                i = i5;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.SleepHourPeriodDao
    public powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod lastSleepHour() throws java.lang.Throwable {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod sleepHourPeriod;
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM SleepHourPeriod ORDER BY startTime DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "peakTemp");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hourInDay");
                try {
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "restlessMinutes");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepFiveMins");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "sleepType");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastUpdated");
                    int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod");
                    int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                    int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                    int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                    if (cursorQuery.moveToFirst()) {
                        try {
                            sleepHourPeriod = new powerwatch.matrix.com.pwgen2android.shared.data.models.SleepHourPeriod(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getFloat(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getFloat(columnIndexOrThrow6), cursorQuery.getFloat(columnIndexOrThrow7), cursorQuery.getFloat(columnIndexOrThrow8), cursorQuery.getFloat(columnIndexOrThrow9), cursorQuery.getFloat(columnIndexOrThrow10), cursorQuery.getFloat(columnIndexOrThrow11), cursorQuery.getFloat(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13), cursorQuery.getInt(columnIndexOrThrow14), cursorQuery.getInt(columnIndexOrThrow15), this.__activityHourDataConverter.toSleepMins(cursorQuery.isNull(columnIndexOrThrow16) ? null : cursorQuery.getString(columnIndexOrThrow16)), this.__sleepTypeTypeConverter.toSleepType(cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)), cursorQuery.getLong(columnIndexOrThrow18), cursorQuery.getInt(columnIndexOrThrow19), cursorQuery.getInt(columnIndexOrThrow20), cursorQuery.getFloat(columnIndexOrThrow21), cursorQuery.getFloat(columnIndexOrThrow22), cursorQuery.getFloat(columnIndexOrThrow23));
                        } catch (java.lang.Throwable th) {
                            th = th;
                            cursorQuery.close();
                            roomSQLiteQuery.release();
                            throw th;
                        }
                    } else {
                        sleepHourPeriod = null;
                    }
                    cursorQuery.close();
                    roomSQLiteQuery.release();
                    return sleepHourPeriod;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
