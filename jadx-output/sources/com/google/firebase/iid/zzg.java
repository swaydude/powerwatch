package com.google.firebase.iid;

/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@20.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzg implements java.util.concurrent.Executor {
    static final java.util.concurrent.Executor zza = new com.google.firebase.iid.zzg();

    private zzg() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.run();
    }
}
