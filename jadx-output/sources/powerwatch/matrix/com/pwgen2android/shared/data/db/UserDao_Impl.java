package powerwatch.matrix.com.pwgen2android.shared.data.db;

/* JADX INFO: loaded from: classes3.dex */
public final class UserDao_Impl extends powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.User> __insertionAdapterOfUser;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public UserDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfUser = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.data.models.User>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `User` (`uid`,`enabled`,`name`,`email`,`password`,`age`,`height`,`weight`,`gender`,`shouldSync`,`language`,`unitType`,`timeFormatType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
                supportSQLiteStatement.bindLong(1, user.getUid());
                supportSQLiteStatement.bindLong(2, user.getEnabled() ? 1L : 0L);
                if (user.getName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, user.getName());
                }
                if (user.getEmail() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, user.getEmail());
                }
                if (user.getPassword() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, user.getPassword());
                }
                supportSQLiteStatement.bindLong(6, user.getAge());
                supportSQLiteStatement.bindLong(7, user.getHeight());
                supportSQLiteStatement.bindDouble(8, user.getWeight());
                if (user.getGender() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, user.getGender());
                }
                supportSQLiteStatement.bindLong(10, user.getShouldSync() ? 1L : 0L);
                powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings accountSettings = user.getAccountSettings();
                if (accountSettings != null) {
                    if (accountSettings.getLanguage() == null) {
                        supportSQLiteStatement.bindNull(11);
                    } else {
                        supportSQLiteStatement.bindString(11, accountSettings.getLanguage());
                    }
                    if (accountSettings.getUnitType() == null) {
                        supportSQLiteStatement.bindNull(12);
                    } else {
                        supportSQLiteStatement.bindString(12, accountSettings.getUnitType());
                    }
                    supportSQLiteStatement.bindLong(13, accountSettings.getTimeFormatType());
                    return;
                }
                supportSQLiteStatement.bindNull(11);
                supportSQLiteStatement.bindNull(12);
                supportSQLiteStatement.bindNull(13);
            }
        };
        this.__preparedStmtOfDelete = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM User WHERE uid = 0";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM User";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao
    public void addUser(final powerwatch.matrix.com.pwgen2android.shared.data.models.User user) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfUser.insert(user);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao
    public void delete() {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatementAcquire = this.__preparedStmtOfDelete.acquire();
        this.__db.beginTransaction();
        try {
            supportSQLiteStatementAcquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(supportSQLiteStatementAcquire);
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao
    public io.reactivex.Maybe<powerwatch.matrix.com.pwgen2android.shared.data.models.User> getUser() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM User WHERE uid = 0", 0);
        return io.reactivex.Maybe.fromCallable(new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.User>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.4
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.User call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings userAccountSettings;
                powerwatch.matrix.com.pwgen2android.shared.data.models.User user = null;
                java.lang.String string = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "enabled");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "password");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY);
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "weight");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "gender");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "language");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "unitType");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeFormatType");
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        boolean z = cursorQuery.getInt(columnIndexOrThrow2) != 0;
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        int i = cursorQuery.getInt(columnIndexOrThrow6);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                        float f = cursorQuery.getFloat(columnIndexOrThrow8);
                        java.lang.String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        boolean z2 = cursorQuery.getInt(columnIndexOrThrow10) != 0;
                        if (cursorQuery.isNull(columnIndexOrThrow11) && cursorQuery.isNull(columnIndexOrThrow12) && cursorQuery.isNull(columnIndexOrThrow13)) {
                            userAccountSettings = null;
                        } else {
                            java.lang.String string6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                            if (!cursorQuery.isNull(columnIndexOrThrow12)) {
                                string = cursorQuery.getString(columnIndexOrThrow12);
                            }
                            userAccountSettings = new powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings(string6, string, cursorQuery.getInt(columnIndexOrThrow13));
                        }
                        user = new powerwatch.matrix.com.pwgen2android.shared.data.models.User(j, z, string2, string3, string4, i, i2, f, string5, z2, userAccountSettings);
                    }
                    return user;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao
    public io.reactivex.Observable<powerwatch.matrix.com.pwgen2android.shared.data.models.User> observeUser() {
        final androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM User WHERE uid = 0", 0);
        return androidx.room.RxRoom.createObservable(this.__db, false, new java.lang.String[]{"User"}, new java.util.concurrent.Callable<powerwatch.matrix.com.pwgen2android.shared.data.models.User>() { // from class: powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.5
            @Override // java.util.concurrent.Callable
            public powerwatch.matrix.com.pwgen2android.shared.data.models.User call() throws java.lang.Exception {
                powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings userAccountSettings;
                powerwatch.matrix.com.pwgen2android.shared.data.models.User user = null;
                java.lang.String string = null;
                android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "enabled");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "password");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY);
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "weight");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "gender");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "language");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "unitType");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeFormatType");
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        boolean z = cursorQuery.getInt(columnIndexOrThrow2) != 0;
                        java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                        int i = cursorQuery.getInt(columnIndexOrThrow6);
                        int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                        float f = cursorQuery.getFloat(columnIndexOrThrow8);
                        java.lang.String string5 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                        boolean z2 = cursorQuery.getInt(columnIndexOrThrow10) != 0;
                        if (cursorQuery.isNull(columnIndexOrThrow11) && cursorQuery.isNull(columnIndexOrThrow12) && cursorQuery.isNull(columnIndexOrThrow13)) {
                            userAccountSettings = null;
                        } else {
                            java.lang.String string6 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                            if (!cursorQuery.isNull(columnIndexOrThrow12)) {
                                string = cursorQuery.getString(columnIndexOrThrow12);
                            }
                            userAccountSettings = new powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings(string6, string, cursorQuery.getInt(columnIndexOrThrow13));
                        }
                        user = new powerwatch.matrix.com.pwgen2android.shared.data.models.User(j, z, string2, string3, string4, i, i2, f, string5, z2, userAccountSettings);
                    }
                    return user;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                roomSQLiteQueryAcquire.release();
            }
        });
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.data.db.UserDao
    public powerwatch.matrix.com.pwgen2android.shared.data.models.User user() {
        powerwatch.matrix.com.pwgen2android.shared.data.models.User user;
        powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings userAccountSettings;
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM User WHERE uid = 0", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "enabled");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME);
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "password");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "age");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, io.fabric.sdk.android.services.settings.SettingsJsonConstants.ICON_HEIGHT_KEY);
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "weight");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "gender");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "shouldSync");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "language");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "unitType");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeFormatType");
            if (cursorQuery.moveToFirst()) {
                long j = cursorQuery.getLong(columnIndexOrThrow);
                boolean z = cursorQuery.getInt(columnIndexOrThrow2) != 0;
                java.lang.String string = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                java.lang.String string2 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                java.lang.String string3 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                int i = cursorQuery.getInt(columnIndexOrThrow6);
                int i2 = cursorQuery.getInt(columnIndexOrThrow7);
                float f = cursorQuery.getFloat(columnIndexOrThrow8);
                java.lang.String string4 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                boolean z2 = cursorQuery.getInt(columnIndexOrThrow10) != 0;
                if (cursorQuery.isNull(columnIndexOrThrow11) && cursorQuery.isNull(columnIndexOrThrow12) && cursorQuery.isNull(columnIndexOrThrow13)) {
                    userAccountSettings = null;
                } else {
                    userAccountSettings = new powerwatch.matrix.com.pwgen2android.shared.data.models.UserAccountSettings(cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13));
                }
                user = new powerwatch.matrix.com.pwgen2android.shared.data.models.User(j, z, string, string2, string3, i, i2, f, string4, z2, userAccountSettings);
            } else {
                user = null;
            }
            return user;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
