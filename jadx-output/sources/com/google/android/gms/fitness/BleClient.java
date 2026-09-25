package com.google.android.gms.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BleClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions> {
    private static final com.google.android.gms.fitness.BleApi zzhp;

    protected BleClient(android.content.Context context, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(context, com.google.android.gms.internal.fitness.zzn.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    BleClient(android.app.Activity activity, com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions hasGoogleSignInAccountOptions) {
        super(activity, com.google.android.gms.internal.fitness.zzn.zzmx, hasGoogleSignInAccountOptions, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> startBleScan(java.util.List<com.google.android.gms.fitness.data.DataType> list, int i, com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(com.google.android.gms.internal.fitness.zzem.zzoe));
        }
        com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolderRegisterListener = registerListener(bleScanCallback, com.google.android.gms.fitness.request.BleScanCallback.class.getSimpleName());
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(listenerHolderRegisterListener).register(new com.google.android.gms.fitness.zzb(this, listenerHolderRegisterListener, list, i)).unregister(new com.google.android.gms.fitness.zzc(this, listenerHolderRegisterListener)).build());
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> stopBleScan(com.google.android.gms.fitness.request.BleScanCallback bleScanCallback) {
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.gms.common.api.ApiException(com.google.android.gms.internal.fitness.zzem.zzoe));
        }
        return doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(bleScanCallback, com.google.android.gms.fitness.request.BleScanCallback.class.getSimpleName()));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> claimBleDevice(com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhp.claimBleDevice(asGoogleApiClient(), bleDevice));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> claimBleDevice(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhp.claimBleDevice(asGoogleApiClient(), str));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unclaimBleDevice(java.lang.String str) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhp.unclaimBleDevice(asGoogleApiClient(), str));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unclaimBleDevice(com.google.android.gms.fitness.data.BleDevice bleDevice) {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(zzhp.unclaimBleDevice(asGoogleApiClient(), bleDevice));
    }

    public com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.fitness.data.BleDevice>> listClaimedBleDevices() {
        return com.google.android.gms.common.internal.PendingResultUtil.toTask(zzhp.listClaimedBleDevices(asGoogleApiClient()), com.google.android.gms.fitness.zza.zzho);
    }

    static {
        com.google.android.gms.fitness.BleApi zzemVar;
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()) {
            zzemVar = new com.google.android.gms.internal.fitness.zzcr();
        } else {
            zzemVar = new com.google.android.gms.internal.fitness.zzem();
        }
        zzhp = zzemVar;
    }
}
