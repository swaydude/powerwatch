package okhttp3;

/* JADX INFO: loaded from: classes2.dex */
public final class MultipartBody extends okhttp3.RequestBody {
    private final okio.ByteString boundary;
    private long contentLength = -1;
    private final okhttp3.MediaType contentType;
    private final okhttp3.MediaType originalType;
    private final java.util.List<okhttp3.MultipartBody.Part> parts;
    public static final okhttp3.MediaType MIXED = okhttp3.MediaType.get("multipart/mixed");
    public static final okhttp3.MediaType ALTERNATIVE = okhttp3.MediaType.get("multipart/alternative");
    public static final okhttp3.MediaType DIGEST = okhttp3.MediaType.get("multipart/digest");
    public static final okhttp3.MediaType PARALLEL = okhttp3.MediaType.get("multipart/parallel");
    public static final okhttp3.MediaType FORM = okhttp3.MediaType.get("multipart/form-data");
    private static final byte[] COLONSPACE = {58, 32};
    private static final byte[] CRLF = {13, 10};
    private static final byte[] DASHDASH = {45, 45};

    MultipartBody(okio.ByteString byteString, okhttp3.MediaType mediaType, java.util.List<okhttp3.MultipartBody.Part> list) {
        this.boundary = byteString;
        this.originalType = mediaType;
        this.contentType = okhttp3.MediaType.get(mediaType + "; boundary=" + byteString.utf8());
        this.parts = okhttp3.internal.Util.immutableList(list);
    }

    public okhttp3.MediaType type() {
        return this.originalType;
    }

    public java.lang.String boundary() {
        return this.boundary.utf8();
    }

    public int size() {
        return this.parts.size();
    }

    public java.util.List<okhttp3.MultipartBody.Part> parts() {
        return this.parts;
    }

    public okhttp3.MultipartBody.Part part(int i) {
        return this.parts.get(i);
    }

    @Override // okhttp3.RequestBody
    public okhttp3.MediaType contentType() {
        return this.contentType;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws java.io.IOException {
        long j = this.contentLength;
        if (j != -1) {
            return j;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.BufferedSink bufferedSink) throws java.io.IOException {
        writeOrCountBytes(bufferedSink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private long writeOrCountBytes(@javax.annotation.Nullable okio.BufferedSink bufferedSink, boolean z) throws java.io.IOException {
        okio.Buffer buffer;
        if (z) {
            bufferedSink = new okio.Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            okhttp3.MultipartBody.Part part = this.parts.get(i);
            okhttp3.Headers headers = part.headers;
            okhttp3.RequestBody requestBody = part.body;
            bufferedSink.write(DASHDASH);
            bufferedSink.write(this.boundary);
            bufferedSink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.writeUtf8(headers.name(i2)).write(COLONSPACE).writeUtf8(headers.value(i2)).write(CRLF);
                }
            }
            okhttp3.MediaType mediaTypeContentType = requestBody.contentType();
            if (mediaTypeContentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(mediaTypeContentType.toString()).write(CRLF);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(CRLF);
            } else if (z) {
                buffer.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            bufferedSink.write(bArr);
            if (z) {
                j += jContentLength;
            } else {
                requestBody.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        byte[] bArr2 = DASHDASH;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.boundary);
        bufferedSink.write(bArr2);
        bufferedSink.write(CRLF);
        if (!z) {
            return j;
        }
        long size3 = j + buffer.size();
        buffer.clear();
        return size3;
    }

    static java.lang.StringBuilder appendQuotedString(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append(kotlin.text.Typography.quote);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append(kotlin.text.Typography.quote);
        return sb;
    }

    public static final class Part {
        final okhttp3.RequestBody body;

        @javax.annotation.Nullable
        final okhttp3.Headers headers;

        public static okhttp3.MultipartBody.Part create(okhttp3.RequestBody requestBody) {
            return create(null, requestBody);
        }

        public static okhttp3.MultipartBody.Part create(@javax.annotation.Nullable okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            java.util.Objects.requireNonNull(requestBody, "body == null");
            if (headers != null && headers.get(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE) != null) {
                throw new java.lang.IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (headers != null && headers.get(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_LENGTH) != null) {
                throw new java.lang.IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new okhttp3.MultipartBody.Part(headers, requestBody);
        }

        public static okhttp3.MultipartBody.Part createFormData(java.lang.String str, java.lang.String str2) {
            return createFormData(str, null, okhttp3.RequestBody.create((okhttp3.MediaType) null, str2));
        }

        public static okhttp3.MultipartBody.Part createFormData(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, okhttp3.RequestBody requestBody) {
            java.util.Objects.requireNonNull(str, "name == null");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("form-data; name=");
            okhttp3.MultipartBody.appendQuotedString(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                okhttp3.MultipartBody.appendQuotedString(sb, str2);
            }
            return create(okhttp3.Headers.of("Content-Disposition", sb.toString()), requestBody);
        }

        private Part(@javax.annotation.Nullable okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        @javax.annotation.Nullable
        public okhttp3.Headers headers() {
            return this.headers;
        }

        public okhttp3.RequestBody body() {
            return this.body;
        }
    }

    public static final class Builder {
        private final okio.ByteString boundary;
        private final java.util.List<okhttp3.MultipartBody.Part> parts;
        private okhttp3.MediaType type;

        public Builder() {
            this(java.util.UUID.randomUUID().toString());
        }

        public Builder(java.lang.String str) {
            this.type = okhttp3.MultipartBody.MIXED;
            this.parts = new java.util.ArrayList();
            this.boundary = okio.ByteString.encodeUtf8(str);
        }

        public okhttp3.MultipartBody.Builder setType(okhttp3.MediaType mediaType) {
            java.util.Objects.requireNonNull(mediaType, "type == null");
            if (!mediaType.type().equals("multipart")) {
                throw new java.lang.IllegalArgumentException("multipart != " + mediaType);
            }
            this.type = mediaType;
            return this;
        }

        public okhttp3.MultipartBody.Builder addPart(okhttp3.RequestBody requestBody) {
            return addPart(okhttp3.MultipartBody.Part.create(requestBody));
        }

        public okhttp3.MultipartBody.Builder addPart(@javax.annotation.Nullable okhttp3.Headers headers, okhttp3.RequestBody requestBody) {
            return addPart(okhttp3.MultipartBody.Part.create(headers, requestBody));
        }

        public okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String str, java.lang.String str2) {
            return addPart(okhttp3.MultipartBody.Part.createFormData(str, str2));
        }

        public okhttp3.MultipartBody.Builder addFormDataPart(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, okhttp3.RequestBody requestBody) {
            return addPart(okhttp3.MultipartBody.Part.createFormData(str, str2, requestBody));
        }

        public okhttp3.MultipartBody.Builder addPart(okhttp3.MultipartBody.Part part) {
            java.util.Objects.requireNonNull(part, "part == null");
            this.parts.add(part);
            return this;
        }

        public okhttp3.MultipartBody build() {
            if (this.parts.isEmpty()) {
                throw new java.lang.IllegalStateException("Multipart body must have at least one part.");
            }
            return new okhttp3.MultipartBody(this.boundary, this.type, this.parts);
        }
    }
}
