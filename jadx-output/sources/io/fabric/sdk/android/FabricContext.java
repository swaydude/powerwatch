package io.fabric.sdk.android;

/* JADX INFO: loaded from: classes2.dex */
class FabricContext extends android.content.ContextWrapper {
    private final java.lang.String componentName;
    private final java.lang.String componentPath;

    public FabricContext(android.content.Context context, java.lang.String str, java.lang.String str2) {
        super(context);
        this.componentName = str;
        this.componentPath = str2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getDatabasePath(java.lang.String str) {
        java.io.File file = new java.io.File(super.getDatabasePath(str).getParentFile(), this.componentPath);
        file.mkdirs();
        return new java.io.File(file, str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String str, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory) {
        return android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String str, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory, android.database.DatabaseErrorHandler databaseErrorHandler) {
        return android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getFilesDir() {
        return new java.io.File(super.getFilesDir(), this.componentPath);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getExternalFilesDir(java.lang.String str) {
        return new java.io.File(super.getExternalFilesDir(str), this.componentPath);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getCacheDir() {
        return new java.io.File(super.getCacheDir(), this.componentPath);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.io.File getExternalCacheDir() {
        return new java.io.File(super.getExternalCacheDir(), this.componentPath);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.SharedPreferences getSharedPreferences(java.lang.String str, int i) {
        return super.getSharedPreferences(this.componentName + ":" + str, i);
    }
}
