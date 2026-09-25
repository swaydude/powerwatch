package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class SimpleClientAdapter<T extends android.os.IInterface> extends com.google.android.gms.common.internal.GmsClient<T> {
    private final com.google.android.gms.common.api.Api.SimpleClient<T> zapu;

    public SimpleClientAdapter(android.content.Context context, android.os.Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, com.google.android.gms.common.internal.ClientSettings clientSettings, com.google.android.gms.common.api.Api.SimpleClient<T> simpleClient) {
        super(context, looper, i, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.zapu = simpleClient;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.lang.String getStartServiceAction() {
        return this.zapu.getStartServiceAction();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected java.lang.String getServiceDescriptor() {
        return this.zapu.getServiceDescriptor();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected T createServiceInterface(android.os.IBinder iBinder) {
        return (T) this.zapu.createServiceInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected void onSetConnectState(int i, T t) {
        this.zapu.setState(i, t);
    }

    public com.google.android.gms.common.api.Api.SimpleClient<T> getClient() {
        return this.zapu;
    }
}
