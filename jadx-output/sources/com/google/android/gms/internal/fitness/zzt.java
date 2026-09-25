package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends com.google.android.gms.internal.fitness.zzl<com.google.android.gms.internal.fitness.zzbt> {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzt> CLIENT_KEY;
    private static final com.google.android.gms.internal.fitness.zzf.zza zzmw = com.google.android.gms.internal.fitness.zzf.zza.FIT_CONFIG;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> zzmx;

    private zzt(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, zzmw, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fitness.ConfigApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbt) {
            return (com.google.android.gms.internal.fitness.zzbt) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzbs(iBinder);
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzt> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.internal.fitness.zzs zzsVar = null;
        API = new com.google.android.gms.common.api.Api<>("Fitness.CONFIG_API", new com.google.android.gms.internal.fitness.zzv(), clientKey);
        zzmx = new com.google.android.gms.common.api.Api<>("Fitness.CONFIG_CLIENT", new com.google.android.gms.internal.fitness.zzx(), clientKey);
    }
}
