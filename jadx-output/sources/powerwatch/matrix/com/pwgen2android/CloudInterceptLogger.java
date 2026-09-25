package powerwatch.matrix.com.pwgen2android;

/* JADX INFO: loaded from: classes2.dex */
public final class CloudInterceptLogger implements okhttp3.Interceptor {
    public static final java.lang.String CloudTag = "AC_Cloud";
    private static final java.nio.charset.Charset UTF8 = java.nio.charset.Charset.forName(io.fabric.sdk.android.services.network.HttpRequest.CHARSET_UTF8);
    private powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput appLogger;
    private volatile powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level level;
    private final powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger DEFAULT = new powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger() { // from class: powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger.1
            @Override // powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger
            public void log(java.lang.String message) {
                okhttp3.internal.platform.Platform.get().log(4, message, null);
            }
        };

        void log(java.lang.String message);
    }

    public CloudInterceptLogger(powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput appLogger) {
        this(powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger.DEFAULT, appLogger);
    }

    public CloudInterceptLogger(powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger logger, powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput appLogger) {
        this.level = powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level.NONE;
        this.logger = logger;
        this.appLogger = appLogger;
    }

    public powerwatch.matrix.com.pwgen2android.CloudInterceptLogger setLevel(powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level level) {
        java.util.Objects.requireNonNull(level, "level == null. Use Level.NONE instead.");
        this.level = level;
        return this;
    }

    public powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level getLevel() {
        return this.level;
    }

    private boolean forbiddenURLs(java.lang.String url) {
        return url.contains(com.google.android.gms.fitness.FitnessActivities.SLEEP) || url.contains("walk") || url.contains("goal") || url.contains("rest");
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.lang.Exception {
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.String str3;
        powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level level = this.level;
        okhttp3.Request request = chain.request();
        if (level == powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level.BODY;
        boolean z2 = z || level == powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Level.HEADERS;
        okhttp3.RequestBody requestBodyBody = request.body();
        boolean z3 = requestBodyBody != null;
        okhttp3.Connection connection = chain.connection();
        okhttp3.Protocol protocol = connection != null ? connection.protocol() : okhttp3.Protocol.HTTP_1_1;
        java.lang.String str4 = "--> " + request.method() + ' ' + request.url() + ' ' + protocol;
        java.lang.String str5 = "auth";
        if (request.url().toString().contains("auth")) {
            str = "--> " + request.method() + " auth \n";
        } else if (forbiddenURLs(request.url().toString())) {
            str = "";
        } else {
            str = "--> " + request.method() + ' ' + request.url() + ' ' + protocol + "\n";
        }
        if (!z2 && z3) {
            str4 = str4 + " (" + requestBodyBody.contentLength() + "-byte body)";
        }
        this.logger.log(str4);
        if (z2) {
            if (z3) {
                if (requestBodyBody.contentType() != null) {
                    this.logger.log("Content-Type: " + requestBodyBody.contentType());
                }
                if (requestBodyBody.contentLength() != -1) {
                    this.logger.log("Content-Length: " + requestBodyBody.contentLength());
                }
            } else {
                z2 = z2;
                str5 = "auth";
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
            }
            if (!z || !z3) {
                str2 = r12;
                this.logger.log("--> END " + request.method());
                if (!forbiddenURLs(request.url().toString())) {
                    str = str + "--> END " + request.method() + "\n";
                }
            } else if (bodyEncoded(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                str2 = " (";
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
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("--> END ");
                    sb.append(request.method());
                    str2 = r12;
                    sb.append(str2);
                    sb.append(requestBodyBody.contentLength());
                    sb.append("-byte body)");
                    java.lang.String string = sb.toString();
                    if (!forbiddenURLs(request.url().toString())) {
                        str = str + string + "\n";
                    }
                    this.logger.log(string);
                } else {
                    str2 = r12;
                    java.lang.String str6 = "--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)";
                    this.logger.log(str6);
                    str = str + str6 + "\n";
                }
            }
            if (str.isEmpty()) {
                obj = r11;
            } else {
                powerwatch.matrix.com.pwgen2android.shared.logger.PWLoggerInput pWLoggerInput = this.appLogger;
                obj = CloudTag;
                pWLoggerInput.debug(str, obj);
            }
        } else {
            z2 = z2;
            obj = CloudTag;
            str5 = "auth";
            str2 = r12;
            str3 = "-byte body)";
        }
        long jNanoTime = java.lang.System.nanoTime();
        try {
            okhttp3.Response responseProceed = chain.proceed(request);
            long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(java.lang.System.nanoTime() - jNanoTime);
            okhttp3.ResponseBody responseBodyBody = responseProceed.body();
            long jContentLength = responseBodyBody.contentLength();
            java.lang.String str7 = jContentLength != -1 ? jContentLength + "-byte" : "unknown-length";
            powerwatch.matrix.com.pwgen2android.CloudInterceptLogger.Logger logger = this.logger;
            java.lang.String str8 = str3;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append("<-- ");
            sb2.append(responseProceed.code());
            sb2.append(' ');
            sb2.append(responseProceed.message());
            sb2.append(' ');
            sb2.append(responseProceed.request().url());
            sb2.append(str2);
            sb2.append(millis);
            sb2.append("ms");
            sb2.append(z2 ? "" : ", " + str7 + " body");
            sb2.append(')');
            logger.log(sb2.toString());
            java.lang.String str9 = (responseProceed.request().url().toString().contains(str5) && responseProceed.isSuccessful()) ? "<-- " + responseProceed.code() + ' ' + responseProceed.message() + "\n" : "";
            if (!responseProceed.isSuccessful()) {
                str9 = "<-- " + responseProceed.code() + ' ' + responseProceed.message() + ' ' + responseProceed.request().url() + "\n";
            }
            if (z2) {
                okhttp3.Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.logger.log(headers2.name(i3) + ": " + headers2.value(i3));
                }
                if (!z || !okhttp3.internal.http.HttpHeaders.hasBody(responseProceed)) {
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
                        java.lang.String string2 = buffer2.clone().readString(charset2);
                        this.logger.log(string2);
                        if (!responseProceed.isSuccessful()) {
                            str9 = str9 + string2 + "\n";
                        }
                    }
                    this.logger.log("<-- END HTTP (" + buffer2.size() + str8);
                }
                if (!forbiddenURLs(responseProceed.request().url().toString()) || !responseProceed.isSuccessful()) {
                    str9 = str9 + "<-- END HTTP\n";
                }
                if (!str9.isEmpty()) {
                    this.appLogger.debug(str9, obj);
                }
            }
            return responseProceed;
        } catch (java.lang.Exception e) {
            this.logger.log("<-- HTTP FAILED: " + e);
            this.appLogger.error("<-- HTTP FAILED: " + e, obj, e);
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
