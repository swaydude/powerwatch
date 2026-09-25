package com.crashlytics.android.core;

/* JADX INFO: loaded from: classes.dex */
class NativeCreateReportSpiCall extends io.fabric.sdk.android.services.common.AbstractSpiCall implements com.crashlytics.android.core.CreateReportSpiCall {
    private static final java.lang.String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
    private static final java.lang.String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
    private static final java.lang.String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
    private static final java.lang.String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
    private static final java.lang.String KEYS_FILE_MULTIPART_PARAM = "keys_file";
    private static final java.lang.String LOGS_FILE_MULTIPART_PARAM = "logs_file";
    private static final java.lang.String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
    private static final java.lang.String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
    private static final java.lang.String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
    private static final java.lang.String REPORT_IDENTIFIER_PARAM = "report_id";
    private static final java.lang.String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
    private static final java.lang.String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";

    public NativeCreateReportSpiCall(io.fabric.sdk.android.Kit kit, java.lang.String str, java.lang.String str2, io.fabric.sdk.android.services.network.HttpRequestFactory httpRequestFactory) {
        super(kit, str, str2, httpRequestFactory, io.fabric.sdk.android.services.network.HttpMethod.POST);
    }

    @Override // com.crashlytics.android.core.CreateReportSpiCall
    public boolean invoke(com.crashlytics.android.core.CreateReportRequest createReportRequest) throws java.lang.Throwable {
        io.fabric.sdk.android.services.network.HttpRequest httpRequestApplyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.apiKey), createReportRequest.report);
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Sending report to: " + getUrl());
        int iCode = httpRequestApplyMultipartDataTo.code();
        io.fabric.sdk.android.Fabric.getLogger().d(com.crashlytics.android.core.CrashlyticsCore.TAG, "Result was: " + iCode);
        return io.fabric.sdk.android.services.common.ResponseParser.parse(iCode) == 0;
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyHeadersTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, java.lang.String str) {
        httpRequest.header("User-Agent", io.fabric.sdk.android.services.common.AbstractSpiCall.CRASHLYTICS_USER_AGENT + this.kit.getVersion()).header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_TYPE, "android").header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_CLIENT_VERSION, this.kit.getVersion()).header(io.fabric.sdk.android.services.common.AbstractSpiCall.HEADER_API_KEY, str);
        return httpRequest;
    }

    private io.fabric.sdk.android.services.network.HttpRequest applyMultipartDataTo(io.fabric.sdk.android.services.network.HttpRequest httpRequest, com.crashlytics.android.core.Report report) throws java.lang.Throwable {
        httpRequest.part(REPORT_IDENTIFIER_PARAM, report.getIdentifier());
        for (java.io.File file : report.getFiles()) {
            if (file.getName().equals("minidump")) {
                httpRequest.part(MINIDUMP_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.part(METADATA_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.part(BINARY_IMAGES_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals(io.fabric.sdk.android.services.settings.SettingsJsonConstants.SESSION_KEY)) {
                httpRequest.part(SESSION_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals(io.fabric.sdk.android.services.settings.SettingsJsonConstants.APP_KEY)) {
                httpRequest.part(APP_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("device")) {
                httpRequest.part(DEVICE_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("os")) {
                httpRequest.part(OS_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("user")) {
                httpRequest.part(USER_META_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("logs")) {
                httpRequest.part(LOGS_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            } else if (file.getName().equals("keys")) {
                httpRequest.part(KEYS_FILE_MULTIPART_PARAM, file.getName(), GZIP_FILE_CONTENT_TYPE, file);
            }
        }
        return httpRequest;
    }
}
