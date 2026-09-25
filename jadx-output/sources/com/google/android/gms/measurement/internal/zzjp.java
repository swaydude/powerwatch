package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzjp implements android.content.ServiceConnection, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzix zza;
    private volatile boolean zzb;
    private volatile com.google.android.gms.measurement.internal.zzfh zzc;

    protected zzjp(com.google.android.gms.measurement.internal.zzix zzixVar) {
        this.zza = zzixVar;
    }

    public final void zza(android.content.Intent intent) {
        this.zza.zzd();
        android.content.Context contextZzn = this.zza.zzn();
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzr().zzx().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzr().zzx().zza("Using local app measurement service");
            this.zzb = true;
            connectionTracker.bindService(contextZzn, intent, this.zza.zza, 129);
        }
    }

    public final void zza() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.measurement.internal.zzfc zzfeVar;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzr().zzf().zza("Service connected with null binder");
                return;
            }
            com.google.android.gms.measurement.internal.zzfc zzfcVar = null;
            try {
                java.lang.String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.measurement.internal.zzfc) {
                            zzfeVar = (com.google.android.gms.measurement.internal.zzfc) iInterfaceQueryLocalInterface;
                        } else {
                            zzfeVar = new com.google.android.gms.measurement.internal.zzfe(iBinder);
                        }
                        zzfcVar = zzfeVar;
                    }
                    this.zza.zzr().zzx().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzr().zzf().zza("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (android.os.RemoteException unused) {
                this.zza.zzr().zzf().zza("Service connect failed to get IMeasurementService");
            }
            if (zzfcVar == null) {
                this.zzb = false;
                try {
                    com.google.android.gms.common.stats.ConnectionTracker.getInstance().unbindService(this.zza.zzn(), this.zza.zza);
                } catch (java.lang.IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzjs(this, zzfcVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzr().zzw().zza("Service disconnected");
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzjr(this, componentName));
    }

    public final void zzb() {
        this.zza.zzd();
        android.content.Context contextZzn = this.zza.zzn();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzr().zzx().zza("Connection attempt already in progress");
                return;
            }
            if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzr().zzx().zza("Already awaiting connection attempt");
                return;
            }
            this.zzc = new com.google.android.gms.measurement.internal.zzfh(contextZzn, android.os.Looper.getMainLooper(), this, this);
            this.zza.zzr().zzx().zza("Connecting to remote service");
            this.zzb = true;
            this.zzc.checkAvailabilityAndConnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzju(this, this.zzc.getService()));
            } catch (android.os.DeadObjectException | java.lang.IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzr().zzw().zza("Service connection suspended");
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzjt(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        com.google.android.gms.measurement.internal.zzfk zzfkVarZzd = this.zza.zzx.zzd();
        if (zzfkVarZzd != null) {
            zzfkVarZzd.zzi().zza("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzjw(this));
    }

    static /* synthetic */ boolean zza(com.google.android.gms.measurement.internal.zzjp zzjpVar, boolean z) {
        zzjpVar.zzb = false;
        return false;
    }
}
