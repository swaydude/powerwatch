package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzl {
    com.google.android.gms.measurement.internal.zzgo zza = null;
    private java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzhn> zzb = new androidx.collection.ArrayMap();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.3 */
    class zza implements com.google.android.gms.measurement.internal.zzho {
        private com.google.android.gms.internal.measurement.zzs zza;

        zza(com.google.android.gms.internal.measurement.zzs zzsVar) {
            this.zza = zzsVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzho
        public final void interceptEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.this.zza.zzr().zzi().zza("Event interceptor threw exception", e);
            }
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@17.2.3 */
    class zzb implements com.google.android.gms.measurement.internal.zzhn {
        private com.google.android.gms.internal.measurement.zzs zza;

        zzb(com.google.android.gms.internal.measurement.zzs zzsVar) {
            this.zza = zzsVar;
        }

        @Override // com.google.android.gms.measurement.internal.zzhn
        public final void onEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
            try {
                this.zza.zza(str, str2, bundle, j);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.this.zza.zzr().zzi().zza("Event listener threw exception", e);
            }
        }
    }

    private final void zza() {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzv zzvVar, long j) throws android.os.RemoteException {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.measurement.internal.zzgo zzgoVar = this.zza;
        if (zzgoVar == null) {
            this.zza = com.google.android.gms.measurement.internal.zzgo.zza(context, zzvVar);
        } else {
            zzgoVar.zzr().zzi().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zza(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zza(str, str2, com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setUserId(java.lang.String str, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zza(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzv().zza((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zza(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void resetAnalyticsData(long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zzd(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setMinimumSessionDuration(long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zza(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setSessionTimeoutDuration(long j) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zzb(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        this.zza.zzh();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza.zzi().zza(zznVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        zza(zznVar, this.zza.zzh().zzaj());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        zza(zznVar, this.zza.zzh().zzak());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        zza(zznVar, this.zza.zzh().zzah());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzi(this, zznVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        zza(zznVar, this.zza.zzh().zzal());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void generateEventId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        this.zza.zzi().zza(zznVar, this.zza.zzi().zzg());
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzz().zza(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        zza();
        this.zza.zzz().zzb(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void initForTests(java.util.Map map) throws android.os.RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzn zznVar, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2);
        (bundle != null ? new android.os.Bundle(bundle) : new android.os.Bundle()).putString("_o", io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY);
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzh(this, zznVar, new com.google.android.gms.measurement.internal.zzan(str2, new com.google.android.gms.measurement.internal.zzam(bundle), io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY, j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivityStarted((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivityStopped((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivityCreated((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivityDestroyed((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivityPaused((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivityResumed((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzn zznVar, long j) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzim zzimVar = this.zza.zzh().zza;
        android.os.Bundle bundle = new android.os.Bundle();
        if (zzimVar != null) {
            this.zza.zzh().zzab();
            zzimVar.onActivitySaveInstanceState((android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            this.zza.zzr().zzi().zza("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzn zznVar, long j) throws android.os.RemoteException {
        zza();
        zznVar.zza(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzk(this, zznVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        zza();
        this.zza.zzr().zza(i, true, false, str, iObjectWrapper == null ? null : com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzs zzsVar) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzhp zzhpVarZzh = this.zza.zzh();
        com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.zza zzaVar = new com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.zza(zzsVar);
        zzhpVarZzh.zzb();
        zzhpVarZzh.zzw();
        zzhpVarZzh.zzq().zza(new com.google.android.gms.measurement.internal.zzhx(zzhpVarZzh, zzaVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzs zzsVar) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzhn zzbVar = this.zzb.get(java.lang.Integer.valueOf(zzsVar.zza()));
        if (zzbVar == null) {
            zzbVar = new com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.zzb(zzsVar);
            this.zzb.put(java.lang.Integer.valueOf(zzsVar.zza()), zzbVar);
        }
        this.zza.zzh().zza(zzbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzs zzsVar) throws android.os.RemoteException {
        zza();
        com.google.android.gms.measurement.internal.zzhn zzhnVarRemove = this.zzb.remove(java.lang.Integer.valueOf(zzsVar.zza()));
        if (zzhnVarRemove == null) {
            zzhnVarRemove = new com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.zzb(zzsVar);
        }
        this.zza.zzh().zzb(zzhnVarRemove);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzt zztVar) throws android.os.RemoteException {
        zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        zza();
        if (bundle == null) {
            this.zza.zzr().zzf().zza("Conditional user property must not be null");
        } else {
            this.zza.zzh().zza(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zzc(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzj(this, zznVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void getTestFlag(com.google.android.gms.internal.measurement.zzn zznVar, int i) throws android.os.RemoteException {
        zza();
        if (i == 0) {
            this.zza.zzi().zza(zznVar, this.zza.zzh().zzad());
            return;
        }
        if (i == 1) {
            this.zza.zzi().zza(zznVar, this.zza.zzh().zzae().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.zza.zzi().zza(zznVar, this.zza.zzh().zzaf().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.zza.zzi().zza(zznVar, this.zza.zzh().zzac().booleanValue());
                return;
            }
        }
        com.google.android.gms.measurement.internal.zzla zzlaVarZzi = this.zza.zzi();
        double dDoubleValue = this.zza.zzh().zzag().doubleValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zznVar.zza(bundle);
        } catch (android.os.RemoteException e) {
            zzlaVarZzi.zzx.zzr().zzi().zza("Error returning double value to wrapper", e);
        }
    }

    private final void zza(com.google.android.gms.internal.measurement.zzn zznVar, java.lang.String str) {
        this.zza.zzi().zza(zznVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void setDataCollectionEnabled(boolean z) throws android.os.RemoteException {
        zza();
        this.zza.zzh().zzb(z);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        zza();
        this.zza.zzq().zza(new com.google.android.gms.measurement.internal.zzl(this, zznVar));
    }
}
