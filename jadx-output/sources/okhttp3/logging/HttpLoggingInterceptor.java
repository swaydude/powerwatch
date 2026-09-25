package okhttp3.logging;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements okhttp3.Interceptor {
    private static final java.nio.charset.Charset UTF8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private volatile okhttp3.logging.HttpLoggingInterceptor.Level level;
    private final okhttp3.logging.HttpLoggingInterceptor.Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final okhttp3.logging.HttpLoggingInterceptor.Logger DEFAULT = new okhttp3.logging.HttpLoggingInterceptor.Logger() { // from class: okhttp3.logging.HttpLoggingInterceptor.Logger.1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(java.lang.String str) {
                okhttp3.internal.platform.Platform.get().log(4, str, null);
            }
        };

        void log(java.lang.String str);
    }

    public HttpLoggingInterceptor() {
        this(okhttp3.logging.HttpLoggingInterceptor.Logger.DEFAULT);
    }

    public HttpLoggingInterceptor(okhttp3.logging.HttpLoggingInterceptor.Logger logger) {
        this.level = okhttp3.logging.HttpLoggingInterceptor.Level.NONE;
        this.logger = logger;
    }

    public okhttp3.logging.HttpLoggingInterceptor setLevel(okhttp3.logging.HttpLoggingInterceptor.Level level) {
        java.util.Objects.requireNonNull(level, "level == null. Use Level.NONE instead.");
        this.level = level;
        return this;
    }

    public okhttp3.logging.HttpLoggingInterceptor.Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.lang.Exception {
        boolean z;
        okhttp3.logging.HttpLoggingInterceptor.Level level = this.level;
        okhttp3.Request request = chain.request();
        if (level == okhttp3.logging.HttpLoggingInterceptor.Level.NONE) {
            return chain.proceed(request);
        }
        boolean z2 = level == okhttp3.logging.HttpLoggingInterceptor.Level.BODY;
        boolean z3 = z2 || level == okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS;
        okhttp3.RequestBody requestBodyBody = request.body();
        boolean z4 = requestBodyBody != null;
        okhttp3.Connection connection = chain.connection();
        java.lang.String str = "--> " + request.method() + ' ' + request.url() + ' ' + (connection != null ? connection.protocol() : okhttp3.Protocol.HTTP_1_1);
        if (!z3 && z4) {
            str = str + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(str);
        if (z3) {
            if (z4) {
                if (requestBodyBody.contentType() != null) {
                    this.logger.log("Content-Type: " + requestBodyBody.contentType());
                }
                if (requestBodyBody.contentLength() != -1) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
            }
            okhttp3.Headers headers = request.headers();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                java.lang.String strName = headers.name(i);
                int i2 = size;
                if (!io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE.equalsIgnoreCase(strName) && !io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_LENGTH.equalsIgnoreCase(strName)) {
                    this.logger.log(strName + ": " + headers.value(i));
                }
                i++;
                size = i2;
                z3 = z3;
            }
            z = z3;
            if (!z2 || !z4) {
                this.logger.log("--> END " + request.method());
            } else if (bodyEncoded(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else {
                okio.Buffer buffer = new okio.Buffer();
                requestBodyBody.writeTo(buffer);
                java.nio.charset.Charset charset = UTF8;
                okhttp3.MediaType mediaTypeContentType = requestBodyBody.contentType();
                if (mediaTypeContentType != null) {
                    charset = mediaTypeContentType.charset(charset);
                }
                this.logger.log("");
                if (isPlaintext(buffer)) {
                    this.logger.log(buffer.readString(charset));
                    this.logger.log("--> END " + request.method() + " (" + requestBodyBody.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                }
            }
        } else {
            z = z3;
        }
        long jNanoTime = java.lang.System.nanoTime();
        try {
            okhttp3.Response responseProceed = chain.proceed(request);
            long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime);
            okhttp3.ResponseBody responseBodyBody = responseProceed.body();
            long jContentLength = responseBodyBody.contentLength();
            java.lang.String str2 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            okhttp3.logging.HttpLoggingInterceptor.Logger logger = this.logger;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("<-- ");
            sb.append(responseProceed.code());
            sb.append(' ');
            sb.append(responseProceed.message());
            sb.append(' ');
            sb.append(responseProceed.request().url());
            sb.append(" (");
            sb.append(millis);
            sb.append("ms");
            sb.append(z ? "" : ", " + str2 + " body");
            sb.append(')');
            logger.log(sb.toString());
            if (z) {
                okhttp3.Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.logger.log(headers2.name(i3) + ": " + headers2.value(i3));
                }
                if (!z2 || !okhttp3.internal.http.HttpHeaders.hasBody(responseProceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyEncoded(responseProceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    okio.BufferedSource bufferedSourceSource = responseBodyBody.source();
                    bufferedSourceSource.request(kotlin.jvm.internal.LongCompanionObject.MAX_VALUE);
                    okio.Buffer buffer2 = bufferedSourceSource.buffer();
                    java.nio.charset.Charset charset2 = UTF8;
                    okhttp3.MediaType mediaTypeContentType2 = responseBodyBody.contentType();
                    if (mediaTypeContentType2 != null) {
                        charset2 = mediaTypeContentType2.charset(charset2);
                    }
                    if (!isPlaintext(buffer2)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return responseProceed;
                    }
                    if (jContentLength != 0) {
                        this.logger.log("");
                        this.logger.log(buffer2.clone().readString(charset2));
                    }
                    this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                }
            }
            return responseProceed;
        } catch (java.lang.Exception e) {
            this.logger.log("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    static boolean isPlaintext(okio.Buffer buffer) {
        try {
            okio.Buffer buffer2 = new okio.Buffer();
            buffer.copyTo(buffer2, 0L, buffer.size() < 64 ? buffer.size() : 64L);
            for (int i = 0; i < 16 && !buffer2.exhausted(); i++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (java.lang.Character.isISOControl(utf8CodePoint) && !java.lang.Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    private boolean bodyEncoded(okhttp3.Headers headers) {
        java.lang.String str = headers.get(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING);
        return (str == null || str.equalsIgnoreCase("identity")) ? false : true;
    }
}
