package powerwatch.matrix.com.pwgen2android.shared.cloud.auth;

/* JADX INFO: loaded from: classes3.dex */
public final class TokenStorage_Impl implements powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials> __insertionAdapterOfPasswordCredentials;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public TokenStorage_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfPasswordCredentials = new androidx.room.EntityInsertionAdapter<powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials>(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `PasswordCredentials` (`uid`,`accessToken`,`tokenType`,`refreshToken`,`expiresIn`,`scope`,`tokenValidUntil`,`email`,`password`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials value) {
                stmt.bindLong(1, value.getUid());
                if (value.getAccessToken() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getAccessToken());
                }
                if (value.getTokenType() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getTokenType());
                }
                if (value.getRefreshToken() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getRefreshToken());
                }
                stmt.bindLong(5, value.getExpiresIn());
                if (value.getScope() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getScope());
                }
                stmt.bindLong(7, value.getTokenValidUntil());
                if (value.getEmail() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getEmail());
                }
                if (value.getPassword() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getPassword());
                }
            }
        };
        this.__preparedStmtOfDelete = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM PasswordCredentials WHERE uid = 0";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM PasswordCredentials";
            }
        };
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage
    public void add(final powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfPasswordCredentials.insert(passwordCredentials);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage
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

    @Override // powerwatch.matrix.com.pwgen2android.shared.cloud.auth.TokenStorage
    public powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials get() {
        androidx.room.RoomSQLiteQuery roomSQLiteQueryAcquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM PasswordCredentials WHERE uid = 0", 0);
        this.__db.assertNotSuspendingTransaction();
        powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials passwordCredentials = null;
        android.database.Cursor cursorQuery = androidx.room.util.DBUtil.query(this.__db, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "uid");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "accessToken");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "tokenType");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "refreshToken");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "expiresIn");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "scope");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "tokenValidUntil");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "email");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(cursorQuery, "password");
            if (cursorQuery.moveToFirst()) {
                passwordCredentials = new powerwatch.matrix.com.pwgen2android.shared.cloud.auth.PasswordCredentials(cursorQuery.getInt(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getLong(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.getLong(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9));
            }
            return passwordCredentials;
        } finally {
            cursorQuery.close();
            roomSQLiteQueryAcquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
