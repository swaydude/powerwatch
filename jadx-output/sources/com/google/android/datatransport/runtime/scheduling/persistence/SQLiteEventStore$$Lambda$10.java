package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$10 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final long arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;

    private SQLiteEventStore$$Lambda$10(long j, com.google.android.datatransport.runtime.TransportContext transportContext) {
        this.arg$1 = j;
        this.arg$2 = transportContext;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(long j, com.google.android.datatransport.runtime.TransportContext transportContext) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$10(j, transportContext);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$recordNextCallTime$6(this.arg$1, this.arg$2, (android.database.sqlite.SQLiteDatabase) obj);
    }
}
