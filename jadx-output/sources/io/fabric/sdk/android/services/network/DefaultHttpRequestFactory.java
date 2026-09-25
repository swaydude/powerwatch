package io.fabric.sdk.android.services.network;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultHttpRequestFactory implements io.fabric.sdk.android.services.network.HttpRequestFactory {
    private static final java.lang.String HTTPS = "https";
    private boolean attemptedSslInit;
    private final io.fabric.sdk.android.Logger logger;
    private io.fabric.sdk.android.services.network.PinningInfoProvider pinningInfo;
    private javax.net.ssl.SSLSocketFactory sslSocketFactory;

    public DefaultHttpRequestFactory() {
        this(new io.fabric.sdk.android.DefaultLogger());
    }

    public DefaultHttpRequestFactory(io.fabric.sdk.android.Logger logger) {
        this.logger = logger;
    }

    @Override // io.fabric.sdk.android.services.network.HttpRequestFactory
    public io.fabric.sdk.android.services.network.PinningInfoProvider getPinningInfoProvider() {
        return this.pinningInfo;
    }

    @Override // io.fabric.sdk.android.services.network.HttpRequestFactory
    public void setPinningInfoProvider(io.fabric.sdk.android.services.network.PinningInfoProvider pinningInfoProvider) {
        if (this.pinningInfo != pinningInfoProvider) {
            this.pinningInfo = pinningInfoProvider;
            resetSSLSocketFactory();
        }
    }

    private synchronized void resetSSLSocketFactory() {
        this.attemptedSslInit = false;
        this.sslSocketFactory = null;
    }

    @Override // io.fabric.sdk.android.services.network.HttpRequestFactory
    public io.fabric.sdk.android.services.network.HttpRequest buildHttpRequest(io.fabric.sdk.android.services.network.HttpMethod httpMethod, java.lang.String str) {
        return buildHttpRequest(httpMethod, str, java.util.Collections.emptyMap());
    }

    /* JADX INFO: renamed from: io.fabric.sdk.android.services.network.DefaultHttpRequestFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod;

        static {
            int[] iArr = new int[io.fabric.sdk.android.services.network.HttpMethod.values().length];
            $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod = iArr;
            try {
                iArr[io.fabric.sdk.android.services.network.HttpMethod.GET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[io.fabric.sdk.android.services.network.HttpMethod.POST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[io.fabric.sdk.android.services.network.HttpMethod.PUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[io.fabric.sdk.android.services.network.HttpMethod.DELETE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.fabric.sdk.android.services.network.HttpRequestFactory
    public io.fabric.sdk.android.services.network.HttpRequest buildHttpRequest(io.fabric.sdk.android.services.network.HttpMethod httpMethod, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestPost;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        int i = io.fabric.sdk.android.services.network.DefaultHttpRequestFactory.AnonymousClass1.$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[httpMethod.ordinal()];
        if (i == 1) {
            httpRequestPost = io.fabric.sdk.android.services.network.HttpRequest.get((java.lang.CharSequence) str, (java.util.Map<?, ?>) map, true);
        } else if (i == 2) {
            httpRequestPost = io.fabric.sdk.android.services.network.HttpRequest.post((java.lang.CharSequence) str, (java.util.Map<?, ?>) map, true);
        } else if (i == 3) {
            httpRequestPost = io.fabric.sdk.android.services.network.HttpRequest.put(str);
        } else if (i == 4) {
            httpRequestPost = io.fabric.sdk.android.services.network.HttpRequest.delete(str);
        } else {
            throw new java.lang.IllegalArgumentException("Unsupported HTTP method!");
        }
        if (isHttps(str) && this.pinningInfo != null && (sSLSocketFactory = getSSLSocketFactory()) != null) {
            ((javax.net.ssl.HttpsURLConnection) httpRequestPost.getConnection()).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpRequestPost;
    }

    private boolean isHttps(java.lang.String str) {
        return str != null && str.toLowerCase(java.util.Locale.US).startsWith(HTTPS);
    }

    private synchronized javax.net.ssl.SSLSocketFactory getSSLSocketFactory() {
        if (this.sslSocketFactory == null && !this.attemptedSslInit) {
            this.sslSocketFactory = initSSLSocketFactory();
        }
        return this.sslSocketFactory;
    }

    private synchronized javax.net.ssl.SSLSocketFactory initSSLSocketFactory() {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        this.attemptedSslInit = true;
        try {
            sSLSocketFactory = io.fabric.sdk.android.services.network.NetworkUtils.getSSLSocketFactory(this.pinningInfo);
            this.logger.d(io.fabric.sdk.android.Fabric.TAG, "Custom SSL pinning enabled");
        } catch (java.lang.Exception e) {
            this.logger.e(io.fabric.sdk.android.Fabric.TAG, "Exception while validating pinned certs", e);
            return null;
        }
        return sSLSocketFactory;
    }
}
