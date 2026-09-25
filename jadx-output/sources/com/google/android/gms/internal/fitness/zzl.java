package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzl<T extends android.os.IInterface> extends com.google.android.gms.common.internal.GmsClient<T> {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public abstract T createServiceInterface(android.os.IBinder iBinder);

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public abstract java.lang.String getServiceDescriptor();

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public abstract java.lang.String getStartServiceAction();

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresAccount() {
        return true;
    }

    protected zzl(android.content.Context context, android.os.Looper looper, com.google.android.gms.internal.fitness.zzf.zza zzaVar, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, zzaVar.zzc(), clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public boolean requiresSignIn() {
        return !com.google.android.gms.common.util.DeviceProperties.isWearable(getContext());
    }

    @Override // com.google.android.gms.common.internal.GmsClient
    protected java.util.Set<com.google.android.gms.common.api.Scope> validateScopes(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        return com.google.android.gms.fitness.zzh.zza(set);
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.api.Api.Client
    public java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn() {
        return getScopes();
    }
}
