package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.3 */
/* JADX INFO: loaded from: classes.dex */
final class zzlc extends javax.net.ssl.SSLSocket {
    private final javax.net.ssl.SSLSocket zza;

    zzlc(com.google.android.gms.measurement.internal.zzld zzldVar, javax.net.ssl.SSLSocket sSLSocket) {
        this.zza = sSLSocket;
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledProtocols(java.lang.String[] strArr) {
        if (strArr != null && java.util.Arrays.asList(strArr).contains("SSLv3")) {
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(this.zza.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.zza.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getEnabledCipherSuites() {
        return this.zza.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnabledCipherSuites(java.lang.String[] strArr) {
        this.zza.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getSupportedProtocols() {
        return this.zza.getSupportedProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public final java.lang.String[] getEnabledProtocols() {
        return this.zza.getEnabledProtocols();
    }

    @Override // javax.net.ssl.SSLSocket
    public final javax.net.ssl.SSLSession getSession() {
        return this.zza.getSession();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void addHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
        this.zza.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void removeHandshakeCompletedListener(javax.net.ssl.HandshakeCompletedListener handshakeCompletedListener) {
        this.zza.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() throws java.io.IOException {
        this.zza.startHandshake();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setUseClientMode(boolean z) {
        this.zza.setUseClientMode(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getUseClientMode() {
        return this.zza.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setNeedClientAuth(boolean z) {
        this.zza.setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setWantClientAuth(boolean z) {
        this.zza.setWantClientAuth(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getNeedClientAuth() {
        return this.zza.getNeedClientAuth();
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getWantClientAuth() {
        return this.zza.getWantClientAuth();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void setEnableSessionCreation(boolean z) {
        this.zza.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLSocket
    public final boolean getEnableSessionCreation() {
        return this.zza.getEnableSessionCreation();
    }

    @Override // java.net.Socket
    public final void bind(java.net.SocketAddress socketAddress) throws java.io.IOException {
        this.zza.bind(socketAddress);
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws java.io.IOException {
        this.zza.close();
    }

    @Override // java.net.Socket
    public final void connect(java.net.SocketAddress socketAddress) throws java.io.IOException {
        this.zza.connect(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(java.net.SocketAddress socketAddress, int i) throws java.io.IOException {
        this.zza.connect(socketAddress, i);
    }

    @Override // java.net.Socket
    public final java.nio.channels.SocketChannel getChannel() {
        return this.zza.getChannel();
    }

    @Override // java.net.Socket
    public final java.net.InetAddress getInetAddress() {
        return this.zza.getInetAddress();
    }

    @Override // java.net.Socket
    public final java.io.InputStream getInputStream() throws java.io.IOException {
        return this.zza.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() throws java.net.SocketException {
        return this.zza.getKeepAlive();
    }

    @Override // java.net.Socket
    public final java.net.InetAddress getLocalAddress() {
        return this.zza.getLocalAddress();
    }

    @Override // java.net.Socket
    public final int getLocalPort() {
        return this.zza.getLocalPort();
    }

    @Override // java.net.Socket
    public final java.net.SocketAddress getLocalSocketAddress() {
        return this.zza.getLocalSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() throws java.net.SocketException {
        return this.zza.getOOBInline();
    }

    @Override // java.net.Socket
    public final java.io.OutputStream getOutputStream() throws java.io.IOException {
        return this.zza.getOutputStream();
    }

    @Override // java.net.Socket
    public final int getPort() {
        return this.zza.getPort();
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() throws java.net.SocketException {
        return this.zza.getReceiveBufferSize();
    }

    @Override // java.net.Socket
    public final java.net.SocketAddress getRemoteSocketAddress() {
        return this.zza.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() throws java.net.SocketException {
        return this.zza.getReuseAddress();
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() throws java.net.SocketException {
        return this.zza.getSendBufferSize();
    }

    @Override // java.net.Socket
    public final int getSoLinger() throws java.net.SocketException {
        return this.zza.getSoLinger();
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() throws java.net.SocketException {
        return this.zza.getSoTimeout();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() throws java.net.SocketException {
        return this.zza.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() throws java.net.SocketException {
        return this.zza.getTrafficClass();
    }

    @Override // java.net.Socket
    public final boolean isBound() {
        return this.zza.isBound();
    }

    @Override // java.net.Socket
    public final boolean isClosed() {
        return this.zza.isClosed();
    }

    @Override // java.net.Socket
    public final boolean isConnected() {
        return this.zza.isConnected();
    }

    @Override // java.net.Socket
    public final boolean isInputShutdown() {
        return this.zza.isInputShutdown();
    }

    @Override // java.net.Socket
    public final boolean isOutputShutdown() {
        return this.zza.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i) throws java.io.IOException {
        this.zza.sendUrgentData(i);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) throws java.net.SocketException {
        this.zza.setKeepAlive(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) throws java.net.SocketException {
        this.zza.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.zza.setPerformancePreferences(i, i2, i3);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i) throws java.net.SocketException {
        this.zza.setReceiveBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) throws java.net.SocketException {
        this.zza.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i) throws java.net.SocketException {
        this.zza.setSendBufferSize(i);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i) throws java.net.SocketException {
        this.zza.setSoLinger(z, i);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i) throws java.net.SocketException {
        this.zza.setSoTimeout(i);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) throws java.net.SocketException {
        this.zza.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i) throws java.net.SocketException {
        this.zza.setTrafficClass(i);
    }

    @Override // java.net.Socket
    public final void shutdownInput() throws java.io.IOException {
        this.zza.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() throws java.io.IOException {
        this.zza.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket, java.net.Socket
    public final java.lang.String toString() {
        return this.zza.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        return this.zza.equals(obj);
    }
}
