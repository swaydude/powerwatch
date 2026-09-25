package okhttp3.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final okhttp3.RequestBody EMPTY_REQUEST;
    public static final okhttp3.ResponseBody EMPTY_RESPONSE;
    private static final java.util.regex.Pattern VERIFY_AS_IP_ADDRESS;
    private static final java.lang.reflect.Method addSuppressedExceptionMethod;
    public static final java.lang.String[] EMPTY_STRING_ARRAY = new java.lang.String[0];
    private static final okio.ByteString UTF_8_BOM = okio.ByteString.decodeHex("efbbbf");
    private static final okio.ByteString UTF_16_BE_BOM = okio.ByteString.decodeHex("feff");
    private static final okio.ByteString UTF_16_LE_BOM = okio.ByteString.decodeHex("fffe");
    private static final okio.ByteString UTF_32_BE_BOM = okio.ByteString.decodeHex("0000ffff");
    private static final okio.ByteString UTF_32_LE_BOM = okio.ByteString.decodeHex("ffff0000");
    public static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    public static final java.nio.charset.Charset ISO_8859_1 = java.nio.charset.Charset.forName("ISO-8859-1");
    private static final java.nio.charset.Charset UTF_16_BE = java.nio.charset.Charset.forName("UTF-16BE");
    private static final java.nio.charset.Charset UTF_16_LE = java.nio.charset.Charset.forName("UTF-16LE");
    private static final java.nio.charset.Charset UTF_32_BE = java.nio.charset.Charset.forName("UTF-32BE");
    private static final java.nio.charset.Charset UTF_32_LE = java.nio.charset.Charset.forName("UTF-32LE");
    public static final java.util.TimeZone UTC = java.util.TimeZone.getTimeZone("GMT");
    public static final java.util.Comparator<java.lang.String> NATURAL_ORDER = new java.util.Comparator<java.lang.String>() { // from class: okhttp3.internal.Util.1
        @Override // java.util.Comparator
        public int compare(java.lang.String str, java.lang.String str2) {
            return str.compareTo(str2);
        }
    };

    public static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        java.lang.reflect.Method declaredMethod = null;
        EMPTY_RESPONSE = okhttp3.ResponseBody.create((okhttp3.MediaType) null, bArr);
        EMPTY_REQUEST = okhttp3.RequestBody.create((okhttp3.MediaType) null, bArr);
        try {
            declaredMethod = java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class);
        } catch (java.lang.Exception unused) {
        }
        addSuppressedExceptionMethod = declaredMethod;
        VERIFY_AS_IP_ADDRESS = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static void addSuppressedIfPossible(java.lang.Throwable th, java.lang.Throwable th2) {
        java.lang.reflect.Method method = addSuppressedExceptionMethod;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
    }

    private Util() {
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void closeQuietly(java.net.Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (java.lang.AssertionError e) {
                if (!isAndroidGetsocknameError(e)) {
                    throw e;
                }
            } catch (java.lang.RuntimeException e2) {
                throw e2;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static void closeQuietly(java.net.ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static boolean discard(okio.Source source, int i, java.util.concurrent.TimeUnit timeUnit) {
        try {
            return skipAll(source, i, timeUnit);
        } catch (java.io.IOException unused) {
            return false;
        }
    }

    public static boolean skipAll(okio.Source source, int i, java.util.concurrent.TimeUnit timeUnit) throws java.io.IOException {
        long jNanoTime = java.lang.System.nanoTime();
        long jDeadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(java.lang.Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            okio.Buffer buffer = new okio.Buffer();
            while (source.read(buffer, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (java.io.InterruptedIOException unused) {
            if (jDeadlineNanoTime == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (java.lang.Throwable th) {
            if (jDeadlineNanoTime == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static <T> java.util.List<T> immutableList(java.util.List<T> list) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
    }

    public static <K, V> java.util.Map<K, V> immutableMap(java.util.Map<K, V> map) {
        if (map.isEmpty()) {
            return java.util.Collections.emptyMap();
        }
        return java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
    }

    public static <T> java.util.List<T> immutableList(T... tArr) {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList((java.lang.Object[]) tArr.clone()));
    }

    public static java.util.concurrent.ThreadFactory threadFactory(final java.lang.String str, final boolean z) {
        return new java.util.concurrent.ThreadFactory() { // from class: okhttp3.internal.Util.2
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(java.lang.Runnable runnable) {
                java.lang.Thread thread = new java.lang.Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static java.lang.String[] intersect(java.util.Comparator<? super java.lang.String> comparator, java.lang.String[] strArr, java.lang.String[] strArr2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            for (java.lang.String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public static boolean nonEmptyIntersection(java.util.Comparator<java.lang.String> comparator, java.lang.String[] strArr, java.lang.String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (java.lang.String str : strArr) {
                for (java.lang.String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static java.lang.String hostHeader(okhttp3.HttpUrl httpUrl, boolean z) {
        java.lang.String strHost;
        if (httpUrl.host().contains(":")) {
            strHost = "[" + httpUrl.host() + "]";
        } else {
            strHost = httpUrl.host();
        }
        if (!z && httpUrl.port() == okhttp3.HttpUrl.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + ":" + httpUrl.port();
    }

    public static boolean isAndroidGetsocknameError(java.lang.AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int indexOf(java.util.Comparator<java.lang.String> comparator, java.lang.String[] strArr, java.lang.String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static java.lang.String[] concat(java.lang.String[] strArr, java.lang.String str) {
        int length = strArr.length + 1;
        java.lang.String[] strArr2 = new java.lang.String[length];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static int skipLeadingAsciiWhitespace(java.lang.String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int skipTrailingAsciiWhitespace(java.lang.String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static java.lang.String trimSubstring(java.lang.String str, int i, int i2) {
        int iSkipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, i, i2);
        return str.substring(iSkipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, i2));
    }

    public static int delimiterOffset(java.lang.String str, int i, int i2, java.lang.String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int delimiterOffset(java.lang.String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static java.lang.String canonicalizeHost(java.lang.String str) {
        java.net.InetAddress inetAddressDecodeIpv6;
        if (str.contains(":")) {
            if (str.startsWith("[") && str.endsWith("]")) {
                inetAddressDecodeIpv6 = decodeIpv6(str, 1, str.length() - 1);
            } else {
                inetAddressDecodeIpv6 = decodeIpv6(str, 0, str.length());
            }
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            throw new java.lang.AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            java.lang.String lowerCase = java.net.IDN.toASCII(str).toLowerCase(java.util.Locale.US);
            if (lowerCase.isEmpty() || containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean containsInvalidHostnameAsciiCodes(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int indexOfControlOrNonAscii(java.lang.String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static boolean verifyAsIpAddress(java.lang.String str) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches();
    }

    public static java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        return java.lang.String.format(java.util.Locale.US, str, objArr);
    }

    public static java.nio.charset.Charset bomAwareCharset(okio.BufferedSource bufferedSource, java.nio.charset.Charset charset) throws java.io.IOException {
        okio.ByteString byteString = UTF_8_BOM;
        if (bufferedSource.rangeEquals(0L, byteString)) {
            bufferedSource.skip(byteString.size());
            return UTF_8;
        }
        okio.ByteString byteString2 = UTF_16_BE_BOM;
        if (bufferedSource.rangeEquals(0L, byteString2)) {
            bufferedSource.skip(byteString2.size());
            return UTF_16_BE;
        }
        okio.ByteString byteString3 = UTF_16_LE_BOM;
        if (bufferedSource.rangeEquals(0L, byteString3)) {
            bufferedSource.skip(byteString3.size());
            return UTF_16_LE;
        }
        okio.ByteString byteString4 = UTF_32_BE_BOM;
        if (bufferedSource.rangeEquals(0L, byteString4)) {
            bufferedSource.skip(byteString4.size());
            return UTF_32_BE;
        }
        okio.ByteString byteString5 = UTF_32_LE_BOM;
        if (!bufferedSource.rangeEquals(0L, byteString5)) {
            return charset;
        }
        bufferedSource.skip(byteString5.size());
        return UTF_32_LE;
    }

    public static int checkDuration(java.lang.String str, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(str + " < 0");
        }
        java.util.Objects.requireNonNull(timeUnit, "unit == null");
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new java.lang.IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new java.lang.IllegalArgumentException(str + " too small.");
    }

    public static java.lang.AssertionError assertionError(java.lang.String str, java.lang.Exception exc) {
        java.lang.AssertionError assertionError = new java.lang.AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (java.lang.IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[LOOP:1: B:30:0x004d->B:34:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0060 A[EDGE_INSN: B:59:0x0060->B:35:0x0060 BREAK  A[LOOP:1: B:30:0x004d->B:34:0x005a], SYNTHETIC] */
    @javax.annotation.Nullable
    private static java.net.InetAddress decodeIpv6(java.lang.String str, int i, int i2) {
        int i3;
        int i4;
        int iDecodeHexDigit;
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i = i7;
                i3 = 0;
                while (i < i2) {
                    iDecodeHexDigit = decodeHexDigit(str.charAt(i));
                    if (iDecodeHexDigit == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iDecodeHexDigit;
                    i++;
                }
                i4 = i - i7;
                if (i4 != 0) {
                }
                return null;
            }
            if (i5 != 0) {
                if (!str.regionMatches(i, ":", 0, 1)) {
                    if (!str.regionMatches(i, ".", 0, 1) || !decodeIpv4Suffix(str, i7, i2, bArr, i5 - 2)) {
                        return null;
                    }
                    i5 += 2;
                    break;
                }
                i++;
            }
            i7 = i;
            i = i7;
            i3 = 0;
            while (i < i2) {
                iDecodeHexDigit = decodeHexDigit(str.charAt(i));
                if (iDecodeHexDigit == -1) {
                    break;
                }
                i3 = (i3 << 4) + iDecodeHexDigit;
                i++;
            }
            i4 = i - i7;
            if (i4 != 0 || i4 > 4) {
                return null;
            }
            int i9 = i5 + 1;
            bArr[i5] = (byte) ((i3 >>> 8) & 255);
            i5 = i9 + 1;
            bArr[i9] = (byte) (i3 & 255);
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i10 = i5 - i6;
            java.lang.System.arraycopy(bArr, i6, bArr, 16 - i10, i10);
            java.util.Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException unused) {
            throw new java.lang.AssertionError();
        }
    }

    private static boolean decodeIpv4Suffix(java.lang.String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    private static java.lang.String inet6AddressToAscii(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        okio.Buffer buffer = new okio.Buffer();
        while (i < bArr.length) {
            if (i == i2) {
                buffer.writeByte(58);
                i += i4;
                if (i == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong(((bArr[i] & kotlin.UByte.MAX_VALUE) << 8) | (bArr[i + 1] & kotlin.UByte.MAX_VALUE));
                i += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static javax.net.ssl.X509TrustManager platformTrustManager() {
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((java.security.KeyStore) null);
            javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof javax.net.ssl.X509TrustManager)) {
                throw new java.lang.IllegalStateException("Unexpected default trust managers:" + java.util.Arrays.toString(trustManagers));
            }
            return (javax.net.ssl.X509TrustManager) trustManagers[0];
        } catch (java.security.GeneralSecurityException e) {
            throw assertionError("No System TLS", e);
        }
    }

    public static okhttp3.Headers toHeaders(java.util.List<okhttp3.internal.http2.Header> list) {
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        for (okhttp3.internal.http2.Header header : list) {
            okhttp3.internal.Internal.instance.addLenient(builder, header.name.utf8(), header.value.utf8());
        }
        return builder.build();
    }
}
