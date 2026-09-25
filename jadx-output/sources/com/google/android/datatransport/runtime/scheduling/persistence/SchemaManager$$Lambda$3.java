package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SchemaManager$$Lambda$3 implements com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$3 instance = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$3();

    private SchemaManager$$Lambda$3() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    public void upgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
