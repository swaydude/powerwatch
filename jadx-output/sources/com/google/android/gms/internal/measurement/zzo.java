package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
public final class zzo extends com.google.android.gms.internal.measurement.zza implements com.google.android.gms.internal.measurement.zzm {
    zzo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void initialize(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzv zzvVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzvVar);
        parcelA_.writeLong(j);
        zzb(1, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logEvent(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z, boolean z2, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z2);
        parcelA_.writeLong(j);
        zzb(2, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logEventAndBundle(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzn zznVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        parcelA_.writeLong(j);
        zzb(3, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setUserProperty(java.lang.String str, java.lang.String str2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        parcelA_.writeLong(j);
        zzb(4, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getUserProperties(java.lang.String str, java.lang.String str2, boolean z, com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(5, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getMaxUserProperties(java.lang.String str, com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(6, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setUserId(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeLong(j);
        zzb(7, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setConditionalUserProperty(android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        parcelA_.writeLong(j);
        zzb(8, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void clearConditionalUserProperty(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        zzb(9, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getConditionalUserProperties(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(10, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setMeasurementEnabled(boolean z, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        parcelA_.writeLong(j);
        zzb(11, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void resetAnalyticsData(long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeLong(j);
        zzb(12, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setMinimumSessionDuration(long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeLong(j);
        zzb(13, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setSessionTimeoutDuration(long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeLong(j);
        zzb(14, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setCurrentScreen(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, java.lang.String str2, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        parcelA_.writeLong(j);
        zzb(15, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCurrentScreenName(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(16, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(17, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zztVar);
        zzb(18, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(19, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getAppInstanceId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(20, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getGmpAppId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(21, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void generateEventId(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(22, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void beginAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeLong(j);
        zzb(23, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void endAdUnitExposure(java.lang.String str, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeLong(j);
        zzb(24, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityStarted(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        parcelA_.writeLong(j);
        zzb(25, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityStopped(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        parcelA_.writeLong(j);
        zzb(26, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityCreated(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, android.os.Bundle bundle, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        parcelA_.writeLong(j);
        zzb(27, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityDestroyed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        parcelA_.writeLong(j);
        zzb(28, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityPaused(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        parcelA_.writeLong(j);
        zzb(29, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivityResumed(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        parcelA_.writeLong(j);
        zzb(30, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void onActivitySaveInstanceState(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzn zznVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        parcelA_.writeLong(j);
        zzb(31, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void performAction(android.os.Bundle bundle, com.google.android.gms.internal.measurement.zzn zznVar, long j) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, bundle);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        parcelA_.writeLong(j);
        zzb(32, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void logHealthData(int i, java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeInt(i);
        parcelA_.writeString(str);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper2);
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, iObjectWrapper3);
        zzb(33, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setEventInterceptor(com.google.android.gms.internal.measurement.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzsVar);
        zzb(34, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzsVar);
        zzb(35, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zzsVar);
        zzb(36, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void initForTests(java.util.Map map) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        parcelA_.writeMap(map);
        zzb(37, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void getTestFlag(com.google.android.gms.internal.measurement.zzn zznVar, int i) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        parcelA_.writeInt(i);
        zzb(38, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void setDataCollectionEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, z);
        zzb(39, parcelA_);
    }

    @Override // com.google.android.gms.internal.measurement.zzm
    public final void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel parcelA_ = a_();
        com.google.android.gms.internal.measurement.zzb.zza(parcelA_, zznVar);
        zzb(40, parcelA_);
    }
}
