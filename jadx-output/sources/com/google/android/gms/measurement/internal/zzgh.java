package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgh extends com.google.android.gms.measurement.internal.zzhi {
    private static final java.util.concurrent.atomic.AtomicLong zzj = new java.util.concurrent.atomic.AtomicLong(Long.MIN_VALUE);
    private com.google.android.gms.measurement.internal.zzgl zza;
    private com.google.android.gms.measurement.internal.zzgl zzb;
    private final java.util.concurrent.PriorityBlockingQueue<com.google.android.gms.measurement.internal.zzgm<?>> zzc;
    private final java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.zzgm<?>> zzd;
    private final java.lang.Thread.UncaughtExceptionHandler zze;
    private final java.lang.Thread.UncaughtExceptionHandler zzf;
    private final java.lang.Object zzg;
    private final java.util.concurrent.Semaphore zzh;
    private volatile boolean zzi;

    zzgh(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzg = new java.lang.Object();
        this.zzh = new java.util.concurrent.Semaphore(2);
        this.zzc = new java.util.concurrent.PriorityBlockingQueue<>();
        this.zzd = new java.util.concurrent.LinkedBlockingQueue();
        this.zze = new com.google.android.gms.measurement.internal.zzgj(this, "Thread death: Uncaught exception on worker thread");
        this.zzf = new com.google.android.gms.measurement.internal.zzgj(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzhi
    protected final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void zzd() {
        if (java.lang.Thread.currentThread() != this.zza) {
            throw new java.lang.IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void zzc() {
        if (java.lang.Thread.currentThread() != this.zzb) {
            throw new java.lang.IllegalStateException("Call expected from network thread");
        }
    }

    public final boolean zzg() {
        return java.lang.Thread.currentThread() == this.zza;
    }

    public final <V> java.util.concurrent.Future<V> zza(java.util.concurrent.Callable<V> callable) throws java.lang.IllegalStateException {
        zzaa();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.measurement.internal.zzgm<?> zzgmVar = new com.google.android.gms.measurement.internal.zzgm<>(this, (java.util.concurrent.Callable<?>) callable, false, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zza) {
            if (!this.zzc.isEmpty()) {
                zzr().zzi().zza("Callable skipped the worker queue.");
            }
            zzgmVar.run();
        } else {
            zza(zzgmVar);
        }
        return zzgmVar;
    }

    public final <V> java.util.concurrent.Future<V> zzb(java.util.concurrent.Callable<V> callable) throws java.lang.IllegalStateException {
        zzaa();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(callable);
        com.google.android.gms.measurement.internal.zzgm<?> zzgmVar = new com.google.android.gms.measurement.internal.zzgm<>(this, (java.util.concurrent.Callable<?>) callable, true, "Task exception on worker thread");
        if (java.lang.Thread.currentThread() == this.zza) {
            zzgmVar.run();
        } else {
            zza(zzgmVar);
        }
        return zzgmVar;
    }

    public final void zza(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzaa();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        zza(new com.google.android.gms.measurement.internal.zzgm<>(this, runnable, false, "Task exception on worker thread"));
    }

    final <T> T zza(java.util.concurrent.atomic.AtomicReference<T> atomicReference, long j, java.lang.String str, java.lang.Runnable runnable) {
        synchronized (atomicReference) {
            zzq().zza(runnable);
            try {
                atomicReference.wait(j);
            } catch (java.lang.InterruptedException unused) {
                com.google.android.gms.measurement.internal.zzfm zzfmVarZzi = zzr().zzi();
                java.lang.String strValueOf = java.lang.String.valueOf(str);
                zzfmVarZzi.zza(strValueOf.length() != 0 ? "Interrupted waiting for ".concat(strValueOf) : new java.lang.String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            com.google.android.gms.measurement.internal.zzfm zzfmVarZzi2 = zzr().zzi();
            java.lang.String strValueOf2 = java.lang.String.valueOf(str);
            zzfmVarZzi2.zza(strValueOf2.length() != 0 ? "Timed out waiting for ".concat(strValueOf2) : new java.lang.String("Timed out waiting for "));
        }
        return t;
    }

    private final void zza(com.google.android.gms.measurement.internal.zzgm<?> zzgmVar) {
        synchronized (this.zzg) {
            this.zzc.add(zzgmVar);
            com.google.android.gms.measurement.internal.zzgl zzglVar = this.zza;
            if (zzglVar == null) {
                com.google.android.gms.measurement.internal.zzgl zzglVar2 = new com.google.android.gms.measurement.internal.zzgl(this, "Measurement Worker", this.zzc);
                this.zza = zzglVar2;
                zzglVar2.setUncaughtExceptionHandler(this.zze);
                this.zza.start();
            } else {
                zzglVar.zza();
            }
        }
    }

    public final void zzb(java.lang.Runnable runnable) throws java.lang.IllegalStateException {
        zzaa();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(runnable);
        com.google.android.gms.measurement.internal.zzgm<?> zzgmVar = new com.google.android.gms.measurement.internal.zzgm<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzg) {
            this.zzd.add(zzgmVar);
            com.google.android.gms.measurement.internal.zzgl zzglVar = this.zzb;
            if (zzglVar == null) {
                com.google.android.gms.measurement.internal.zzgl zzglVar2 = new com.google.android.gms.measurement.internal.zzgl(this, "Measurement Network", this.zzd);
                this.zzb = zzglVar2;
                zzglVar2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzglVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ android.content.Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfi zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzgh zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzfk zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzft zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ com.google.android.gms.measurement.internal.zzw zzu() {
        return super.zzu();
    }

    static /* synthetic */ com.google.android.gms.measurement.internal.zzgl zza(com.google.android.gms.measurement.internal.zzgh zzghVar, com.google.android.gms.measurement.internal.zzgl zzglVar) {
        zzghVar.zza = null;
        return null;
    }

    static /* synthetic */ com.google.android.gms.measurement.internal.zzgl zzb(com.google.android.gms.measurement.internal.zzgh zzghVar, com.google.android.gms.measurement.internal.zzgl zzglVar) {
        zzghVar.zzb = null;
        return null;
    }
}
