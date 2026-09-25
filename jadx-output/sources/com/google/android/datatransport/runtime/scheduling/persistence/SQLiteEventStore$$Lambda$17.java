package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$17 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer {
    private final android.database.sqlite.SQLiteDatabase arg$1;

    private SQLiteEventStore$$Lambda$17(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        this.arg$1 = sQLiteDatabase;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer lambdaFactory$(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$17(sQLiteDatabase);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public java.lang.Object produce() {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$ensureBeginTransaction$14(this.arg$1);
    }
}
