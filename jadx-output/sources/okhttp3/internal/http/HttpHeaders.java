package okhttp3.internal.http;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpHeaders {
    private static final okio.ByteString QUOTED_STRING_DELIMITERS = okio.ByteString.encodeUtf8("\"\\");
    private static final okio.ByteString TOKEN_DELIMITERS = okio.ByteString.encodeUtf8("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(okhttp3.Response response) {
        return contentLength(response.headers());
    }

    public static long contentLength(okhttp3.Headers headers) {
        return stringToLong(headers.get(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_LENGTH));
    }

    private static long stringToLong(java.lang.String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean varyMatches(okhttp3.Response response, okhttp3.Headers headers, okhttp3.Request request) {
        for (java.lang.String str : varyFields(response)) {
            if (!okhttp3.internal.Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasVaryAll(okhttp3.Response response) {
        return hasVaryAll(response.headers());
    }

    public static boolean hasVaryAll(okhttp3.Headers headers) {
        return varyFields(headers).contains("*");
    }

    private static java.util.Set<java.lang.String> varyFields(okhttp3.Response response) {
        return varyFields(response.headers());
    }

    public static java.util.Set<java.lang.String> varyFields(okhttp3.Headers headers) {
        java.util.Set<java.lang.String> setEmptySet = java.util.Collections.emptySet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                java.lang.String strValue = headers.value(i);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new java.util.TreeSet<>((java.util.Comparator<? super java.lang.String>) java.lang.String.CASE_INSENSITIVE_ORDER);
                }
                for (java.lang.String str : strValue.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }

    public static okhttp3.Headers varyHeaders(okhttp3.Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static okhttp3.Headers varyHeaders(okhttp3.Headers headers, okhttp3.Headers headers2) {
        java.util.Set<java.lang.String> setVaryFields = varyFields(headers2);
        if (setVaryFields.isEmpty()) {
            return new okhttp3.Headers.Builder().build();
        }
        okhttp3.Headers.Builder builder = new okhttp3.Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            java.lang.String strName = headers.name(i);
            if (setVaryFields.contains(strName)) {
                builder.add(strName, headers.value(i));
            }
        }
        return builder.build();
    }

    public static java.util.List<okhttp3.Challenge> parseChallenges(okhttp3.Headers headers, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                parseChallengeHeader(arrayList, new okio.Buffer().writeUtf8(headers.value(i)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x0080 A[EDGE_INSN: B:61:0x0080->B:28:0x0080 BREAK  A[LOOP:2: B:22:0x006d->B:51:0x00c8], SYNTHETIC] */
    private static void parseChallengeHeader(java.util.List<okhttp3.Challenge> list, okio.Buffer buffer) {
        java.lang.String token;
        while (true) {
            java.lang.String token2 = null;
            while (true) {
                if (token2 == null) {
                    skipWhitespaceAndCommas(buffer);
                    token2 = readToken(buffer);
                    if (token2 == null) {
                        return;
                    }
                }
                boolean zSkipWhitespaceAndCommas = skipWhitespaceAndCommas(buffer);
                java.lang.String token3 = readToken(buffer);
                if (token3 == null) {
                    if (buffer.exhausted()) {
                        list.add(new okhttp3.Challenge(token2, (java.util.Map<java.lang.String, java.lang.String>) java.util.Collections.emptyMap()));
                        return;
                    }
                    return;
                }
                int iSkipAll = skipAll(buffer, (byte) 61);
                boolean zSkipWhitespaceAndCommas2 = skipWhitespaceAndCommas(buffer);
                if (!zSkipWhitespaceAndCommas && (zSkipWhitespaceAndCommas2 || buffer.exhausted())) {
                    list.add(new okhttp3.Challenge(token2, (java.util.Map<java.lang.String, java.lang.String>) java.util.Collections.singletonMap((java.lang.String) null, token3 + repeat('=', iSkipAll))));
                } else {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    int iSkipAll2 = iSkipAll + skipAll(buffer, (byte) 61);
                    while (true) {
                        if (token3 == null) {
                            token3 = readToken(buffer);
                            if (skipWhitespaceAndCommas(buffer)) {
                                break;
                            }
                            iSkipAll2 = skipAll(buffer, (byte) 61);
                            if (iSkipAll2 == 0) {
                                break;
                            }
                            if (iSkipAll2 <= 1 || skipWhitespaceAndCommas(buffer)) {
                                return;
                            }
                            if (buffer.exhausted() && buffer.getByte(0L) == 34) {
                                token = readQuotedString(buffer);
                            } else {
                                token = readToken(buffer);
                            }
                            if (token != null || ((java.lang.String) linkedHashMap.put(token3, token)) != null) {
                                return;
                            }
                            if (skipWhitespaceAndCommas(buffer) && !buffer.exhausted()) {
                                return;
                            } else {
                                token3 = null;
                            }
                        } else {
                            if (iSkipAll2 == 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (buffer.exhausted()) {
                                token = readToken(buffer);
                            } else {
                                token = readToken(buffer);
                            }
                            if (token != null) {
                                return;
                            }
                            if (skipWhitespaceAndCommas(buffer)) {
                            }
                            token3 = null;
                        }
                    }
                    list.add(new okhttp3.Challenge(token2, linkedHashMap));
                    token2 = token3;
                }
            }
        }
    }

    private static boolean skipWhitespaceAndCommas(okio.Buffer buffer) {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte b = buffer.getByte(0L);
            if (b != 44) {
                if (b != 32 && b != 9) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z = true;
            }
        }
        return z;
    }

    private static int skipAll(okio.Buffer buffer, byte b) {
        int i = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    private static java.lang.String readQuotedString(okio.Buffer buffer) {
        if (buffer.readByte() != 34) {
            throw new java.lang.IllegalArgumentException();
        }
        okio.Buffer buffer2 = new okio.Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(QUOTED_STRING_DELIMITERS);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    private static java.lang.String readToken(okio.Buffer buffer) {
        try {
            long jIndexOfElement = buffer.indexOfElement(TOKEN_DELIMITERS);
            if (jIndexOfElement == -1) {
                jIndexOfElement = buffer.size();
            }
            if (jIndexOfElement != 0) {
                return buffer.readUtf8(jIndexOfElement);
            }
            return null;
        } catch (java.io.EOFException unused) {
            throw new java.lang.AssertionError();
        }
    }

    private static java.lang.String repeat(char c, int i) {
        char[] cArr = new char[i];
        java.util.Arrays.fill(cArr, c);
        return new java.lang.String(cArr);
    }

    public static void receiveHeaders(okhttp3.CookieJar cookieJar, okhttp3.HttpUrl httpUrl, okhttp3.Headers headers) {
        if (cookieJar == okhttp3.CookieJar.NO_COOKIES) {
            return;
        }
        java.util.List<okhttp3.Cookie> all = okhttp3.Cookie.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }

    public static boolean hasBody(okhttp3.Response response) {
        if (response.request().method().equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_HEAD)) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) ? false : true;
    }

    public static int skipUntil(java.lang.String str, int i, java.lang.String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(java.lang.String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int parseSeconds(java.lang.String str, int i) {
        try {
            long j = java.lang.Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (java.lang.NumberFormatException unused) {
            return i;
        }
    }
}
