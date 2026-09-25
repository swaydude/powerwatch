package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzgl extends java.lang.Thread {
    private final java.lang.Object zza;
    private final java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.zzgm<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzd;

    public zzgl(com.google.android.gms.measurement.internal.zzgh zzghVar, java.lang.String str, java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.zzgm<?>> blockingQueue) {
        this.zzd = zzghVar;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(blockingQueue);
        this.zza = new java.lang.Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.zzd.zzh.acquire();
                z = true;
            } catch (java.lang.InterruptedException e) {
                zza(e);
            }
        }
        try {
            int threadPriority = android.os.Process.getThreadPriority(android.os.Process.myTid());
            while (true) {
                com.google.android.gms.measurement.internal.zzgm<?> zzgmVarPoll = this.zzb.poll();
                if (zzgmVarPoll != null) {
                    android.os.Process.setThreadPriority(zzgmVarPoll.zza ? threadPriority : 10);
                    zzgmVarPoll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null && !this.zzd.zzi) {
                            try {
                                this.zza.wait(30000L);
                            } catch (java.lang.InterruptedException e2) {
                                zza(e2);
                            }
                        }
                    }
                    synchronized (this.zzd.zzg) {
                        if (this.zzb.peek() == null) {
                            break;
                        }
                    }
                }
            }
            if (this.zzd.zzt().zza(com.google.android.gms.measurement.internal.zzap.zzct)) {
                zzb();
            }
            zzb();
        } catch (java.lang.Throwable th) {
            zzb();
            throw th;
        }
    }

    private final void zzb() {
        synchronized (this.zzd.zzg) {
            if (!this.zzc) {
                this.zzd.zzh.release();
                this.zzd.zzg.notifyAll();
                if (this == this.zzd.zza) {
                    com.google.android.gms.measurement.internal.zzgh.zza(this.zzd, null);
                } else if (this == this.zzd.zzb) {
                    com.google.android.gms.measurement.internal.zzgh.zzb(this.zzd, null);
                } else {
                    this.zzd.zzr().zzf().zza("Current scheduler thread is neither worker nor network");
                }
                this.zzc = true;
            }
        }
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }

    private final void zza(java.lang.InterruptedException interruptedException) {
        this.zzd.zzr().zzi().zza(java.lang.String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
