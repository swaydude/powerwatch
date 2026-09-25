package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> zajo;

    protected UnregisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> listenerKey) {
        this.zajo = listenerKey;
    }

    protected abstract void unregisterListener(A a, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> taskCompletionSource) throws android.os.RemoteException;

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zajo;
    }
}
