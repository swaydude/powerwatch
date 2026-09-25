package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzz extends com.google.android.gms.internal.fitness.zzl<com.google.android.gms.internal.fitness.zzbv> {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzz> CLIENT_KEY;
    private static final com.google.android.gms.internal.fitness.zzf.zza zzmw = com.google.android.gms.internal.fitness.zzf.zza.FIT_GOALS;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> zzmx;

    private zzz(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, zzmw, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fitness.GoalsApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbv) {
            return (com.google.android.gms.internal.fitness.zzbv) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzbu(iBinder);
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzz> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.internal.fitness.zzy zzyVar = null;
        API = new com.google.android.gms.common.api.Api<>("Fitness.GOALS_API", new com.google.android.gms.internal.fitness.zzab(), clientKey);
        zzmx = new com.google.android.gms.common.api.Api<>("Fitness.GOALS_CLIENT", new com.google.android.gms.internal.fitness.zzad(), clientKey);
    }
}
