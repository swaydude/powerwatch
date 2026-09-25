package com.google.android.gms.internal.location;

/* JADX INFO: loaded from: classes.dex */
public class zzk extends com.google.android.gms.common.internal.GmsClient<com.google.android.gms.internal.location.zzao> {
    private final java.lang.String zzca;
    protected final com.google.android.gms.internal.location.zzbj<com.google.android.gms.internal.location.zzao> zzcb;

    public zzk(android.content.Context context, android.os.Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, java.lang.String str, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        super(context, looper, 23, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zzcb = new com.google.android.gms.internal.location.zzl(this);
        this.zzca = str;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected /* synthetic */ android.os.IInterface createServiceInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.location.zzao ? (com.google.android.gms.internal.location.zzao) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.location.zzap(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected android.os.Bundle getGetServiceRequestExtraArgs() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("client_name", this.zzca);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.GmsClient, com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return 11925000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.lang.String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.lang.String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
