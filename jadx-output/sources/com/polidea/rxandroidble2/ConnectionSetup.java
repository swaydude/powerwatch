package com.polidea.rxandroidble2;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionSetup {
    public static final int DEFAULT_OPERATION_TIMEOUT = 30;
    public final boolean autoConnect;
    public final com.polidea.rxandroidble2.Timeout operationTimeout;
    public final boolean suppressOperationCheck;

    private ConnectionSetup(boolean z, boolean z2, com.polidea.rxandroidble2.Timeout timeout) {
        this.autoConnect = z;
        this.suppressOperationCheck = z2;
        this.operationTimeout = timeout;
    }

    public static class Builder {
        private boolean autoConnect = false;
        private boolean suppressOperationCheck = false;
        private com.polidea.rxandroidble2.Timeout operationTimeout = new com.polidea.rxandroidble2.Timeout(30, java.util.concurrent.TimeUnit.SECONDS);

        public com.polidea.rxandroidble2.ConnectionSetup.Builder setAutoConnect(boolean z) {
            this.autoConnect = z;
            return this;
        }

        public com.polidea.rxandroidble2.ConnectionSetup.Builder setSuppressIllegalOperationCheck(boolean z) {
            this.suppressOperationCheck = z;
            return this;
        }

        public com.polidea.rxandroidble2.ConnectionSetup.Builder setOperationTimeout(com.polidea.rxandroidble2.Timeout timeout) {
            this.operationTimeout = timeout;
            return this;
        }

        public com.polidea.rxandroidble2.ConnectionSetup build() {
            return new com.polidea.rxandroidble2.ConnectionSetup(this.autoConnect, this.suppressOperationCheck, this.operationTimeout);
        }
    }
}
