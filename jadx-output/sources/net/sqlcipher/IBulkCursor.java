package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public interface IBulkCursor extends android.os.IInterface {
    public static final int CLOSE_TRANSACTION = 12;
    public static final int COUNT_TRANSACTION = 2;
    public static final int DEACTIVATE_TRANSACTION = 6;
    public static final int DELETE_ROW_TRANSACTION = 5;
    public static final int GET_COLUMN_NAMES_TRANSACTION = 3;
    public static final int GET_CURSOR_WINDOW_TRANSACTION = 1;
    public static final int GET_EXTRAS_TRANSACTION = 10;
    public static final int ON_MOVE_TRANSACTION = 8;
    public static final int REQUERY_TRANSACTION = 7;
    public static final int RESPOND_TRANSACTION = 11;
    public static final int UPDATE_ROWS_TRANSACTION = 4;
    public static final int WANTS_ON_MOVE_TRANSACTION = 9;
    public static final java.lang.String descriptor = "android.content.IBulkCursor";

    void close() throws android.os.RemoteException;

    int count() throws android.os.RemoteException;

    void deactivate() throws android.os.RemoteException;

    boolean deleteRow(int i) throws android.os.RemoteException;

    java.lang.String[] getColumnNames() throws android.os.RemoteException;

    android.os.Bundle getExtras() throws android.os.RemoteException;

    boolean getWantsAllOnMoveCalls() throws android.os.RemoteException;

    net.sqlcipher.CursorWindow getWindow(int i) throws android.os.RemoteException;

    void onMove(int i) throws android.os.RemoteException;

    int requery(net.sqlcipher.IContentObserver iContentObserver, net.sqlcipher.CursorWindow cursorWindow) throws android.os.RemoteException;

    android.os.Bundle respond(android.os.Bundle bundle) throws android.os.RemoteException;

    boolean updateRows(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> map) throws android.os.RemoteException;
}
