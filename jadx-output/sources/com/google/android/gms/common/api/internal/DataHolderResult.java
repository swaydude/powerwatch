package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class DataHolderResult implements com.google.android.gms.common.api.Releasable, com.google.android.gms.common.api.Result {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected final com.google.android.gms.common.api.Status mStatus;

    protected DataHolderResult(com.google.android.gms.common.data.DataHolder dataHolder) {
        this(dataHolder, new com.google.android.gms.common.api.Status(dataHolder.getStatusCode()));
    }

    protected DataHolderResult(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.common.api.Status status) {
        this.mStatus = status;
        this.mDataHolder = dataHolder;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
        com.google.android.gms.common.data.DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
