package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public final class SqliteWrapper {
    private static final java.lang.String SQLITE_EXCEPTION_DETAIL_MESSAGE = "unable to open database file";
    private static final java.lang.String TAG = "SqliteWrapper";

    private SqliteWrapper() {
    }

    private static boolean isLowMemory(net.sqlcipher.database.SQLiteException sQLiteException) {
        return sQLiteException.getMessage().equals(SQLITE_EXCEPTION_DETAIL_MESSAGE);
    }

    public static void checkSQLiteException(android.content.Context context, net.sqlcipher.database.SQLiteException sQLiteException) {
        if (isLowMemory(sQLiteException)) {
            android.widget.Toast.makeText(context, sQLiteException.getMessage(), 0).show();
            return;
        }
        throw sQLiteException;
    }

    public static net.sqlcipher.Cursor query(android.content.Context context, android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        try {
            return (net.sqlcipher.Cursor) contentResolver.query(uri, strArr, str, strArr2, str2);
        } catch (net.sqlcipher.database.SQLiteException e) {
            android.util.Log.e(TAG, "Catch a SQLiteException when query: ", e);
            checkSQLiteException(context, e);
            return null;
        }
    }

    public static boolean requery(android.content.Context context, android.database.Cursor cursor) {
        try {
            return cursor.requery();
        } catch (net.sqlcipher.database.SQLiteException e) {
            android.util.Log.e(TAG, "Catch a SQLiteException when requery: ", e);
            checkSQLiteException(context, e);
            return false;
        }
    }

    public static int update(android.content.Context context, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        try {
            return contentResolver.update(uri, contentValues, str, strArr);
        } catch (net.sqlcipher.database.SQLiteException e) {
            android.util.Log.e(TAG, "Catch a SQLiteException when update: ", e);
            checkSQLiteException(context, e);
            return -1;
        }
    }

    public static int delete(android.content.Context context, android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        try {
            return contentResolver.delete(uri, str, strArr);
        } catch (net.sqlcipher.database.SQLiteException e) {
            android.util.Log.e(TAG, "Catch a SQLiteException when delete: ", e);
            checkSQLiteException(context, e);
            return -1;
        }
    }

    public static android.net.Uri insert(android.content.Context context, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues) {
        try {
            return contentResolver.insert(uri, contentValues);
        } catch (net.sqlcipher.database.SQLiteException e) {
            android.util.Log.e(TAG, "Catch a SQLiteException when insert: ", e);
            checkSQLiteException(context, e);
            return null;
        }
    }
}
