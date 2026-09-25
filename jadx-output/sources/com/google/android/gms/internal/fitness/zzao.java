package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzao extends com.google.android.gms.internal.fitness.zzl<com.google.android.gms.internal.fitness.zzcb> {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzao> CLIENT_KEY;
    private static final com.google.android.gms.internal.fitness.zzf.zza zzmw = com.google.android.gms.internal.fitness.zzf.zza.FIT_SENSORS;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> zzmx;

    private zzao(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, zzmw, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fitness.SensorsApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzcb) {
            return (com.google.android.gms.internal.fitness.zzcb) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzca(iBinder);
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzao> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.internal.fitness.zzar zzarVar = null;
        API = new com.google.android.gms.common.api.Api<>("Fitness.SENSORS_API", new com.google.android.gms.internal.fitness.zzaq(), clientKey);
        zzmx = new com.google.android.gms.common.api.Api<>("Fitness.SENSORS_CLIENT", new com.google.android.gms.internal.fitness.zzas(), clientKey);
    }
}
