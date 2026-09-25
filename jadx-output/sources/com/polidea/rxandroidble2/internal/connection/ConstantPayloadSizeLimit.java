package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
class ConstantPayloadSizeLimit implements com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider {
    private final int limit;

    ConstantPayloadSizeLimit(int i) {
        this.limit = i;
    }

    @Override // com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider
    public int getPayloadSizeLimit() {
        return this.limit;
    }
}
