package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes.dex */
final class zzd implements java.lang.Runnable {
    private final /* synthetic */ com.google.android.gms.tasks.Task zzg;
    private final /* synthetic */ com.google.android.gms.tasks.zzc zzh;

    zzd(com.google.android.gms.tasks.zzc zzcVar, com.google.android.gms.tasks.Task task) {
        this.zzh = zzcVar;
        this.zzg = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzg.isCanceled()) {
            this.zzh.zzf.zza();
            return;
        }
        try {
            this.zzh.zzf.setResult(this.zzh.zze.then(this.zzg));
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzh.zzf.setException((java.lang.Exception) e.getCause());
            } else {
                this.zzh.zzf.setException(e);
            }
        } catch (java.lang.Exception e2) {
            this.zzh.zzf.setException(e2);
        }
    }
}
