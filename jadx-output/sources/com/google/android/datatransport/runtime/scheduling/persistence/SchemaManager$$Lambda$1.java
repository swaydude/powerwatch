package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SchemaManager$$Lambda$1 implements com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$1 instance = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$1();

    private SchemaManager$$Lambda$1() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    public void upgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.lambda$static$0(sQLiteDatabase);
    }
}
