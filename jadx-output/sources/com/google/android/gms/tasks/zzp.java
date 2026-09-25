package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzp implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.Task zzg;
    private final /* synthetic */ com.google.android.gms.tasks.zzo zzs;

    zzp(com.google.android.gms.tasks.zzo zzoVar, com.google.android.gms.tasks.Task task) {
        this.zzs = zzoVar;
        this.zzg = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.tasks.Task taskThen = this.zzs.zzr.then(this.zzg.getResult());
            if (taskThen == null) {
                this.zzs.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            taskThen.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zzw, this.zzs);
            taskThen.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zzw, this.zzs);
            taskThen.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zzw, this.zzs);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzs.onFailure((java.lang.Exception) e.getCause());
            } else {
                this.zzs.onFailure(e);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            this.zzs.onCanceled();
        } catch (java.lang.Exception e2) {
            this.zzs.onFailure(e2);
        }
    }
}
