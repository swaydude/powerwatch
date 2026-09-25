package io.fabric.sdk.android.services.common;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractSpiCall {
    public static final java.lang.String ACCEPT_JSON_VALUE = "application/json";
    public static final java.lang.String ANDROID_CLIENT_TYPE = "android";
    public static final java.lang.String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
    public static final java.lang.String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final java.lang.String HEADER_ACCEPT = "Accept";
    public static final java.lang.String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
    public static final java.lang.String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final java.lang.String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final java.lang.String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final java.lang.String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final java.lang.String HEADER_USER_AGENT = "User-Agent";
    private static final java.util.regex.Pattern PROTOCOL_AND_HOST_PATTERN = java.util.regex.Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final io.fabric.sdk.android.Kit kit;
    private final io.fabric.sdk.android.services.network.HttpMethod method;
    private final java.lang.String protocolAndHostOverride;
    private final io.fabric.sdk.android.services.network.HttpRequestFactory requestFactory;
    private final java.lang.String url;

    public AbstractSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod httpMethod) {
        if (str2 == null) {
            throw new java.lang.IllegalArgumentException("url must not be null.");
        }
        if (httpRequestFactory == null) {
            throw new java.lang.IllegalArgumentException("requestFactory must not be null.");
        }
        this.kit = kit;
        this.protocolAndHostOverride = str;
        this.url = overrideProtocolAndHost(str2);
        this.requestFactory = httpRequestFactory;
        this.method = httpMethod;
    }

    protected java.lang.String getUrl() {
        return this.url;
    }

    protected io.fabric.sdk.android.services.network.HttpRequest getHttpRequest() {
        return getHttpRequest(java.util.Collections.emptyMap());
    }

    protected io.fabric.sdk.android.services.network.HttpRequest getHttpRequest(java.util.Map<java.lang.String, java.lang.String> map) {
        return this.requestFactory.buildHttpRequest(this.method, getUrl(), map).useCaches(false).connectTimeout(10000).header("User-Agent", CRASHLYTICS_USER_AGENT + this.kit.getVersion()).header(HEADER_DEVELOPER_TOKEN, "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    private java.lang.String overrideProtocolAndHost(java.lang.String str) {
        return !io.fabric.sdk.android.services.common.CommonUtils.isNullOrEmpty(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }
}
