package com.google.android.gms.common.api.internal;

/* JADX INFO: Add missing generic type declarations: [A, L] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zabz<A, L> extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, L> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zakk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zabz(com.google.android.gms.common.api.internal.RegistrationMethods.Builder builder, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.zakk = builder;
    }

    /* JADX WARN: Incorrect types in method signature: (TA;Lcom/google/android/gms/tasks/TaskCompletionSource<Ljava/lang/Boolean;>;)V */
    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final void unregisterListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zakk.zakf.accept(anyClient, taskCompletionSource);
    }
}
