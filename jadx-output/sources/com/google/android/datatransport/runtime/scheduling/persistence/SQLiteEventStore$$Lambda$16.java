package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$16 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final java.util.Map arg$1;

    private SQLiteEventStore$$Lambda$16(java.util.Map map) {
        this.arg$1 = map;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(java.util.Map map) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$16(map);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$loadMetadata$13(this.arg$1, (android.database.Cursor) obj);
    }
}
