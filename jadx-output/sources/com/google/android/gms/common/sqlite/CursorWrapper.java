package com.google.android.gms.common.sqlite;

/* JADX INFO: loaded from: classes.dex */
public class CursorWrapper extends android.database.CursorWrapper implements android.database.CrossProcessCursor {
    private android.database.AbstractWindowedCursor zzez;

    public CursorWrapper(android.database.Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof android.database.CursorWrapper); i++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof android.database.AbstractWindowedCursor)) {
            java.lang.String strValueOf = java.lang.String.valueOf(cursor.getClass().getName());
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "Unknown type: ".concat(strValueOf) : new java.lang.String("Unknown type: "));
        }
        this.zzez = (android.database.AbstractWindowedCursor) cursor;
    }

    @Override // android.database.CrossProcessCursor
    public android.database.CursorWindow getWindow() {
        return this.zzez.getWindow();
    }

    public void setWindow(android.database.CursorWindow cursorWindow) {
        this.zzez.setWindow(cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        this.zzez.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        return this.zzez.onMove(i, i2);
    }

    @Override // android.database.CursorWrapper
    public /* synthetic */ android.database.Cursor getWrappedCursor() {
        return this.zzez;
    }
}
