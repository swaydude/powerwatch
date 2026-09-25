package com.google.android.gms.common.api.internal;

/* JADX INFO: Add missing generic type declarations: [A, ResultT] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zacj<A, ResultT> extends com.google.android.gms.common.api.internal.TaskApiCall<A, ResultT> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.TaskApiCall.Builder zakq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zacj(com.google.android.gms.common.api.internal.TaskApiCall.Builder builder, com.google.android.gms.common.Feature[] featureArr, boolean z) {
        super(featureArr, z);
        this.zakq = builder;
    }

    /* JADX WARN: Incorrect types in method signature: (TA;Lcom/google/android/gms/tasks/TaskCompletionSource<TResultT;>;)V */
    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zakq.zakp.accept(anyClient, taskCompletionSource);
    }
}
