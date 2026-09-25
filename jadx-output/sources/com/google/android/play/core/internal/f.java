package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
final class f extends com.google.android.play.core.internal.e {
    private byte[] a;

    public f(java.security.cert.X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // com.google.android.play.core.internal.e, java.security.cert.Certificate
    public final byte[] getEncoded() throws java.security.cert.CertificateEncodingException {
        return this.a;
    }
}
