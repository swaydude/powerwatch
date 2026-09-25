package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
class PinningTrustManager implements javax.net.ssl.X509TrustManager {
    private static final java.security.cert.X509Certificate[] NO_ISSUERS = new java.security.cert.X509Certificate[0];
    private static final long PIN_FRESHNESS_DURATION_MILLIS = 15552000000L;
    private final long pinCreationTimeMillis;
    private final io.fabric.sdk.android.services.network.SystemKeyStore systemKeyStore;
    private final javax.net.ssl.TrustManager[] systemTrustManagers;
    private final java.util.List<byte[]> pins = new java.util.LinkedList();
    private final java.util.Set<java.security.cert.X509Certificate> cache = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public PinningTrustManager(io.fabric.sdk.android.services.network.SystemKeyStore systemKeyStore, io.fabric.sdk.android.services.network.PinningInfoProvider pinningInfoProvider) {
        this.systemTrustManagers = initializeSystemTrustManagers(systemKeyStore);
        this.systemKeyStore = systemKeyStore;
        this.pinCreationTimeMillis = pinningInfoProvider.getPinCreationTimeInMillis();
        for (java.lang.String str : pinningInfoProvider.getPins()) {
            this.pins.add(hexStringToByteArray(str));
        }
    }

    private javax.net.ssl.TrustManager[] initializeSystemTrustManagers(io.fabric.sdk.android.services.network.SystemKeyStore systemKeyStore) {
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance("X509");
            trustManagerFactory.init(systemKeyStore.trustStore);
            return trustManagerFactory.getTrustManagers();
        } catch (java.security.KeyStoreException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    private boolean isValidPin(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateException {
        try {
            byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            java.util.Iterator<byte[]> it = this.pins.iterator();
            while (it.hasNext()) {
                if (java.util.Arrays.equals(it.next(), bArrDigest)) {
                    return true;
                }
            }
            return false;
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.security.cert.CertificateException(e);
        }
    }

    private void checkSystemTrust(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        for (javax.net.ssl.TrustManager trustManager : this.systemTrustManagers) {
            ((javax.net.ssl.X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
        }
    }

    private void checkPinTrust(java.security.cert.X509Certificate[] x509CertificateArr) throws java.security.cert.CertificateException {
        if (this.pinCreationTimeMillis != -1 && java.lang.System.currentTimeMillis() - this.pinCreationTimeMillis > PIN_FRESHNESS_DURATION_MILLIS) {
            io.fabric.sdk.android.Fabric.getLogger().w(io.fabric.sdk.android.Fabric.TAG, "Certificate pins are stale, (" + (java.lang.System.currentTimeMillis() - this.pinCreationTimeMillis) + " millis vs " + PIN_FRESHNESS_DURATION_MILLIS + " millis) falling back to system trust.");
            return;
        }
        for (java.security.cert.X509Certificate x509Certificate : io.fabric.sdk.android.services.network.CertificateChainCleaner.getCleanChain(x509CertificateArr, this.systemKeyStore)) {
            if (isValidPin(x509Certificate)) {
                return;
            }
        }
        throw new java.security.cert.CertificateException("No valid pins found in chain!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        throw new java.security.cert.CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        if (this.cache.contains(x509CertificateArr[0])) {
            return;
        }
        checkSystemTrust(x509CertificateArr, str);
        checkPinTrust(x509CertificateArr);
        this.cache.add(x509CertificateArr[0]);
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return NO_ISSUERS;
    }

    private byte[] hexStringToByteArray(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) + java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
