package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRequest {
    private static final java.lang.String BOUNDARY = "00content0boundary00";
    public static final java.lang.String CHARSET_UTF8 = "UTF-8";
    public static final java.lang.String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    public static final java.lang.String CONTENT_TYPE_JSON = "application/json";
    private static final java.lang.String CONTENT_TYPE_MULTIPART = "multipart/form-data; boundary=00content0boundary00";
    private static final java.lang.String CRLF = "\r\n";
    public static final java.lang.String ENCODING_GZIP = "gzip";
    public static final java.lang.String HEADER_ACCEPT = "Accept";
    public static final java.lang.String HEADER_ACCEPT_CHARSET = "Accept-Charset";
    public static final java.lang.String HEADER_ACCEPT_ENCODING = "Accept-Encoding";
    public static final java.lang.String HEADER_AUTHORIZATION = "Authorization";
    public static final java.lang.String HEADER_CACHE_CONTROL = "Cache-Control";
    public static final java.lang.String HEADER_CONTENT_ENCODING = "Content-Encoding";
    public static final java.lang.String HEADER_CONTENT_LENGTH = "Content-Length";
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    public static final java.lang.String HEADER_DATE = "Date";
    public static final java.lang.String HEADER_ETAG = "ETag";
    public static final java.lang.String HEADER_EXPIRES = "Expires";
    public static final java.lang.String HEADER_IF_NONE_MATCH = "If-None-Match";
    public static final java.lang.String HEADER_LAST_MODIFIED = "Last-Modified";
    public static final java.lang.String HEADER_LOCATION = "Location";
    public static final java.lang.String HEADER_PROXY_AUTHORIZATION = "Proxy-Authorization";
    public static final java.lang.String HEADER_REFERER = "Referer";
    public static final java.lang.String HEADER_SERVER = "Server";
    public static final java.lang.String HEADER_USER_AGENT = "User-Agent";
    public static final java.lang.String METHOD_DELETE = "DELETE";
    public static final java.lang.String METHOD_GET = "GET";
    public static final java.lang.String METHOD_HEAD = "HEAD";
    public static final java.lang.String METHOD_OPTIONS = "OPTIONS";
    public static final java.lang.String METHOD_POST = "POST";
    public static final java.lang.String METHOD_PUT = "PUT";
    public static final java.lang.String METHOD_TRACE = "TRACE";
    public static final java.lang.String PARAM_CHARSET = "charset";
    private boolean form;
    private java.lang.String httpProxyHost;
    private int httpProxyPort;
    private boolean multipart;
    private io.fabric.sdk.android.services.network.HttpRequest.RequestOutputStream output;
    private final java.lang.String requestMethod;
    public final java.net.URL url;
    private static final java.lang.String[] EMPTY_STRINGS = new java.lang.String[0];
    private static io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory CONNECTION_FACTORY = io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory.DEFAULT;
    private java.net.HttpURLConnection connection = null;
    private boolean ignoreCloseExceptions = true;
    private boolean uncompress = false;
    private int bufferSize = 8192;

    public interface ConnectionFactory {
        public static final io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory DEFAULT = new io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory() { // from class: io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory.1
            @Override // io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory
            public java.net.HttpURLConnection create(java.net.URL url) throws java.io.IOException {
                return (java.net.HttpURLConnection) url.openConnection();
            }

            @Override // io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory
            public java.net.HttpURLConnection create(java.net.URL url, java.net.Proxy proxy) throws java.io.IOException {
                return (java.net.HttpURLConnection) url.openConnection(proxy);
            }
        };

        java.net.HttpURLConnection create(java.net.URL url) throws java.io.IOException;

        java.net.HttpURLConnection create(java.net.URL url, java.net.Proxy proxy) throws java.io.IOException;
    }

    public io.fabric.sdk.android.services.network.HttpRequest trustAllCerts() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest trustAllHosts() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String getValidCharset(java.lang.String str) {
        return (str == null || str.length() <= 0) ? CHARSET_UTF8 : str;
    }

    private static java.lang.StringBuilder addPathSeparator(java.lang.String str, java.lang.StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    private static java.lang.StringBuilder addParamPrefix(java.lang.String str, java.lang.StringBuilder sb) {
        int iIndexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (iIndexOf == -1) {
            sb.append('?');
        } else if (iIndexOf < length && str.charAt(length) != '&') {
            sb.append(kotlin.text.Typography.amp);
        }
        return sb;
    }

    public static void setConnectionFactory(io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            CONNECTION_FACTORY = io.fabric.sdk.android.services.network.HttpRequest.ConnectionFactory.DEFAULT;
        } else {
            CONNECTION_FACTORY = connectionFactory;
        }
    }

    public static class Base64 {
        private static final byte EQUALS_SIGN = 61;
        private static final java.lang.String PREFERRED_ENCODING = "US-ASCII";
        private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        private Base64() {
        }

        private static byte[] encode3to4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            byte[] bArr3 = _STANDARD_ALPHABET;
            int i4 = (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
            if (i2 == 1) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = EQUALS_SIGN;
                bArr2[i3 + 3] = EQUALS_SIGN;
                return bArr2;
            }
            if (i2 == 2) {
                bArr2[i3] = bArr3[i4 >>> 18];
                bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
                bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
                bArr2[i3 + 3] = EQUALS_SIGN;
                return bArr2;
            }
            if (i2 != 3) {
                return bArr2;
            }
            bArr2[i3] = bArr3[i4 >>> 18];
            bArr2[i3 + 1] = bArr3[(i4 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i4 >>> 6) & 63];
            bArr2[i3 + 3] = bArr3[i4 & 63];
            return bArr2;
        }

        public static java.lang.String encode(java.lang.String str) {
            byte[] bytes;
            try {
                bytes = str.getBytes(PREFERRED_ENCODING);
            } catch (java.io.UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            return encodeBytes(bytes);
        }

        public static java.lang.String encodeBytes(byte[] bArr) {
            return encodeBytes(bArr, 0, bArr.length);
        }

        public static java.lang.String encodeBytes(byte[] bArr, int i, int i2) {
            byte[] bArrEncodeBytesToBytes = encodeBytesToBytes(bArr, i, i2);
            try {
                return new java.lang.String(bArrEncodeBytesToBytes, PREFERRED_ENCODING);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new java.lang.String(bArrEncodeBytesToBytes);
            }
        }

        public static byte[] encodeBytesToBytes(byte[] bArr, int i, int i2) {
            java.util.Objects.requireNonNull(bArr, "Cannot serialize a null array.");
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Cannot have negative offset: " + i);
            }
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException("Cannot have length offset: " + i2);
            }
            if (i + i2 > bArr.length) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ENGLISH, "Cannot have offset of %d and length of %d with array of length %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(bArr.length)));
            }
            int i3 = ((i2 / 3) * 4) + (i2 % 3 <= 0 ? 0 : 4);
            byte[] bArr2 = new byte[i3];
            int i4 = i2 - 2;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                encode3to4(bArr, i5 + i, 3, bArr2, i6);
                i5 += 3;
                i6 += 4;
            }
            if (i5 < i2) {
                encode3to4(bArr, i + i5, i2 - i5, bArr2, i6);
                i6 += 4;
            }
            if (i6 > i3 - 1) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i6];
            java.lang.System.arraycopy(bArr2, 0, bArr3, 0, i6);
            return bArr3;
        }
    }

    public static class HttpRequestException extends java.lang.RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        protected HttpRequestException(java.io.IOException iOException) {
            super(iOException);
        }

        @Override // java.lang.Throwable
        public java.io.IOException getCause() {
            return (java.io.IOException) super.getCause();
        }
    }

    protected static abstract class Operation<V> implements java.util.concurrent.Callable<V> {
        protected abstract void done() throws java.io.IOException;

        protected abstract V run() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException, java.io.IOException;

        protected Operation() {
        }

        @Override // java.util.concurrent.Callable
        public V call() throws java.lang.Throwable {
            boolean z;
            try {
                try {
                    V vRun = run();
                    try {
                        done();
                        return vRun;
                    } catch (java.io.IOException e) {
                        throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    z = true;
                    try {
                        done();
                        throw th;
                    } catch (java.io.IOException e2) {
                        if (!z) {
                            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e2);
                        }
                        throw th;
                    }
                }
            } catch (io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException e3) {
                throw e3;
            } catch (java.io.IOException e4) {
                throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e4);
            } catch (java.lang.Throwable th2) {
                th = th2;
                z = false;
                done();
                throw th;
            }
        }
    }

    protected static abstract class CloseOperation<V> extends io.fabric.sdk.android.services.network.HttpRequest.Operation<V> {
        private final java.io.Closeable closeable;
        private final boolean ignoreCloseExceptions;

        protected CloseOperation(java.io.Closeable closeable, boolean z) {
            this.closeable = closeable;
            this.ignoreCloseExceptions = z;
        }

        @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
        protected void done() throws java.io.IOException {
            java.io.Closeable closeable = this.closeable;
            if (closeable instanceof java.io.Flushable) {
                ((java.io.Flushable) closeable).flush();
            }
            if (this.ignoreCloseExceptions) {
                try {
                    this.closeable.close();
                } catch (java.io.IOException unused) {
                }
            } else {
                this.closeable.close();
            }
        }
    }

    protected static abstract class FlushOperation<V> extends io.fabric.sdk.android.services.network.HttpRequest.Operation<V> {
        private final java.io.Flushable flushable;

        protected FlushOperation(java.io.Flushable flushable) {
            this.flushable = flushable;
        }

        @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
        protected void done() throws java.io.IOException {
            this.flushable.flush();
        }
    }

    public static class RequestOutputStream extends java.io.BufferedOutputStream {
        private final java.nio.charset.CharsetEncoder encoder;

        public RequestOutputStream(java.io.OutputStream outputStream, java.lang.String str, int i) {
            super(outputStream, i);
            this.encoder = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.getValidCharset(str)).newEncoder();
        }

        public io.fabric.sdk.android.services.network.HttpRequest.RequestOutputStream write(java.lang.String str) throws java.io.IOException {
            java.nio.ByteBuffer byteBufferEncode = this.encoder.encode(java.nio.CharBuffer.wrap(str));
            super.write(byteBufferEncode.array(), 0, byteBufferEncode.limit());
            return this;
        }
    }

    public static java.lang.String encode(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        int i;
        try {
            java.net.URL url = new java.net.URL(charSequence.toString());
            java.lang.String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                host = host + ':' + java.lang.Integer.toString(port);
            }
            try {
                java.lang.String aSCIIString = new java.net.URI(url.getProtocol(), host, url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
                int iIndexOf = aSCIIString.indexOf(63);
                if (iIndexOf <= 0 || (i = iIndexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i) + aSCIIString.substring(i).replace("+", "%2B").replace("#", "%23");
            } catch (java.net.URISyntaxException e) {
                java.io.IOException iOException = new java.io.IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(iOException);
            }
        } catch (java.io.IOException e2) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e2);
        }
    }

    public static java.lang.String append(java.lang.CharSequence charSequence, java.util.Map<?, ?> map) {
        java.lang.String string = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return string;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(string);
        addPathSeparator(string, sb);
        addParamPrefix(string, sb);
        java.util.Iterator<java.util.Map.Entry<?, ?>> it = map.entrySet().iterator();
        java.util.Map.Entry<?, ?> next = it.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        java.lang.Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append(kotlin.text.Typography.amp);
            java.util.Map.Entry<?, ?> next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            java.lang.Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    public static java.lang.String append(java.lang.CharSequence charSequence, java.lang.Object... objArr) {
        java.lang.String string = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return string;
        }
        if (objArr.length % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Must specify an even number of parameter names/values");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(string);
        addPathSeparator(string, sb);
        addParamPrefix(string, sb);
        sb.append(objArr[0]);
        sb.append('=');
        java.lang.Object obj = objArr[1];
        if (obj != null) {
            sb.append(obj);
        }
        for (int i = 2; i < objArr.length; i += 2) {
            sb.append(kotlin.text.Typography.amp);
            sb.append(objArr[i]);
            sb.append('=');
            java.lang.Object obj2 = objArr[i + 1];
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    public static io.fabric.sdk.android.services.network.HttpRequest get(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_GET);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest get(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_GET);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest get(java.lang.CharSequence charSequence, java.util.Map<?, ?> map, boolean z) {
        java.lang.String strAppend = append(charSequence, map);
        if (z) {
            strAppend = encode(strAppend);
        }
        return get(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest get(java.lang.CharSequence charSequence, boolean z, java.lang.Object... objArr) {
        java.lang.String strAppend = append(charSequence, objArr);
        if (z) {
            strAppend = encode(strAppend);
        }
        return get(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest post(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_POST);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest post(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_POST);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest post(java.lang.CharSequence charSequence, java.util.Map<?, ?> map, boolean z) {
        java.lang.String strAppend = append(charSequence, map);
        if (z) {
            strAppend = encode(strAppend);
        }
        return post(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest post(java.lang.CharSequence charSequence, boolean z, java.lang.Object... objArr) {
        java.lang.String strAppend = append(charSequence, objArr);
        if (z) {
            strAppend = encode(strAppend);
        }
        return post(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest put(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_PUT);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest put(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_PUT);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest put(java.lang.CharSequence charSequence, java.util.Map<?, ?> map, boolean z) {
        java.lang.String strAppend = append(charSequence, map);
        if (z) {
            strAppend = encode(strAppend);
        }
        return put(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest put(java.lang.CharSequence charSequence, boolean z, java.lang.Object... objArr) {
        java.lang.String strAppend = append(charSequence, objArr);
        if (z) {
            strAppend = encode(strAppend);
        }
        return put(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest delete(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_DELETE);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest delete(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_DELETE);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest delete(java.lang.CharSequence charSequence, java.util.Map<?, ?> map, boolean z) {
        java.lang.String strAppend = append(charSequence, map);
        if (z) {
            strAppend = encode(strAppend);
        }
        return delete(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest delete(java.lang.CharSequence charSequence, boolean z, java.lang.Object... objArr) {
        java.lang.String strAppend = append(charSequence, objArr);
        if (z) {
            strAppend = encode(strAppend);
        }
        return delete(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest head(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_HEAD);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest head(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_HEAD);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest head(java.lang.CharSequence charSequence, java.util.Map<?, ?> map, boolean z) {
        java.lang.String strAppend = append(charSequence, map);
        if (z) {
            strAppend = encode(strAppend);
        }
        return head(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest head(java.lang.CharSequence charSequence, boolean z, java.lang.Object... objArr) {
        java.lang.String strAppend = append(charSequence, objArr);
        if (z) {
            strAppend = encode(strAppend);
        }
        return head(strAppend);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest options(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_OPTIONS);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest options(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_OPTIONS);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest trace(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(charSequence, METHOD_TRACE);
    }

    public static io.fabric.sdk.android.services.network.HttpRequest trace(java.net.URL url) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new io.fabric.sdk.android.services.network.HttpRequest(url, METHOD_TRACE);
    }

    public static void keepAlive(boolean z) {
        setProperty("http.keepAlive", java.lang.Boolean.toString(z));
    }

    public static void proxyHost(java.lang.String str) {
        setProperty("http.proxyHost", str);
        setProperty("https.proxyHost", str);
    }

    public static void proxyPort(int i) {
        java.lang.String string = java.lang.Integer.toString(i);
        setProperty("http.proxyPort", string);
        setProperty("https.proxyPort", string);
    }

    public static void nonProxyHosts(java.lang.String... strArr) {
        if (strArr != null && strArr.length > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = strArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(strArr[i]);
                sb.append('|');
            }
            sb.append(strArr[length]);
            setProperty("http.nonProxyHosts", sb.toString());
            return;
        }
        setProperty("http.nonProxyHosts", null);
    }

    private static java.lang.String setProperty(final java.lang.String str, final java.lang.String str2) {
        java.security.PrivilegedAction<java.lang.String> privilegedAction;
        if (str2 != null) {
            privilegedAction = new java.security.PrivilegedAction<java.lang.String>() { // from class: io.fabric.sdk.android.services.network.HttpRequest.1
                @Override // java.security.PrivilegedAction
                public java.lang.String run() {
                    return java.lang.System.setProperty(str, str2);
                }
            };
        } else {
            privilegedAction = new java.security.PrivilegedAction<java.lang.String>() { // from class: io.fabric.sdk.android.services.network.HttpRequest.2
                @Override // java.security.PrivilegedAction
                public java.lang.String run() {
                    return java.lang.System.clearProperty(str);
                }
            };
        }
        return (java.lang.String) java.security.AccessController.doPrivileged(privilegedAction);
    }

    public HttpRequest(java.lang.CharSequence charSequence, java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            this.url = new java.net.URL(charSequence.toString());
            this.requestMethod = str;
        } catch (java.net.MalformedURLException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public HttpRequest(java.net.URL url, java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        this.url = url;
        this.requestMethod = str;
    }

    private java.net.Proxy createProxy() {
        return new java.net.Proxy(java.net.Proxy.Type.HTTP, new java.net.InetSocketAddress(this.httpProxyHost, this.httpProxyPort));
    }

    private java.net.HttpURLConnection createConnection() {
        java.net.HttpURLConnection httpURLConnectionCreate;
        try {
            if (this.httpProxyHost != null) {
                httpURLConnectionCreate = CONNECTION_FACTORY.create(this.url, createProxy());
            } else {
                httpURLConnectionCreate = CONNECTION_FACTORY.create(this.url);
            }
            httpURLConnectionCreate.setRequestMethod(this.requestMethod);
            return httpURLConnectionCreate;
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public java.lang.String toString() {
        return method() + ' ' + url();
    }

    public java.net.HttpURLConnection getConnection() {
        if (this.connection == null) {
            this.connection = createConnection();
        }
        return this.connection;
    }

    public io.fabric.sdk.android.services.network.HttpRequest ignoreCloseExceptions(boolean z) {
        this.ignoreCloseExceptions = z;
        return this;
    }

    public boolean ignoreCloseExceptions() {
        return this.ignoreCloseExceptions;
    }

    public int code() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseCode();
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest code(java.util.concurrent.atomic.AtomicInteger atomicInteger) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        atomicInteger.set(code());
        return this;
    }

    public boolean ok() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return 200 == code();
    }

    public boolean created() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return 201 == code();
    }

    public boolean serverError() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return 500 == code();
    }

    public boolean badRequest() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return 400 == code();
    }

    public boolean notFound() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return 404 == code();
    }

    public boolean notModified() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return 304 == code();
    }

    public java.lang.String message() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseMessage();
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest disconnect() {
        getConnection().disconnect();
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest chunk(int i) {
        getConnection().setChunkedStreamingMode(i);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest bufferSize(int i) {
        if (i < 1) {
            throw new java.lang.IllegalArgumentException("Size must be greater than zero");
        }
        this.bufferSize = i;
        return this;
    }

    public int bufferSize() {
        return this.bufferSize;
    }

    public io.fabric.sdk.android.services.network.HttpRequest uncompress(boolean z) {
        this.uncompress = z;
        return this;
    }

    protected java.io.ByteArrayOutputStream byteStream() {
        int iContentLength = contentLength();
        if (iContentLength > 0) {
            return new java.io.ByteArrayOutputStream(iContentLength);
        }
        return new java.io.ByteArrayOutputStream();
    }

    public java.lang.String body(java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        java.io.ByteArrayOutputStream byteArrayOutputStreamByteStream = byteStream();
        try {
            copy(buffer(), byteArrayOutputStreamByteStream);
            return byteArrayOutputStreamByteStream.toString(getValidCharset(str));
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public java.lang.String body() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return body(charset());
    }

    public io.fabric.sdk.android.services.network.HttpRequest body(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        atomicReference.set(body());
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest body(java.util.concurrent.atomic.AtomicReference<java.lang.String> atomicReference, java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        atomicReference.set(body(str));
        return this;
    }

    public boolean isBodyEmpty() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return contentLength() == 0;
    }

    public byte[] bytes() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        java.io.ByteArrayOutputStream byteArrayOutputStreamByteStream = byteStream();
        try {
            copy(buffer(), byteArrayOutputStreamByteStream);
            return byteArrayOutputStreamByteStream.toByteArray();
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public java.io.BufferedInputStream buffer() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new java.io.BufferedInputStream(stream(), this.bufferSize);
    }

    public java.io.InputStream stream() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        java.io.InputStream inputStream;
        if (code() < 400) {
            try {
                inputStream = getConnection().getInputStream();
            } catch (java.io.IOException e) {
                throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
            }
        } else {
            inputStream = getConnection().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = getConnection().getInputStream();
                } catch (java.io.IOException e2) {
                    throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e2);
                }
            }
        }
        if (!this.uncompress || !ENCODING_GZIP.equals(contentEncoding())) {
            return inputStream;
        }
        try {
            return new java.util.zip.GZIPInputStream(inputStream);
        } catch (java.io.IOException e3) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e3);
        }
    }

    public java.io.InputStreamReader reader(java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            return new java.io.InputStreamReader(stream(), getValidCharset(str));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public java.io.InputStreamReader reader() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return reader(charset());
    }

    public java.io.BufferedReader bufferedReader(java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return new java.io.BufferedReader(reader(str), this.bufferSize);
    }

    public java.io.BufferedReader bufferedReader() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return bufferedReader(charset());
    }

    public io.fabric.sdk.android.services.network.HttpRequest receive(java.io.File file) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            final java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(file), this.bufferSize);
            return new io.fabric.sdk.android.services.network.HttpRequest.CloseOperation<io.fabric.sdk.android.services.network.HttpRequest>(bufferedOutputStream, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.3
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
                public io.fabric.sdk.android.services.network.HttpRequest run() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException, java.io.IOException {
                    return io.fabric.sdk.android.services.network.HttpRequest.this.receive(bufferedOutputStream);
                }
            }.call();
        } catch (java.io.FileNotFoundException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest receive(java.io.OutputStream outputStream) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            return copy(buffer(), outputStream);
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest receive(java.io.PrintStream printStream) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return receive((java.io.OutputStream) printStream);
    }

    public io.fabric.sdk.android.services.network.HttpRequest receive(final java.lang.Appendable appendable) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        final java.io.BufferedReader bufferedReader = bufferedReader();
        return new io.fabric.sdk.android.services.network.HttpRequest.CloseOperation<io.fabric.sdk.android.services.network.HttpRequest>(bufferedReader, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.4
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public io.fabric.sdk.android.services.network.HttpRequest run() throws java.io.IOException {
                java.nio.CharBuffer charBufferAllocate = java.nio.CharBuffer.allocate(io.fabric.sdk.android.services.network.HttpRequest.this.bufferSize);
                while (true) {
                    int i = bufferedReader.read(charBufferAllocate);
                    if (i != -1) {
                        charBufferAllocate.rewind();
                        appendable.append(charBufferAllocate, 0, i);
                        charBufferAllocate.rewind();
                    } else {
                        return io.fabric.sdk.android.services.network.HttpRequest.this;
                    }
                }
            }
        }.call();
    }

    public io.fabric.sdk.android.services.network.HttpRequest receive(final java.io.Writer writer) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        final java.io.BufferedReader bufferedReader = bufferedReader();
        return new io.fabric.sdk.android.services.network.HttpRequest.CloseOperation<io.fabric.sdk.android.services.network.HttpRequest>(bufferedReader, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.5
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public io.fabric.sdk.android.services.network.HttpRequest run() throws java.io.IOException {
                return io.fabric.sdk.android.services.network.HttpRequest.this.copy(bufferedReader, writer);
            }
        }.call();
    }

    public io.fabric.sdk.android.services.network.HttpRequest readTimeout(int i) {
        getConnection().setReadTimeout(i);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest connectTimeout(int i) {
        getConnection().setConnectTimeout(i);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest header(java.lang.String str, java.lang.String str2) {
        getConnection().setRequestProperty(str, str2);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest header(java.lang.String str, java.lang.Number number) {
        return header(str, number != null ? number.toString() : null);
    }

    public io.fabric.sdk.android.services.network.HttpRequest headers(java.util.Map<java.lang.String, java.lang.String> map) {
        if (!map.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                header(it.next());
            }
        }
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest header(java.util.Map.Entry<java.lang.String, java.lang.String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public java.lang.String header(java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderField(str);
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFields();
    }

    public long dateHeader(java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return dateHeader(str, -1L);
    }

    public long dateHeader(java.lang.String str, long j) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldDate(str, j);
    }

    public int intHeader(java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return intHeader(str, -1);
    }

    public int intHeader(java.lang.String str, int i) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldInt(str, i);
    }

    public java.lang.String[] headers(java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> mapHeaders = headers();
        if (mapHeaders == null || mapHeaders.isEmpty()) {
            return EMPTY_STRINGS;
        }
        java.util.List<java.lang.String> list = mapHeaders.get(str);
        if (list != null && !list.isEmpty()) {
            return (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
        }
        return EMPTY_STRINGS;
    }

    public java.lang.String parameter(java.lang.String str, java.lang.String str2) {
        return getParam(header(str), str2);
    }

    public java.util.Map<java.lang.String, java.lang.String> parameters(java.lang.String str) {
        return getParams(header(str));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    protected java.util.Map<java.lang.String, java.lang.String> getParams(java.lang.String str) {
        java.lang.String strTrim;
        int length;
        if (str == null || str.length() == 0) {
            return java.util.Collections.emptyMap();
        }
        int length2 = str.length();
        int iIndexOf = str.indexOf(59) + 1;
        if (iIndexOf == 0 || iIndexOf == length2) {
            return java.util.Collections.emptyMap();
        }
        int iIndexOf2 = str.indexOf(59, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = length2;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        while (iIndexOf < iIndexOf2) {
            int iIndexOf3 = str.indexOf(61, iIndexOf);
            if (iIndexOf3 != -1 && iIndexOf3 < iIndexOf2) {
                java.lang.String strTrim2 = str.substring(iIndexOf, iIndexOf3).trim();
                if (strTrim2.length() > 0 && (length = (strTrim = str.substring(iIndexOf3 + 1, iIndexOf2).trim()).length()) != 0) {
                    if (length <= 2 || '\"' != strTrim.charAt(0)) {
                        linkedHashMap.put(strTrim2, strTrim);
                    } else {
                        int i = length - 1;
                        if ('\"' == strTrim.charAt(i)) {
                            linkedHashMap.put(strTrim2, strTrim.substring(1, i));
                        } else {
                            linkedHashMap.put(strTrim2, strTrim);
                        }
                    }
                }
            }
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(59, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = length2;
            }
        }
        return linkedHashMap;
    }

    protected java.lang.String getParam(java.lang.String str, java.lang.String str2) {
        java.lang.String strTrim;
        int length;
        if (str != null && str.length() != 0) {
            int length2 = str.length();
            int iIndexOf = str.indexOf(59) + 1;
            if (iIndexOf != 0 && iIndexOf != length2) {
                int iIndexOf2 = str.indexOf(59, iIndexOf);
                if (iIndexOf2 == -1) {
                    iIndexOf2 = length2;
                }
                while (iIndexOf < iIndexOf2) {
                    int iIndexOf3 = str.indexOf(61, iIndexOf);
                    if (iIndexOf3 != -1 && iIndexOf3 < iIndexOf2 && str2.equals(str.substring(iIndexOf, iIndexOf3).trim()) && (length = (strTrim = str.substring(iIndexOf3 + 1, iIndexOf2).trim()).length()) != 0) {
                        if (length > 2 && '\"' == strTrim.charAt(0)) {
                            int i = length - 1;
                            if ('\"' == strTrim.charAt(i)) {
                                return strTrim.substring(1, i);
                            }
                        }
                        return strTrim;
                    }
                    iIndexOf = iIndexOf2 + 1;
                    iIndexOf2 = str.indexOf(59, iIndexOf);
                    if (iIndexOf2 == -1) {
                        iIndexOf2 = length2;
                    }
                }
            }
        }
        return null;
    }

    public java.lang.String charset() {
        return parameter(HEADER_CONTENT_TYPE, PARAM_CHARSET);
    }

    public io.fabric.sdk.android.services.network.HttpRequest userAgent(java.lang.String str) {
        return header("User-Agent", str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest referer(java.lang.String str) {
        return header(HEADER_REFERER, str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest useCaches(boolean z) {
        getConnection().setUseCaches(z);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest acceptEncoding(java.lang.String str) {
        return header(HEADER_ACCEPT_ENCODING, str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest acceptGzipEncoding() {
        return acceptEncoding(ENCODING_GZIP);
    }

    public io.fabric.sdk.android.services.network.HttpRequest acceptCharset(java.lang.String str) {
        return header(HEADER_ACCEPT_CHARSET, str);
    }

    public java.lang.String contentEncoding() {
        return header(HEADER_CONTENT_ENCODING);
    }

    public java.lang.String server() {
        return header(HEADER_SERVER);
    }

    public long date() {
        return dateHeader(HEADER_DATE);
    }

    public java.lang.String cacheControl() {
        return header(HEADER_CACHE_CONTROL);
    }

    public java.lang.String eTag() {
        return header(HEADER_ETAG);
    }

    public long expires() {
        return dateHeader(HEADER_EXPIRES);
    }

    public long lastModified() {
        return dateHeader(HEADER_LAST_MODIFIED);
    }

    public java.lang.String location() {
        return header(HEADER_LOCATION);
    }

    public io.fabric.sdk.android.services.network.HttpRequest authorization(java.lang.String str) {
        return header(HEADER_AUTHORIZATION, str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest proxyAuthorization(java.lang.String str) {
        return header(HEADER_PROXY_AUTHORIZATION, str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest basic(java.lang.String str, java.lang.String str2) {
        return authorization("Basic " + io.fabric.sdk.android.services.network.HttpRequest.Base64.encode(str + ':' + str2));
    }

    public io.fabric.sdk.android.services.network.HttpRequest proxyBasic(java.lang.String str, java.lang.String str2) {
        return proxyAuthorization("Basic " + io.fabric.sdk.android.services.network.HttpRequest.Base64.encode(str + ':' + str2));
    }

    public io.fabric.sdk.android.services.network.HttpRequest ifModifiedSince(long j) {
        getConnection().setIfModifiedSince(j);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest ifNoneMatch(java.lang.String str) {
        return header(HEADER_IF_NONE_MATCH, str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest contentType(java.lang.String str) {
        return contentType(str, null);
    }

    public io.fabric.sdk.android.services.network.HttpRequest contentType(java.lang.String str, java.lang.String str2) {
        if (str2 != null && str2.length() > 0) {
            return header(HEADER_CONTENT_TYPE, str + "; charset=" + str2);
        }
        return header(HEADER_CONTENT_TYPE, str);
    }

    public java.lang.String contentType() {
        return header(HEADER_CONTENT_TYPE);
    }

    public int contentLength() {
        return intHeader(HEADER_CONTENT_LENGTH);
    }

    public io.fabric.sdk.android.services.network.HttpRequest contentLength(java.lang.String str) {
        return contentLength(java.lang.Integer.parseInt(str));
    }

    public io.fabric.sdk.android.services.network.HttpRequest contentLength(int i) {
        getConnection().setFixedLengthStreamingMode(i);
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest accept(java.lang.String str) {
        return header("Accept", str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest acceptJson() {
        return accept("application/json");
    }

    protected io.fabric.sdk.android.services.network.HttpRequest copy(final java.io.InputStream inputStream, final java.io.OutputStream outputStream) throws java.io.IOException {
        return new io.fabric.sdk.android.services.network.HttpRequest.CloseOperation<io.fabric.sdk.android.services.network.HttpRequest>(inputStream, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.6
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public io.fabric.sdk.android.services.network.HttpRequest run() throws java.io.IOException {
                byte[] bArr = new byte[io.fabric.sdk.android.services.network.HttpRequest.this.bufferSize];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        outputStream.write(bArr, 0, i);
                    } else {
                        return io.fabric.sdk.android.services.network.HttpRequest.this;
                    }
                }
            }
        }.call();
    }

    protected io.fabric.sdk.android.services.network.HttpRequest copy(final java.io.Reader reader, final java.io.Writer writer) throws java.io.IOException {
        return new io.fabric.sdk.android.services.network.HttpRequest.CloseOperation<io.fabric.sdk.android.services.network.HttpRequest>(reader, this.ignoreCloseExceptions) { // from class: io.fabric.sdk.android.services.network.HttpRequest.7
            @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
            public io.fabric.sdk.android.services.network.HttpRequest run() throws java.io.IOException {
                char[] cArr = new char[io.fabric.sdk.android.services.network.HttpRequest.this.bufferSize];
                while (true) {
                    int i = reader.read(cArr);
                    if (i != -1) {
                        writer.write(cArr, 0, i);
                    } else {
                        return io.fabric.sdk.android.services.network.HttpRequest.this;
                    }
                }
            }
        }.call();
    }

    protected io.fabric.sdk.android.services.network.HttpRequest closeOutput() throws java.io.IOException {
        io.fabric.sdk.android.services.network.HttpRequest.RequestOutputStream requestOutputStream = this.output;
        if (requestOutputStream == null) {
            return this;
        }
        if (this.multipart) {
            requestOutputStream.write("\r\n--00content0boundary00--\r\n");
        }
        if (this.ignoreCloseExceptions) {
            try {
                this.output.close();
            } catch (java.io.IOException unused) {
            }
        } else {
            this.output.close();
        }
        this.output = null;
        return this;
    }

    protected io.fabric.sdk.android.services.network.HttpRequest closeOutputQuietly() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            return closeOutput();
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    protected io.fabric.sdk.android.services.network.HttpRequest openOutput() throws java.io.IOException {
        if (this.output != null) {
            return this;
        }
        getConnection().setDoOutput(true);
        this.output = new io.fabric.sdk.android.services.network.HttpRequest.RequestOutputStream(getConnection().getOutputStream(), getParam(getConnection().getRequestProperty(HEADER_CONTENT_TYPE), PARAM_CHARSET), this.bufferSize);
        return this;
    }

    protected io.fabric.sdk.android.services.network.HttpRequest startPart() throws java.io.IOException {
        if (!this.multipart) {
            this.multipart = true;
            contentType(CONTENT_TYPE_MULTIPART).openOutput();
            this.output.write("--00content0boundary00\r\n");
        } else {
            this.output.write("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    protected io.fabric.sdk.android.services.network.HttpRequest writePartHeader(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return writePartHeader(str, str2, null);
    }

    protected io.fabric.sdk.android.services.network.HttpRequest writePartHeader(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append(kotlin.text.Typography.quote);
        partHeader("Content-Disposition", sb.toString());
        if (str3 != null) {
            partHeader(HEADER_CONTENT_TYPE, str3);
        }
        return send(CRLF);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2) {
        return part(str, (java.lang.String) null, str2);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2, java.lang.String str3) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return part(str, str2, (java.lang.String) null, str3);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            this.output.write(str4);
            return this;
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.Number number) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return part(str, (java.lang.String) null, number);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2, java.lang.Number number) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return part(str, str2, number != null ? number.toString() : null);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.io.File file) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return part(str, (java.lang.String) null, file);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2, java.io.File file) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return part(str, str2, (java.lang.String) null, file);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.File file) throws java.lang.Throwable {
        java.io.BufferedInputStream bufferedInputStream = null;
        try {
            try {
                java.io.BufferedInputStream bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                try {
                    io.fabric.sdk.android.services.network.HttpRequest httpRequestPart = part(str, str2, str3, bufferedInputStream2);
                    try {
                        bufferedInputStream2.close();
                    } catch (java.io.IOException unused) {
                    }
                    return httpRequestPart;
                } catch (java.io.IOException e) {
                    e = e;
                    throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
                } catch (java.lang.Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (java.io.IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.io.IOException e2) {
            e = e2;
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.io.InputStream inputStream) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return part(str, (java.lang.String) null, (java.lang.String) null, inputStream);
    }

    public io.fabric.sdk.android.services.network.HttpRequest part(java.lang.String str, java.lang.String str2, java.lang.String str3, java.io.InputStream inputStream) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            copy(inputStream, this.output);
            return this;
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest partHeader(java.lang.String str, java.lang.String str2) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return send(str).send(": ").send(str2).send(CRLF);
    }

    public io.fabric.sdk.android.services.network.HttpRequest send(java.io.File file) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            return send(new java.io.BufferedInputStream(new java.io.FileInputStream(file)));
        } catch (java.io.FileNotFoundException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest send(byte[] bArr) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return send(new java.io.ByteArrayInputStream(bArr));
    }

    public io.fabric.sdk.android.services.network.HttpRequest send(java.io.InputStream inputStream) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            openOutput();
            copy(inputStream, this.output);
            return this;
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest send(final java.io.Reader reader) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            openOutput();
            io.fabric.sdk.android.services.network.HttpRequest.RequestOutputStream requestOutputStream = this.output;
            final java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(requestOutputStream, requestOutputStream.encoder.charset());
            return new io.fabric.sdk.android.services.network.HttpRequest.FlushOperation<io.fabric.sdk.android.services.network.HttpRequest>(outputStreamWriter) { // from class: io.fabric.sdk.android.services.network.HttpRequest.8
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // io.fabric.sdk.android.services.network.HttpRequest.Operation
                public io.fabric.sdk.android.services.network.HttpRequest run() throws java.io.IOException {
                    return io.fabric.sdk.android.services.network.HttpRequest.this.copy(reader, outputStreamWriter);
                }
            }.call();
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest send(java.lang.CharSequence charSequence) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            openOutput();
            this.output.write(charSequence.toString());
            return this;
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public java.io.OutputStreamWriter writer() throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        try {
            openOutput();
            io.fabric.sdk.android.services.network.HttpRequest.RequestOutputStream requestOutputStream = this.output;
            return new java.io.OutputStreamWriter(requestOutputStream, requestOutputStream.encoder.charset());
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest form(java.util.Map<?, ?> map) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return form(map, CHARSET_UTF8);
    }

    public io.fabric.sdk.android.services.network.HttpRequest form(java.util.Map.Entry<?, ?> entry) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return form(entry, CHARSET_UTF8);
    }

    public io.fabric.sdk.android.services.network.HttpRequest form(java.util.Map.Entry<?, ?> entry, java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return form(entry.getKey(), entry.getValue(), str);
    }

    public io.fabric.sdk.android.services.network.HttpRequest form(java.lang.Object obj, java.lang.Object obj2) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        return form(obj, obj2, CHARSET_UTF8);
    }

    public io.fabric.sdk.android.services.network.HttpRequest form(java.lang.Object obj, java.lang.Object obj2, java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        boolean z = !this.form;
        if (z) {
            contentType(CONTENT_TYPE_FORM, str);
            this.form = true;
        }
        java.lang.String validCharset = getValidCharset(str);
        try {
            openOutput();
            if (!z) {
                this.output.write(38);
            }
            this.output.write(java.net.URLEncoder.encode(obj.toString(), validCharset));
            this.output.write(61);
            if (obj2 != null) {
                this.output.write(java.net.URLEncoder.encode(obj2.toString(), validCharset));
            }
            return this;
        } catch (java.io.IOException e) {
            throw new io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException(e);
        }
    }

    public io.fabric.sdk.android.services.network.HttpRequest form(java.util.Map<?, ?> map, java.lang.String str) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        if (!map.isEmpty()) {
            java.util.Iterator<java.util.Map.Entry<?, ?>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                form(it.next(), str);
            }
        }
        return this;
    }

    public java.net.URL url() {
        return getConnection().getURL();
    }

    public java.lang.String method() {
        return getConnection().getRequestMethod();
    }

    public io.fabric.sdk.android.services.network.HttpRequest useProxy(java.lang.String str, int i) {
        if (this.connection != null) {
            throw new java.lang.IllegalStateException("The connection has already been created. This method must be called before reading or writing to the request.");
        }
        this.httpProxyHost = str;
        this.httpProxyPort = i;
        return this;
    }

    public io.fabric.sdk.android.services.network.HttpRequest followRedirects(boolean z) {
        getConnection().setInstanceFollowRedirects(z);
        return this;
    }
}
