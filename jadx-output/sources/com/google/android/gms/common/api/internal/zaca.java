package com.google.android.gms.common.api.internal;

/* JADX INFO: Add missing generic type declarations: [A, L] */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zaca<A, L> extends com.google.android.gms.common.api.internal.RegisterListenerMethod<A, L> {
    private final /* synthetic */ com.google.android.gms.common.api.internal.RegistrationMethods.Builder zakk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zaca(com.google.android.gms.common.api.internal.RegistrationMethods.Builder builder, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z) {
        super(listenerHolder, featureArr, z);
        this.zakk = builder;
    }

    /* JADX WARN: Incorrect types in method signature: (TA;Lcom/google/android/gms/tasks/TaskCompletionSource<Ljava/lang/Void;>;)V */
    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final void registerListener(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zakk.zake.accept(anyClient, taskCompletionSource);
    }
}
