package okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public interface Dns {
    public static final okhttp3.Dns SYSTEM = new okhttp3.Dns() { // from class: okhttp3.Dns.1
        @Override // okhttp3.Dns
        public java.util.List<java.net.InetAddress> lookup(java.lang.String str) throws java.net.UnknownHostException {
            if (str == null) {
                throw new java.net.UnknownHostException("hostname == null");
            }
            try {
                return java.util.Arrays.asList(java.net.InetAddress.getAllByName(str));
            } catch (java.lang.NullPointerException e) {
                java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    };

    java.util.List<java.net.InetAddress> lookup(java.lang.String str) throws java.net.UnknownHostException;
}
