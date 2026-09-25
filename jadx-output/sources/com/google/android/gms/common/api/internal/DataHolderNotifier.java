package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder mDataHolder;

    protected DataHolderNotifier(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.mDataHolder = dataHolder;
    }

    protected abstract void notifyListener(L l, com.google.android.gms.common.data.DataHolder dataHolder);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(L l) {
        notifyListener(l, this.mDataHolder);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void onNotifyListenerFailed() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
