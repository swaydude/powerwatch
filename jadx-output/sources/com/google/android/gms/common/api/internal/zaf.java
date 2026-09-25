package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zaf<ResultT> extends com.google.android.gms.common.api.internal.zab {
    private final com.google.android.gms.tasks.TaskCompletionSource<ResultT> zacq;
    private final com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> zacr;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zacs;

    public zaf(int i, com.google.android.gms.common.api.internal.TaskApiCall<com.google.android.gms.common.api.Api.AnyClient, ResultT> taskApiCall, com.google.android.gms.tasks.TaskCompletionSource<ResultT> taskCompletionSource, com.google.android.gms.common.api.internal.StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.zacq = taskCompletionSource;
        this.zacr = taskApiCall;
        this.zacs = statusExceptionMapper;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zac(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) throws android.os.DeadObjectException {
        try {
            this.zacr.doExecute(zaaVar.zaad(), this.zacq);
        } catch (android.os.DeadObjectException e) {
            throw e;
        } catch (android.os.RemoteException e2) {
            zaa(com.google.android.gms.common.api.internal.zac.zaa(e2));
        } catch (java.lang.RuntimeException e3) {
            zaa(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zaa(com.google.android.gms.common.api.Status status) {
        this.zacq.trySetException(this.zacs.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zaa(java.lang.RuntimeException runtimeException) {
        this.zacq.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zaa(com.google.android.gms.common.api.internal.zaz zazVar, boolean z) {
        zazVar.zaa(this.zacq, z);
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final com.google.android.gms.common.Feature[] zaa(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) {
        return this.zacr.zabr();
    }

    @Override // com.google.android.gms.common.api.internal.zab
    public final boolean zab(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) {
        return this.zacr.shouldAutoResolveMissingFeatures();
    }
}
