package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> __insertionAdapterOfDevice;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteDevice;

    public DeviceDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfDevice = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `Device` (`uid`,`serialNumber`,`bluetoothAddress`,`pid`,`firmwareVersion`,`productName`,`shouldSync`,`callNotification`,`messageNotification`,`activityGoalNotification`,`alarmNotification`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
                supportSQLiteStatement.bindLong(1, device.getUid());
                if (device.getSerialNumber() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, device.getSerialNumber());
                }
                if (device.getBluetoothAddress() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, device.getBluetoothAddress());
                }
                supportSQLiteStatement.bindLong(4, device.getPid());
                if (device.getFirmwareVersion() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, device.getFirmwareVersion());
                }
                if (device.getProductName() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, device.getProductName());
                }
                java.lang.Integer numValueOf = device.getShouldSync() == null ? null : java.lang.Integer.valueOf(device.getShouldSync().booleanValue() ? 1 : 0);
                if (numValueOf == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, numValueOf.intValue());
                }
                supportSQLiteStatement.bindLong(8, device.getCallNotification() ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, device.getMessageNotification() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, device.getActivityGoalNotification() ? 1L : 0L);
                supportSQLiteStatement.bindLong(11, device.getAlarmNotification() ? 1L : 0L);
            }
        };
        this.__preparedStmtOfDeleteDevice = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM Device WHERE serialNumber = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM Device";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public void addDevice(final powerwatch.matrix.com.pwgen2android.shared.data.models.Device device) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDevice.insert(device);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public void deleteDevice(final java.lang.String serialNumber) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDeleteDevice.acquire();
        if (serialNumber == null) {
            supportSQLiteStatementAcquire.bindNull(1);
        } else {
            supportSQLiteStatementAcquire.bindString(1, serialNumber);
        }
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteDevice.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public io.reactivex.Single<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getFirst() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM Device WHERE uid = 0 LIMIT 1", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.4
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.Device call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = null;
                java.lang.Boolean boolValueOf = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "serialNumber");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bluetoothAddress");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmwareVersion");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "productName");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNotification");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "messageNotification");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityGoalNotification");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "alarmNotification");
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        int i = cursorQuery.getInt(columnIndexOrThrow4);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        java.lang.Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                        if (numValueOf != null) {
                            boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        device = new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(j, string, string2, i, string3, string4, boolValueOf, cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getInt(columnIndexOrThrow11) != 0);
                    }
                    if (device == null) {
                        throw new androidx.room.EmptyResultSetException("Query returned empty result set: " + roomSQLiteQueryAcquire.getSql());
                    }
                    cursorQuery.close();
                    return device;
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> observeFirst() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM Device WHERE uid = 0 LIMIT 1", 0);
        return androidx.room.RxRoom.createObservable(this.__db, false, new java.lang.String[]{"Device"}, new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.5
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.Device call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = null;
                java.lang.Boolean boolValueOf = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "serialNumber");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bluetoothAddress");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmwareVersion");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "productName");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNotification");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "messageNotification");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityGoalNotification");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "alarmNotification");
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        int i = cursorQuery.getInt(columnIndexOrThrow4);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        java.lang.Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                        if (numValueOf != null) {
                            boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        device = new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(j, string, string2, i, string3, string4, boolValueOf, cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getInt(columnIndexOrThrow11) != 0);
                    }
                    return device;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> getDevice(final java.lang.String serialNumber) {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM Device WHERE serialNumber = ?", 1);
        if (serialNumber == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, serialNumber);
        }
        return io.reactivex.Maybe.fromCallable(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.6
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.Device call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.Device device = null;
                java.lang.Boolean boolValueOf = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "serialNumber");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bluetoothAddress");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmwareVersion");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "productName");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNotification");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "messageNotification");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityGoalNotification");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "alarmNotification");
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        int i = cursorQuery.getInt(columnIndexOrThrow4);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        java.lang.Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                        if (numValueOf != null) {
                            boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        device = new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(j, string, string2, i, string3, string4, boolValueOf, cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getInt(columnIndexOrThrow11) != 0);
                    }
                    return device;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> getAllDevices() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM Device", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.7
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> call() throws java.lang.Exception {
                java.lang.Boolean boolValueOf;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "serialNumber");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bluetoothAddress");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmwareVersion");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "productName");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNotification");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "messageNotification");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityGoalNotification");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "alarmNotification");
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        int i = cursorQuery.getInt(columnIndexOrThrow4);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        java.lang.Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(j, string, string2, i, string3, string4, boolValueOf, cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getInt(columnIndexOrThrow11) != 0));
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public io.reactivex.Single<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>> getNotRegisteredDevices() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM Device WHERE shouldSync = 1", 0);
        return androidx.room.RxRoom.createSingle(new java.util.concurrent.Callable<java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device>>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.8
            @Override // java.util.concurrent.Callable
            public java.util.List<powerwatch.matrix.com.pwgen2android.shared.data.models.Device> call() throws java.lang.Exception {
                java.lang.Boolean boolValueOf;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "serialNumber");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bluetoothAddress");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "pid");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "firmwareVersion");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "productName");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "callNotification");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "messageNotification");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "activityGoalNotification");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "alarmNotification");
                    java.util.ArrayList arrayList = new java.util.ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        java.lang.String string = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        int i = cursorQuery.getInt(columnIndexOrThrow4);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        java.lang.Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow7));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = java.lang.Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        arrayList.add(new powerwatch.matrix.com.pwgen2android.shared.data.models.Device(j, string, string2, i, string3, string4, boolValueOf, cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getInt(columnIndexOrThrow11) != 0));
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DeviceDao
    public int count() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(serialNumber) FROM Device", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            return cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
