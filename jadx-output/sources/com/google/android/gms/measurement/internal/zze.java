package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
abstract class zze extends com.google.android.gms.measurement.internal.zzf {
    private boolean zza;

    zze(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzx.zza(this);
    }

    protected void zzaa() {
    }

    protected abstract boolean zzz();

    final boolean zzv() {
        return this.zza;
    }

    protected final void zzw() {
        if (!zzv()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzx() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (zzz()) {
            return;
        }
        this.zzx.zzag();
        this.zza = true;
    }

    public final void zzy() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzaa();
        this.zzx.zzag();
        this.zza = true;
    }
}
