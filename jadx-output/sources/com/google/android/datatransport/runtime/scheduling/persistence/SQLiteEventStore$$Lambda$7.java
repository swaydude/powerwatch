package com.google.android.datatransport.runtime.scheduling.persistence;

/* JADX INFO: compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$7 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final java.lang.String arg$1;

    private SQLiteEventStore$$Lambda$7(java.lang.String str) {
        this.arg$1 = str;
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(java.lang.String str) {
        return new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$7(str);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object obj) {
        return com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$recordFailure$3(this.arg$1, (android.database.sqlite.SQLiteDatabase) obj);
    }
}
