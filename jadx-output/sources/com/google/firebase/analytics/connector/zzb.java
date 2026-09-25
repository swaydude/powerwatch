package com.google.firebase.analytics.connector;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@17.2.3 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzb implements java.util.concurrent.Executor {
    static final java.util.concurrent.Executor zza = new com.google.firebase.analytics.connector.zzb();

    private zzb() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
