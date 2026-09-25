package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkUtils {
    private NetworkUtils() {
    }

    public static final javax.net.ssl.SSLSocketFactory getSSLSocketFactory(io.fabric.sdk.android.services.network.PinningInfoProvider pinningInfoProvider) throws java.security.NoSuchAlgorithmException, java.security.KeyManagementException {
        javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
        sSLContext.init(null, new javax.net.ssl.TrustManager[]{new io.fabric.sdk.android.services.network.PinningTrustManager(new io.fabric.sdk.android.services.network.SystemKeyStore(pinningInfoProvider.getKeyStoreStream(), pinningInfoProvider.getKeyStorePassword()), pinningInfoProvider)}, null);
        return sSLContext.getSocketFactory();
    }
}
