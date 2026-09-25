package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$6 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$6 instance = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$6();

    private SQLiteEventStore$$Lambda$6() {
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$getTransportContextId$2((android.database.Cursor) obj);
    }
}
