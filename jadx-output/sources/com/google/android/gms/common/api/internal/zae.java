package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zae<T> extends com.google.android.gms.common.api.internal.zab {
    protected final com.google.android.gms.tasks.TaskCompletionSource<T> zacq;

    public zae(int i, com.google.android.gms.tasks.TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.zacq = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public void zaa(com.google.android.gms.common.api.internal.zaz zazVar, boolean z) {
    }

    protected abstract void zad(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) throws android.os.RemoteException;

    @Override // com.google.android.gms.common.api.internal.zac
    public void zaa(com.google.android.gms.common.api.Status status) {
        this.zacq.trySetException(new com.google.android.gms.common.api.ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public void zaa(java.lang.RuntimeException runtimeException) {
        this.zacq.trySetException(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final void zac(com.google.android.gms.common.api.internal.GoogleApiManager.zaa<?> zaaVar) throws android.os.DeadObjectException {
        try {
            zad(zaaVar);
        } catch (android.os.DeadObjectException e) {
            zaa(com.google.android.gms.common.api.internal.zac.zaa(e));
            throw e;
        } catch (android.os.RemoteException e2) {
            zaa(com.google.android.gms.common.api.internal.zac.zaa(e2));
        } catch (java.lang.RuntimeException e3) {
            zaa(e3);
        }
    }
}
