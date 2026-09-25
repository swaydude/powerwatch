package com.polidea.rxandroidble2.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
@com.polidea.rxandroidble2.internal.connection.ConnectionScope
class MtuBasedPayloadSizeLimit implements com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider {
    private final int gattWriteMtuOverhead;
    private final com.polidea.rxandroidble2.RxBleConnection rxBleConnection;

    @bleshadow.javax.inject.Inject
    MtuBasedPayloadSizeLimit(com.polidea.rxandroidble2.RxBleConnection rxBleConnection, @bleshadow.javax.inject.Named("GATT_WRITE_MTU_OVERHEAD") int i) {
        this.rxBleConnection = rxBleConnection;
        this.gattWriteMtuOverhead = i;
    }

    @Override // com.polidea.rxandroidble2.internal.connection.PayloadSizeLimitProvider
    public int getPayloadSizeLimit() {
        return this.rxBleConnection.getMtu() - this.gattWriteMtuOverhead;
    }
}
