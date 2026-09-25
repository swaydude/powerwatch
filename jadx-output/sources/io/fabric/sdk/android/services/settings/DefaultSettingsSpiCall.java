package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
class DefaultSettingsSpiCall extends io.fabric.sdk.android.services.common.AbstractSpiCall implements io.fabric.sdk.android.services.settings.SettingsSpiCall {
    static final java.lang.String BUILD_VERSION_PARAM = "build_version";
    static final java.lang.String DISPLAY_VERSION_PARAM = "display_version";
    static final java.lang.String HEADER_DEVICE_MODEL = "X-CRASHLYTICS-DEVICE-MODEL";
    static final java.lang.String HEADER_INSTALLATION_ID = "X-CRASHLYTICS-INSTALLATION-ID";
    static final java.lang.String HEADER_OS_BUILD_VERSION = "X-CRASHLYTICS-OS-BUILD-VERSION";
    static final java.lang.String HEADER_OS_DISPLAY_VERSION = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
    static final java.lang.String ICON_HASH = "icon_hash";
    static final java.lang.String INSTANCE_PARAM = "instance";
    static final java.lang.String SOURCE_PARAM = "source";

    boolean requestWasSuccessful(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public DefaultSettingsSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory) {
        this(kit, str, str2, httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod.GET);
    }

    DefaultSettingsSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod httpMethod) {
        super(kit, str, str2, httpRequestFactory, httpMethod);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0088, please report this as an issue */
    @Override // io.fabric.sdk.android.services.settings.SettingsSpiCall
    public org.json.JSONObject invoke(io.fabric.sdk.android.services.settings.SettingsRequest settingsRequest) throws java.lang.Throwable {
        io.fabric.sdk.android.services.network.HttpRequest httpRequest;
        io.fabric.sdk.android.Logger logger;
        java.lang.StringBuilder sb;
        java.lang.String string = io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_REQUEST_ID;
        io.fabric.sdk.android.services.network.HttpRequest httpRequest2 = null;
        jSONObjectHandleResponse = null;
        org.json.JSONObject jSONObjectHandleResponse = null;
        try {
            try {
                java.util.Map<java.lang.String, java.lang.String> queryParamsFor = getQueryParamsFor(settingsRequest);
                httpRequest = getHttpRequest(queryParamsFor);
                try {
                    httpRequest = applyHeadersTo(httpRequest, settingsRequest);
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Requesting settings from " + getUrl());
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Settings query params were: " + queryParamsFor);
                    jSONObjectHandleResponse = handleResponse(httpRequest);
                    if (httpRequest != null) {
                        logger = io.fabric.sdk.android.Fabric.getLogger();
                        sb = new java.lang.StringBuilder();
                        sb.append("Settings request ID: ");
                        sb.append(httpRequest.header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_REQUEST_ID));
                        string = sb.toString();
                        logger.d(io.fabric.sdk.android.Fabric.TAG, string);
                    }
                } catch (io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException e) {
                    e = e;
                    io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Settings request failed.", e);
                    if (httpRequest != null) {
                        logger = io.fabric.sdk.android.Fabric.getLogger();
                        sb = new java.lang.StringBuilder();
                    }
                    return jSONObjectHandleResponse;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                httpRequest2 = httpRequest;
                if (httpRequest2 != null) {
                    io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Settings request ID: " + httpRequest2.header(string));
                }
                throw th;
            }
        } catch (io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException e2) {
            e = e2;
            httpRequest = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (httpRequest2 != null) {
                io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Settings request ID: " + httpRequest2.header(string));
            }
            throw th;
        }
        return jSONObjectHandleResponse;
    }

    org.json.JSONObject handleResponse(io.fabric.sdk.android.services.network.HttpRequest httpRequest) {
        int iCode = httpRequest.code();
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Settings result was: " + iCode);
        if (requestWasSuccessful(iCode)) {
            return getJsonObjectFrom(httpRequest.body());
        }
        io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to retrieve settings from " + getUrl());
        return null;
    }

    private org.json.JSONObject getJsonObjectFrom(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (java.lang.Exception e) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Failed to parse settings JSON from " + getUrl(), e);
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Settings response " + str);
            return null;
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> getQueryParamsFor(io.fabric.sdk.android.services.settings.SettingsRequest settingsRequest) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(BUILD_VERSION_PARAM, settingsRequest.buildVersion);
        map.put(DISPLAY_VERSION_PARAM, settingsRequest.displayVersion);
        map.put("source", java.lang.Integer.toString(settingsRequest.source));
        if (settingsRequest.iconHash != null) {
            map.put(ICON_HASH, settingsRequest.iconHash);
        }
        java.lang.String str = settingsRequest.instanceId;
        if (!io.fabric.sdk.android.services.common.CommonUtils.isNullOrEmpty(str)) {
            map.put(INSTANCE_PARAM, str);
        }
        return map;
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyHeadersTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, io.fabric.sdk.android.services.settings.SettingsRequest settingsRequest) {
        applyNonNullHeader(httpRequest, io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_API_KEY, settingsRequest.apiKey);
        applyNonNullHeader(httpRequest, io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_TYPE, "android");
        applyNonNullHeader(httpRequest, io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_VERSION, this.kit.getVersion());
        applyNonNullHeader(httpRequest, "Accept", "application/json");
        applyNonNullHeader(httpRequest, HEADER_DEVICE_MODEL, settingsRequest.deviceModel);
        applyNonNullHeader(httpRequest, HEADER_OS_BUILD_VERSION, settingsRequest.osBuildVersion);
        applyNonNullHeader(httpRequest, HEADER_OS_DISPLAY_VERSION, settingsRequest.osDisplayVersion);
        applyNonNullHeader(httpRequest, HEADER_INSTALLATION_ID, settingsRequest.installationId);
        return httpRequest;
    }

    private void applyNonNullHeader(io.fabric.sdk.android.services.network.HttpRequest httpRequest, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            httpRequest.header(str, str2);
        }
    }
}
