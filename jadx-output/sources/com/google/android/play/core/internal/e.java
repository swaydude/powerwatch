package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
class e extends java.security.cert.X509Certificate {
    private final java.security.cert.X509Certificate a;

    public e(java.security.cert.X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.a.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(java.util.Date date) throws java.security.cert.CertificateNotYetValidException, java.security.cert.CertificateExpiredException {
        this.a.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        return this.a.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getCriticalExtensionOIDs() {
        return this.a.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return this.a.getEncoded();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(java.lang.String str) {
        return this.a.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getIssuerDN() {
        return this.a.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return this.a.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.a.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public java.util.Set<java.lang.String> getNonCriticalExtensionOIDs() {
        return this.a.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotAfter() {
        return this.a.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public java.util.Date getNotBefore() {
        return this.a.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public java.security.PublicKey getPublicKey() {
        return this.a.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public java.math.BigInteger getSerialNumber() {
        return this.a.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgName() {
        return this.a.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public java.lang.String getSigAlgOID() {
        return this.a.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return this.a.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.a.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public java.security.Principal getSubjectDN() {
        return this.a.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return this.a.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws java.security.cert.CertificateEncodingException {
        return this.a.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.a.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return this.a.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey publicKey) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.a.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public void verify(java.security.PublicKey publicKey, java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException, java.security.cert.CertificateException, java.security.NoSuchProviderException {
        this.a.verify(publicKey, str);
    }
}
