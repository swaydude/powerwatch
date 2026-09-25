package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public interface SQLiteDatabaseHook {
    void postKey(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase);

    void preKey(net.sqlcipher.database.SQLiteDatabase sQLiteDatabase);
}
