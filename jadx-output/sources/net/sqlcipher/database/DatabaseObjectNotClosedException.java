package net.sqlcipher.database;

/* JADX INFO: loaded from: classes2.dex */
public class DatabaseObjectNotClosedException extends java.lang.RuntimeException {
    private static final java.lang.String s = "Application did not close the cursor or database object that was opened here";

    public DatabaseObjectNotClosedException() {
        super(s);
    }
}
