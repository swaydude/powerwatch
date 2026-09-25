package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$5 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;
    private final com.google.android.datatransport.runtime.EventInternal arg$3;

    private SQLiteEventStore$$Lambda$5(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        this.arg$1 = sQLiteEventStore;
        this.arg$2 = transportContext;
        this.arg$3 = eventInternal;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.TransportContext transportContext, com.google.android.datatransport.runtime.EventInternal eventInternal) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$5(sQLiteEventStore, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$persist$1(this.arg$1, this.arg$2, this.arg$3, (android.database.sqlite.SQLiteDatabase) obj);
    }
}
