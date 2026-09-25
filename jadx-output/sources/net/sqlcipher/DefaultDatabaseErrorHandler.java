package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDatabaseErrorHandler implements net.sqlcipher.DatabaseErrorHandler {
    private final java.lang.String TAG = getClass().getSimpleName();

    @Override // net.sqlcipher.DatabaseErrorHandler
    public void onCorruption(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase) {
        android.util.Log.e(this.TAG, "Corruption reported by sqlite on database, deleting: " + sQLiteDatabase.getPath());
        if (sQLiteDatabase.isOpen()) {
            android.util.Log.e(this.TAG, "Database object for corrupted database is already open, closing");
            try {
                sQLiteDatabase.close();
            } catch (java.lang.Exception e) {
                android.util.Log.e(this.TAG, "Exception closing Database object for corrupted database, ignored", e);
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }

    private void deleteDatabaseFile(java.lang.String str) {
        if (str.equalsIgnoreCase(net.sqlcipher.database.SQLiteDatabase.MEMORY) || str.trim().length() == 0) {
            return;
        }
        android.util.Log.e(this.TAG, "deleting the database file: " + str);
        try {
            new java.io.File(str).delete();
        } catch (java.lang.Exception e) {
            android.util.Log.w(this.TAG, "delete failed: " + e.getMessage());
        }
    }
}
