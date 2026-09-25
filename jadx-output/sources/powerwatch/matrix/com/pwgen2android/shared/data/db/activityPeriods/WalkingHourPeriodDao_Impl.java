package powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods;

/* JADX INFO: loaded from: classes3.dex */
public final class WalkingHourPeriodDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> __insertionAdapterOfWalkingHourPeriod;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteWalkingHourPeriod;

    public WalkingHourPeriodDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfWalkingHourPeriod = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `WalkingHourPeriod` (`startTime`,`endTime`,`hourInDay`,`maxHeartRate`,`minHeartRate`,`heartRate`,`skinTemp`,`maxSkinTemp`,`minSkinTemp`,`bodyPower`,`solarPower`,`hrv`,`peakTemp`,`activeCalories`,`steps`,`distance`,`lastUpdated`,`minsInPeriod`,`bmrCalories`,`caseTemp`,`minCaseTemp`,`maxCaseTemp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod value) {
                stmt.bindLong(1, value.getStartTime());
                stmt.bindLong(2, value.getEndTime());
                stmt.bindLong(3, value.getHourInDay());
                stmt.bindLong(4, value.getMaxHeartRate());
                stmt.bindLong(5, value.getMinHeartRate());
                stmt.bindDouble(6, value.getHeartRate());
                stmt.bindDouble(7, value.getSkinTemp());
                stmt.bindDouble(8, value.getMaxSkinTemp());
                stmt.bindDouble(9, value.getMinSkinTemp());
                stmt.bindDouble(10, value.getBodyPower());
                stmt.bindDouble(11, value.getSolarPower());
                stmt.bindDouble(12, value.getHrv());
                stmt.bindDouble(13, value.getPeakTemp());
                stmt.bindLong(14, value.getActiveCalories());
                stmt.bindLong(15, value.getSteps());
                stmt.bindDouble(16, value.getDistance());
                stmt.bindLong(17, value.getLastUpdated());
                stmt.bindLong(18, value.getMinsInPeriod());
                stmt.bindLong(19, value.getBmrCalories());
                stmt.bindDouble(20, value.getCaseTemp());
                stmt.bindDouble(21, value.getMinCaseTemp());
                stmt.bindDouble(22, value.getMaxCaseTemp());
            }
        };
        this.__preparedStmtOfDeleteWalkingHourPeriod = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM WalkingHourPeriod WHERE startTime = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM WalkingHourPeriod";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
    public void addWalkingHourPeriod(final powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod period) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWalkingHourPeriod.insert(period);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
    public void addWalkingHourPeriods(final java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> periods) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWalkingHourPeriod.insert(periods);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
    public void deleteWalkingHourPeriod(final long id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteWalkingHourPeriod.acquire();
        supportSQLiteStatementAcquire.bindLong(1, id);
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteWalkingHourPeriod.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> getWalkingHourPeriod(final long id) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM WalkingHourPeriod WHERE startTime = ?", 1);
        roomSQLiteQueryAcquire.bindLong(1, id);
        return io.reactivex.Maybe.fromCallable(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.4
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    return cursorQuery.moveToFirst() ? new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod(cursorQuery.getLong(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime")), cursorQuery.getLong(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hourInDay")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "peakTemp")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps")), cursorQuery.getDouble(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance")), cursorQuery.getLong(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastUpdated")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp"))) : null;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>> getWalkingHourPeriods(final long startTime, final long endTime) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM WalkingHourPeriod WHERE startTime >= ? AND startTime < ?", 2);
        roomSQLiteQueryAcquire.bindLong(1, startTime);
        roomSQLiteQueryAcquire.bindLong(2, endTime);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.5
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod> call() throws java.lang.Exception {
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hourInDay");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "peakTemp");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastUpdated");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod");
                    int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories");
                    int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp");
                    int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp");
                    int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp");
                    int i = columnIndexOrThrow14;
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        long j2 = cursorQuery.getLong(columnIndexOrThrow2);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow3);
                        int i3 = cursorQuery.getInt(columnIndexOrThrow4);
                        int i4 = cursorQuery.getInt(columnIndexOrThrow5);
                        float f = cursorQuery.getFloat(columnIndexOrThrow6);
                        float f2 = cursorQuery.getFloat(columnIndexOrThrow7);
                        float f3 = cursorQuery.getFloat(columnIndexOrThrow8);
                        float f4 = cursorQuery.getFloat(columnIndexOrThrow9);
                        float f5 = cursorQuery.getFloat(columnIndexOrThrow10);
                        float f6 = cursorQuery.getFloat(columnIndexOrThrow11);
                        float f7 = cursorQuery.getFloat(columnIndexOrThrow12);
                        float f8 = cursorQuery.getFloat(columnIndexOrThrow13);
                        int i5 = i;
                        int i6 = cursorQuery.getInt(i5);
                        int i7 = columnIndexOrThrow;
                        int i8 = columnIndexOrThrow15;
                        int i9 = cursorQuery.getInt(i8);
                        columnIndexOrThrow15 = i8;
                        int i10 = columnIndexOrThrow16;
                        double d = cursorQuery.getDouble(i10);
                        columnIndexOrThrow16 = i10;
                        int i11 = columnIndexOrThrow17;
                        long j3 = cursorQuery.getLong(i11);
                        columnIndexOrThrow17 = i11;
                        int i12 = columnIndexOrThrow18;
                        int i13 = cursorQuery.getInt(i12);
                        columnIndexOrThrow18 = i12;
                        int i14 = columnIndexOrThrow19;
                        int i15 = cursorQuery.getInt(i14);
                        columnIndexOrThrow19 = i14;
                        int i16 = columnIndexOrThrow20;
                        float f9 = cursorQuery.getFloat(i16);
                        columnIndexOrThrow20 = i16;
                        int i17 = columnIndexOrThrow21;
                        float f10 = cursorQuery.getFloat(i17);
                        columnIndexOrThrow21 = i17;
                        int i18 = columnIndexOrThrow22;
                        columnIndexOrThrow22 = i18;
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod(j, j2, i2, i3, i4, f, f2, f3, f4, f5, f6, f7, f8, i6, i9, d, j3, i13, i15, f9, f10, cursorQuery.getFloat(i18)));
                        columnIndexOrThrow = i7;
                        i = i5;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.activityPeriods.WalkingHourPeriodDao
    public powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod lastWalkingHour() throws java.lang.Throwable {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM WalkingHourPeriod ORDER BY startTime DESC LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            roomSQLiteQuery = roomSQLiteQueryAcquire;
            try {
                powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod walkingHourPeriod = cursorQuery.moveToFirst() ? new powerwatch.matrix.com.pwgen2android.shared.data.models.WalkingHourPeriod(cursorQuery.getLong(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "startTime")), cursorQuery.getLong(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "endTime")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hourInDay")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxHeartRate")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minHeartRate")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "heartRate")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "skinTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxSkinTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minSkinTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bodyPower")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "solarPower")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "hrv")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "peakTemp")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activeCalories")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "steps")), cursorQuery.getDouble(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "distance")), cursorQuery.getLong(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "lastUpdated")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minsInPeriod")), cursorQuery.getInt(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bmrCalories")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "caseTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "minCaseTemp")), cursorQuery.getFloat(androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "maxCaseTemp"))) : null;
                cursorQuery.close();
                roomSQLiteQuery.release();
                return walkingHourPeriod;
            } catch (java.lang.Throwable th) {
                th = th;
                cursorQuery.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = roomSQLiteQueryAcquire;
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
