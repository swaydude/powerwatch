package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder<L> zaju;
    private final com.google.android.gms.common.Feature[] zajv;
    private final boolean zajw;

    protected RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder) {
        this.zaju = listenerHolder;
        this.zajv = null;
        this.zajw = false;
    }

    protected abstract void registerListener(A a, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource) throws android.os.RemoteException;

    protected RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> listenerHolder, com.google.android.gms.common.Feature[] featureArr, boolean z) {
        this.zaju = listenerHolder;
        this.zajv = featureArr;
        this.zajw = z;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
        return this.zaju.getListenerKey();
    }

    public void clearListener() {
        this.zaju.clear();
    }

    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
        return this.zajv;
    }

    public final boolean shouldAutoResolveMissingFeatures() {
        return this.zajw;
    }
}
