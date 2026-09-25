package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends com.google.android.gms.internal.location.zzk {
    private final com.google.android.gms.internal.location.zzas zzde;

    public zzaz(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, java.lang.String str) {
        this(context, looper, connectionCallbacks, onConnectionFailedListener, str, com.google.android.gms.common.internal.ClientSettings.createDefault(context));
    }

    public zzaz(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, java.lang.String str, @javax.annotation.Nullable com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.zzde = new com.google.android.gms.internal.location.zzas(context, this.zzcb);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this.zzde) {
            if (isConnected()) {
                try {
                    this.zzde.removeAllListeners();
                    this.zzde.zzb();
                } catch (java.lang.Exception e) {
                    android.util.Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
            throw th;
        }
    }

    public final android.location.Location getLastLocation() throws android.os.RemoteException {
        return this.zzde.getLastLocation();
    }

    public final com.google.android.gms.location.LocationAvailability zza() throws android.os.RemoteException {
        return this.zzde.zza();
    }

    public final void zza(long j, android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        ((com.google.android.gms.internal.location.zzao) getService()).zza(j, true, pendingIntent);
    }

    public final void zza(android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzao) getService()).zza(pendingIntent, new com.google.android.gms.common.api.internal.StatusCallback(resultHolder));
    }

    public final void zza(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzde.zza(pendingIntent, zzajVar);
    }

    public final void zza(android.location.Location location) throws android.os.RemoteException {
        this.zzde.zza(location);
    }

    public final void zza(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener> listenerKey, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzde.zza(listenerKey, zzajVar);
    }

    public final void zza(com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzde.zza(zzajVar);
    }

    public final void zza(com.google.android.gms.internal.location.zzbd zzbdVar, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        synchronized (this.zzde) {
            this.zzde.zza(zzbdVar, listenerHolder, zzajVar);
        }
    }

    public final void zza(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzao) getService()).zza(activityTransitionRequest, pendingIntent, new com.google.android.gms.common.api.internal.StatusCallback(resultHolder));
    }

    public final void zza(com.google.android.gms.location.GeofencingRequest geofencingRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(geofencingRequest, "geofencingRequest can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzao) getService()).zza(geofencingRequest, pendingIntent, new com.google.android.gms.internal.location.zzba(resultHolder));
    }

    public final void zza(com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzde.zza(locationRequest, pendingIntent, zzajVar);
    }

    public final void zza(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        synchronized (this.zzde) {
            this.zzde.zza(locationRequest, listenerHolder, zzajVar);
        }
    }

    public final void zza(com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.location.LocationSettingsResult> resultHolder, @javax.annotation.Nullable java.lang.String str) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkArgument(locationSettingsRequest != null, "locationSettingsRequest can't be null nor empty.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        ((com.google.android.gms.internal.location.zzao) getService()).zza(locationSettingsRequest, new com.google.android.gms.internal.location.zzbc(resultHolder), str);
    }

    public final void zza(com.google.android.gms.location.zzal zzalVar, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> resultHolder) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzalVar, "removeGeofencingRequest can't be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(resultHolder, "ResultHolder not provided.");
        ((com.google.android.gms.internal.location.zzao) getService()).zza(zzalVar, new com.google.android.gms.internal.location.zzbb(resultHolder));
    }

    public final void zza(boolean z) throws android.os.RemoteException {
        this.zzde.zza(z);
    }

    public final void zzb(android.app.PendingIntent pendingIntent) throws android.os.RemoteException {
        checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
        ((com.google.android.gms.internal.location.zzao) getService()).zzb(pendingIntent);
    }

    public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback> listenerKey, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzde.zzb(listenerKey, zzajVar);
    }
}
