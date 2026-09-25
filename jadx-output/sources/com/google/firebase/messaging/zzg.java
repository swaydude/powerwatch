package com.google.firebase.messaging;

/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzg implements java.util.concurrent.Executor {
    static final java.util.concurrent.Executor zza = new com.google.firebase.messaging.zzg();

    private zzg() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
