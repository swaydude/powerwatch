package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzld extends javax.net.ssl.SSLSocketFactory {
    private final javax.net.ssl.SSLSocketFactory zza;

    zzld() {
        this(javax.net.ssl.HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private zzld(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.zza = sSLSocketFactory;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i, boolean z) throws java.io.IOException {
        return zza((javax.net.ssl.SSLSocket) this.zza.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i) throws java.io.IOException {
        return zza((javax.net.ssl.SSLSocket) this.zza.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
        return zza((javax.net.ssl.SSLSocket) this.zza.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i, java.net.InetAddress inetAddress, int i2) throws java.io.IOException {
        return zza((javax.net.ssl.SSLSocket) this.zza.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i, java.net.InetAddress inetAddress2, int i2) throws java.io.IOException {
        return zza((javax.net.ssl.SSLSocket) this.zza.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket() throws java.io.IOException {
        return zza((javax.net.ssl.SSLSocket) this.zza.createSocket());
    }

    private final javax.net.ssl.SSLSocket zza(javax.net.ssl.SSLSocket sSLSocket) {
        return new com.google.android.gms.measurement.internal.zzlc(this, sSLSocket);
    }
}
