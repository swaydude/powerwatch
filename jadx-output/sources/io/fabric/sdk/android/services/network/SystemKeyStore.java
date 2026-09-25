package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
class SystemKeyStore {
    private final java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> trustRoots;
    final java.security.KeyStore trustStore;

    public SystemKeyStore(java.io.InputStream inputStream, java.lang.String str) {
        java.security.KeyStore trustStore = getTrustStore(inputStream, str);
        this.trustRoots = initializeTrustedRoots(trustStore);
        this.trustStore = trustStore;
    }

    public boolean isTrustRoot(java.security.cert.X509Certificate x509Certificate) {
        java.security.cert.X509Certificate x509Certificate2 = this.trustRoots.get(x509Certificate.getSubjectX500Principal());
        return x509Certificate2 != null && x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey());
    }

    public java.security.cert.X509Certificate getTrustRootFor(java.security.cert.X509Certificate x509Certificate) {
        java.security.cert.X509Certificate x509Certificate2 = this.trustRoots.get(x509Certificate.getIssuerX500Principal());
        if (x509Certificate2 == null || x509Certificate2.getSubjectX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
            return null;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return x509Certificate2;
        } catch (java.security.GeneralSecurityException unused) {
            return null;
        }
    }

    private java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> initializeTrustedRoots(java.security.KeyStore keyStore) {
        try {
            java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> map = new java.util.HashMap<>();
            java.util.Enumeration<java.lang.String> enumerationAliases = keyStore.aliases();
            while (enumerationAliases.hasMoreElements()) {
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) keyStore.getCertificate(enumerationAliases.nextElement());
                if (x509Certificate != null) {
                    map.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                }
            }
            return map;
        } catch (java.security.KeyStoreException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    private java.security.KeyStore getTrustStore(java.io.InputStream inputStream, java.lang.String str) {
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("BKS");
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            try {
                keyStore.load(bufferedInputStream, str.toCharArray());
                return keyStore;
            } finally {
                bufferedInputStream.close();
            }
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        } catch (java.security.KeyStoreException e2) {
            throw new java.lang.AssertionError(e2);
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new java.lang.AssertionError(e3);
        } catch (java.security.cert.CertificateException e4) {
            throw new java.lang.AssertionError(e4);
        }
    }
}
