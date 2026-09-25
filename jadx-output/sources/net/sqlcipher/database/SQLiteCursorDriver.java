package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public interface SQLiteCursorDriver {
    void cursorClosed();

    void cursorDeactivated();

    void cursorRequeried(android.database.Cursor cursor);

    net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory cursorFactory, java.lang.String[] strArr);

    void setBindArguments(java.lang.String[] strArr);
}
