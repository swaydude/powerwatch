package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultPhoneWatchDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch> __insertionAdapterOfDefaultPhoneWatch;

    public DefaultPhoneWatchDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfDefaultPhoneWatch = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `DefaultPhoneWatch` (`uid`,`bluetoothAddress`,`serialNumber`) VALUES (?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch value) {
                stmt.bindLong(1, value.getUid());
                if (value.getBluetoothAddress() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getBluetoothAddress());
                }
                if (value.getSerialNumber() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getSerialNumber());
                }
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao
    public void add(final powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch item) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDefaultPhoneWatch.insert(item);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.DefaultPhoneWatchDao
    public powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch getFirst() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM DefaultPhoneWatch LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch defaultPhoneWatch = null;
        java.lang.String string = null;
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "bluetoothAddress");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "serialNumber");
            if (cursorQuery.moveToFirst()) {
                long j = cursorQuery.getLong(columnIndexOrThrow);
                java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                if (!cursorQuery.isNull(columnIndexOrThrow3)) {
                    string = cursorQuery.getString(columnIndexOrThrow3);
                }
                defaultPhoneWatch = new powerwatch.matrix.com.pwgen2android.shared.data.models.DefaultPhoneWatch(j, string2, string);
            }
            return defaultPhoneWatch;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
