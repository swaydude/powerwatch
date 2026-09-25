package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
final class CertificateChainCleaner {
    private CertificateChainCleaner() {
    }

    public static java.security.cert.X509Certificate[] getCleanChain(java.security.cert.X509Certificate[] x509CertificateArr, io.fabric.sdk.android.services.network.SystemKeyStore systemKeyStore) throws java.security.cert.CertificateException {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean zIsTrustRoot = systemKeyStore.isTrustRoot(x509CertificateArr[0]);
        linkedList.add(x509CertificateArr[0]);
        boolean z = true;
        int i = 1;
        while (i < x509CertificateArr.length) {
            if (systemKeyStore.isTrustRoot(x509CertificateArr[i])) {
                zIsTrustRoot = true;
            }
            if (!isValidLink(x509CertificateArr[i], x509CertificateArr[i - 1])) {
                break;
            }
            linkedList.add(x509CertificateArr[i]);
            i++;
        }
        java.security.cert.X509Certificate trustRootFor = systemKeyStore.getTrustRootFor(x509CertificateArr[i - 1]);
        if (trustRootFor != null) {
            linkedList.add(trustRootFor);
        } else {
            z = zIsTrustRoot;
        }
        if (z) {
            return (java.security.cert.X509Certificate[]) linkedList.toArray(new java.security.cert.X509Certificate[linkedList.size()]);
        }
        throw new java.security.cert.CertificateException("Didn't find a trust anchor in chain cleanup!");
    }

    private static boolean isValidLink(java.security.cert.X509Certificate x509Certificate, java.security.cert.X509Certificate x509Certificate2) {
        if (!x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal())) {
            return false;
        }
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }
}
