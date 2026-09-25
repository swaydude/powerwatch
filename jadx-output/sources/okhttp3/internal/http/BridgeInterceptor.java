package okhttp3.internal.http;

/* JADX INFO: loaded from: classes2.dex */
public final class BridgeInterceptor implements okhttp3.Interceptor {
    private final okhttp3.CookieJar cookieJar;

    public BridgeInterceptor(okhttp3.CookieJar cookieJar) {
        this.cookieJar = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.Request request = chain.request();
        okhttp3.Request.Builder builderNewBuilder = request.newBuilder();
        okhttp3.RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            okhttp3.MediaType mediaTypeContentType = requestBodyBody.contentType();
            if (mediaTypeContentType != null) {
                builderNewBuilder.header(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE, mediaTypeContentType.toString());
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                builderNewBuilder.header(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_LENGTH, java.lang.Long.toString(jContentLength));
                builderNewBuilder.removeHeader("Transfer-Encoding");
            } else {
                builderNewBuilder.header("Transfer-Encoding", "chunked");
                builderNewBuilder.removeHeader(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (request.header("Host") == null) {
            builderNewBuilder.header("Host", okhttp3.internal.Util.hostHeader(request.url(), false));
        }
        if (request.header("Connection") == null) {
            builderNewBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header(io.fabric.sdk.android.services.network.HttpRequest.HEADER_ACCEPT_ENCODING) == null && request.header("Range") == null) {
            z = true;
            builderNewBuilder.header(io.fabric.sdk.android.services.network.HttpRequest.HEADER_ACCEPT_ENCODING, io.fabric.sdk.android.services.network.HttpRequest.ENCODING_GZIP);
        }
        java.util.List<okhttp3.Cookie> listLoadForRequest = this.cookieJar.loadForRequest(request.url());
        if (!listLoadForRequest.isEmpty()) {
            builderNewBuilder.header("Cookie", cookieHeader(listLoadForRequest));
        }
        if (request.header("User-Agent") == null) {
            builderNewBuilder.header("User-Agent", okhttp3.internal.Version.userAgent());
        }
        okhttp3.Response responseProceed = chain.proceed(builderNewBuilder.build());
        okhttp3.internal.http.HttpHeaders.receiveHeaders(this.cookieJar, request.url(), responseProceed.headers());
        okhttp3.Response.Builder builderRequest = responseProceed.newBuilder().request(request);
        if (z && io.fabric.sdk.android.services.network.HttpRequest.ENCODING_GZIP.equalsIgnoreCase(responseProceed.header(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING)) && okhttp3.internal.http.HttpHeaders.hasBody(responseProceed)) {
            okio.GzipSource gzipSource = new okio.GzipSource(responseProceed.body().source());
            builderRequest.headers(responseProceed.headers().newBuilder().removeAll(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_ENCODING).removeAll(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_LENGTH).build());
            builderRequest.body(new okhttp3.internal.http.RealResponseBody(responseProceed.header(io.fabric.sdk.android.services.network.HttpRequest.HEADER_CONTENT_TYPE), -1L, okio.Okio.buffer(gzipSource)));
        }
        return builderRequest.build();
    }

    private java.lang.String cookieHeader(java.util.List<okhttp3.Cookie> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            okhttp3.Cookie cookie = list.get(i);
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        return sb.toString();
    }
}
