package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
final class zze extends com.google.android.gms.common.internal.GmsClientSupervisor implements android.os.Handler.Callback {
    private final android.os.Handler mHandler;
    private final android.content.Context zzdv;
    private final java.util.HashMap<com.google.android.gms.common.internal.GmsClientSupervisor.zza, com.google.android.gms.common.internal.zzf> zzdu = new java.util.HashMap<>();
    private final com.google.android.gms.common.stats.ConnectionTracker zzdw = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
    private final long zzdx = 5000;
    private final long zzdy = 300000;

    zze(android.content.Context context) {
        this.zzdv = context.getApplicationContext();
        this.mHandler = new com.google.android.gms.internal.common.zze(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final boolean zza(com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        boolean zIsBound;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzdu) {
            com.google.android.gms.common.internal.zzf zzfVar = this.zzdu.get(zzaVar);
            if (zzfVar == null) {
                zzfVar = new com.google.android.gms.common.internal.zzf(this, zzaVar);
                zzfVar.zza(serviceConnection, str);
                zzfVar.zze(str);
                this.zzdu.put(zzaVar, zzfVar);
            } else {
                this.mHandler.removeMessages(0, zzaVar);
                if (zzfVar.zza(serviceConnection)) {
                    java.lang.String strValueOf = java.lang.String.valueOf(zzaVar);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                zzfVar.zza(serviceConnection, str);
                int state = zzfVar.getState();
                if (state == 1) {
                    serviceConnection.onServiceConnected(zzfVar.getComponentName(), zzfVar.getBinder());
                } else if (state == 2) {
                    zzfVar.zze(str);
                }
            }
            zIsBound = zzfVar.isBound();
        }
        return zIsBound;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    protected final void zzb(com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzdu) {
            com.google.android.gms.common.internal.zzf zzfVar = this.zzdu.get(zzaVar);
            if (zzfVar == null) {
                java.lang.String strValueOf = java.lang.String.valueOf(zzaVar);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (!zzfVar.zza(serviceConnection)) {
                java.lang.String strValueOf2 = java.lang.String.valueOf(zzaVar);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            zzfVar.zzb(serviceConnection, str);
            if (zzfVar.zzr()) {
                this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, zzaVar), this.zzdx);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.zzdu) {
                com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar = (com.google.android.gms.common.internal.GmsClientSupervisor.zza) message.obj;
                com.google.android.gms.common.internal.zzf zzfVar = this.zzdu.get(zzaVar);
                if (zzfVar != null && zzfVar.zzr()) {
                    if (zzfVar.isBound()) {
                        zzfVar.zzf("GmsClientSupervisor");
                    }
                    this.zzdu.remove(zzaVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.zzdu) {
            com.google.android.gms.common.internal.GmsClientSupervisor.zza zzaVar2 = (com.google.android.gms.common.internal.GmsClientSupervisor.zza) message.obj;
            com.google.android.gms.common.internal.zzf zzfVar2 = this.zzdu.get(zzaVar2);
            if (zzfVar2 != null && zzfVar2.getState() == 3) {
                java.lang.String strValueOf = java.lang.String.valueOf(zzaVar2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(strValueOf);
                android.util.Log.e("GmsClientSupervisor", sb.toString(), new java.lang.Exception());
                android.content.ComponentName componentName = zzfVar2.getComponentName();
                if (componentName == null) {
                    componentName = zzaVar2.getComponentName();
                }
                if (componentName == null) {
                    componentName = new android.content.ComponentName(zzaVar2.getPackage(), "unknown");
                }
                zzfVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
