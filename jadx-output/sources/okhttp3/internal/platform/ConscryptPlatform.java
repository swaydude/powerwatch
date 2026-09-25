package okhttp3.internal.platform;

/* JADX INFO: loaded from: classes2.dex */
public class ConscryptPlatform extends okhttp3.internal.platform.Platform {
    private ConscryptPlatform() {
    }

    private java.security.Provider getProvider() {
        return org.conscrypt.Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        if (!org.conscrypt.Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.trustManager(sSLSocketFactory);
        }
        try {
            java.lang.Object fieldOrNull = readFieldOrNull(sSLSocketFactory, java.lang.Object.class, "sslParameters");
            if (fieldOrNull != null) {
                return (javax.net.ssl.X509TrustManager) readFieldOrNull(fieldOrNull, javax.net.ssl.X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (java.lang.Exception e) {
            throw new java.lang.UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List<okhttp3.Protocol> list) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                org.conscrypt.Conscrypt.setUseSessionTickets(sSLSocket, true);
                org.conscrypt.Conscrypt.setHostname(sSLSocket, str);
            }
            org.conscrypt.Conscrypt.setApplicationProtocols(sSLSocket, (java.lang.String[]) okhttp3.internal.platform.Platform.alpnProtocolNames(list).toArray(new java.lang.String[0]));
            return;
        }
        super.configureTlsExtensions(sSLSocket, str, list);
    }

    @Override // okhttp3.internal.platform.Platform
    @javax.annotation.Nullable
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket sSLSocket) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocket)) {
            return org.conscrypt.Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.SSLContext getSSLContext() {
        try {
            return javax.net.ssl.SSLContext.getInstance("TLSv1.3", getProvider());
        } catch (java.security.NoSuchAlgorithmException e) {
            try {
                return javax.net.ssl.SSLContext.getInstance("TLS", getProvider());
            } catch (java.security.NoSuchAlgorithmException unused) {
                throw new java.lang.IllegalStateException("No TLS provider", e);
            }
        }
    }

    public static okhttp3.internal.platform.ConscryptPlatform buildIfSupported() {
        try {
            java.lang.Class.forName("org.conscrypt.Conscrypt");
            if (org.conscrypt.Conscrypt.isAvailable()) {
                return new okhttp3.internal.platform.ConscryptPlatform();
            }
            return null;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureSslSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        if (org.conscrypt.Conscrypt.isConscrypt(sSLSocketFactory)) {
            org.conscrypt.Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
