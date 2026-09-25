package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzhi extends com.google.android.gms.measurement.internal.zzhf {
    private boolean zza;

    zzhi(com.google.android.gms.measurement.internal.zzgo zzgoVar) {
        super(zzgoVar);
        this.zzx.zza(this);
    }

    protected void f_() {
    }

    protected abstract boolean zze();

    final boolean zzz() {
        return this.zza;
    }

    protected final void zzaa() {
        if (!zzz()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzab() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (zze()) {
            return;
        }
        this.zzx.zzag();
        this.zza = true;
    }

    public final void zzac() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        f_();
        this.zzx.zzag();
        this.zza = true;
    }
}
