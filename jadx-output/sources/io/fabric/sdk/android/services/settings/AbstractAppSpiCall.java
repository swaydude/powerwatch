package io.fabric.sdk.android.services.settings;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractAppSpiCall extends io.fabric.sdk.android.services.common.AbstractSpiCall implements io.fabric.sdk.android.services.settings.AppSpiCall {
    public static final java.lang.String APP_BUILD_VERSION_PARAM = "app[build_version]";
    public static final java.lang.String APP_BUILT_SDK_VERSION_PARAM = "app[built_sdk_version]";
    public static final java.lang.String APP_DISPLAY_VERSION_PARAM = "app[display_version]";
    public static final java.lang.String APP_ICON_DATA_PARAM = "app[icon][data]";
    public static final java.lang.String APP_ICON_HASH_PARAM = "app[icon][hash]";
    public static final java.lang.String APP_ICON_HEIGHT_PARAM = "app[icon][height]";
    public static final java.lang.String APP_ICON_PRERENDERED_PARAM = "app[icon][prerendered]";
    public static final java.lang.String APP_ICON_WIDTH_PARAM = "app[icon][width]";
    public static final java.lang.String APP_IDENTIFIER_PARAM = "app[identifier]";
    public static final java.lang.String APP_INSTANCE_IDENTIFIER_PARAM = "app[instance_identifier]";
    public static final java.lang.String APP_MIN_SDK_VERSION_PARAM = "app[minimum_sdk_version]";
    public static final java.lang.String APP_NAME_PARAM = "app[name]";
    public static final java.lang.String APP_SDK_MODULES_PARAM_BUILD_TYPE = "app[build][libraries][%s][type]";
    public static final java.lang.String APP_SDK_MODULES_PARAM_PREFIX = "app[build][libraries][%s]";
    public static final java.lang.String APP_SDK_MODULES_PARAM_VERSION = "app[build][libraries][%s][version]";
    public static final java.lang.String APP_SOURCE_PARAM = "app[source]";
    static final java.lang.String ICON_CONTENT_TYPE = "application/octet-stream";
    static final java.lang.String ICON_FILE_NAME = "icon.png";

    public AbstractAppSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod httpMethod) {
        super(kit, str, str2, httpRequestFactory, httpMethod);
    }

    @Override // io.fabric.sdk.android.services.settings.AppSpiCall
    public boolean invoke(io.fabric.sdk.android.services.settings.AppRequestData appRequestData) {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestApplyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), appRequestData), appRequestData);
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Sending app info to " + getUrl());
        if (appRequestData.icon != null) {
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "App icon hash is " + appRequestData.icon.hash);
            io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "App icon size is " + appRequestData.icon.width + "x" + appRequestData.icon.height);
        }
        int iCode = httpRequestApplyMultipartDataTo.code();
        java.lang.String str = io.fabric.sdk.android.services.network.HttpRequest.METHOD_POST.equals(httpRequestApplyMultipartDataTo.method()) ? "Create" : "Update";
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, str + " app request ID: " + httpRequestApplyMultipartDataTo.header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_REQUEST_ID));
        io.fabric.sdk.android.Fabric.getLogger().d(io.fabric.sdk.android.Fabric.TAG, "Result was " + iCode);
        return io.fabric.sdk.android.services.common.ResponseParser.parse(iCode) == 0;
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyHeadersTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, io.fabric.sdk.android.services.settings.AppRequestData appRequestData) {
        return httpRequest.header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_API_KEY, appRequestData.apiKey).header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_TYPE, "android").header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyMultipartDataTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, io.fabric.sdk.android.services.settings.AppRequestData appRequestData) {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestPart = httpRequest.part(APP_IDENTIFIER_PARAM, appRequestData.appId).part(APP_NAME_PARAM, appRequestData.name).part(APP_DISPLAY_VERSION_PARAM, appRequestData.displayVersion).part(APP_BUILD_VERSION_PARAM, appRequestData.buildVersion).part(APP_SOURCE_PARAM, java.lang.Integer.valueOf(appRequestData.source)).part(APP_MIN_SDK_VERSION_PARAM, appRequestData.minSdkVersion).part(APP_BUILT_SDK_VERSION_PARAM, appRequestData.builtSdkVersion);
        if (!io.fabric.sdk.android.services.common.CommonUtils.isNullOrEmpty(appRequestData.instanceIdentifier)) {
            httpRequestPart.part(APP_INSTANCE_IDENTIFIER_PARAM, appRequestData.instanceIdentifier);
        }
        if (appRequestData.icon != null) {
            java.io.InputStream inputStreamOpenRawResource = null;
            try {
                try {
                    inputStreamOpenRawResource = this.kit.getContext().getResources().openRawResource(appRequestData.icon.iconResourceId);
                    httpRequestPart.part(APP_ICON_HASH_PARAM, appRequestData.icon.hash).part(APP_ICON_DATA_PARAM, ICON_FILE_NAME, ICON_CONTENT_TYPE, inputStreamOpenRawResource).part(APP_ICON_WIDTH_PARAM, java.lang.Integer.valueOf(appRequestData.icon.width)).part(APP_ICON_HEIGHT_PARAM, java.lang.Integer.valueOf(appRequestData.icon.height));
                } catch (android.content.res.Resources.NotFoundException e) {
                    io.fabric.sdk.android.Fabric.getLogger().e(io.fabric.sdk.android.Fabric.TAG, "Failed to find app icon with resource ID: " + appRequestData.icon.iconResourceId, e);
                }
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(inputStreamOpenRawResource, "Failed to close app icon InputStream.");
            } catch (java.lang.Throwable th) {
                io.fabric.sdk.android.services.common.CommonUtils.closeOrLog(inputStreamOpenRawResource, "Failed to close app icon InputStream.");
                throw th;
            }
        }
        if (appRequestData.sdkKits != null) {
            for (io.fabric.sdk.android.KitInfo kitInfo : appRequestData.sdkKits) {
                httpRequestPart.part(getKitVersionKey(kitInfo), kitInfo.getVersion());
                httpRequestPart.part(getKitBuildTypeKey(kitInfo), kitInfo.getBuildType());
            }
        }
        return httpRequestPart;
    }

    java.lang.String getKitVersionKey(io.fabric.sdk.android.KitInfo kitInfo) {
        return java.lang.String.format(java.util.Locale.US, APP_SDK_MODULES_PARAM_VERSION, kitInfo.getIdentifier());
    }

    java.lang.String getKitBuildTypeKey(io.fabric.sdk.android.KitInfo kitInfo) {
        return java.lang.String.format(java.util.Locale.US, APP_SDK_MODULES_PARAM_BUILD_TYPE, kitInfo.getIdentifier());
    }
}
