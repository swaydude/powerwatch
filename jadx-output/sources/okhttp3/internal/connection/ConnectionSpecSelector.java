package okhttp3.internal.connection;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionSpecSelector {
    private final java.util.List<okhttp3.ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex = 0;

    public ConnectionSpecSelector(java.util.List<okhttp3.ConnectionSpec> list) {
        this.connectionSpecs = list;
    }

    public okhttp3.ConnectionSpec configureSecureSocket(javax.net.ssl.SSLSocket sSLSocket) throws java.io.IOException {
        okhttp3.ConnectionSpec connectionSpec;
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.nextModeIndex = i + 1;
                break;
            }
            i++;
        }
        if (connectionSpec == null) {
            throw new java.net.UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + java.util.Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        this.isFallbackPossible = isFallbackPossible(sSLSocket);
        okhttp3.internal.Internal.instance.apply(connectionSpec, sSLSocket, this.isFallback);
        return connectionSpec;
    }

    public boolean connectionFailed(java.io.IOException iOException) {
        this.isFallback = true;
        if (!this.isFallbackPossible || (iOException instanceof java.net.ProtocolException) || (iOException instanceof java.io.InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof javax.net.ssl.SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof java.security.cert.CertificateException)) || (iOException instanceof javax.net.ssl.SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof javax.net.ssl.SSLProtocolException) || (iOException instanceof javax.net.ssl.SSLException);
    }

    private boolean isFallbackPossible(javax.net.ssl.SSLSocket sSLSocket) {
        for (int i = this.nextModeIndex; i < this.connectionSpecs.size(); i++) {
            if (this.connectionSpecs.get(i).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
