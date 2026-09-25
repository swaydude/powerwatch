package okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpUrl {
    static final java.lang.String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final java.lang.String FRAGMENT_ENCODE_SET = "";
    static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @javax.annotation.Nullable
    private final java.lang.String fragment;
    final java.lang.String host;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    final int port;

    @javax.annotation.Nullable
    private final java.util.List<java.lang.String> queryNamesAndValues;
    final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    HttpUrl(okhttp3.HttpUrl.Builder builder) {
        this.scheme = builder.scheme;
        this.username = percentDecode(builder.encodedUsername, false);
        this.password = percentDecode(builder.encodedPassword, false);
        this.host = builder.host;
        this.port = builder.effectivePort();
        this.pathSegments = percentDecode(builder.encodedPathSegments, false);
        this.queryNamesAndValues = builder.encodedQueryNamesAndValues != null ? percentDecode(builder.encodedQueryNamesAndValues, true) : null;
        this.fragment = builder.encodedFragment != null ? percentDecode(builder.encodedFragment, false) : null;
        this.url = builder.toString();
    }

    public java.net.URL url() {
        try {
            return new java.net.URL(this.url);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public java.net.URI uri() {
        java.lang.String string = newBuilder().reencodeForUri().toString();
        try {
            return new java.net.URI(string);
        } catch (java.net.URISyntaxException e) {
            try {
                return java.net.URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public java.lang.String scheme() {
        return this.scheme;
    }

    public boolean isHttps() {
        return this.scheme.equals("https");
    }

    public java.lang.String encodedUsername() {
        if (this.username.isEmpty()) {
            return "";
        }
        int length = this.scheme.length() + 3;
        java.lang.String str = this.url;
        return this.url.substring(length, okhttp3.internal.Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public java.lang.String username() {
        return this.username;
    }

    public java.lang.String encodedPassword() {
        if (this.password.isEmpty()) {
            return "";
        }
        return this.url.substring(this.url.indexOf(58, this.scheme.length() + 3) + 1, this.url.indexOf(64));
    }

    public java.lang.String password() {
        return this.password;
    }

    public java.lang.String host() {
        return this.host;
    }

    public int port() {
        return this.port;
    }

    public static int defaultPort(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public int pathSize() {
        return this.pathSegments.size();
    }

    public java.lang.String encodedPath() {
        int iIndexOf = this.url.indexOf(47, this.scheme.length() + 3);
        java.lang.String str = this.url;
        return this.url.substring(iIndexOf, okhttp3.internal.Util.delimiterOffset(str, iIndexOf, str.length(), "?#"));
    }

    static void pathSegmentsToString(java.lang.StringBuilder sb, java.util.List<java.lang.String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public java.util.List<java.lang.String> encodedPathSegments() {
        int iIndexOf = this.url.indexOf(47, this.scheme.length() + 3);
        java.lang.String str = this.url;
        int iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(str, iIndexOf, str.length(), "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iIndexOf < iDelimiterOffset) {
            int i = iIndexOf + 1;
            int iDelimiterOffset2 = okhttp3.internal.Util.delimiterOffset(this.url, i, iDelimiterOffset, '/');
            arrayList.add(this.url.substring(i, iDelimiterOffset2));
            iIndexOf = iDelimiterOffset2;
        }
        return arrayList;
    }

    public java.util.List<java.lang.String> pathSegments() {
        return this.pathSegments;
    }

    @javax.annotation.Nullable
    public java.lang.String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf = this.url.indexOf(63) + 1;
        java.lang.String str = this.url;
        return this.url.substring(iIndexOf, okhttp3.internal.Util.delimiterOffset(str, iIndexOf, str.length(), '#'));
    }

    static void namesAndValuesToQueryString(java.lang.StringBuilder sb, java.util.List<java.lang.String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            java.lang.String str = list.get(i);
            java.lang.String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(kotlin.text.Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    static java.util.List<java.lang.String> queryStringToNamesAndValues(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    @javax.annotation.Nullable
    public java.lang.String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        namesAndValuesToQueryString(sb, this.queryNamesAndValues);
        return sb.toString();
    }

    public int querySize() {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @javax.annotation.Nullable
    public java.lang.String queryParameter(java.lang.String str) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                return this.queryNamesAndValues.get(i + 1);
            }
        }
        return null;
    }

    public java.util.Set<java.lang.String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return java.util.Collections.emptySet();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.queryNamesAndValues.get(i));
        }
        return java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    public java.util.List<java.lang.String> queryParameterValues(java.lang.String str) {
        if (this.queryNamesAndValues == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = this.queryNamesAndValues.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.queryNamesAndValues.get(i))) {
                arrayList.add(this.queryNamesAndValues.get(i + 1));
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public java.lang.String queryParameterName(int i) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return list.get(i * 2);
    }

    public java.lang.String queryParameterValue(int i) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return list.get((i * 2) + 1);
    }

    @javax.annotation.Nullable
    public java.lang.String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        return this.url.substring(this.url.indexOf(35) + 1);
    }

    @javax.annotation.Nullable
    public java.lang.String fragment() {
        return this.fragment;
    }

    public java.lang.String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    @javax.annotation.Nullable
    public okhttp3.HttpUrl resolve(java.lang.String str) {
        okhttp3.HttpUrl.Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public okhttp3.HttpUrl.Builder newBuilder() {
        okhttp3.HttpUrl.Builder builder = new okhttp3.HttpUrl.Builder();
        builder.scheme = this.scheme;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        builder.port = this.port != defaultPort(this.scheme) ? this.port : -1;
        builder.encodedPathSegments.clear();
        builder.encodedPathSegments.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.encodedFragment = encodedFragment();
        return builder;
    }

    @javax.annotation.Nullable
    public okhttp3.HttpUrl.Builder newBuilder(java.lang.String str) {
        try {
            return new okhttp3.HttpUrl.Builder().parse(this, str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @javax.annotation.Nullable
    public static okhttp3.HttpUrl parse(java.lang.String str) {
        try {
            return get(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public static okhttp3.HttpUrl get(java.lang.String str) {
        return new okhttp3.HttpUrl.Builder().parse(null, str).build();
    }

    @javax.annotation.Nullable
    public static okhttp3.HttpUrl get(java.net.URL url) {
        return parse(url.toString());
    }

    @javax.annotation.Nullable
    public static okhttp3.HttpUrl get(java.net.URI uri) {
        return parse(uri.toString());
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        return (obj instanceof okhttp3.HttpUrl) && ((okhttp3.HttpUrl) obj).url.equals(this.url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public java.lang.String toString() {
        return this.url;
    }

    @javax.annotation.Nullable
    public java.lang.String topPrivateDomain() {
        if (okhttp3.internal.Util.verifyAsIpAddress(this.host)) {
            return null;
        }
        return okhttp3.internal.publicsuffix.PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.host);
    }

    public static final class Builder {
        static final java.lang.String INVALID_HOST = "Invalid URL host";

        @javax.annotation.Nullable
        java.lang.String encodedFragment;
        final java.util.List<java.lang.String> encodedPathSegments;

        @javax.annotation.Nullable
        java.util.List<java.lang.String> encodedQueryNamesAndValues;

        @javax.annotation.Nullable
        java.lang.String host;

        @javax.annotation.Nullable
        java.lang.String scheme;
        java.lang.String encodedUsername = "";
        java.lang.String encodedPassword = "";
        int port = -1;

        public Builder() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        public okhttp3.HttpUrl.Builder scheme(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.scheme = "https";
            } else {
                throw new java.lang.IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public okhttp3.HttpUrl.Builder username(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "username == null");
            this.encodedUsername = okhttp3.HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public okhttp3.HttpUrl.Builder encodedUsername(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedUsername == null");
            this.encodedUsername = okhttp3.HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public okhttp3.HttpUrl.Builder password(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "password == null");
            this.encodedPassword = okhttp3.HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public okhttp3.HttpUrl.Builder encodedPassword(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedPassword == null");
            this.encodedPassword = okhttp3.HttpUrl.canonicalize(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public okhttp3.HttpUrl.Builder host(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "host == null");
            java.lang.String strCanonicalizeHost = canonicalizeHost(str, 0, str.length());
            if (strCanonicalizeHost == null) {
                throw new java.lang.IllegalArgumentException("unexpected host: " + str);
            }
            this.host = strCanonicalizeHost;
            return this;
        }

        public okhttp3.HttpUrl.Builder port(int i) {
            if (i <= 0 || i > 65535) {
                throw new java.lang.IllegalArgumentException("unexpected port: " + i);
            }
            this.port = i;
            return this;
        }

        int effectivePort() {
            int i = this.port;
            return i != -1 ? i : okhttp3.HttpUrl.defaultPort(this.scheme);
        }

        public okhttp3.HttpUrl.Builder addPathSegment(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "pathSegment == null");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public okhttp3.HttpUrl.Builder addPathSegments(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "pathSegments == null");
            return addPathSegments(str, false);
        }

        public okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedPathSegment == null");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedPathSegments == null");
            return addPathSegments(str, true);
        }

        private okhttp3.HttpUrl.Builder addPathSegments(java.lang.String str, boolean z) {
            int i = 0;
            do {
                int iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(str, i, str.length(), "/\\");
                push(str, i, iDelimiterOffset, iDelimiterOffset < str.length(), z);
                i = iDelimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }

        public okhttp3.HttpUrl.Builder setPathSegment(int i, java.lang.String str) {
            java.util.Objects.requireNonNull(str, "pathSegment == null");
            java.lang.String strCanonicalize = okhttp3.HttpUrl.canonicalize(str, 0, str.length(), okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, true, null);
            if (isDot(strCanonicalize) || isDotDot(strCanonicalize)) {
                throw new java.lang.IllegalArgumentException("unexpected path segment: " + str);
            }
            this.encodedPathSegments.set(i, strCanonicalize);
            return this;
        }

        public okhttp3.HttpUrl.Builder setEncodedPathSegment(int i, java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedPathSegment == null");
            java.lang.String strCanonicalize = okhttp3.HttpUrl.canonicalize(str, 0, str.length(), okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, true, null);
            this.encodedPathSegments.set(i, strCanonicalize);
            if (!isDot(strCanonicalize) && !isDotDot(strCanonicalize)) {
                return this;
            }
            throw new java.lang.IllegalArgumentException("unexpected path segment: " + str);
        }

        public okhttp3.HttpUrl.Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public okhttp3.HttpUrl.Builder encodedPath(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedPath == null");
            if (!str.startsWith("/")) {
                throw new java.lang.IllegalArgumentException("unexpected encodedPath: " + str);
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public okhttp3.HttpUrl.Builder query(@javax.annotation.Nullable java.lang.String str) {
            this.encodedQueryNamesAndValues = str != null ? okhttp3.HttpUrl.queryStringToNamesAndValues(okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_ENCODE_SET, false, false, true, true)) : null;
            return this;
        }

        public okhttp3.HttpUrl.Builder encodedQuery(@javax.annotation.Nullable java.lang.String str) {
            this.encodedQueryNamesAndValues = str != null ? okhttp3.HttpUrl.queryStringToNamesAndValues(okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
            java.util.Objects.requireNonNull(str, "name == null");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            this.encodedQueryNamesAndValues.add(okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true));
            this.encodedQueryNamesAndValues.add(str2 != null ? okhttp3.HttpUrl.canonicalize(str2, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true) : null);
            return this;
        }

        public okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
            java.util.Objects.requireNonNull(str, "encodedName == null");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            this.encodedQueryNamesAndValues.add(okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
            this.encodedQueryNamesAndValues.add(str2 != null ? okhttp3.HttpUrl.canonicalize(str2, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true) : null);
            return this;
        }

        public okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String str, @javax.annotation.Nullable java.lang.String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "name == null");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, true));
            return this;
        }

        public okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String str) {
            java.util.Objects.requireNonNull(str, "encodedName == null");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, true));
            return this;
        }

        private void removeAllCanonicalQueryParameters(java.lang.String str) {
            for (int size = this.encodedQueryNamesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.encodedQueryNamesAndValues.get(size))) {
                    this.encodedQueryNamesAndValues.remove(size + 1);
                    this.encodedQueryNamesAndValues.remove(size);
                    if (this.encodedQueryNamesAndValues.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
            }
        }

        public okhttp3.HttpUrl.Builder fragment(@javax.annotation.Nullable java.lang.String str) {
            this.encodedFragment = str != null ? okhttp3.HttpUrl.canonicalize(str, "", false, false, false, false) : null;
            return this;
        }

        public okhttp3.HttpUrl.Builder encodedFragment(@javax.annotation.Nullable java.lang.String str) {
            this.encodedFragment = str != null ? okhttp3.HttpUrl.canonicalize(str, "", true, false, false, false) : null;
            return this;
        }

        okhttp3.HttpUrl.Builder reencodeForUri() {
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, okhttp3.HttpUrl.canonicalize(this.encodedPathSegments.get(i), okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, true));
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    java.lang.String str = this.encodedQueryNamesAndValues.get(i2);
                    if (str != null) {
                        this.encodedQueryNamesAndValues.set(i2, okhttp3.HttpUrl.canonicalize(str, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                    }
                }
            }
            java.lang.String str2 = this.encodedFragment;
            if (str2 != null) {
                this.encodedFragment = okhttp3.HttpUrl.canonicalize(str2, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
            }
            return this;
        }

        public okhttp3.HttpUrl build() {
            if (this.scheme == null) {
                throw new java.lang.IllegalStateException("scheme == null");
            }
            if (this.host == null) {
                throw new java.lang.IllegalStateException("host == null");
            }
            return new okhttp3.HttpUrl(this);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.encodedUsername.isEmpty() || !this.encodedPassword.isEmpty()) {
                sb.append(this.encodedUsername);
                if (!this.encodedPassword.isEmpty()) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            }
            java.lang.String str2 = this.host;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                java.lang.String str3 = this.scheme;
                if (str3 == null || iEffectivePort != okhttp3.HttpUrl.defaultPort(str3)) {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            okhttp3.HttpUrl.pathSegmentsToString(sb, this.encodedPathSegments);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                okhttp3.HttpUrl.namesAndValuesToQueryString(sb, this.encodedQueryNamesAndValues);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            return sb.toString();
        }

        okhttp3.HttpUrl.Builder parse(@javax.annotation.Nullable okhttp3.HttpUrl httpUrl, java.lang.String str) {
            int iDelimiterOffset;
            int i;
            int iSkipLeadingAsciiWhitespace = okhttp3.internal.Util.skipLeadingAsciiWhitespace(str, 0, str.length());
            int iSkipTrailingAsciiWhitespace = okhttp3.internal.Util.skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, str.length());
            int iSchemeDelimiterOffset = schemeDelimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            if (iSchemeDelimiterOffset != -1) {
                if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.scheme = "https";
                    iSkipLeadingAsciiWhitespace += 6;
                } else if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "http:", 0, 5)) {
                    this.scheme = "http";
                    iSkipLeadingAsciiWhitespace += 5;
                } else {
                    throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iSchemeDelimiterOffset) + "'");
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme;
            } else {
                throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int iSlashCount = slashCount(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            char c = '?';
            char c2 = '#';
            if (iSlashCount >= 2 || httpUrl == null || !httpUrl.scheme.equals(this.scheme)) {
                int i2 = iSkipLeadingAsciiWhitespace + iSlashCount;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(str, i2, iSkipTrailingAsciiWhitespace, "@/\\?#");
                    byte bCharAt = iDelimiterOffset != iSkipTrailingAsciiWhitespace ? str.charAt(iDelimiterOffset) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c2 || bCharAt == 47 || bCharAt == 92 || bCharAt == c) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z) {
                            int iDelimiterOffset2 = okhttp3.internal.Util.delimiterOffset(str, i2, iDelimiterOffset, ':');
                            i = iDelimiterOffset;
                            java.lang.String strCanonicalize = okhttp3.HttpUrl.canonicalize(str, i2, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strCanonicalize = this.encodedUsername + "%40" + strCanonicalize;
                            }
                            this.encodedUsername = strCanonicalize;
                            if (iDelimiterOffset2 != i) {
                                this.encodedPassword = okhttp3.HttpUrl.canonicalize(str, iDelimiterOffset2 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        } else {
                            i = iDelimiterOffset;
                            this.encodedPassword += "%40" + okhttp3.HttpUrl.canonicalize(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i2 = i + 1;
                    }
                    c = '?';
                    c2 = '#';
                }
                int iPortColonOffset = portColonOffset(str, i2, iDelimiterOffset);
                int i3 = iPortColonOffset + 1;
                if (i3 < iDelimiterOffset) {
                    this.host = canonicalizeHost(str, i2, iPortColonOffset);
                    int port = parsePort(str, i3, iDelimiterOffset);
                    this.port = port;
                    if (port == -1) {
                        throw new java.lang.IllegalArgumentException("Invalid URL port: \"" + str.substring(i3, iDelimiterOffset) + kotlin.text.Typography.quote);
                    }
                } else {
                    this.host = canonicalizeHost(str, i2, iPortColonOffset);
                    this.port = okhttp3.HttpUrl.defaultPort(this.scheme);
                }
                if (this.host == null) {
                    throw new java.lang.IllegalArgumentException("Invalid URL host: \"" + str.substring(i2, iPortColonOffset) + kotlin.text.Typography.quote);
                }
                iSkipLeadingAsciiWhitespace = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host;
                this.port = httpUrl.port;
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iSkipLeadingAsciiWhitespace == iSkipTrailingAsciiWhitespace || str.charAt(iSkipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int iDelimiterOffset3 = okhttp3.internal.Util.delimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace, "?#");
            resolvePath(str, iSkipLeadingAsciiWhitespace, iDelimiterOffset3);
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = okhttp3.internal.Util.delimiterOffset(str, iDelimiterOffset3, iSkipTrailingAsciiWhitespace, '#');
                this.encodedQueryNamesAndValues = okhttp3.HttpUrl.queryStringToNamesAndValues(okhttp3.HttpUrl.canonicalize(str, iDelimiterOffset3 + 1, iDelimiterOffset4, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = okhttp3.HttpUrl.canonicalize(str, 1 + iDelimiterOffset3, iSkipTrailingAsciiWhitespace, "", true, false, false, false, null);
            }
            return this;
        }

        private void resolvePath(java.lang.String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i++;
            } else {
                java.util.List<java.lang.String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = okhttp3.internal.Util.delimiterOffset(str, i3, i2, "/\\");
                boolean z = i < i2;
                push(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        private void push(java.lang.String str, int i, int i2, boolean z, boolean z2) {
            java.lang.String strCanonicalize = okhttp3.HttpUrl.canonicalize(str, i, i2, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, true, null);
            if (isDot(strCanonicalize)) {
                return;
            }
            if (isDotDot(strCanonicalize)) {
                pop();
                return;
            }
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).isEmpty()) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize);
            } else {
                this.encodedPathSegments.add(strCanonicalize);
            }
            if (z) {
                this.encodedPathSegments.add("");
            }
        }

        private boolean isDot(java.lang.String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean isDotDot(java.lang.String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void pop() {
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).isEmpty() && !this.encodedPathSegments.isEmpty()) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        private static int schemeDelimiterOffset(java.lang.String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int slashCount(java.lang.String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int portColonOffset(java.lang.String str, int i, int i2) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ':') {
                    return i;
                }
                if (cCharAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static java.lang.String canonicalizeHost(java.lang.String str, int i, int i2) {
            return okhttp3.internal.Util.canonicalizeHost(okhttp3.HttpUrl.percentDecode(str, i, i2, false));
        }

        private static int parsePort(java.lang.String str, int i, int i2) {
            try {
                int i3 = java.lang.Integer.parseInt(okhttp3.HttpUrl.canonicalize(str, i, i2, "", false, false, false, true, null));
                if (i3 <= 0 || i3 > 65535) {
                    return -1;
                }
                return i3;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    }

    static java.lang.String percentDecode(java.lang.String str, boolean z) {
        return percentDecode(str, 0, str.length(), z);
    }

    private java.util.List<java.lang.String> percentDecode(java.util.List<java.lang.String> list, boolean z) {
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            java.lang.String str = list.get(i);
            arrayList.add(str != null ? percentDecode(str, z) : null);
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    static java.lang.String percentDecode(java.lang.String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                okio.Buffer buffer = new okio.Buffer();
                buffer.writeUtf8(str, i, i3);
                percentDecode(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    static void percentDecode(okio.Buffer buffer, java.lang.String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iDecodeHexDigit = okhttp3.internal.Util.decodeHexDigit(str.charAt(i + 1));
                int iDecodeHexDigit2 = okhttp3.internal.Util.decodeHexDigit(str.charAt(i3));
                if (iDecodeHexDigit != -1 && iDecodeHexDigit2 != -1) {
                    buffer.writeByte((iDecodeHexDigit << 4) + iDecodeHexDigit2);
                    i = i3;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            } else if (iCodePointAt == 43 && z) {
                buffer.writeByte(32);
            } else {
                buffer.writeUtf8CodePoint(iCodePointAt);
            }
            i += java.lang.Character.charCount(iCodePointAt);
        }
    }

    static boolean percentEncoded(java.lang.String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && okhttp3.internal.Util.decodeHexDigit(str.charAt(i + 1)) != -1 && okhttp3.internal.Util.decodeHexDigit(str.charAt(i3)) != -1;
    }

    static java.lang.String canonicalize(java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z4)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || percentEncoded(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3))) {
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                }
            }
            okio.Buffer buffer = new okio.Buffer();
            buffer.writeUtf8(str, i, iCharCount);
            canonicalize(buffer, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
            return buffer.readUtf8();
        }
        return str.substring(i, i2);
    }

    static void canonicalize(okio.Buffer buffer, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        okio.Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !percentEncoded(str, i, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new okio.Buffer();
                    }
                    if (charset == null || charset.equals(okhttp3.internal.Util.UTF_8)) {
                        buffer2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        buffer2.writeString(str, i, java.lang.Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!buffer2.exhausted()) {
                        int i3 = buffer2.readByte() & kotlin.UByte.MAX_VALUE;
                        buffer.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        buffer.writeByte((int) cArr[(i3 >> 4) & 15]);
                        buffer.writeByte((int) cArr[i3 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i += java.lang.Character.charCount(iCodePointAt);
        }
    }

    static java.lang.String canonicalize(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    static java.lang.String canonicalize(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return canonicalize(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
