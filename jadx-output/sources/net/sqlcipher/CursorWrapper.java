package net.sqlcipher;

/* JADX INFO: loaded from: classes2.dex */
public class CursorWrapper extends android.database.CursorWrapper implements net.sqlcipher.Cursor {
    private final net.sqlcipher.Cursor mCursor;

    public CursorWrapper(net.sqlcipher.Cursor cursor) {
        super(cursor);
        this.mCursor = cursor;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor, net.sqlcipher.Cursor
    public int getType(int i) {
        return this.mCursor.getType(i);
    }

    @Override // android.database.CursorWrapper
    public net.sqlcipher.Cursor getWrappedCursor() {
        return this.mCursor;
    }
}
