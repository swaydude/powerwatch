package okhttp3.internal.http;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpMethod {
    public static boolean invalidatesCache(java.lang.String str) {
        return str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST) || str.equals("PATCH") || str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_PUT) || str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_DELETE) || str.equals("MOVE");
    }

    public static boolean requiresRequestBody(java.lang.String str) {
        return str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST) || str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean permitsRequestBody(java.lang.String str) {
        return (str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_GET) || str.equals(io.fabric.sdk.android.services.network.HttpRequest.METHOD_HEAD)) ? false : true;
    }

    public static boolean redirectsWithBody(java.lang.String str) {
        return str.equals("PROPFIND");
    }

    public static boolean redirectsToGet(java.lang.String str) {
        return !str.equals("PROPFIND");
    }

    private HttpMethod() {
    }
}
