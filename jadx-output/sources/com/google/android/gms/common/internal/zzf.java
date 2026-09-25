package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzf implements android.content.ServiceConnection {
    private android.content.ComponentName mComponentName;
    private android.os.IBinder zzcz;
    private boolean zzea;
    private final com.google.android.gms.common.internal.GmsClientSupervisor.zza zzeb;
    private final /* synthetic */ com.google.android.gms.common.internal.zze zzec;
    private final java.util.Set<android.content.ServiceConnection> zzdz = new java.util.HashSet();
    private int mState = 2;

    public zzf(com.google.android.gms.common.internal.zze zzeVar, com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar) {
        this.zzec = zzeVar;
        this.zzeb = zzaVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.zzec.zzdu) {
            this.zzec.mHandler.removeMessages(1, this.zzeb);
            this.zzcz = iBinder;
            this.mComponentName = componentName;
            java.util.Iterator<android.content.ServiceConnection> it = this.zzdz.iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.mState = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.zzec.zzdu) {
            this.zzec.mHandler.removeMessages(1, this.zzeb);
            this.zzcz = null;
            this.mComponentName = componentName;
            java.util.Iterator<android.content.ServiceConnection> it = this.zzdz.iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.mState = 2;
        }
    }

    public final void zze(java.lang.String str) {
        this.mState = 3;
        boolean zZza = this.zzec.zzdw.zza(this.zzec.zzdv, str, this.zzeb.zzb(this.zzec.zzdv), this, this.zzeb.zzq());
        this.zzea = zZza;
        if (!zZza) {
            this.mState = 2;
            try {
                this.zzec.zzdw.unbindService(this.zzec.zzdv, this);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        } else {
            this.zzec.mHandler.sendMessageDelayed(this.zzec.mHandler.obtainMessage(1, this.zzeb), this.zzec.zzdy);
        }
    }

    public final void zzf(java.lang.String str) {
        this.zzec.mHandler.removeMessages(1, this.zzeb);
        this.zzec.zzdw.unbindService(this.zzec.zzdv, this);
        this.zzea = false;
        this.mState = 2;
    }

    public final void zza(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.google.android.gms.common.stats.ConnectionTracker unused = this.zzec.zzdw;
        android.content.Context unused2 = this.zzec.zzdv;
        this.zzeb.zzb(this.zzec.zzdv);
        this.zzdz.add(serviceConnection);
    }

    public final void zzb(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.google.android.gms.common.stats.ConnectionTracker unused = this.zzec.zzdw;
        android.content.Context unused2 = this.zzec.zzdv;
        this.zzdz.remove(serviceConnection);
    }

    public final boolean isBound() {
        return this.zzea;
    }

    public final int getState() {
        return this.mState;
    }

    public final boolean zza(android.content.ServiceConnection serviceConnection) {
        return this.zzdz.contains(serviceConnection);
    }

    public final boolean zzr() {
        return this.zzdz.isEmpty();
    }

    public final android.os.IBinder getBinder() {
        return this.zzcz;
    }

    public final android.content.ComponentName getComponentName() {
        return this.mComponentName;
    }
}
