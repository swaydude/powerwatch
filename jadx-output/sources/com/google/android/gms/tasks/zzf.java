package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzf implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.Task zzg;
    private final /* synthetic */ com.google.android.gms.tasks.zze zzi;

    zzf(com.google.android.gms.tasks.zze zzeVar, com.google.android.gms.tasks.Task task) {
        this.zzi = zzeVar;
        this.zzg = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.tasks.Task task = (com.google.android.gms.tasks.Task) this.zzi.zze.then(this.zzg);
            if (task == null) {
                this.zzi.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            task.addOnSuccessListener(com.google.android.gms.tasks.TaskExecutors.zzw, this.zzi);
            task.addOnFailureListener(com.google.android.gms.tasks.TaskExecutors.zzw, this.zzi);
            task.addOnCanceledListener(com.google.android.gms.tasks.TaskExecutors.zzw, this.zzi);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzi.zzf.setException((java.lang.Exception) e.getCause());
            } else {
                this.zzi.zzf.setException(e);
            }
        } catch (java.lang.Exception e2) {
            this.zzi.zzf.setException(e2);
        }
    }
}
