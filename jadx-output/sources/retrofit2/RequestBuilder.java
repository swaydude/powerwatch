package retrofit2;

/* JADX INFO: loaded from: classes3.dex */
final class RequestBuilder {
    private static final java.lang.String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final okhttp3.HttpUrl baseUrl;

    @javax.annotation.Nullable
    private okhttp3.RequestBody body;

    @javax.annotation.Nullable
    private okhttp3.MediaType contentType;

    @javax.annotation.Nullable
    private okhttp3.FormBody.Builder formBuilder;
    private final boolean hasBody;
    private final java.lang.String method;

    @javax.annotation.Nullable
    private okhttp3.MultipartBody.Builder multipartBuilder;

    @javax.annotation.Nullable
    private java.lang.String relativeUrl;
    private final okhttp3.Request.Builder requestBuilder;

    @javax.annotation.Nullable
    private okhttp3.HttpUrl.Builder urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final java.util.regex.Pattern PATH_TRAVERSAL = java.util.regex.Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    RequestBuilder(java.lang.String str, okhttp3.HttpUrl httpUrl, @javax.annotation.Nullable java.lang.String str2, @javax.annotation.Nullable okhttp3.Headers headers, @javax.annotation.Nullable okhttp3.MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        this.requestBuilder = builder;
        this.contentType = mediaType;
        this.hasBody = z;
        if (headers != null) {
            builder.headers(headers);
        }
        if (z2) {
            this.formBuilder = new okhttp3.FormBody.Builder();
        } else if (z3) {
            okhttp3.MultipartBody.Builder builder2 = new okhttp3.MultipartBody.Builder();
            this.multipartBuilder = builder2;
            builder2.setType(okhttp3.MultipartBody.FORM);
        }
    }

    void setRelativeUrl(java.lang.Object obj) {
        this.relativeUrl = obj.toString();
    }

    void addHeader(java.lang.String str, java.lang.String str2) {
        if (io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.contentType = okhttp3.MediaType.get(str2);
                return;
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Malformed content type: " + str2, e);
            }
        }
        this.requestBuilder.addHeader(str, str2);
    }

    void addPathParam(java.lang.String str, java.lang.String str2, boolean z) {
        if (this.relativeUrl == null) {
            throw new java.lang.AssertionError();
        }
        java.lang.String strCanonicalizeForPath = canonicalizeForPath(str2, z);
        java.lang.String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(strReplace).matches()) {
            throw new java.lang.IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
        }
        this.relativeUrl = strReplace;
    }

    private static java.lang.String canonicalizeForPath(java.lang.String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) == -1 && (z || (iCodePointAt != 47 && iCodePointAt != 37))) {
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            } else {
                okio.Buffer buffer = new okio.Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                canonicalizeForPath(buffer, str, iCharCount, length, z);
                return buffer.readUtf8();
            }
        }
        return str;
    }

    private static void canonicalizeForPath(okio.Buffer buffer, java.lang.String str, int i, int i2, boolean z) {
        okio.Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new okio.Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
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

    void addQueryParam(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, boolean z) {
        java.lang.String str3 = this.relativeUrl;
        if (str3 != null) {
            okhttp3.HttpUrl.Builder builderNewBuilder = this.baseUrl.newBuilder(str3);
            this.urlBuilder = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new java.lang.IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z) {
            this.urlBuilder.addEncodedQueryParameter(str, str2);
        } else {
            this.urlBuilder.addQueryParameter(str, str2);
        }
    }

    void addFormField(java.lang.String str, java.lang.String str2, boolean z) {
        if (z) {
            this.formBuilder.addEncoded(str, str2);
        } else {
            this.formBuilder.add(str, str2);
        }
    }

    void addPart(okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
        this.multipartBuilder.addPart(headers, requestBody);
    }

    void addPart(okhttp3.MultipartBody.Part part) {
        this.multipartBuilder.addPart(part);
    }

    void setBody(okhttp3.RequestBody requestBody) {
        this.body = requestBody;
    }

    okhttp3.Request.Builder get() {
        okhttp3.HttpUrl httpUrlResolve;
        okhttp3.HttpUrl.Builder builder = this.urlBuilder;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            httpUrlResolve = this.baseUrl.resolve(this.relativeUrl);
            if (httpUrlResolve == null) {
                throw new java.lang.IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        okhttp3.RequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            okhttp3.FormBody.Builder builder2 = this.formBuilder;
            if (builder2 != null) {
                contentTypeOverridingRequestBody = builder2.build();
            } else {
                okhttp3.MultipartBody.Builder builder3 = this.multipartBuilder;
                if (builder3 != null) {
                    contentTypeOverridingRequestBody = builder3.build();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = okhttp3.RequestBody.create((okhttp3.MediaType) null, new byte[0]);
                }
            }
        }
        okhttp3.MediaType mediaType = this.contentType;
        if (mediaType != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new retrofit2.RequestBuilder.ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, mediaType);
            } else {
                this.requestBuilder.addHeader(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE, mediaType.toString());
            }
        }
        return this.requestBuilder.url(httpUrlResolve).method(this.method, contentTypeOverridingRequestBody);
    }

    private static class ContentTypeOverridingRequestBody extends okhttp3.RequestBody {
        private final okhttp3.MediaType contentType;
        private final okhttp3.RequestBody delegate;

        ContentTypeOverridingRequestBody(okhttp3.RequestBody requestBody, okhttp3.MediaType mediaType) {
            this.delegate = requestBody;
            this.contentType = mediaType;
        }

        @Override // okhttp3.RequestBody
        public okhttp3.MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws java.io.IOException {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(okio.BufferedSink bufferedSink) throws java.io.IOException {
            this.delegate.writeTo(bufferedSink);
        }
    }
}
