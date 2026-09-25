package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes.dex */
public final class IndoorBuilding {
    private final com.google.android.gms.internal.maps.zzn zzdd;
    private final com.google.android.gms.maps.model.IndoorBuilding.zza zzde;

    static class zza {
        public static final com.google.android.gms.maps.model.IndoorBuilding.zza zzdf = new com.google.android.gms.maps.model.IndoorBuilding.zza();

        private zza() {
        }

        public static com.google.android.gms.maps.model.IndoorLevel zza(com.google.android.gms.internal.maps.zzq zzqVar) {
            return new com.google.android.gms.maps.model.IndoorLevel(zzqVar);
        }

        public static com.google.android.gms.internal.maps.zzq zza(android.os.IBinder iBinder) {
            return com.google.android.gms.internal.maps.zzr.zzf(iBinder);
        }
    }

    public IndoorBuilding(com.google.android.gms.internal.maps.zzn zznVar) {
        this(zznVar, com.google.android.gms.maps.model.IndoorBuilding.zza.zzdf);
    }

    private IndoorBuilding(com.google.android.gms.internal.maps.zzn zznVar, com.google.android.gms.maps.model.IndoorBuilding.zza zzaVar) {
        this.zzdd = (com.google.android.gms.internal.maps.zzn) com.google.android.gms.common.internal.Preconditions.checkNotNull(zznVar, "delegate");
        this.zzde = (com.google.android.gms.maps.model.IndoorBuilding.zza) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaVar, "shim");
    }

    public final int getDefaultLevelIndex() {
        try {
            return this.zzdd.getDefaultLevelIndex();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getActiveLevelIndex() {
        try {
            return this.zzdd.getActiveLevelIndex();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.util.List<com.google.android.gms.maps.model.IndoorLevel> getLevels() {
        try {
            java.util.List<android.os.IBinder> levels = this.zzdd.getLevels();
            java.util.ArrayList arrayList = new java.util.ArrayList(levels.size());
            java.util.Iterator<android.os.IBinder> it = levels.iterator();
            while (it.hasNext()) {
                arrayList.add(com.google.android.gms.maps.model.IndoorBuilding.zza.zza(com.google.android.gms.maps.model.IndoorBuilding.zza.zza(it.next())));
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isUnderground() {
        try {
            return this.zzdd.isUnderground();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.maps.model.IndoorBuilding)) {
            return false;
        }
        try {
            return this.zzdd.zzb(((com.google.android.gms.maps.model.IndoorBuilding) obj).zzdd);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.zzdd.zzj();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
