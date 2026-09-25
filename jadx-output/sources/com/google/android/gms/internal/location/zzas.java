package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public final class zzas {
    private final com.google.android.gms.internal.location.zzbj<com.google.android.gms.internal.location.zzao> zzcb;
    private final android.content.Context zzcu;
    private android.content.ContentProviderClient zzcv = null;
    private boolean zzcw = false;
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener>, com.google.android.gms.internal.location.zzax> zzcx = new java.util.HashMap();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<java.lang.Object>, com.google.android.gms.internal.location.zzaw> zzcy = new java.util.HashMap();
    private final java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback>, com.google.android.gms.internal.location.zzat> zzcz = new java.util.HashMap();

    public zzas(android.content.Context context, com.google.android.gms.internal.location.zzbj<com.google.android.gms.internal.location.zzao> zzbjVar) {
        this.zzcu = context;
        this.zzcb = zzbjVar;
    }

    private final com.google.android.gms.internal.location.zzax zza(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder) {
        com.google.android.gms.internal.location.zzax zzaxVar;
        synchronized (this.zzcx) {
            zzaxVar = this.zzcx.get(listenerHolder.getListenerKey());
            if (zzaxVar == null) {
                zzaxVar = new com.google.android.gms.internal.location.zzax(listenerHolder);
            }
            this.zzcx.put(listenerHolder.getListenerKey(), zzaxVar);
        }
        return zzaxVar;
    }

    private final com.google.android.gms.internal.location.zzat zzb(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder) {
        com.google.android.gms.internal.location.zzat zzatVar;
        synchronized (this.zzcz) {
            zzatVar = this.zzcz.get(listenerHolder.getListenerKey());
            if (zzatVar == null) {
                zzatVar = new com.google.android.gms.internal.location.zzat(listenerHolder);
            }
            this.zzcz.put(listenerHolder.getListenerKey(), zzatVar);
        }
        return zzatVar;
    }

    public final android.location.Location getLastLocation() throws android.os.RemoteException {
        this.zzcb.checkConnected();
        return ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(this.zzcu.getPackageName());
    }

    public final void removeAllListeners() throws android.os.RemoteException {
        synchronized (this.zzcx) {
            for (com.google.android.gms.internal.location.zzax zzaxVar : this.zzcx.values()) {
                if (zzaxVar != null) {
                    ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(com.google.android.gms.internal.location.zzbf.zza(zzaxVar, (com.google.android.gms.internal.location.zzaj) null));
                }
            }
            this.zzcx.clear();
        }
        synchronized (this.zzcz) {
            for (com.google.android.gms.internal.location.zzat zzatVar : this.zzcz.values()) {
                if (zzatVar != null) {
                    ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(com.google.android.gms.internal.location.zzbf.zza(zzatVar, (com.google.android.gms.internal.location.zzaj) null));
                }
            }
            this.zzcz.clear();
        }
        synchronized (this.zzcy) {
            for (com.google.android.gms.internal.location.zzaw zzawVar : this.zzcy.values()) {
                if (zzawVar != null) {
                    ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(new com.google.android.gms.internal.location.zzo(2, null, zzawVar.asBinder(), null));
                }
            }
            this.zzcy.clear();
        }
    }

    public final com.google.android.gms.location.LocationAvailability zza() throws android.os.RemoteException {
        this.zzcb.checkConnected();
        return ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zzb(this.zzcu.getPackageName());
    }

    public final void zza(android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(new com.google.android.gms.internal.location.zzbf(2, null, null, pendingIntent, null, zzajVar != null ? zzajVar.asBinder() : null));
    }

    public final void zza(android.location.Location location) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(location);
    }

    public final void zza(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationListener> listenerKey, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzcx) {
            com.google.android.gms.internal.location.zzax zzaxVarRemove = this.zzcx.remove(listenerKey);
            if (zzaxVarRemove != null) {
                zzaxVarRemove.release();
                ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(com.google.android.gms.internal.location.zzbf.zza(zzaxVarRemove, zzajVar));
            }
        }
    }

    public final void zza(com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(zzajVar);
    }

    public final void zza(com.google.android.gms.internal.location.zzbd zzbdVar, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(new com.google.android.gms.internal.location.zzbf(1, zzbdVar, null, null, zzb(listenerHolder).asBinder(), zzajVar != null ? zzajVar.asBinder() : null));
    }

    public final void zza(com.google.android.gms.location.LocationRequest locationRequest, android.app.PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(new com.google.android.gms.internal.location.zzbf(1, com.google.android.gms.internal.location.zzbd.zza(locationRequest), null, pendingIntent, null, zzajVar != null ? zzajVar.asBinder() : null));
    }

    public final void zza(com.google.android.gms.location.LocationRequest locationRequest, com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(new com.google.android.gms.internal.location.zzbf(1, com.google.android.gms.internal.location.zzbd.zza(locationRequest), zza(listenerHolder).asBinder(), null, null, zzajVar != null ? zzajVar.asBinder() : null));
    }

    public final void zza(boolean z) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(z);
        this.zzcw = z;
    }

    public final void zzb() throws android.os.RemoteException {
        if (this.zzcw) {
            zza(false);
        }
    }

    public final void zzb(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<com.google.android.gms.location.LocationCallback> listenerKey, com.google.android.gms.internal.location.zzaj zzajVar) throws android.os.RemoteException {
        this.zzcb.checkConnected();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerKey, "Invalid null listener key");
        synchronized (this.zzcz) {
            com.google.android.gms.internal.location.zzat zzatVarRemove = this.zzcz.remove(listenerKey);
            if (zzatVarRemove != null) {
                zzatVarRemove.release();
                ((com.google.android.gms.internal.location.zzao) this.zzcb.getService()).zza(com.google.android.gms.internal.location.zzbf.zza(zzatVarRemove, zzajVar));
            }
        }
    }
}
