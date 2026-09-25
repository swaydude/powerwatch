package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$1 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer {
    private final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager arg$1;

    private SQLiteEventStore$$Lambda$1(com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager) {
        this.arg$1 = schemaManager;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer lambdaFactory$(com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager schemaManager) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$1(schemaManager);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public java.lang.Object produce() {
        return this.arg$1.getWritableDatabase();
    }
}
