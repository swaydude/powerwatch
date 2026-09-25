package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$15 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final java.util.List arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;

    private SQLiteEventStore$$Lambda$15(java.util.List list, com.google.android.datatransport.runtime.TransportContext transportContext) {
        this.arg$1 = list;
        this.arg$2 = transportContext;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(java.util.List list, com.google.android.datatransport.runtime.TransportContext transportContext) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$15(list, transportContext);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$loadEvents$12(this.arg$1, this.arg$2, (android.database.Cursor) obj);
    }
}
