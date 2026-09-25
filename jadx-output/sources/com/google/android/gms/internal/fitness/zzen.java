package com.google.android.gms.internal.fitness;

/* JADX INFO: compiled from: com.google.android.gms:play-services-fitness@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzen implements com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status> {
    private final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zzod;

    zzen(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zzod = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException("This method should never get invoked");
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* synthetic */ void setResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.api.Status status2 = status;
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status2, java.lang.Boolean.valueOf(status2.isSuccess()), this.zzod);
    }
}
