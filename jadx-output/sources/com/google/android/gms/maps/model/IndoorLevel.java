package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzq zzdg;

    public IndoorLevel(com.google.android.gms.internal.maps.zzq zzqVar) {
        this.zzdg = (com.google.android.gms.internal.maps.zzq) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzqVar);
    }

    public final java.lang.String getName() {
        try {
            return this.zzdg.getName();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getShortName() {
        try {
            return this.zzdg.getShortName();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void activate() {
        try {
            this.zzdg.activate();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.IndoorLevel)) {
            return false;
        }
        try {
            return this.zzdg.zzb(((com.google.android.gms.maps.model.IndoorLevel) obj).zzdg);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzdg.zzj();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
