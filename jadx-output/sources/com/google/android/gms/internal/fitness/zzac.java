package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzac extends com.google.android.gms.internal.fitness.zzl<com.google.android.gms.internal.fitness.zzbx> {
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API;
    private static final com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzac> CLIENT_KEY;
    private static final com.google.android.gms.internal.fitness.zzf.zza zzmw = com.google.android.gms.internal.fitness.zzf.zza.FIT_HISTORY;
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> zzmx;

    private zzac(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, zzmw, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final java.lang.String getStartServiceAction() {
        return "com.google.android.gms.fitness.HistoryApi";
    }

    @Override // com.google.android.gms.internal.fitness.zzl, com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.fitness.zzbx) {
            return (com.google.android.gms.internal.fitness.zzbx) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.fitness.zzbw(iBinder);
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey<com.google.android.gms.internal.fitness.zzac> clientKey = new com.google.android.gms.common.api.Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        com.google.android.gms.internal.fitness.zzaf zzafVar = null;
        API = new com.google.android.gms.common.api.Api<>("Fitness.API", new com.google.android.gms.internal.fitness.zzae(), clientKey);
        zzmx = new com.google.android.gms.common.api.Api<>("Fitness.CLIENT", new com.google.android.gms.internal.fitness.zzag(), clientKey);
    }
}
