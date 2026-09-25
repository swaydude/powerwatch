package com.google.android.gms.fitness.service;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FitnessSensorService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private com.google.android.gms.fitness.service.FitnessSensorService.zza zzqx;

    public abstract java.util.List<com.google.android.gms.fitness.data.DataSource> onFindDataSources(java.util.List<com.google.android.gms.fitness.data.DataType> list);

    public abstract boolean onRegister(com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest);

    public abstract boolean onUnregister(com.google.android.gms.fitness.data.DataSource dataSource);

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzqx = new com.google.android.gms.fitness.service.FitnessSensorService.zza();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
    static class zza extends com.google.android.gms.internal.fitness.zzew {
        private final com.google.android.gms.fitness.service.FitnessSensorService zzra;

        private zza(com.google.android.gms.fitness.service.FitnessSensorService fitnessSensorService) {
            this.zzra = fitnessSensorService;
        }

        @Override // com.google.android.gms.internal.fitness.zzeu
        public final void zza(com.google.android.gms.internal.fitness.zzeq zzeqVar, com.google.android.gms.internal.fitness.zzbg zzbgVar) throws android.os.RemoteException {
            this.zzra.zzaf();
            zzbgVar.zza(new com.google.android.gms.fitness.result.DataSourcesResult(this.zzra.onFindDataSources(zzeqVar.getDataTypes()), com.google.android.gms.common.api.Status.RESULT_SUCCESS));
        }

        @Override // com.google.android.gms.internal.fitness.zzeu
        public final void zza(com.google.android.gms.fitness.service.FitnessSensorServiceRequest fitnessSensorServiceRequest, com.google.android.gms.internal.fitness.zzcm zzcmVar) throws android.os.RemoteException {
            this.zzra.zzaf();
            if (this.zzra.onRegister(fitnessSensorServiceRequest)) {
                zzcmVar.onResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            } else {
                zzcmVar.onResult(new com.google.android.gms.common.api.Status(13));
            }
        }

        @Override // com.google.android.gms.internal.fitness.zzeu
        public final void zza(com.google.android.gms.internal.fitness.zzes zzesVar, com.google.android.gms.internal.fitness.zzcm zzcmVar) throws android.os.RemoteException {
            this.zzra.zzaf();
            if (this.zzra.onUnregister(zzesVar.getDataSource())) {
                zzcmVar.onResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
            } else {
                zzcmVar.onResult(new com.google.android.gms.common.api.Status(13));
            }
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (!SERVICE_INTERFACE.equals(intent.getAction())) {
            return null;
        }
        if (android.util.Log.isLoggable("FitnessSensorService", 3)) {
            java.lang.String strValueOf = java.lang.String.valueOf(intent);
            java.lang.String name = getClass().getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 20 + java.lang.String.valueOf(name).length());
            sb.append("Intent ");
            sb.append(strValueOf);
            sb.append(" received by ");
            sb.append(name);
            android.util.Log.d("FitnessSensorService", sb.toString());
        }
        return this.zzqx.asBinder();
    }

    protected final void zzaf() throws java.lang.SecurityException {
        int callingUid = android.os.Binder.getCallingUid();
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKat()) {
            ((android.app.AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        java.lang.String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (str.equals("com.google.android.gms")) {
                    return;
                }
            }
        }
        throw new java.lang.SecurityException("Unauthorized caller");
    }
}
