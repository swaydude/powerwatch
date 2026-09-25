package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$20 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$20 instance = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$20();

    private SQLiteEventStore$$Lambda$20() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(((android.database.Cursor) obj).moveToNext());
    }
}
